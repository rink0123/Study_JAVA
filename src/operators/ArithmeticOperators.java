package operators;

/**
 * <h3>산술 연산자(Arithmetic Operators)</h3>
 * 
 * <h4>참고 사이트</h4>
 * <ul>
 * <li><a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html">
 * Java Tutorials > Language Basics > Operators > Assignment, Arithmetic, and Unary Operators</a></li>
 * <li><a href="http://www.tcpschool.com/java/java_operator_arithmetic">TCP School > JAVA > 12) 산술 연산자</a></li>
 * </ul>
 * 
 * @since JDK 11
 * @version 1.0.0.RELEASE
 * @author 강민성
 */
public class ArithmeticOperators {

	public static void main(String[] args) {
		/* 
		 * 산술 연산자(Arithmetic Operators) (+, -, *, /, %)
		 * 1. +, -, *, /는 보통 아는 사칙 연산과 같다.
		 * 2. %는 피연산자를 다른 피연산자로 나누고 그 결과로 나머지를 반환하는 기호이다.
		 */
		
		int ari1 = 4, ari2 = 3;
		System.out.println(ari1 + ari2); // 덧셈(+). 7
		System.out.println(ari1 - ari2); // 뺄셈(-). 1
		System.out.println(ari1 * ari2); // 곱셈(*). 12
		System.out.println(ari1 / ari2); // 나눗셈(/). 1
		System.out.println(ari1 % ari2); // 나머지(%). 1
		// 정수형 + "문자열" + 정수형 + "문자열" + (정수형 + 정수형)
		System.out.println(ari1 + "+" + ari2 + "=" + (ari1 + ari2)); // 4+3=7
		
		int ari3 = 10, ari4 = 20;
		String ari5 ="30";
		// 문자형 or 문자열과 정수형이 더할 시 하나의 문자형으로 합쳐진다.
		// 덧셈 외 다른 연산자로 계산 시 error가 발생한다.
		// 문자열+정수형+정수형=문자열정수형정수형 => 문자열.
		System.out.println(ari5 + ari4 + ari3); // 301020
		// 문자열+(정수형+정수형)=> 문자열+정수형 => 문자열정수형 => 문자열.
		System.out.println(ari5 + (ari4 + ari3)); // 3030
	}
}