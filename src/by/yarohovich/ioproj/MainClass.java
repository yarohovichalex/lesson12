package by.yarohovich.ioproj;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws IOException {
		String str1 = "3+1\r\n4-2\r\n5*2";		
		String str2 = "3+1";
		String str3 = "3+1";
		//fileWriter(str1);
		fileWriter(str1);
		valueReader();

	}
	
	private static void fileWriter(String str1) {
		
		try {
			FileWriter fw = new FileWriter("C:\\Dell\\txx.txt");
			fw.write(str1);
			System.out.println("write file " + str1);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void valueReader() {
		String string = null;
		char [] charValue;
		
		try {			
				FileReader fr = new FileReader("C:\\Dell\\txx.txt");
				Scanner scan = new Scanner(fr);
				do {
						string = scan.nextLine();
						charValue = string.toCharArray();
						String []stringArrae = string.split("\\-|\\+|\\*");
					
					switch(charValue[1]) {
					  case '+' : System.out.println(Integer.parseInt(stringArrae[0]) + Integer.parseInt(stringArrae[1]));
					  break;
				      case '-' : System.out.println(Integer.parseInt(stringArrae[0]) - Integer.parseInt(stringArrae[1]));
					  break;
				      case '*' : System.out.println(Integer.parseInt(stringArrae[0]) * Integer.parseInt(stringArrae[1]));
					  break;
					  default : System.out.println("что пошло не так");
					}
				}while(scan.hasNextLine());
				
				fr.close();
				scan.close();			
						
		} catch (IOException e) {			
			e.printStackTrace();
		}		
	}
}
