package JdbcOption.service;

import JdbcOption.entity.Student;

import java.util.List;

public interface StudentService {

    Student selectById(int s_id);

    Student selectByNumber(int s_number);

    List<Student> selectAllByName(String s_name);

    List<Student> selectAllByMajor(String s_major);

    List<Student> selectAllByTele(String s_tele);

    List<Student> selectAll();

    int insert(Student student);

    int delete(int s_id);

    int update(Student student);
}
