public class Homework_2 {

    /**
     * Testcase-1:
     *
     *
     * Verify "Keep me signed in" is NOT selected for messenger login page
     *
     * Click "Log in" button
     *
     * Verify "Incorrect email or phone number" is displayed
     *
     * Verify "Continue" button is enabled
     *
     *
     */


    /*
        Steps:
        1. Launch browser
        2. Open facebook.com
        3. Click Messenger link
        4. Verify user lands on messenger.com
        5. put username and password
        6. press login button
        7. verify error message is displayed
        8 check continue button is enabled
        9. close the window

     */
    @Test
    public void  verifyLogInMassageInMessenger(){

        MyDriver.launchUrlOnNewWindow("https://www.facebook.com/");

        String messengerText = "Messenger";
        By messengerLocator = By.linkText(messengerText);
        MyDriver.getDriver().findElement(messengerLocator).click();

        //messengerLink.click();

        Misc.pause(5);

        String keepMeSignedBox = "uiInputLabelInput";
        By keepMeSignedBoxLocator = By.className(keepMeSignedBox);
        WebElement keepMeSignedElement = MyDriver.getDriver().findElement(keepMeSignedBoxLocator);
        boolean keepMeSignedBoxSelected = keepMeSignedElement.isSelected();
        Assert.assertFalse(keepMeSignedBoxSelected, "'Keep me signed in' is checked");

        Misc.pause(5);

        String loginEmailIdValue = "email";
        By loginEmailLocator = By.id(loginEmailIdValue);
        WebElement loginEmailBox = MyDriver.getDriver().findElement(loginEmailLocator);
        loginEmailBox.sendKeys("abc@test.com");

        Misc.pause(5);

        String loginPassNameValue = "pass";
        By loginPassLocator = By.name(loginPassNameValue);
        WebElement loginPassBox = MyDriver.getDriver().findElement(loginPassLocator);
        loginPassBox.sendKeys("0123456789");


        Misc.pause(5);


        String loginButtonNameValue = "login";
        By loginLoginBtnLocator = By.name(loginButtonNameValue);
        WebElement loginButton = MyDriver.getDriver().findElement(loginLoginBtnLocator);
        loginButton.click();

        String incorrectEmailOrPhoneNumber = "Incorrect email or phone number";
        By errorMessageLocator =By.linkText(incorrectEmailOrPhoneNumber);
        WebElement erroMessageText = MyDriver.getDriver().findElement(errorMessageLocator);
        Assert.assertEquals(erroMessageText.getText(), incorrectEmailOrPhoneNumber);

        Misc.pause(5);

        String continueButton = "loginbutton";
        By continueButtonLocator = By.id(continueButton);
        WebElement continueElement = MyDriver.getDriver().findElement(continueButtonLocator);
        boolean continueButtonIsEnabled = continueElement.isEnabled();
        Assert.assertTrue(continueButtonIsEnabled, "Continue Button Is Not Enabled");


        MyDriver.quitWindows();

    }






    /**
     * Testcase-2:
     * On Create new account page:
     *
     * Verify the "Sign Up" button is enabled when user lands on the form
     *
     * Enter the below details in Sign Up form EXCEPT DOB
     * First name
     * Last name
     * email
     * re-enter email
     * new password
     * click Sign Up
     *
     * Verify "Please choose a gender. You can change who can see this later." is displayed
     *
     */

    @Test
    public void verifySignUp(){

        MyDriver.launchUrlOnNewWindow("https://www.facebook.com/");

        String creatNewAccountButtonValue = "open-registration-form-button";
        By newAccountButtonLocator = By.xpath("//*[@data-testid = 'open-registration-form-button']");
        WebElement signupButton = MyDriver.getDriver().findElement(newAccountButtonLocator);

        signupButton.click();

        String firstnameValue = "firstname";
        By firstnameLocatore = By.name(firstnameValue);
        WebElement firstname = MyDriver.getDriver().findElement(firstnameLocatore);
        firstname.sendKeys("Mohammed");

        String lastnameValue = "lastname";
        By lastnameLocatore = By.xpath(lastnameValue);
        WebElement lastName = MyDriver.getDriver().findElement(lastnameLocatore);
        lastName.sendKeys("Rahman");


    }









}
