package com.google.s1.department;

import java.util.Scanner;

public class DepartmentInput {

	private Scanner sc;
	
	public DepartmentInput() {
		sc=new Scanner(System.in);
	}

	
	public DepartmentDTO setDelete() {
		DepartmentDTO departmentDTO = new DepartmentDTO();

		System.out.println("삭제할 부서의 부서아이디를 입력하세요");
		departmentDTO.setDepartment_id(sc.nextInt());
		
		return departmentDTO;
	}

	public DepartmentDTO setInsert() {
		DepartmentDTO departmentDTO = new DepartmentDTO();

		System.out.println("추가할 부서의 이름을 입력하세요");
		departmentDTO.setDepartment_name(sc.next());
		System.out.println("매니저 아이디를 입력하세요");
		departmentDTO.setManager_id(sc.nextInt());
		System.out.println("부서의 location_id를 입력하세요");
		departmentDTO.setLocation_id(sc.nextInt());

		return departmentDTO;
	}
}
