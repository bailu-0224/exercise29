package com.huadi.exercise29;

import com.huadi.exercise29.entity.Customer;
import com.huadi.exercise29.reopsitory.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DaoTests {

    @Autowired
    private CustomerRepository cr;

    @Test
    void insertTest(){
        cr.insert(new Customer("qwe","asd","司法","zzz", 1));
    }


    @Test
    void test1() {
        if (cr.selectByAccount("zxc")==null)
            System.out.println("aaaaaa");
    }


}
