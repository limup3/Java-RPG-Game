package 자바3주차;

public class 별그리기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int num = 5; //다리

	for(int a = 0 ; a<num+1 ; a++)
	{

		for(int b = 0 ; b<num+1 ; b++)
		{
			System.out.print(" ");
		}
		for(int c = num+2 ; c>a ; c--) 
		{
			System.out.print("a"); 			
		}

		for(int e = 0 ; e<a+1 ; e++)
		{
			System.out.print(" ");
		}
		for(int f = 0 ; f<a ; f++)
		{
			System.out.print(" ");
		}
		for(int g = num+2 ; g>a ; g--) 
		{
			System.out.print("a"); 			
		}
		
		
		System.out.println("");
	}
	for(int z = 0 ; z<1 ; z++)
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
 }
	
}
