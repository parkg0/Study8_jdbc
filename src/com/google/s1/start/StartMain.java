package com.google.s1.start;

import java.util.List;

import com.google.s1.department.DepartmentController;
import com.google.s1.department.DepartmentDAO;
import com.google.s1.department.DepartmentDTO;
import com.google.s1.department.DepartmentView;
import com.google.s1.location.LocationDAO;
import com.google.s1.location.LocationView;
import com.google.s1.util.DBConnector;

public class StartMain {

	public static void main(String[] args) {
		System.out.println("DB연동 테스트 시작");

		FrontController frontController = new FrontController();
		try {
			frontController.mainStart();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// DB연결
//		DBConnector dbConnector = new DBConnector();
//		try {
//			dbConnector.getConnect();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		//-------------------DEPARTMENT TEST--------------
//		DepartmentDAO departmentDAO = new DepartmentDAO();
////		DepartmentView departmentView = new DepartmentView();
//		try {
//			DepartmentDTO departmentDTO = new DepartmentDTO();
//			departmentDTO.setDepartment_id(20);
//			departmentDTO= departmentDAO.getOne(departmentDTO);
//			//DepartmentDTO departmentDTO=departmentDAO.getOne(20);
//			System.out.println(departmentDTO.getDepartment_name());
//			
////			List<DepartmentDTO> ar =departmentDAO.getList();
////			departmentView.view(ar);
//			
//		DepartmentController departmentController = new DepartmentController();
//		departmentController.start();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		// --------------Location Test--------------------------
//		LocationDAO locationDAO = new LocationDAO();
//		LocationView locationView = new LocationView();
//
//		try {
//			locationView.view(locationDAO.getList());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
		System.out.println("DB연동 테스트 끝");
	}

}
