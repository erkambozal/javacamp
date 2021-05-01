package Ödev3;

public class Student extends User {

private int id;	
private	String takenLesson;
private	String doneHomework;

	public Student() {
		
	}
	
	public Student(int id,String takenLesson, String doneHomework) {
		this.takenLesson = takenLesson;
		this.doneHomework = doneHomework;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTakenLesson() {
		return takenLesson;
	}

	public void setTakenLesson(String takenLesson) {
		this.takenLesson = takenLesson;
	}

	public String getDoneHomework() {
		return doneHomework;
	}

	public void setDoneHomework(String doneHomework) {
		this.doneHomework = doneHomework;
	}
}
