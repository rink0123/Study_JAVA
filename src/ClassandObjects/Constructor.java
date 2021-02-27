package ClassandObjects;

/**
 * <h3>메소드 선언(Declaring Methods)</h3>
 * 
 * <h4>참고 사이트</h4>
 * <ul>
 * <li><a href="https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html">
 * Java Tutorials > Classes and Objects > Providing Constructors for Your Classes</a></li>
 * <li><a href="http://www.tcpschool.com/java/java_methodConstructor_constructor">TCP School > JAVA > 30) 생성자</a></li>
 * </ul>
 * 
 * @since JDK 11
 * @version 1.0.0.RELEASE
 * @author 강민성
 */
public class Constructor {

	/*
	 * 생성자(Constructor)
	 * 1. 객체를 초기화 하기 위해 사용되는 특수 method이다.
	 * 2. 생성자 이름은 class명과 일치 해야하며 반환 타입을 가질 수 없다.
	 * 3. 생성자는 객체가 생성 될 때 호출된다.
	 * 4. 생성자도 하나의 method이므로, method overloading이 가능하다.
	 * 5. compiler는 생성자가 없는 모든 클래스에 대해 인수가 없는 기본 생성자를 자동으로 제공한다.
	 * 6. 인수가 있는 생성자 선언 시 compiler는 생성자가 있다고 판단하여
	 *    인수가 없는 생성자를 자동으로 제공하지 않는다.
	 * 7. 주로 DTO(Data Transfer Object), VO(Value Object)로 사용된다.
	 * 
	 * 
	 * 생성자(Constructor) 선언
	 * 1. class명() {} -> 기본 생성자(매개 변수가 없는 생성자) 선언.
	 * 2. class명(인수1, 인수2, ...) {...} -> 매개 변수가 있는 생성자 선언.
	 */
	
	// 인스턴스 변수(전역 변수=멤버 필드) 선언.
	private String modelName;
	private int modelYear;
	private String color;
	private int maxSpeed;
	private int currentSpeed;

	// 기본 생성자(매개 변수가 없는 생성자) 선언.
//	Constructor() {
//	}
	
	// 매개 변수가 있는 생성자 선언.
	Constructor(String modelName, int modelYear, String color, int maxSpeed) {
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = 0;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public String getModel() {
		return this.modelYear + "년식 " + this.modelName + " " + this.color;
	}

	@Override
	public String toString() {
		return "Constructor [modelName=" + modelName + ", modelYear=" + modelYear + ", color=" + color + ", maxSpeed="
				+ maxSpeed + ", currentSpeed=" + currentSpeed + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public static void main(String[] args) {
		Constructor myCar = new Constructor("아반떼", 2016, "흰색", 200); // 생성자의 호출.
		System.out.println(myCar.getModel()); // 생성자에 의해 초기화되었는지를 확인함.
	}
}