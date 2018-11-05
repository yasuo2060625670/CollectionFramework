package genericDemo;

import Tool.Tool;
import bean.Student;

public class GenericDifineDemo {
public static void main(String[] args) {
	
	Tool<Student> tool = new Tool<Student>();
	tool.setObject(new Student());
	Student stu = tool.getObject();
	stu.study();
	
//	Tool tool = new Tool();
	
//	tool.setObj(new Student());
//	
//	Student stu = (Student)tool.getObj();
}
}
