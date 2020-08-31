package com.ybl;

import com.ybl.dao.CompanyMapper;
import com.ybl.entity.Company;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-dao.xml", "classpath:spring-web.xml"})
public class TestCompanyDao {
    @Autowired
    CompanyMapper companyMapper;
     @Test
    public void testselectByPrimaryKey(){
       /* List<Company> company= companyMapper.selectByPrimaryKey(2001);
        System.out.println(company);*/
     }
}
