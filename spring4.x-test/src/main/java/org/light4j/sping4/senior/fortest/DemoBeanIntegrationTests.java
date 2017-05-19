package org.light4j.sping4.senior.fortest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //①
@ContextConfiguration(classes = {TestConfig.class}) //②
@ActiveProfiles("prod") //③
public class DemoBeanIntegrationTests {
    @Autowired //④
    private TestBean testBean;

    @Test //⑤
    public void prodBeanShouldInject(){
        String expected = "from production profile";
        String actual = testBean.getContent();
        Assert.assertEquals(expected, actual);
    }
}