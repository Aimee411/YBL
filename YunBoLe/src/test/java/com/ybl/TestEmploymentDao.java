package com.ybl;

import com.ybl.dao.CompanyMapper;
import com.ybl.dao.EmploymentMapper;
import com.ybl.entity.Company;
import com.ybl.entity.Employment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-dao.xml", "classpath:spring-web.xml"})
public class TestEmploymentDao {
    @Autowired
    EmploymentMapper employmentMapper;
     @Test
    public void testselectByPrimaryKey(){
        List<Employment> employment= employmentMapper.selectAllemp();
        System.out.println(employment);
         for (Employment e:employment
              ) {
              System.out.println(e.getCompanyId());
         }
     }
}
