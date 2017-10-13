package com.timekeepers.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.timekeepers.objects.Product;

public class SalesAnalysUtils {
			
	public static void mostProfitable() throws FileNotFoundException{
		
		//String w = fromFileToArr();
		convertToObject();
	}
	
	private static void convertToObject() throws FileNotFoundException{
		
		String[] words = fromFileToArr();
		String[][] arr = new String[3][5];
		for(int i =0; i<words.length;i++){
			arr[i] = words[i].split(",");
		}
	//	System.out.println(arr.length);
		Product[] productsArr = new Product[3];
		for(int y = 0; y< arr.length;y++){
				productsArr[y] = new Product(arr[y][0],arr[y][1],Double.parseDouble(arr[y][2]),Double.parseDouble(arr[y][3]),
						arr[y][4], Integer.parseInt(arr[y][5]));
			 
		}
		 System.out.println(productsArr[0].getCountOfSales());
	}
	
	private static String[] fromFileToArr() throws FileNotFoundException{
		String input = "C:\\Users\\denislav.itsinski\\Documents\\timekeepers\\sales.txt";
		Scanner scan = new Scanner(new File(input));
		String content = scan.useDelimiter("\\Z").next(); // get the content of
		scan.close();
		String[] stringLine = content.split("[;]+"); //split to words
		return stringLine;
	}
	
}
