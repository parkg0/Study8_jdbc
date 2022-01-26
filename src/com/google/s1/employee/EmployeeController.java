package com.google.s1.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeController {
	EmployeeDAO employeeDAO = new EmployeeDAO();
	EmployeeView employeeView = new EmployeeView();
	Scanner sc = new Scanner(System.in);

	
	
	public void start() throws Exception {
		
	boolean flag=true;
		
	while(flag) {
		
		System.out.println("1. 전체 사원 조회");
		System.out.println("2. 사원번호로 사원정보 검색");
		System.out.println("3. 이전화면으로 나가기 ");
		int select = sc.nextInt();
		
		
		switch(select) {
		
		//전체 조회 
		case 1:
			List<EmployeeDTO> ar = employeeDAO.getList();
			employeeView.view(ar);
			break;
			
		//사원 번호 검색
		case 2:
			System.out.println("사원 번호를 입력하세요");
			EmployeeDTO employeeDTO = new EmployeeDTO();
			employeeDTO.setEmployee_id(sc.nextInt());
			employeeView.view(employeeDAO.getOne(employeeDTO));
		
			break;
			
		//나가기
		case 3:
			System.out.println("이전 화면으로 돌아갑니다.");
			flag= false;
			break;


		}
	}

	}

}
