package TreeSetDemo;

public class Student {
int roll;
String name;
String city;

public Student() {
	
}

public Student(int roll, String name, String city) {
	super();
	this.roll = roll;
	this.name = name;
	this.city = city;
}

@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + ", city=" + city + "]";
}



}
