package com.niemczyk.service;


import com.niemczyk.dao.repo.SystemDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Bartek on 31.05.2017.
 */
@Service
public class SystemServiceImpl implements SystemService {
    private SystemDAO systemDAO;

    @Autowired
    public void setDealDAO(SystemDAO systemDAO) {
        this.systemDAO = systemDAO;
    }

    @Override
    public List<System> getAllSystems() {
        return this.systemDAO.getAllSystems();
    }
}
