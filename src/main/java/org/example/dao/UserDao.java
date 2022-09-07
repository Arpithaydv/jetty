package org.example.dao;

import org.example.datastore.HibernateUtil;
import org.example.entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Collections;
import java.util.List;

public class UserDao {
private static final Session session = HibernateUtil.getSessionFactory().openSession();
    public void saveUser(User user) {
        Transaction transaction;
        try {
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<User> getUsers() {
        try {
            return session.createQuery("from User", User.class).list();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return Collections.emptyList();
    }

}
