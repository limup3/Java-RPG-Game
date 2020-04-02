package 자바3주차;

import java.util.Scanner;

public class 마름모그리기3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] Small = {"  ."," ...","  ."}; // 마름모 작은크기
		String[] Medium = {"  ."," ...","....."," ...","  ."}; // 마름모 중간크기
		String[] Large = {"   .","  ..."," .....","......."," .....","  ...","   ."}; // 마름모 큰크기
		
		System.out.println("마름모 크기");
		System.out.println("1. Small / 2. Medium / 3. Large");
		
		Scanner sc = new Scanner(System.in);
		
		String Rhombus = sc.nextLine();
		
		int Rhombus_Num = Integer.parseInt(Rhombus);
		
		if(Rhombus_Num == 1) //마름모 작은크기
		{
			for(int i = 0; i <Small.length; i++ )
			{
				System.out.println(Small[i]);
			}
				
		}
		else if(Rhombus_Num == 2) // 마름모 중간크기
		{
			for(int i = 0; i <Medium.length; i++ )
			{
				System.out.println(Medium[i]);
			}
		}
		
		else if(Rhombus_Num == 3) // 마름모 큰크기
		{
			for(int i = 0; i <Large.length; i++ )
			{
				System.out.println(Large[i]);
			}
			
		}
		else {
			System.out.println("잘못누르셨습니다.");
		}
	}

}
