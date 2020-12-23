package chainofResponsibilityDesignPattern;

class Chain 
{ 
VerficationSystem chain; 

public Chain(){ 
	buildChain(); 
} 

private void buildChain(){ 
	chain = new EntryTest(new BISE(new Nadra(null))); 
} 

public void process(Number request) { 
	chain.process(request); 
}
} 

abstract class VerficationSystem 
{ 
	private VerficationSystem processor; 

	public VerficationSystem(VerficationSystem processor){ 
		this.processor = processor; 
	}; 
	
	public void process(Number request){ 
		if(processor != null) 
			processor.process(request); 
	}; 
} 

class Number 
{ 
	private int number; 

	public Number(int number) 
	{ 
		this.number = number; 
	} 

	public int getNumber() 
	{ 
		return number; 
	} 

} 

class EntryTest extends VerficationSystem 
{ 
	public EntryTest(VerficationSystem processor){ 
		super(processor); 
		
	} 

	public void process(Number request) 
	{ 
		if (request.getNumber() < 0) 
		{ 
			System.out.println("NegativeProcessor : " + request.getNumber()); 
		} 
		else
		{ 
			super.process(request); 
		} 
	} 
} 

class BISE extends VerficationSystem 
{ 
	public BISE(VerficationSystem processor){ 
		super(processor); 
	} 

	public void process(Number request) 
	{ 
		if (request.getNumber() == 0) 
		{ 
			System.out.println("ZeroProcessor : " + request.getNumber()); 
		} 
		else
		{ 
			super.process(request); 
		} 
	} 
} 

class Nadra extends VerficationSystem 
{ 

	public Nadra(VerficationSystem processor){ 
		super(processor); 
	} 

	public void process(Number request) 
	{ 
		if (request.getNumber() > 0) 
		{ 
			System.out.println("PositiveProcessor : " + request.getNumber()); 
		} 
		else
		{ 
			super.process(request); 
		} 
	} 
} 

class TestChain 
{ 
	public static void main(String[] args) { 
		Chain chain = new Chain(); 
		
		//Calling chain of responsibility 
		chain.process(new Number(90)); 
		chain.process(new Number(-50)); 
		chain.process(new Number(0)); 
		chain.process(new Number(91)); 
	} 
} 