package Repository;

import EntityClasses.DepartmentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component("DepartmentRepository")
public interface DepartmentsEntityRepository extends CrudRepository<DepartmentsEntity, Integer> {
    List<DepartmentsEntity> findAllByLocationId(int location);
}