package co.com.conde.coursesmicroservice.service;

import co.com.conde.coursesmicroservice.models.entity.Course;
import co.com.conde.coursesmicroservice.repository.CourseRepository;
import co.com.conde.libr.service.CommonServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl extends CommonServiceImpl<Course, CourseRepository> implements CourseService {

    public CourseServiceImpl(CourseRepository courseRepository) {
        super(courseRepository);
    }

}
