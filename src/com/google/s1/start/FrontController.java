package com.google.s1.start;

import java.util.Scanner;

import com.google.s1.department.DepartmentController;
import com.google.s1.employee.EmployeeController;
import com.google.s1.location.LocationController;

public class FrontController {
//로케이션 컨트롤러 디파트먼트 컨트롤러 모두 제어할거임

	private Scanner sc;
	private DepartmentController departmentController;
	private LocationController locationController;
	private EmployeeController employeeController;

	public FrontController() {
		sc = new Scanner(System.in);
		departmentController = new DepartmentController();
		locationController = new LocationController();
		employeeController = new EmployeeController();
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
			employeeController.start();
				break;
			case 2:
				departmentController.start();
				break;
			case 3:
				locationController.start();
				break;
				
			default :
				flag=false;

			}

		}
	}

}
