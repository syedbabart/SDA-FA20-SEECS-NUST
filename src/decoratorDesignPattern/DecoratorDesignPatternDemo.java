package decoratorDesignPattern;

public class DecoratorDesignPatternDemo {

	public DecoratorDesignPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MagicString s = new MagicString("hasan ali khattak");
		System.out.println("String " + s + " has " + s.getNumberOfVowels() + " vowels");
	}
}