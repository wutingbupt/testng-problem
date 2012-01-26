package com.soebes.testng.test2.area_b;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.soebes.testng.test.IntegrationTestBase;

/**
 * @author Karl Heinz Marbaise
 *
 */
@Test(groups = "area_b_pruefung_filter")
public class CheckFilterForRoleIT extends IntegrationTestBase {
    private static final Logger LOGGER = Logger.getLogger(CheckFilterForRoleIT.class);

    @BeforeClass
    public void beforeClass() throws InterruptedException {
        LOGGER.info("CheckFilterForRoleIT::beforeClass(area_b_pruefung_filter)");
    }

    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        LOGGER.info("CheckFilterForRoleIT::beforeMethod(area_b_pruefung_filter)");
    }

    /**
     * @throws InterruptedException
     */
    public void checkContentsList() throws InterruptedException {
        LOGGER.info("CheckFilterForRoleIT::checkContentsList(area_b_pruefung_filter)");

    }

    @Test(dependsOnMethods = { "checkContentsList" })
    public void checkDisplayAfterSearch() throws InterruptedException {
    	LOGGER.info("CheckFilterForRoleIT::checkDisplayAfterSearch(area_b_pruefung_filter)");
    }

}
