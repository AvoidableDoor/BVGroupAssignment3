package Repository;

import EntityClasses.EmployeesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component("EmployeeRepository")
public interface EmployeeRepository extends CrudRepository<EmployeesEntity, Integer> {
    List<EmployeesEntity> findAllBySalaryBetween(double value1, double value2);
    List<EmployeesEntity> findAllByLastNameEndingWith(String lastName);
    List<EmployeesEntity> findAllByDepartmentId(int id);
    List<EmployeesEntity> findAllByManagerId(int id);
}
