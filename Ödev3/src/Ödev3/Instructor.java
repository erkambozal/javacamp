package �dev3;

public class Instructor extends User {
	private int id;
	private String givenLesson;
	private String givenHomework;
	
	public Instructor() {
		
	}
	
	public Instructor(int id,String givenLesson, String givenHomework) {
		this.id = id;
		this.givenLesson = givenLesson;
		this.givenHomework = givenHomework;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGivenLesson() {
		return givenLesson;
	}

	public void setGivenLesson(String givenLesson) {
		this.givenLesson = givenLesson;
	}

	public String getGivenHomework() {
		return givenHomework;
	}

	public void setGivenHomework(String givenHomework) {
		this.givenHomework = givenHomework;
	}

}
