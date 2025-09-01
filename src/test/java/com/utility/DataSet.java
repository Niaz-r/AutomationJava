package com.utility;

import org.testng.annotations.DataProvider;

public class DataSet {

	@DataProvider(name = "loginData")
	public static Object loginData() {
		
		Object[][] objects = {{"niaz","rahaman"},{"ali","jakey"},{"toufiq","labib"}};
		
		
		return objects;
		
	}
}
