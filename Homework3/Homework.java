package Class5;

import Helper.Misc;
import Web.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Homework {

    /**
     * TC-1:  darksky.net
     * Verify correct temperature value is displayed after changing temperature units
     */
/*      Steps:
        1. launch browser
        2. open darksky.net
        3. click on "˚F, mph"
        4. change the temperature units
        5. Verify correct temperature value is displayed
        6. close window
     */
    @Test
    public void  checkTemp(){
        MyDriver.launchUrlOnNewWindow("https://www.darksky.net/");
        By tempLocator = By.xpath("//div[contains (@ class,'selectric-below')] //div[@class = 'selectric'] //b[@class = 'button']");
        MyDriver.getDriver().findElement(tempLocator).click();




    }



    /**
     * TC-2: facebook.com
     * Verify current date is selected in the dropdown when user lands on the Create new account form
     */
/*
        Steps:
        1. Launch browser
        2. Open facebook.com
        3. click onn create new account button
        4. Verify current date is selected
        5. close windoe

    */



    @Test
    public static void checkNewAccountForm(){
        MyDriver.launchUrlOnNewWindow("https://www.facebook.com/");
        By createNewAccountLocator = By.partialLinkText("ccount");
        MyDriver.getDriver().findElement(createNewAccountLocator).click();

        Misc.pause(3);

        //  String monthValue = "//select[@id= 'month']";
        By monthDdLocator = By.id("month");
        WebElement monthDdElement = MyDriver.getDriver().findElement(monthDdLocator);
        Select monthDd = new Select(monthDdElement);
        monthDd.selectByVisibleText("Jan");


        By dateDdLocator = By.name("birthday_day");
        WebElement dateElement = MyDriver.getDriver().findElement(dateDdLocator);
        Select date = new Select(dateElement);
        date.selectByValue("5");

        By yearDdLocator = By.xpath("//select[starts-with(@title, 'Ye')]");
        WebElement yearElement = MyDriver.getDriver().findElement(yearDdLocator);
        Select year = new Select(yearElement);
        year.selectByIndex(9);






    }




    /**
     * TC-3: https://classroomessentialsonline.com/
     * Verify user lands on Economy Church Chairs page after clicking the option from Church Chairs
     *
     */
/*
        Steps:
        1. Launch browser
        2. Open classroomessentialsonline.com
        3. click on church chairs
        4. click on Economy Church Chairs
        5. Verify user lands on Economy Church Chairs page
        6. close window

 */





    @Test
    public static void  churchChairsPage(){
        MyDriver.launchUrlOnNewWindow("https://classroomessentialsonline.com/");
        String churchChairsValue = "//a[@href='/church-chairs/']";
        By churchChairsLocator = By.xpath(churchChairsValue);
        WebElement churchChairs = MyDriver.getDriver().findElement(churchChairsLocator);
        churchChairs.click();
        //Select churchChairsDd = new Select(churchChairs);

        String economyChairsValue = "economy-church-chairs";
        By economyChairsLocator = By.xpath("//div[@id = 'navPages-']//a[text() = 'Economy Church Chairs']");
        WebElement economyChairs = MyDriver.getDriver().findElement(economyChairsLocator);
        Actions action = new Actions(MyDriver.getDriver());
        action.moveToElement(economyChairs).build().perform();



    }






}
