package p09.polymorphism;
// 다형성(polymorphism): 하나의 참조변수(부모클래스,인터페이스,추상클래스)로 여러 타입의 자식객체를 참조할 수 있는 것 
// 다형성의 전제조건은 상속임 => 상속이 아닌 경우 다형성의 개념을 사용할 수 없음
// 다형성은 상위타입의 변수(부모클래스, 인터페이스, 추상클래스) 타입이 하위타입 => 타입크기가 작다는 것이 아니라 아래서 위를 본다는 의미
// 작은 타입 변수 = 큰 타입; - 강제형변환 => 형변환을 식별 위해서 instanceof 연산자를 사용
//클래스:부모->자식, 인터페이스:인터페이스->구현한 클래스, 추상클래스:추상클래스->구현한 클래스
public class Game 
{
	public void type() // 인스턴스 메소드 (일반메소드)
	{
		System.out.println("Super Game");
	}
}