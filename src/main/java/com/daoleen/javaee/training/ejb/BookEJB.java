package com.daoleen.javaee.training.ejb;

import com.daoleen.javaee.training.domain.Book;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by alex on 25.5.14.
 */

@Stateless
public class BookEJB {

    @PersistenceContext(unitName = "dataSource")
    private EntityManager entityManager;

    public void createBook(Book book) {
        entityManager.persist(book);
    }

    public void updateBook(Book book) {
        entityManager.merge(book);
    }

    public void deleteBook(Book book) {
        entityManager.remove(book);
    }

    public List<Book> read() {
        return entityManager.createQuery("select b from Book b", Book.class)
                .getResultList();
    }

    public Book readByName(String name) {
        TypedQuery<Book> query = entityManager.createQuery("select b from Book b where b.name=:name", Book.class);
        query.setParameter("name", name);
        return query.getSingleResult();
    }
}
