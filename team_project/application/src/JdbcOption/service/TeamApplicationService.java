package JdbcOption.service;

import JdbcOption.entity.TeamApplication;
import JdbcOption.entity.TeamMenbership;

import java.util.Date;
import java.util.List;

public interface TeamApplicationService {
    TeamApplication selectById (int ta_id);

    List<TeamApplication> selectAllByS_id(int s_id);

    List<TeamApplication> selectAllByT_id(int t_id);

    List<TeamApplication> selectAllByT_reasson(String t_reason);

    List<TeamApplication> selectAllByTa_status(String ta_status);

    List<TeamApplication> selectAllByTa_time(Date ta_time);

    List<TeamApplication> selectAll();

    int delet(int ta_id);

    int updata(TeamApplication teamApplication);

    int insert(TeamApplication teamApplication);

}
