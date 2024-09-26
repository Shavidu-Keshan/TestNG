package simpleCalculatorTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperstor;

@Test(dataProvider = "setOFData")
public class ArithmeticOperatorDataProviderTest {
    public void testSum(int input1, int input2, int expectedoutput){
        Assert.assertEquals(ArithmeticOperstor.calsum(input1,input2),expectedoutput,"Faild to calSum");
    }


@DataProvider(name="setOFData")
public Object[][] getData(){
    Object[][] data =
            {
                    {0,1,1},
                    {0,-1,-2},
                    {-2147483647,-1,-2147483648},
                    {2147483646,1,2147483647}

            };
    return data;
}
}