package com.google.s1.region;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.google.s1.util.DBConnector;

public class RegionDAO {
	// 웬만하면 멤버변수들은 private으로 하세요
	private DBConnector dbConnector;

	public RegionDAO() {
		dbConnector = new DBConnector();
	}
	
//대륙정보 수정 //아이디 찾아서 네임 수정  ㅂ5번의 이름을 사우스폴로 
	public int setUpdate(RegionDTO regionDTO) throws Exception{
		Connection con = dbConnector.getConnect();
		String sql="UPDATE regions set region_name=? where region_id=?";
		PreparedStatement st=con.prepareStatement(sql);
		st.setString(1, regionDTO.getRegion_name());
		st.setLong(2, regionDTO.getRegion_id());
		int result= st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	}
	

//대륙정보 삭제 
	public int setDelete(RegionDTO regionDTO) throws Exception {
		Connection con = dbConnector.getConnect();
		String sql="DELETE regions where region_id=?";
		PreparedStatement st=con.prepareStatement(sql);
		st.setLong(1, regionDTO.getRegion_id());
		int result= st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;		
	}

//대륙정보 추가
	public int setInsert(RegionDTO regionDTO) throws Exception {
		// 1.db연결
		Connection con = dbConnector.getConnect();

		// java는 기본적으로 auto commit
	
		// 2.쿼리문 작성
		String sql = "Insert Into Regions (Region_Id,Region_Name) Values(?,?)";

		// 3.미리 전송
		PreparedStatement st = con.prepareStatement(sql);

		// 4. ? 세팅
		st.setLong(1, regionDTO.getRegion_id());
		st.setString(2, regionDTO.getRegion_name());

		// 5.최종 전송 후 결과처리
		int result = st.executeUpdate();


		// 6.자원 해제
		st.close();
		con.close();

		return result;

	}

	// 검색조회
	// 전체조회

}
