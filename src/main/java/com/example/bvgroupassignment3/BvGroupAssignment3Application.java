package com.example.bvgroupassignment3;

import Service.HRService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "Service")
@EntityScan("EntityClasses")
@EnableJpaRepositories("Repository")
public class BvGroupAssignment3Application {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(BvGroupAssignment3Application.class, args);

        HRService service = (HRService) ctx.getBean("HRService");
        service.findEmployeeSalary();
        service.findEmployeeLastName();
        service.findEmployeeInAccounting();
        service.findEmployeeOfManager108();
        service.findDepartmentWithLocation1700();
    }

}
