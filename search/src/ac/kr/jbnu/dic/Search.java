package ac.kr.jbnu.dic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Search { 
 public static void main(String [] args){
 
	 File file = new File("D:\\dic");
	 Scanner scan = null;
	 
	 
	 File[] listFiles = file.listFiles();
	 TreeSet<String> tSet = new TreeSet<String>();
	 
	 System.out.println("´Ü¾î¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
	 Scanner scan1 = new Scanner(System.in);
	 String text = scan1.nextLine();
	 for(int i = 0; i<10; i++){
	 StopWatch sw = new StopWatch();
	 sw.start();
	 
	 for(File f : listFiles) {
		 if(f.isFile()) {
			 if(f.getName().contains(".txt"));
			 
			 try {
				 scan = new Scanner(f);
				 while(scan.hasNext()) {				 
					 tSet.add(scan.nextLine()); // .txt¸¦ Æ®¸®¿¡ ³ÖÀ½					 
				 }
			 } catch (FileNotFoundException e) {
				 e.printStackTrace();
			 									}		 
		 }
	 }	 
	 
	 SortedSet<String> subSet = tSet.subSet(text, "ÆR");	 
	 System.out.println(tSet.ceiling(text));// ºñ½ÁÇÑ ´Ü¾î ¶Ç´Â °°Àº ´Ü¾î Ãâ·ÂÇØÁÜ(floatµµ °°Àº ¿ªÈ°)
	 System.out.println("a´Ü¾î" + subSet);
	 
	 sw.stop();
	 System.out.println("10¹ø elapsed time:" + sw.getElapsedTime());
	 
 	}
 }
}