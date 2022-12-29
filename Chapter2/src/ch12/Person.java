package ch12;

public class Person {
	
	String name;
	int age;
	
	public Person()
	{
		this("no name", 1);
	}
	// 여기서 this로 먼저 생성자 호출해야 인스턴스 완성 따라서 this 이전에 직접 이름과 나이 입력하면 안된다 ?? 모르겟서;
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}//이름과 나이를 매개변수로 받는 생성자
	
	public void showPerson() {
		
		System.out.println(name + "," + age);
	}
	
	public static void main(String[] args) {
		
		Person person = new Person();
		person.showPerson();
		
	}
}
/* 함수 호출하면 그 함수만을 위한 메모리 공간 할당됨, 그 공간을 스택이라고 함.
 * main함수 메모리부터 생성, 이후 호출 함수 할당 메모리 생성.
 * 호출 함수 수행 끝나면 메모리 공간 자동으로 사라짐.
 * 만약 여러 함수 호출하면 순서대로 메모리 생성되고 역순으로 반환됨.
 * 가령 a, b, c 순서로 호출됐다면 c, b, a 순서로 반환되는 것.
 * 함수 내부에서만 사용하는 변수를 지역변수라고 함, 그리고 지역변수는 스택 메모리에 생성됨.
 * 
 * 클래스의 생성은 클래스를 사용할 수 있도록 힙메모리를 할당받는 것. 힙메모리를 할당받아 실제 사용할 수 있게 된 클래스가 인스턴스.
 * 인스턴스의 주소값을 갖는 클래스형 변수는 참조변수. 그 값 자체는 참조값.
 * 가령 Laptop laptopMac = new Laptop(); 에서
 * Laptop형으로 laptopMac을 선언하고 newLaptop();으로 Laptop클래스 생성하여 laptopMac에 대입한 것.
 * 이때 laptopMac이 참조변수, laptopMac이 가리키는 게 인스턴스
 * 변수 자체는 외부이고 그게 인스턴스를 가리킴.
 * 그런데 인스턴스 내부에서 자기 자체의 주소값을 갖는다. 그게 this.
 */