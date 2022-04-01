package Sara;

public class StringLengthCount {
	public static void main(String[] args) {
		
		String s="Sarang kailas mahajan At post Bharadi Tq sillod Dist aurangabad";
		int u=0;
		for(int i=0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			u++;
			
		}
		System.out.println("Number Of Char"+u);
	}

}
