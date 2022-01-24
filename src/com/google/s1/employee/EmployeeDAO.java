package com.google.s1.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.google.s1.department.DepartmentDTO;
import com.google.s1.util.DBConnector;

public class EmployeeDAO {

	private DBConnector dbConnector;

	public EmployeeDAO() {
		dbConnector = new DBConnector();
	}

	// 전체사원
	public List<EmployeeDTO> getList() throws Exception {
		Connection con = dbConnector.getConnect();
		String sql = "SELECT * FROM EMPLOYEES";
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		ArrayList<EmployeeDTO> ar = new ArrayList<>();
		while (resultSet.next()) {
			EmployeeDTO employeeDTO = new EmployeeDTO();
			employeeDTO.setEmployee_id(resultSet.getInt("employee_id"));
			employeeDTO.setFirst_name(resultSet.getString("first_name"));
			employeeDTO.setLast_name(resultSet.getString("last_name"));
			employeeDTO.setEmail(resultSet.getString("email"));
			employeeDTO.setPhone_number(resultSet.getString("phone_number"));
			employeeDTO.setHire_date(resultSet.getDate("hire_date"));
			employeeDTO.setJob_id(resultSet.getString("job_id"));
			employeeDTO.setSalary(resultSet.getInt("salary"));
			employeeDTO.setCommission_pct(resultSet.getInt("commission_pct"));
			employeeDTO.setManager_id(resultSet.getInt("manager_id"));
			employeeDTO.setDepartment_id(resultSet.getInt("department_id"));

			ar.add(employeeDTO);
		}
		return ar;
	}

	// 사원 번호 검색하기
	public EmployeeDTO getOne(EmployeeDTO employeeDTO) throws Exception {
		Connection con = dbConnector.getConnect();
		String sql = "SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID=?";
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setInt(1,employeeDTO.getEmployee_id());
		ResultSet resultSet=preparedStatement.executeQuery();
		
		
		if(resultSet.next()) {
	employeeDTO=new EmployeeDTO();
	employeeDTO.setEmployee_id(resultSet.getInt("employee_id"));
	employeeDTO.setFirst_name(resultSet.getString("first_name"));
	employeeDTO.setLast_name(resultSet.getString("last_name"));
	employeeDTO.setEmail(resultSet.getString("email"));
	employeeDTO.setPhone_number(resultSet.getString("phone_number"));
	employeeDTO.setHire_date(resultSet.getDate("hire_date"));
	employeeDTO.setJob_id(resultSet.getString("job_id"));
	employeeDTO.setSalary(resultSet.getInt("salary"));
	employeeDTO.setCommission_pct(resultSet.getInt("commission_pct"));
	employeeDTO.setManager_id(resultSet.getInt("manager_id"));
	employeeDTO.setDepartment_id(resultSet.getInt("department_id"));
		}

	return employeeDTO;
	}

}
