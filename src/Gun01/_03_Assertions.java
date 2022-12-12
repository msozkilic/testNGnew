package Gun01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assertions {

    @Test
    void EqualOrnek() {
        String s1 = "Merhaba";
        String s2 = "Iyi Aksamlar";

        Assert.assertEquals(s1, s2, "Karsilastirma sonucu");
    }

    @Test
    void NotEqualOrnek() {
        String s1 = "Merhaba";
        String s2 = "Iyi Aksamlar";

        Assert.assertNotEquals(s1, s2, "Karsilastirma sonucu");
    }
    @Test
    void TrueOrnek(){
        int s1=55;
        int s2=55;

        Assert.assertTrue(s1==s2,"Karsilastirma sonucu");
    }
    @Test
    void nullOrnek(){
        String s1=null;
        Assert.assertNull(s1,"Karsilastirma sonucu");
    }
    @Test
    void direktFail(){
        int a=55;
        if(a==55)

        Assert.fail();

    }
}
