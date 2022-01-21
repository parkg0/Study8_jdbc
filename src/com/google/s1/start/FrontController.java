package com.google.s1.start;

import java.util.Scanner;

import com.google.s1.department.DepartmentController;

public class FrontController {
//로케이션 컨트롤러 디파트먼트 컨트롤러 모두 제어할거임

	private Scanner sc;
	private DepartmentController departmentController;
	// LocationController 만들어
	// EmployeeController 만들어

	public FrontController() {
		sc = new Scanner(System.in);
		departmentController = new DepartmentController();
		//
		//
	}

	public void mainStart() throws Exception {
		boolean flag = true;

		while (flag) {
			System.out.println("1.직원관리");
			System.out.println("2.부서 관리");
			System.out.println("3.지역 관리");
			System.out.println("4.프로그램 종료");

			int select = sc.nextInt();
			switch (select) {
			case 1:
				// emlpoyeeController의 start메서드 호출
				break;
			case 2:
				departmentController.start();
				break;
			case 3:
				//locationController의 스타트 메서드 호출
				break;
				
			default :
				flag=false;

			}

		}
	}

}
