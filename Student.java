package student;

public class Student extends People{
	 String course;
	public Student(int id, String name, String sex) {
		super(id, name, sex);
		
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String cour) {
		this.course = cour;
	}
	public void setCourse(Course cour) {
		// TODO Auto-generated method stub
		
	}

	public String toString() {
		return this.id+" "+this.name+" "+this.sex+" ";
	}
	
	 
	 
	}


