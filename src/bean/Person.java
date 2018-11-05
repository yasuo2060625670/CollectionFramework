package bean;

//import java.util.Comparator;


public class Person implements Comparable<Person>{
private String name;
private int age;



public Person(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Person() {
	super();
}

public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + age;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Person other = (Person) obj;
	if (age != other.age)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}

/*@Override//hashSet存对象时候保证不重复
public int hashCode() {
	
	return this.name.hashCode()+age;//位置，可能相同，20+40=30+30
}
@Override//hashSet存对象时候保证不重复
public boolean equals(Object obj) {
	if(this == obj)
		return true;
	if(!(obj instanceof Person))
		throw new ClassCastException("类型错误");
	Person p = (Person)obj;
	return this.name.equals(p.name)&&this.age==p.age;*/
//}
@Override//treeSet根据返回值判断是不是一个值
public int compareTo(Person p) {
	return -1;
//	int temp = this.age-p.age;
//	return temp == 0?this.name.compareTo(p.name):temp;
}
}



