package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Calculator extends MobileAPI{

    @FindBy(id = "com.asus.calculator:id/digit0")
    WebElement zero;

    @FindBy(id = "com.asus.calculator:id/digit1")
    WebElement one;

    @FindBy(id = "com.asus.calculator:id/digit2")
    WebElement two;

    @FindBy(id = "com.asus.calculator:id/digit3")
    WebElement three;

    @FindBy(id = "com.asus.calculator:id/digit4")
    WebElement four;

    @FindBy(id = "com.asus.calculator:id/digit5")
    WebElement five;

    @FindBy(id = "com.asus.calculator:id/digit6")
    WebElement six;

    @FindBy(id = "com.asus.calculator:id/digit7")
    WebElement seven;

    @FindBy(id = "com.asus.calculator:id/digit8")
    WebElement eight;

    @FindBy(id = "com.asus.calculator:id/digit9")
    WebElement nine;

    @FindBy(id = "com.asus.calculator:id/clear")
    WebElement clear;

    @FindBy(id = "com.asus.calculator:id/plus")
    WebElement plus;

    @FindBy(id = "com.asus.calculator:id/minus")
    WebElement minus;

    @FindBy(id = "com.asus.calculator:id/mul")
    WebElement multiplication;

    @FindBy(id = "com.asus.calculator:id/div")
    WebElement division;

    @FindBy(id = "com.asus.calculator:id/equal")
    WebElement equal;

    public void addition()throws InterruptedException{
        one.click();
        plus.click();
        one.click();
        equal.click();
    }
    public void subtraction()throws InterruptedException{
        one.click();
        minus.click();
        one.click();
        equal.click();
    }
}
