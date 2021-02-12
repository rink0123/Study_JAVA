package variables;
/*
 * 참고 사이트
 * [Java Tutorials - Variables] https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 * [위키백과 - 원시 자료형] https://ko.wikipedia.org/wiki/%EC%9B%90%EC%8B%9C_%EC%9E%90%EB%A3%8C%ED%98%95
 * [위키백과 - Primitive wrapper class in Java] https://en.wikipedia.org/wiki/Primitive_wrapper_class_in_Java
 * [TCP School > JAVA > 8) 상수] http://www.tcpschool.com/java/java_datatype_constant
 * [TCP School > JAVA > 9) 기본 자료] http://www.tcpschool.com/java/java_datatype_basic
 * [TCP School > JAVA > 10) 실수의 표현] http://www.tcpschool.com/java/java_datatype_floatingPointNumber
 * 
 * 
 * 1. 기본 자료형(Primitive Data Type)이란
 * 1.1. Java에서는 여러 형태의 타입을 미리 정의하여 제공하고 있는데, 이것을 기본 자료형(Primitive Data Type)이라고 한다.
 * 1.2. Data Type은 해당 데이터가 메모리에 어떻게 저장되고, 프로그램에서 어떻게 처리되어야 하는지를 명시적으로 알려주는 역할을 한다.
 * 1.3. Java의 기본 자료형은 8종류로 크게 정수형, 실수형, 문자형, 논리형으로 나눌 수 있다.
 * 
 * 
 * 2. 기본 자료형(Primitive Data Type) 8가지
 * data type	keyword		memory size			default			range
 * 논리형		boolean 	1byte(1bit)			false			false, true
 * 문자형		char		2byte(16bit=216) 	0(='\u0000')	0~65535('\u0000' ~ '\uffff')(Unicode(UTF-16) : 영어/숫자=1byte, 그 외 다국어=2byte)
 * 정수형		byte		1byte(8bit=28)		0				-128 ~ 127(-2^7 ~ 2^7-1)
 * 				short		2byte(16bit=216)	0				-32,768 ~ 32,767(-2^15 ~ 2^15-1)
 * 				int			4byte(32bit=232)	0				-2147483648 ~ 2147483647(-2^31 ~ 2^31-1)
 * 				long		8byte(64bit=264)	0L				-9223372036854775808 ~ 9223372036854775807(-2^63 ~ 2^63-1)
 * 실수형		float		4byte(32bit=232)	0.0f			±1.4E-45 ~ ±3.4028235E38(±1.4 x 10^-45 ~ ±3.4028235 x 10^38)(ANSI/IEEE 754-1985 표준)
 * 				double		8byte(64bit=264)	0.0d			±4.9E-324 ~ ±1.7976931348623157E308(±4.9 x 10^-324 ~±1.7976931348623157 x 10^308)(ANSI/IEEE 754-1985 표준)
 * 
 * 
 * 3. 리터럴(Literal)
 * 3.1. 고정 값의 소스 코드 표현이며, 계산하지 않고도 코드에 직접 표시된다. 즉, 그 자체로 값을 의미하는 것(ex. int var = 30; // 30이 바로 리터럴임).
 */
public class PrimitiveDataType {

	public static void main(String[] args) {
		/*
		 * boolean(논리형)
		 * 1. 참/거짓 조건을 추적하는 간단한 Flug에 사용한다.
         * 2. 메모리 크기는 1byte를 나타내지만 사용하는 CPU마다 다르기 때문에 정확한 bit의 크기는 알 수 없다.
		 */
		// 올바른 사용법.
		boolean bf = false, bt = true;
		System.out.printf("%s, %s\n\n", bf, bt); // false, true
		
		// false, true 외 다른 값을 할당 시 Error.
		// boolean bl = asdf; // java.lang.Error(compile error) : asdf cannot be resolved to a variable.
		// boolean b2 = "asdf"; // java.lang.Error(compile error) : Type mismatch: cannot convert from String to boolean
// ----------------------------------------------------------------------------------------------------------------------------
		/*
		 * char(문자형)
		 * 1. 문자 하나를 표현할 수 있는 타입.
         * 2. Unicode((UTF-16) : 영어/숫자=1byte, 그 외 다국어=2byte)를 사용하며 문자를 표현한다(ASCII코드로도 표현할 수 있다).
         * 3. char 및 String 리터럴에 unicode escape와 escape sequence를 지원한다.
         * 4. char 값은 작은 따옴표('') 안에 한 글자만 할당할 수 있다.
         * 5. System.out.println(); 에서도 작은 따옴표('') 안에 한 글자만 할당할 수 있다.
		 */
		// 올바른 사용법.
		char ch1 = 'a', ch2 = 'A', ch3 = '1', ch4 = 'ㅁ', ch5 = '$';
		System.out.printf("%s, %s, %s, %s, %s\n", ch1, ch2, ch3, ch4, ch5); // a, A, 1, ㅁ, $
		
		// '' 안에 문자가 2개 이상 할당 시 Error.
		// char ch6= 'asdf'; // java.lang.Error(compile error) : Invalid character constant.
		// char ch7 = 65536; // java.lang.Error(compile error) : Type mismatch: cannot convert from int to char
		
		// char로 escape sequence 사용.
		char t = '\t', n = '\n', r = '\r', sq = '\'', dq = '\"';
		// '\t' : 수평 탭.
		System.out.println("HelloWorld! => Hello\tWorld!"); // HelloWorld! => Hello	World!
		// '\n' : 줄 바꿈.
		System.out.println("HelloWorld! => Hello\nWorld!"); // HelloWorld! => Hello
															//                World!
		// '\r' : 줄 바꿈, 커서가 행의 앞으로 이동.
		System.out.println("HelloWorld! => Hello\rWorld!"); // HelloWorld! => Hello
                                                            //                World!
		// '\'' : 작은 따옴표.
		System.out.println("HelloWorld! => \'HelloWorld!\'"); // HelloWorld! => 'HelloWorld!'
		// '\"' : 큰 따옴표.
		System.out.println("HelloWorld! => \"HelloWorld!\""); // HelloWorld! => "HelloWorld!"
		
		// ASCII코드로 출력.
		char A = 65;
		System.out.println(A + '\n'); // A
// ----------------------------------------------------------------------------------------------------------------------------
		/* 
		 * 정수형 공통 사항
		 * 1. 부호(+,-)가 있는 정수(2의 보수)를 가지며, 소수 부분이 없는 수를 의미한다.
		 * 2. 표현 범위를 벗어나면 Overflow 또는 Underflow가 발생해 전혀 다른 값이 저장될 수 있다.
		 * 3. 정수 리터럴은 2진수(Binary), 10진수(Decimal), 16진수(Hexadecimal) 숫자 시스템으로 표현할 수 있다(접두사 0x는 16진수이고 0b는 2진수이다).
		 * 4. JavaSE7 이상에서는 숫자 사이에 밑줄(_)을 넣을 수 있다(코드의 가독성 향상).
		 */
		
		/*
		 * byte(정수형)
		 * 1. 메모리 절감이 중요한 대규모 Array에서 메모리를 저장하는데 유용할 수 있다.
		 */
		// 올바른 사용법.
		byte b_min = -128, b_max = 127;
		System.out.printf("%d, %d", b_min, b_max);
		
		// 표현 범위 외 다른 값 할당 시 Error.
		// byte b1 = 128; // java.lang.Error(compile error) : Type mismatch: cannot convert from int to byte
		// byte b2 = asdf; // java.lang.Error(compile error) : asdf cannot be resolved to a variable
// ----------------------------------------------------------------------------------------------------------------------------
		/*
		 * short(정수형)
		 * 1. 메모리 절감이 중요한 대규모 Array에서 메모리를 저장하는데 유용할 수 있다.
		 */
	}
}