package com.niemczyk.dao.repo;

import com.niemczyk.dao.Deals;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Bartek on 25.05.2017.
 */
@Repository
public class DealDAOImpl implements DealDAO {

    List<Deals> listOfDeals;
    List<Deals> listOfActiveDeals;
    SessionFactory sessionFactory;

    public DealDAOImpl() {
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;

    }

    @Override
    public List<Deals> getAllDeals() {
        Session session = getSessionFactory().openSession();
        listOfDeals = session.createQuery("from Deals ").list();
        session.close();

        return listOfDeals;
    }

    @Override
    public List<Deals> getActiveDeals(String active) {
        Session session = getSessionFactory().openSession();
        listOfActiveDeals = session.createQuery("from Deals where activ =:activity")
                .setParameter("activity", active)
                .list();
        session.close();
        return listOfActiveDeals;
    }

    @Override
    public void addDeal(Deals deal) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(deal);
        tx.commit();
        session.close();
    }

    @Override
    public void updateDeal(String orderNumber, Deals deal) {
        Session session = getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        String query = ("update Deals set productName =:system,  orderRequest=:zapotrzebowanie" +
                ",orderNumber=:numer,dateFrom=:datao,dateTo=:datad,amount=:wplywy,amountType=:wplywyrodzaj" +
                ",period=:skala,percent=:procent,activ=:aktywnosc where productName =:NUMBERID");
        int update = session.createQuery(query)
                .setString("NUMBERID", orderNumber)
                .setString("system", deal.getProductName())
                .setInteger("zapotrzebowanie", deal.getOrderRequest())
                .setString("numer", deal.getOrderNumber())
                .setString("datao", deal.getDateFrom())
                .setString("datad", deal.getDateTo())
                .setBigDecimal("wplywy", deal.getAmount())
                .setString("wplywyrodzaj", deal.getAmountType())
                .setString("skala", deal.getPeriod())
                .setInteger("procent", deal.getPercent())
                .setString("aktywnosc", deal.getActiv())
                .executeUpdate();
        tx.commit();
        session.close();
    }

    @Override
    public void deleteDeal(String orderNumber) {
        Session session = getSessionFactory().openSession();
        Query query = session.createQuery("delete Deals where productName = :numberId");
        query.setParameter("numberId", orderNumber);
        int result = query.executeUpdate();

    }
}
