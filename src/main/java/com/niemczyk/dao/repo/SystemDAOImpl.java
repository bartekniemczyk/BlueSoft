package com.niemczyk.dao.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Bartek on 31.05.2017.
 */
@Repository
public class SystemDAOImpl implements SystemDAO {
    SessionFactory sessionFactory;
    List<System> listOfSystems;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
@Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<System> getAllSystems() {

        Session session = getSessionFactory().openSession();
        listOfSystems = session.createQuery("from System ").list();
        session.close();

        return listOfSystems;
    }
}
