package testNG;
import org.testng.annotations.Test;
public class TestNGAnnotation01 {
    @Test(priority = 0)
    public void testLogin(){
        System.out.println("Login");
    }
    @Test(priority = 1)
    public void testCreate(){
        System.out.println("create");
    }
    @Test(priority = 2,enabled = false)
    public void testEdit(){
        System.out.println("Edit");
    }
    @Test(priority = 3)
    public void testDelete(){
        System.out.println("Delee");
    }
    @Test(priority = 4)
    public void testLogout(){
        System.out.println("LogOut");
    }

}
