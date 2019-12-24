package mytest;

import java.awt.List;
import java.util.Stack;

public class LinkedStackTest {
   public	StackNode head = new StackNode(1);
   
   public void test() {
	   
	   StackNode stackNode1 = new StackNode(10);
	   StackNode stackNode2 = new StackNode(20);
	   head.next = stackNode1;
	   stackNode1.next = stackNode2;
	   
	   
	   StackNode MystackNode = head;
	   MystackNode = stackNode2;
	   System.out.println( "stackNode = "+ head );
	   System.out.println( "MystackNode = "+ MystackNode );
	
}
   



	public static void main(String[] args) {

		LinkedStackTest linkedStackTest =  new  LinkedStackTest();
		linkedStackTest.test();
	
				
		LinkedStack myStack = new LinkedStack();
		myStack.add(1);
		myStack.add(2);
		myStack.add(3);
		myStack.add(4);
		myStack.ListAll();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.add(5);
		myStack.add(6);
		myStack.add(7);
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();

	}
}

class LinkedStack {

	// 头部节点
	private StackNode head = new StackNode(-1);

	private boolean isEmpty() {
		return head.next == null;
	}

	public void add(int value) {
		StackNode stackNode = new StackNode(value);
		System.out.println("入栈  value  =" +value);
		if (isEmpty()) {
			head.next = stackNode;
			return;
		}
		stackNode.next = head.next;
		head.next = stackNode;

	}

	public Integer pop() {
		if (isEmpty()) {
			System.out.println("栈已空.....");
			return null;
		}
		StackNode stackNode = head.next;
		head.next = stackNode.next;
		stackNode.next = null;
		System.out.println("出栈 data = " + stackNode);
		return stackNode.getValue();
	}

	public void ListAll() {
		if (isEmpty()) {
			System.out.println("栈已空.....");
			return;
		}
		StackNode stackNode =   head;
		
		while (stackNode.next != null) {
           System.out.println("ListAll == " + stackNode.next);
           stackNode = stackNode.next;
		}
		 System.out.println("stackNode = "+stackNode);
		 System.out.println("head = "+head);
	}
}

class StackNode {

	private int value;
	public StackNode next;

	public StackNode(int value) {

		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "StackNode [value=" + value + ", hashCode()=" + hashCode() + "]";
	}





}
