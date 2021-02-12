package variables;
/*
 * 참고 사이트
 * [Java Tutorials - Variables] https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 * [위키백과 - 원시 자료형] https://ko.wikipedia.org/wiki/%EC%9B%90%EC%8B%9C_%EC%9E%90%EB%A3%8C%ED%98%95
 * [위키백과 - Primitive wrapper class in Java] https://en.wikipedia.org/wiki/Primitive_wrapper_class_in_Java
 * [TCP School > JAVA > 8) 상수] http://www.tcpschool.com/java/java_datatype_constant
 * [TCP School > JAVA > 9) 기본 자료] http://www.tcpschool.com/java/java_datatype_basic
 * [TCP School > JAVA > 10) 실수의 표현] http://www.tcpschool.com/java/java_datatype_floatingPointNumber
 */

/*
 * 1. 기본 자료형(Primitive Data Type)이란
 * 1.1. Java에서는 여러 형태의 타입을 미리 정의하여 제공하고 있는데, 이것을 기본 자료형(Primitive Data Type)이라고 한다.
 * 1.2. Data Type은 해당 데이터가 메모리에 어떻게 저장되고, 프로그램에서 어떻게 처리되어야 하는지를 명시적으로 알려주는 역할을 한다.
 * 1.3. Java의 기본 자료형은 8종류로 크게 정수형, 실수형, 문자형, 논리형으로 나눌 수 있다.
 * 
 * 2. 리터럴(Literal)
 * 2.1. 고정 값의 소스 코드 표현이며, 계산하지 않고도 코드에 직접 표시된다. 즉, 그 자체로 값을 의미하는 것.
 * (ex. int var = 30; // 30이 바로 리터럴임.)
 */
public class PrimitiveDataType {

	public static void main(String[] args) {
		/*
		 * 논리형(boolean, default=false)
		 * 1. 참/거짓 조건을 추적하는 간단한 Flag에 사용한다.
         * 2. 메모리 크기는 1byte를 나타내지만 사용하는 CPU마다 다르기 때문에 정확한 bit의 크기는 알 수 없다.
		 */
		boolean bf = false, bt = true;
        System.out.println(bf); // false
        System.out.println(bt); // true
        
		/* 
		 * 문자형(char)
		 * 1. 문자 하나를 표현할 수 있는 타입.
         * 2. Unicode를 사용하며 문자를 표현한다(ASCII코드로도 표현할 수 있다).
         * 3. char 및 String 리터럴에 Unicode Escape와 Escape Sequence를 지원한다.
         * 4. char 값은 따옴표('') 안에 한 글자만 작성이 가능하다(Unicode 제외).
		 */
        char ch_nmin = 0, ch_nmax = 65535;
        char ch_umin = '\u0000', ch_umax = '\uffff';
        
        // Unicode or 숫자로 초기화 한 것은 Console창에 쉼표(,)말곤 안 나온다.
        System.out.printf("char 표현범위(숫자) : MIN=%s, MAX=%s\n", ch_nmin, ch_nmax);
        System.out.printf("char 표현범위(Unicode) : MIN=%s, MAX=%s\n", ch_umin, ch_umax);
        
		/*
		 * 정수형(byte, short, int, long)
		 */
	}
}