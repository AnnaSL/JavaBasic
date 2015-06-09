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

public class WGet {
	
	public static final String[] COMMANDS = {"Web server available","Save page", "Display title", "Find a word","List all URL's on the page"};
	
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
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		executeCommand(choise,command);
		
	}
	
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
		    } finally {
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
	
	private static void executeCommand(int commandNumber,String urlInput) {
		switch(commandNumber) {
			case 1:
				//TODO
			case 2:
				saveFile(urlInput);
			case 3:
				//TODO
			case 4:
				//TODO
			case 5:
				//TODO
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
