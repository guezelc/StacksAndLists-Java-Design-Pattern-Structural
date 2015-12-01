package fr.iutvalence.info.dut.m3105.pattern.structural;

public class StackOfStringTester {
	
	private Stack<String> Stack;

	public StackOfStringTester(fr.iutvalence.info.dut.m3105.pattern.structural.Stack<String> stack)
	{
		this.Stack=stack;
	}

	public void testStack() {
		System.out.println("Size = "+this.Stack.size());
		this.Stack.push("A");
		System.out.println("Size = "+this.Stack.size());
		this.Stack.push("B");
		System.out.println("Size = "+this.Stack.size());
		System.out.println("Top of Stack is : "+this.Stack.peek());
		System.out.println("Size = "+this.Stack.size());
		System.out.println("Element remove of the Stack is : "+this.Stack.pop());
		System.out.println("Size = "+this.Stack.size());
		System.out.println("Element remove of the Stack is : "+this.Stack.pop());
		System.out.println("Size = "+this.Stack.size());


		
	}

}
