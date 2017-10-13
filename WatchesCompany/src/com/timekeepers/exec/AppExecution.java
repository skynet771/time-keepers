package com.timekeepers.exec;

import java.io.FileNotFoundException;

import com.timekeepers.utils.SalesAnalysUtils;

public class AppExecution {

	public static void main(String[] args) {
		try {
			SalesAnalysUtils.mostProfitable();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
