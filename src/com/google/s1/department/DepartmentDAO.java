 package com.google.s1.department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.google.s1.util.DBConnector;

public class DepartmentDAO {
	// DAO : Data Access Object

	private DBConnector dbConnector;
	// 여기서만 사용할거니까 프라이빗
	
	public DepartmentDAO() {
		dbConnector = new DBConnector();
	}
	//객체는 하나만 있으면됨 DAO만들어질때 딱하나만 만들어지도록 생성자내에서 객체 만들기 
	
	
//부서번호로 조회
	public DepartmentDTO getOne(DepartmentDTO dep) throws Exception {
		DepartmentDTO departmentDTO = null;
		//1.DB에 로그인
		Connection con = dbConnector.getConnect();
		//2.쿼리문 작성
		String sql = "SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID = ?";
		//3.쿼리문을 미리 전송해서 db가 준비
		PreparedStatement st=con.prepareStatement(sql);
		//4. ? 값을 세팅 없으면 패쓰 
		//st.set데이터타입(int index,값); 
		//index는 ?의 순서번호
		//그러나 oracle은 1번부터 시
		st.setInt(1, dep.getDepartment_id());
		
		//5. 최종전송 후 결과 처리 
		ResultSet rs=st.executeQuery();
		//한개의 row가 있거나 없거나(부서번호 없는번호를 입력) 둘 중 하나 
		//데이터가 있을때 
		if(rs.next()) {
			departmentDTO= new DepartmentDTO();
			departmentDTO.setDepartment_id(rs.getInt("department_id"));
			departmentDTO.setDepartment_name(rs.getString("department_name"));
			departmentDTO.setManager_id(rs.getInt("manager_id"));
			departmentDTO.setLocation_id(rs.getInt("location_id"));
		}
		
		//6.자원해제 
		rs.close();
		st.close();
		con.close();
		
		return departmentDTO;
	}
	
//전체조회
	public List<DepartmentDTO> getList() throws Exception {
		ArrayList<DepartmentDTO> ar = new ArrayList();
		// SELECT * FROM DEPARTMENTS;
		// 1. DB 로그인 (util package에 만들어놨어 )
		Connection con = dbConnector.getConnect();

		// 2. SQL Query문 작성
		// java에서는 ;(세미콜론) 제외하고 작성
		String sql = "SELECT * FROM DEPARTMENTS";

		// 3. 작성한 SQL Query를 미리 전송
		//PreparedStatement 객체 생성하기 위해서는 Connection 인터페이스의 prepareStatement 메서를 호출
		PreparedStatement st = con.prepareStatement(sql);

		// 4. ? 값을 세팅, 없으면 통과

		// 5. 최종 전송 후 결과 처리
		ResultSet rs = st.executeQuery();

		// cursor가 한줄 읽는 메서드 =next()
		// 리턴은 데이터가 있으면 true 없으면 false
		while (rs.next()) {
			DepartmentDTO departmentDTO = new DepartmentDTO();
			departmentDTO.setDepartment_name(rs.getString("department_name"));
			departmentDTO.setDepartment_id(rs.getInt("department_id"));
			departmentDTO.setManager_id(rs.getInt("manager_id"));
			departmentDTO.setLocation_id(rs.getInt("location_id"));
			
			//Arraylist
			ar.add(departmentDTO);
		}
		// 6. 외부 연결 해제
		// 연결된 순서의 역순으로 끊어주면 됨
		rs.close();
		st.close();
		con.close();

		return ar;
	}

}
