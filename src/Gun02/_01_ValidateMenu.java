package Gun02;

import Utils.GenelWEbDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/*
Siteyi acininiz ana menuler var mi kontrol ediniz.
 */
public class _01_ValidateMenu extends GenelWEbDriver {

    @Test
    void menuValidation() {
        List<String>menuExpectedList=new ArrayList<>();
        menuExpectedList.add("Desktops");
        menuExpectedList.add("Laptops & Notebooks");

        menuExpectedList.add("Components");
        menuExpectedList.add("Tablets");
        menuExpectedList.add("Software");
        menuExpectedList.add("Phones & PDAs");
        menuExpectedList.add("Cameras");
        menuExpectedList.add("MP3 Players");

        By menuFinder=By.className("navbar-nav");
        List<WebElement> menuActualList = driver.findElements(menuFinder);
        Tools.compareToList(menuExpectedList,menuActualList);

        }

        }


