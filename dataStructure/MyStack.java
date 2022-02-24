/**
*   문제 출처 : https://level.goorm.io/exam/43218/%EC%8A%A4%ED%83%9D-stack/quiz/1
*
*
**/

import java.io.*;

class Stack<T> {
	int top;
	int capacity = -1;
	T[] stack;
	Stack(int capacity){
		if(capacity > 10) capacity = 10;
		this.capacity = capacity;
		stack = (T[]) (new Object[capacity]);
		top = -1;
	}
	
	protected boolean isFull(){
		return (this.top == this.capacity-1);
	}
	
	public boolean isEmpty(){
		return (this.top == -1);
	}
	
	public void push(T element){
		if(isFull()){
			System.out.println("overflow");
			return;
		}
		stack[++top] = element;
	}
	
 	public T pop(){
		if(isEmpty()){
			System.out.println("underflow");
			return null;
		}
		return stack[--top];	
	}
	
	public void print(){
		for(int i=0; i<=top; i++){
			System.out.print(stack[i] + " ");
		}
	}
	
}


class Main {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

			int dataSize = Integer.parseInt(input);	
			
			Stack mStack = new Stack(dataSize);
			
			for(int i=0; i<dataSize; i++){
				String whatdoido = br.readLine();
				
				if(whatdoido == null){
					continue;
				}
				if(Integer.parseInt(whatdoido) == 0){
					mStack.push(br.readLine());	
				}else if(Integer.parseInt(whatdoido) == 1){
					mStack.pop();	
				}
				
			}
		
		if(!mStack.isEmpty()){
			mStack.print();
		}
		
	}
	
}
