package 클래스;


public class Life {

	
	//필드
		int MaxHp;  // 최대체력
		int Hp; // 현재체력
		int Power; // 공격력
		int Depense; // 방어력
		String Name; // 이름
		int Gold; // 소지한 골드

		
	/*	public int Attack() {
			return Power; // 리턴값을 돌려준다.
		}*/
		public int Attack() { // 기본공격
			System.out.println("");
			System.out.println(""+Power+"의 피해를 입혔습니다.");
			System.out.println("");
			return Power;
		}
		
		public void Attacked(int sum) { //공격 받는 함수
			//방어력이 받은 데미지보다 큰 경우
			if(Depense >= sum)
				Hp=Hp-0;
			else
				Hp = Hp+Depense-sum;
		}

}
