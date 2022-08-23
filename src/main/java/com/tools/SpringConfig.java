package com.tools;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan({"com.service","model", "com.AOP", "com.mapper"})
@PropertySource({"WEB-INF/jdbcConfig.properties"})
@EnableAspectJAutoProxy
@Import({JdbcConfig.class,MybatisConfig.class})
public class SpringConfig {

}
