package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Alarm {

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/wj[1]/android.widget.TextView")
    WebElement alarm;

    @FindBy(xpath = "")
    WebElement addAlarm;

    @FindBy(xpath = "//android.view.View[@content-desc=\"8:30 AM Alarm\"]/android.widget.Switch")
    WebElement turnONAlarm;

    @FindBy(xpath = "(//android.widget.ImageButton[@content-desc=\"Expand alarm\"])[1]")
    WebElement dropDownbttn;

    @FindBy(xpath = "(//android.widget.ImageButton[@content-desc=\"Expand alarm\"])[1]")
    WebElement vibrate;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Collapse alarm\"]")
    WebElement collapse;

    public void slctAlarm() throws InterruptedException {
        alarm.click();
        //Assert.assertTrue(alarm.getText().contains("ALARM"));
        Thread.sleep(2000);
    }

    public void slctOnAlarm(){ turnONAlarm.click(); }

    public void slctdropDown(){ dropDownbttn.click(); }

    public void alarmONfun() throws InterruptedException {
        slctAlarm();
        slctOnAlarm();
    }


}
