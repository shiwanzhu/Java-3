package student;

public class Teacher extends People{
    String course;
    
	 //¹¹Ôìº¯Êý
	 public Teacher(int id,String name,String sex){
		 super(id,name,sex);
	 }

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	public String toString() {
		return this.id+" "+this.name+" "+this.sex+" ";
	}
}



