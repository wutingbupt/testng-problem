package com.soebes.testng.test;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

/**
 * @author Karl Heinz Marbaise
 */
@Test(groups = { "pruefung" })
public class CheckForIntegrityWithoutRoleIT extends IntegrationTestBase {
    private static final Logger LOGGER = Logger.getLogger(CheckForIntegrityWithoutRoleIT.class);

    public void dialogCheckForInegrityWithoutRole() throws Exception {
        LOGGER.info("CheckForIntegrityWithoutRoleIT::dialogCheckForInegrityWithoutRole(pruefung)");
    }

}
