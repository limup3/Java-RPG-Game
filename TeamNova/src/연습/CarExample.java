package ����;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��ü ����
		Car myCar = new Car();
        // Ŭ����    ����            Ŭ����	
		//�ʵ尪 �б�
				System.out.println("����ȸ��: " + myCar.company);
				System.out.println("�𵨸�: " + myCar.model);
				System.out.println("����:" + myCar.color);
				System.out.println("�ְ�ӵ�: " + myCar.maxSpeed);
				System.out.println("����ӵ�: " + myCar.speed);
				
				//�ʵ尪 ����
				myCar.speed = 60;
				System.out.println("������ �ӵ� :" + myCar.speed);
/*
		Car myCar = new Car("�׷���", "����", 300);
		
		System.out.println("");
		
	
		
		
		
		
  		//�����
		����ȸ��: �����ڵ���
		�𵨸�: �׷���
		����:����
		�ְ�ӵ�: 350
		����ӵ�: 0
		������ �ӵ� :60
*/


	
	}

}
