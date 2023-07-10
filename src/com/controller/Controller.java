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
	
	// 초기화 및 샘플 데이터 등록 기능
	public int initController(int arrLength, boolean sampleDataInsert) {
	
		
		return 0;
	}
	
	// Entity 초기화 
	/***
	 * Entity 초기화를 필요한 정보를 바탕으로 배열을 생성.
	 * @param arrLength 생성할 배열의 길이
	 * @param sampleDataInser 샘플데이터를 insert 할 건지의 여부
	 */
	public void initEntity(int arrLength, boolean sampleDataInsert) {
		
	}
	
	// 전제 등록된 데이터 출력 기능
	/***
	 * 등록된 모든 학생의 성적정보를 출력
	 */
	public void searchAllStudent() {
		
	}
	
	// 한 건의 데이터가 저장되는 기능
	/***
	 * 학생 한 명의 데이터를 저장.
	 * @param stu 학생 한 명의 데이터.
	 * @return 배열의 저장 공간이 없는 경우의 상수값
	 */
	public int insertStudent(Student stu) {
		int result = 0;
		
		return result;
	}
	
}