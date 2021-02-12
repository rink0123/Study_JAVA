package variables;
/*
 * 참고 사이트
 * [Java Tutorials - Variables] https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html
 * [위키백과 - Naming convention (Programing)] https://en.wikipedia.org/wiki/Naming_convention_(programming)
 */

/* 자바 명명 규칙 */
public class JavaNamingConvention {
	
	public static void main(String[] args) {
		/* 1. 공통 명명 규칙 */
		// 1.1. 변수명은 대소문자가 구분되며 길이 제한이 없다(그렇다고 한 없이 길게 표기하면 안 된다).
		int i, I;
		int abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789ㄱㄴㄷㄹㅁㅂㅅㅇㅈㅊㅋㅌㅍㅎㄲㄸㅃㅉㅆ;
		
		// 1.2. 변수명을 예약어(keywork)로 표기하면 안 된다.
		// int int; // java.lang.Error(compile error): Syntax error on token "int", invalid VariableDeclarator
		
		// 1.3. API에서 제공하는 class명이나 method명을 사용해서는 안 된다(협업 시 혼란 발생).
		String String; // String class를 변수명으로 표기(fail).
		String toString; // String의 method 중 toString()을 변수명으로 표기(fail).
		
		// 1.4. 특수 문자는 '_'와 '$'만을 허용한다. 기존 문법에 저 2개를 제외한 특수 문자를 사용하기 때문이다.
		//      자동 생성된 이름에 '$'가 포함되어 있는 경우가 있을 수 있지만, 관례상 '$'가 사용된 적이 없다.
		//      '_'를 시작 문자로 사용하는 것은 기술적으로 합법적이다. 하지만 개발자들끼리의 암묵적인 규칙으로 거의 사용하지 않는다.
		// int ^sc; // java.lang.Error(compile error): Syntax error on token "^", delete this token
		int _i, $i, __, $$; // 사용 가능, 하지만 지양.
		
		// 1.5. 시작 문자가 숫자로 올 수 없다.
		// int 6i; // java.lang.Error(compile error): Syntax error on token "6", delete this token
		
		// 1.6. 변수 이름에서 문자 자이에 공백을 사용할 수 없다.
		// int send box; // java.lang.Error(compile error): Syntax error on token "box", delete this token
		
		// 1.7. 두 개 이상의 단어로 구성된 경우 붙여서 표기한다.
		int gearRatio, currentGear;
		
		// 1.8. 변수 이름을 표기할 때 은어, 약어 대신 전체 단어를 지향한다(협업 시 가독성 상승).
		//      다만 변수명이 긴 경우 오히려 가시성이 떨어지기에 일정 부분 약어를 허용한다.
		//      예외로 중요 코드가 아니거나 일회성 코드일 경우 약어를 써도 무방하다.
		int cadence, speed, gear; // s, c, g 약어 대신 전체 단어 사용.
		int sum; double avg; // 개발자 사이에서 많이 쓰는 단어. 일정 부분 약어 허용.
		for(int j = 0; j < 10; j++) {} // 일반적인 for문. 중요 코드(X), 일회성 코드(O).
//---------------------------------------------------------------------------------------------------------------------------
		/*
		 * 2. 패키지(Package) 명명 규칙
		 * 2.1. 패키지명은 모두 소문자를 사용할 것을 지향한다.
		 * 2.2. 패키지명은 표준 패턴을 따라야 한다(ex. [com].[Company].[Project].[TopPackage].[LowerPackage])
		 * 2.3. 패키지명은 가급적 한 단어의 명사를 사용한다.
		 *      ex. 좋은 예: com.pearlabyss.blackdesert.member.object
		 *          나쁜 예: com.pearlabyss.blackdesert.memberObject
		 */
//---------------------------------------------------------------------------------------------------------------------------
		/* 3. 클래스(class)와 인터페이스(interface) 명명 규칙
		 * 3.1. 파스칼 표기법(Pascal Case)을 지향한다.
		 *      (파스칼 표기법(Pascal Case) : 한 단어의 첫 문자를 대문자로 표기)
		 */
		// class Naming
		// class NamingRule
//---------------------------------------------------------------------------------------------------------------------------
		/* 4. 메소드(Method) 명명 규칙
		 * 4.1. 카멜 표기법(Camel Case)을 지향한다.
		 *      (카멜 표기법(Camel Case) : 첫 단어를 제외한 나머지 단어의 첫 글자를 대문자로 표기)
		 */
		// public void naming() {}
		// public void namingRule() {}
//---------------------------------------------------------------------------------------------------------------------------
		/* 5. 변수(Variable) 명명 규칙
		 * 5.1. 스네이크 표기법(Snake Case), 카멜 표기법(Camel Case)을 지향한다.
		 *      (스네이크 표기법(Snake Case) : 단어 전부를 소문자로 표현, 단어 사이를 언더바(_)로 구분)
		 * 5.2. 실제 개발자마다 변수 명명 규칙이 다르며 파스칼 표기법만 아니면 가시성과 가독성만 만족한다면 상관없다.
		 * 5.3. 헝가리언 표기법(Hungarian Case)은 Tool이 좋아지면서 변수명에 타입을 표시 해줬을 때의 장점이 별로 없어져서 안 쓰는 추세.
		 */
		int naming;
		int naming_rule;
		int namingRule;
//---------------------------------------------------------------------------------------------------------------------------
		/* 6. 상수(Constant) 명명 규칙
		 * 6.1. 상수 표기법(CONSTANT_CASE)을 지향한다.
		 *      (상수 표기법(CONSTANT_CASE) : 스네이크 표기법에서 전부 대분자로 표현)
		 * 6.2. 변수 명명 규칙과 마찬가지로 개발자마다 표기가 다르며 가시성과 가독성만 만족한다면 상관없다.
		 */
		int NAMING;
		int NAMING_RULE;
	}
}