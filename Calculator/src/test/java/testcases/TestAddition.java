package testcases;

import base.Calculator;
import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestAddition extends MobileAPI {

    @Test
    public void testAddition() throws InterruptedException {
        Calculator caladd = PageFactory.initElements(ad,Calculator.class);
        caladd.addition();
    }
    @Test
    public void testSubtraction()throws InterruptedException{
        Calculator calsub = PageFactory.initElements(ad,Calculator.class);
        calsub.subtraction();
    }
}
