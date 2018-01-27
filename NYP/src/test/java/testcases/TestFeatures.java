package testcases;

import ExtentReport.TestLogger;
import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.Alarm;

public class TestFeatures extends MobileAPI{

    @Test
    public void testAlarm() throws InterruptedException {
        TestLogger.log("App is launched");
        System.out.println("ALARM is selected");
        Alarm alm = PageFactory.initElements(ad,Alarm.class);
        alm.alarmONfun();
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
    }
}
