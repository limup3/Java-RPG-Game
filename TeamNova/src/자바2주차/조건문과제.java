package �ڹ�2����;
import java.util.Scanner; // Scanner��� Ŭ���� �ҷ�����

public class ���ǹ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("(����� ���� ������ ������ �ϰ��ֽ��ϱ�?)"); //���� ����
		System.out.println("");
		System.out.println("1. ħ�뿡 ���� �ִ�. / 2. �����ϰ� �ִ�. / "
				+ "3. �����ϰ� �ִ�. / 4. �ڰ��ִ�. / 5. ��԰� �ִ�. / 6. ��Ÿ ");
		System.out.println("");
		
		Scanner sc = new Scanner(System.in); // Scanner�� ��ü���� sc(scan)�̶�� �������� 
		
		String doing_input = sc.nextLine(); // doing_input(���� �ϰ��ִ��ൿ)�̶� ������ sc���� �Է¹��� ��ġ ����
		
		int first_num = Integer.parseInt(doing_input); // doning_input�̶� ��Ʈ���� first_num(ù��° ���ǹ�) ��Ʈ�� ��ȯ
		
		if(first_num == 1) { //���ǹ� ����
			
			System.out.println("ħ�뿡 �����ִ�.");
			System.out.println("");
			
			System.out.println("(ħ�뿡 ���������ñ���).");
			System.out.println("(���𰡸� �԰���� ��������?)");
			System.out.println("");
			System.out.println("1. �԰�ʹ�. / 2. �ƹ������� ����.");
			String seat_input = sc.nextLine(); // seat_input = ħ�뿡 �����ִ� ������
			int first_num_seat = Integer.parseInt(seat_input); // first_num_seat = ù��° ���ǹ� �ȿ� seat�� ��ø���ǹ�
	
			if(first_num_seat == 1) {
				System.out.println("�԰�ʹ�.");
				System.out.println("");
				System.out.println("(�׷� ���������� ���ô�~)"); //�������ǹ����� ����
			}
			else if(first_num_seat == 2) {
				System.out.println("�ƹ������� ����."); 
				System.out.println("");
				System.out.println("(�ƹ������� �����ñ���.)");
				System.out.println("(�׷��� �������� �����ô°� ��Ű���?)"); //�ǹ���
				System.out.println("");
				System.out.println("1. �������� ����? / 2. �ƹ������� ����.");
				String again_input = sc.nextLine(); //again_input = �ٽù��� ������
				int first_num_seat2 = Integer.parseInt(again_input); //first_num_seat2 = seat�� ��ø���ǹ�
				if(first_num_seat2 == 1) {
					System.out.println("�������� ����?");
					System.out.println("");
					System.out.println("(�׷� ���������� ���ô�~)"); //�������ǹ����� ����
					
				}
				else if(first_num_seat2 == 2) { 
					System.out.println("�ƹ������� ����.");
					System.out.println("");
					System.out.println("(�� �˰ڽ��ϴ�.)");
					return; //retrun�� �̿��Ͽ� ����
				}
				else {
					System.out.println("�߸������̽��ϴ�.");
					return; ////retrun�� �̿��Ͽ� ����
				}
			}
		}
		else if(first_num == 2) { //doing_input�� 2��° ����
			System.out.println("�����ϰ� �ִ�.");
			System.out.println("");
			System.out.println("(�����ϰ� �ֱ���)");
			System.out.println("(�������� ���������������?)");
			System.out.println("");
			System.out.println("1. ����ʹ�. /2. ������� �ʴ�.");
			
			
			String study_input = sc.nextLine(); //study_input = �����ϴ� ���� ��������
			int first_num_study = Integer.parseInt(study_input); //first_num_study = ù��° ���ǹ� �ȿ� study�� ��ø���ǹ�
			
			if(first_num_study == 1) {
				System.out.println("����ʹ�.");
				System.out.println("");
				System.out.println("(�׷� ���������� ���ô�~)"); //�������ǹ����� ����
			}
			else if(first_num_study == 2) {
				System.out.println("������� �ʴ�.");
				System.out.println("");
				System.out.println("(�� �˰ڽ��ϴ�.)");
				return; //retrun�� �̿��Ͽ� ����
			}
			else {
				System.out.println("�߸������̽��ϴ�.");
				return; //retrun�� �̿��Ͽ� ����
			}
		}
		else if(first_num == 3) { // doing_input�� 3��° ����
			System.out.println("�����ϰ� �ִ�.");
			System.out.println("");
			System.out.println("(�����ϰ� �ֱ���.)");
			System.out.println("(�������� ��������������� ?)");
			System.out.println("");
			System.out.println("1. ����ʹ�. /2. ������� �ʴ�.");
			
			String game_input = sc.nextLine(); //game_input = �����ϴ� ���� ��������
			int first_num_game = Integer.parseInt(game_input); //first_num_game = ù��° ���ǹ� �ȿ� game�� ��ø���ǹ�
			
			if(first_num_game == 1) {
				System.out.println("����ʹ�.");
				System.out.println("");
				System.out.println("(�׷� ���������� ���ô�~)"); //�������ǹ����� ����
				
			}
			else if(first_num_game == 2) {
				System.out.println("������� �ʴ�.");
				System.out.println("");
				System.out.println("(�� �˰ڽ��ϴ�.)");
				return; //retrun�� �̿��Ͽ� ����
			}
			else {
				System.out.println("�߸������̽��ϴ�.");
				return; //retrun�� �̿��Ͽ� ����
			} 
		}
		else if(first_num == 4) { // doing_input�� 4��° ����
			System.out.println("�ڰ��ִ�.");
			System.out.println("");
			System.out.println("(�ڰ� �ֱ���.)");
			System.out.println("(�������� ��������������� ?)");
			System.out.println("");
			System.out.println("1. ����ʹ�. /2. ������� �ʴ�.");
			
			String sleep_input = sc.nextLine(); //sleep_input = �ڴ� ���� ��������
			int first_num_sleep = Integer.parseInt(sleep_input); //first_num_sleep = ù��° ���ǹ� �ȿ� game�� ��ø���ǹ�
			
			if(first_num_sleep == 1) {
				System.out.println("����ʹ�.");
				System.out.println("");
				System.out.println("(�׷� ���������� ���ô�~)"); //�������ǹ����� ����
				
			}
			else if(first_num_sleep == 2) {
				System.out.println("������� �ʴ�.");
				System.out.println("");
				System.out.println("(�� �˰ڽ��ϴ�.)");
				return; //retrun�� �̿��Ͽ� ����
			}
			else {
				System.out.println("�߸������̽��ϴ�.");
				return; //retrun�� �̿��Ͽ� ����
			}
		}
		else if(first_num == 5) { // doing_input�� 5��° ����
			System.out.println("��԰� �ִ�.");
			System.out.println("");
			System.out.println("(��԰��ֱ���.)");
			System.out.println("(�� �԰��� �������� ��������������� ?)");
			System.out.println("");
			System.out.println("1. ����ʹ�. /2. ������� �ʴ�.");
			
			String meal_input = sc.nextLine(); //meal_input = �Դ� ���� ��������
			int first_num_meal = Integer.parseInt(meal_input); //first_num_meal = ù��° ���ǹ� �ȿ� meal�� ��ø���ǹ�
			
			if(first_num_meal == 1) {
				System.out.println("����ʹ�.");
				System.out.println("");
				System.out.println("(�׷� ���������� ���ô�~)"); //�������ǹ����� ����
				
			}
			else if(first_num_meal == 2) {
				System.out.println("������� �ʴ�.");
				System.out.println("");
				System.out.println("(�� �˰ڽ��ϴ�.)");
				return; //retrun�� �̿��Ͽ� ����
			}
			
			else {
				System.out.println("�߸������̽��ϴ�.");
				return; //retrun�� �̿��Ͽ� ����
			}
		
		}
		else if(first_num == 6) { // doing_input�� 6��° ����
			System.out.println("��Ÿ");
			System.out.println("");
			System.out.println("(���𰡸� �ϰ��ֱ���.)");
			System.out.println("(�������� ��������������� ?)");
			System.out.println("");
			System.out.println("1. ����ʹ�. /2. ������� �ʴ�.");

			String etc_input = sc.nextLine(); //etc_input = ��Ÿ ���� ��������
			int first_num_etc = Integer.parseInt(etc_input); //first_num_etc = ù��° ���ǹ� �ȿ� etc�� ��ø���ǹ�
			
			if(first_num_etc == 1) {
				System.out.println("����ʹ�.");
				System.out.println("");
				System.out.println("(�׷� ���������� ���ô�~)"); //�������ǹ����� ����
				
			}
			else if(first_num_etc == 2) {
				System.out.println("������� �ʴ�.");
				System.out.println("");
				System.out.println("(�� �˰ڽ��ϴ�.)");
				return; //retrun�� �̿��Ͽ� ����
			}
			
			else {
				System.out.println("�߸������̽��ϴ�.");
				return; //retrun�� �̿��Ͽ� ����
			}
			
		}
		else {
			System.out.println("�߸������̽��ϴ�.");
			return; //retrun�� �̿��Ͽ� ����
		}
		System.out.println("");
		System.out.println("=====================================================");
		System.out.println("=====================================================");
		System.out.println("");
		System.out.println("(�������� ���� ����� ?)");
		System.out.println("");
		System.out.println("1. GS25 / 2. 7-Seven / 3. CU / 4. Emart24 / 5. Ministop");
		
		String where_input = sc.nextLine(); //where_input = ���ΰ����� ��������
		int second_num = Integer.parseInt(where_input); //second_num = �ι�° ���ǹ� (���� ��������) ��������
		
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
			System.out.println("�߸������̽��ϴ�.");
			return; //retrun�� �̿��Ͽ� ����
		}
		
		System.out.println("");
		System.out.println("=====================================================");
		System.out.println("=====================================================");
		System.out.println("");
		System.out.println("(���������� ��� ����� ?)");
		System.out.println("");
		System.out.println("1. �ɾ ����. / 2. �پ��. / 3. ��Ÿ�� ����. / 4. ����Ÿ�� ����. / 5. ����ö Ÿ�� ����.");
		
		String how_input = sc.nextLine(); //how_input = ��԰����� ��������
		int third_num = Integer.parseInt(how_input); //third_num = ����° ���ǹ� (��� ��������) ��������
		
		if(third_num == 1 ) {
			System.out.println("�ɾ ����.");
		}
		else if(third_num == 2) {
			System.out.println("�پ��.");
		}
		else if(third_num == 3) {
			System.out.println("��Ÿ�� ����.");
		}
		else if(third_num == 4) {
			System.out.println("����Ÿ�� ����.");
		}
		else if(third_num == 5) {
			System.out.println("����ö Ÿ�� ����.");
		}
		else {
			System.out.println("�߸������̽��ϴ�.");
			return; //retrun�� �̿��Ͽ� ����
		}
		
		System.out.println("");
		System.out.println("=====================================================");
		System.out.println("=====================================================");
		System.out.println("");
		System.out.println("(�������� �����ϼ̽��ϴ�. ���� ����� ?)");
		System.out.println("");
		System.out.println("1. ���� ���� / 2. �ƴϴ� ������ �ִ�.");
		
		String arrival_input = sc.nextLine(); //arrival_input = ���� �������� 
		int four_num = Integer.parseInt(arrival_input); //four_num = �׹�° ���ǹ� (����) ��������
		
		if(four_num == 1) {
			System.out.println("��������.");
		}
		else if(four_num == 2) {
			System.out.println("�ƴϴ� ������ �ִ�.");
			System.out.println("");
			System.out.println("(������ �����ñ���.)");
			System.out.println("(� �����̼��� ?)");
			System.out.println("");
			System.out.println("1. ȭ��� ���ߵȴ�. / 2. ���� ������ �غ� �� �Ǿ� �ִ�. / 3. ������ �ȴ�. / 4.��ȭ�� �Դ�. ");
			
			String wait_input = sc.nextLine(); // wait_input = ��� �������־ ��ٷ��޶�� ��������
			int four_num_wait = Integer.parseInt(wait_input); // four_num_wait = �׹�° ���ǹ��� wait ��ø���ǹ�
			
			if(four_num_wait == 1) {
				System.out.println("ȭ��� ���ߵȴ�.");
				System.out.println("");
				System.out.println("(ȭ����� �������� ���ø� �˴ϴ�. ���Ϻ��ð� ���������� ������.)");
			}
			else if(four_num_wait == 2) {
				System.out.println("���� ������ �غ� �� �Ǿ� �ִ�.");
				System.out.println("");
				System.out.println("(������ �غ� �ǽø� ���������� ��������.)");
			}
			else if(four_num_wait == 3) {
				System.out.println("������ �ȴ�.");
				System.out.println("");
				System.out.println("(�������� �������Դϴ�. ���Ͻð� ���������� ������.)");
			}
			else if(four_num_wait == 4) {
				System.out.println("��ȭ�� �Դ�.");
				System.out.println("");
				System.out.println("(��ȭ�ް� ���������� ������.)");
			}
			else {
				System.out.println("�߸������̽��ϴ�.");
				return; //return�� �̿��Ͽ� ����
			}
			
		}
		
		else {
			System.out.println("�߸������̽��ϴ�.");
			return; //retrun�� �̿��Ͽ� ����
		}
		
		System.out.println("");
		System.out.println("=====================================================");
		System.out.println("=====================================================");
		System.out.println("");
		System.out.println("(�������� ���� ���� ���Խ��ϴ�. ������ ��ǰǰ��� ?)");
		System.out.println("");
		System.out.println("1. ��� / 2. �� / 3. �޹� / 4. �õ���ǰ / 5. ��� / 6. ���� / 7. ����� / 8. ���̽�ũ��  / 9. ��Ÿ");
		
		String what_input = sc.nextLine(); // what_input = ������ ����� ��������
		int five_num = Integer.parseInt(what_input); // five_num = 5��° ���ǹ�
		
		if(five_num == 1 ) {
			System.out.println("���");
			System.out.println("");
			System.out.println("(�Ŷ��� ��������� ��� ��ðھ��?)");
			System.out.println("");
			System.out.println("1. �Ŷ�� / 2. �������");
			
			String ramen_input = sc.nextLine(); // ramen_input = �Ŷ��� ��������� ������ ������� ��������
			int five_num_ramen = Integer.parseInt(ramen_input); // five_num_ramen = 5��° ���ǹ��ȿ� ��鿡���� ��ø���ǹ�
			
			if(five_num_ramen == 1) {
				System.out.println("�Ŷ��");
				System.out.println("");
				System.out.println("(�Ŷ���� ��ô±���. ũ��� ������ ū�� ��� ��ðھ��?)");
				System.out.println("");
				System.out.println("1. ���� �Ŷ�� / 2. ū �Ŷ��");
				
				String cupramen_input = sc.nextLine(); // cupramen_input = �Ŷ�� ũ���� ��� ������� ��������
				int five_num_cupramen = Integer.parseInt(cupramen_input); // five_num_cupramen = 5��° ���ǹ��ȿ� �Ŷ�鿡���� ��ø���ǹ�
				
				if (five_num_cupramen == 1) {
					System.out.println("�����Ŷ��");
					System.out.println("");
					System.out.println("(�����Ŷ���� ��ô±���. ����� ����� ��ðھ��?)");
					System.out.println("");
					System.out.println("1. �Ŷ�� / 2. ����� / 3. ����� / 4. ����� / 5. ¥�İ�Ƽ / 6.������");
					
					String smallcupramen_kind_input = sc.nextLine(); // smallcupramen_input = ���� �Ŷ���� � �Ŷ���� ������� ��������
					int five_num_smallcupramen_kind = Integer.parseInt(smallcupramen_kind_input); // 5��° ���ǹ� �ȿ� �����Ŷ�� ���� ��ø���ǹ�
					
					if (five_num_smallcupramen_kind == 1) {
						System.out.println("�Ŷ��");
					}
					else if (five_num_smallcupramen_kind == 2) {
						System.out.println("�����");
					}
					else if (five_num_smallcupramen_kind == 3) {
						System.out.println("�����");
					}
					else if (five_num_smallcupramen_kind == 4) {
						System.out.println("�����");
					}
					else if (five_num_smallcupramen_kind == 5) {
						System.out.println("¥�İ�Ƽ");
					}
					else if (five_num_smallcupramen_kind == 6) {
						System.out.println("������");
					}
					else {
						System.out.println("�߸������̽��ϴ�.");
						return;
					}
				}
				else if (five_num_cupramen == 2) {
					System.out.println("ū �Ŷ��");
					System.out.println("");
					System.out.println("(ū�Ŷ���� ��ô±���. ����� ����� ��ðھ��?)");
					System.out.println("");
					System.out.println("1. �Ŷ�� / 2. ����� / 3. ����� / 4. ����� / 5. ¥�İ�Ƽ / 6.������");
					
					String bigcupramen_kind_input = sc.nextLine(); // smallcupramen_input = ���� �Ŷ���� � �Ŷ���� ������� ��������
					int five_num_bigcupramen_kind = Integer.parseInt(bigcupramen_kind_input); // 5��° ���ǹ� �ȿ� �����Ŷ�� ���� ��ø���ǹ�
					
					if (five_num_bigcupramen_kind == 1) {
						System.out.println("�Ŷ��");
					}
					else if (five_num_bigcupramen_kind == 2) {
						System.out.println("�����");
					}
					else if (five_num_bigcupramen_kind == 3) {
						System.out.println("�����");
					}
					else if (five_num_bigcupramen_kind == 4) {
						System.out.println("�����");
					}
					else if (five_num_bigcupramen_kind == 5) {
						System.out.println("¥�İ�Ƽ");
					}
					else if (five_num_bigcupramen_kind == 6) {
						System.out.println("������");
					}
					else {
						System.out.println("�߸������̽��ϴ�.");
						return;
					}
				}
				else {
					System.out.println("�߸������̽��ϴ�.");
					return;
				}
			}
			else if(five_num_ramen == 2)  {
				System.out.println("�������");
				System.out.println("");
				System.out.println("(��������� ��ô±���. ������ ���� �� ��� ��ðھ��?)");
				System.out.println("");
				System.out.println("1. ���� / 2. ����");
				
				String envramen_input = sc.nextLine(); // envramen_input = ��������� ������ ������ ������� ��������
				int five_num_envramen = Integer.parseInt(envramen_input); // five_num_cupramen = 5��° ���ǹ��ȿ� ������鿡���� ��ø���ǹ�
				
				if (five_num_envramen == 1) {
					System.out.println("����");
					System.out.println("");
					System.out.println("(������ ��ô±���. ����� ����� ��ðھ��?)");
					System.out.println("");
					System.out.println("1. �Ŷ�� / 2. ����� / 3. ����� / 4. ����� / 5. ¥�İ�Ƽ / 6.������");
					
					String pieceramen_kind_input = sc.nextLine(); // pieceramen_input = ������ � ����� ������� ��������
					int five_num_pieceramen_kind = Integer.parseInt(pieceramen_kind_input); // 5��° ���ǹ� �ȿ� ��������� ���� ��ø���ǹ�
					
					if (five_num_pieceramen_kind == 1) {
						System.out.println("�Ŷ��");
					}
					else if (five_num_pieceramen_kind == 2) {
						System.out.println("�����");
					}
					else if (five_num_pieceramen_kind == 3) {
						System.out.println("�����");
					}
					else if (five_num_pieceramen_kind == 4) {
						System.out.println("�����");
					}
					else if (five_num_pieceramen_kind == 5) {
						System.out.println("¥�İ�Ƽ");
					}
					else if (five_num_pieceramen_kind == 6) {
						System.out.println("������");
					}
					else {
						System.out.println("�߸������̽��ϴ�.");
						return;
					}
				}
				else if (five_num_envramen == 2) {
					System.out.println("����");
					System.out.println("");
					System.out.println("(������ ��ô±���. ����� ����� ��ðھ��?)");
					System.out.println("");
					System.out.println("1. �Ŷ�� / 2. ����� / 3. ����� / 4. ����� / 5. ¥�İ�Ƽ / 6.������");
					
					String packramen_kind_input = sc.nextLine(); // packramen_input = ��������� � ����� ������� ��������
					int five_num_packramen_kind = Integer.parseInt(packramen_kind_input); // 5��° ���ǹ� �ȿ� ������� ���� ��ø���ǹ�
					
					if (five_num_packramen_kind == 1) {
						System.out.println("�Ŷ��");
					}
					else if (five_num_packramen_kind == 2) {
						System.out.println("�����");
					}
					else if (five_num_packramen_kind == 3) {
						System.out.println("�����");
					}
					else if (five_num_packramen_kind == 4) {
						System.out.println("�����");
					}
					else if (five_num_packramen_kind == 5) {
						System.out.println("¥�İ�Ƽ");
					}
					else if (five_num_packramen_kind == 6) {
						System.out.println("������");
					}
					else {
						System.out.println("�߸������̽��ϴ�.");
						return;
					}
				}
				
			}
			else {
				System.out.println("�߸������̽��ϴ�.");
				return; // return�� �̿��Ͽ� ����
			}
			
		}
		else if(five_num == 2) {
			System.out.println("��");
			System.out.println("");
			System.out.println("(���� ��ô±��� ����� ����?)");
			System.out.println("");
			System.out.println("1. �ӵ� / 2. �Ϳ� / 3. ID / 4. ���ϸ��� / 5. ������Ʈ");
			
			String gum_input = sc.nextLine(); // gum_input = ����� ������� ��������
			int five_num_gum = Integer.parseInt(gum_input); // 5��° ���ǹ� �ȿ� �� ���� ��ø���ǹ�
			
			if(five_num_gum == 1) {
				System.out.println("�ӵ�");
			}
			else if(five_num_gum == 2) {
				System.out.println("�Ϳ�");
			}
			else if(five_num_gum == 3) {
				System.out.println("ID");
			}
			else if(five_num_gum == 4) {
				System.out.println("���ϸ���");
			}
			else if(five_num_gum == 5) {
				System.out.println("������Ʈ");
			}
			else {
				System.out.println("�߸������̽��ϴ�.");
				return;
			}
		}
		else if(five_num == 3) {
			System.out.println("�޹�");
			System.out.println("");
			System.out.println("(�޹��� ��ô±��� ��޹��� ����?)");
			System.out.println("");
			System.out.println("1. ��õ ��ǰ�ҹ� / 2. �Ҵ����� �޹� / 3. ������� / 4. ��̹� / 5. �����");
			
			String bap_input = sc.nextLine(); // bap_input = ��޹��� ������� ��������
			int five_num_bap = Integer.parseInt(bap_input); // 5��° ���ǹ� �ȿ� �޹� ���� ��ø���ǹ�
			
			if(five_num_bap == 1) {
				System.out.println("��õ ��ǰ�ҹ�");
			}
			else if(five_num_bap == 2) {
				System.out.println("�Ҵ����� �޹�");
			}
			else if(five_num_bap == 3) {
				System.out.println("�������");
			}
			else if(five_num_bap == 4) {
				System.out.println("��̹�");
			}
			else if(five_num_bap == 5) {
				System.out.println("�����");
			}
			else {
				System.out.println("�߸������̽��ϴ�.");
				return;
			}
			
		}
		else if(five_num == 4) {
			System.out.println("�õ���ǰ");
			System.out.println("");
			System.out.println("(�õ���ǰ�� ��ô±��� ��� ����?)");
			System.out.println("");
			System.out.println("1. ���� / 2. �ߴٸ� / 3. ���� / 4. ġŲ / 5. ������");
			
			String frozen_food_input = sc.nextLine(); // frozen_food_input = ��õ���ǰ�� ������� ��������
			int five_num_frozen_food = Integer.parseInt(frozen_food_input); // 5��° ���ǹ� �ȿ� �õ���ǰ ���� ��ø���ǹ�
			
			if(five_num_frozen_food == 1) {
				System.out.println("����");
			}
			else if(five_num_frozen_food == 2) {
				System.out.println("�ߴٸ�");
			}
			else if(five_num_frozen_food == 3) {
				System.out.println("����");
			}
			else if(five_num_frozen_food == 4) {
				System.out.println("ġŲ");
			}
			else if(five_num_frozen_food == 5) {
				System.out.println("������");
			}
			else {
				System.out.println("�߸������̽��ϴ�.");
				return;
			}
		}
		else if(five_num == 5) {
			System.out.println("���");
			System.out.println("");
			System.out.println("(��踦 ��ô±��� ��� ����?)");
			System.out.println("");
			System.out.println("1. ����ġ�� / 2. ����ġ��� / 3. �����緹�� / 4. ����ü���� / 5. ���ϵ弼��");
			
			String smoke_input = sc.nextLine(); // smoke_input = ���踦 ������� ��������
			int five_num_smoke = Integer.parseInt(smoke_input); // 5��° ���ǹ� �ȿ� ��� ���� ��ø���ǹ� 
			
			if(five_num_smoke == 1) {
				System.out.println("����ġ��");
			}
			else if(five_num_smoke == 2) {
				System.out.println("����ġ���");
			}
			else if(five_num_smoke == 3) {
				System.out.println("�����緹��");
			}
			else if(five_num_smoke == 4) {
				System.out.println("����ü����");
			}
			else if(five_num_smoke == 5) {
				System.out.println("���ϵ弼��");
			}
			else {
				System.out.println("�߸������̽��ϴ�.");
				return;
			}
		}
		else if(five_num == 6) {
			System.out.println("����");
			System.out.println("");
			System.out.println("(���ڸ� ��ô±��� ��� ����?)");
			System.out.println("");
			System.out.println("1. ��Ĩ / 2. ����Ĩ / 3. ��īĨ / 4. �������� / 5. ����Ĩ");
			
			String snack_input = sc.nextLine(); // snack_input = ����ڸ� ������� ��������
			int five_num_snack = Integer.parseInt(snack_input); // 5��° ���ǹ� �ȿ� ���� ���� ��ø���ǹ� 
			
			if(five_num_snack == 1) {
				System.out.println("��Ĩ");
			}
			else if(five_num_snack == 2) {
				System.out.println("����Ĩ");
			}
			else if(five_num_snack == 3) {
				System.out.println("��īĨ");
			}
			else if(five_num_snack == 4) {
				System.out.println("��������");
			}
			else if(five_num_snack == 5) {
				System.out.println("����Ĩ");
			}
			else {
				System.out.println("�߸������̽��ϴ�.");
				return;
			}
		}
		else if(five_num == 7) {
			System.out.println("�����");
			System.out.println("");
			System.out.println("(������� ��ô±��� ��� ����?)");
			System.out.println("");
			System.out.println("1. ��ī������Ʈ / 2. �Ŀ����̵� / 3. ������������ / 4. ���䷹�� / 5. �䷹Ÿ");
			
			String drink_input = sc.nextLine(); // drink_input = �������� ������� ��������
			int five_num_drink = Integer.parseInt(drink_input); // 5��° ���ǹ� �ȿ� ����� ���� ��ø���ǹ� 
			
			if(five_num_drink == 1) {
				System.out.println("��ī������Ʈ");
			}
			else if(five_num_drink == 2) {
				System.out.println("�Ŀ����̵�");
			}
			else if(five_num_drink == 3) {
				System.out.println("������������");
			}
			else if(five_num_drink == 4) {
				System.out.println("���䷹��");
			}
			else if(five_num_drink == 5) {
				System.out.println("�䷹Ÿ");
			}
			else {
				System.out.println("�߸������̽��ϴ�.");
				return;
			}
		}
		else if(five_num == 8) {
			System.out.println("���̽�ũ��");
			System.out.println("");
			System.out.println("(���̽�ũ���� ��ô±��� ��� ����?)");
			System.out.println("");
			System.out.println("1. ������ / 2. ���Ǿ� / 3. �޷γ� / 4. ���ũ/ 5. ���ڹ�");
			
			String ice_input = sc.nextLine(); // ice_input = ����̽�ũ���� ������� ��������
			int five_num_ice = Integer.parseInt(ice_input); // 5��° ���ǹ� �ȿ� ���̽�ũ�� ���� ��ø���ǹ� 
			
			if(five_num_ice == 1) {
				System.out.println("������");
			}
			else if(five_num_ice == 2) {
				System.out.println("���Ǿ�");
			}
			else if(five_num_ice == 3) {
				System.out.println("�޷γ�");
			}
			else if(five_num_ice == 4) {
				System.out.println("���ũ");
			}
			else if(five_num_ice == 5) {
				System.out.println("���ڹ�");
			}
			else {
				System.out.println("�߸������̽��ϴ�.");
				return;
			}
		}
		else if(five_num == 9) {
			System.out.println("��Ÿ");
		}
		else {
			System.out.println("�߸������̽��ϴ�.");
			return; //retrun�� �̿��Ͽ� ����
		}
		
		System.out.println("");
		System.out.println("=====================================================");
		System.out.println("=====================================================");
		System.out.println("");
		System.out.println("(��ǰ��� ���̳���? ��������� ������.)");
		System.out.println("");
		System.out.println("1. ���� / 2. ī��");
		
		String pay_input = sc.nextLine(); // pay_input = ������� ��������
		int six_num = Integer.parseInt(pay_input); // six_num = ������° ���ǹ�
		
		if(six_num == 1) {
			System.out.println("����");
		}
		else if(six_num == 2) {
			System.out.println("ī��");
		}
		else {
			System.out.println("�߸������̽��ϴ�.");
			return; //retrun�� �̿��Ͽ� ����
		}
		
		System.out.println("");
		System.out.println("=====================================================");
		System.out.println("=====================================================");
		System.out.println("");
		System.out.println("(���� �ʿ��ϼ���?)");
		System.out.println("");
		System.out.println("1. �ʿ��ϴ�. / 2. �ʿ������ʴ�.");
		
		String envelope_input = sc.nextLine(); // envelope_input = ���� ��������
		int seven_num = Integer.parseInt(envelope_input); // seven_num = �ϰ���° ���ǹ�
		
		if(seven_num == 1) {
			System.out.println("�ʿ��ϴ�");
		}
		else if(seven_num == 2) {
			System.out.println("�ʿ������ʴ�.");
		}
		else {
			System.out.println("�߸������̽��ϴ�.");
			return; //retrun�� �̿��Ͽ� ����
		}
		
		System.out.println("");
		System.out.println("=====================================================");
		System.out.println("=====================================================");
		System.out.println("");
		System.out.println("(������ �ʿ��ϼ���?)");
		System.out.println("");
		System.out.println("1. �ʿ��ϴ�. / 2. �ʿ������ʴ�.");
		
		String receipt_input = sc.nextLine(); // receipt_input = ������ ��������
		int eight_num = Integer.parseInt(receipt_input); // eight_num = ������° ���ǹ�
		
		if(eight_num == 1) {
			System.out.println("�ʿ��ϴ�");
		}
		else if(eight_num == 2) {
			System.out.println("�ʿ������ʴ�.");
		}
		else {
			System.out.println("�߸������̽��ϴ�.");
			return; //retrun�� �̿��Ͽ� ����
		}
		
		System.out.println("");
		System.out.println("=====================================================");
		System.out.println("=====================================================");
		System.out.println("");
		System.out.println("(������ ��� ����� ?)");
		System.out.println("");
		System.out.println("1. �ɾ ����. / 2. �پ��. / 3. ��Ÿ�� ����. / 4. ����Ÿ�� ����. / 5. ����ö Ÿ�� ����.");
		
		String home_input = sc.nextLine(); //home_input = ������ ��԰����� ��������
		int nine_num = Integer.parseInt(home_input); //nine_num = 9��° ���ǹ� (������ ��� ��������) ��������
		
		if(nine_num == 1 ) {
			System.out.println("�ɾ ����.");
		}
		else if(nine_num == 2) {
			System.out.println("�پ��.");
		}
		else if(nine_num == 3) {
			System.out.println("��Ÿ�� ����.");
		}
		else if(nine_num == 4) {
			System.out.println("����Ÿ�� ����.");
		}
		else if(nine_num == 5) {
			System.out.println("����ö Ÿ�� ����.");
		}
		else {
			System.out.println("�߸������̽��ϴ�.");
			return; //retrun�� �̿��Ͽ� ����
		}
		
		System.out.println("");
		System.out.println("=====================================================");
		System.out.println("=====================================================");
		System.out.println("");
		System.out.println("(���� �����ϼ̽��ϴ�. �� ������ ���ðڽ��ϱ�?)");
		System.out.println("");
		System.out.println("1. ���� ����. / 2. ����ǰ� ����. / 3. ����� ���ܼ� �������߰ڴ�. / 4. ��ȭ��ȭ �ϰ���. / 5. PC�濡 ����. / 6. ����ٿ� ����.");
		
		String home_arrival_input = sc.nextLine(); //home_arrival_input = �������� ������ �Ѱ����� ��������
		int ten_num = Integer.parseInt(home_arrival_input); //ten_num = 10��° ���ǹ� (�������� ������ �Ѱ�����) ��������
		
		if(ten_num == 1 ) {
			System.out.println("���� ����");
		}
		else if(ten_num == 2) {
			System.out.println("����ǰ� ����");
		}
		else if(ten_num == 3) {
			System.out.println("����� ���ܼ� �������߰ڴ�.");
		}
		else if(ten_num == 4) {
			System.out.println("��ȭ��ȭ �ϰ���.");
		}
		else if(ten_num == 5) {
			System.out.println("PC�濡 ����.");
		}
		else {
			System.out.println("����ٿ� ����.");
			return; //retrun�� �̿��Ͽ� ����
		}
		
		System.out.println("");
		System.out.println("=====================================================");
		System.out.println("=====================================================");
		System.out.println("");
		System.out.println("(�� �˰ڽ��ϴ�! ������ �ٳ������ ����ϼ̽��ϴ�.~)");
	}
}
