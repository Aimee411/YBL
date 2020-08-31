package com.ybl;

import com.ybl.dao.EmploymentMapper;
import com.ybl.dao.Resume_EmploymentMapper;
import com.ybl.entity.Employment;
import com.ybl.entity.Resume_Employment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-dao.xml", "classpath:spring-web.xml"})
public class TestResume_EmploymentDao {
    @Autowired
    Resume_EmploymentMapper resume_employmentMapper;
    @Test
    public void testselectByPrimaryKey(){
        List<Resume_Employment> resume_employments= resume_employmentMapper.findAllReEmp(1);
        System.out.println(resume_employments);
        for (Resume_Employment e:resume_employments
        ) {
            System.out.println(e.getResumeStatus());
        }
    }
}
