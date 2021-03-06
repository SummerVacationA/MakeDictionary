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
	 
	 System.out.println("단어를 입력하세요");
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
					 tSet.add(scan.nextLine()); // .txt를 트리에 넣음					 
				 }
			 } catch (FileNotFoundException e) {
				 e.printStackTrace();
			 									}		 
		 }
	 }	 
	 
	 SortedSet<String> subSet = tSet.subSet(text, "힣");	 
	 System.out.println(tSet.ceiling(text));// 비슷한 단어 또는 같은 단어 출력해줌(float도 같은 역활)
	 System.out.println("a단어" + subSet);
	 
	 sw.stop();
	 System.out.println("10번 elapsed time:" + sw.getElapsedTime());
	 
 	}
 }
}