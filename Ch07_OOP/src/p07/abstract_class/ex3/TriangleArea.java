// Figure라는 추상클래스 만들고, 그 안에 추상메소드(void area(int a, int b);)를 만듦
// 사각형의 면적을 구하는 클래스(SquareArea)를 만듦
// 삼각형의 면적을 구하는 클래스(TriangleArea)를 만듦
// main메소드에 결과를 출력(입력값:20,30)
package p07.abstract_class.ex3;

public class TriangleArea extends Figure // 자식클래스 #1 (Figure로부터 상속받음)
{
	double tArea; // 결과값을 저장할 변수
	
	@Override
	void area(int a, int b) // 부모클래스의 추상메소드에 오버라이딩
	{
		tArea = ((double)a*(double)b)/2.0; 
		System.out.println("삼각형의 면적: " + tArea);
	}
}
