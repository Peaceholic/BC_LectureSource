package spring.service.dice.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import spring.service.dice.play.Player02;

public class DiceTestAppUseSpring {

	/// main method
	public static void main(String[] args) {
		
		//1. BeanFactory �� �̿� xml �� ���������� ����� instance ���� ȹ��
		BeanFactory factory =
				new XmlBeanFactory( new FileSystemResource("./src/main/resources/config/diceservice.xml") );

		//2. Container �� ���� instance return �ޱ�  
		Player02 player01 = (Player02)factory.getBean("player01");
		player01.playDice(3);
		System.out.println("===================");
		System.out.println("�ֻ��� ������ : "+player01.getTotalValue());
		System.out.println("===================\n\n");
		
		Player02 player02 = (Player02)factory.getBean("player02");
		player02.playDice(3);
		System.out.println("===================");
		System.out.println("�ֻ��� ������ : "+player02.getTotalValue());
		System.out.println("===================\n\n");
		
		Player02 player03 = (Player02)factory.getBean("player03");
		player03.playDice(3);
		System.out.println("===================");
		System.out.println("�ֻ��� ������ : "+player03.getTotalValue());
		System.out.println("===================\n\n");
		
		Player02 player04 = (Player02)factory.getBean("player04");
		player04.playDice(3);
		System.out.println("===================");
		System.out.println("�ֻ��� ������ : "+player04.getTotalValue());
		System.out.println("===================\n\n");
		
	}
	
}//end of class