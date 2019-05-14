package Dao;

import java.util.List;

import Model.EmployeeGS;

public interface EmployeeDataAccessObject {
	//boolean addEmployee(int id,String name,int salary);
	void deleteEmployee(int a);
	public static List<EmployeeGS> addEmployee() {
		return null;
	}
	boolean updateEmployee(int id,String name,int salary);
    boolean deleteEmployee(List<EmployeeGS> list,int a);
	
}
