package com.google.s1.employee;

import java.util.ArrayList;
import java.util.List;


public class EmployeeView {
	
	
	
	
	//전체 출력 
	public void view(List<EmployeeDTO> ar) {
		
	 for(int i=0;i<ar.size();i++) {
		 System.out.print(ar.get(i).getEmployee_id()+"\t");
		 System.out.print(ar.get(i).getFirst_name()+"\t");
		 System.out.print(ar.get(i).getLast_name()+"\t");
		 System.out.print(ar.get(i).getEmail()+"\t");
		 System.out.print(ar.get(i).getPhone_number()+"\t");
		 System.out.print(ar.get(i).getHire_date()+"\t");
		 System.out.print(ar.get(i).getJob_id()+"\t");
		 System.out.print(ar.get(i).getSalary()+"\t");
		 System.out.print(ar.get(i).getCommission_pct()+"\t");
		 System.out.print(ar.get(i).getManager_id()+"\t");
		 System.out.println(ar.get(i).getDepartment_id());
		 System.out.println("=============================================");

	 }
	}
	
	public void view(EmployeeDTO employeeDTO) {
		 System.out.print(employeeDTO.getEmployee_id()+"\t");
		 System.out.print(employeeDTO.getFirst_name()+"\t");
		 System.out.print(employeeDTO.getLast_name()+"\t");
		 System.out.print(employeeDTO.getEmail()+"\t");
		 System.out.print(employeeDTO.getPhone_number()+"\t");
		 System.out.print(employeeDTO.getHire_date()+"\t");
		 System.out.print(employeeDTO.getJob_id()+"\t");
		 System.out.print(employeeDTO.getSalary()+"\t");
		 System.out.print(employeeDTO.getCommission_pct()+"\t");
		 System.out.print(employeeDTO.getManager_id()+"\t");
		 System.out.println(employeeDTO.getDepartment_id());
		 System.out.println("===============================================");
	}
	
	
	

}
