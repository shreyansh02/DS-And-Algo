public class Anagram {

	public static void main(String[] args) {
		
		String a = "aaeb";
		String b = "abae";
		
		boolean isAnagram = false;
		boolean visited[] = new boolean[b.length()];
		
		if(a.length() == b.length()) {
			for(int i=0; i<a.length(); i++) {
				
				char c = a.charAt(i);
				isAnagram = false;
				
				for(int j=0; j<b.length(); j++) {
					
					if(c == b.charAt(j) && !visited[j]) {
						visited[j] = true;
						isAnagram = true;
						break;
					}
				}
				if(!isAnagram)
					break;
			}
		}
		
		if(isAnagram)
			System.out.println("Strings are Anagram");
		else
			System.out.println("strings are not Anagram");
	}
}
