package �ڹ�3����;

public class ���Ӹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int Star_Num = 2;

for(int H_First=0; H_First<Star_Num+3; H_First++) //Star�� �Ӹ��κ� Head_First
{
	for(int H_Second=Star_Num+2; H_Second>H_First; H_Second--) //Head_First for���� ��ø���� Head_Second
	{
		System.out.print("  ");
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
				
/*		for(int i = 0; i<num+2 ; i++) // �Ӹ�
		{
			for(int j = num+4; j>i ; j--)
			{
				System.out.print(" ");
			}
			for(int k = 0; k<i ; k++)
			{
				System.out.print("a");
			}
			for(int p = 0; p<i ; p++)
			{
				System.out.print("a");
			}
			System.out.println("a"); // �Ӹ�
			
			
		}
		*/
	}

}
