package testNG;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnTest {
    @Test()
    public void olevel(){
        System.out.println("ol");
        Assert.fail();
    }
    @Test(dependsOnMethods = "olevel")
    public void alevel(){
        System.out.println("al");
    }
    @Test(dependsOnMethods = {"olevel","alevel"}, alwaysRun = true)
    public void campus(){
        System.out.println("campus");
    }
}
