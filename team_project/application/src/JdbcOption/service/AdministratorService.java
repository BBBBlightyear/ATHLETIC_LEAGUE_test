package JdbcOption.service;

import JdbcOption.entity.Administator;
import JdbcOption.entity.Student;

import java.util.List;

public interface AdministratorService {

    Administator selectById(int a_id);

    Administator selectByAcc(int a_acc);

    List<Administator> selectAll();

    int insert(Administator administator);

    int delete(int a_id);

    int update(Administator administator);
}
