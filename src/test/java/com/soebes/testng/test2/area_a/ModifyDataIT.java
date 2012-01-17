package com.soebes.testng.test2.area_a;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.soebes.testng.test.IntegrationTestBaseBE;

/**
 * @author Karl Heinz Marbaise
 */
@Test(groups = { "area_a_modifiziere_daten" })
public class ModifyDataIT extends IntegrationTestBaseBE {
    private static final Logger LOGGER = Logger.getLogger(ModifyDataIT.class);

    @BeforeClass
    public void beforeClass() {
        LOGGER.info("ModifyDataIT::beforeClass()");
        LOGGER.info("ModifyDataIT::beforeClass(area_a_modifiziere_daten)");
    }

    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        LOGGER.info("ModifyDataIT::beforeMethod()");
        LOGGER.info("ModifyDataIT::beforeMethod(area_a_modifiziere_daten)");
    }
	
	/**
     * @throws InterruptedException
     */
    public void changeRIEData() throws InterruptedException {
        LOGGER.info("ModifyDataIT::changeRIEData()");
        LOGGER.info("ModifyDataIT::changeRIEData(area_a_modifiziere_daten)");
    }

}
