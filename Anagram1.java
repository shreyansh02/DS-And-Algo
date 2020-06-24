public class Anagram1 {

	public static void main(String[] args) {
		
		String a = "aaeb m";
		String b = "abaem";
		
		boolean isAnagram = true;
		
		int al[] = new int[256];
		
		for(char c: a.toCharArray()) {  //break the String and each Character is put in Array 
			 int index =(int) c;
			 al[index]++;
		}
		
		for(char c: b.toCharArray()) {  //break the String and each Character is put in Array 
			 int index =(int) c;
			 al[index]--;
		}
		
		for(int i=0; i<256; i++) {
			if(al[i] != 0) {
				isAnagram = false;
			}
		}
		if(isAnagram)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}
}
