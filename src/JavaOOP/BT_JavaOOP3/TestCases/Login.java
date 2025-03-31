package JavaOOP.BT_JavaOOP3.TestCases;

import JavaOOP.BT_JavaOOP3.Common.BaseTest;
import JavaOOP.BT_JavaOOP3.Common.Constants;


public class Login extends BaseTest {
    public void login(){
        System.out.println("--- Login ---");
        System.out.println("Step 1: Open Login page: https://cms.anhtester.com/login");
        System.out.println("Step 2: Enter username and password");
        System.out.println("Step 3: Click on Login button");
        System.out.println("Step 4: Verify successful login");
    }
    public static void main(String[] args) {
        Constants.browser = "Chrome";
        Constants.report= true;
        Constants.headless=false;

        BaseTest baseTest = new BaseTest();
        baseTest.createDriver();
        Login login = new Login();
        login.login();
        baseTest.closeDriver();
    }
}
