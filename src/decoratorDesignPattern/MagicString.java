package decoratorDesignPattern;

public class MagicString {

	private String string;
	public MagicString(String string) {
		// TODO Auto-generated constructor stub
		this.string = string;
	}
	public String toString() {
		return string;
	}
	public boolean isEmpty() {
		return this.string.isEmpty();
	}
	public int length() {
		return string.length();
	}
	public long getNumberOfVowels() {
		return string.chars()
				.mapToObj(c-> (char)c)
				.filter(c -> "aeiou".contains(c.toString()))
				.count();
	}
	public String makeCapital() {
		return string.toUpperCase();
	}
}
