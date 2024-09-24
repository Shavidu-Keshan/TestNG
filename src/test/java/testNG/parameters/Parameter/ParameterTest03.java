package testNG.parameters.Parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest03 {
    @Test
    @Parameters("browser")
    public void browserExrcution(String browser){
        System.out.println("TestNG XML file passed browser value is : "+ browser);
        if (browser.equalsIgnoreCase("chrome")){
            System.out.println("Browser should open with  : chrome");

        }else if(browser.equalsIgnoreCase("edge")){
            System.out.println("browser should open with : edge");
        }else{
            System.out.println("Browser should open with firefox");
        }
    }
}
