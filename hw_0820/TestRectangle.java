import java.util.Scanner;
//import c.modeling.ex01.ans.Rectangle;

public class TestRectangle
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);

		RectangleX rec1 = new RectangleX();
		System.out.println("첫번째 직사각형의 색깔 : ");
		rec1.setColor(keyboard.next());

		System.out.println("첫번째 직사각형의 가로 : ");
		rec1.setWidth(keyboard.nextInt());

		System.out.println("첫번째 직사각형의 세로 : ");
		rec1.setLength(keyboard.nextInt());

		RectangleX rec2 = new RectangleX();
		System.out.println("두번째 직사각형의 색깔 : ");
		rec2.setColor(keyboard.next());

		System.out.println("두번째 직사각형의 가로 : ");
		rec2.setWidth(keyboard.nextInt());

		System.out.println("두번째 직사각형의 세로 : ");
		rec2.setLength(keyboard.nextInt());

		// test block 
		System.out.println();
		System.out.println("입력하신 1번, 2번 직사각형 정보입니다.");
		System.out.println("1 -  [색상] : " +rec1.color+",  [가로] : " +rec1.width+ ",  [세로] : " +rec1.length);
		System.out.println("1 -  [넓이] : " +rec1.area()+ ",  [둘레] : " +rec1.perimeter());
		System.out.println();
		System.out.println("2 -  [색상] : " +rec2.color+",  [가로] : " +rec2.width+ ",  [세로] : " +rec2.length);
		System.out.println("2 -  [넓이] : " +rec2.area()+ ",  [둘레] : " +rec2.perimeter());
		System.out.println();
		
		System.out.println(rec1.getColor()+" 직사각형 넓이는 "+rec1.area()+"이고 둘레는 " +rec1.perimeter()+ " 입니다.");
		System.out.println(rec2.getColor()+" 직사각형 넓이는 "+rec2.area()+"이고 둘레는 " +rec2.perimeter()+ " 입니다.");



		// 두 직사각형의 넓이를 비교하시오
		int areaTemp = rec1.area()-rec2.area();
  		if (areaTemp > 0){
			System.out.println("넓이는 "+rec1.getColor()+" 직사각형이 "+rec2.getColor()+" 직사각형 보다 "+areaTemp+" 더 넓습니다.");
			
		} else if (areaTemp < 0){
			areaTemp *= -1;
			System.out.println("넓이는 "+rec2.getColor()+" 직사각형이 "+rec1.getColor()+" 직사각형 보다 "+areaTemp+" 더 넓습니다.");
		
		} else {
			System.out.println("넓이는 "+rec1.getColor()+" 직사각형과 "+rec2.getColor()+" 직사각형이 같습니다.");
		}		
		
		// 두 직사각형의 둘레를 비교하시오
		int areaPeri = rec1.perimeter()-rec2.perimeter();
  		if (areaPeri > 0){
			System.out.println("둘레는 "+rec1.getColor()+" 직사각형이 "+rec2.getColor()+" 직사각형 보다 "+areaPeri+" 더 깁니다.");
			
		} else if (areaPeri < 0){
			areaPeri *= -1;
			System.out.println("둘레는 "+rec2.getColor()+" 직사각형이 "+rec1.getColor()+" 직사각형 보다 "+areaPeri+" 더 깁니다.");
		
		} else {
			System.out.println("둘레는 "+rec1.getColor()+" 직사각형과 "+rec2.getColor()+" 직사각형이 같습니다.");
		}	
	}
}

class RectangleX {

	int width;
	int length;
	String color;

	public RectangleX (){
		this.width = 0;
	    this.length = 0;
	    this.color = "";	
	}

	public void setWidth(int width){
		this.width = width;
	}

	public int getWidth(){
		return this.width;	
	}

	public void setLength(int length){
		this.length = length;
	}

	public int getLength(){
		return this.length;	
	}

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return this.color;	
	}

	public int area(){
		return width * length;
	}

	public int perimeter(){
		return width*2 + length*2;
	}
}