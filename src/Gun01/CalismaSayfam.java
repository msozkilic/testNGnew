package Gun01;

import bsh.Primitive;
import net.bytebuddy.build.Plugin;
import org.testng.Assert;
import org.testng.annotations.*;

public class CalismaSayfam {
    @BeforeClass
     void ilkIslemler(){
        System.out.println("Before class calisti");
    }
    @BeforeMethod(enabled = false)
    void öncekiMethod(){
        System.out.println("önceki metod calisti");
    }
    @Test(priority = 1)
    void testYapildi(){
        System.out.println("TEst islemleri yapildi");
    }
    @Test(enabled = false)
    void test2Yapildi(){
        System.out.println("TEst2 islemleri yapildi");
    }
    @Test(priority = 3)
    void test3Yapildi(){
        String a="aksam";
        String b="sabah";
        Boolean c=true;
        int d=55;
        int e=55;
        Assert.assertEquals(d,e);

        Assert.assertTrue(c);
        Assert.assertNotEquals(b,a,"karsilastirma sonucu");
        if (a==b){
            Assert.fail();
        }
    }
    @AfterMethod
    void sonrakiMethod(){
        System.out.println("Sonraki method calisti");
    }
    @AfterClass
    void sonrakiKlass(){
        System.out.println("After klass calisti");
    }
}
