import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public HashSetTest() {
		//Set : �Է¼��� �������� ���� , �ߺ������� ������� ����.
		
		int numData[] = {10,50,30,40,10,50,60,70,40,40,40,40};
		String strData[] = {"ȫ�浿","�������","ȫ�浿","ȫ�浿","�̼���","�̼���","������"};
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		for(int n : numData) {
			hs1.add(n);
		}
		System.out.println("hs1�� ��ü�� = "+ hs1.size());
		
		HashSet<String> hs2 = new HashSet<String>();
		for(String s : strData) {
			hs2.add(s);
		}
		System.out.println("hs2�� ��ü�� = "+ hs2.size());
		/////////
		Iterator<Integer> i = hs1.iterator();
		
		while(i.hasNext()) {
			System.out.println("hs1 --> "+i.next());
		}
		
		Iterator<String> str = hs2.iterator();
		
		while(str.hasNext()) {
			System.out.println("hs2 --> "+ str.next());
		}
	}

	public static void main(String[] args) {
		new HashSetTest();

	}

}
