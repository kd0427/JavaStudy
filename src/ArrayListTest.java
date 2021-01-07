import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public ArrayListTest() {
		//�ٸ� ������ ��ü �߰� ����
		ArrayList al = new ArrayList();
		// Member ��ü�� �߰� ���� ( generic )
		List<Member> lst = new ArrayList<Member>(); //Ŭ������ ��ü�� ���� List��� �������̽��� ����

		Member mem1 = new Member(100,"hong","010-1234-5688","����� ���빮��");
		Member mem2 = new Member(200,"kim","010-4587-8888","����� ���α�");
		Member mem3 = new Member(300,"park","010-7895-9696","����� �߱�");

		al.add(mem1);//0
		al.add(mem2);//1
		al.add(mem3);//2
		
		lst.add(mem1);//0
		lst.add(mem2);//1
		lst.add(mem3);//2
		
		al.add(new String("ȫ�浿"));
		//lst.add(new String("�������")); //generic�� ���� ������ ��ü�� �߰� ����
		
		for(int i=0; i < lst.size(); i++) {
			Member m =lst.get(i); //generic �÷����� ����ȯ���� �ʾƵ� �ȴ�.
			//Member m1 =(Member)al.get(i); 
			//m.memberPrn();
		}

	}

	public static void main(String[] args) {
		new ArrayListTest();
	}

}
