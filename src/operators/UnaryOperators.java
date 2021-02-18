package operators;

/**
 * <h3>단항 연산자(Unary Operators)</h3>
 * 
 * <h4>참고 사이트</h4>
 * <ul>
 * <li><a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html">
 * Java Tutorials > Language Basics > Operators > Assignment, Arithmetic, and Unary Operators</a></li>
 * <li><a href="http://www.tcpschool.com/java/java_operator_incAndDec">TCP School > JAVA > 14) 증감 연산자</a></li>
 * </ul>
 * 
 * @since JDK 11
 * @version 1.0.0.RELEASE
 * @author 강민성
 */
public class UnaryOperators {

	public static void main(String[] args) {
		/* 
		 * 단항 연산자(Unary Operators) (++n, --n, n++, n--, +n, -n, !n)
		 * 1. 피연산자가 하나만 필요하다.
		 * 2. 값을 1씩 증가/감소, 표현식 부정 또는 boolean 값 반전과 같은 다양한 작업을 수행한다.
		 */
		
		// 후위 증감(n++, n--).
		int una1 = 1;
		// 변수값을 이후에 증감시키는 것이기 때문에 바로 증감된 값을 보여주는게 아닌 다음 변수값을 요청할 때 증감되어 있는 것이다.
		System.out.println(una1++ + " => " + una1); // 1 => 2
		System.out.println(una1-- + " => " + una1); // 2 => 1
		
		// 전위 증감(++n, --n).
		int una2 = 1;
		// 변수값을 이전에 증감시키는 것이기 때문에 바로 증감된 값을 보여준다.
		System.out.println(++una2 + " => " + una2); // 2 => 2
		System.out.println(--una2 + " => " + una2); // 1 => 1
		
		// 부호(+, -).
		int una3 = +1, una4 = -1;
		System.out.println(una3 + ", " + una4); // 1, -1
		
		// 논리 NOT(!).
		boolean una5 = true;
		// true, false를 반전시킨다.
		System.out.println(una5 + " => " + !una5); // true => false
	}
}