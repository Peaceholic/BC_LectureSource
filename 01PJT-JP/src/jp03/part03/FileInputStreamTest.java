package jp03.part03;

import java.io.*;

/*
 * FileName : FileInputStreamTest.java
 */
public class  FileInputStreamTest{
	
    ///main method
	public static void main(String[] args)	{
  
		//File 을 읽어 들이는 Stream 선언
		FileInputStream fis = null;
		//read() 수 count 위한 변수
		int readCount=0;

		try{
			fis = new FileInputStream(args[0]);

			while(true){
				int i = fis.read();
				
				if( i == -1) {// i= -1의 의미는==> API확인할 것.
					break;
				}
				
				char c = (char)i;
				System.out.print(c);
				
				readCount++;
			}
			
		  }catch(FileNotFoundException e){
			  e.printStackTrace();
		  }catch(IOException e1){
			  e1.printStackTrace();
		  }finally{
			  System.out.println("\n\n===================================");
			  System.out.println("=====>>> read횟수 readCount : "+readCount);
			  System.out.println("===================================");
			  try {
				  if(fis != null) {
					  fis.close();
				  }
			  } catch (Exception e) {
				  e.printStackTrace();
			  }
		  }
		
	}//end of main
	
}//end of class