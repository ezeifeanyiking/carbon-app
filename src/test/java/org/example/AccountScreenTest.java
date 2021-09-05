package org.example;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AccountScreenTest {
    @BeforeTest
    public static void UpgradeAccount(){
        System.out.println("Another Loading...");
        System.out.println("This is to upgrade account");
    }
}
