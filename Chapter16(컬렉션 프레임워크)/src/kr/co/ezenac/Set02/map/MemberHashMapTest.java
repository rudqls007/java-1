package kr.co.ezenac.Set02.map;



public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap memberhashMap = new MemberHashMap();
		Member memberL = new Member(2022, "이순신");
		Member memberW = new Member(2023, "원균");
		Member memberR = new Member(2024, "나대용");
		Member memberS = new Member(2025, "류성룡");
		
		memberhashMap.addMember(memberL);
		memberhashMap.addMember(memberW);
		memberhashMap.addMember(memberR);
		memberhashMap.addMember(memberS);
		
		
		memberhashMap.showAllMember();
		
		memberhashMap.removeMember(2025);
		memberhashMap.showAllMember();
	}

}
