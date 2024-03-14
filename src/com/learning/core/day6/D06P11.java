package com.learning.core.day6;

import java.util.Hashtable;
import java.util.Scanner;

class Employee1 {
    private int id;
    private String name;
    private String designation;
    private String department;

    public Employee1(int id, String name, String designation, String department) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.department = department;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

    @Override
    public String toString() {
        return id + " " + name + " " + designation + " " + department;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee1 employee = (Employee1) obj;
        return id == employee.id;
    }
}

public class D06P11 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee1> employeeHashtable = new Hashtable<>();
        Scanner sc=new Scanner(System.in);

        Employee1 emp1 = new Employee1(1001, "Grace", "Tech Support", "HR");
        Employee1 emp2 = new Employee1(1002, "Thomas", "Tester", "Testing");
        Employee1 emp3 = new Employee1(1003, "Robert", "Product Manager", "Development");
        Employee1 emp4 = new Employee1(1004, "Daniel", "Analyst", "L&D");

        employeeHashtable.put(emp1.hashCode(), emp1);
        employeeHashtable.put(emp2.hashCode(), emp2);
        employeeHashtable.put(emp3.hashCode(), emp3);
        employeeHashtable.put(emp4.hashCode(), emp4);

        
        int searchId = sc.nextInt();
        Employee1 foundEmployee = employeeHashtable.get(searchId);
        if (foundEmployee != null) {
            System.out.println(foundEmployee);
        } else {
            System.out.println("not found.");
        }
    }
}
