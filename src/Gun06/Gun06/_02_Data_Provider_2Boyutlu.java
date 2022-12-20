package Gun06.Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_Data_Provider_2Boyutlu {
    @Test(dataProvider = "getData")
    void Username(String username,String password){
        System.out.println("username= "+username + "password ="+ password);
    }
    @DataProvider
    public Object[][]getData(){
        Object[][]data={{"Nurhayat","123"},{"Alper","456"}};
        return data;
    }
}
