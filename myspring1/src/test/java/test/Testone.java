package test;

import com.dao.AcountDao;
import com.service.AcountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testone {
    public static void main(String[] args) {
        ApplicationContext ac= new ClassPathXmlApplicationContext("bean.xml");
        AcountDao acountDao = ac.getBean("set", AcountDao.class);
       // AcountService acountService = ac.getBean("acountService", AcountService.class);
        System.out.println(acountDao);
        //System.out.println(acountService);
        acountDao.findAll();
      //  acountService.findAll();

    }
}
