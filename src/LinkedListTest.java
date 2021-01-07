import java.util.LinkedList;

public class LinkedListTest {

	public LinkedListTest() {
		// List 
		// Queue : ��ü�� ���ʿ��� �߰� �ٸ��ʿ��� �����Ѵ�.
		// Deque : ��ü�� ���ʿ��� �߰�, ���� �� �� �ִ�.
		// ��ü�� get()�ϸ� �÷��ǿ��� ��ü�� ��������.
		
		LinkedList<String> ll = new LinkedList<String>();
		
		//������ �߰�
		ll.offer("ȫ�浿");
		ll.offer("�������");
		ll.offer("�̼���");
		ll.offer("������");
		ll.offerFirst("hong"); //�����ʿ��� �ֱ�

		/// ���� ������ ��ü�� pop
		System.out.println(ll.pollLast());
		System.out.println(ll.get(1));// get�� ��ü�� �������� �ʴ´�
		while(!ll.isEmpty()) {// isEmpty() : �÷����� ����ִ��� Ȯ�� �� true,false����
			System.out.println(ll.pop());
		}
		
		//��ü��
		System.out.println("size()-> "+ll.size());
	}

	public static void main(String[] args) {
		new LinkedListTest();

	}

}
