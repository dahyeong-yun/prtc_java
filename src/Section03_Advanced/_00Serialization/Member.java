package Section03_Advanced._00Serialization;

import java.io.Serializable;

public class Member implements Serializable {
	private String name;
	private String email;
	private int age;
	public Member(String string, String string2, int i) {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString( ) {
		return String.format("Member{name'%s', email='%s', age='%s'}",name,email,age);
	}
}
