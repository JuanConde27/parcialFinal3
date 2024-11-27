package co.com.conde.usermicroservice.service;

import co.com.conde.entitycommon.models.entity.Student;
import co.com.conde.libr.service.CommonServiceImpl;
import co.com.conde.usermicroservice.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends CommonServiceImpl<Student,StudentRepository> implements StudentService {

    public StudentServiceImpl(StudentRepository studentRepository) {
        super(studentRepository);
    }

}
