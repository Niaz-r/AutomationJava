package com.utility;

import com.mytest.BaseDriver;

public class CommonMethods extends com.driver.BaseDriver{
	
	   // Sleep (Thread.sleep wrapped safely)
    public static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	

}
