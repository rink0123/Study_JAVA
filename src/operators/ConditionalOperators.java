package operators;

/**
 * <h3>조건부 연산자(Conditional Operators)</h3>
 * 
 * <h4>참고 사이트</h4>
 * <ul>
 * <li><a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html">Java Tutorials - Equality, Relational, and Conditional Operators</a></li>
 * <li><a href="http://www.tcpschool.com/java/java_operator_logic">TCP School > JAVA > 16) 논리 연산자</a></li>
 * <li><a href="http://www.tcpschool.com/java/java_operator_etc">TCP School > JAVA > 18) 기타 연산자</a></li>
 * </ul>
 * 
 * @since JDK 11
 * @version 1.0.0.RELEASE
 * @author 강민성
 */
public class ConditionalOperators {

	public static void main(String[] args) {
		/* 
		 * 조건부 연산자(Conditional Operators) (&&, ||, 조건식 ? 반환값1 : 반환값2)
		 * 1. 주어진 논리식을 판단하여, 참(true)과 거짓(false)을 결정.
		 * 2. AND 연산과 OR 연산은 두 개의 피연산자를 가지는 이항 연산자.
		 * 3. NOT 연산자는 피연산자가 단 하나뿐인 단항 연산자.
		 * 4. 주로 조건문(if)에 사용된다.
		 */
		
		int co1 = 1;
		int co2 = 2;

		// 논리 AND(&&).
		if(co1 == 1 && co2 == 2) // true면 실행, false면 종료.
			System.out.println("co1 값이 1이고 co2 값이 2이면"); // co1 값이 1이고 co2 값이 2이면
		
		// 논리 OR(||).
		if(co1 == 1 || co2 == 1) // true면 실행, false면 종료.
			System.out.println("co1 값이 1이거나 co2 값이 1이면"); // co1 값이 1이거나 co2 값이 1이면
		
		// 삼항(조건식 ? 반환값1 : 반환값2).
		// co1 값이 co2 값보다 초과일 경우 co1, 아닐경우 co2.
		System.out.println(co1 > co2 ? co1 : co2); // 2
		
	}
}