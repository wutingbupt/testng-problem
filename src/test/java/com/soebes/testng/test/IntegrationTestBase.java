package com.soebes.testng.test;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author Karl Heinz Marbaise
 */
@Test
public class IntegrationTestBase {

    private static final Logger LOGGER = Logger.getLogger(IntegrationTestBase.class);

    @BeforeGroups(groups = { "area_a_pruefung", "area_b_pruefung", "area_c_pruefung", "pruefung", "area_b_pruefung_filter", "area_a_modifiziere_daten" })
    public void beforeGroups() {
        LOGGER.info("IntegrationTestBase::beforeGroups()");
    }

    @BeforeSuite
    public void beforeSuite() throws Exception {
        LOGGER.info("IntegrationTestBase::beforeSuite()");
    }

    @BeforeTest
    public void beforeTest() throws Exception {
        LOGGER.info("IntegrationTestBase::beforeTest()");
    }
    
    @AfterSuite
    public void afterSuite() {
        LOGGER.info("IntegrationTestBase::AfterSuite()");
    }

    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        LOGGER.info("IntegrationTestBase::beforeMethod()");
    }

}
