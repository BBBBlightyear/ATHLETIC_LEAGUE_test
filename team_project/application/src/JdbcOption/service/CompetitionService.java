package JdbcOption.service;

import JdbcOption.entity.Competition;

import java.util.Date;
import java.util.List;

public interface CompetitionService {
    Competition selectById(int c_id);

    List<Competition> selectAllByName(String c_name);

    List<Competition> selectAllByLevel(String c_level);

    List<Competition> selectAllByRegisterTime(Date c_registerTime);

    List<Competition> selectAll();

    int insert(Competition competition);

    int delete(int c_id);

    int update(Competition competition);
}
