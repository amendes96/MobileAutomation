package pages;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StopWatch extends MobileAPI {

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/wj[4]/android.widget.TextView")
    WebElement stopwatch;

    @FindBy(id = "com.google.android.deskclock:id/stopwatch_circle")
    WebElement startStopWatch;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Reset\"]")
    WebElement reset;

    public void slctStopWatch(){ stopwatch.click();}
    public void slctStartWatch(){ startStopWatch.click();}
    public void slctreset(){ reset.click();}

    public void stopwatchfun() throws InterruptedException{
        slctStopWatch();
        slctStartWatch();
        Thread.sleep(5000);
        slctStartWatch();
    }
    public void resetwatchfun()throws InterruptedException{
        slctStopWatch();
        slctStartWatch();
        Thread.sleep(3000);
        slctStartWatch();
        slctreset();
    }
}
