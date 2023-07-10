package com.test;

import com.controller.Controller;
import com.entity.Student;
import com.entity.StudentEntity;

/***
 * 학생 정보 및 성적 관리를 위한 프로그램의 테스트용 클래스.
 */
public class StudentManagementAppTest {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Controller controller = new Controller();

			// 초기화 및 샘플 데이터 등록 기능 테스트
			initControllerTest(controller);
			// 한 건 등록하는 기능 테스트
			insertStudentTest(controller);
			// 한 건 등록하는 기능 테스트
			insertStudentTest(controller);
			
		}
		
		/***
		 * 배열 생성과 샘플 데이터 입력 테스트 메소드
		 * 
		 * @param controller
		 */
		public static void initControllerTest(Controller controller) {
			// 배열의 길이는 5이고, 샘플 데이터를 입력함
			int result = controller.initController(5, true);
			
			if (result == Controller.INFO_SUCCESS) {
				controller.searchAllStudent();
			} else {
				System.out.println("프로그램에서 사용할 배열의 길이를 다시 확인해주세요.");
			}
		}
		
		/***
		 * 학생 한 명의 데이터를 등록하는 테스트 메소드
		 * 
		 * @param controller
		 */
		public static void insertStudentTest(Controller controller) {
			
			// 학생 객체 생성
			Student stu = new Student();
			
			stu.setStuName("Student");
			stu.setKorScore(80);
			stu.setEngScore(90);
			stu.setMathScore(70);
			
			// controller 통해서 학생 한 명 등록 메소드 호출.
			int result = controller.insertStudent(stu);
			
			// 결과 확인
			if (result == StudentEntity.ERR_ARRAY_FULL) {
				System.out.println("배열에는 저장할 공간이 없습니다.");
			} else {
				controller.searchAllStudent();
			}
			
		}

	}