package �ڹ�3����;

public class ����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Star_Num= 3;
		
		for(int Leg = 0 ; Leg<Star_Num+4 ; Leg++) //�ٸ� Leg
		{

			for(int L_Blank = Star_Num+4 ; L_Blank>Leg ; L_Blank--) // ���� 1���� ����
			{
				System.out.print(" ");
			}

			for(int L_Left = Star_Num+4 ; L_Left>Leg ; L_Left--)  //Num+4���� 1���� ����
			{
				System.out.print("a"); 			
			}

			for(int L_Left2 = Star_Num ; L_Left2>Leg ; L_Left2--) //Num���� 1�������� 
			{
				System.out.print("a"); 			
			}
			
			for(int L_Blank=0; L_Blank<1; L_Blank++) //ù��° ����ǥ��
			{
				System.out.print("  ");
				
			}	
			for(int L_Blank2 =0 ; L_Blank2<Leg ; L_Blank2++) //Star_Num���ڸ�ŭ �ݺ�����                           ex) Star_Num�� 1�϶�  2��°�� �ѹ��ݺ�, Star_Num 2�϶� 2,3��°�� �ݺ�
			{
				if(Leg<=Star_Num) 
				{
					System.out.print("      ");
				}
				
			}
			for(int L_Blank3 =0 ; L_Blank3<Star_Num ; L_Blank3++) //������ 2��°�ٺ��� 4����
			{
				if(Leg>Star_Num)
				{
					System.out.print("      ");	
				}
				
			}		
			for(int L_Blank4 = Star_Num+1 ; L_Blank4<=Leg ; L_Blank4++) //������ 2��°�ٺ��� 4����
			{
				System.out.print("    ");
			}
			

			for(int L_Right = Star_Num+4 ; L_Right>Leg ; L_Right--) 
			{
				System.out.print("a"); 			
			}
			for(int L_Right2 = Star_Num ; L_Right2>Leg ; L_Right2--) 
			{
				System.out.print("a"); 			
			}
			
			
			System.out.println("");
		}
	}

	}

