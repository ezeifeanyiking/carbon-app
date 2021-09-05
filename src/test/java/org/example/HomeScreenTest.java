package org.example;

import org.testng.annotations.Test;

public class HomeScreenTest {
    @Test
    public static void AddMoneyButton(){
        System.out.println("Add money");
    }
    @Test
    public static void SendMoneyButton(){
        System.out.println("Send money");
        AccountScreenTest.UpgradeAccount();
    }


}
