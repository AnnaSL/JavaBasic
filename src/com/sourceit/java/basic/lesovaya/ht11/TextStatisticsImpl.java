package com.sourceit.java.basic.lesovaya.ht11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TextStatisticsImpl extends TextStatistics {

private Map<String,Integer> sortedCharsByCount;

	public TextStatisticsImpl(String text) {
		super(text);
	}

	@Override
	public int getCharFrequency(char c) {
		int freq = 0;
		if(getText().length() == 0) {
			System.out.println("Text is empty");
		} else {
			freq = (int)this.getCharCount(c) * 100 / getText().length();
		}
		return freq;
	}

	@Override
	public int getCharCount(char c) {
		int count = 0;
		if (getText().length() == 0) {
			System.out.println("Text is empty");
		} else {
			for (int i = 0; i < getText().length(); i++) {
				if (getText().toLowerCase().charAt(i) == Character.toLowerCase(c)) {
					count++;
				}
			}
		}
		return count;
	}

	@Override
	public Map<String, Integer> getChars() {
		Map<String, Integer> charsMap = new HashMap<>();
		
		for(int i = 0; i < getText().length(); i++) {
			char c = getText().toLowerCase().charAt(i);
			int count = this.getCharCount(c);
			charsMap.put(Character.toString(c), count);	
		}
		
		Map<String,Integer> sortedCharsByCount = new TreeMap<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int result = charsMap.get(o1).compareTo(charsMap.get(o2));
				return result == 0 ? -1 : result;
			}
		});
		sortedCharsByCount.putAll(charsMap);		
		return sortedCharsByCount;
	}

	@Override
	public List<String> words() {
		String[] words = getText().split("[\\p{Punct}\\s]+");
		List<String> listOfWords = Arrays.asList(words);
		return listOfWords;
	}

	@Override
	public int getMostPopularCharCount() {
		int maxValue = 0;
//		for(Integer value: this.getChars().values()) {
//			if(value > maxValue) {
//				maxValue = value;
//			}
//		}
//		
		List<Integer> values = new ArrayList<>(this.getChars().values());
		maxValue = values.get(values.size()-1);
		return maxValue;
	}

	@Override
	public int getLeastPopularCharCount() {
		int minValue;
		List<Integer> values = new ArrayList<>(this.getChars().values());
		minValue = values.get(0);
		return minValue;
	}

	@Override
	public char getCharByCount(int count) {
		char c = '\u0000';
		for(Map.Entry<String, Integer> e: getChars().entrySet()) {
			if(e.getValue() == count){
				c = e.getKey().charAt(0);
			} 
		}
		return c;
	}

	@Override
	public String toString() {
		return this.getText();
	}

}
