package com.xworkz.inheritenceapp;

import com.xworkz.inheritenceapp.ecommerce.Ecommerce;
import com.xworkz.inheritenceapp.ecommerce.Filpkart;

public class EcommerceTester {
	
	public static void main(String a[]){
		Filpkart fp =new Filpkart();
		fp.flipkart();
		
		Ecommerce eco =new Ecommerce();
		eco.flipkart();
	}

}
