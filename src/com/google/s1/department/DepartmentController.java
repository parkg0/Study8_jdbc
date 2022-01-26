package com.google.s1.department;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentController {

	private DepartmentDAO departmentDAO;
	private DepartmentView departmentView;
	private DepartmentInput departmentInput;
	private Scanner sc;

	// 생성자에서 객체 생성하기
	public DepartmentController() {
		departmentDAO = new DepartmentDAO();
		departmentView = new DepartmentView();
		departmentInput = new DepartmentInput();
		sc = new Scanner(System.in);
	}

	public void start() throws Exception {
		boolean flag = true;
		DepartmentDTO departmentDTO=null;
	String message=null;
		while (flag) {
			System.out.println("1. 부서 리스트 출력");
			System.out.println("2. 부서 번호 검색");
			System.out.println("3. 부서 추가하기");
			System.out.println("4. 부서 삭제하기");
			System.out.println("5. 이전 선택 메뉴로 나가기");
			int select = sc.nextInt();
			int result =0;

			switch (select) {
			case 1:
				List<DepartmentDTO> ar = departmentDAO.getList();
				departmentView.view(ar);
				break;

			case 2:
				System.out.println("검색할 부서번호를 입력하세요");
				departmentDTO = new DepartmentDTO();
				departmentDTO.setDepartment_id(sc.nextInt());
				departmentDTO = departmentDAO.getOne(departmentDTO);

				if (departmentDTO != null) {
					departmentView.View(departmentDTO);

				} else {
					System.out.println("정보를 찾을 수 없습니다.");
				}
				break;

			case 3:
				departmentDTO=departmentInput.setInsert();
				result=departmentDAO.setInsert(departmentDTO);
				message="Delete Fail";
				if(result>0) {
					message="Insert Success";
				}
				departmentView.View(message);
				break;	
				
			case 4:
				departmentDTO=departmentInput.setDelete();
				result=departmentDAO.setDelete(departmentDTO);
				message="Delete Fail";
				if(result>0) {
					message="Insert Success";
				}
				departmentView.View(message);
				break;	
				
			default:
				flag = false;
			}

		}

	}
}
