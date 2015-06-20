package com.sourceit.java.basic.lesovaya.lesson19.lab;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.*;

public class WGet {
	
	public static final String[] COMMANDS = {"Web server available","Save page", "Display title", "Find a word","List all URL's on the page"};
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.out.println(getInstructions());
			return;
		}
		String command = args[0];
		
		if("-i".equals(command)) {
			System.out.println("Input URL: ");
			try {
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				while(true) {
					command = in.readLine();
					if(command.startsWith("http")) {
						break;
					} else {
						//TODO
					}
				}
				
			} catch(IOException ex) {
				ex.printStackTrace();
			}

		} else if(!command.startsWith("http")) {
			System.out.println(getInstructions());
			return;
		}
		//TODO with url
		System.out.println("Select what to do next: ");
		for(int i=0; i<COMMANDS.length; i++) {
			System.out.println((i+1) + ")" + COMMANDS[i]);
		}
		
		int choise = -1;
		System.out.println("Input number of you choise:");
		
		try {
			BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
			while(true){
				String inputString = bufRead.readLine();
				try {
					choise = Integer.parseInt(inputString);
					if(choise < 0 || choise > 5) {
						System.out.println("Number of operation with file must be between 1 and 5");
					} else {
						break;
					}
				} catch(NumberFormatException nex) {
					nex.printStackTrace();
				}
			}			
		}catch(IOException e) {
			e.printStackTrace();
		}		
		executeCommand(choise,command);		
	}
	/**
	 * Saves html file
	 * @param urlInput
	 */
	public static void saveFile(String urlInput) {
		 	URL urlUsers;
		    InputStream is = null;
		    BufferedReader br;
		    OutputStreamWriter out = null;
		    
		    String line;

		    try {
		        urlUsers = new URL(urlInput);
		        is = urlUsers.openStream();
		        br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
		        out = new OutputStreamWriter(new FileOutputStream("f:\\Java\\temp\\temp.html"), "UTF-8");
		        
		        while ((line = br.readLine()) != null) {
		        	out.write(line);
		            //System.out.println(line);
		        }
		        
		        System.out.println("File was saved: f:\\Java\\temp\\temp.html");
		    }catch(Exception ex){
		    	System.out.println("Smth. wrong" + ex);
		    }finally {
		    	if (is != null){
		    		try {
						is.close();
					} catch (IOException e) {}
		    	}
		    	if (out != null) {
		    		try {
		    			out.close();
		    		} catch (IOException e) {}
		    	}
		    }		    
	}
	/**
	 * Checks availability of the web server
	 * @param urlInput
	 */
	public static void isWebServerAvailable(String urlInput) {
		URL usersURL;
		InputStream is = null;
		BufferedReader br;
		
		try{
			usersURL = new URL(urlInput);
	        is = usersURL.openStream();
	        br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
	        System.out.println("Server " + urlInput + " available!!!");
		}catch(IOException e) {
			System.out.println("Server unavailable!!! Try later");			
		}
	}
	/**
	 * Displays title of the html page
	 * @param text
	 * @return
	 */
	public static String displayTitle(String text) {
		StringBuilder title = new StringBuilder();
		String wordToSearch = "<title>";
		int j = 0;
		int indextOfTitle = 0;
		List<String> result = new ArrayList<String>();
		
		for(int i = 0; i < text.length(); i++) {			
				if (text.toLowerCase().charAt(i) == wordToSearch.charAt(j)){ 
					result.add(Character.toString(text.charAt(i)));
					if(j >= wordToSearch.length() - 1) {
						indextOfTitle = i;
						break;
					}
					j++;
				} else {
					j = 0;
					result.clear();
				}
		} 
		
		for(int m = indextOfTitle+1; m < text.length(); m++){
			if(text.charAt(m) == '<'){
				break;
			}
			title.append(text.charAt(m));
		}
		
		System.out.println(title.toString());
		return title.toString();		
	}
	/**
	 * Returns text from page by url
	 * @param inputURL
	 * @return
	 */
	public static String getTextFromPage(String inputURL) {
		String htmlText = "";
		URL url;
		InputStream is = null;
		BufferedReader br;
		String line = "";
		StringBuilder tempText = new StringBuilder();
		try {
			url = new URL(inputURL);
			is = url.openStream();
			br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			
			while((line = br.readLine()) != null) {
				tempText.append(line);
			}
		}catch(IOException e) {
			System.out.println("Smth. wrong" + e);
		}finally {
			if(is != null) {
				try {
					is.close();
				}catch(IOException e) {}
			}			
		}
		
		htmlText = tempText.toString();
		return htmlText ;
	}
	/**
	 * Finds word with some text
	 * @param text
	 * @param wordToSearch
	 * @return
	 */
	public static List<Integer> findWord(String text, String wordToSearch) {		
		int j = 0;
		int LastIndextOtfWord = 0;
		List<Integer> result = new ArrayList<Integer>();
		
		for(int i = 0; i < text.length(); i++) {			
				if (text.toLowerCase().charAt(i) == wordToSearch.toLowerCase().charAt(j)){ 
					if(j >= wordToSearch.length() - 1) {
						result.add(i);
						System.out.println(i);
						j = 0;
						continue;
					}
					j++;
				} else {
					j = 0;
				}
		} 
		
		//System.out.println(result.size());
		return result;
	}
	/**
	 * Returns list of url from the text
	 * @param text
	 * @return
	 */
	public static List<String> getUrls(String text) {	
		//pattern = "(?i)(<title.*?>)(.+?)(</title>)";
		Pattern pattern = Pattern.compile("https?://([/\\w//.]+)\\.([a-z\\.]{2,6})(/[\\w\\.]*)*/?");
		Matcher matcher = pattern.matcher(text);
		List<String> listOfUrls = new ArrayList<String>();
		while (matcher.find()) {
			listOfUrls.add(text.substring(matcher.start(), matcher.end()));
		}
		
		return listOfUrls ;
	}
	/**
	 * Runs methods 
	 * @param commandNumber - number of command between 1 and 5: <ul><li>1 - Web server available </li> <li>2- Save page</li> <li>3 - Display title</li> <li>4 - Find a word</li> <li>5 - List all URL's on the page</li></ol>
	 * @param urlInput - URL address of web page
	 */
	private static void executeCommand(int commandNumber,String urlInput) {
		switch(commandNumber) {
			case 1:
				isWebServerAvailable(urlInput);
				break;
			case 2:
				saveFile(urlInput);
				break;
			case 3:
				displayTitle(getTextFromPage(urlInput));
				break;
			case 4:
				findWord(getTextFromPage(urlInput),"style");
				break;
			case 5:
				List<String> listsOfLinks = getUrls(getTextFromPage(urlInput));
				System.out.println("*******List of all URLs from web page " + urlInput + "*******");
				for(String s:listsOfLinks) {
					System.out.println(s);					
				}
				break;
			default:
				break;			
		}
	}
		
	public static String getInstructions() {
		return "Usage: some url adress\n" +
				"        or -i\n" +
				"Example: http://google.com";	
	}

}
