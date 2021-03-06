import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public TreeSetTest() {
		//TreeSet : 중복허용하지 않음. 입력순서 유지하지않음, 크기순서대로 정렬됨.
		int numData[] = {10,50,30,40,10,50,60,70,40,40,40,40};
		String strData[] = {"홍길동","세종대왕","홍길동","홍길동","이순신","이순신","김정희"};

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
		//내림차순 descendingIterator()
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
		//내림차순
		Iterator<String> str1 = ts2.descendingIterator();
		while(str1.hasNext()) {
			System.out.println("ts2->"+ str1.next());
		}
	}
		

	public static void main(String[] args) {
		new TreeSetTest();

	}

}
