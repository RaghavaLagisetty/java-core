package com.learning.core.day6;

import java.util.Hashtable;
import java.util.Scanner;

class Employee3 {
    private int id;
    private String name;
    private String designation;
    private String department;

    public Employee3(int id, String name, String designation, String department) {
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
        Employee3 employee = (Employee3) obj;
        return id == employee.id;
    }
}

public class D06P12 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee3> employeeHashtable = new Hashtable<>();

        Employee3 emp1 = new Employee3(1001, "Daniel", "Analyst", "L&D");
        Employee3 emp2 = new Employee3(1002, "Thomas", "Tester", "Testing");
        Employee3 emp3 = new Employee3(1003, "Robert", "Product Manager", "Development");
        Employee3 emp4 = new Employee3(1004, "Grace", "Tech Support", "HR");

        employeeHashtable.put(emp1.hashCode(), emp1);
        employeeHashtable.put(emp2.hashCode(), emp2);
        employeeHashtable.put(emp3.hashCode(), emp3);
        employeeHashtable.put(emp4.hashCode(), emp4);

        Scanner scanner = new Scanner(System.in);
        int id = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        String designation = scanner.nextLine();
        String department = scanner.nextLine();

        Employee3 newEmployee = new Employee3(id, name, designation, department);
        if (!employeeHashtable.containsKey(newEmployee.hashCode())) {
            employeeHashtable.put(newEmployee.hashCode(), newEmployee);
        }
        
        System.out.println("Employees:");
        for (Employee3 emp : employeeHashtable.values()) {
            System.out.println(emp.toString());
        }
    }
}
