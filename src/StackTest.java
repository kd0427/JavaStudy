import java.util.Stack;

public class StackTest {

	public StackTest() {
		//first in , last out : ���� �߰��� ��ü ���� �������� �������.
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
			System.out.println("������ü�� --> "+ stack.size());
		}
	}

	public static void main(String[] args) {
		new StackTest();

	}

}
