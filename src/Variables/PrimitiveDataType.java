package Variables;

/**
 * <h3>기본 자료형(Primitive data type)</h3>
 * 
 * <h4>참고 사이트</h4>
 * <ul>
 * <li><a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html">
 * Java Tutorials > Language Basics > Variables > Primitive Data Types</a></li>
 * <li><a href="https://ko.wikipedia.org/wiki/%EC%9B%90%EC%8B%9C_%EC%9E%90%EB%A3%8C%ED%98%95">위키백과 - 원시 자료형</a></li>
 * <li><a href="https://en.wikipedia.org/wiki/Primitive_wrapper_class_in_Java">위키백과 - Primitive wrapper class in Java</a></li>
 * <li><a href="http://www.tcpschool.com/java/java_datatype_constant">TCP School > JAVA > 8) 상수</a></li>
 * <li><a href="http://www.tcpschool.com/java/java_datatype_basic">TCP School > JAVA > 9) 기본 자료</a></li>
 * <li><a href="http://www.tcpschool.com/java/java_datatype_floatingPointNumber">TCP School > JAVA > 10) 실수의 표현</a></li>
 * </ul>
 * 
 * @since JDK 11
 * @version 1.0.0.RELEASE
 * @author 강민성
 */
public class PrimitiveDataType {

	/*
	 * 1. 기본 자료형(Primitive Data Type)이란
	 * 1.1. Java에서는 여러 형태의 타입을 미리 정의하여 제공하고 있는데, 이것을 기본 자료형(Primitive Data Type)이라고 한다.
	 * 1.2. Data Type은 해당 데이터가 메모리에 어떻게 저장되고, 프로그램에서 어떻게 처리되어야 하는지를 명시적으로 알려주는 역할을 한다.
	 * 1.3. Java의 기본 자료형은 8종류로 크게 정수형, 실수형, 문자형, 논리형으로 나눌 수 있다.
	 * 
	 * 
	 * 2. 리터럴(Literal)
	 * 2.1. 고정 값의 소스 코드 표현이며, 계산하지 않고도 코드에 직접 표시된다.
	 *      즉, 그 자체로 값을 의미하는 것(ex. int var = 30; // 30이 바로 리터럴임).
	 *      
	 *      
	 * 3. 기본 자료형(Primitive Data Type)의 예약어(keyword) 8가지
	 * DataType  Keyword     MemorySize         Default			Range
	 * 논리형     boolean    1byte(1bit)         false          false, true
	 * 문자형     char       2byte(16bit=216)    0(='\u0000')   0~65535('\u0000' ~ '\uffff')(Unicode(UTF-16) : 영어/숫자=1byte, 그 외 다국어=2byte)
	 * 정수형     byte       1byte(8bit=28)      0              -128 ~ 127(-2^7 ~ 2^7-1)
	 * 정수형     short      2byte(16bit=216)    0              -32,768 ~ 32,767(-2^15 ~ 2^15-1)
	 * 정수형     int        4byte(32bit=232)    0              -2147483648 ~ 2147483647(-2^31 ~ 2^31-1)
	 * 정수형     long       8byte(64bit=264)    0L             -9223372036854775808 ~ 9223372036854775807(-2^63 ~ 2^63-1)
	 * 실수형     float      4byte(32bit=232)    0.0f           ±1.4E-45 ~ ±3.4028235E38(±1.4 x 10^-45 ~ ±3.4028235 x 10^38)(ANSI/IEEE 754-1985 표준)
	 * 실수형     double     8byte(64bit=264)    0.0d           ±4.9E-324 ~ ±1.7976931348623157E308(±4.9 x 10^-324 ~±1.7976931348623157 x 10^308)(ANSI/IEEE 754-1985 표준)
	 * 
	 * 
	 * 4. 기본 자료형(Primitive Data Type)과 참조 자료형(Reference Data Type)의 차이
	 * 4.1. 기본 자료형(Primitive Data Type)은 Java에서 사전 정의돼있다. 참조 자료형(Reference Data Type)은 프로그래머가 작성하며 Java에서 정의하지 않는다. (String 제외).
	 * 4.2. 참조 자료형(Reference Data Type)은 특정 작업을 수행하기 위해 메서드를 호출하는 데 사용할 수 있지만 기본 자료형(Primitive Data Type)은 할 수 없습니다.
	 * 4.3. 기본 자료형(Primitive Data Type)은 null값을 넣을 수 없지만 참조 자료형(Reference Data Type)은 넣을 수 있다.
	 * 4.4. 기본 자료형(Primitive Data Type)은 첫 글자가 소문자로 시작하는 반면 참조 자료형(Reference Data Type)은 대문자로 시작한다.
	 * 4.5. 기본 자료형(Primitive Data Type)의 크기는 데이터 유형에 따라 다르지만 참조 자료형(Reference Data Type)은 모두 동일한 크기를 갖는다.
	 * 4.6. 참조 자료형(Reference Data Type)의 예로는 String, Arrays, Classes, Interface 등이 있다.
	 */
	public static void main(String[] args) {
		/* 
		 * boolean(논리형)
		 * 1. 참/거짓 조건을 추적하는 간단한 플래그에 사용한다.
		 * 2. 메모리 크기는 1byte를 나타내지만 사용하는 CPU마다 다르기 때문에 정확한 bit의 크기는 알 수 없다.
		 */
		/* 일반적인 사용법 */
		boolean bf = false, bt = true;
		System.out.println(bf + ", " + bt); // false, true
		
		
		/* 잘못된 사용법 */
		// boolean b1 = asdf; // 변수값 확인 불가. java.lang.Error(compile error): asdf cannot be resolved to a variable
		// boolean b2 = 123; // 데이터 타입 불일치. java.lang.Error(compile error): Type mismatch: cannot convert from int to boolean
// ---------------------------------------------------------------------------------------------------------------
		/* 
		 * char(문자형)
		 * 1. 문자 하나를 표현할 수 있는 타입.
		 * 2. 4. char 값은 따옴표('') 안에 한 글자만 작성이 가능하다.
		 */
		
		/* 일반적인 사용법 */
		char ch1 = 'a', ch2 = 'A', ch3 = '1', ch4 = 'ㅁ', ch5 = '$';
		System.out.printf("%s, %s, %s, %s, %s\n", ch1, ch2, ch3, ch4, ch5); // a, A, 1, ㅁ, $
		
		
		/* 잘못된 사용법 */ 
		// char ch6 = asdf; // 변수값 확인 불가. java.lang.Error(compile error): asdf cannot be resolved to a variable
		// ch7 = 'asdf'; // 잘못된 문자 상수. java.lang.Error(compile error): Invalid character constant
		// char ch8 = 123456789; // 데이터 타입 불일치. java.lang.Error(compile error): Type mismatch: cannot convert from int to boolean
		
		
		/* ASCII코드로 표현 가능. keyboard I/O 시 ASCII코드로 인식하기에 주로 입력값을 활용하기 위해 사용 */
		char ch9 = 65;
		System.out.println(ch9); // A
		
		
		/* Unicode escape sequence로 표현(거의 안 씀) */
        char ch_C = '\u0108', ch_i = '\u00ed', ch_o = '\u00F1';
        System.out.println(ch_C); // Ĉ : 곡절 악센트 대문자 C
        System.out.println(ch_i); // í : 라틴어
        System.out.println(ch_o); // ñ : 라틴어
        
        
		/*
		 * Special escape sequence로 표현. 주로 Script나 JSON에 쓰인다.
		 * 굳이 char를 이용하지 않고 작은 따옴표('') or 큰 따옴표("") 안에 할당되어 있어도 사용할 수 있다.
		 */
		// \s(0x20) : 띄어쓰기.
		System.out.println("HelloWorld! => Hello\sWorld!"); // HelloWorld! => Hello World!
		// \t : 수평탭.
		System.out.println("HelloWorld! => Hello\tWorld!"); // HelloWorld! => Hello World!
		// \' : 작은 따옴표.
		System.out.println("HelloWorld! => \'H\'elloWorld!"); // HelloWorld! => 'H'elloWorld!
		// \" : 큰 따옴표.
		System.out.println("HelloWorld! => \"HelloWorld!\""); // HelloWorld! => "HelloWorld!"
		// \\ : 백 슬래시.
		System.out.println("HelloWorld! => Hello\\World!"); // HelloWorld! => Hello\World!
		// \n(0x0a) : 줄바꿈.
		System.out.println("HelloWorld! => \nHelloWorld!"); // HelloWorld! =>
															// HelloWorld!
		// \r(0x0d) : 줄 바꿈, 커서가 행의 앞으로 이동.
		System.out.println("HelloWorld! => \rHelloWorld!"); // HelloWorld! =>
															// HelloWorld!
// ---------------------------------------------------------------------------------------------------------------
		/* 
		 * byte, short, int, long(정수형)
		 * 1. 부호(+,-)가 있는 정수(2의 보수)를 가지며, 소수 부분이 없는 수를 의미한다.
		 * 2. byte, short는 메모리 절감이 중요한 대규모 Array에서 메모리를 저장하는데 유용할 수 있다.
		 */
		
		/* 일반적인 사용법 */
		byte b1 = 127, b2 = -128;
		System.out.println(b1 + ", " + b2); // 127, -128
        short s1 = 32767, s2 = -32768;
        System.out.println(s1 + ", " + s2); // 32767, -32768
        int i1 = 2147483647, i2 = -2147483648;
        System.out.println(i1 + ", " + i2); // 2147483647, -2147483648
        
		// long 값이 int의 최솟값 or 최댓값을 초과할 경우 long 리터럴 끝에 L(or l)을 붙여야 한다. l은 1과 구분이 힘들어 L을
		// 주로 붙여 사용하며 평소 int와 long값을 구분하기 위해 리터럴 끝에 L을 붙인다.
        long l1 = 9223372036854775807L, l2 = -9223372036854775808L;
        System.out.println(l1 + ", " + l2); // 9223372036854775807, -9223372036854775808
        
        
		/* 잘못된 사용법(long 외 모든 정수형 결과 동일) */
        // byte b3 = 128; // 표현 범위 초과. java.lang.Error(compile error): Type mismatch: cannot convert from int to byte
        // byte b4 = ""; // 데이터 타입 불일치. java.lang.Error(compile error): Type mismatch: cannot convert from String to byte
        // long l3 = 9223372036854775807; // int 리터럴 범위 초과. java.lang.Error(compile error): The literal 9223372036854775807 of type int is out of range
        
        
		/*
		 * Overflow or Underflow 발생 시 전혀 다른 값이 저장될 수 있다(참고: http://www.tcpschool.com/java/java_datatype_basic).
		 * 내부적으로 허용되는 타입 범위 내 표현 범위가 초과할 경우 아래와 같이 128 -> -128로 변환시키므로 결론적으로 compile error가 아닌 logic error이다.
		 */
        byte b3 = 127;
        byte b4 = -128;
        b3++; // 127 + 1
        b4--; // -128 - 1
        System.out.println(b3); // -128
        System.out.println(b4); // 127
        
        
		/* 2진수(Binary), 10진수(Decimal), 16진수(Hexadecimal) 표현(접두사 0x는 16진수이고 0b는 2진수이다) */
		int binVal = 0b11010; // 숫자 26, 2진수(Binary).
		int decVal = 26; // 숫자 26, 10진수(Decimal).
		int hexVal = 0x1a; // 숫자 26, 16진수(Hexadecimal).
        System.out.printf("%d, %d, %d\n", binVal, decVal, hexVal);
// ---------------------------------------------------------------------------------------------------------------
		/*
		 * float, double(실수형)
		 * 1. ANSI/IEEE 754-1985 표준 부동 소수점 방식을 따르고 있다. 과거에는 실수를 표현할 때 float을 많이 사용했지만,
		 *    하드웨어의 발달로 인한 메모리 공간의 증가로 현재에는 double형을 가장 많이 사용한다.
		 * 2. ANSI/IEEE 754-1985 표준 부동 소수점(floating point) 방식(float) : 부호(1bit), 지수부(8bit), 가수부(23bit). 총 32bit.
		 * 3. ANSI/IEEE 754-1985 표준 고정 소수점(fixed point) 방식(double) : 부호(1bit), 지수부(11bit), 가수부(52bit). 총 64bit.
		 */
        
		/* 일반적인 사용법 */
        // 정수로 표기된 float 값이 int의 최솟값 or 최댓값을 초과할 경우 float 값 뒤에 f(or F)를 붙여야 한다.
        // 소수점으로 표기 시 무조건 f(or F)를 붙여야 한다.
        float f1 = 3.4028235E38f, f2 = 1.4E-45f;
        System.out.println(f1 + ", " + f2); // 3.4028235E38, 1.4E-45
        float f3 = 2147483648f;
        System.out.println(f3); // 2.14748365E9
        // 정수로 표기된 double 값이 int의 최솟값 or 최댓값을 초과할 경우 double 값 뒤에 d(or D)를 붙여야 한다.
        // 규칙에 의해 값 뒤에 d(or D)는 생략이 가능하다.
        double d1 = 4.9E-324, d2 = 1.7976931348623157E308;
        System.out.println(d1 + ", " + d2);
        double d3 = 2147483648d;
        System.out.println(d3); // 2.147483648E9
        
        
		/* 잘못된 사용법 */
        // float f4 = 2147483648; // int 리터럴 범위 초과. java.lang.Error(compile error): The literal 2147483648 of type int is out of range
        // float f5 = asdf; // 변수값 확인 불가. java.lang.Error(compile error): asdf cannot be resolved to a variable
        // float f6 = ""; // 데이터 타입 불일치. java.lang.Error(compile error): Type mismatch: cannot convert from String to float
        
		/* 
		 * 부동 소수점 방식의 오차
		 * 실수끼리의 계산은 정확한 표현이 아닌 근사치를 표현할 뿐.
		 */
        double d4 = 0.1, d5 = 0.1;
        System.out.println(d4 * d5); // 0.010000000000000002
// ---------------------------------------------------------------------------------------------------------------
		/* 
		 * 숫자 리터럴(Numeric Literals)에서 밑줄 문자 사용
		 * avaSE7 이상에서는 숫자 리터럴의 숫자 사이에 임의의 수의 밑줄 문자(_)가 나타날 수 있다.
		 * 숫자 리터럴로 자릿수 그룹을 구분하여 코드의 가독성을 향상할 수 있다.
		 */
        
		/* 일반적인 사용법 */
        long creditCardNumber = 1234_5678_9012_3456L;
        System.out.println(creditCardNumber); // 1234567890123456
        long socialSecurityNumber = 999_99_9999L;
        System.out.println(socialSecurityNumber); // 999999999
        float pi = 3.14_15F;
        System.out.println(pi); // 3.1415
        long hexBytes = 0xFF_EC_DE_5E;
        System.out.println(hexBytes); // -1253794
        long hexWords = 0xCAFE_BABE;
        System.out.println(hexWords); // -889275714
        long maxLong = 0x7fff_ffff_ffff_ffffL;
        System.out.println(maxLong); // 9223372036854775807
        byte nybbles = 0b0010_0101;
        System.out.println(nybbles); // 37
        long bytes = 0b11010010_01101001_10010100_10010010;
        System.out.println(bytes); // -764832622
        
        
		/* 잘못된 사용법 */
        // int x1 = 5_2; // OK, 하지만 가독성이 떨어짐.
        // int x3 = 5_______2; // OK, 하지만 가독성이 떨어짐.
        // int x6 = 0x5_2; // OK, 하지만 가독성이 떨어짐.
        // float pi1 = 3_.1415F; // 유효하지 않음: 밑줄을 소수점 근처에 놓을 수 없습니다.
        // long socialSecurityNumber1 = 999_99_9999_L; // 유효하지 않음: L 접미사 앞에 밑줄을 넣을 수 없습니다.
        // int x2 = 52_; // 유효하지 않음: 리터럴 끝에 밑줄을 넣을 수 없습니다.
        // int x4 = 0_x52; // 유효하지 않음: 0x radix 접두사에 밑줄을 넣을 수 없습니다.
        // int x5 = 0x_52; // 유효하지 않음: 숫자의 시작 부분에 밑줄을 넣을 수 없습니다.
        // int x7 = 0x52_; // 유효하지 않음: 숫자의 끝에 밑줄을 넣을 수 없습니다.
	}
}