package kr.co.ezenac.object;

public class MyDate {
	int year;
	int month;
	int day;

	public MyDate(int year, int month, int day) {
//		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyDate) {
			MyDate date = (MyDate) obj; // 강제 형 변환
			if (this.day == date.day && this.month == date.month && this.year == date.year)
				return true;

			return false;
		}
		return false;
	}

	@Override
	public int hashCode() {

		return day*10 + month*101 + year*1001 ;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
