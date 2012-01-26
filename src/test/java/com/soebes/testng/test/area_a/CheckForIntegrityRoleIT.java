package com.soebes.testng.test.area_a;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.soebes.testng.test.IntegrationTestBaseBE;

/**
 * @author Karl Heinz Marbaise
 */
@Test(groups = { "area_a_pruefung" })
public class CheckForIntegrityRoleIT extends IntegrationTestBaseBE {
    private static final Logger LOGGER = Logger.getLogger(CheckForIntegrityRoleIT.class);

    public void dialogCheckForInegrityWithRole() throws Exception {
        LOGGER.info("CheckForIntegrityRoleIT::dialogCheckForInegrityWithRole(area_a_pruefung)");
    }
}
