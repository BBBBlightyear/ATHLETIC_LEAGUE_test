package JdbcOption.service;

import JdbcOption.entity.Invitation;

import java.util.Date;
import java.util.List;

public interface InvitationService {
    Invitation selectById(int id);

    List<Invitation> selectAllByS_id(int s_id);

    List<Invitation> selectAllByT_id(int t_id);

    List<Invitation> selectAllByI_reason(String i_reason);

    List<Invitation> selectAllByI_status(String i_status);

    List<Invitation> selectAllByI_time(Date i_time);

    List<Invitation> selectAll();

    int delete(int id);

    int updata(Invitation invitation);

    int insert(Invitation invitation);



}
