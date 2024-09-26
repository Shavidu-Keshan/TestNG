package testNG.dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
    @Test(dataProvider = "getData", dataProviderClass = CustomDataProvider.class)
    public void loginTest(String name, String pass){
        System.out.println(name +  " " + pass);
    }
//    @DataProvider
//    public Object[][] getData(){
//        Object[][] data = {
//                {"abc@gmail.com","abc123"},
//                {"def@gmail.com","abc123"},{"xyz@gmail.com","xyz123"}
//        };
//        return data;
//    }
}
