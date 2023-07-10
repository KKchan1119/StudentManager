package com.controller;

import com.entity.Student;
import com.entity.StudentEntity;
import com.view.StudentView;

/***
 * 3Tier 아키텍처에서 client 의 request를 받는 역할을 담당.
 * client 의 해당 request 에 대한 서비스와 매핑을 해주는 역할을 담담.
 * 
 * 성적 관리 프로그램의 전체적인 기능적인 요소를 관리.
 */
public class Controller {
	
	// DB와 연동되는 클래스
	StudentEntity studentEntity;
	// 결과물 출력을 하는 클래스
	StudentView studentView;
	
	public static int ERR_ARRAY_LENGTH = 0;
	public static int INFO_SUCCESS = 1;
	public static int DEFAULT_ARRAY_LENGTH =6;
	
	
	// 초기화 및 샘플 데이터 등록 기능
	public int initController(int arrLength, boolean sampleDataInsert) {
		
		//생성할 배열의 길이가 0이면 Controller.ERR_ARRAY_LENGTH 에러를 반환
		if(arrLength < 1) return Controller.ERR_ARRAY_LENGTH;
		
		//생성할 배열의 길이가 5보다 같거나 작으면 기본 배열 길이를 Controller.DEFAULT_ARRAY_LENGTH 설정.
		if(arrLength <= 5) arrLength = Controller.DEFAULT_ARRAY_LENGTH;
		
		//위 조건문이 문제가 없을때 Entity 객체 생성
		studentEntity = new StudentEntity();
		//Entity에서 배열 생성 및 샘플 데이터 입력.
		initEntity(arrLength, sampleDataInsert);
		
		//등록된 데이터 출력.
		//출력 객체 생성.
		studentView = new StudentView();
		
		//Entity 및 출력 객체 정상 생성. 배열 생성 및 샘플 데이터 저장. => 성공적으로 처리됨.
		return Controller.INFO_SUCCESS;
	}
	
	// Entity 초기화 
	/***
	 * Entity 초기화를 필요한 정보를 바탕으로 배열을 생성.
	 * @param arrLength 생성할 배열의 길이
	 * @param sampleDataInser 샘플데이터를 insert 할 건지의 여부
	 */
	public void initEntity(int arrLength, boolean sampleDataInsert) {
		studentEntity.initStudentEntity(arrLength, sampleDataInsert);
	}
	
	// 전제 등록된 데이터 출력 기능
	/***
	 * 등록된 모든 학생의 성적정보를 출력
	 */
	public void searchAllStudent() {
		studentView.printAllStudents(studentEntity.getStuArr(), studentEntity.getNextArrIdx());
	}
	
	// 한 건의 데이터가 저장되는 기능
	/***
	 * 학생 한 명의 데이터를 저장.
	 * @param stu 학생 한 명의 데이터.
	 * @return 배열의 저장 공간이 없는 경우의 상수값
	 */
	public int insertStudent(Student stu) {
		int result = studentEntity.insertStudent(stu);
		
		return result;
	}
	
}