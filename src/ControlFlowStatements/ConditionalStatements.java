package ControlFlowStatements;

/**
 * <h3>조건문(Conditional Statements)</h3>
 * 
 * <h4>참고 사이트</h4>
 * <ul>
 * <li><a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html">
 * Java Tutorials > Language Basics > Control Flow Statements > The if-then and if-then-else Statements</a></li>
 * <li><a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html">
 * Java Tutorials > Language Basics > Control Flow Statements > The switch Statement</a></li>
 * <li><a href="http://www.tcpschool.com/java/java_control_condition">TCP School > JAVA > 19) 조건문</a></li>
 * </ul>
 * 
 * @since JDK 11
 * @version 1.0.0.RELEASE
 * @author 강민성
 */
public class ConditionalStatements {
	/*
	 * 제어문(control flow statements)
	 * 1. Java program자바 프로그램이 원하는 결과를 얻기 위해서는 프로그램의 순차적인 흐름을 제어해야만 할 경우가 생긴다.
	 * 2. 이때 사용하는 명령문을 제어문이라고 하며, 이러한 제어문에는 조건문, 반복문 등이 있다.
	 * 3. 이러한 제어문에 속하는 명령문들은 중괄호({})로 둘러싸여 있으며,
	 *    이러한 중괄호 영역을 블록(Block) 또는 초기화 블록(Initialization Block)이라고 한다.
	 * 
	 * 
	 * 조건문(conditional statements)
	 * 1. 주어진 조건식의 결과에 따라 별도의 명령을 수행하도록 제어하는 명령문이다.
	 * 2. 조건문 중에서도 가장 기본이 되는 명령문은 바로 if문이다.
	 * 3. 조건식의 결과가 true면 주어진 명령문을 실행하며, false면 아무것도 실행하지 않는다.
	 * 4. 초기화 블록 안에 명령문이 한 줄일 경우 초기화 블록은 생략 가능하다.
	 * 5. 속도를 고려한다면 조건식을 true일 경우 대신 false일 경우로 작성하면 된다. 
	 * 4. Java에서 사용하는 대표적인 조건문의 형태.
	 *    if문
	 *    if-else문
	 *    if-else if-else문
	 *    switch문
	 */
	public static void main(String[] args) {
		/* 
		 * if문
		 * 1. 아래의 코드에서 블록에 속한 명령문은 중괄호({})를 기준으로 오른쪽으로 들여쓰기가 되어 있는 것을 볼 수 있다.
		 *    이처럼 들여쓰기를 통해 코드의 가독성을 높이는 것을 인덴트(indent)라고 하며, 될 수 있으면 모든 코드를 인덴트하는 것이 좋다.
		 * 2. if (조건식1) { // if는 한 번만 쓸 수 있다.
		 *        조건식1의 결과가 true일 때 실행하고자 하는 명령문;
		 *    } else if (조건식2) { // else if는 여러 번 쓸 수 있다.
		 *        조건식2의 결과가 true일 때 실행하고자 하는 명령문;
		 *    ...
		 *    } else { // else는 한 번만 쓸 수 있으며 생략이 가능하며, 조건식이 필요없고 작성도 안 된다.
		 *        조건식1의 결과도 false이고, 조건식2의 결과도 false일 때 실행하고자 하는 명령문;
		 *    }
		 */
		
		/*
		 * 백준 알고리즘-단계별로 풀어보기-if문_두 수 비교하기(1330번).
		 * 문제: 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
		 * 출력: 첫째 줄에 다음 세 가지 중 하나를 출력한다.
		 *       A가 B보다 큰 경우에는 '>'를 출력한다.
		 *       A가 B보다 작은 경우에는 '<'를 출력한다.
		 *       A와 B가 같은 경우에는 '=='를 출력한다.
		 */
		int a = 1, b = 2;
		if (a > b) // A가 B보다 큰 경우에는 '>'를 출력한다.
			System.out.println(">");
		else if (a < b) // A가 B보다 작은 경우에는 '<'를 출력한다.
			System.out.println("<");
		else // A와 B가 같은 경우에는 '=='를 출력한다.
			System.out.println("==");
		// 결과: <
		
		/*
		 * 백준 알고리즘-단계별로 풀어보기-if문_시험 성적(9498번).
		 * 문제: 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은
		 *       C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		 * 출력: 시험 성적을 출력한다.
		 */
		int score = 81;
		if (score >= 90 && score <= 100) // score가 90 ~ 100점일 경우 "A" 출력.
			System.out.println("A");
		else if (score >= 80 && score <= 89) // score가 80 ~ 89점일 경우 "B" 출력.
			System.out.println("B");
		else if (score >= 70 && score <= 79) // score가 70 ~ 79점일 경우 "C" 출력.
			System.out.println("C");
		else if (score >= 90 && score <= 100) // score가 60 ~ 69점일 경우 "D" 출력.
			System.out.println("D");
		else // score가 60점 미만은 "F" 출력.
			System.out.println("F");
		// 결과: B
		
		/*
		 * 백준 알고리즘-단계별로 풀어보기-if문_윤년(2753번).
		 * 문제: 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
		 *       윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
		 *       예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다.
		 *       1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다.
		 *       하지만, 2000년은 400의 배수이기 때문에 윤년이다.
		 * 출력: 첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
		 */
		int year = 2000;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) // 윤년일 때.
			System.out.println(1);
		else // 윤년이 아닐 때.
			System.out.println(0);
		// 결과: 1
		
		/*
		 * 백준 알고리즘-단계별로 풀어보기-if문_사분면 고르기(14681번).
		 * 문제: 흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다.
		 *       Quadrant 1: A(12, 5)
		 *       Quadrant 2: B(-12, 5)
		 *       Quadrant 3: C(-12, -5)
		 *       Quadrant 4: D(12, -5)
		 *       예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다.
		 *       점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오.
		 *       단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
		 * 출력: 점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.
		 */
		int x = 12, y = 5;
		if(x > 0 && y > 0) // 1사분면일 경우.
			System.out.println(1);
		else if(x < 0 && y > 0) // 2사분면일 경우.
			System.out.println(2);
		else if(x < 0 && y < 0) // 3사분면일 경우.
			System.out.println(3);
		else // 4사분면일 경우.
			System.out.println(4);
		// 결과: 1
		
		/*
		 * 백준 알고리즘-단계별로 풀어보기-if문_알람 시계(2884번).
		 * 문제: 상근이는 매일 아침 알람을 듣고 일어난다. 알람을 듣고 바로 일어나면 다행이겠지만,
		 *       항상 조금만 더 자려는 마음 때문에 매일 학교를 지각하고 있다.
		 *       상근이는 모든 방법을 동원해보았지만, 조금만 더 자려는 마음은 그 어떤 것도 없앨 수가 없었다.
		 *       이런 상근이를 불쌍하게 보던, 창영이는 자신이 사용하는 방법을 추천해 주었다. 바로 "45분 일찍 알람 설정하기"이다.
		 *       이 방법은 단순하다. 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다.
		 *       어차피 알람 소리를 들으면, 알람을 끄고 조금 더 잘 것이기 때문이다.
		 *       이 방법을 사용하면, 매일 아침 더 잤다는 기분을 느낄 수 있고, 학교도 지각하지 않게 된다.
		 *       현재 상근이가 설정한 알람 시각이 주어졌을 때, 창영이의 방법을 사용한다면,
		 *       이를 언제로 고쳐야 하는지 구하는 프로그램을 작성하시오.
		 * 출력: 첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력한다.(입력과 같은 형태로 출력하면 된다.)
		 */
		int alarm = 45;
		int h = 23, m = 40;
		if(m < 45) {
			if(h == 0)
				h = 23;
			else
				h -= 1;
			m = (m + 60) - alarm;
			System.out.println(h + " " + m);
		} else {
			h -= 1;
			m -= 45;
			System.out.println(h + " " + m);
		}
		// 결과: 22 55
// ----------------------------------------------------------------------------------------------------------------------------------
		/* 
		 * switch문
		 * 1. if-else문과 마찬가지로 주어진 조건 값의 결과에 따라 프로그램이 다른 명령을 수행하도록 하는 조건문.
		 * 2. if-else 문보다 가독성이 더 좋으며, 컴파일러가 최적화를 쉽게 할 수 있어 속도 또한 빠른 편이다.
		 * 3. 모든 기본 자료형 및 Wrapper class의 변수나 리터럴을 조건값으로 사용할 수 있다.
		 * 4. 하지만 값으로만 판단하기 때문에 사용 빈도가 매우 적다.
		 * 5. switch (조건 값) {
		 *        case 값1:
		 *        조건 값이 값1일 때 실행하고자 하는 명령문;
		 *        break;
		 *        case 값2:
		 *        조건 값이 값2일 때 실행하고자 하는 명령문;
		 *        break;
		 *        ...
		 *        default: // 생략 가능. case절에도 해당하지 않을 때만 실행. case절 사이에 위치해도 상관없다.
		 *        조건 값이 어떠한 case 절에도 해당하지 않을 때 실행하고자 하는 명령문;
		 *        break; // case절 또는 default절이 실행된 뒤에 전체 switch문을 빠져나가게 해준다.
		 *               // 만약에 break 키워드가 없다면, 조건에 해당하는 switch문의 모든 case절이 전부 실행된다.
		 *    }
		 */
		
		// switch문을 이용한 학점 계산.
		int score1 = 100;
		switch (score1 / 10) { // score1값에 10을 나눠 나온 최종값(정수값)을 기준으로 case값과 일치할 시 내용 출력.
		case 0: // switch(값)이 0일 때 해당 case값 출력.
			System.out.println("학점 F등급입니다.");
			break;
		case 1: // switch(값)이 1일 때 해당 case값 출력.
			System.out.println("학점 F등급입니다.");
			break;
		case 2: // switch(값)이 2일 때 해당 case값 출력.
			System.out.println("학점 F등급입니다.");
			break;
		case 3: // switch(값)이 3일 때 해당 case값 출력.
			System.out.println("학점 B등급입니다.");
			break;
		case 4: // switch(값)이 4일 때 해당 case값 출력.
			System.out.println("학점 B등급입니다.");
			break;
		case 5: // switch(값)이 5일 때 해당 case값 출력.
			System.out.println("학점 C등급입니다.");
			break;
		case 6: // switch(값)이 6일 때 해당 case값 출력.
			System.out.println("학점 C등급입니다.");
			break;
		case 7: // switch(값)이 7일 때 해당 case값 출력.
			System.out.println("학점 B등급입니다.");
			break;
		case 8: // switch(값)이 8일 때 해당 case값 출력.
			System.out.println("학점 B등급입니다.");
			break;
		case 9: // switch(값)이 9일 때 해당 case값 출력.
			System.out.println("학점 A등급입니다.");
			break;
		case 10: // switch(값)이 10일 때 해당 case값 출력.
			System.out.println("학점 A등급입니다.");
			break;
		default: // switch(값)이 case 어느 값도 속하지 않을 때 default값 출력.
			System.out.println("전산 오류입니다.");
		}
		// 결과: 학점 A등급입니다.
		
		// 한국식 월 기준을 미국식 월 기준으로 바꾸기.
		int month = 8;
		String monthString;
		switch (month) {
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;
		case 4:
			monthString = "April";
			break;
		case 5:
			monthString = "May";
			break;
		case 6:
			monthString = "June";
			break;
		case 7:
			monthString = "July";
			break;
		case 8:
			monthString = "August";
			break;
		case 9:
			monthString = "September";
			break;
		case 10:
			monthString = "October";
			break;
		case 11:
			monthString = "November";
			break;
		case 12:
			monthString = "December";
			break;
		default:
			monthString = "Invalid month";
			break;
		}
		System.out.println(monthString);
		// 결과: August
		
		// 특정 월의 일수를 계산.
		int month1 = 2;
		int year1 = 2000;
		int numDays = 0;

		switch (month1) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numDays = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numDays = 30;
			break;
		case 2:
			if (((year1 % 4 == 0) && !(year1 % 100 == 0)) || (year1 % 400 == 0))
				numDays = 29;
			else
				numDays = 28;
			break;
		default:
			System.out.println("Invalid month.");
			break;
		}
		System.out.println("Number of Days = " + numDays);
		// 결과: Number of Days = 29
// ----------------------------------------------------------------------------------------------------------------------------------
		/*
		 * 삼항 연산자에 의한 조건문
		 * 1. 간단한 if-else문은 삼항 연산자를 이용하여 간결하게 표현할 수 있다.
		 * 2. 조건식 ? 반환값1 : 반환값2
		 */
		int a1 = 1, b1 = 2;
		System.out.println(a1 > b1 ? "a1이 큼" : "b1이 큼");
	}
}