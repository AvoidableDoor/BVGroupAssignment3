package Service;

import EntityClasses.CountriesEntity;
import EntityClasses.DepartmentsEntity;
import EntityClasses.EmployeesEntity;
import Repository.DepartmentsEntityRepository;
import Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HRService {

    @Autowired
    private EmployeeRepository empRepository;
    @Autowired
    private DepartmentsEntityRepository deptRepository;

    public void findEmployeeSalary(){
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("All Employees With Salary Between 9000 and 17000");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        Iterable<EmployeesEntity> iterator = empRepository.findAllBySalaryBetween(9000, 17000);
        iterator.forEach(emp -> System.out.println(emp.getFirstName() + " " + emp.getLastName() + " ------- $" + emp.getSalary()));
    }

    public void findEmployeeLastName(){
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("All Employees With A LastName Ending In A");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        Iterable<EmployeesEntity> iterator = empRepository.findAllByLastNameEndingWith("a");
        iterator.forEach(emp -> System.out.println(emp.getFirstName() + " " + emp.getLastName()));
    }

    public void findEmployeeInAccounting(){
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("All Employees Working In Accounting");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        Iterable<EmployeesEntity> iterator = empRepository.findAllByDepartmentId(11);
        iterator.forEach(emp -> System.out.println(emp.getFirstName() + " " + emp.getLastName()));
    }

    public void findEmployeeOfManager108(){
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("All Employees Working Under Manager 108");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        Iterable<EmployeesEntity> iterator = empRepository.findAllByManagerId(108);
        iterator.forEach(emp -> System.out.println(emp.getFirstName() + " " + emp.getLastName()));
    }

    public void findDepartmentWithLocation1700(){
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("All Departments With Location of 1700");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        Iterable<DepartmentsEntity> iterator = deptRepository.findAllByLocationId(1700);
        iterator.forEach(dept -> System.out.println(dept.getDepartmentName()));
    }


}
