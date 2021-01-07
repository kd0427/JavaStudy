import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public ArrayListTest() {
		//다른 종류의 객체 추가 가능
		ArrayList al = new ArrayList();
		// Member 객체만 추가 가능 ( generic )
		List<Member> lst = new ArrayList<Member>(); //클래스로 객체를 만들어서 List라는 인터페이스에 대입

		Member mem1 = new Member(100,"hong","010-1234-5688","서울시 서대문구");
		Member mem2 = new Member(200,"kim","010-4587-8888","서울시 종로구");
		Member mem3 = new Member(300,"park","010-7895-9696","서울시 중구");

		al.add(mem1);//0
		al.add(mem2);//1
		al.add(mem3);//2
		
		lst.add(mem1);//0
		lst.add(mem2);//1
		lst.add(mem3);//2
		
		al.add(new String("홍길동"));
		//lst.add(new String("세종대왕")); //generic은 같은 종류의 객체만 추가 가능
		
		for(int i=0; i < lst.size(); i++) {
			Member m =lst.get(i); //generic 컬렉션은 형변환하지 않아도 된다.
			//Member m1 =(Member)al.get(i); 
			//m.memberPrn();
		}

	}

	public static void main(String[] args) {
		new ArrayListTest();
	}

}
