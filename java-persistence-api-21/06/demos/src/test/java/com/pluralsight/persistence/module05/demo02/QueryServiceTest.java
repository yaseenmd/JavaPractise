package com.pluralsight.persistence.module05.demo02;

import com.pluralsight.persistence.module05.Book;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */
public class QueryServiceTest {

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
    emf = Persistence.createEntityManagerFactory("module05-persistence-unit");
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
  public void queryBooks() {
    Query query = em.createQuery("SELECT b FROM Book b WHERE b.unitCost > 29 AND b.nbOfPage < 700");
    List books = query.getResultList();
    assertEquals(3,books.size());
  }

  @Test
  public void queryBooksTyped() {
    TypedQuery<Book> query = em.createQuery("SELECT b FROM Book b WHERE b.unitCost > 29 AND b.nbOfPage < 700", Book.class);
    List<Book> books = query.getResultList();
    assertEquals(3,books.size());
  }

  @Test
  public void queryStreamBooksTyped() {
    TypedQuery<Book> query = em.createQuery("SELECT b FROM Book b WHERE b.unitCost > 29 AND b.nbOfPage < 700", Book.class);
    Stream<Book> books = query.getResultList().stream();
    assertEquals(3,books.count());
  }

  @Test
  public void queryStreamBooks() {
    TypedQuery<Book> query = em.createQuery("SELECT b FROM Book b WHERE b.unitCost > 29 AND b.nbOfPage < 700", Book.class);
    Stream<Book> books = query.getResultStream();
    assertEquals(3,books.count());
  }

  @Test
  public void queryBooksPosition() {
    TypedQuery<Book> query = em.createQuery("SELECT b FROM Book b WHERE b.unitCost > ?1 AND b.nbOfPage < ?2", Book.class);
    query.setParameter(1, 25F);
    query.setParameter(2, 700);
    List<Book> books = query.getResultList();
    assertEquals(3,books.size());
  }

  @Test
  public void queryBooksName() {
    TypedQuery<Book> query = em.createQuery("SELECT b FROM Book b WHERE b.unitCost > :cost AND b.nbOfPage < :pages", Book.class);
    query.setParameter("cost", 25F);
    query.setParameter("pages", 700);
    List<Book> books = query.getResultList();
    assertEquals(3,books.size());
  }

  @Test
  public void queryFull() {

    TypedQuery<Book> query = em.createQuery("SELECT b FROM Book b WHERE b.unitCost > :cost AND b.nbOfPage < :pages OR b.publicationDate < :pubDate", Book.class);
    query.setParameter("cost", 25F);
    query.setParameter("pages", 700);
    query.setParameter("pubDate", LocalDate.now());
    List<Book> books = query.getResultList();
    assertEquals(6,books.size());
  }

  @Test
  public void queryDynamic() {
    boolean hasPages = true;
    boolean hasDate = true;

    String statement = "SELECT b FROM Book b WHERE b.unitCost > :cost ";
    if (hasPages)
      statement += "AND b.nbOfPage < :pages ";
    if (hasDate)
      statement += "OR b.publicationDate < :pubDate";

    TypedQuery<Book> query = em.createQuery(statement, Book.class);
    query.setParameter("cost", 25F);
    query.setParameter("pages", 700);
    query.setParameter("pubDate", LocalDate.now());
    List<Book> books = query.getResultList();
    assertEquals(6,books.size());
  }

  @Test
  public void queryBooksDate() {
    TypedQuery<Book> query = em.createQuery("SELECT b FROM Book b WHERE b.publicationDate < :pubDate", Book.class);
    query.setParameter("pubDate", LocalDate.now());
    List<Book> books = query.getResultList();
    assertEquals(6,books.size());
  }

  @Test
  public void paginateBooks() {
    TypedQuery<Book> query = em.createQuery("SELECT b FROM Book b WHERE b.unitCost > :cost AND b.nbOfPage < :pages", Book.class);
    query.setParameter("cost", 25F);
    query.setParameter("pages", 700);
    query.setMaxResults(2);
    List<Book> books = query.getResultList();
    assertEquals(2,books.size());
  }
}