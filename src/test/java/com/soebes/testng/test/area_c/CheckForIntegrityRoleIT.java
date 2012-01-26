package com.soebes.testng.test.area_c;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.soebes.testng.test.IntegrationTestBase;

/**
 * @author Karl Heinz Marbaise
 */
@Test(groups = { "area_c_pruefung" })
public class CheckForIntegrityRoleIT extends IntegrationTestBase {
    private static final Logger LOGGER = Logger.getLogger(CheckForIntegrityRoleIT.class);

    
    public void dialogCheckForInegrityWithRole() throws Exception {
        LOGGER.info("CheckForIntegrityRoleIT::dialogCheckForInegrityWithRole(area_c_pruefung)");
    }


}
