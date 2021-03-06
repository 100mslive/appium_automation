package Flutter.pageobject;

import base.AppDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class LandingPage extends PagesCommon{

    @iOSXCUITFindBy(accessibility = "Enter Room URL")
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText")
    public WebElement meetingUrlField;

    @iOSXCUITFindBy(accessibility = "The App")
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText/android.widget.Button")
    public WebElement crossBtn;

    @iOSXCUITFindBy(accessibility = "Join Meeting")
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Join Meeting']")
    public WebElement joinMeetingBtn;

    public void clear_meeting_url(){
        String platform = (String)((RemoteWebDriver) AppDriver.getDriver())
                    .getCapabilities()
                    .getCapability("platformName");

        if(platform.equalsIgnoreCase("android_flutter")){
            meetingUrlField.clear();
        }else
        if(platform.equalsIgnoreCase("ios_flutter")){
            meetingUrlField.clear();
            meetingUrlField.clear();
        }
    }

    public void put_meeting_url(String txt){
        meetingUrlField.sendKeys(txt);
    }

    public void click_crossBtn() throws InterruptedException {
        crossBtn.click();
        Thread.sleep(3000);
    }

    public void click_joinMeetingBtn() throws InterruptedException {
        joinMeetingBtn.click();
        Thread.sleep(3000);
    }


//    public void verifySavedText(String input) {
//        String platform = (String)((RemoteWebDriver) AppDriver.getDriver())
//                .getCapabilities()
//                .getCapability("platformName");
//
//        if(platform.equalsIgnoreCase("android")){
//            Assert.assertTrue(AppDriver.getDriver().findElement(By.xpath("//android.widget.TextView[@content-desc='"+input+"']")).isDisplayed());
//        }else
//        if(platform.equalsIgnoreCase("ios")){
//            Assert.assertEquals(echoSavedText.getAttribute("value"), input);
//        }
//    }

}
