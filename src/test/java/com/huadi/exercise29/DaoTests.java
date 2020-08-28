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
    private AuthenticationRepository ccr;

    @Test
    void insertTest(){
        ccr.insert(new Authentication(0,"司法",1,"dasd",1,200,"asd","dasd","123456"));
    }


    @Test
    void test1() {
        cr.insert(new Customer("dad","ada","司法","das",1));
    }


}
