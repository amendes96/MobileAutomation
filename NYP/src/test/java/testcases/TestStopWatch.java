package testcases;

import ExtentReport.TestLogger;
import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.StopWatch;

public class TestStopWatch extends MobileAPI{

    @Test
    public void testStopWatch() throws InterruptedException{
        TestLogger.log("Testing Stop Watch");
        StopWatch stpwatch = PageFactory.initElements(ad,StopWatch.class);
        stpwatch.stopwatchfun();
    }
    @Test
    public void testreset()throws InterruptedException{
        TestLogger.log("Testing Reset Button");
        StopWatch stpreset = PageFactory.initElements(ad,StopWatch.class);
        stpreset.resetwatchfun();
    }
}
