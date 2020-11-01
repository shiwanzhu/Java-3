班级：计G202  
学号：2020322089  
姓名：石琬竹

# Java-3
Java实验项目

# 阅读程序  

## 一、实验目的
1.掌握面向对象的类设计方法（属性、方法）；

2.掌握类的继承用法，通过构造方法实例化对象；

3.学会使用super()，用于实例化子类；

4.掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。

## 二、实验过程  
1.打开eclipse 创建Java项目 Student Class

2.在Java项目中 创建1个包student

3.在student包中分别创建people类，student类，teacher类，course类和choose类

4.在people类中定义id，name，sex属性

5.在student类中定义course属性并继承people类的属性

6.在teacher类中定义course属性并继承people类的属性

7.在course类中定义cid,cadd,cname,cteacher,ctime属性

8.在主类choose类中添加老师同学和选课信息并打印


## 三、核心方法  
1.方法一
```
	public People(int id,String name,String sex){
		this.id=id;
		this.name=name;
		this.sex=sex;
	}
```
2.方法二
```
public class Student extends People{
	 String course;
	public Student(int id, String name, String sex) {
		super(id, name, sex);
		
	}
3.方法三
```
public String toString() {
		return this.id+" "+this.name+" "+this.sex+" ";
	}
```
4.方法四
```
public class Teacher extends People{
    String course;
    
	 public Teacher(int id,String name,String sex){
		 super(id,name,sex);
	 }

```
5.方法五
```
public String toString() {
		return this.id+" "+this.name+" "+this.sex+" ";
	}
```
6.方法六
```
public Course(int cid,int cadd,String cName,String ctime,String cteacher){
		this.cid=cid;
		this.cadd=cadd;
		this.cName=cName;
		this.ctime=ctime;
		this.cteacher=cteacher;
		
	}

```
7.方法七
```

public String getCourse() {
		return course;
	}
	public void setCourse(String cour) {
		this.course = cour;
	}


```

## 四、实验结果  
```
学生：1 嘻嘻 女 
选课信息为1 102 高数 上午九点 A老师
教师信息为：1 A老师 男 
```

## 五、实验感想  
通过本次实验，我掌握面向对象的类设计方法，了解类的继承用法，通过构造方法实例化对象，并学会使用super()，用于实例化子类，使用Object根类的toString（）方法,
在这过程中遇到了很多的困难，要感谢同学和的老师帮助，让我顺利的完成了这次试验，同时也让发现了自己对知识掌握不够，要继续努力学习。

