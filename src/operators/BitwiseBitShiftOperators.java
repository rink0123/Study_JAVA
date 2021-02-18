package operators;

/**
 * <h3>비트 및 비트 시프트 연산자(Bitwise and Bit Shif tOperators)</h3>
 * 
 * <h4>참고 사이트</h4>
 * <ul>
 * <li><a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op3.html">Java Tutorials - Bitwise and Bit Shift Operators</a></li>
 * <li><a href="http://www.tcpschool.com/java/java_operator_bitwise">TCP School > JAVA > 17) 비트 연산자</a></li>
 * </ul>
 * 
 * @since JDK 11
 * @version 1.0.0.RELEASE
 * @author 강민성
 */
public class BitwiseBitShiftOperators {

	public static void main(String[] args) {
		/* 
		 * 비트 및 비트 시프트 연산자(Bitwise and Bit Shif tOperators) (&, |, ^, ~, <<, >>, >>>)
		 * 1. 논리 연산자와 비슷하지만, 비트(bit) 단위로 논리 연산을 할 때 사용하는 연산자.
		 * 2. 비트 단위로 왼쪽이나 오른쪽으로 전체 비트를 이동하거나, 1의 보수를 만들 때도 사용.
		 */
		
		int bbso1 = 15;
		int bbso2 = 1;
		
		/* 
		 * 비트 AND(&).
		 * 10진수 -> 2진수 변환 및 계산 -> 10진수 반환.
		 *     2^7 2^6 2^5 2^4 2^3 2^2 2^1 2^0
		 *      0   0   0   0   1   1   1   1 = 15
		 * &(x) 0   0   0   0   0   0   0   1 = 1
		 * ---------------------------------------
		 *      0   0   0   0   0   0   0   1 = 1
		 */
		System.out.println(bbso1 & bbso2); // 1
		
		/* 
		 * 비트 OR(|).
		 * 일반 수학으로 1+1=2가 아닌 기계어로 연산 처리하기 때문에 1+1=1이다.
		 * 
		 * 10진수 -> 2진수 변환 및 계산 -> 10진수 반환.
		 *     2^7 2^6 2^5 2^4 2^3 2^2 2^1 2^0
		 *      0   0   0   0   1   1   1   1 = 15
		 * |(+) 0   0   0   0   0   0   0   1 = 1
		 * ---------------------------------------
		 *      0   0   0   0   1   1   1   1 = 15
		 */
		System.out.println(bbso1 | bbso2); // 15
		
		/* 
		 * 비트 XOR(^).
		 * 10진수 -> 2진수 변환 및 계산 -> 10진수 반환.
		 *     2^7 2^6 2^5 2^4 2^3 2^2 2^1 2^0
		 *      0   0   0   0   1   1   1   1 = 15
		 * ^(-) 0   0   0   0   0   0   0   1 = 1
		 * ---------------------------------------
		 *      0   0   0   0   1   1   1   0 = 14
		 */
		System.out.println(bbso1 ^ bbso2); // 14
		
		/* 
		 * 비트 NOT, 1의 보수(^).
		 * 
		 * 
		 * 10진수 -> 2진수 변환 및 계산 -> 10진수 반환.
		 * 2^7 2^6 2^5 2^4 2^3 2^2 2^1 2^0
		 * 1)   0   0   0   0   1   1   1   1 = 15
		 * 2) - 1   1   1   1   0   0   0   0 = -240
		 * 
		 * - 1   1   1   1   0   0   0   0 = 240
		 *   0   0   0   0   0   0   0   1
		 * -----------------------------------------------
		 * (부호 반전) 0   0   0   1   0   0   0   0 = -16
		 */
		System.out.println(~bbso1); // -16
	}
}