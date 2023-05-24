package String_handling;

public class region_match {

	public static void main(String[] args) {
		String a="Reezu Sanu Kanxu";
		String b="Sanu";
		String c="Kanxu";
		System.out.println(a.regionMatches(6,b,0,4));
		System.out.println(a.regionMatches(7,b,0,4));
		System.out.println(a.regionMatches(11,c,0,5));
		System.out.println(a.regionMatches(12,c,0,5));

	}

}
