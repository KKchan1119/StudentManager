package com;

import com.controller.Controller;
import com.entity.Student;
import com.entity.StudentEntity;

public class StudentManagementApp{

	public static void main(String[] args) {
		Controller controller = new Controller();
		initControllerTest(controller);
		insertStudentTest(controller);
		insertStudentTest(controller);
	}
	/*
	*배열 생성과 샘플 데이터 입력 테스트 메소드
	*
	* @param controller
	*/
	public static void initControllerTest(Controller controller) {
		//배열길이 5, 샘플데이터 입력하겠다.
		int result = controller.initController(5, true);
		
		if(result == Controller.INFO_SUCCESS) {
			controller.searchAllStudent();
		}else {
			System.out.println("프로그램에서 사용할 배열의 길이 재확인 요망.");
		}
		
	}
	
	/*
	*학생 한 명의 데이터를 등록하는 테스트 메소드
	*
	* @param controller
	*/
	public static void insertStudentTest(Controller controller) {
		//학생 객체 생성
		Student stu = new Student();
		
		stu.setStuName("Student");
		stu.setKorScore(80);
		stu.setEngScore(70);
		stu.setMathScore(90);
		
		int result = controller.insertStudent(stu);
		if(result == StudentEntity.ERR_ARRAY_FULL) {
			System.out.println("배열에는 저장할 공간이 없습니다.");
		}else {
			controller.searchAllStudent();
		}
	}
}
