package com.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Aemployee {
	int id;
	String ename;
	int sal;
	
	public static List<Aemployee> sendD(){
		Aemployee aa = new Aemployee(1,"Sam",1000);
		Aemployee ab = new Aemployee(2,"Sayem",35000);
		Aemployee ac = new Aemployee(3,"Ayman",45000);
		
		List<Aemployee> list = Arrays.asList(aa,ab,ac);
		return list;
	}
}
