package JdbcOption.service;

import JdbcOption.entity.TeamMenbership;

import java.util.List;

public interface TeamMenbershipService {

    TeamMenbership selectById(int relationship_id);

    List<TeamMenbership> selectAllByT_id (int t_id);

    List<TeamMenbership> selectAllByS_id (int s_id);

    List<TeamMenbership> selectAllByM_id (int m_id);

    List<TeamMenbership> selectAll();

    int delete(int relationship_id);

    int update(TeamMenbership teamMenbership);

    int insert(TeamMenbership teamMenbership);
}
