package Com.lti;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.lti.config.MobileConfig;
import Com.lti.dao.MobileDAO;
import Com.lti.pojo.Mobile;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(MobileConfig.class);
    
    	MobileDAO jdo= context.getBean(MobileDAO.class);
    	Mobile m=new Mobile(7,"vivov9","vivo");
    	jdo.addMobile(m);
    	
    	
    	//jdo.updateMobile(m);
    	//jdo.deleteMobile(10912);
    	
    	
    	List<Mobile> mobiles=jdo.getAllMobile();
    	for(Mobile n :mobiles)
    	{
    		System.out.println(n);
    	}
    }
}
