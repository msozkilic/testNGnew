package Gun06.Gun06;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_DataProvider_Iterator {
    @Test(dataProvider = "getData")
    void UsernameTest(String username){
        System.out.println("username= "+username);
    }
    public Iterator<Object>getData(){
        List<Object>data=new ArrayList<>();
        data.add("Nurhayat");
        data.add("Alper");

        return data.iterator();
    }
    @Test(dataProvider = "getData")
    void UsernameTest2(String username,String password){
        System.out.println("username= "+username+", password= "+ password);
    }
    public Iterator<Object[]>getData2(){

        List<Object[]>data=new ArrayList<>();
        data.add(new Object[]{"Nurhayat","1231"});
        data.add(new Object[]{"Alper","1222"});

        return data.iterator();
    }
}