package com.niemczyk.service;

import com.niemczyk.dao.Deals;

import java.util.List;

/**
 * Created by Bartek on 25.05.2017.
 */
public interface DealService {
    List<Deals> getAllDeals();

    void addDeal(Deals deal);

    void updateDeal(String orderNum, Deals deals);

    void deleteDeal(String orderNumber);
}
