package com.demo;

import com.demo.autoFile.TestContextBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {EnvironnementConfigTest.class})
@SpringBootTest(classes = Demo1Application.class)
@ActiveProfiles("dev")
public class EnvironnementConfigTest {

    @Autowired
    private TestContextBean testContextBean;

    @Test
    public void prodBeanShouldInject(){
        String actual = testContextBean.getContent();
        System.err.println(actual);
    }
}
