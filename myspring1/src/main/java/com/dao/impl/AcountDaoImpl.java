package com.dao.impl;

import com.dao.AcountDao;

import java.util.Date;

public class AcountDaoImpl implements AcountDao {

    private String name;
    private String age;
    private String adrres;
    private Date date;

   /* public AcountDaoImpl(String name, String age,String adrres,Date date){
        this.name=name;
        this.age=age;
        this.adrres=adrres;
        this.date=date;
    }*/

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAdrres(String adrres) {
        this.adrres = adrres;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void findAll() {
        System.out.println("调用dao方法");
        System.out.println(name+age+adrres+date);

    }
}
