package jp03.part05;

import java.io.*;

/* 
 * FileName : FileWriterTestFilter01.java
 * 
 * ==>FileCopy하는 Application 작성
 * 1. Keyboard 로 FileName을 입력
 * 2. File 의 내용을  read() ==> FileReader
 * 3. File 로 내용을 write() ==> FileWriter
 */
public class FileWriterTestFilter01 {
	
    ///main method
	public static void main(String[] args) throws IOException{
    
		//필요객체 Stream/String 인스턴스 declaration
		BufferedReader br = null;
		BufferedWriter bw = null;
		String fileName="";
		String copyFileName="";
		
        int readCount=0; //read를 Count하기위한 변수

		System.out.print("copy할 file 이름을 입력하세요 : ");
		//copy 할 FileName을 입력받기...
		fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();

        //=> 원본파일 Data를 read 할 수 있는  BufferedReader 생성
		br = new BufferedReader(  new FileReader( fileName ) ) ;

		//=> 사본파일 이름 만들기
		copyFileName = fileName+"_copy";
        //=> Data를 write 할 수 있는  BufferedWriter 생성
		bw = new BufferedWriter( new FileWriter(copyFileName) );
		
        // read / writer 하는  while 문
		String source = null;
		while( (source=br.readLine()) != null ){
			bw.write(source+"\r");			
			bw.newLine();
            readCount++;
		}
        bw.flush(); //==> 잊지말것

        //Stream close()
		bw.close();		
		br.close();
		
		System.out.println("===================================");
		System.out.println("=====>>> read횟수 readCount : "+readCount);
		System.out.println("===================================");
		
	}//end of main
	
}//end of class