package section07;
/*
 * JVM(Java Virtual Machine)
 * 	자바 애필리케이션을 실행하기 위한 가상머신
 * 	JVM은 운영체제와 자바 애플리케이션 사이 중계자 역할을 한다.
 * 
 * JVM 메모리 구조
 * 	1. 메서드 영역(Method Area)
 * 		JVM이 실행하는 애플리케이션 사용되는 클래스 정보 저장
 * 		JVM이 시작될 때 클래스 로더에 의해 로드되며, 모든 스레드가 공유.
 * 	2. 힙 영역(Heap Area)
 * 		객체 인스턴스가 저장되는 영역, 동적으로 생성된 객체들이 할당된다.
 * 	3. 스택 영역(Stack)
 * 		메서드 호출과 관련된정보(로컬변수, 매개변수, 메서드 호출 등) 저장.
 * 		각 스레드마다 별도의 스택이 생성된다.
 * 
 */
public class OOP02 {

}
