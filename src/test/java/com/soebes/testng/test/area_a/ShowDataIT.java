package com.soebes.testng.test.area_a;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.soebes.testng.test.IntegrationTestBaseBE;

/**
 * @author Karl Heinz Marbaise
 *
 */
@Test(groups = { "area_a_pruefung" })
public class ShowDataIT extends IntegrationTestBaseBE {
    private static final Logger LOGGER = Logger.getLogger(ShowDataIT.class);

    @BeforeClass
    public void beforeClass() {
        LOGGER.info("ShowDataIT::beforeClass()");
    }

    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        LOGGER.info("ShowDataIT::beforeMethod()");
    }
	
	/**
     * @throws InterruptedException
     */
    public void showRIEData() throws InterruptedException {
        LOGGER.info("ShowDataIT::showRIEData()");
    }

}
