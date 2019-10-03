package revision;

public class StudentEnrolment {

	public static void main(String[] args) {
		
		//new objects/instances of student
		Student student1 = new Student("martin", 18);
		Student student2 = new Student("tori", 17);
		Student student3 = new Student("shivani", 19);
		System.out.println(Student.numberOfStudents);
		//can just use class name and dot to access static variable
		
		//calling static method
		System.out.println(Student.getNumberOfStudents());
		
		//have to have instance to get access to get name method
		//so this won't work
		//System.out.println(Student.getName());
	}
	
	

}