package co.com.conde.usermicroservice.repository;

import co.com.conde.entitycommon.models.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
