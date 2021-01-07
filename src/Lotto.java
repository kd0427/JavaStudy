import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Lotto {
	int game;

	public Lotto() {
		Scanner sc = new Scanner(System.in);
		System.out.println("게임횟수 입력.");
		game = sc.nextInt();

		//난수 1~45 
		//TreeS

		for(int i =1;i<=game;i++) {
			TreeSet<Integer> lotto = new TreeSet<Integer>();

			Random ran = new Random();

			int rn = 0;
			while(lotto.size() != 7) {
				rn=ran.nextInt(45)+1;
				lotto.add(rn);
				//bonus = lotto.ceiling(rn);

			}
			lotto.remove(rn);
			System.out.print(lotto);
			System.out.println(" bonus = "+rn);

		}

	}


	public static void main(String[] args) {
		new Lotto();
	}

}
