package ControlFlowStatements;

/**
 * <h3>분기문(Branching Statements)</h3>
 * 
 * <h4>참고 사이트</h4>
 * <ul>
 * <li><a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/branch.html">
 * Java Tutorials > Language Basics > Control Flow Statements > Branching Statements</a></li>
 * <li><a href="http://www.tcpschool.com/java/java_control_etc">TCP School > JAVA > 21) 기타 제어문</a></li>
 * </ul>
 * 
 * @since JDK 11
 * @version 1.0.0.RELEASE
 * @author 강민성
 */
public class BranchingStatements {
	/* 
	 * loop의 제어
	 * 일반적으로 조건식의 검사를 통해 loop로 진입하면, 다음 조건식을 검사하기 전까지 loop 안에 있는 모든 명령문을 실행한다.
	 * 하지만 continue문과 break문은 이러한 일반적인 loop의 흐름을 사용자가 직접 제어할 수 있도록 도와준다.
	 */
	public static void main(String[] args) {
		/* 
		 * break문
		 * 1. loop 내에서 사용하여 해당 반복문을 완전히 종료시킨 뒤, 반복문 바로 다음에 위치한 명령문을 실행한다.
		 *    즉, loop 내에서 조건식의 판단 결과와 상관없이 해당 반복문을 완전히 빠져나가고 싶을 때 사용한다.
		 * 2. break문은 label이 있는 것과 없는 것, 두 가지 형식으로 나눠진다.
		 * 3. label이 있는 break문은 외부 종료가 가능하며 label이 없는 break문은 내부 종료만 가능하다. 
		 */
		
		// break문을 활용한 무한 loop 종료.
		int num = 1, sum = 0;
		while (true) { // 무한 루프
			sum += num;
			if (num == 100)
				break;
			num++;
		}
		System.out.println(sum);
		// 결과: 5050
		
		// break문을 활용한 원하는 배열값 찾기.
		int[] arrayOfInts = { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };
		int searchfor = 12;
		int cnt;
		boolean foundIt = false;
		for (cnt = 0; cnt < arrayOfInts.length; cnt++) {
			if (arrayOfInts[cnt] == searchfor) {
				foundIt = true;
				break;
			}
		}
		if (foundIt)
			System.out.println("Found " + searchfor + " at index " + cnt);
		else
			System.out.println(searchfor + " not in the array");
		// 결과: Found 12 at index 4
// -----------------------------------------------------------------------------------------------------------------
		/* 
		 * continue문
		 * 1. label이 없는 continue문은 가장 안쪽 loop 본문의 끝으로 건너뛰고 다음 조건식으로 넘어간다.
		 * 2. label이 있는 continue문은 주어진 label로 표시된 외부 loop의 현재 반복을 건너 뛴다.
		 * 3. 보통 반복문 내에서 특정 조건에 대한 예외 처리를 하고자 할 때 자주 사용.
		 */
		
		// continue문을 활용한 알파벳 p의 갯수 파악.
		String searchMe = "peter piper picked a " + "peck of pickled peppers";
		int max = searchMe.length();
		int numPs = 0;
		for (int i = 0; i < max; i++) {
			if (searchMe.charAt(i) != 'p')
				continue;
			numPs++;
		}
		System.out.println("Found " + numPs + " p's in the string.");
		// 결과: Found 9 p's in the string.
// -----------------------------------------------------------------------------------------------------------------
		/* 
		 * label문
		 * 1. 여러 반복문이 중첩된 상황에서 한 번에 모든 반복문을 빠져나가거나, 특정 반복문까지만 빠져나가고 싶을 때 사용.
		 * 2. 이름과 반복문의 키워드 사이에 명령문이 존재하면, compile error 발생.
		 */
		
		// 반복문에서 label을 이용한 continue문 제어.
		lc: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j >= 3) {
					continue lc; // label이 지정된 for(i) 끝으로 이동하고 반복문을 계속 진행하므로
					             // for(j) 3번 라인은 실행되지 않는다.
				}
				System.out.printf("%d%d ", i, j);
			}
			System.out.println("for(j) end");
		}
		System.out.println();
		// 결과: 
		// continue label 없을 때.
		// 00 01 02 03 04 for(j) end
		// 10 11 12 13 14 for(j) end
		// 20 21 22 23 24 for(j) end
		// 30 31 32 33 34 for(j) end
		// 40 41 42 43 44 for(j) end
		// continue all; 있을 때.
		// 00 01 02 10 11 12 20 21 22 30 31 32 40 41 42
		
		lb: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j >= 3) {
					break lb; // label이 지정된 for(i) 반복문을 종료.
				}
				System.out.printf("%d%d ", i, j);
			}
		}
		System.out.println();
		// 결과:
		// break label 없을 때.
		// 00 01 02 03 04 10 11 12 13 14 20 21 22 23 24 30 31 32 33 34 40 41 42 43 44
		// break label 있을 때.
		// 00 01 02
// -----------------------------------------------------------------------------------------------------------------
		/* 
		 * return문
		 * 1. 주로 class 내 어떤 method가 실행되고 해당 method 실행에 따라 나온 값을 호출한 곳에서 반환함과 동시에 method를 종료시킨다.
		 *    쉽게 말해, 반환 타입을 가지는 method는 값 반환 후 종료, 반환 타입이 없는 void method에는 그냥 종료이다.
		 * 2. return method는 마지막 끝맺음으로 무조건 return문이 있어야 하며 해당 method 내 return은 한 번만 동작한다.
		 * 3. method 내 조건문을 통해 다중 return문 선언이 가능하다. 왜냐면 2번 조건에 의해 중복적으로 실행될 가능성이 없기 때문이다.
		 */
		System.out.println(num(1));
		// 결과: one
	}
	public static String num(int i) {
		if(i == 0)
			return "zero";
		else if(i == 1)
			return "one";
		else if(i == 2)
			return "two";
		// else문이 결론적인 역할을 담당하기에 Java program이 method의 결과로 인식하여 error가 발생하지 않는다.
		// 반대로 else if문으로 되있다면 결과를 반환해야 한다는 error가 발생한다.
		else
			return "none";
		// return "none"; // else가 없다면 method에 결론적인 return문을 명시해야 한다.
	}
}