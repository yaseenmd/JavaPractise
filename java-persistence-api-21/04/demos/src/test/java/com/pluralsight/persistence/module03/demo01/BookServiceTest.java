package com.pluralsight.persistence.module03.demo01;

import com.pluralsight.persistence.module03.Book;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */
public class BookServiceTest {

  // ======================================
  // =             Attributes             =
  // ======================================

  private static EntityManagerFactory emf;
  private static EntityManager em;
  private static EntityTransaction tx;

  // ======================================
  // =          Lifecycle Methods         =
  // ======================================

  @Before
  public void initEntityManager() {
    emf = Persistence.createEntityManagerFactory("module03-persistence-unit");
    em = emf.createEntityManager();
    tx = em.getTransaction();
  }

  @After
  public void closeEntityManager() {
    if (em != null) em.close();
    if (emf != null) emf.close();
  }

  // ======================================
  // =              Methods               =
  // ======================================

  @Test
  public void shouldManageBook() {

    BookService service = new BookService(em);

    // Creates and persists a Book
    tx.begin();
    Book book = service.createBook(4044L, "H2G2", "Best IT Scifi Book", 12.5f, "1234-5678-5678", 247);
    tx.commit();
    assertNotNull(book);

    // Finds the book by primary key
    book = service.findBook(4044L);
    assertEquals(new Float(12.5f), book.getUnitCost());

    // Raises the price of the book
    tx.begin();
    book = service.raiseUnitCost(4044L, 12.5F);
    tx.commit();
    assertEquals(new Float(25.0f), book.getUnitCost());

    // Deletes the CD
    tx.begin();
    service.removeBook(4044L);
    tx.commit();

    // Finds the book by primary key
    book = service.findBook(4044L);
    assertNull(book);
  }
}