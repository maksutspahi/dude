package com.dude.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by can.yegane on 17/11/16.
 */

@Component
public class Database {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public Database(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String selectFromDual() {
        return jdbcTemplate.queryForObject("select 1 from dual", String.class);
    }


}