package pages;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Timer extends MobileAPI{

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/wj[3]/android.widget.TextView\n")
    WebElement timer;

    @FindBy(id = "com.google.android.deskclock:id/timer_setup_delete")
    WebElement backspace;

    @FindBy(id = "com.google.android.deskclock:id/timer_setup_digit_1")
    WebElement one;
    @FindBy(id = "com.google.android.deskclock:id/timer_setup_digit_2")
    WebElement two;
    @FindBy(id = "com.google.android.deskclock:id/timer_setup_digit_3")
    WebElement three;
    @FindBy(id = "com.google.android.deskclock:id/timer_setup_digit_4")
    WebElement four;
    @FindBy(id = "com.google.android.deskclock:id/timer_setup_digit_5")
    WebElement five;
    @FindBy(id = "com.google.android.deskclock:id/timer_setup_digit_6")
    WebElement six;
    @FindBy(id = "com.google.android.deskclock:id/timer_setup_digit_7")
    WebElement seven;
    @FindBy(id = "com.google.android.deskclock:id/timer_setup_digit_8")
    WebElement eight;
    @FindBy(id = "com.google.android.deskclock:id/timer_setup_digit_9")
    WebElement nine;
    @FindBy(id = "com.google.android.deskclock:id/timer_setup_digit_0")
    WebElement zero;

    public void slctTimer(){
        timer.click();
        //Assert.assertTrue(timer.getText().contains("TIMER"));
    }

    public void slctBackSpc(){
        backspace.click();
    }

    public void inputone(){ one.click();}
    public void inputtwo(){ two.click();}
    public void inputthree(){ three.click();}
    public void inputfour(){ four.click();}
    public void inputfive(){ five.click();}
    public void inputsix(){ six.click();}
    public void inputseven(){ seven.click();}
    public void inputeight(){eight.click();}
    public void inputnine(){ nine.click();}
    public void inputzero(){ zero.click();}

    public void inputNumbers()throws InterruptedException{
        slctTimer();
        Thread.sleep(2000);
        inputone();
        inputtwo();
        inputthree();
        inputfour();
        inputfive();
        inputsix();
    }
    public void deletingNumbers()throws InterruptedException{
        slctTimer();
        Thread.sleep(1000);
        inputseven();
        inputeight();
        inputnine();
        Thread.sleep(1000);
        slctBackSpc();
        slctBackSpc();
        slctBackSpc();
    }
}
