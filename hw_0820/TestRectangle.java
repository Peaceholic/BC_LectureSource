import java.util.Scanner;
//import c.modeling.ex01.ans.Rectangle;

public class TestRectangle
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);

		RectangleX rec1 = new RectangleX();
		System.out.println("ù��° ���簢���� ���� : ");
		rec1.setColor(keyboard.next());

		System.out.println("ù��° ���簢���� ���� : ");
		rec1.setWidth(keyboard.nextInt());

		System.out.println("ù��° ���簢���� ���� : ");
		rec1.setLength(keyboard.nextInt());

		RectangleX rec2 = new RectangleX();
		System.out.println("�ι�° ���簢���� ���� : ");
		rec2.setColor(keyboard.next());

		System.out.println("�ι�° ���簢���� ���� : ");
		rec2.setWidth(keyboard.nextInt());

		System.out.println("�ι�° ���簢���� ���� : ");
		rec2.setLength(keyboard.nextInt());

		// test block 
		System.out.println();
		System.out.println("�Է��Ͻ� 1��, 2�� ���簢�� �����Դϴ�.");
		System.out.println("1 -  [����] : " +rec1.color+",  [����] : " +rec1.width+ ",  [����] : " +rec1.length);
		System.out.println("1 -  [����] : " +rec1.area()+ ",  [�ѷ�] : " +rec1.perimeter());
		System.out.println();
		System.out.println("2 -  [����] : " +rec2.color+",  [����] : " +rec2.width+ ",  [����] : " +rec2.length);
		System.out.println("2 -  [����] : " +rec2.area()+ ",  [�ѷ�] : " +rec2.perimeter());
		System.out.println();
		
		System.out.println(rec1.getColor()+" ���簢�� ���̴� "+rec1.area()+"�̰� �ѷ��� " +rec1.perimeter()+ " �Դϴ�.");
		System.out.println(rec2.getColor()+" ���簢�� ���̴� "+rec2.area()+"�̰� �ѷ��� " +rec2.perimeter()+ " �Դϴ�.");



		// �� ���簢���� ���̸� ���Ͻÿ�
		int areaTemp = rec1.area()-rec2.area();
  		if (areaTemp > 0){
			System.out.println("���̴� "+rec1.getColor()+" ���簢���� "+rec2.getColor()+" ���簢�� ���� "+areaTemp+" �� �н��ϴ�.");
			
		} else if (areaTemp < 0){
			areaTemp *= -1;
			System.out.println("���̴� "+rec2.getColor()+" ���簢���� "+rec1.getColor()+" ���簢�� ���� "+areaTemp+" �� �н��ϴ�.");
		
		} else {
			System.out.println("���̴� "+rec1.getColor()+" ���簢���� "+rec2.getColor()+" ���簢���� �����ϴ�.");
		}		
		
		// �� ���簢���� �ѷ��� ���Ͻÿ�
		int areaPeri = rec1.perimeter()-rec2.perimeter();
  		if (areaPeri > 0){
			System.out.println("�ѷ��� "+rec1.getColor()+" ���簢���� "+rec2.getColor()+" ���簢�� ���� "+areaPeri+" �� ��ϴ�.");
			
		} else if (areaPeri < 0){
			areaPeri *= -1;
			System.out.println("�ѷ��� "+rec2.getColor()+" ���簢���� "+rec1.getColor()+" ���簢�� ���� "+areaPeri+" �� ��ϴ�.");
		
		} else {
			System.out.println("�ѷ��� "+rec1.getColor()+" ���簢���� "+rec2.getColor()+" ���簢���� �����ϴ�.");
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