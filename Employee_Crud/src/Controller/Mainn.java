package Controller;

import java.util.Arrays;
import java.util.List;

import Model.EmployeeGS;
import Service.EmployeeServiceImpl;

public class Mainn {
   
	public static void main(String[] args) {
		EmployeeServiceImpl e = new EmployeeServiceImpl();
		e.deleteEmployee(3);
		e.addEmployee();
		List<EmployeeGS> list = EmployeeServiceImpl.addEmployee();
		e.deleteEmployee( list,2); //2 hocche index number
		System.out.println(list.get(1).getId());
		System.out.println(e.addEmployee());

	} 

}
