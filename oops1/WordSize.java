package oops1;

import java.util.ArrayList;

public class WordSize {
public static void main(String[] args) {
	ArrayList<String> wordlist = new ArrayList<>();
	ArrayList<String> wordcount4 = new ArrayList<>();
	ArrayList<String> wordcount5 = new ArrayList<>();
	ArrayList<String> wordcount6 = new ArrayList<>();
	ArrayList<String> wordcount7 = new ArrayList<>();
	ArrayList<String> wordcount8 = new ArrayList<>();
	ArrayList<String> wordcount9 = new ArrayList<>();
	wordlist.add("horse");
	wordlist.add("gold");
	wordlist.add("diamond");
	wordlist.add("Rabbit");
	wordlist.add("Aeroplane");
	wordlist.add("Facebook");
	wordlist.add("Race");
	wordlist.add("Soft");
	wordlist.add("Rent");
	wordlist.add("Station");
	wordlist.add("Junction");
	wordlist.add("Mission");
	wordlist.add("Monkey");
	wordlist.add("Parrot");
	wordlist.add("Peacock");
	wordlist.add("Lemon");
	wordlist.add("horse");
	wordlist.add("Rank");
	wordlist.add("Wolf");
	wordlist.add("Walk");
	wordlist.add("Week");
	wordlist.add("Rocket");
	wordlist.add("Ride");
	wordlist.add("Cosmetics");
	System.out.println(wordlist);
	
	
	
	
	for(int i=0;i<wordlist.size();i++) {
		if(wordlist.get(i).length() == 4) {
			wordcount4.add(wordlist.get(i));
		}
		else if(wordlist.get(i).length()==5) {
			wordcount5.add(wordlist.get(i));
		}
		else if(wordlist.get(i).length()==6) {
			wordcount6.add(wordlist.get(i));
		}
		else if(wordlist.get(i).length()==7) {
			wordcount7.add(wordlist.get(i));
		}
		else if(wordlist.get(i).length()==8) {
			wordcount8.add(wordlist.get(i));
		}
		else if(wordlist.get(i).length()==9) {
			wordcount9.add(wordlist.get(i));
		}
			
		
	}   
	
	System.out.println();
	System.out.println("WordSize4");
		for (String string : wordcount4) {
			
			System.out.println(string);
		}
		
		System.out.println();
		System.out.println("WordSize5");
		for (String string1 : wordcount5) {
			
			System.out.println(string1);
		}
		
		System.out.println();
		System.out.println("WordSize6");
		for (String string2 : wordcount6) {
			
			System.out.println(string2);
		}
		
		System.out.println();
		System.out.println("WordSize7");
		for (String string3 : wordcount7) {
			
			System.out.println(string3);
		}
		
		System.out.println();
		System.out.println("WordSize8");
		for (String string4 : wordcount8) {
			
			System.out.println(string4);
		}

		System.out.println();
		System.out.println("WordSize9");
		for (String string5 : wordcount9) {
			
			System.out.println(string5);
		}
	
	
	
}
}
