package demo.jenkins;

public class Grade {

	public String convert(int score) {
		String grade = "F";
		if(score >= 80) {
			grade = "A";
		}
		if(score >= 70) {
			grade = "B";
		}
		if(score >= 60) {
			grade = "C";
		}
		if(score >= 50){
			grade = "D";
		}
		return grade;
		//TODO
		//FIXME
	}

}
