package function;

public class StringFunc {

	public static void main(String[] args) {
		String s="HEHEHE";
		String s1="hehehe";
		String s2="   Selenium  ";
		System.out.println("Length of the string: " +s.length());
		System.out.println("Character is present at index: "+s.charAt(0));
		System.out.println("Addition:" +s.concat(s));
		System.out.println("Are these Strings equal or not: "+s.equalsIgnoreCase(s1));
		System.out.println(s.indexOf('H'));
		System.out.println(s.replace('E', 'H'));
		System.out.println(s.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s2.trim());

	}

}
