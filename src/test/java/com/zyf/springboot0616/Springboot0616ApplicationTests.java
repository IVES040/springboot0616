package com.zyf.springboot0616;

import com.zyf.springboot0616.entity.SysCustomerGradeProductRel;
import com.zyf.springboot0616.service.SysCustomerGradeProductRelService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot0616ApplicationTests {
    @Autowired
    private SysCustomerGradeProductRelService  sysCustomerGradeProductRelService;

    @Test
    void contextLoads() {
        SysCustomerGradeProductRel sysCustomerGradeProductRel = new SysCustomerGradeProductRel();
        sysCustomerGradeProductRel.setCustomer_manager_grade_information_number("001");
        sysCustomerGradeProductRel.setCustomer_manager_grade("0");
        sysCustomerGradeProductRel.setPersonal_credit_limit(1000);
        sysCustomerGradeProductRel.setCorporate_credit_limit(100000);
        sysCustomerGradeProductRel.setProduct_number("0616");
        sysCustomerGradeProductRelService.save(sysCustomerGradeProductRel);


    }

}
