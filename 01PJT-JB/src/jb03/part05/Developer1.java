package jb03.part05;

/*:
 ����Ȱ����, ������ �����ϴ� ȫ�浿�� Object Modeling
 1. ȫ�浿�� ���ȭ ������ �� : attribute ==> Field
 2. ������ �ش��ϴ� ����      : behavior ==> Method

 �߰����� ����( Polymorphism ���� >> Method OverLoading )
 3. ������ project �� name �� ǥ�� �� �� �ִ� ���� �߰�
 4. ���� ���� ���� income �� ������ ��� �� �� �ִ� ���� �߰�
*/
public class Developer1{

    //Field==>Ư��,�Ӽ�(attribute) ǥ��
    String name = "ȫ�浿";
    String job = "������ ";
    int avglncome = 100;
    int projectCareer; // Field ���� �� ��� �ʱ�ȭ ������ ?

    //Method==>���,����(behavior) ǥ��
    /*
    project �� �����Ͽ� ������ ���� �� ����� ������ ��Ÿ���� method
    1. income  1 ����
    2. projectCareer 1 ����
    */
        
    public void participateProject(){
        System.out.println("���α׷����߷� ��������,��½���");
        avglncome++;
        projectCareer++;
    }

    /*  �߰��� method(OverLoading Method )
     project �� �����Ͽ� ������ ���� �� ����� ������ ��Ÿ���� method
     1. income �� 1����
     2. projectCareer 18)
        ���� �� ���� project �� name�� �����ִ� ����
     */

     public void participateProject(String project){
        System.out.println(project +"==> project ������ ��������, ��½���");
        avglncome++;
        projectCareer++;
     }
     /*
      ���Ǹ� ���ؼ����� ����
      1. income �� 1����
     */
    
      public void instruct(){
        System.out.println("���Ǹ����� ��������");
        avglncome++;
      }

    /*  �߰��� method(OverLoading Method )
      ���Ǹ� ���ؼ����� ����
      1. income �� 1����
     */

     public void instruct(int lectureCount){
        System.out.println(lectureCount+" �� ���Ǹ� ���� ����");
        avglncome += lectureCount;     
     }
}