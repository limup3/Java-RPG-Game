package 자바3주차;

public class 별머리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int Star_Num = 2;

for(int H_First=0; H_First<Star_Num+3; H_First++) //Star의 머리부분 Head_First
{
	for(int H_Second=Star_Num+2; H_Second>H_First; H_Second--) //Head_First for문의 중첩포문 Head_Second
	{
		System.out.print("  ");
	}
	for(int H_Third=0; H_Third<H_First; H_Third++) // Third
	{
		if(H_Third!=Star_Num+3)						// 중첩for문 Third가 Num+3이 아닐시 공백 출력 , 가로 +3 세로 -1을 표현하기위해 사용 (가로표현)
		System.out.print("  ");
	}
	for(int H_Four=Star_Num+3; H_Four>H_First; H_Four--) //Four
	{
		
		if(H_Four!=H_First+1)							// Four이 First+1이 아닐시 공백 출력 , 가로 +3 세로 -1을 표현하기위해 사용 (세로 표현)
		{
			System.out.print(" "); 
		}
	}
	for(int H_Five=0; H_Five<H_First ; H_Five++)  // Five
	{
		System.out.print("aa");
	}
	if(H_First==0)	//꼭대기 하나 출력하기 위해서 if문 사용
	{
		System.out.print("a");
	}
	System.out.println("");
}
				
/*		for(int i = 0; i<num+2 ; i++) // 머리
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
			System.out.println("a"); // 머리
			
			
		}
		*/
	}

}
