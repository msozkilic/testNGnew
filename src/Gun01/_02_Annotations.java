package Gun01;

import org.testng.annotations.*;

public class _02_Annotations {
    @BeforeClass
    void beforeClass(){ System.out.println("Her classtan önce calisir :Before Class");}
    @BeforeMethod
    void beforeMethod(){System.out.println("Her Testten önce calisacak : Before Method ");}
    @AfterMethod
    void afterMethod(){ System.out.println("Test metoddan sonra calisacak : After Metod");
    }@AfterClass
    void afterClass(){ System.out.println("Her classtan sonra calisacak :After Class");}
    @Test
    void test1(){System.out.println("Test 1 calisti");}
    @Test
    void test2(){System.out.println("Test 2 calisti ");}
}
