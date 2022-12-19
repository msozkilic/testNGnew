package Gun04;

import org.testng.annotations.*;

public class _01_Intro {
    /*@BeforeSuite
    @BeforeTest
    @BeforeGroups
    @BeforeClass
    @BeforeMethod
    @Test
    @Test
    @AfterMethod
    @AfterClass
    @AfterGroups
    @AfterTest
    @AfterSuite */
    @BeforeSuite
    void bSuit(){
        System.out.println("Before Suit");
    }
    @BeforeTest
    void bTest(){
        System.out.println("Before Test");
    }
    @BeforeGroups
    void bGroups(){
        System.out.println("Before Groups");
    }
    @BeforeClass
    void bClass(){
        System.out.println("Before Class");
    }
    @BeforeMethod
    void bMethod(){
        System.out.println("Before Method");
    }
    @Test
    void test1(){
        System.out.println("Test 1");
    }
    @AfterMethod
    void aMethod(){
        System.out.println("After Method");
    }
    @BeforeMethod
    void b2Method(){
        System.out.println("Before Method");
    }
    @Test
    void test2() {
        System.out.println("Test 2");
    }

    @AfterMethod
    void aMethod2(){
        System.out.println("After Method 2");
    }
    @AfterClass
    void aClass(){
        System.out.println("After Class");
    }
    @AfterGroups
    void aGroup(){
        System.out.println("After Groups");
    }
    @AfterTest
    void aTest(){
        System.out.println("After Test");
    }
    @AfterSuite
    void aSuit(){
        System.out.println("After Suite");
    }


}