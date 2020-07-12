package com.pluralsight.persistence.module05;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */
@Entity
@NamedQueries({
        @NamedQuery(name = Author.FIND_ALL, query = "select a from Author a"),
})
public class Author extends Artist implements Serializable {

  // ======================================
  // =             Attributes             =
  // ======================================

  @Column(name = "preferred_Language")
  @Enumerated
  private Language preferredLanguage;

  // ======================================
  // =              Constant              =
  // ======================================

  public static final String FIND_ALL = "Author.findAll";

  // ======================================
  // =          Getters & Setters         =
  // ======================================

  public Language getPreferredLanguage() {
    return preferredLanguage;
  }

  public void setPreferredLanguage(Language preferredLanguage) {
    this.preferredLanguage = preferredLanguage;
  }

  // ======================================
  // =    hashcode, equals & toString     =
  // ======================================

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;

    Author author = (Author) o;

    if (preferredLanguage != author.preferredLanguage) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (preferredLanguage != null ? preferredLanguage.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder(firstName);
    sb.append(' ');
    sb.append(lastName);
    return sb.toString();
  }
}