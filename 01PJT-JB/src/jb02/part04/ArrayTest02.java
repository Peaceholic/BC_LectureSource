package jb02.part04;

/*
   FileName : ArrayTest02.java
   1. 2 차원 Array(? : 배열의 배열) > 1차원, 2차원 배열의 사용  
*/

public class ArrayTest02
{
    //main method
    public static void main (String[] args)
    {
   
   //int Data Type의 배열의 배열(2차원 배열)을 생성
   int[][] value = new int[9][9];

   // index를 이용 value 의 접근 및 대입
   for(int i=0; i<9; i++){
      value[0][i] = 1 * (i+1);
   }

   System.out.println(value.length);
   System.out.println(value[0].length);
   System.out.println(value[1].length);

   int[][] temp = new int[2][3];

   for(int l=0; l<temp.length; l++){
	    for(int m=0; m<temp[l].length; m++){
			temp[l][m] = 1 * (m+1);
		}
   }

   System.out.println(temp.length);
   System.out.println(temp[0].length);
   System.out.println(temp[1].length);

   //입력된 값을 출력
   // value.length / value[j].length의 의미
   // value[0][0] ~ value[0][9]까지의 출력 값을 확인
   // 배열은 생성시 자동초기화 됨을 확인
   for( int j=0; j<value.length; j++){   
       System.out.println("=====================");
           for( int k=0; k<value[j].length; k++){
               System.out.println("value["+j+"]["+k+"] = "+value[j][k]);
           } //end of inner
   }  


   for( int o=0; o<temp.length; o++){   
       System.out.println("=====================");
           for( int p=0; p<temp[o].length; p++){
               System.out.println("temp["+o+"]["+p+"] = "+value[o][p]);
           } //end of inner
   }  
  }//end of main
}