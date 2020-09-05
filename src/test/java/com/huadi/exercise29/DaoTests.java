package com.huadi.exercise29;

import com.huadi.exercise29.entity.*;
import com.huadi.exercise29.repository.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class DaoTests {

    @Autowired
    private CustomerRepository cr;

    @Autowired
    private AuthenticationRepository aur;

    @Autowired
    private FireCaseRepository fr;

    @Autowired
    private EquipmentRepository eqr;

    @Autowired
    private DepartmentRepository dr;

    @Autowired
    private EmployeeRepository emr;

    @Test
    void authenticationTest(){
        //aur.insert(new Authentication(0,"消防","头盔","哈哈哈。",1,"asfds",1,200,"asd","dasd","123456"));
        System.out.println(aur.selectAll());
        System.out.println(aur.setExpress(1,"1201207570"));
    }

    @Test
    void customerTest() {
        cr.insert(new Customer("dad","ada","司法","das",1));
    }

    @Test
    void fireCaseTest(){
        fr.insert(new FireCase(0,"美国队长3",19665478));
    }

    @Test
    void equipmentTest() {
        eqr.insert(new Equipment(0,"灭火器","灭不了火的灭火器","空闲"));
    }

    @Test
    void departmentTest() {
        dr.insert(new Department(0,"保卫处","接化发","马保国","1234567890",0));
    }

    @Test
    void employeeTest() {
        emr.insert(new Employee("123456","叶圣",1,"拳击手"));
    }

}
