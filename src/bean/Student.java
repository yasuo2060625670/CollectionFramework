package bean;

public class Student extends Person {

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public void study()
	{
		System.out.println("study");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student:"+this.getAge()+this.getName();
	}
	
}
