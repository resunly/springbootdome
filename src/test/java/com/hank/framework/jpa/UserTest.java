package com.hank.framework.jpa;

import org.jboss.logging.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by hank.he on 2017/8/26.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    private static final Logger logger = Logger.getLogger(com.hank.framework.databaseConnection.config.TestDataBaseConfig.class);

/*
    @Autowired
    private UserRepository userRepository;
*/

    @Test
    public void testUserDao() {
       /* UserInfo userInfo = new UserInfo("resunly", "resunly", "123456", "1234", '0');
        userRepository.save(userInfo);

        UserInfo userInfo1 = userRepository.findByUserName("resunly");
        Assert.assertEquals("resunly", userInfo.getNickName());*/
    }

}
