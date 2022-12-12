package Gun01;

import org.testng.annotations.Test;

public class _01_Giris {

    @Test (priority = 1)
    void webSitesiniAc(){
        System.out.println("Test islemleri yapild");
    }
    @Test (priority = 2)
    void loginYap() {
        System.out.println("login yapildi");
    }
    @Test(priority = 3)
    void driveriKapat(){
        System.out.println("Driver kapatildi");
    }
    }







