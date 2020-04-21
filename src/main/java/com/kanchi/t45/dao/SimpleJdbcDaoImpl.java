package com.kanchi.t45.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class SimpleJdbcDaoImpl extends JdbcDaoSupport {

    public int getCircleCount(){
        String sql = "SELECT COUNT(*) FROM CIRCLE";
        return this.getJdbcTemplate().queryForObject(sql,Integer.class);
            }
}
