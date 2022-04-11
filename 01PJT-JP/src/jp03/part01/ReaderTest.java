package jp03.part01;

/*
 FileName :  ReaderTest.java
  
 1. java.io package :  프로그램 외부로 자원을 받거나, 전달 경우에 사용
 2. keyboard 로 부터 data 를 읽어 들이면

InputStream 은 한글처리[2byte]가 되지 않음
문자를 처리하는 Reader 계열로 변경하면~
 */
import java .io.*;

public class ReaderTest{
	
	//Main method
	public static void main(String args[]){

		try{
			
			// InputStream 표준입력장치 추상화 class
			InputStream inputStream = System.in;
			// InputStream을 Reader 로 변경 (byte 처리 >> 문자처리 변경)
	        Reader reader = new InputStreamReader(inputStream);			
	        
			System.out.println("입력을 기다립니다....... ");
			
			//값을 읽는 무한 loop 를 시작.
        	while(true){

        		//1. java.io 는 지연(block)될수 있다.
				int i = reader.read();
				char c = (char) i;

				//2. java.io 는  FIFO의 구조
				System.out.println("입력하신 값 : "+c);

				//char  'x'가 입력시 while 종료
				if(c=='x'){
					inputStream.close();		 
					break;
				}
				
			}
		}catch(IOException e){
			e.printStackTrace();
		 }
		
	}//end of main
}//end of class