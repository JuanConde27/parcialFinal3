package co.com.conde.coursesmicroservice.repository;

import co.com.conde.coursesmicroservice.models.entity.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
}
