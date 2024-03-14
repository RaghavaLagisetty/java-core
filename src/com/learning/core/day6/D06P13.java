package com.learning.core.day6;

import java.util.Hashtable;

class Employee4 {
    private int id;
    private String name;
    private String designation;
    private String department;

    public Employee4(int id, String name, String designation, String department) {
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
        Employee4 employee = (Employee4) obj;
        return id == employee.id;
    }
}

public class D06P13{
    public static void main(String[] args) {
        Hashtable<Integer, Employee4> employeeHashtable = new Hashtable<>();

        Employee4 emp1 = new Employee4(1001, "Grace", "Tech Support", "HR");
        Employee4 emp2 = new Employee4(1002, "Robert", "Product Manager", "Development");
        Employee4 emp3 = new Employee4(1003, "Thomas", "Tester", "Testing");
        Employee4 emp4 = new Employee4(1004, "Daniel", "Analyst", "L&D");
        Employee4 emp5 = new Employee4(1005, "Charles", "QA Lead", "Testing");

        employeeHashtable.put(emp1.hashCode(), emp1);
        employeeHashtable.put(emp2.hashCode(), emp2);
        employeeHashtable.put(emp3.hashCode(), emp3);
        employeeHashtable.put(emp4.hashCode(), emp4);
        employeeHashtable.put(emp5.hashCode(), emp5);

        int numberOfKeys = employeeHashtable.size();
        System.out.println(numberOfKeys);
    }
}

