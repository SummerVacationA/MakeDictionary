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
	 
	 System.out.println("�ܾ �Է��ϼ���");
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
					 tSet.add(scan.nextLine()); // .txt�� Ʈ���� ����					 
				 }
			 } catch (FileNotFoundException e) {
				 e.printStackTrace();
			 									}		 
		 }
	 }	 
	 
	 SortedSet<String> subSet = tSet.subSet(text, "�R");	 
	 System.out.println(tSet.ceiling(text));// ����� �ܾ� �Ǵ� ���� �ܾ� �������(float�� ���� ��Ȱ)
	 System.out.println("a�ܾ�" + subSet);
	 
	 sw.stop();
	 System.out.println("10�� elapsed time:" + sw.getElapsedTime());
	 
 	}
 }
}