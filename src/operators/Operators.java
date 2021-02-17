package operators;

/**
 * <h3>연산자(Operators)</h3>
 * 
 * <h4>참고 사이트</h4>
 * <ul>
 * <li><a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html">Java Tutorials - Operators</a></li>
 * <li><a href="http://www.tcpschool.com/java/java_operator_arithmetic">TCP School > JAVA > 12)산술연산자</a></li>
 * </ul>
 * 
 * @since JDK 11
 * @version 1.0.0.RELEASE
 * @author 강민성
 */
public class Operators {
	/* 
	 * 1. 연산자
	 * 1.1. 피연산자에 대해 특정 연산을 수행한 다음 결과를 반환하는 특수 기호.
	 *      * 피연산자 : 연산에 참여하는 변수나 상수.
	 * 
	 * 
	 * 2. JAVA에서 제공하는 대표적인 연산자.
	 *    (한국식으로 나눈 것이지 3번항이 공식 홈페이지 기준이다)
	 * 2.1. 산술 연산자(arithmetic operator)
	 *      (+, -, *, /, %) 
	 * 2.2. 대입 연산자(assignment operator)
	 *      (=, +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>=)
	 * 2.3. 증감 연산자(increment and decrement operators)
	 *      (++n, --n, n++, n--)
	 * 2.4. 비교 연산자(comparison operator)
	 *      (==, !=, >, <, >=, <=)
	 * 2.5. 논리 연산자(logical operator)
	 *      (&&, ||, !)
	 * 2.6. 비트 연산자(bitwise operator)
	 *      (&, |, ^, ~, <<, >>, >>>)
	 * 2.7. 삼항 연산자(ternary operator)
	 *      (조건식 ? 반환값1 : 반환값2)
	 * 2.8. instanceof 연산자
	 *      (인스턴스 이름 instanceof 클래스 이름 또는 인터페이스 이름)
	 * 
	 * 
	 * 3.JAVA 연산자의 우선 순위와 결합 방향.
	 * 3.1 아래표에서 나온 순서대로 우선 순위가 빠른 연산자가 가장 먼저 실행.
	 *     또한, 같은 우선 순위를 가지는 연산자가 둘 이상 있을 때에는 결합 방향에 따라 실행 순서가 결정.
	 *     (최우선 종류와 (type)이 없어 직접 추가)
	 * 우선순위  연산자  설명  결합방향
     *    1      ()          괄호                      왼쪽에서 오른쪽으로
     *           .           참조                      왼쪽에서 오른쪽으로
     *           []          배열 첨자                  왼쪽에서 오른쪽으로
     *    2      n++, n--    후위 증감                  왼쪽에서 오른쪽으로
     *    3      ++n, --n    전위 증감                   오른쪽에서 왼쪽으로
     *           +, -        양, 음의 부호(단항)         오른쪽에서 왼쪽으로
     *           ~           비트 NOT                   오른쪽에서 왼쪽으로
     *           !           논리 NOT                   오른쪽에서 왼쪽으로
     *           (cast)      형변환                     오른쪽에서 왼쪽으로
     *    4      *, /, %     곱셉, 나눗셈, 나머지        왼쪽에서 오른쪽으로
     *    5      +, -        덧셈, 뺄셈(이항)            왼쪽에서 오른쪽으로
     *    6      <<          부호있는 비트 왼쪽 시프트	왼쪽에서 오른쪽으로
     *           >>          부호있는 비트 오른쪽 시프트  왼쪽에서 오른쪽으로
     *           >>>         부호없는 비트 오른쪽 시프트  왼쪽에서 오른쪽으로
     *    7      <, >        관계(미만, 초과)            왼쪽에서 오른쪽으로
     *           <=, >=      관계(이하, 이상)            왼쪽에서 오른쪽으로
     *           instanceof  인스턴스 타입 비교 반환      왼쪽에서 오른쪽으로
     *    8      ==          관계(같은)	왼쪽에서 오른쪽으로
     *           !=          관계(같지 않은)	왼쪽에서 오른쪽으로
     *    9      &           비트 AND	왼쪽에서 오른쪽으로
     *    10     ^           비트 XOR	왼쪽에서 오른쪽으로
     *    11     |           비트 OR	왼쪽에서 오른쪽으로
     *    12     &&          논리 AND	왼쪽에서 오른쪽으로
     *    13     ||          논리 OR	왼쪽에서 오른쪽으로
     *    14     ? :         삼항 조건	오른쪽에서 왼쪽으로
     *    15     =           대입 및 복합 대입
     *                       (+=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=)	오른쪽에서 왼쪽으로
	 */
	public static void main(String[] args) {
		byte a = -8;
		byte b = 3;
		System.out.println(a>>b);
		System.out.println(a>>>b);
	}
}