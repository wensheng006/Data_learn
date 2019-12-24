package mytest;

import java.awt.List;

public class ArrayStack {
    
	
	
	
	public static void main(String[] args) {
		MyStack myStack = new MyStack(5);
		myStack.add(1);
		myStack.add(2);
		myStack.add(3);
		myStack.add(4);
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

 class MyStack{
	 
	 
	 // ջ�������
	 private int maxSize;
	 
	 private int[] stack;
	 // ջ���ı�־
	 private int top = -1;
	   
	 
	 public MyStack(int maxSize) {
		this.maxSize = maxSize;
		stack = new int[maxSize];
	}


	public int getMaxSize() {
		return maxSize;
	}


	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}


	// ջ�Ƿ�����
	 private boolean isFull() {
		 return top == (maxSize -1);
	 }
	 
	 
	 private boolean isEmpty() {
		return top == -1;
	 }
	 
	 
	 public void add(int obj ) {
	    if(isFull()){
	    	System.out.println("ջ����.....");
	    	return;
	    }
	    stack[++top] = obj;	    		 
	 }
	 
	 public Integer pop() {
	     if(isEmpty()){
		     System.out.println("ջ�ѿ�.....");
		     return null ;
		 }
	     int  data=  stack[top--] ;
	     System.out.println("��ջ data = "+data);
	     return data; 
	}
	 public void ListAll(){
		 
	     if(isEmpty()){
		     System.out.println("ջ�ѿ�.....");
		     return ;
		 }
	     for (int i = 0; i < top; i++) {
			System.out.println(stack[i]);
		 }
	 }
	 
	 
	 
	 
	 
 }

