package com.hank.framework.databaseConnection.config;

import org.jboss.logging.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by hank.he on 2017/8/2.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDataBaseConfig {
    private static final Logger logger = Logger.getLogger(TestDataBaseConfig.class);

    /*@Autowired
    private Environment env;

    @Test
    public void testConfigDefault() {
        logger.info("Environment get default properties:" + env.getProperty("hank.testConfig"));
        logger.info("Environment get self properties:" + env.getProperty("jdbc.driver"));
    }
*/
    @Autowired
    private DataBaseConfig config;
    @Test
    public void testGetDataBaseConfig() {
        logger.info("self Config Driver:" + config.getDriver());
        logger.info("default config hank.testConfig:" + config.getHankConfig());
    }
    /*@Autowired
    private ConfigDefault configDefault;
    @Test
    public void testConfigDefault() {
        logger.info("defualt config--hank.testConfig:" + configDefault.getHankConfig());
        logger.info("self config--org.hank.testconfig:" + configDefault.getSelfConfig());
    }*/

    //@Autowired
    //private ConfigData configdData;

   /* @Test
    public void testConfigdData(){
        logger.info("ConfigdData get self properties:" + configdData.getUsername());
        logger.info("ConfigdData get self properties:" + configdData.getUsername());

    }*/
}
