import java.util.Scanner;

/**
 * 
 * ��ʺ����
 * 
 */
public class Eat_Shit_League {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num4 = -1;
			boolean isExit = false;
			
			// ��������
			// ����
			String[] names = new String[4]; // ��ʺ������
			// �����ͷ���
			String[] shitNames = new String[4]; // ��ʺ�� ����
			// ��ַ
			String[] addresses = new String[4]; // ��ʺ��ַ
			// �Ͳ�ʱ��
			int[] times = new int[4]; // ��ʺʱ��
			// ����״̬
			int[] states = new int[4]; // ����ʺ��״̬
			// ��͵��ܽ��
			double[] money = new double[4];// �ܽ��
			// ��Ʒ�ĵ�����
			int likes[] = new int[4];
			double[] prices = { 8, 7, 99, 12 };
			// ��Ʒ����
			String[] menus = { "������ʺ", "������ʺ", "�������", "������ʺ " };
			String str = "��";
			String str2 = "���ñ�";
		
			// ��ӭ����
			System.out.println("��ӭʹ�ó�ʺ���˶�ʺ��Ͱ");
			System.out.println("************************************");
	
			System.out.println("���ף���ѡ���Ӧ��Ž��в��� Ŷ��");
			do {
				// �û��������ĳ�ʼ����
				System.out.println("1����Ҫ��ʺ" + "\n2���鿴ʺ��" + "\n3��ǩ��ʺ��" + "\n4���ӵ�ʺ��" + "\n5����Ҫ���� " + "\n6��������Ͱ��");
				System.out.println("************************************");
				
				// �����û�ѡ������
				
				System.out.print("��ѡ��");
				int num = sc.nextInt();
				//1
				// ��switch������ƥ��
				switch (num) {
				// ѡ��1��
				case 1:
					// �����ͽ���
					System.out.println("******���ף�����Ͱ�и��ָ�����ʺ����ѡ��Ŷ******");
					// ����ǰ����Ҫ�ж� ������û����4������
					boolean isAdd = false;// �����Ƿ���Զ�ʺ
					System.out.println("�������ѡ����ϲ����ʺ��Ŷ");
					System.out.println("����0���Է���Ŷ");
					// ��Ʒ�۸�
					// ѭ��
					for (int i = 0; i < names.length; i++) {
						// �ж� ���������� ���� �У��Ƿ��п�λ
						if (names[i] == null) {
							// ����У���true����inAdd
							isAdd = true;
							// ����ʾ�û������������Լ�������
							System.out.print("���붩ʺ��������");
							String name = sc.next();
							
							// ������ɺ������Ʒ�����۸� �� ������
							System.out.println("��� \t ��ʺ�� \t\t ���� \t\t������");
							// ��Ϊǰ�����ڱ����Ʒ�����۸�͵������������У�
							// ����������forѭ��������������ĸ���Ԫ��
							for (int c = 0; c < menus.length; c++) {
								// ��Ŀ������жϵ���������� likes[i]
								// ���Ԫ�ش���0�����likes[i]�����Ԫ��ֵ�����ޣ�����ַ�����like�����С��0��˵��û�е���������ʱ��0����ַ�������like
								String like = (likes[i]) > 0 ? likes[i] + "��" : "0";
								// ѭ�����������š���Ʒ�����۸񡢵�����
								System.out.println((c + 1) + "\t " + menus[c] + "\t\t" + str + prices[c] + str2 + "\t" + like);
							}
							
						
						// ���������ϣ��û��Ѿ��ܿ��� ���в�Ʒ����Ϣ
						// ��ʱ����ʾ�û�������ѡ����Ĳ�Ʒ�ı��
						System.out.print("����ѡ��Ҫ���ʺƷ���");
						int chocse = sc.nextInt();
						while (chocse < 1 || chocse > 4) { 
							System.out.println("�����ӿ���������룺");
							chocse = sc.nextInt();
						}
						
						// ����Ҫ������
						System.out.print("��ѡ������Ҫ�ķ���");
						int chocse2 = sc.nextInt();
						while (chocse2 < 0) { 
							System.out.println("�����ӿ���������룺");
							chocse2 = sc.nextInt();
						}
						// ����һ���������û�ѡ��˺�洢ѡ�Ĳ���������
						String menu = menus[chocse - 1] + "  " + chocse2 + " ��";
						// �洢�û�����Ĳ���������
						
						// ����һ�����ڽ��ղ�Ʒ�۸�*�����ı���
						double money2 = prices[chocse - 1] * chocse2;
						// ������Ŀ��������жϲ����� �û����Ĳ͵�Ǯ�Ƿ񳬹�50������������Ͳ������ͷѣ����������������Ҫ�����5Ԫ���ͷ�
						// ���ͷ�
						double money3 = (money2 > 50) ? 0 : 5;
						// �洢�ܽ��
						
						// �����Ϣ������Ϻ���ʾ�û���������ʱ��
						System.out.print("����������ʱ��(�Ͳ�ʱ����10����20��������Ͳ�)��");
						// �����û������ʱ��
						int time = sc.nextInt();
						// ѭ���ж� �û������ʱ���Ƿ�����
						while (time < 10 || time > 20) { // ����û������ʱ�䲻�ڷ�Χ�ڣ���ѭ����ʾ�û�����ʱ��
							System.out.println("�����ӿ���������룺");
							time = sc.nextInt();
						}
						
						// ����������Ϣ�������յ��û������ʱ�����ʾ�û������Ͳ͵�ַ
						System.out.print("�������Ͳ͵�ַ��");
						// �����û�������Ͳ͵�ַ
						String address = sc.next();
						// �洢�û�����ĵ�ַ
						// ������ϣ�����û��Ķ�����Ϣ
						System.out.println("��ʺ�ɹ���\n" + "������ʺ��		" + menu + "\n" + "�Ͳ�ʱ�䣺" + time + "��" + "\n" + "�ͷѣ�" + money2
								+ "���ñң��Ͳͷѣ�" + money3 + "���ñ�");
						System.out.println("�ܼƣ�" + (money2 + money3) + "���ñ�");
						names[i] = name;
						addresses[i] = address;
						times[i] = time;
						money[i] = money2 + money3;
						shitNames[i] = menu;
						break;
						
						}	
					}
					if (!isAdd) {
						System.out.println("��ǸŶ �ף�����ʺ���Ѿ�װ�������أ�");
					}
					break;
					
				case 2:
					System.out.println("******���ף���������ʺ������������˶�Ŷ******");
					System.out.println("��� \t ��ʺ�� \t ��ʺ��Ϣ \t \t ��ʺʱ��\t ��ʺ��ַ \t\t �ܽ�� \t ��ʺ״̬");
					for (int i = 0; i < names.length; i++) {
						if (names[i] != null) {
							String state = (states[i] == 0) ? "�Ѿ�Ԥ��" : "�Ѿ���ɶ���";
							String time = times[i] + "��";
							String money1 = money[i] + "���ñ�";
							System.out.println((i + 1) + " \t " + names[i] + " \t\t " + shitNames[i] + " \t \t\t " + time+ "\t\t " + addresses[i] + " \t \t\t " + money1+ " \t\t " + state);
						}
					}
					break;
					
				case 3:
					System.out.println("******���ף�����յ�ʺ�˾Ϳ���ǩ����Ӵ******");
					//Ѱ��Ҫǩ�յĶ���
					boolean shitOrder = false;
					System.out.print("��ѡ��Ҫǩ�յ�ʺ���ţ�");
					//�����û�����Ķ�����
					int shit = sc.nextInt();
					while(shit <0 || shit>4) {
						System.out.println("������ӿ������������");
						shit = sc.nextInt();
					}
					//ѭ������
					for(int i = 0;i<names.length;i++) {
						if(names[i] != null && states[i] ==0 && shit == i+1 ) {//���û�������Ϊ���Ҷ���״̬Ϊ0Ҳ�����Ѿ�Ԥ��������£�����û���������ֵ���ѭ�������Ĵ���+1������ͨ��ѭ���������ҵ��û��Ķ����ţ�
							//�Ͱ�1 ����states[i] ���Ӷ�ʵ�� �ı䶩��״̬�Ĺ���
							states[i] = 1;
							System.out.println("ʺ��ǩ�ճɹ�");
							//����true����shitOrder  ˵�������û�����Ķ���
							shitOrder = true;
						}else if(names[i] != null && states[i] ==1 && shit == i+1) {//���û�������Ϊ���Ҷ���״̬Ϊ1Ҳ������ǩ�յ������
							System.out.println("����ʺ���Ѿ�ǩ�չ��ˣ��������ظ�ǩ����Ӵ");
							//����true����shitOrder  ˵�������û�����Ķ���
							shitOrder = true;
						}
					}
					if(!shitOrder) {
						System.out.println("��Ҫ��ǩ�յ�ʺ��������Ӵ");
					}
					break;
					
				case 4:
					//��Ϊ��ϵͳ�����Ĵβͺ󣬾����� �޷��ٵ㵥����ʱ�����Ҫ�û���ɾ������
					System.out.println("******���ף�����������ʺ��******");
					//����ַ��ҵ�Ҫɾ�� ��ʺ��
					boolean shitOrder2 = false;
					//��ʾ������ Ҫɾ����ʺ�����
					System.out.print("��������Ҫɾ����ʺ���ı��Ӵ��");
					//�����û������ʺ�����
					int shit2 = sc.nextInt();
					for(int i = 0;i<names.length;i++) {
						if(names[i] != null && states[i] ==1 && shit2 == i+1) {
							shitOrder2 = true;//��־�ҵ����������
							//ѭ�������һ��Ԫ�ص�ֵ����ǰһλ�������Ϳճ������һλ��
							for(int c =shit2 ;c<names.length-1;c++) {  //��Ҫɾ���������У�����������+������ʱ�䡢��ַ������״̬���ͷ�,�Ȱ�����ǰ��
								names[c] = names[c+1];
								shitNames[c] = shitNames[c+1];
								times[i] = times[i+1];
								addresses[i] = addresses[i+1];
								states[i] = states[i+1];
								money[i] = money[i+1];
							}
							//Ȼ�����
							//ȷ�����һ��Ԫ�ص��±�
							int endIndex = names.length-1;
							names[endIndex] = null;
							shitNames[endIndex] = null;
							times[endIndex] = 0;
							addresses[endIndex] = null;
							states[endIndex] = 0;
							money[endIndex] = 0;
							System.out.println("ɾ��ʺ���ɹ�");
							break;
						}else if(names[i] != null && states[i] ==0 && shit2 == i+1) {
							System.out.println("�Բ������ף���ѡ���ʺ����δǩ��Ŷ������ɾ��Ӵ");
							shitOrder2 = true;//��־�ҵ����������
							break;
						}
					}
					if(!shitOrder2) {
						System.out.println("��Ҫɾ����ʺ��������Ӵ");
					}
					break;
					
				case 5:
					System.out.println("******���ף�������Ը���ϲ������ʺ����Ӵ******");
					//��������б�
					System.out.println("��� \t ��ʺ�� \t\t ���� \t\t������");
					for (int i = 0; i < menus.length; i++) {
						String price = "��"+ prices[i] + "���ñ�";
						System.out.println((i + 1) + "\t " + menus[i] + "\t\t" + price  + "\t" + likes[i] + "��");
					}
					//��ʾ�û�����Ҫ���޵ı��
					System.out.print("��ѡ����Ҫ���޵�ʺƷ���");
					int like2 = sc.nextInt();
					while(like2 <0 || like2>4) {
						System.out.println("������ӿ������������");
						like2 = sc.nextInt();
						}
					likes[like2-1]++;//����û�����1���Ǿ�˵���û���Ҫ��1�Ų˵��ޣ�����likes������ж�Ӧ�洢�ĵ�������λ�����±�Ϊ0 ��λ��
					System.out.println("���޳ɹ���");
					break;
					
				case 6:
					isExit = true;
					break;
				default:
					isExit = true;
					break;
				}
				
				if(!isExit) {
					System.out.print("����0���أ�");
					num4 = sc.nextInt();
					while(num4 != 0) {
						System.out.println("������ӿ������������");
						System.out.print("����0���أ�");
						num4 = sc.nextInt();
					}
				}else {
					break;
				}
			
		}while(num4 ==0);
		
	}

}

	
	
	
	
	
	