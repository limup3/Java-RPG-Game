package �ڹ�3����;

public class ���ٸ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1;
		for(int a = 0 ; a<num+4 ; a++) //�ٸ�
		{

			for(int b = num+4 ; b>a ; b--)
			{
				System.out.print(" ");
			}
			for(int c = num+4 ; c>a ; c--) 
			{
				System.out.print("a"); 			
			}
			for(int c = num ; c>a ; c--) 
			{
				System.out.print("a"); 			
			}
			

			for(int k=0; k<1; k++) //ù��° ����ǥ��
			{
				System.out.print("  ");
				
			}
			
			for(int j =0 ; j<a ; j++) //num���ڸ�ŭ �ݺ����� ex) num�� 1�϶�  2��°�� �ѹ��ݺ�, num 2�϶� 2,3��°�� �ݺ�
			{
				if(a<=num) 
				{
					System.out.print("      ");
				}
				
			}
			for(int p =0 ; p<num ; p++) //������ 2��°�ٺ��� 4����
			{
				if(a>num)
				{
					System.out.print("      ");	
				}
				
			}
			
			for(int p = num+1 ; p<=a ; p++) //������ 2��°�ٺ��� 4����
			{
				System.out.print("    ");
			}
			

			for(int g = num+4 ; g>a ; g--) 
			{
				System.out.print("b"); 			
			}
			for(int c = num ; c>a ; c--) 
			{
				System.out.print("b"); 			
			}
			
			
			System.out.println("");
		}

		/*
		for(int a = 0 ; a<num+3 ; a++) //�ٸ� 0827 4��21�� ������
		{

			for(int b = num+3 ; b>a ; b--)
			{
				System.out.print(" ");
			}
			for(int c = num+3 ; c>a ; c--) 
			{
				System.out.print("a"); 			
			}
			for(int c = num ; c>a ; c--) 
			{
				System.out.print("a"); 			
			}
			

			for(int e = 0 ; e<=a ; e++)
			{
				if(a==0)
				{
					System.out.print("  ");					
				}
				else if(a!=0)
				{
					System.out.print("    ");
				}
			}
			

			for(int g = num+3 ; g>a ; g--) 
			{
				System.out.print("b"); 			
			}
			for(int c = num ; c>a ; c--) 
			{
				System.out.print("b"); 			
			}
			
			
			System.out.println("");
		} */
		
/*		for(int z = 0 ; z<1 ; z++) //�ٸ� �������κ�
		{
			for(int x = 0 ; x<num ; x++)
			{
				System.out.print(" ");
			}
			for(int v = 0 ; v<1 ; v++)
			{
				System.out.print("a");
			}
			for(int Q = 0 ; Q<num+2 ; Q++)
			{
				System.out.print(" ");
			}
			for(int W = 0 ; W<num+2 ; W++)
			{
				System.out.print(" ");
			}

			System.out.print(" a");
		}
		
		*/
	}

}
