package org.legoosa.tutorial.akka.vo;

public class Employee {

	private int id;
	private String name;
	private String email;
	private int age;
	private boolean isSenior;

	public Employee() {}

	public Employee(int id, String name, String email, int age) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public boolean isSenior() {
		return isSenior;
	}

	public void setSenior(boolean isSenior) {
		this.isSenior = isSenior;
	}
}
