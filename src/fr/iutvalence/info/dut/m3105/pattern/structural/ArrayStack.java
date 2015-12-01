package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayStack implements Stack<String> {

	private static final int SIZE_DEFAUT = 0;
	private static final int CAPACITY_DEFAUT = 10;
	public int size;
	private String[] tableOfElement;
	
	public ArrayStack()
	{
		this.size=SIZE_DEFAUT;
		this.tableOfElement=new String[CAPACITY_DEFAUT];
	}
	
	@Override
	public void push(String elementToAddOnTheTopOfTheStack) {
		this.tableOfElement[this.size]=elementToAddOnTheTopOfTheStack;
		this.size=this.size+1;
	}

	@Override
	public String pop() {
		this.size=this.size-1;
		return this.tableOfElement[this.size];
	}

	@Override
	public String peek() {
		return this.tableOfElement[this.size-1];
	}

	@Override
	public int size() {
		return this.size;
	}

}
