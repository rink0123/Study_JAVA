package variables;

/**
 * <h3>배열과 배열 클래스(Arrays and arrays class)</h3>
 * 
 * <h4>참고 사이트</h4>
 * <ul>
 * <li><a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html">Java Tutorials - Variables</a></li>
 * <li><a href="http://www.tcpschool.com/java/java_array_memory">TCP School > JAVA > 5. 배열</a></li>
 * </ul>
 * 
 * @since JDK 11
 * @version 1.0.0.RELEASE
 * @author 강민성
 */
public class ArraysAndArraysClass {
	/*
	 * 배열
	 * 1. 단일 유형의 고정 값을 보관하는 컨테이너 객체.
	 * 2. 배열은 선언, 생성, 초기화, 액세스로 이루어진다.
	 * 3. "type 변수명[]" 형식의 배열 선언은 권장하지 않는다.
	 * 4. type[] 변수명;                 -> 배열 선언.
	 *    변수명 = new type[length];     -> 배열 생성.
	 *    변수명[index] = type에 맞는 값; -> 배열 초기화.
	 *    변수명[index];                 -> 배열 액세스.
	 *    type     : [boolean | char | String | byte | short | int | long].
	 *    []       : 변수에 배열이 있음을 나타내는 특수 기호.
	 *    변수명    : 특정 메모리 공간에 값(data)을 저장하거나 접근하기 위해 이름으로 구별한 것.
	 *    new      : 메모리(Heap 영역)에 데이터를 저장할 공간을 할당하고 객체를 생성.
	 *    [length] : 배열 길이는 배열이 생성될 때 설정되며 생성 후에는 길이가 고정된다.
	 *               length에 정수 또는 정수인 변수를 할당할 수 있다.
	 *    [index]  : 배열 index는 1이 아닌 0부터 시작이며 정수로 입력해야 한다.
	 *               배열의 각 index 항목을 Element(요소)라고 하며 각 요소를 액세스(저장된 값 출력)하려면 index로 접근해야 한다.
	 *               index에 정수 또는 정수인 변수를 할당할 수 있다.
	 *    값       : type에 맞는 값을 할당해야 한다.
	 *               논리형 = false, true
	 *               문자형 및 문자열 = '문자형', "문자열"
	 *               정수형 = ±n ~ ±n
	 *               실수형 = ±n.n ~ ±n.n 
	 */
	public static void main(String[] args) {
		/*
		 * 1차원 배열 선언, 생성, 초기화, 액세스 방법 1
		 * 1. 배열 선언과 생성을 따로 함.
		 * 2. 주로 전역 변수로 Class 내에 어딘가에 length를 할당하여 사용함.
		 * 3. 사람마다 다르겠지만 필자는 거의 안 씀.
		 */
		int[] arrInt; // 배열 선언.
		arrInt = new int[1]; // 배열 생성.
		arrInt[0] = 1; // 배열 초기화.
		System.out.println(arrInt[0]); // 배열 액세스. 1
		
		
		/*
		 * 1차원 배열 선언, 생성, 초기화, 액세스 방법 2
		 * 1. 배열 선언과 동시에 생성.
		 * 2. 주로 전역 or 지역 변수로 배열 길이를 고정하고 사용함.
		 *    특정 상황에 length에 변수를 할당하여 length를 조절하여 사용하기도 함.
		 * 3. 사람마다 다르겠지만 필자는 자주 씀.
		 */
		int[] arrInt2 = new int[1]; // 배열 선언 및 생성.
		arrInt2[0] = 1; // 배열 초기화.
		System.out.println(arrInt2[0]); // 배열 액세스. 1
		
		
		/*
		 * 1차원 배열 선언, 생성, 초기화, 액세스 방법 3
		 * 1. 배열 선언과 동시에 초기화.
		 * 2. new 연산자가 생략되있는 것 뿐 생성은 되있다.
		 * 3. length는 중괄호({}) 사이에 쉼표(,)로 구분된 값의 수에 의해 결정.
		 * 4. 주로 Hard coding으로 고정값을 할당하여 사용함. 상수 역할과 비슷함.
		 * 5. 사람마다 다르겠지만 필자는 Hard coding 할 때 빼곤 아예 안 씀.
		 */
		int[] arrInt3 = {1}; // 배열 선언 및 초기화.
		System.out.println(arrInt3[0]); // 배열 액세스. 1
// ------------------------------------------------------------------------------------------------
		/* 
		 * 다차원 배열 선언, 생성, 초기화, 액세스 방법
		 * 1. 1차원 배열과 같으며 다른 점은 소괄호([]), 중괄호({}) 갯수 뿐이다.
		 * 2. type[][]... 변수명 = new type[length][length]...;
		 *    type[][]... 변수명 = { { } }; -> 소괄호([])가 추가될 수록 중괄호({})는 안으로 추가해야 됨.
		 * 3. 주로 인터넷 상에서 쉽게 이해시키기 위해 x, y로 가르키지만 3차원 이상일 경우 이해가 힘들기에
		 *    필자는 오히려 Tree 형태로 보는게 후에 n차 배열을 이해하기 쉽다고 생각함.
		 */
		int[][] arrInt4 = new int[3][3];
		arrInt4[0][0] = 0;
		arrInt4[0][1] = 0;
		arrInt4[0][2] = 0;
		arrInt4[1][0] = 1;
		arrInt4[1][1] = 1;
		arrInt4[1][2] = 1;
		arrInt4[2][0] = 2;
		arrInt4[2][1] = 2;
		arrInt4[2][2] = 2;
		
		for(int i = 0 ; i < arrInt4.length ; i++) { // 1번째 배열 index 접근.
			for(int j = 0 ; j < arrInt4[i].length ; j++) { // 2번째 배열 index 접근.
				System.out.print(arrInt4[i][j]); // 배열 액세스.
			}
			System.out.println();
		}
		// Console result
		// 000
		// 111
		// 222
	}
}