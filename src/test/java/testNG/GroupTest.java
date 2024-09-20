package testNG;

import org.testng.annotations.Test;

public class GroupTest {
    // S = smoke     // R= regresson

    @Test(groups = {"S","R" })
    public  void test01(){
        System.out.println("smoke and regresion test case ");
    }
    @Test(groups = {"R" })
    public  void test02(){
        System.out.println("regresion test case ");
    }
    @Test
    public  void test0(){
        System.out.println("not smoke or regresion test case ");
    }
    @Test(groups = {"S"})
    public  void test04(){
        System.out.println("smoke  test case ");
    }
    @Test(groups = {"S","R" })
    public  void test05(){
        System.out.println("smoke and regresion test case ");
    }
}
