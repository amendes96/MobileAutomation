package testcases;

import ExtentReport.TestLogger;
import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.Timer;

public class TestTimer extends MobileAPI{

    @Test
    public void testingTimer()throws InterruptedException{
        TestLogger.log("Timer is Selected");
        Timer time = PageFactory.initElements(ad,Timer.class);
        time.inputNumbers();
    }
    @Test
    public void tesingInput()throws InterruptedException{
        TestLogger.log("App is launched");
        Timer dlt = PageFactory.initElements(ad,Timer.class);
        dlt.deletingNumbers();
    }
}
