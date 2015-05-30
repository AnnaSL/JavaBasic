package com.sourceit.java.basic.lesovaya.ct16;

import java.io.*;
import java.util.*;
/**
 * 
 * @author Anna Lesovaya
 *
 */
public class CountrySort {

	private Set<String> countrySet;
	private BufferedReader in = null;
	private PrintWriter out = null;
	private Set<String>  sortCountry() throws IOException {
		
		countrySet = new TreeSet<String>();
		
		try {
			in = new BufferedReader(new FileReader("f:\\Java\\temp\\Country.txt"));
			String line;
			while((line = in.readLine()) != null) {
				countrySet.add(line.trim());
			}
			System.out.println(countrySet);
		} finally {
			if(in != null) {
				in.close();
			}			
		}		
		return countrySet;
	}
	
	private void writeCountry() throws IOException {		
		try {
			out = new PrintWriter(new FileWriter("f:\\Java\\temp\\CountrySorted.txt"));
			for(String s: countrySet) {
				out.println(s);
			}
		} finally {
			if(out != null) {
				out.close();
			}
		}
	}
	
	private void writeCountryUpdate() throws IOException {		
		try {
			out = new PrintWriter(new FileWriter("f:\\Java\\temp\\CountrySortedUpdate.txt"));
			char c = '\u0000';
			for(String s: countrySet) {
				
				if(c != s.charAt(0)) {
					c = s.charAt(0);
					out.println(Character.toString(c));
				} 
				out.println("    " + s);					
			}
		} finally {
			if(out != null) {
				out.close();
			}
		}
	}
	
	public static void main(String[] args) {
		CountrySort countrySort = new CountrySort();
		try {
			countrySort.sortCountry();
		} catch (IOException ioex) {
			ioex.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			countrySort.writeCountry();
		} catch (IOException ioex) {
			ioex.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			countrySort.writeCountryUpdate();
		} catch (IOException ioex) {
			ioex.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
