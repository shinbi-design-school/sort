package com.design_shinbi.exercise.sort;

public class Student {
	private String name;
	private int japanese;
	private int math;
	private int english;
	
	public Student(String name, int japanese, int math, int english) {
		this.name = name;
		this.japanese = japanese;
		this.math = math;
		this.english = english;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJapanese() {
		return japanese;
	}

	public void setJapanese(int japanese) {
		this.japanese = japanese;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}
	
	public String toString() {
		String line = String.format(
			"%5s: 国語 %3d  数学 %3d  英語 %3d",
			this.name,
			this.japanese,
			this.math,
			this.english
		);
		return line;
	}
}
