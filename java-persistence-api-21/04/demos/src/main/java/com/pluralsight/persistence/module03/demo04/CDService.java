package com.pluralsight.persistence.module03.demo04;

import com.pluralsight.persistence.module03.CD;

import javax.persistence.EntityManager;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */
public class CDService {

  // ======================================
  // =             Attributes             =
  // ======================================

  private EntityManager em;

  // ======================================
  // =            Constructors            =
  // ======================================

  public CDService(EntityManager em) {
    this.em = em;
  }

  // ======================================
  // =           Public Methods           =
  // ======================================

  public CD createCD(CD book) {
    em.persist(book);
    return book;
  }

  public void removeCD(CD book) {
    em.remove(em.merge(book));
  }

  public CD findCD(Long id) {
    return em.find(CD.class, id);
  }
}