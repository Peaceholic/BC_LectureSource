package jb03.part03;

public class DeveloperTest  
{

	public static void main (String[] args)
    {
		Developer developer = new Developer();

		System.out.println("이름 : "+developer.name);
		System.out.println("직업 : "+developer.job);
		System.out.println("평균수입 : "+developer.avgIncome);
		System.out.println("PJT경력 : "+developer.projectCareer);

		System.out.println("===========================");

		developer.participateProject();
		System.out.println("평균수입 : "+developer.avgIncome);
		System.out.println("PJT경력 : "+developer.projectCareer);

		developer.instruct();
		System.out.println("평균수입 : "+developer.avgIncome);
	}
}
