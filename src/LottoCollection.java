import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class LottoCollection {
	Scanner sc = new Scanner(System.in);

	
	public LottoCollection() {
	}

	public void start() {
		do {
			int cnt = gameCount();//���Ӽ�
			for(int i =1; i<=cnt;i++) {
				System.out.print(i+"���� = ");
				createLotto();
			}
			if(!qna()) break;
		}while(true);
		System.out.println("---------****The End***---------");
	}
	//���Ӽ� �Է�
	public int gameCount() {
		int intCnt=0;
		while(true) {	
			try {
				System.out.print("���Ӽ� = ");
				intCnt =Integer.parseInt(sc.nextLine());
				//������ ���� ����� �ƴ� ��� �ٽ� �Է�
				if(intCnt<=0) {
					throw new Exception("1�̻��� ���� �Է��Ͻÿ�.");//���ܸ����
				}
				break;
			}catch(NumberFormatException ne) {
				System.out.println("���Ӽ��� ������ �Է��ؾ� �մϴ�.");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return intCnt;
	}

	//�ζ� 1���� ����� �޼ҵ�
	public void createLotto() {
		Random ran = new Random();
		TreeSet<Integer> ts = new TreeSet<Integer>();
		int lastNum = 0;
		//����-> TreeSet ->7���� �ɶ�����
		while(true) {
			lastNum =ran.nextInt(45)+1;//1~45 -- ���������� ������� ��ȣ
			ts.add(lastNum);
			if(ts.size()>=7)break;
		}
		//���������� ������ ��ȣ�� lastNum�� ���ִµ� ���ʽ��̹Ƿ� �����Ѵ�
		ts.remove(lastNum);
		System.out.print(ts.toString());
		System.out.println(", bonus = " +lastNum);
	}
	//��ӿ��� Ȯ��
	public boolean qna() {
		boolean boo = false;
		do {			
			System.out.print("����Ͻðڽ��ϱ�(Y or y: �� ,  N or n: �ƴϿ�)?");
			String re = sc.nextLine();
			if(re.equalsIgnoreCase("Y")) {
				boo = true;
				break;
			}else if(re.equalsIgnoreCase("N")) {
				boo = false;
				break;
			}else {
				System.out.println("Y or N�� �Է��ϼ���...");
			}
		}while(true);

		return boo;
	}


	public static void main(String[] args) {
		LottoCollection lotto = new LottoCollection();
		lotto.start();
	}

}
