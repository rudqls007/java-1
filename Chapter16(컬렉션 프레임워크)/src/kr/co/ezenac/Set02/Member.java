package kr.co.ezenac.Set02;

public class Member implements Comparable<Member> {

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

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj; // 다운 캐스팅
			if (this.memberId == member.memberId) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public int compareTo(Member member) {
		// TODO Auto-generated method stub
		return (this.memberId - member.memberId) * (-1) ;				// 양수 = 오름차순, 음수 = 내림차순
	}

}
