package com.sourceit.java.basic.lesovaya.ht11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TextStatisticsImpl extends TextStatistics {

	public TextStatisticsImpl(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCharFrequency(char c) {
		double freq = 0;
		//Double temp = (double) (this.getCharCount(c) / getText().length());
		freq = (double)this.getCharCount(c) / getText().length() * 100;
		return freq;
	}

	@Override
	public int getCharCount(char c) {
		int count = 0;
		for (int i = 0; i < getText().length(); i++) {
			if (getText().toLowerCase().charAt(i) == Character.toLowerCase(c)) {
				count++;
			}
		}
		return count;
	}

	@Override
	public Map<String, Integer> getChars() {
		Map<String, Integer> charsMap = new HashMap<>();
		
		for(int i = 0; i < getText().length(); i++) {
			char c = getText().charAt(i);
			int count = this.getCharCount(c);
			//System.out.println(c + " " + count);
			
			charsMap.put(Character.toString(c), count);	
		}
		
		for (Entry<String, Integer> entry : charsMap.entrySet())
		{
		    System.out.println(entry.getKey() + "/" + entry.getValue());
		}
		
		return charsMap;
	}

	@Override
	public List<String> words() {
		String[] words = getText().split("[\\p{Punct}\\s]+");
		List<String> listOfWords = Arrays.asList(words);
		
		for(int i = 0; i < listOfWords.size(); i++){
			System.out.println(listOfWords.get(i));
		}
		return listOfWords;
	}

	@Override
	public int getMostPopularCharCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLeastPopularCharCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public char getCharByCount(int count) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return this.getText();
	}

}
