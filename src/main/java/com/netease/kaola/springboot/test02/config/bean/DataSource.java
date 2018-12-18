package com.netease.kaola.springboot.test02.config.bean;

import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.Email;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
@ToString
@PropertySource(value = {"classpath:jdbc.properties"})
public class DataSource {
    @Value("${jdbc.name}")
    private String name;
    @Value("${jdbc.password}")
    private String password;
}
