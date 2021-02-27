package ClassandObjects;

/**
 * <h3>this 키워드 사용(Using the this Keyword)</h3>
 * 
 * <h4>참고 사이트</h4>
 * <ul>
 * <li><a href="https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html">
 * Java Tutorials > Classes and Objects > Using the this Keyword</a></li>
 * <li><a href="http://tcpschool.com/java/java_methodConstructor_this">TCP School > JAVA > 31) this와 this()</a></li>
 * </ul>
 * 
 * @since JDK 11
 * @version 1.0.0.RELEASE
 * @author 강민성
 */
public class ThisKeyword {
	/*
	 * this 참조 변수
	 * 1. this는 메서드 또는 생성자 내에서 this를 사용하여 현재 객체의 인스턴스 변수를 참조할 수 있다.
	 *    즉, 인스턴스 변수가 자기 자신을 참조하는 데 사용하는 변수이다.
	 * 2. this 참조 변수는 해당 인스턴스의 주소를 가리키고 있다.
	 * 3. 주로 DTO(Data Transfer Object), VO(Value Object)에 사용된다.
	 * 
	 * 
	 * this() 메소드
	 * 1. 생성자 내부에서만 사용할 수 있으며, 같은 클래스의 다른 생성자를 호출할 때 사용.
	 * 2. this() 메소드에 인수를 전달하면 생성자 중에서 메소드 시그니처가 일치하는 다른 생성자를 찾아 호출해준다.
	 * 3. "명시적 생성자 호출"이라고도 한다.
	 */
	
	// 인스턴스 변수.
	private String modelName;
	private int modelYear;
	private String color;
	private int maxSpeed;
	private int currentSpeed;

	// this 참조 변수를 사용하여 인스턴스 변수에 접근.
	ThisKeyword(String modelName, int modelYear, String color, int maxSpeed) {
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = 0;
	}

	// 내부에서 this() 메소드를 이용하여 첫 번째 생성자를 호출.
	ThisKeyword() {
		this("소나타", 2012, "검정색", 160); // 다른 생성자를 호출함.
	}

	public String getModel() {
		return this.modelYear + "년식 " + this.modelName + " " + this.color;
	}

	public static void main(String[] args) {
		// 이렇게 내부적으로 다른 생성자를 호출하여 인스턴스 변수를 초기화할 수 있다.
		ThisKeyword keyword = new ThisKeyword();
		System.out.println(keyword.getModel()); // 결과: 2012년식 소나타 검정색
	}
}