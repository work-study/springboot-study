package com.netease.kaola.springboot;

import com.netease.kaola.springboot.test02.config.bean.DataSource;
import com.netease.kaola.springboot.test02.config.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootApplicationTest {

    @Autowired
    private Person person;

    @Autowired
    private DataSource dataSource;
    @Test
    public void contextLoad() {
       for (int i=0;i<10;i++) {
           System.out.println(person);
       }
    }
    @Test
    public void dataSourceLoad() {
        System.out.println(dataSource);
    }


}
