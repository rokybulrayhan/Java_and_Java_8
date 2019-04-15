package com.controller;

import com.model.Aemployee;

@Slf4j
public class DataInsert {

	public static void main(String[] args) {
		Connection conn;
		Aemployee ae = new Aemployee();
		List<Aemployee> list = Aemployee.sendD();
		
			try {
				conn = DriverManager.getConnection("jdbc:sqlserver://vNTDACWSSQLD002:1433;"
						+ "databaseName=DEV_TEST;user=dev_test_dbo;password=dev_test_dbo123");
				System.out.println("Success");
				
				for(int i=0;i<list.size();i++) {
					PreparedStatement stm = conn.prepareStatement("insert into aemployee(id, ename,sal) values(?,?,?)");
					stm.setInt(1, list.get(i).getId());
					stm.setString(2, list.get(i).getEname());
					stm.setInt(3, list.get(i).getSal());
					stm.executeUpdate();
					//System.out.println("Inserted");
					log.info("insert");
				}
				
				
				// conn.close();
			} catch (Exception e) {
				System.out.println(e);
			}
			

	}

}
