package Ŭ����;

public class MyThread implements Runnable {

	String str[]; // ���ڿ� �޾ƿ���
	int a; // ���� �ð� �޾ƿ���
	public MyThread(String str[], int a) {
		this.str = str;
		this.a = a;
	}
	
	
	public void run() {
		for( int i = 0 ; i<str.length ; i++)
		{
			System.out.println(str[i]);
			
			try {
				Thread.sleep(a);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
