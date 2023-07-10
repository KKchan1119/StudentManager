package com.entity;
/***
 * 3Tier 아키텍처에서 DB(객체배열) 와의 연동을 담당. 비즈니스 로직(서비스)을 처리.
 */
public class StudentEntity {
	Student[] stuArr;
	
	//신규 데이터 저장시 배열의 위치정보
	int nextArrIdx;
	
	//현재 DB의 가용 공간 상태
	boolean stuArrStatus = false;
	
	//샘플 데이터의 수 => 배열에 저장시 실제 insert 되는 기준
	static int SAMPLE_DATA_COUNT = 5;
	
	//현재 DB의 가용 공간 상태 : 여유있
	static boolean ARRAY_STATUS_FULL = true;
	//현재 DB의 가용 공간 상태 : 여유없
	static boolean ARRAY_STATUS_NO_FULL = false;
	
	//현재 DB의 가용 공간 상태 : 여유없는경우의 에러
	public static int ERR_ARRAY_FULL = 2;
	// StudentEntity 초기화, 객체 배열 생성.
	
	// 한 건의 데이터가 저장되는 기능.
}