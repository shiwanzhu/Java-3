package student;

public class choose {
	
	 public static void main(String[] args) {
		  Student stu = new Student(001,"����","Ů");
		  Course cour = new Course(1,102,"����","����ŵ�","A��ʦ");
		  Teacher teacher=new Teacher(01,"A��ʦ","��");
		  stu.setCourse(cour); 
		  System.out.printf("ѧ����"+stu+"\n");
		  System.out.printf("ѡ����ϢΪ"+cour+"\n");
		  System.out.printf("��ʦ��ϢΪ��"+teacher);
		 
		}
	 

}

