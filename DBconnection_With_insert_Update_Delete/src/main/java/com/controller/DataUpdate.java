package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import com.model.Aemployee;

public class DataUpdate {
	public static void main(String[] args) {
		Connection conn;
		Aemployee ae = new Aemployee();
		List<Aemployee> list = Aemployee.sendD();
		
			try {
				conn = DriverManager.getConnection("jdbc:sqlserver://vNTDACWSSQLD002:1433;"
						+ "databaseName=DEV_TEST;user=dev_test_dbo;password=dev_test_dbo123");
				System.out.println("Success");
				
				for(int i=0;i<list.size();i++) {
					PreparedStatement stm = conn.prepareStatement("update aemployee set ename=?, sal=? where id=?");
					
					stm.setString(1, list.get(i).getEname());
					stm.setInt(2, list.get(i).getSal());
					stm.setInt(3, list.get(i).getId());
					stm.executeUpdate();
					System.out.println("Updated");
				}
				
				
				// conn.close();
			} catch (Exception e) {
				System.out.println(e);
			}
			

	}
}
