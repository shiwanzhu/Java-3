package student;

public class choose {
	
	 public static void main(String[] args) {
		  Student stu = new Student(001,"嘻嘻","女");
		  Course cour = new Course(1,102,"高数","上午九点","A老师");
		  Teacher teacher=new Teacher(01,"A老师","男");
		  stu.setCourse(cour); 
		  System.out.printf("学生："+stu+"\n");
		  System.out.printf("选课信息为"+cour+"\n");
		  System.out.printf("教师信息为："+teacher);
		 
		}
	 

}

