package Com.lti.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import Com.lti.pojo.Mobile;

public class MobileRowMapper implements RowMapper<Mobile>{
	
	@Override
	public Mobile mapRow(ResultSet rs,int rownum) throws SQLException
	{
		Mobile m=new Mobile();
		m.setImeno(rs.getInt("imeno"));
		m.setModelName(rs.getString("modelName"));
		m.setManufac(rs.getString("manufac"));
		return m;
		
	}

}
