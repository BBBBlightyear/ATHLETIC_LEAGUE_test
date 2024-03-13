package JdbcOption.service;

import JdbcOption.entity.Mentor;

import java.util.List;

public interface MentorService {
    Mentor selectById(int m_id);

    Mentor selectByAcc(int m_acc);

    List<Mentor> selectAllByDirection(String m_direction);

    List<Mentor> selectAllByName(String m_name);

    List<Mentor> selectAllByTele(String m_tele);

    List<Mentor> selectAllByMail(String m_mail);

    List<Mentor> selectAll();

    int insert(Mentor mentor);

    int delete(int m_id);

    int update(Mentor mentor);
}
