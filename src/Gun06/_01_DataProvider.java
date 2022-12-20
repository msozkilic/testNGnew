package Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_DataProvider {

    @Test(dataProvider = "getData")
    void Username(String username){
        System.out.println("username="+username);
    }
    @DataProvider
    public Object[]getData(){
      Object[]data={"Nurhayat","Alper"};
        return data;
    }
    @Test(dataProvider = "userlar")
    void Username2(String username){
        System.out.println("username="+username);
    }
    @DataProvider(name = "userlar")
    public Object[]getData2(){
        Object[]data={"Nurhayat","Alper"};
        return data;
    }
}
