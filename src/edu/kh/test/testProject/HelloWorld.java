package edu.kh.test.testProject;
  		//package(관련된 코드들의 묶음) 명명 규칙
		// 최소 3레벨
		// 프로젝트 기반 주소(도메인주소 거꾸로)

// : 한줄주석
/* : 범위주석
 * 
 * 
 */
public class HelloWorld {
	
	public static void main(String[] args) {
		//실행구문(메인메소드가 있어야 실행 가능)
		System.out.println("안녕하세요"); //영문
		System.out.println("Hi"); //한글
		System.out.println(112); //숫자
		
		// " "(쌍따옴표) : 문자열을 나타냄
		// ==> 안에 작성된 텍스트는 단순 문자열로 인식
		
		System.out.println("1 +2");
		System.out.println(1+2);
		
		// " " 안에 작성되지 않은 코드는 숫자, 변수 로 인식
		
		// ""(문자열) + 숫자 함께 작성
		System.out.println("14 * 19 =" + 266);
		// 숫자와 숫자끼리의 덧셈은
		// 실제 덧셈 결과
		// 문자열과 숫자 혹은 문자열과 문자열 의 덧셈은
		// ==> 이어쓰기
		System.out.println("14 * 19 =" + 14 * 19);
		
		// notice
		// 자바는 사칙연산의 우선순위를 그대로 따른다
		// 우선계산을 원하면 ( ) 괄호 사용
		
		// 형상관리= 소프트웨어의 변경사항을 체계적으로 추적하고 통제
		// (software) configuration management
		// 쉽게말하면 코드가 어디가 어떻게 달라졋는가
		// 형상관리시스템 == Git
		// SVN보다 GIT이 더 복잡하지만 체계적, 안정적
		}

}
