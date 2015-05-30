package com.sourceit.java.basic.lesovaya.ht15;

import java.io.*;
import java.util.Map.Entry;

import com.sourceit.java.basic.lesovaya.ht11.TextStatisticsImpl;

public class IOTextStatistics {

	public static void main (String[] args) throws IOException {

		BufferedReader in = null;
		PrintWriter out = null;
		char targetChar = 'm';
		int targetCount = 18;
		String textFromFile = "";
		
		//IO
		try {
			in = new BufferedReader(new FileReader(args[0]));
			String line; 
			 while ((line = in.readLine()) != null) {
				 textFromFile += line;
			 }
		} finally{
			if(in != null) {
				in.close();
			}
		}
		
		TextStatisticsImpl text = new TextStatisticsImpl(textFromFile);
		
		try {
			out = new PrintWriter(new FileWriter(args[0]));
			out.println("/-------------------------Text Statistics---------------------------/");
			out.println("How often the character \"" + targetChar + "\" occurs in a text: " +  text.getCharFrequency(targetChar));
			out.println("The number of characters c: " + text.getCharCount(targetChar));
			out.println("Collection of unique characters and it's counts: "+ text.getChars());
			out.println("List of words in a text: " + text.words());
			out.println("The most popular char count: " + text.getMostPopularCharCount());
			out.println("The least popular char count: " + text.getLeastPopularCharCount());
			out.println("Char by count: " + Character.toString(text.getCharByCount(targetCount)));
			out.println("/-------------------------------------------------------------------/");
			out.println(textFromFile);
		} finally{
			if(out != null) {
				out.close();
			}
		}
		
		
	}

}