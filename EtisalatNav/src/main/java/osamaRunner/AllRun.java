package osamaRunner;

import Pages.homePage;
import Utilites.utilits;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static Utilites.utilits.driver;

public class AllRun {

    homePage homePage = new homePage(driver);

@BeforeTest
public void initiate(){
utilits.initiate();
}


@Test(priority = 0)
    public void run1(){
homePage.navAccessories();
   driver.navigate().back();
    }@Test(priority = 1)
    public void run2(){
homePage.navGamingGadgets();
   driver.navigate().back();
    }@Test(priority = 2)
    public void run3(){
homePage.navMobile();
   driver.navigate().back();
    }@Test(priority = 3)
    public void run4() throws InterruptedException {
    Thread.sleep(3000);
homePage.navLaptops();
   driver.navigate().back();
    }


    @AfterTest
    public void terminate(){
    driver.quit();

    }
}


