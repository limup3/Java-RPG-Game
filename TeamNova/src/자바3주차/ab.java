package 자바3주차;

import java.util.Scanner;

public class ab {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
	/*	final String id = "Hello"; 
		final String pw = "1111"; 
		String pid, ppw; 
		do { 
		  System.out.print("아이디 : "); 
		  pid = scanner.nextLine(); 
		  System.out.print("암호 : "); 
		  ppw = scanner.nextLine(); 
		  if (id.equals(pid) && pw.equals(ppw)) { 
		    System.out.println("로그인 성공"); 
		    break; 
		    } else { 
		    System.out.println("일치하지 않습니다."); 
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
			System.out.println("일치x");
		}
		
	} while(true);
	
	System.out.println("ab");
	
	
	}
}
