package co.micol.prj;

public class Example01 {
	private String str = "20001004";	//yyyymmdd
	private String nstr = "1234";
	private String mstr = "5678";
	private String cstr = "akcdefg.jsp";

	void StringTest() {
//		System.out.println(str.toString());
//		System.out.println(nstr.toString());
//		System.out.println(nstr + mstr);

//		int n = Integer.valueOf(nstr);
//		int m = Integer.valueOf(mstr);
//		System.out.println(n + m);
		// 타입 변환

//		if (str.equals(cstr)) {
//			System.out.println(cstr);
			//str == cstr 도 가능하지만 권유는 안한다.
//		} else {
//			System.out.println("잘못입력하셨습니다.");
//		}
		
//		String mm = str.substring(4, 6);
		//4~6까지 = 4번째랑 5번째가 나오고 6번째는 안나옴.
//		String dd = str.substring(6);
		//6~끝까지
//		System.out.println("귀하의 생일은" + mm + "월" + dd + "일 입니다." );
		
		System.out.println(cstr.substring(0,1));
		System.out.println(cstr.replace("k", "b"));
		System.out.println(cstr.concat("xyz"));
		System.out.println(cstr.replace(".jsp",""));
		System.out.println(cstr.toUpperCase());
		System.out.println(cstr.getBytes());
		System.out.println(cstr.trim());
		
		char c = 'a';
		String cs = String.valueOf(c);  //캐릭터타입을 스트링 타입으로 변환하였다.
		String s = "a";
		if(s == cs) System.out.println(c);
	}
}
