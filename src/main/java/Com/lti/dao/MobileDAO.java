package Com.lti.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import Com.lti.pojo.Mobile;

@Component
public class MobileDAO {
	
	@Autowired
	private JdbcTemplate jdbcObj;
	
	
	
	public void addMobile(Mobile mobile)
	{
		String qry="insert into MobileData values(?,?,?)";
		jdbcObj.update(qry,mobile.getImeno(),mobile.getModelName(),mobile.getManufac());
		System.out.println("Data added");
	
	}
	
	
	public List<Mobile> getAllMobile()
	{
		String qry="select * from MobileData";
		List<Mobile> mobiles=jdbcObj.query(qry, new MobileRowMapper());
		return mobiles;
	}

	
	public void updateMobile(Mobile mobile)
	{
		String qry="update MobileData set modelName=?,manufac=? where imeno=?";
		jdbcObj.update(qry,mobile.getModelName(),mobile.getManufac(),  mobile.getImeno());
		System.out.println("updated!!!!11111111");
	}
	
	public void deleteMobile(int imeno)
	{
		String qry="delete from MobileData where imeno=?";
		jdbcObj.update(qry,imeno);
		System.out.println("Deleted!!!!!!11");
	}
}
