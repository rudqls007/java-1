package kr.co.ezenac.list;

import java.util.ArrayList;
import java.util.Iterator;


public class MemberArrayList {

	private ArrayList<Member> arrayList; // arraylist 선언

	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}

	public void addMember(Member member) {
		arrayList.add(member);

	}

	public boolean removeMember(int memberId) {
//		// 해당 아이디를 가진 멤버를 ArrayList에서 찾아야 한다
//		for (int i = 0; i < arrayList.size(); i++) {
//			Member member = arrayList.get(i);
//			// 멤버 아이디가 매개 변수 memberId와 일치하면
//			int tmp = member.getMemberId();
//			if (tmp == memberId) {
//				// 해당 멤버 삭제
//				arrayList.remove(i);
//				return true;
//
//			}
//
//		}
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) 	{
			Member member= ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(member);
				return true;
			}
			 
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	public void showAllMembers() {
		for(Member member : arrayList) {
			System.out.println(member);
		System.out.println();
		}
	}
}