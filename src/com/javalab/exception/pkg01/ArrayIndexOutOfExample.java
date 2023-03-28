/**
 * 실행 예외(Runtime Exception) 테스트 클래스
 * - ArrayIndexOutOfBoundException : 존재하지 않는 배열 인데스 참조
 */

package com.javalab.exception.pkg01;

public class ArrayIndexOutOfExample {

	public static void main(String[] args) {

		String[] arrStr = new String[2];
		arrStr[0] = "hi java";
		arrStr[1] = "hi javascript";

		System.out.println(arrStr[2]); // x
		//System.out.println(arrStr[0]); // o

		// 교수 객체 저장용 배열 선언
		Professor[] profs = new Professor[3];
		profs[0] = new Professor(50);
		profs[1] = new Professor(55);
		profs[2] = null;
		
		// 배열의 크기를 +1 : ArrayIndexOutOfBoundException
		for (int i = 0; i < profs.length+1; i++) {
			System.out.println(profs[i].age);
		}
	}
}

// 교수 클래스
class Professor {
	// 필드
	public int age = 10;

	// 기본 생성자
	public Professor() {

	}

	// 오버로딩 생성자
	public Professor(int age) {
		this.age = age;
	}
}