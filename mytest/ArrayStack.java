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
	 
	 
	 // 栈最大容量
	 private int maxSize;
	 
	 private int[] stack;
	 // 栈顶的标志
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


	// 栈是否已满
	 private boolean isFull() {
		 return top == (maxSize -1);
	 }
	 
	 
	 private boolean isEmpty() {
		return top == -1;
	 }
	 
	 
	 public void add(int obj ) {
	    if(isFull()){
	    	System.out.println("栈已满.....");
	    	return;
	    }
	    stack[++top] = obj;	    		 
	 }
	 
	 public Integer pop() {
	     if(isEmpty()){
		     System.out.println("栈已空.....");
		     return null ;
		 }
	     int  data=  stack[top--] ;
	     System.out.println("出栈 data = "+data);
	     return data; 
	}
	 public void ListAll(){
		 
	     if(isEmpty()){
		     System.out.println("栈已空.....");
		     return ;
		 }
	     for (int i = 0; i < top; i++) {
			System.out.println(stack[i]);
		 }
	 }
	 
	 
	 
	 
	 
 }

