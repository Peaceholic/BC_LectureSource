package jp03.part05;

import java.io.*;

/*
 * FileName : FileWriterTest.java
 * 
 * ==> keyboard로 입력받은 내용 test.txt 로 보내는 Application 작성
 */
public class FileWriterTestFilter02{
	
	///main method
	public static void main(String[] args)throws Exception{
		
		//필요객체 Stream/String 인스턴스 declaration
		BufferedReader br = null;
		BufferedWriter bw = null;
	
		// keyboard 로 입력받기위한 Sink Stream Reader  및 
		// 1개의 line 을 읽기편한 readLine() method 를 제공하는 BufferedReader 생성
		// Reader r = new InputStreamReader(System.in);
		// br = new BufferedReader(r);
		br = new BufferedReader(new InputStreamReader(System.in));
  
		// File 에 글을 쓰기위한 FileWriter 및 BufferWriter 생성
		// FileWriter fw = new FileWriter("test.txt");
		// bw = new BufferedWriter(fw);
		bw = new BufferedWriter(new FileWriter("test.txt"));            //==>API확인 
		//bw = new BufferedWriter(new FileWriter("test.txt",true));  //==>API확인 
		
		System.out.println("화일에 저장하실 글을 입력하세요.");
		while(true){
	        String str = br.readLine();
	        if(str.equals("끝")){
	        	break;
	        }
			bw.write(str,0,str.length());  //==>API를 확인하자.
			bw.newLine();                         //==>API를 확인하자.(줄바꾸기)
		}
		bw.flush();      //flush를 잊지 말것
		
        //Stream close()
		br.close();
		bw.close();		
		
	}//end of main
	
}//end of class