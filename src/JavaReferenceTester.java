
public class JavaReferenceTester {

	public static void main(String[] args) {
		String s1 = new String("a");//new instance
		String s2 = "a";//new String("a");
		String s3 = "a";

		if(s1 == s2) {
			System.out.println("s1 and s2 are same reference");//false!
		}
		if(s1.equals(s2)) {
			System.out.println("s1 and s2 content are equal");//true
		}
		if(s3 == s2) {
			System.out.println("s3 and s2 are same reference");//true
		}
		//System.out.println(s1);
		//System.out.println(s2);
	}

}
