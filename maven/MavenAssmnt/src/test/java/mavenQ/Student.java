package mavenQ;

public class Student {
	private String name;
	private String course;
	private double fee;

	public Student(String name, String course, double fee) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.course=course;
		this.fee=fee;
	}
	
	@Override
	public String toString() {
		return "Name: "+ name +", Course: "+ course +", Fee: "+ fee;
		
	}

}