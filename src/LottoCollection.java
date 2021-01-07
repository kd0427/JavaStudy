import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class LottoCollection {
	Scanner sc = new Scanner(System.in);

	
	public LottoCollection() {
	}

	public void start() {
		do {
			int cnt = gameCount();//게임수
			for(int i =1; i<=cnt;i++) {
				System.out.print(i+"게임 = ");
				createLotto();
			}
			if(!qna()) break;
		}while(true);
		System.out.println("---------****The End***---------");
	}
	//게임수 입력
	public int gameCount() {
		int intCnt=0;
		while(true) {	
			try {
				System.out.print("게임수 = ");
				intCnt =Integer.parseInt(sc.nextLine());
				//게임의 수가 양수가 아닐 경우 다시 입력
				if(intCnt<=0) {
					throw new Exception("1이상의 값을 입력하시오.");//예외만들기
				}
				break;
			}catch(NumberFormatException ne) {
				System.out.println("게임수는 정수만 입력해야 합니다.");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return intCnt;
	}

	//로또 1게임 만드는 메소드
	public void createLotto() {
		Random ran = new Random();
		TreeSet<Integer> ts = new TreeSet<Integer>();
		int lastNum = 0;
		//생성-> TreeSet ->7개가 될때까지
		while(true) {
			lastNum =ran.nextInt(45)+1;//1~45 -- 마지막으로 만들어진 번호
			ts.add(lastNum);
			if(ts.size()>=7)break;
		}
		//마지막으로 생성된 번호가 lastNum에 들어가있는데 보너스이므로 제거한다
		ts.remove(lastNum);
		System.out.print(ts.toString());
		System.out.println(", bonus = " +lastNum);
	}
	//계속여부 확인
	public boolean qna() {
		boolean boo = false;
		do {			
			System.out.print("계속하시겠습니까(Y or y: 예 ,  N or n: 아니오)?");
			String re = sc.nextLine();
			if(re.equalsIgnoreCase("Y")) {
				boo = true;
				break;
			}else if(re.equalsIgnoreCase("N")) {
				boo = false;
				break;
			}else {
				System.out.println("Y or N을 입력하세요...");
			}
		}while(true);

		return boo;
	}


	public static void main(String[] args) {
		LottoCollection lotto = new LottoCollection();
		lotto.start();
	}

}
