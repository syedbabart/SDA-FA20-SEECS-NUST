package nullObjectDesignPattern;

abstract class Emp 
{ 
	protected String name; 
	public abstract boolean isNull(); 
	public abstract String getName(); 
} 

class Coder extends Emp 
{ 
	public Coder(String name) 
	{ 
		this.name = name; 
	} 
	@Override
	public String getName() 
	{ 
		return name; 
	} 
	@Override
	public boolean isNull() 
	{ 
		return false; 
	} 
} 

class Tester extends Emp{
	public Tester(String name) {
		this.name = name;
	}

	@Override
	public boolean isNull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
}

class Lead extends Emp{
	public Lead(String name) {
		this.name = name;
	}

	@Override
	public boolean isNull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
}

class NoClient extends Emp 
{ 
	@Override
	public String getName() 
	{ 
		return "Not Available"; 
	}

	@Override
	public boolean isNull() 
	{ 
		return true; 
	} 
} 

class EmpData 
{ 
	public static final String[] names = {"Ali", "Alina", "Alia", "Alyan"}; 
	public static Emp getClient(String name) 
	{ 
		for (int i = 0; i < names.length; i++) 
		{ 
			if (names[i].equalsIgnoreCase(name)) 
			{ 
				return new Coder(name); 
			} 
		} 
		return new NoClient(); 
	} 
} 

public class Main 
{ 
	public static void main(String[] args) 
	{ 
		Emp emp1 = EmpData.getClient("Ali"); 
		Emp emp2 = EmpData.getClient("Ahmad"); 
		Emp emp3 = EmpData.getClient("Alyan"); 
		Emp emp4 = EmpData.getClient("Alina");
		Emp emp5 = EmpData.getClient("javeed");
		System.out.println(emp1.getName()); 
		System.out.println(emp2.getName()); 
		System.out.println(emp3.getName()); 
		System.out.println(emp4.getName()); 
		System.out.println(emp5.getName()); 
	} 
}