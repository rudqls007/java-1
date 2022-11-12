package kr.co.ezenac.list;

public class Member {

	private int memberId; // 회원 아이디
	private String memberName; // 회원 이름

	public Member(int memberId, String membeName) { // 생성자
//		super();
		this.memberId = memberId;
		this.memberName = membeName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMembeName() {
		return memberName;
	}

	public void setMembeName(String membeName) {
		this.memberName = membeName;
	}

	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + " 입니다 ";
	}
}
