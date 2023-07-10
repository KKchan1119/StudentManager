package com.entity;

/***
 * 학생 한 명에 대한 학생 정보 및 국어, 영어, 수학 점수를 정의한 클래스.
 */
public class Student {

	int stuNo;
	String stuName;
	int korScore;
	int engScore;
	int mathScore;
	
	public int getStuNo() {
		return stuNo;
	}
	
	public void setStuNo(int stuNo) {
		// this.stuNo : this 는 인스턴스 변수를 나타냄.
		// stuNo : 매개변수를 나타냄.
		this.stuNo = stuNo;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	// 총점 구하는 메소드
	public int getTotScore() {
		return korScore + engScore + mathScore;
	}
	
	// 평균 구한는 메소드
	public float getAvgScore() {
		return getTotScore()/3.0f;
	}
}
