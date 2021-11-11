package Com.lti.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import Com.lti.dao.MobileDAO;

@Configuration
@ComponentScan("Com.lti")
public class MobileConfig {
	
	@Bean
	  public DataSource dataSource()
	{
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    
	    dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	    dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
	    dataSource.setUsername("hr");
	    dataSource.setPassword("hr");
	    
	    
	    return dataSource;
	  }
	
	
	@Bean
	public JdbcTemplate jdbcTemplate()
	{
		JdbcTemplate j=new JdbcTemplate(dataSource());
		return j;
		
	}
	
	

}
