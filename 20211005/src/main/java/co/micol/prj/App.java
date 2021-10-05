package co.micol.prj;

import java.util.ArrayList;
import java.util.List;

import co.micol.prj.member.Member;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Member meber;
//        Example01 ex = new Example01();
//        ex.StringTest();
    	
//    	DateTest dateTest = new DateTest();
//    	dateTest.dateTest();
//   	dateTest.calendarTest();
 //   	System.out.println("======================");
 //   	SqlDateTest sqlDateTest = new SqlDateTest();
 //   	sqlDateTest.sqlDate();
    	
    	List<Member> members = new ArrayList<Member>();
    	meber = new Member("홍길동","대구광역시", 20);
    	members.add(meber);		//리스트에 한명의 데이터를 담겠다.
    	meber = new Member("이승권","광주광역시", 30);
    	members.add(meber);	
    	meber = new Member("차수아","서울광역시", 25);
    	members.add(meber);	
    	meber = new Member("김수현","인천광역시", 28);
    	members.add(meber);	
    	
    	for(Member m : members) {
    		m.toString();
    	}
    }
}
