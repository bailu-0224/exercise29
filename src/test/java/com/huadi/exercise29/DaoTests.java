package com.huadi.exercise29;

import com.huadi.exercise29.domain.Customer;
import com.huadi.exercise29.reopsitory.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLException;

@SpringBootTest
public class DaoTests {

    @Autowired
    private CustomerRepository cr;

    @Test
    void test(){
        cr.insert(new Customer("qwe","asd","司法","zzz", 1));
    }
}
