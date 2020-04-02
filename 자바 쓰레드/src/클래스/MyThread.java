package 클래스;

public class MyThread implements Runnable {

	String str[]; // 문자열 받아오기
	int a; // 슬립 시간 받아오기
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
