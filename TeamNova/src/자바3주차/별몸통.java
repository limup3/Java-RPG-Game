package �ڹ�3����;

public class ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =1;

		for(int q = 0 ; q<num+2 ; q++) //����
		{	
			
			for(int w = 0 ; w<q ; w++)
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
			for(int e = num+2; e>q ; e--)
			{
				System.out.print("aaaaaa");
								
			}

			System.out.println("");
	}
		for(int q = 0 ; q<num ; q++) //���� �ڿ��κ�
		{	
			
			for(int w = num ; w>q ; w--)
			{
				System.out.print(" ");
			}
			for(int g= num; g>q; g--)
			{
				if(q!=num)
				{
					System.out.print("aaaa");	
				}
				
			}		
			for(int e = 0; e<=q+1 ; e++)
			{
				System.out.print("aaaaaa");
								
			}

			System.out.println("");
	}
		
/*		for(int q = 0 ; q<num+4 ; q++) //����
		{	

			if(q == num+2)
			{

				break;
			}
		
			for(int w = 0 ; w<q ; w++)
			{
				System.out.print(" ");
			}
			for(int e = num+1; e>q ; e--)
			{
				System.out.print("a");
				
			}
			for(int r = num+1 ; r>q ; r--)
			{
				System.out.print("b");
			}
			

			System.out.println("aaa");
	}
	*/
	}
}
