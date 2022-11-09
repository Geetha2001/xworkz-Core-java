package com.xworkz.inheritenceapp;

import com.xworkz.inheritenceapp.searchEngine.Google;
import com.xworkz.inheritenceapp.searchEngine.SearchEngine;

public class SearchEngineTester {
	public static void main(String a[]){
		
	

	SearchEngine se=new SearchEngine();
	se.searchengine();
	
	Google gl=new Google();
	gl.searchengine();
}
}