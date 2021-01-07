import java.util.Stack;

public class StackTest {

	public StackTest() {
		//first in , last out : 먼저 추가된 객체 제일 마지막에 얻어진다.
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
			System.out.println("남은객체수 --> "+ stack.size());
		}
	}

	public static void main(String[] args) {
		new StackTest();

	}

}
