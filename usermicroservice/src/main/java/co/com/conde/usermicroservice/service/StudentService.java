package co.com.conde.usermicroservice.service;

import co.com.conde.entitycommon.models.entity.Student;
import co.com.conde.libr.service.CommonService;

public interface StudentService extends CommonService<Student> {
    public Student save(Student student);
    public void deleteById(Long id);
}
