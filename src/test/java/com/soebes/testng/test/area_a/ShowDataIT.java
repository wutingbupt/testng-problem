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
        LOGGER.info("ShowDataIT::beforeClass(area_a_pruefung)");
    }

    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        LOGGER.info("ShowDataIT::beforeMethod()");
        LOGGER.info("ShowDataIT::beforeMethod(area_a_pruefung)");
    }
	
	/**
     * @throws InterruptedException
     */
    public void showRIEData() throws InterruptedException {
        LOGGER.info("ShowDataIT::showRIEData()");
        LOGGER.info("ShowDataIT::showRIEData(area_a_pruefung)");

    }

}
