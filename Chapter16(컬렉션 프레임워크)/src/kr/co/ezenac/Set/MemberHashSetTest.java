package kr.co.ezenac.Set;



public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberhashSet = new MemberHashSet();
		
		Member memberL = new Member(2022, "이순신");
		Member memberW = new Member(2023, "원균");
		Member memberR = new Member(2024, "나대용");
		Member memberS = new Member(2025, "류성룡");
		
		
		memberhashSet.addMember(memberL);
		memberhashSet.addMember(memberW);
		memberhashSet.addMember(memberR);
		memberhashSet.addMember(memberS);
		memberhashSet.showAllmember();
		
		Member member2 = new Member(2025, "이도");
		memberhashSet.addMember(member2);
		memberhashSet.showAllmember();
		
		
	}

}
