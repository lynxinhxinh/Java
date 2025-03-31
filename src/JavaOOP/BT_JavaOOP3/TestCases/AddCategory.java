package JavaOOP.BT_JavaOOP3.TestCases;

import JavaOOP.BT_JavaOOP3.Common.BaseTest;
import JavaOOP.BT_JavaOOP3.Common.Constants;

public class AddCategory extends BaseTest {
    public void addCategory(){
        System.out.println("--- Add Category ---");
        System.out.println("Step 1: Click on Products > Category menu");
        System.out.println("Step 2: CLick on 'Add New category' button");
        System.out.println("Step 3: Input data to all fields");
        System.out.println("Step 4: Click on Save button");
        System.out.println("Step 5: Verify successful category creation");

    }

    public static void main(String[] args) {
        Constants.browser = "Firefox";
        Constants.report= false;
        Constants.headless=false;

        BaseTest baseTest = new BaseTest();
        baseTest.createDriver();
        Login login = new Login();
        login.login();
        AddCategory addCategory = new AddCategory();
        addCategory.addCategory();
        baseTest.closeDriver();
    }
}
