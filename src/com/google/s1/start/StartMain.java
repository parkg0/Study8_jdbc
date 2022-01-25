package com.google.s1.start;

import java.util.ArrayList;
import java.util.List;

import com.google.s1.department.DepartmentController;
import com.google.s1.department.DepartmentDAO;
import com.google.s1.department.DepartmentDTO;
import com.google.s1.department.DepartmentView;
import com.google.s1.employee.EmployeeDAO;
import com.google.s1.employee.EmployeeDTO;
import com.google.s1.employee.EmployeeView;
import com.google.s1.location.LocationDAO;
import com.google.s1.location.LocationView;
import com.google.s1.region.RegionDAO;
import com.google.s1.region.RegionDTO;
import com.google.s1.util.DBConnector;

public class StartMain {

	public static void main(String[] args) throws Exception {
		System.out.println("DB연동 테스트 시작");
		
				FrontController frontController = new FrontController();
		try {
			//frontController.mainStart();
			RegionDAO regionDAO = new RegionDAO();
			RegionDTO regionDTO = new RegionDTO();
			regionDTO.setRegion_id(6L);
			regionDTO.setRegion_name("South Pole");
			
			int result = regionDAO.setDelete(regionDTO);
//			int result =regionDAO.setInsert(regionDTO);
			if(result>0) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
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
