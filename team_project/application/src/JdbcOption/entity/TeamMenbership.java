package JdbcOption.entity;

public class TeamMenbership  {

    public TeamMenbership(int relationship_id, int t_id, int s_id, int m_id) {
        this.relationship_id = relationship_id;
        this.t_id = t_id;
        this.s_id = s_id;
        this.m_id = m_id;
    }

    private int relationship_id;
    private int t_id;
    private int s_id;
    private int m_id;

    public int getRelationship_id() {
        return relationship_id;
    }

    public void setRelationship_id(int relationship_id) {
        this.relationship_id = relationship_id;
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    @Override
    public String toString() {
        return "TeamMenbership{" +
                "relationship_id=" + relationship_id +
                ", t_id=" + t_id +
                ", s_id=" + s_id +
                ", m_id=" + m_id +
                '}';
    }
}
