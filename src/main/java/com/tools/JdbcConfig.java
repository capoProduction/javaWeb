package com.tools;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JdbcConfig {
    @Value("${url}")
    private String url;
    @Value("${driver}")
    private String driver;
    @Value("${name}")
    private String name;
    @Value("${pwd}")
    private String pwd;

    @Bean
    private DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUsername(name);
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driver);
        dataSource.setPassword(pwd);
        return dataSource;
    }
}
