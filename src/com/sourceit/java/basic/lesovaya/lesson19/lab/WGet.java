package com.sourceit.java.basic.lesovaya.lesson19.lab;

public class WGet {
	
	public static final String[] COMMANDS = {" Save page", " Display title", "Find a word","List all URL's on the page"};;
	
	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.out.println(getInstructions());
			return;
		}
		String command = args[0];
		
		if("-i".equals(command)) {
			//TODO ask for URL
		} else if(!command.startsWith("http")) {
			System.out.println(getInstructions());
			return;
		}
		//TODO with url
		System.out.println("Select what to do next: ");
		for(int i=0; i<COMMANDS.length; i++) {
			System.out.println((i+1) + ")" + COMMANDS[i]);
		}
		
	}
	
	private static void executeCommand(int commandNumber) {
		switch(commandNumber) {
			case 1:
				//TODO
			case 2:
				//TODO
		}
	}
	
	public static String getInstructions() {
		return "Usage: some url adress\n" +
				"        or -i\n" +
				"Example: http://google.com";
	
	}

}
