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
	 * 2.2. 대입 연산자(Assignment Operator)
	 *      (=, +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>=)
	 * 2.1. 산술 연산자(Arithmetic Operators)
	 *      (+, -, *, /, %) 
	 * 2.3. 단항 연산자(Unary Operators)
	 *      (++n, --n, n++, n--, +n, -n, !n)
	 * 2.4. 비교 연산자(Equality and Relational Operators)
	 *      (==, !=, >, <, >=, <=)
	 * 2.5. 조건부 연산자(Conditional Operators) (논리 연산자라고도 함)
	 *      (&&, ||, 조건식 ? 반환값1 : 반환값2)
	 * 2.8. 유형 비교 연산자(Type Comparison Operator)
	 *      (인스턴스명 instanceof 클래스명(or 인터페이스명))
	 * 2.6. 비트 연산자(Bitwise and Bit Shift Operators)
	 *      (&, |, ^, ~, <<, >>, >>>)
	 * 
	 * 
	 * 3.JAVA 연산자의 우선 순위와 결합 방향.
	 * 3.1 아래표에서 나온 순서대로 우선 순위가 빠른 연산자가 가장 먼저 실행.
	 *     또한, 같은 우선 순위를 가지는 연산자가 둘 이상 있을 때에는 결합 방향에 따라 실행 순서가 결정.
	 * 3.2. 단항(unary), 대입 및 복합 대입(assignment)을 제외한 나머지는 결합 방향이 왼쪽에서 오른쪽이다.
	 *      (최우선 종류와 (type)이 없어 직접 추가)
	 * 
     * 우선순위   연산자종류                        기호
     * 1          최우선                           괄호: (), 참조: ., 배열첨자: []
     * 2          후위형(postfix)                  후위 증감: n++, n--
     * 3          단항(unary)                      전위 증감: ++n, --n, 부호: +, -, 비트NOT: ~, 논리NOT: !, 타입 캐스트((cast))
     * 4          승제(multiplicative)             곱셈: *, 나눗셈: /, 나머지: %
     * 5          가감(additive)                   덧셈/뺄셈(이항): +, -
     * 6          시프트(shift)                    부호있는 비트 좌/우 시프트: <<, >>, 부호없는 비트 오른쪽 시프트: >>>
     * 7          관계(relational)                 관계 미만/초과/이하/이상: <, >, <=, >=, 인스턴스 타입 비교: instanceof
     * 8          등가(equality)                   관계 같은/같지 않은: ==, !=
     * 9          비트 AND(bitwise AND)            &
     * 10         비트 XOR(bitwise exclusive OR)   ^
     * 11         비트 OR(bitwise inclusive OR)    |
     * 12         논리 AND(logical AND)            &&
     * 13         논리 OR(logical OR)              ||
     * 14         삼항(ternary)                    ? :
     * 15         할당(assignment)                 =, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=
     * 
     * 
     * 4. JAVA는 Interpreter 방식으로 연산 처리한다.
     * 4.1. Interpreter란 고급 언어로 작성된 원시코드 명령어들을 한번에 한 줄씩 읽어들여서 실행하는 프로그램이다.
     * 4.2. 가장 일반적인 실행 방법으로 컴파일로 읽는 방식은 위에서 아래로, 왼쪽에서 오른쪽으로 순차적으로 인식&처리한다.
	 */
}