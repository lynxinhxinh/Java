package JavaOOP.BT_JavaOOP3.Common;

public class BaseTest {
    public void createDriver(){
        System.out.println("Browser: "+Constants.browser);
        System.out.println("Report: "+Constants.report);
        System.out.println("Headless: "+Constants.headless);
    }
    public void closeDriver(){
        System.out.println("Closed browser:"+Constants.browser);
    }

    public void setUrl(String url){
        System.out.println("Open Login page:"+url);
    }
}
