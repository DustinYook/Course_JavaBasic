package p03.unchecked_checked;
// Unchecked Exception: 컴파일 에러가 발생하지 않고, 실행 시 예외가 발생함 => 실행에 대한 예외처리를 해주어야 함
public class UncheckedEx1 
{
	public static void main(String[] args) 
	{
		int arr[] = { 5, 4, 3, 2, 1, 0 }; // 배열 선언과 동시에 초기화

		for (int i = 0; i < 10; i++) // 처음부터 try,catch를 염두해두고 하지말 것 => 컴파일러가 알려주는 대로 할 것!
		{
			try  // try,multi_catch 블럭: catch가 여러 개 있는 것이 좋음 (if~else문과 유사)
			{
				int result = 100 / arr[i];
				System.out.printf("[처리결과] 100 / %d = %d\n", arr[i], result);
			} 
			catch (ArithmeticException e1) // 산술적인 예외가 발생한 경우 예외처리 (i=6)
			{ // e1은 참조변수, A~는 클래스
				System.out.println("[경고] 0으로 나눌 수 없습니다. 다시 한 번 입력해주십시오.");
			}
			catch (ArrayIndexOutOfBoundsException e2) // 배열범위를 초과한 경우 예외처리 (i=6~9)
			{
				System.out.println("[경고] 배열의 저장값이 존재하지 않아 연산을 수행할 수 없습니다.");
			}
			catch (Exception e3) // 일반적인 예외가 발생한 경우 예외처리
			{
				System.out.println("[경고] 일반적 예외처리입니다.");
			}
			// 주의) Exception - Array~ - Arithmetic~ 이렇게 놓으면 오류가 발생
			// 따라서 반드시  촘촘한 그물(Arithmetic, Array)에서 넓은 그물(Exception)로 가는 순서를 지켜야 함!
			// 부모 예외 클래스가 밑에 위치하도록 하는 규칙을 반드시 지켜야함
		} System.out.println("\n[시스템 알림] 프로그램을 종료합니다.");
	}
}
//1.에러: 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
//2.예외: 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류
//  1) Runtime Exception(실행시간 오류) = Unchecked Exception: 컴파일이 아니고, 실행 시 예외발생 
//  java.lang.ArithmeticException
//  java.lang.ArrayStoreException
//  java.lang.ClassCastException
//  java.lang.EnumConstantNotPresentException
//  java.lang.IllegalArgumentException
//  java.lang.IllegalThreadStateException
//  java.lang.NumberFormatException
//  java.lang.IllegalMonitorStateException
//  java.lang.IllegalStateException
//  java.lang.IndexOutOfBoundsException
//  java.lang.ArrayIndexOutOfBoundsException
//  java.lang.StringIndexOutOfBoundsException
//  java.lang.NegativeArraySizeException
//  java.lang.NullPointerException
//  java.lang.SecurityException
//  java.lang.TypeNotPresentException
//  java.lang.UnsupportedOperationException
//
//  2)Checked Exception: try,catch를 이용하여 처리
//  java.lang.CloneNotSupportedException
//  java.lang.InterruptedException
//  java.lang.ReflectiveOperationException
