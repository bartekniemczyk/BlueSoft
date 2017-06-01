package com.niemczyk.service;

import com.niemczyk.dao.Deals;
import com.niemczyk.dao.repo.DealDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Bartek on 25.05.2017.
 */
@Service
public class DealServiceImpl implements DealService {
    private DealDAO dealDAO;

    @Autowired
    public void setDealDAO(DealDAO dealDAO) {
        this.dealDAO = dealDAO;
    }

    @Override
    public List<Deals> getAllDeals() {
        return this.dealDAO.getAllDeals();
    }



    @Override
    public void addDeal(Deals deal) {
        this.dealDAO.addDeal(deal);
    }

    @Override
    public void updateDeal(String orderNum, Deals deal) {
        this.dealDAO.updateDeal(orderNum, deal);
    }

    @Override
    public void deleteDeal(String orderNumber) {
        this.dealDAO.deleteDeal(orderNumber);
    }
}
