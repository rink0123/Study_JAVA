package ControlFlowStatements;

/**
 * <h3>반복문(Conditional Statements)</h3>
 * 
 * <h4>참고 사이트</h4>
 * <ul>
 * <li><a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html">
 * Java Tutorials > Language Basics > Control Flow Statements > The switch Statement</a></li>
 * <li><a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html">
 * Java Tutorials > Language Basics > Control Flow Statements > The while and do-while Statements</a></li>
 * <li><a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html">
 * Java Tutorials > Language Basics > Control Flow Statements > The for Statement</a></li>
 * <li><a href="http://www.tcpschool.com/java/java_control_loop">TCP School > JAVA > 20) 반복문</a></li>
 * </ul>
 * 
 * @since JDK 11
 * @version 1.0.0.RELEASE
 * @author 강민성
 */
public class IterationStatements {

	/*
	 * 반복문(iteration statements)
	 * 1. 프로그램 내에서 똑같은 명령을 일정 횟수만큼 반복하여 수행하도록 제어하는 명령문.
	 * 2. 프로그램이 처리하는 대부분의 코드는 반복적인 형태가 많으므로, 가장 많이 사용되는 제어문 중 하나이다.
	 * 3. Java에서 사용되는 대표적인 반복문의 형태.
	 *    for문
	 *    Enhanced for문
	 *    while문
	 *    do / while문
	 */
	public static void main(String[] args) {
		/*
		 * for문
		 * 1. while문과는 달리 자체적으로 초기식, 조건식, 증감식을 모두 포함하고 있는 반복문.
		 * 2. while문보다는 좀 더 간결하게 반복문을 표현할 수 있다.
		 * 3. 조건식을 기준으로 반복문을 실행하며 주로 범위가 제한되어 있는 조건에서 사용한다.
		 * 4. for (초기식; 조건식; 증감식) {
		 *        조건식의 결과가 참인 동안 반복적으로 실행하고자 하는 명령문;
		 *    }
		 *    1) 초기식; - for문의 시작값, index라고 생각하면 된다.
		 *    2) 조건식; - 조건이 true면 계속 실행한다. false면 for문을 종료한다.
		 *    3) 명령문; - 조건식이 만족하면 초기화 블록 안에 명령문을 실행한다.
		 *    4) 증감식  - 명령문이 끝나면 초기식을 증감한다.
		 */
		
		/*
		 * 백준 알고리즘-단계별로 풀어보기-for문_별 찍기 - 1(2438번).
		 * 문제: 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제.
		 * 출력: 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
		 */
		int n4 = 5;
		for (int i = 0; i < n4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 결과:
		// *
		// **
		// ***
		// ****
		// *****
		
		/*
		 * 백준 알고리즘-단계별로 풀어보기-for문_별 찍기 - 2(2439번).
		 * 문제: 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제.
		 *       하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
		 * 출력: 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
		 */
		int n5 = 5;
		for (int i = 1; i <= n5; i++) {
			for (int j = n5; j > 0; j--) {
				if (i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		// 결과:
		//     *
		//    **
		//   ***
		//  ****
		// *****
		
		// for문을 이용한 * 역피라미드(좌우 정방향).
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 결과:
		// *****
		// ****
		// ***
		// **
		// *
		
		// for문을 이용한 * 역피라미드(좌우 역방향).
		for (int i = 0; i < 5; i++) {
			for (int s = 5 - i; s < 5; s++) {
				System.out.print(" ");
			}
			for (int j = i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 결과:
		// *****
		//  ****
		//   ***
		//    **
		//     *
		
		// for문을 이용한 *피라미드(좌우 동일).
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 결과:
		//    *
		//   ***
		//  *****
		// *******
		
		/*
		 * 백준 알고리즘-단계별로 풀어보기-for문_X보다 작은 수(10871번).
		 * 문제: 정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
		 *       이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
		 * 출력: X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다.
		 *       X보다 작은 수는 적어도 하나 존재한다.
		 */
		int n6 = 10;
		int x = 5;
		int[] a = { 1, 10, 4, 9, 2, 3, 8, 5, 7, 6 };
		for (int i = 0; i < n6; i++) {
			if (a[i] < x) {
				System.out.print(a[i] + " ");
			}
		}
		System.out.println();
		// 결과: 1 4 2 3

		// n번째 피보나치 수열.
		int n7 = 10;
		int num1 = 1;
		int num2 = 1;
		int num3 = num1 + num2;
		for (int i = 4; i <= n7; i++) {
			num1 = num2;
			num2 = num3;
			num3 = num1 + num2;
		}
		System.out.println(num3);
		// 결과: 55
		
		// 100까지의 소수.
		for (int i = 2; i < 100; i++) {
			int c = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					c += 1;
			}
			if (c == 2)
				System.out.print(i + " ");
		}
		System.out.println();
		// 결과: 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
// ---------------------------------------------------------------------------------------------------------------
		/*
		 * Enhanced(향상된) for문
		 * 1. JDK 1.5부터 Enhanced for문이라는 반복문이 추가. 컬렉션 프레임워크와 배열에서 자주 사용된다.
		 * 2. 요소를 참조할 때만 사용하는 것이 좋으며, 요소의 값을 변경하는 작업에는 적합하지 않다.
		 * 3. for (타입 변수이름 : 배열 or 컬렉션 프레임워크) {
		 *        배열의 길이만큼 반복적으로 실행하고자 하는 명령문;
		 *    }
		 *    1) 명시한 배열이나 컬렉션의 길이만큼 반복되어 실행.
		 *    2) 루프마다 각 요소는 명시한 변수의 이름으로 저장되며,
		 *       명령문에서는 이 변수를 사용하여 각 요소를 참조할 수 있다.
		 */
		
		// Enhanced for문을 이용한 배열 값 출력.
		int[] arr = new int[]{1, 2, 3, 4, 5};
		for (int e : arr)
		    System.out.print(e + " ");
		System.out.println();
		
		// Enhance for문 내부에서 사용되는 배열 요소는 배열 요소 그 자체가 아닌 배열 요소의 복사본이다.
		// 따라서 Enhance for문에서 배열 요소의 값을 변경하여도 원본 배열에는 아무런 영향을 주지 못한다.
		int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
		for (int e : arr1)
			e += 10; // 각 배열 요소에 10을 더함.
		for (int i = 0; i < arr1.length; i++)
			System.out.print(arr1[i] + " ");
		System.out.println();
		// 결과: 1 2 3 4 5
// ---------------------------------------------------------------------------------------------------------------
		/* 
		 * while문
		 * 1. 특정 조건을 만족할 때까지 계속해서 주어진 명령문을 반복 실행.
		 * 2. 주로 의도된 무한 loop로 사용한다. 조건식의 검사를 통해 반복해서 실행되는 반복문을 loop라고 한다.
		 * 3. 초기식;
		 *    while (조건식) {
		 *        조건식의 결과가 참인 동안 반복적으로 실행하고자 하는 명령문;
		 *    }
		 *    1) 초기식 - 초기식을 통해 나온 초기값을 조건식에 활용. 초기식을 조건식에 대입해도 된다.
		 *    2) 조건식 - 조건식이 true인지를 판단하여, true이면 내부의 명령문을 실행.
		 *    3) 명령문 - 내부의 명령문을 전부 실행하고 나면, 다시 조건식으로 돌아와 또 한 번 true인지를 판단.
		 */
		
		/*
		 * 백준 알고리즘-단계별로 풀어보기-while문_더하기 사이클(1110번).
		 * 문제: 0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다.
		 *       먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다.
		 *       그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.
		 *       26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
		 *       위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
		 *       N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
		 * 출력: 첫째 줄에 N의 사이클 길이를 출력한다.
		 */
		int num = 26;
		int copy = num;
		int cnt = 0;
		while(num > 0) {
			num = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10);
			cnt++;
			if(num == copy)
				break;
		}
		System.out.println(cnt);
		// 결과: 4
		
		/* 
		 * do-while문
		 * 1. 먼저 루프를 한 번 실행한 후에 조건식을 검사. 조건식의 결과와 상관없이 무조건 한 번은 루프를 실행.
		 * 3. 초기식;
		 *    do {
		 *        조건식의 결과가 참인 동안 반복적으로 실행하고자 하는 명령문;
		 *    } while (조건식);
		 *    1) 초기식 - 초기식을 통해 나온 초기값을 조건식에 활용. 초기식을 조건식에 대입해도 된다.
		 *    2) 명령문 - 내부의 명령문을 전부 실행하고 나면, 조건식으로 넘어가 true인지를 판단.
		 *    3) 조건식 - 조건식이 true인지를 판단하여, true이면 내부의 명령문을 실행.
		 */
		int donum = 26;
		int docopy = donum;
		int docnt = 0;
		do {
			donum = ((donum % 10) * 10) + (((donum / 10) + (donum % 10)) % 10);
			docnt++;
			if(donum == docopy)
				break;
		} while(donum > 0);
		System.out.println(docnt);
		// 결과: 4
	}
}