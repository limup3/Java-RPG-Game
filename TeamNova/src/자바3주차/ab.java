package �ڹ�3����;

import java.util.Scanner;

public class ab {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
	/*	final String id = "Hello"; 
		final String pw = "1111"; 
		String pid, ppw; 
		do { 
		  System.out.print("���̵� : "); 
		  pid = scanner.nextLine(); 
		  System.out.print("��ȣ : "); 
		  ppw = scanner.nextLine(); 
		  if (id.equals(pid) && pw.equals(ppw)) { 
		    System.out.println("�α��� ����"); 
		    break; 
		    } else { 
		    System.out.println("��ġ���� �ʽ��ϴ�."); 
		 } 
		} while (true); */
		
		
	do {
		int Num3 = scanner.nextInt();
		if(Num3 ==1)
		{
			System.out.println("1");
			break;
		}
		else if(Num3 ==2 )
		{
			System.out.println("2");
			break;
		}
		else {
			System.out.println("��ġx");
		}
		
	} while(true);
	
	System.out.println("ab");
	
	
	}
}
