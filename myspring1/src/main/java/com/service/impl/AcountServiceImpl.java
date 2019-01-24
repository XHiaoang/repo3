package com.service.impl;

import com.dao.impl.AcountDaoImpl;
import com.service.AcountService;

public class AcountServiceImpl implements AcountService{

    private AcountDaoImpl dao;
    public void findAll() {
        dao.findAll();
    }
}
