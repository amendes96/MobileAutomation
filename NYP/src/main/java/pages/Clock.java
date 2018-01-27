package pages;

import base.MobileAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Clock extends MobileAPI{

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/wj[2]/android.widget.TextView")
    WebElement clock;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.support.v7.widget.RecyclerView")
    WebElement worldClock;

    @FindBy(id = "com.google.android.deskclock:id/search_src_text")
    WebElement search;

    public void selectclock(){
        clock.click();
        //Assert.assertTrue(clock.getText().contains("CLOCK"));
    }
    public void worldclck(){
        worldClock.click();
    }
    public void searching(){
        search.sendKeys("London", Keys.ENTER);
    }
    public void worldSearch() throws InterruptedException {
        worldclck();
        Thread.sleep(2000);
        searching();
    }
}
