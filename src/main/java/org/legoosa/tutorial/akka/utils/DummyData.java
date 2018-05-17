package org.legoosa.tutorial.akka.utils;

import java.util.ArrayList;
import java.util.List;

import org.legoosa.tutorial.akka.vo.Employee;

public class DummyData {

	public static List<Employee> getEmployeeDetails(){
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "Suresh Kumar Devaraj", "suresh@gmail.com", 32));
		empList.add(new Employee(2, "Lokesh", "lokesh@gmail.com", 25));
		empList.add(new Employee(3, "Kamal", "kamal@gmail.com", 24));
		empList.add(new Employee(4, "Bala", "bala@gmail.com", 29));
		empList.add(new Employee(5, "Senthil", "senthil@gmail.com", 30));
		empList.add(new Employee(6, "Sriram", "sriram@gmail.com", 31));
		empList.add(new Employee(7, "Hari", "hari@gmail.com", 32));
		empList.add(new Employee(8, "Kumar", "kumar@gmail.com", 23));
		empList.add(new Employee(9, "Subash", "subash@gmail.com", 20));
		empList.add(new Employee(10, "Sakthi", "sakthi@gmail.com", 22));
		return empList;
	}
}
