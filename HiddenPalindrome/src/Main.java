
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=readInput();
		s=getLongestPalindrome(s);
		System.out.println(s.length());

	}

	private static String getLongestPalindrome(String s) {
		// TODO Auto-generated method stub
		if (isPalindrome(s)) return s;
		if (s.length()==1) return s;
		for (int len=s.length()-1;len>0;len--) {
			for (int i=0;i<s.length()-len+1;i++) {
				String substr=s.substring(i,len+i);
				if (isPalindrome(substr)) return substr;
			}
			
		}
		return null;
	}

	private static boolean isPalindrome(String s) {
		// TODO Auto-generated method stub
		if (s.length()==1) return true;
		if (s.length()==2 && s.charAt(0)==s.charAt(1))
			return true;
		if (s.charAt(0)==s.charAt(s.length()-1)) {
			return isPalindrome(s.substring(1,s.length()-2));
		}
		return false;
	}

	private static String readInput() {
		// TODO Auto-generated method stub
		return null;
	}

}
