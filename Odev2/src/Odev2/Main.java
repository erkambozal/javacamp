package Odev2;

public class Main {

	public static void main(String[] args) {
	
		Course course1 = new Course(1,"Java + React","Engin Demiro�","Yaz�l�m Geli�tirici Yeti�tirme Kamp�","�cretsiz");
		Course course2 = new Course(2,"C# + Angular","Engin Demiro�","Yaz�l�m Geli�tirici Yeti�tirme Kamp�","�cretsiz");
		
		Course[] courses = {course1, course2};
		
		System.out.println(courses.length);
		
		for(Course course : courses)
		{
			System.out.println(course.courseName);
		}
		
		Student student1 = new Student();
		student1.Id = 1;
		student1.studentName = "Erkam Bozal";	
		
		Student student2 = new Student();
		student2.Id = 2;
		student2.studentName ="Ahmet Yu�a Ku�dil";
		
	}

}
