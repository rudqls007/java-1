package kr.co.ezenac.field02;

public class FieldInit /* extends Object  생략 가능하다*/{  

	byte byteField;			// 1byte
	short shortField;		// 2byte 
	int intField;				// 4byte
	long longField;			// 8byte
	
	boolean booleanField;	// 1byte
	char charField;				// 2byte
	
	float floatField;				// 4byte
	double doubleField;		// 8byte
	//참조형 변수 - 기본적으로 null 값을 갖는다
	int[] arrField;				//4
	String strField;				//4
	
	/*
	 * toString()
	 * 클래스의 맴버 변수 맴버 변수(필드)의 값 들을 수시로 확인하고자 할 때나,
	 * 원하는 포멧으로 맴버 변수들을 출력하고자 할 때 많이 사용한다
	 */
	
	
	@Override
	public String toString() {
		String str = "byteField : " + byteField +
						", shortField" + shortField +
						", intField" + intField +
						", longField" + longField +
						", booleanField" + booleanField +
						", charField" + charField +
						", floatField" + floatField +
						", doubleField" +  doubleField +
						", arrField" + arrField +
						", strField" + strField;
			
			return str;
	}

}
