package com.timekeepers.objects;

public class Product {
		
		private String name;
		private String type;
		private double price;
		private double invested;
		private String shopName;
		private static int countOfSales;
		private double income;
		
		public Product(String name, String type, double price, double invested, String shopName, int countOfSales){
			this.name = name;
			this.type = type;
			this. price = price;
			this.invested = invested;
			this.shopName = shopName;
			this.countOfSales += countOfSales;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public double getInvested() {
			return invested;
		}
		public void setInvested(double invested) {
			this.invested = invested;
		}
		public String getShopName() {
			return shopName;
		}
		public void setShopName(String shopName) {
			this.shopName = shopName;
		}
		public int getCountOfSales() {
			return countOfSales;
		}
		public void setCountOfSales(int countOfSales) {
			this.countOfSales = countOfSales;
		}
	
}
