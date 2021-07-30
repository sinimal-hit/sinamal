package com.doer;

import com.doer.pojo.Dog;
import com.doer.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.yaml.snakeyaml.Yaml;

import java.util.Properties;

@SpringBootTest
class Springboot02ConfigApplicationTests {

    @Autowired
    private Person person;
    @Test
    void contextLoads() {



    }

}
