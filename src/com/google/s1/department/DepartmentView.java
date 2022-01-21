package com.google.s1.department;

import java.util.List;

public class DepartmentView {

	public void view(List<DepartmentDTO> ar) {
		//모두 출력 
		
		for(int i =0; i< ar.size(); i++) {
			this.View(ar.get(i));
			System.out.println("---------------------------------------");
		}
	}
	
	public void View(DepartmentDTO departmentDTO) {
		//부서 검색해서 하나만 출력
		System.out.print(departmentDTO.getDepartment_id()+"\t");
		System.out.print(departmentDTO.getDepartment_name()+"\t");
		System.out.print(departmentDTO.getManager_id()+"\t");
		System.out.println(departmentDTO.getLocation_id());
		
	}
	
	
}
