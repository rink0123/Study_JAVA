package operators;

/**
 * <h3>비교, 관계 연산자(Equality, Relational Operators)</h3>
 * 
 * <h4>참고 사이트</h4>
 * <ul>
 * <li><a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html">Java Tutorials - Equality, Relational, and Conditional Operators</a></li>
 * <li><a href="http://www.tcpschool.com/java/java_operator_comparison">TCP School > JAVA > 15) 비교 연산자</a></li>
 * </ul>
 * 
 * @since JDK 11
 * @version 1.0.0.RELEASE
 * @author 강민성
 */
public class EqualityRelationalOperators {

	public static void main(String[] args) {
		/* 
		 * 비교, 관계 연산자(Equality, Relational Operators) (==, !=, >, <, >=, <=)
		 * 1. 한 피연산자가 다른 피연산자보다 크거나 작거나 같거나 같지 않은지 여부를 결정.
		 * 2. 비교, 관계 연산 시 boolean값으로 return된다.
		 * 3. 주로 조건문(if)에 사용된다.
		 * 4. 사실상 값:값으로 어떤것을 기준으로 비교하냐에 따라 미만/초과, 이하/이상이 결정되는 것이지
		 *    홑화살괄호(<>)에 미만/초과, 이하/이상이 정해져 있는게 아니다.
		 */
		
		int ero1 = 1, ero2 = 2;
		// 관계 같음(==).
		System.out.println(ero1 == ero2); // 1 = 2 -> false
		// 관계 같지 않음(!=).
		System.out.println(ero1 != ero2); // 1 ≠ 2 -> true
		// 관계 미만(<).
		System.out.println(ero1 < ero2); // 1 < 2 -> true
		// 관계 초과(>).
		System.out.println(ero1 > ero2); // 1 > 2 -> false
		// 관계 이하(<=).
		System.out.println(ero1 <= ero2); // 1 ≤ 2 -> true
		// 관계 이상(>=).
		System.out.println(ero1 >= ero2); // 1 ≥ 2 -> false
		
		char ero3 = 'a', ero4 = 'A';
		/*
		 * 일반적으로 영문자 'A'와 'a' 중에서 더 큰 문자는 'A'일 거라고 생각하기 쉽다.
		 * 하지만 ASCII코드에서 'A'는 10진수 65로 나타내며, 'a'는 10진수 97로 나타낸다.
		 * 따라서 두 문자를 비교하면 'a'가 더 크다는 결과가 나오게 되는 것이다.
		 * 모든 영문 대문자의 ASCII코드 값은 모든 영문 소문자보다 작은 값을 가진다.
		 */
		System.out.println(ero3 == ero4); // false
		System.out.println(ero3 > ero4); // true
	}
}