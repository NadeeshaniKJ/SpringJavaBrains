package com.kanchi.t37.main;

import com.kanchi.t37.dao.JdbcDaoImpl;
import com.kanchi.t37.model.Circle;

public class Main {

    public static void main(String[] args) {
        Circle circle=new JdbcDaoImpl().getCircle(1);
        System.out.println(circle.getName());
    }
}
