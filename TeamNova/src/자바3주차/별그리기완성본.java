package �ڹ�3����;

public class ���׸���ϼ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Star_Num = 2;
		
		for(int H_First=0; H_First<Star_Num+3; H_First++) //Star�� �Ӹ��κ� Head_First
		{
			for(int H_Second=Star_Num+3; H_Second>H_First; H_Second--) //Head_First for���� ��ø���� Head_Second
			{
				System.out.print("  ");
			}
			for(int i =0; i<1; i++)
			{
				System.out.print(" ");
			}
			for(int H_Third=0; H_Third<H_First; H_Third++) // Third
			{
				if(H_Third!=Star_Num+3)						// ��øfor�� Third�� Num+3�� �ƴҽ� ���� ��� , ���� +3 ���� -1�� ǥ���ϱ����� ��� (����ǥ��)
				System.out.print("  ");
			}
			for(int H_Four=Star_Num+3; H_Four>H_First; H_Four--) //Four
			{
				
				if(H_Four!=H_First+1)							// Four�� First+1�� �ƴҽ� ���� ��� , ���� +3 ���� -1�� ǥ���ϱ����� ��� (���� ǥ��)
				{
					System.out.print(" "); 
				}
			}
			for(int H_Five=0; H_Five<H_First ; H_Five++)  // Five
			{
				System.out.print("aa");
			}
			if(H_First==0)	//����� �ϳ� ����ϱ� ���ؼ� if�� ���
			{
				System.out.print("a");
			}
			System.out.println("");
		}

		for(int q = 0 ; q<Star_Num+2 ; q++) //����
		{	
			
			for(int w = 0 ; w<q+3 ; w++)
			{
				System.out.print(" ");
			}
			for(int g= 0; g<q; g++)
			{
				if(q!=0) //���� +3 ���� +2 ���
				{
					System.out.print("aaaa");	
				}
			}		
			for(int e = Star_Num+2; e>q ; e--)
			{
				System.out.print("aaaaaa");
								
			}

			System.out.println("");
	}
		
		for(int a = 0 ; a<Star_Num+4 ; a++) //�ٸ�
		{

			for(int b = Star_Num+4 ; b>a ; b--)
			{
				System.out.print(" ");
			}
			for(int c = Star_Num+4 ; c>a ; c--) 
			{
				System.out.print("a"); 			
			}
			for(int c = Star_Num ; c>a ; c--) 
			{
				System.out.print("a"); 			
			}
			

			for(int k=0; k<1; k++) //ù��° ����ǥ��
			{
				System.out.print("  ");
				
			}
			
			for(int j =0 ; j<a ; j++) //Star_Num���ڸ�ŭ �ݺ����� ex) Star_Num�� 1�϶�  2��°�� �ѹ��ݺ�, Star_Num 2�϶� 2,3��°�� �ݺ�
			{
				if(a<=Star_Num) 
				{
					System.out.print("      ");
				}
				
			}
			for(int p =0 ; p<Star_Num ; p++) //������ 2��°�ٺ��� 4����
			{
				if(a>Star_Num)
				{
					System.out.print("      ");	
				}
				
			}
			
			for(int p = Star_Num+1 ; p<=a ; p++) //������ 2��°�ٺ��� 4����
			{
				System.out.print("    ");
			}
			

			for(int g = Star_Num+4 ; g>a ; g--) 
			{
				System.out.print("a"); 			
			}
			for(int c = Star_Num ; c>a ; c--) 
			{
				System.out.print("a"); 			
			}
			
			
			System.out.println("");
		}
	}

}
