import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public TreeSetTest() {
		//TreeSet : �ߺ�������� ����. �Է¼��� ������������, ũ�������� ���ĵ�.
		int numData[] = {10,50,30,40,10,50,60,70,40,40,40,40};
		String strData[] = {"ȫ�浿","�������","ȫ�浿","ȫ�浿","�̼���","�̼���","������"};

		TreeSet<Integer> ts = new TreeSet<Integer>();
		for( int n : numData) {
			ts.add(n);		
		}
		TreeSet<String> ts2 = new TreeSet<String>();
		for(String name : strData) {
			ts2.add(name);		
		}
		
		Iterator<Integer>	ii	= ts.iterator();
		while(ii.hasNext()) {
			System.out.println("ts-> "+ ii.next());
		}
		System.out.println("--------");
		//�������� descendingIterator()
		Iterator<Integer>	iii	= ts.descendingIterator();
		while(iii.hasNext()) {
			System.out.println("ts-> "+ iii.next());
		}
		System.out.println("str-----");
		Iterator<String> str = ts2.iterator();
		while(str.hasNext()) {
			System.out.println("ts2->"+ str.next());
		}
		System.out.println("--------");
		//��������
		Iterator<String> str1 = ts2.descendingIterator();
		while(str1.hasNext()) {
			System.out.println("ts2->"+ str1.next());
		}
	}
		

	public static void main(String[] args) {
		new TreeSetTest();

	}

}
