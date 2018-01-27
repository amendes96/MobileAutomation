package testcases;

import ExtentReport.TestLogger;
import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.Clock;

public class TestClock extends MobileAPI{

    @Test
    public void testingClock() throws InterruptedException{
        TestLogger.log("App is launched");
        System.out.println("CLOCK ");
        Clock clck = PageFactory.initElements(ad,Clock.class);
        clck.worldSearch();
        System.out.println("----------------------");
    }
}
