package tryout;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileFactor {
	public static void main(String[] args) {
		
		
		ArrayList<Integer> twolist = new ArrayList<>();
		ArrayList<Integer> threelist = new ArrayList<>();
		ArrayList<Integer> fourlist = new ArrayList<>();
		ArrayList<Integer> fivelist = new ArrayList<>();
		ArrayList<Integer> sixlist = new ArrayList<>();
		ArrayList<Integer> sevenlist = new ArrayList<>();
		ArrayList<Integer> eightlist = new ArrayList<>();
		ArrayList<Integer> ninelist = new ArrayList<>();
		ArrayList<Integer> tenlist = new ArrayList<>();
		try {
			PrintWriter pw = new PrintWriter("Factors.txt");
			
			for (int i = 1; i <= 100; i++) {
				if(i%2==0) {
					twolist.add(i);
					
				}
				if(i%3==0) {
					threelist.add(i);
					
				}
				 if(i%4==0) {
					fourlist.add(i);
					
				}
				 if(i%5==0) {
					fivelist.add(i);
				}
				 if(i%6==0) {
					sixlist.add(i);
					
				}
				 if(i%7==0) {
					sevenlist.add(i);
				}
				 if(i%8==0) {
					eightlist.add(i);
				}
				 if(i%9==0) {
					ninelist.add(i);
				}
				 if(i%10==0) {
					tenlist.add(i);
				}
				
			}
			
			System.out.println("divisible by 2");
			pw.println("Divisible by 2");
			for (Integer integer : twolist) {
			
				System.out.println(integer);
				pw.println(integer);
				
			}
			pw.println();
			
			pw.println("Divisible by 3");
			System.out.println("divisible by 3");
			for (Integer integer1 : threelist) {
			
				System.out.println(integer1);
				pw.println(integer1);
				
			}
			pw.println();
			pw.println("Divisible by 4");
			System.out.println("divisible by 4");
			for (Integer integer2 : fourlist) {
				
				System.out.println(integer2);
				pw.println(integer2);
				
			}
			pw.println();
			pw.println("Divisible by 5");
			System.out.println("divisible by 5");
			for (Integer integer3 : fivelist) {
				
				System.out.println(integer3);
				pw.println(integer3);
				
			}
			pw.println();
			pw.println("Divisible by 6");
			System.out.println("divisible by 6");
			for (Integer integer4 : sixlist) {
				
				System.out.println(integer4);
				pw.println(integer4);
				
			}
			
			pw.println();
			pw.println("Divisible by 7");
			System.out.println("divisible by 7");
			for (Integer integer5 : sevenlist) {
				
				System.out.println(integer5);
				pw.println(integer5);
				
			}
			
			pw.println();
			pw.println("Divisible by 8");
			System.out.println("divisible by 8");
			for (Integer integer6 : eightlist) {
				
				System.out.println(integer6);
				pw.println(integer6);
			}
			pw.println();
			pw.println("Divisible by 9");
			System.out.println("divisible by 9");
			for (Integer integer7 : ninelist) {
				
				System.out.println(integer7);
				pw.println(integer7);
				
			}
			pw.println();
			pw.println("Divisible by 10");
			System.out.println("divisible by 10");
			pw.println("Divisible by 10");
			for (Integer integer8 : tenlist) {
				
				System.out.println(integer8);
				pw.println(integer8);
			}
			
			
			pw.close();
			
			
		}
		catch(FileNotFoundException ex){
			System.out.println(ex.getMessage());
			
		}
	}

}
