package ocajp8.examples;

public class ManipulateStringBuilder {

	public static void main(String[] args) {
		char[] chars = {'1','Z','0','-','8','1'};
		StringBuilder sb = new StringBuilder();
		StringBuilder append = sb.append(chars,0,chars.length-1);
		System.out.println(append); //1Z0-8
		
		System.out.println(chars.length);
		System.out.println(chars[chars.length-1]);
	}
}
