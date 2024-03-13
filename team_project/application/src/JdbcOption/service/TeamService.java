package JdbcOption.service;

import JdbcOption.entity.Team;

import java.util.List;

public interface TeamService {
    Team selectById (int t_id);

    Team selectByCaptainId (int captain_id);

    List<Team> selectAllByCaptainId(int captain_id);

    List<Team> selectAllByT_desc(int t_desc);

    List<Team> selectAllByC_id(String c_id);

    List<Team> selectAllByStatus(String t_status);

    List<Team> selectAll();

    int delete(int t_id);

    int update(Team team);

    int insert(Team team);
}
