package com.learning.core.day6;

import java.util.Hashtable;
import java.util.Map;

class Employee5 {
    private int id;
    private String name;
    private String designation;
    private String department;

    public Employee5(int id, String name, String designation, String department) {
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
        Employee5 employee = (Employee5) obj;
        return id == employee.id;
    }
}

public class D06P14 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee5> employeeHashtable = new Hashtable<>();

        Employee5 emp1 = new Employee5(1001, "Daniel", "Analyst", "L&D");
        Employee5 emp2 = new Employee5(1002, "Thomas", "Tester", "Testing");
        Employee5 emp3 = new Employee5(1003, "Robert", "Product Manager", "Development");
        Employee5 emp4 = new Employee5(1004, "Grace", "Tech Support", "HR");

        employeeHashtable.put(emp1.hashCode(), emp1);
        employeeHashtable.put(emp2.hashCode(), emp2);
        employeeHashtable.put(emp3.hashCode(), emp3);
        employeeHashtable.put(emp4.hashCode(), emp4);

        Map<Integer, Employee5> currentCollection = new Hashtable<>();
        currentCollection.put(1005, new Employee5(1005, "Charles", "QA Lead", "Testing"));
        currentCollection.put(1006, new Employee5(1006, "Henry", "Accountant", "Finance"));

        for (Map.Entry<Integer, Employee5> entry : currentCollection.entrySet()) {
            employeeHashtable.put(entry.getKey(), entry.getValue());
        }

        for (Employee5 emp : employeeHashtable.values()) {
            System.out.println(emp.toString());
        }
    }
}
