package Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.omg.CORBA.portable.CustomValue;

import Controller.Mainn;
import Dao.EmployeeDataAccessObject;
import Model.EmployeeGS;

public class EmployeeServiceImpl implements EmployeeDataAccessObject {
	
	//List a = new ArrayList();

	@Override
	public boolean updateEmployee(int id, String name, int salary) {
		return false;
	
	}

	@Override
	public boolean deleteEmployee(List<EmployeeGS> list,int a) {
		 list.remove(a);
		 return true;
	}

	public static List<EmployeeGS> addEmployee() {
		EmployeeGS e1 = new EmployeeGS(1,"turag",2000);
		EmployeeGS e2 = new EmployeeGS(1,"turag",2000);
		EmployeeGS e3 = new EmployeeGS(1,"turag",2000);
		EmployeeGS e4 = new EmployeeGS(1, "jjj", 123);
		List<EmployeeGS > list = Arrays.asList(e1,e2,e3,e4);
		return list;
		
	}

	@Override
	public void deleteEmployee(int a) {
		// TODO Auto-generated method stub
		
	}
	
}
