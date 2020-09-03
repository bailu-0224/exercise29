package com.huadi.exercise29;

import com.huadi.exercise29.entity.Authentication;
import com.huadi.exercise29.entity.Customer;
import com.huadi.exercise29.repository.AuthenticationRepository;
import com.huadi.exercise29.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DaoTests {

    @Autowired
    private CustomerRepository cr;

    @Autowired
    private AuthenticationRepository aur;

    @Test
    void AuthenticationTest(){
        //aur.insert(new Authentication(0,"消防","头盔","哈哈哈。",1,"asfds",1,200,"asd","dasd","123456"));
        //System.out.println(aur.selectAll());
        System.out.println(aur.setExpress(2,"1201207570"));
    }


    @Test
    void CustomerTest() {
        cr.insert(new Customer("dad","ada","司法","das",1));
    }


}
