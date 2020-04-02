package 자바2주차;
import java.util.Scanner; // Scanner라는 클래스 불러오기

public class 조건문과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("(당신은 현재 집에서 무엇을 하고있습니까?)"); //문장 시작
		System.out.println("");
		System.out.println("1. 침대에 누워 있다. / 2. 공부하고 있다. / "
				+ "3. 게임하고 있다. / 4. 자고있다. / 5. 밥먹고 있다. / 6. 기타 ");
		System.out.println("");
		
		Scanner sc = new Scanner(System.in); // Scanner의 객체생성 sc(scan)이라는 변수선언 
		
		String doing_input = sc.nextLine(); // doing_input(현재 하고있는행동)이란 변수에 sc에서 입력받은 수치 저장
		
		int first_num = Integer.parseInt(doing_input); // doning_input이란 스트링을 first_num(첫번째 조건문) 인트로 변환
		
		if(first_num == 1) { //조건문 시작
			
			System.out.println("침대에 누워있다.");
			System.out.println("");
			
			System.out.println("(침대에 누워있으시군요).");
			System.out.println("(무언가를 먹고싶지 않으세요?)");
			System.out.println("");
			System.out.println("1. 먹고싶다. / 2. 아무생각이 없다.");
			String seat_input = sc.nextLine(); // seat_input = 침대에 누워있는 변수명
			int first_num_seat = Integer.parseInt(seat_input); // first_num_seat = 첫번째 조건문 안에 seat의 중첩조건문
	
			if(first_num_seat == 1) {
				System.out.println("먹고싶다.");
				System.out.println("");
				System.out.println("(그럼 편의점으로 갑시다~)"); //다음조건문으로 진행
			}
			else if(first_num_seat == 2) {
				System.out.println("아무생각이 없다."); 
				System.out.println("");
				System.out.println("(아무생각이 없으시군요.)");
				System.out.println("(그래도 편의점에 가보시는건 어떠신가요?)"); //되묻기
				System.out.println("");
				System.out.println("1. 편의점에 갈까? / 2. 아무생각이 없다.");
				String again_input = sc.nextLine(); //again_input = 다시묻는 변수명
				int first_num_seat2 = Integer.parseInt(again_input); //first_num_seat2 = seat의 중첩조건문
				if(first_num_seat2 == 1) {
					System.out.println("편의점에 갈까?");
					System.out.println("");
					System.out.println("(그럼 편의점으로 갑시다~)"); //다음조건문으로 진행
					
				}
				else if(first_num_seat2 == 2) { 
					System.out.println("아무생각이 없다.");
					System.out.println("");
					System.out.println("(네 알겠습니다.)");
					return; //retrun을 이용하여 종료
				}
				else {
					System.out.println("잘못누르셨습니다.");
					return; ////retrun을 이용하여 종료
				}
			}
		}
		else if(first_num == 2) { //doing_input의 2번째 과정
			System.out.println("공부하고 있다.");
			System.out.println("");
			System.out.println("(공부하고 있군요)");
			System.out.println("(편의점에 가고싶지않으세요?)");
			System.out.println("");
			System.out.println("1. 가고싶다. /2. 가고싶지 않다.");
			
			
			String study_input = sc.nextLine(); //study_input = 공부하는 행위 변수선언
			int first_num_study = Integer.parseInt(study_input); //first_num_study = 첫번째 조건문 안에 study의 중첩조건문
			
			if(first_num_study == 1) {
				System.out.println("가고싶다.");
				System.out.println("");
				System.out.println("(그럼 편의점으로 갑시다~)"); //다음조건문으로 진행
			}
			else if(first_num_study == 2) {
				System.out.println("가고싶지 않다.");
				System.out.println("");
				System.out.println("(네 알겠습니다.)");
				return; //retrun을 이용하여 종료
			}
			else {
				System.out.println("잘못누르셨습니다.");
				return; //retrun을 이용하여 종료
			}
		}
		else if(first_num == 3) { // doing_input의 3번째 과정
			System.out.println("게임하고 있다.");
			System.out.println("");
			System.out.println("(게임하고 있군요.)");
			System.out.println("(편의점에 가고싶지않으세요 ?)");
			System.out.println("");
			System.out.println("1. 가고싶다. /2. 가고싶지 않다.");
			
			String game_input = sc.nextLine(); //game_input = 공부하는 행위 변수선언
			int first_num_game = Integer.parseInt(game_input); //first_num_game = 첫번째 조건문 안에 game의 중첩조건문
			
			if(first_num_game == 1) {
				System.out.println("가고싶다.");
				System.out.println("");
				System.out.println("(그럼 편의점으로 갑시다~)"); //다음조건문으로 진행
				
			}
			else if(first_num_game == 2) {
				System.out.println("가고싶지 않다.");
				System.out.println("");
				System.out.println("(네 알겠습니다.)");
				return; //retrun을 이용하여 종료
			}
			else {
				System.out.println("잘못누르셨습니다.");
				return; //retrun을 이용하여 종료
			} 
		}
		else if(first_num == 4) { // doing_input의 4번째 과정
			System.out.println("자고있다.");
			System.out.println("");
			System.out.println("(자고 있군요.)");
			System.out.println("(편의점에 가고싶지않으세요 ?)");
			System.out.println("");
			System.out.println("1. 가고싶다. /2. 가고싶지 않다.");
			
			String sleep_input = sc.nextLine(); //sleep_input = 자는 행위 변수선언
			int first_num_sleep = Integer.parseInt(sleep_input); //first_num_sleep = 첫번째 조건문 안에 game의 중첩조건문
			
			if(first_num_sleep == 1) {
				System.out.println("가고싶다.");
				System.out.println("");
				System.out.println("(그럼 편의점으로 갑시다~)"); //다음조건문으로 진행
				
			}
			else if(first_num_sleep == 2) {
				System.out.println("가고싶지 않다.");
				System.out.println("");
				System.out.println("(네 알겠습니다.)");
				return; //retrun을 이용하여 종료
			}
			else {
				System.out.println("잘못누르셨습니다.");
				return; //retrun을 이용하여 종료
			}
		}
		else if(first_num == 5) { // doing_input의 5번째 과정
			System.out.println("밥먹고 있다.");
			System.out.println("");
			System.out.println("(밥먹고있군요.)");
			System.out.println("(밥 먹고나서 편의점에 가고싶지않으세요 ?)");
			System.out.println("");
			System.out.println("1. 가고싶다. /2. 가고싶지 않다.");
			
			String meal_input = sc.nextLine(); //meal_input = 먹는 행위 변수선언
			int first_num_meal = Integer.parseInt(meal_input); //first_num_meal = 첫번째 조건문 안에 meal의 중첩조건문
			
			if(first_num_meal == 1) {
				System.out.println("가고싶다.");
				System.out.println("");
				System.out.println("(그럼 편의점으로 갑시다~)"); //다음조건문으로 진행
				
			}
			else if(first_num_meal == 2) {
				System.out.println("가고싶지 않다.");
				System.out.println("");
				System.out.println("(네 알겠습니다.)");
				return; //retrun을 이용하여 종료
			}
			
			else {
				System.out.println("잘못누르셨습니다.");
				return; //retrun을 이용하여 종료
			}
		
		}
		else if(first_num == 6) { // doing_input의 6번째 과정
			System.out.println("기타");
			System.out.println("");
			System.out.println("(무언가를 하고있군요.)");
			System.out.println("(편의점에 가고싶지않으세요 ?)");
			System.out.println("");
			System.out.println("1. 가고싶다. /2. 가고싶지 않다.");

			String etc_input = sc.nextLine(); //etc_input = 기타 행위 변수선언
			int first_num_etc = Integer.parseInt(etc_input); //first_num_etc = 첫번째 조건문 안에 etc의 중첩조건문
			
			if(first_num_etc == 1) {
				System.out.println("가고싶다.");
				System.out.println("");
				System.out.println("(그럼 편의점으로 갑시다~)"); //다음조건문으로 진행
				
			}
			else if(first_num_etc == 2) {
				System.out.println("가고싶지 않다.");
				System.out.println("");
				System.out.println("(네 알겠습니다.)");
				return; //retrun을 이용하여 종료
			}
			
			else {
				System.out.println("잘못누르셨습니다.");
				return; //retrun을 이용하여 종료
			}
			
		}
		else {
			System.out.println("잘못누르셨습니다.");
			return; //retrun을 이용하여 종료
		}
		System.out.println("");
		System.out.println("=====================================================");
		System.out.println("=====================================================");
		System.out.println("");
		System.out.println("(편의점은 어디로 갈까요 ?)");
		System.out.println("");
		System.out.println("1. GS25 / 2. 7-Seven / 3. CU / 4. Emart24 / 5. Ministop");
		
		String where_input = sc.nextLine(); //where_input = 어디로갈건지 변수선언
		int second_num = Integer.parseInt(where_input); //second_num = 두번째 조건문 (어디로 갈것인지) 변수선언
		
		if(second_num == 1 ) {
			System.out.println("GS25");
		}
		else if(second_num == 2) {
			System.out.println("7-Seven");
		}
		else if(second_num == 3) {
			System.out.println("CU");
		}
		else if(second_num == 4) {
			System.out.println("Emart24");
		}
		else if(second_num == 5) {
			System.out.println("Ministop");
		}
		else {
			System.out.println("잘못누르셨습니다.");
			return; //retrun을 이용하여 종료
		}
		
		System.out.println("");
		System.out.println("=====================================================");
		System.out.println("=====================================================");
		System.out.println("");
		System.out.println("(편의점까지 어떻게 갈까요 ?)");
		System.out.println("");
		System.out.println("1. 걸어서 간다. / 2. 뛰어간다. / 3. 차타고 간다. / 4. 버스타고 간다. / 5. 지하철 타고 간다.");
		
		String how_input = sc.nextLine(); //how_input = 어떻게갈건지 변수선언
		int third_num = Integer.parseInt(how_input); //third_num = 세번째 조건문 (어떻게 갈것인지) 변수선언
		
		if(third_num == 1 ) {
			System.out.println("걸어서 간다.");
		}
		else if(third_num == 2) {
			System.out.println("뛰어간다.");
		}
		else if(third_num == 3) {
			System.out.println("차타고 간다.");
		}
		else if(third_num == 4) {
			System.out.println("버스타고 간다.");
		}
		else if(third_num == 5) {
			System.out.println("지하철 타고 간다.");
		}
		else {
			System.out.println("잘못누르셨습니다.");
			return; //retrun을 이용하여 종료
		}
		
		System.out.println("");
		System.out.println("=====================================================");
		System.out.println("=====================================================");
		System.out.println("");
		System.out.println("(편의점에 도착하셨습니다. 문을 열까요 ?)");
		System.out.println("");
		System.out.println("1. 문을 연다 / 2. 아니다 볼일이 있다.");
		
		String arrival_input = sc.nextLine(); //arrival_input = 도착 변수선언 
		int four_num = Integer.parseInt(arrival_input); //four_num = 네번째 조건문 (도착) 변수선언
		
		if(four_num == 1) {
			System.out.println("문을연다.");
		}
		else if(four_num == 2) {
			System.out.println("아니다 볼일이 있다.");
			System.out.println("");
			System.out.println("(볼일이 있으시군요.)");
			System.out.println("(어떤 볼일이세요 ?)");
			System.out.println("");
			System.out.println("1. 화장실 가야된다. / 2. 아직 마음의 준비가 안 되어 있다. / 3. 담배펴야 된다. / 4.전화가 왔다. ");
			
			String wait_input = sc.nextLine(); // wait_input = 잠시 볼일이있어서 기다려달라는 변수선언
			int four_num_wait = Integer.parseInt(wait_input); // four_num_wait = 네번째 조건문의 wait 중첩조건문
			
			if(four_num_wait == 1) {
				System.out.println("화장실 가야된다.");
				System.out.println("");
				System.out.println("(화장실은 왼쪽으로 가시면 됩니다. 볼일보시고 편의점으로 오세요.)");
			}
			else if(four_num_wait == 2) {
				System.out.println("아직 마음의 준비가 안 되어 있다.");
				System.out.println("");
				System.out.println("(마음의 준비가 되시면 편의점으로 들어오세요.)");
			}
			else if(four_num_wait == 3) {
				System.out.println("담배펴야 된다.");
				System.out.println("");
				System.out.println("(흡연구역은 오른쪽입니다. 흡연하시고 편의점으로 오세요.)");
			}
			else if(four_num_wait == 4) {
				System.out.println("전화가 왔다.");
				System.out.println("");
				System.out.println("(전화받고 편의점으로 오세요.)");
			}
			else {
				System.out.println("잘못누르셨습니다.");
				return; //return을 이용하여 종료
			}
			
		}
		
		else {
			System.out.println("잘못누르셨습니다.");
			return; //retrun을 이용하여 종료
		}
		
		System.out.println("");
		System.out.println("=====================================================");
		System.out.println("=====================================================");
		System.out.println("");
		System.out.println("(편의점에 문을 열고 들어왔습니다. 무엇을 사실건가요 ?)");
		System.out.println("");
		System.out.println("1. 라면 / 2. 껌 / 3. 햇반 / 4. 냉동식품 / 5. 담배 / 6. 과자 / 7. 음료수 / 8. 아이스크림  / 9. 기타");
		
		String what_input = sc.nextLine(); // what_input = 무엇을 산건지 변수선언
		int five_num = Integer.parseInt(what_input); // five_num = 5번째 조건문
		
		if(five_num == 1 ) {
			System.out.println("라면");
			System.out.println("");
			System.out.println("(컵라면과 봉지라면중 어떤걸 사시겠어요?)");
			System.out.println("");
			System.out.println("1. 컵라면 / 2. 봉지라면");
			
			String ramen_input = sc.nextLine(); // ramen_input = 컵라면과 봉지라면중 어떤라면을 살것인지 변수선언
			int five_num_ramen = Integer.parseInt(ramen_input); // five_num_ramen = 5번째 조건문안에 라면에대한 중첩조건문
			
			if(five_num_ramen == 1) {
				System.out.println("컵라면");
				System.out.println("");
				System.out.println("(컵라면을 사시는군요. 크기는 작은거 큰거 어떤거 사시겠어요?)");
				System.out.println("");
				System.out.println("1. 작은 컵라면 / 2. 큰 컵라면");
				
				String cupramen_input = sc.nextLine(); // cupramen_input = 컵라면 크기중 어떤걸 살것인지 변수선언
				int five_num_cupramen = Integer.parseInt(cupramen_input); // five_num_cupramen = 5번째 조건문안에 컵라면에대한 중첩조건문
				
				if (five_num_cupramen == 1) {
					System.out.println("작은컵라면");
					System.out.println("");
					System.out.println("(작은컵라면을 사시는군요. 라면은 어떤종류 사시겠어요?)");
					System.out.println("");
					System.out.println("1. 신라면 / 2. 열라면 / 3. 삼양라면 / 4. 진라면 / 5. 짜파게티 / 6.꼬꼬면");
					
					String smallcupramen_kind_input = sc.nextLine(); // smallcupramen_input = 작은 컵라면중 어떤 컵라면을 살것인지 변수선언
					int five_num_smallcupramen_kind = Integer.parseInt(smallcupramen_kind_input); // 5번째 조건문 안에 작은컵라면 종류 중첩조건문
					
					if (five_num_smallcupramen_kind == 1) {
						System.out.println("신라면");
					}
					else if (five_num_smallcupramen_kind == 2) {
						System.out.println("열라면");
					}
					else if (five_num_smallcupramen_kind == 3) {
						System.out.println("삼양라면");
					}
					else if (five_num_smallcupramen_kind == 4) {
						System.out.println("진라면");
					}
					else if (five_num_smallcupramen_kind == 5) {
						System.out.println("짜파게티");
					}
					else if (five_num_smallcupramen_kind == 6) {
						System.out.println("꼬꼬면");
					}
					else {
						System.out.println("잘못누르셨습니다.");
						return;
					}
				}
				else if (five_num_cupramen == 2) {
					System.out.println("큰 컵라면");
					System.out.println("");
					System.out.println("(큰컵라면을 사시는군요. 라면은 어떤종류 사시겠어요?)");
					System.out.println("");
					System.out.println("1. 신라면 / 2. 열라면 / 3. 삼양라면 / 4. 진라면 / 5. 짜파게티 / 6.꼬꼬면");
					
					String bigcupramen_kind_input = sc.nextLine(); // smallcupramen_input = 작은 컵라면중 어떤 컵라면을 살것인지 변수선언
					int five_num_bigcupramen_kind = Integer.parseInt(bigcupramen_kind_input); // 5번째 조건문 안에 작은컵라면 종류 중첩조건문
					
					if (five_num_bigcupramen_kind == 1) {
						System.out.println("신라면");
					}
					else if (five_num_bigcupramen_kind == 2) {
						System.out.println("열라면");
					}
					else if (five_num_bigcupramen_kind == 3) {
						System.out.println("삼양라면");
					}
					else if (five_num_bigcupramen_kind == 4) {
						System.out.println("진라면");
					}
					else if (five_num_bigcupramen_kind == 5) {
						System.out.println("짜파게티");
					}
					else if (five_num_bigcupramen_kind == 6) {
						System.out.println("꼬꼬면");
					}
					else {
						System.out.println("잘못누르셨습니다.");
						return;
					}
				}
				else {
					System.out.println("잘못누르셨습니다.");
					return;
				}
			}
			else if(five_num_ramen == 2)  {
				System.out.println("봉지라면");
				System.out.println("");
				System.out.println("(봉지라면을 사시는군요. 낱개와 묶음 중 어떤걸 사시겠어요?)");
				System.out.println("");
				System.out.println("1. 낱개 / 2. 묶음");
				
				String envramen_input = sc.nextLine(); // envramen_input = 봉지라면의 낱개와 묶음중 살것인지 변수선언
				int five_num_envramen = Integer.parseInt(envramen_input); // five_num_cupramen = 5번째 조건문안에 봉지라면에대한 중첩조건문
				
				if (five_num_envramen == 1) {
					System.out.println("낱개");
					System.out.println("");
					System.out.println("(낱개를 사시는군요. 라면은 어떤종류 사시겠어요?)");
					System.out.println("");
					System.out.println("1. 신라면 / 2. 열라면 / 3. 삼양라면 / 4. 진라면 / 5. 짜파게티 / 6.꼬꼬면");
					
					String pieceramen_kind_input = sc.nextLine(); // pieceramen_input = 낱개중 어떤 라면을 살것인지 변수선언
					int five_num_pieceramen_kind = Integer.parseInt(pieceramen_kind_input); // 5번째 조건문 안에 낱개라면의 종류 중첩조건문
					
					if (five_num_pieceramen_kind == 1) {
						System.out.println("신라면");
					}
					else if (five_num_pieceramen_kind == 2) {
						System.out.println("열라면");
					}
					else if (five_num_pieceramen_kind == 3) {
						System.out.println("삼양라면");
					}
					else if (five_num_pieceramen_kind == 4) {
						System.out.println("진라면");
					}
					else if (five_num_pieceramen_kind == 5) {
						System.out.println("짜파게티");
					}
					else if (five_num_pieceramen_kind == 6) {
						System.out.println("꼬꼬면");
					}
					else {
						System.out.println("잘못누르셨습니다.");
						return;
					}
				}
				else if (five_num_envramen == 2) {
					System.out.println("묶음");
					System.out.println("");
					System.out.println("(묶음을 사시는군요. 라면은 어떤종류 사시겠어요?)");
					System.out.println("");
					System.out.println("1. 신라면 / 2. 열라면 / 3. 삼양라면 / 4. 진라면 / 5. 짜파게티 / 6.꼬꼬면");
					
					String packramen_kind_input = sc.nextLine(); // packramen_input = 묶음라면중 어떤 라면을 살것인지 변수선언
					int five_num_packramen_kind = Integer.parseInt(packramen_kind_input); // 5번째 조건문 안에 묶음라면 종류 중첩조건문
					
					if (five_num_packramen_kind == 1) {
						System.out.println("신라면");
					}
					else if (five_num_packramen_kind == 2) {
						System.out.println("열라면");
					}
					else if (five_num_packramen_kind == 3) {
						System.out.println("삼양라면");
					}
					else if (five_num_packramen_kind == 4) {
						System.out.println("진라면");
					}
					else if (five_num_packramen_kind == 5) {
						System.out.println("짜파게티");
					}
					else if (five_num_packramen_kind == 6) {
						System.out.println("꼬꼬면");
					}
					else {
						System.out.println("잘못누르셨습니다.");
						return;
					}
				}
				
			}
			else {
				System.out.println("잘못누르셨습니다.");
				return; // return을 이용하여 종료
			}
			
		}
		else if(five_num == 2) {
			System.out.println("껌");
			System.out.println("");
			System.out.println("(껌을 사시는군요 어떤껌을 살까요?)");
			System.out.println("");
			System.out.println("1. 왓따 / 2. 와우 / 3. ID / 4. 자일리톨 / 5. 센스민트");
			
			String gum_input = sc.nextLine(); // gum_input = 어떤껌을 살것인지 변수선언
			int five_num_gum = Integer.parseInt(gum_input); // 5번째 조건문 안에 껌 종류 중첩조건문
			
			if(five_num_gum == 1) {
				System.out.println("왓따");
			}
			else if(five_num_gum == 2) {
				System.out.println("와우");
			}
			else if(five_num_gum == 3) {
				System.out.println("ID");
			}
			else if(five_num_gum == 4) {
				System.out.println("자일리톨");
			}
			else if(five_num_gum == 5) {
				System.out.println("센스민트");
			}
			else {
				System.out.println("잘못누르셨습니다.");
				return;
			}
		}
		else if(five_num == 3) {
			System.out.println("햇반");
			System.out.println("");
			System.out.println("(햇반을 사시는군요 어떤햇반을 살까요?)");
			System.out.println("");
			System.out.println("1. 이천 명품쌀밥 / 2. 쌀눈가득 햇반 / 3. 검정콩밥 / 4. 흑미밥 / 5. 오곡밥");
			
			String bap_input = sc.nextLine(); // bap_input = 어떤햇반을 살것인지 변수선언
			int five_num_bap = Integer.parseInt(bap_input); // 5번째 조건문 안에 햇반 종류 중첩조건문
			
			if(five_num_bap == 1) {
				System.out.println("이천 명품쌀밥");
			}
			else if(five_num_bap == 2) {
				System.out.println("쌀눈가득 햇반");
			}
			else if(five_num_bap == 3) {
				System.out.println("검정콩밥");
			}
			else if(five_num_bap == 4) {
				System.out.println("흑미밥");
			}
			else if(five_num_bap == 5) {
				System.out.println("오곡밥");
			}
			else {
				System.out.println("잘못누르셨습니다.");
				return;
			}
			
		}
		else if(five_num == 4) {
			System.out.println("냉동식품");
			System.out.println("");
			System.out.println("(냉동식품을 사시는군요 어떤걸 살까요?)");
			System.out.println("");
			System.out.println("1. 만두 / 2. 닭다리 / 3. 족발 / 4. 치킨 / 5. 볶음밥");
			
			String frozen_food_input = sc.nextLine(); // frozen_food_input = 어떤냉동식품을 살것인지 변수선언
			int five_num_frozen_food = Integer.parseInt(frozen_food_input); // 5번째 조건문 안에 냉동식품 종류 중첩조건문
			
			if(five_num_frozen_food == 1) {
				System.out.println("만두");
			}
			else if(five_num_frozen_food == 2) {
				System.out.println("닭다리");
			}
			else if(five_num_frozen_food == 3) {
				System.out.println("족발");
			}
			else if(five_num_frozen_food == 4) {
				System.out.println("치킨");
			}
			else if(five_num_frozen_food == 5) {
				System.out.println("볶음밥");
			}
			else {
				System.out.println("잘못누르셨습니다.");
				return;
			}
		}
		else if(five_num == 5) {
			System.out.println("담배");
			System.out.println("");
			System.out.println("(담배를 사시는군요 어떤걸 살까요?)");
			System.out.println("");
			System.out.println("1. 프렌치블랙 / 2. 프렌치요고 / 3. 말보루레드 / 4. 에쎼체인지 / 5. 마일드세븐");
			
			String smoke_input = sc.nextLine(); // smoke_input = 어떤담배를 살것인지 변수선언
			int five_num_smoke = Integer.parseInt(smoke_input); // 5번째 조건문 안에 담배 종류 중첩조건문 
			
			if(five_num_smoke == 1) {
				System.out.println("프렌치블랙");
			}
			else if(five_num_smoke == 2) {
				System.out.println("프렌치요고");
			}
			else if(five_num_smoke == 3) {
				System.out.println("말보루레드");
			}
			else if(five_num_smoke == 4) {
				System.out.println("에쎼체인지");
			}
			else if(five_num_smoke == 5) {
				System.out.println("마일드세븐");
			}
			else {
				System.out.println("잘못누르셨습니다.");
				return;
			}
		}
		else if(five_num == 6) {
			System.out.println("과자");
			System.out.println("");
			System.out.println("(과자를 사시는군요 어떤걸 살까요?)");
			System.out.println("");
			System.out.println("1. 썬칩 / 2. 스윙칩 / 3. 포카칩 / 4. 초코파이 / 5. 꼬북칩");
			
			String snack_input = sc.nextLine(); // snack_input = 어떤과자를 살것인지 변수선언
			int five_num_snack = Integer.parseInt(snack_input); // 5번째 조건문 안에 과자 종류 중첩조건문 
			
			if(five_num_snack == 1) {
				System.out.println("썬칩");
			}
			else if(five_num_snack == 2) {
				System.out.println("스윙칩");
			}
			else if(five_num_snack == 3) {
				System.out.println("포카칩");
			}
			else if(five_num_snack == 4) {
				System.out.println("초코파이");
			}
			else if(five_num_snack == 5) {
				System.out.println("꼬북칩");
			}
			else {
				System.out.println("잘못누르셨습니다.");
				return;
			}
		}
		else if(five_num == 7) {
			System.out.println("음료수");
			System.out.println("");
			System.out.println("(음료수를 사시는군요 어떤걸 살까요?)");
			System.out.println("");
			System.out.println("1. 포카리스웨트 / 2. 파워에이드 / 3. 옥수수수염차 / 4. 게토레이 / 5. 토레타");
			
			String drink_input = sc.nextLine(); // drink_input = 어떤음료수를 살것인지 변수선언
			int five_num_drink = Integer.parseInt(drink_input); // 5번째 조건문 안에 음료수 종류 중첩조건문 
			
			if(five_num_drink == 1) {
				System.out.println("포카리스웨트");
			}
			else if(five_num_drink == 2) {
				System.out.println("파워에이드");
			}
			else if(five_num_drink == 3) {
				System.out.println("옥수수수염차");
			}
			else if(five_num_drink == 4) {
				System.out.println("게토레이");
			}
			else if(five_num_drink == 5) {
				System.out.println("토레타");
			}
			else {
				System.out.println("잘못누르셨습니다.");
				return;
			}
		}
		else if(five_num == 8) {
			System.out.println("아이스크림");
			System.out.println("");
			System.out.println("(아이스크림을 사시는군요 어떤걸 살까요?)");
			System.out.println("");
			System.out.println("1. 옥동자 / 2. 빵또아 / 3. 메로나 / 4. 쿠앤크/ 5. 수박바");
			
			String ice_input = sc.nextLine(); // ice_input = 어떤아이스크림을 살것인지 변수선언
			int five_num_ice = Integer.parseInt(ice_input); // 5번째 조건문 안에 아이스크림 종류 중첩조건문 
			
			if(five_num_ice == 1) {
				System.out.println("옥동자");
			}
			else if(five_num_ice == 2) {
				System.out.println("빵또아");
			}
			else if(five_num_ice == 3) {
				System.out.println("메로나");
			}
			else if(five_num_ice == 4) {
				System.out.println("쿠앤크");
			}
			else if(five_num_ice == 5) {
				System.out.println("수박바");
			}
			else {
				System.out.println("잘못누르셨습니다.");
				return;
			}
		}
		else if(five_num == 9) {
			System.out.println("기타");
		}
		else {
			System.out.println("잘못누르셨습니다.");
			return; //retrun을 이용하여 종료
		}
		
		System.out.println("");
		System.out.println("=====================================================");
		System.out.println("=====================================================");
		System.out.println("");
		System.out.println("(사실것을 고르셨나요? 결제방식을 고르세요.)");
		System.out.println("");
		System.out.println("1. 현금 / 2. 카드");
		
		String pay_input = sc.nextLine(); // pay_input = 결제방식 변수선언
		int six_num = Integer.parseInt(pay_input); // six_num = 여섯번째 조건문
		
		if(six_num == 1) {
			System.out.println("현금");
		}
		else if(six_num == 2) {
			System.out.println("카드");
		}
		else {
			System.out.println("잘못누르셨습니다.");
			return; //retrun을 이용하여 종료
		}
		
		System.out.println("");
		System.out.println("=====================================================");
		System.out.println("=====================================================");
		System.out.println("");
		System.out.println("(봉투 필요하세요?)");
		System.out.println("");
		System.out.println("1. 필요하다. / 2. 필요하지않다.");
		
		String envelope_input = sc.nextLine(); // envelope_input = 봉투 변수선언
		int seven_num = Integer.parseInt(envelope_input); // seven_num = 일곱번째 조건문
		
		if(seven_num == 1) {
			System.out.println("필요하다");
		}
		else if(seven_num == 2) {
			System.out.println("필요하지않다.");
		}
		else {
			System.out.println("잘못누르셨습니다.");
			return; //retrun을 이용하여 종료
		}
		
		System.out.println("");
		System.out.println("=====================================================");
		System.out.println("=====================================================");
		System.out.println("");
		System.out.println("(영수증 필요하세요?)");
		System.out.println("");
		System.out.println("1. 필요하다. / 2. 필요하지않다.");
		
		String receipt_input = sc.nextLine(); // receipt_input = 영수증 변수선언
		int eight_num = Integer.parseInt(receipt_input); // eight_num = 여덟번째 조건문
		
		if(eight_num == 1) {
			System.out.println("필요하다");
		}
		else if(eight_num == 2) {
			System.out.println("필요하지않다.");
		}
		else {
			System.out.println("잘못누르셨습니다.");
			return; //retrun을 이용하여 종료
		}
		
		System.out.println("");
		System.out.println("=====================================================");
		System.out.println("=====================================================");
		System.out.println("");
		System.out.println("(집까지 어떻게 갈까요 ?)");
		System.out.println("");
		System.out.println("1. 걸어서 간다. / 2. 뛰어간다. / 3. 차타고 간다. / 4. 버스타고 간다. / 5. 지하철 타고 간다.");
		
		String home_input = sc.nextLine(); //home_input = 집까지 어떻게갈건지 변수선언
		int nine_num = Integer.parseInt(home_input); //nine_num = 9번째 조건문 (집까지 어떻게 갈것인지) 변수선언
		
		if(nine_num == 1 ) {
			System.out.println("걸어서 간다.");
		}
		else if(nine_num == 2) {
			System.out.println("뛰어간다.");
		}
		else if(nine_num == 3) {
			System.out.println("차타고 간다.");
		}
		else if(nine_num == 4) {
			System.out.println("버스타고 간다.");
		}
		else if(nine_num == 5) {
			System.out.println("지하철 타고 간다.");
		}
		else {
			System.out.println("잘못누르셨습니다.");
			return; //retrun을 이용하여 종료
		}
		
		System.out.println("");
		System.out.println("=====================================================");
		System.out.println("=====================================================");
		System.out.println("");
		System.out.println("(집에 도착하셨습니다. 집 안으로 들어가시겠습니까?)");
		System.out.println("");
		System.out.println("1. 집에 들어간다. / 2. 담배피고 들어간다. / 3. 약속이 생겨서 나가봐야겠다. / 4. 전화통화 하고간다. / 5. PC방에 간다. / 6. 팀노바에 간다.");
		
		String home_arrival_input = sc.nextLine(); //home_arrival_input = 집도착후 무엇을 한것인지 변수선언
		int ten_num = Integer.parseInt(home_arrival_input); //ten_num = 10번째 조건문 (집도착후 무엇을 한것인지) 변수선언
		
		if(ten_num == 1 ) {
			System.out.println("집에 들어간다");
		}
		else if(ten_num == 2) {
			System.out.println("담배피고 들어간다");
		}
		else if(ten_num == 3) {
			System.out.println("약속이 생겨서 나가봐야겠다.");
		}
		else if(ten_num == 4) {
			System.out.println("전화통화 하고간다.");
		}
		else if(ten_num == 5) {
			System.out.println("PC방에 간다.");
		}
		else {
			System.out.println("팀노바에 간다.");
			return; //retrun을 이용하여 종료
		}
		
		System.out.println("");
		System.out.println("=====================================================");
		System.out.println("=====================================================");
		System.out.println("");
		System.out.println("(네 알겠습니다! 편의점 다녀오느라 고생하셨습니다.~)");
	}
}
