package com.niemczyk.dao.repo;

import com.niemczyk.dao.Deals;

import java.util.List;

/**
 * Created by Bartek on 25.05.2017.
 */
public interface DealDAO {
List<Deals> getAllDeals();
List<Deals> getActiveDeals(String active);
void addDeal(Deals deal);
void updateDeal(String orderNum, Deals deal);
void deleteDeal(String orderNumber);
}

