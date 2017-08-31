package com.hank.framework.databaseConnection.config;

import org.jboss.logging.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import javax.crypto.*;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

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
    private Environment env;

    //@Autowired
    //private DataBaseConfig config;
    @Test
    public void testGetDataBaseConfig() {
        //logger.info("service Environment:" + env.getProperty("spring.profiles.active"));
        ////logger.info("self Config Driver:" + config.getDriver());
        //logger.info("default config hank.testConfig:" + config.getHankConfig());
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

    /*public static byte[] encrypt(byte[] rawKeyData, byte[] iv, String str)
            throws InvalidKeyException, NoSuchAlgorithmException,
            IllegalBlockSizeException, BadPaddingException,
            NoSuchPaddingException, InvalidKeySpecException {
        IvParameterSpec zeroIv = new IvParameterSpec(iv);
        DESKeySpec dks = new DESKeySpec(rawKeyData);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        SecretKey key = keyFactory.generateSecret(dks);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        try {
            cipher.init(Cipher.ENCRYPT_MODE, key, zeroIv);
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        }
        byte data[] = str.getBytes();
        byte[] encryptedData = cipher.doFinal(data);
        return encryptedData;
    }*/

}
