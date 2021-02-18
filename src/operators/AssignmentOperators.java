package operators;

/**
 * <h3>할당 연산자(Assignment Operators)</h3>
 * 
 * <h4>참고 사이트</h4>
 * <ul>
 * <li><a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html">Java Tutorials - Assignment, Arithmetic, and Unary Operators</a></li>
 * <li><a href="http://www.tcpschool.com/java/java_operator_assignment">TCP School > JAVA > 13) 대입 연산자</a></li>
 * </ul>
 * 
 * @since JDK 11
 * @version 1.0.0.RELEASE
 * @author 강민성
 */
public class AssignmentOperators {

	public static void main(String[] args) {
		/* 
		 * 할당 연산자(Assignment Operator) (=, +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>=)
		 * 1. 오른쪽의 값 또는 계산식을 왼쪽의 피연산자에 할당.
		 * 2. 세세하게 나누면 '='는 단순 대입이고 나머지는 복합 대입이라 말한다.
		 * 3. 복합 대입은 값을 먼저 할당한 후에 복합 대입을 사용할 수 있다.
		 */
		
		// 단순 대입(=).
		int ass1 = 10;
		System.out.println(ass1); // 10
		
		// 복합 대입_덧셈(+=).
		int ass2 = 10;
		ass2 += 1; // int ass2 = 10 + 1;
		System.out.println(ass2); // 11
		
		// 복합 대입_뺄셈(-=).
		int ass3 = 10;
		ass3 -= 1; // int ass2 = 10 - 1;
		System.out.println(ass3); // 9
		
		// 복합 대입_곱셈(*=).
		int ass4 = 10;
		ass4 *= 2; // int ass2 = 10 * 2;
		System.out.println(ass4); // 20
		
		// 복합 대입_나눗셈(/=).
		int ass5 = 10;
		ass5 /= 2; // int ass2 = 10 / 2;
		System.out.println(ass5); // 5
		
		// 복합 대입_나눈 나머지(%=).
		int ass6 = 10;
		ass6 %= 3; // int ass2 = 10 % 3;
		System.out.println(ass6); // 1
		
		// 복합 대입_비트 AND(&=).
		int ass7 = 8;
		ass7 &= 3; // 2진 AND 연산.
		/* 
		 * 10진수 -> 2진수 변환 및 계산 -> 10진수 반환.
		 *     2^7 2^6 2^5 2^4 2^3 2^2 2^1 2^0
		 *      0   0   0   0   1   0   0   0 = 8
		 * &(x) 0   0   0   0   0   0   1   1 = 3
		 * ---------------------------------------
		 *      0   0   0   0   0   0   0   0 = 0
		 */
		System.out.println(ass7); // 0
		
		// 복합 대입_비트 OR(|=).
		// 일반 수학으로 1+1=2가 아닌 기계어로 연산 처리하기 때문에 1+1=1이다.
		int ass8 = 8;
		ass8 |= 3; // 2진 OR 연산.
		/* 
		 * 10진수 -> 2진수 변환 및 계산 -> 10진수 반환.
		 *     2^7 2^6 2^5 2^4 2^3 2^2 2^1 2^0
		 *      0   0   0   0   1   0   0   0 = 8
		 * |(+) 0   0   0   0   0   0   1   1 = 3
		 * ---------------------------------------
		 *      0   0   0   0   1   0   1   1 = 11
		 */
		System.out.println(ass8); // 11
		
		// 복합 대입_비트 XOR(^=).
		int ass9 = 15;
		ass9 ^= 9; // 2진 XOR 연산.
		/* 
		 * 10진수 -> 2진수 변환 및 계산 -> 10진수 반환.
		 *     2^7 2^6 2^5 2^4 2^3 2^2 2^1 2^0
		 *      0   0   0   0   1   1   1   1 = 15
		 * ^(-) 0   0   0   0   1   0   0   1 = 9
		 * ---------------------------------------
		 *      0   0   0   0   0   1   1   0 = 6
		 */
		System.out.println(ass9); // 6
		
		// 복합 대입_부호 있는 비트 왼쪽 시프트(<<=).
		int ass10 = 15;
		ass10 <<= 1; // 1비트 왼쪽 이동.
		/* 
		 * 10진수 -> 2진수 변환 및 계산 -> 10진수 반환.
		 * 2^7 2^6 2^5 2^4 2^3 2^2 2^1 2^0
		 *  0   0   0   0   1   1   1   1 = 15
		 * ------------------------------------
		 *  0   0   0   1   1   1   1   0 = 30
		 */
		System.out.println(ass10); // 30
		
		// 복합 대입_부호 있는 비트 오른쪽 시프트(>>=).
		int ass11 = 15;
		ass11 >>= 1; // 1비트 오른쪽 이동.
		/* 
		 * 10진수 -> 2진수 변환 및 계산 -> 10진수 반환.
		 * 2^7 2^6 2^5 2^4 2^3 2^2 2^1 2^0
		 *  0   0   0   0   1   1   1   1 = 15
		 * ------------------------------------
		 *  0   0   0   0   0   1   1   1 = 7
		 */
		System.out.println(ass11); // 7
		
		// 복합 대입_부호 없는 비트 오른쪽 시프트(>>>=).
		int ass12 = 15;
		ass12 >>>= 1; // 1비트 오른쪽 이동.
		/* 
		 * 10진수 -> 2진수 변환 및 계산 -> 10진수 반환.
		 * 2^7 2^6 2^5 2^4 2^3 2^2 2^1 2^0
		 *  0   0   0   0   1   1   1   1 = 15
		 * ------------------------------------
		 *  0   0   0   0   0   1   1   1 = 7
		 */
		System.out.println(ass12); // 7
	}
}