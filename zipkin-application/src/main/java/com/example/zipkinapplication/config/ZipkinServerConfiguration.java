package com.example.zipkinapplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import zipkin.storage.mysql.MySQLStorage;

import javax.sql.DataSource;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 14:53 2018/7/31
 */
@Configuration
public class ZipkinServerConfiguration {

    @Bean
    public MySQLStorage mySQLStorage(DataSource datasource) {
        return MySQLStorage.builder().datasource(datasource).executor(Runnable::run).build();
    }

}
