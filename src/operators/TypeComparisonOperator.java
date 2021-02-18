package operators;

import java.util.ArrayList;

import javax.management.AttributeList;

/**
 * <h3>유형 비교 연산자(Type Comparison Operator)</h3>
 * 
 * <h4>참고 사이트</h4>
 * <ul>
 * <li><a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html">
 * Java Tutorials > Language Basics > Operators > Equality, Relational, and Conditional Operators</a></li>
 * <li><a href="http://www.tcpschool.com/java/java_operator_etc">TCP School > JAVA > 18) 기타 연산자</a></li>
 * </ul>
 * 
 * @since JDK 11
 * @version 1.0.0.RELEASE
 * @author 강민성
 */
public class TypeComparisonOperator {

	public static void main(String[] args) {
		/* 
		 * 유형 비교 연산자(Type Comparison Operator) (인스턴스명 instanceof 클래스 또는 인터페이스명)
		 * 1. 지정된 형식으로 객체 타입을 비교.
		 * 2. 형변환 가능 여부를 확인하며 boolean 값으로 결과를 반환.
		 * 3. 참조 변수가 참조하고 있는 인스턴스의 실제 타입을 반환.
		 *    즉, 해당 객체가 어떤 클래스나 인터페이스로부터 생성되었는지를 판별해 주는 역할을 한다.
		 */
		
		ArrayList<Object> arrList = new ArrayList<Object>();
		AttributeList attList = new AttributeList();
		
		// 객체 arrList는 자기 자신의 객체이기 때문에 형변환 가능.
		// 요약: 부모클래스 -> 부모클래스 형변환 가능.
		System.out.println(arrList instanceof ArrayList); // true
		
		// 객체 attList는 ArrayList의 자식 객체이기 때문에 ArrayList로 형변환 가능.
		// 요약: 자식클래스 -> 부모클래스 형변환 가능.
		System.out.println(attList instanceof ArrayList); // true
		
		// 객체 arrList는 AttributeList의 부모 객체이기 때문에 형변환 불가능.
		// 요약: 부모클래스 -> 자식클래스 형변환 불가능.
		System.out.println(arrList instanceof AttributeList); // false
		
		// 객체 attList는 자기 자신의 객체이기 때문에 형변환 가능.
		// 요약: 자식클래스 -> 자식클래스 형변환 가능.
		System.out.println(attList instanceof AttributeList); // true
	}
}