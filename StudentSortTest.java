package TreeSetDemo;

import java.util.TreeSet;

public class StudentSortTest {
public static void main(String[] args) {
	
	
	StudentCityComprator stdsortname=new StudentCityComprator();
	StudentCityComprator stdsortcity=new StudentCityComprator();
	StudentRollNoComparator stdsortroll=new StudentRollNoComparator();
	
	TreeSet<Student>treeset1=new TreeSet<Student>(stdsortname);
	TreeSet<Student>treeset2=new TreeSet<Student>(stdsortcity);
	TreeSet<Student>treeset3=new TreeSet<Student>(stdsortroll);
	
	Student s1=new Student(10,"suraj","kolhapur");
	Student s2=new Student(40,"komal","pune");
	Student s3=new Student(20,"Deepak","satara");
	Student s4=new Student(40,"Sachin","sangli");
	
	treeset1.add(s1);
	treeset1.add(s2);
	treeset1.add(s3);
	treeset1.add(s4);
	System.out.println("sorted by name="+treeset1);
	
	treeset2.add(s1);
	treeset2.add(s2);
	treeset2.add(s3);
	treeset2.add(s4);
	System.out.println("sorted by rollno="+treeset2);
	
	treeset3.add(s1);
	treeset3.add(s2);
	treeset3.add(s3);
	treeset3.add(s4);
	
	System.out.println("sorted by city="+treeset3);
	
	
	
}
}
