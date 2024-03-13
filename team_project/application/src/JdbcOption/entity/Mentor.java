package JdbcOption.entity;

public class Mentor {
    public Mentor(int m_id, int m_acc, String m_pwd, String m_dirction, String m_name, String m_tele, String m_mail) {
        this.m_id = m_id;
        this.m_acc = m_acc;
        this.m_pwd = m_pwd;
        this.m_dirction = m_dirction;
        this.m_name = m_name;
        this.m_tele = m_tele;
        this.m_mail = m_mail;
    }

    private int m_id;

    private int m_acc;

    private String m_pwd;

    private String m_dirction;

    private String m_name;

    private String m_tele;

    private String m_mail;

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public int getM_acc() {
        return m_acc;
    }

    public void setM_acc(int m_acc) {
        this.m_acc = m_acc;
    }

    public String getM_pwd() {
        return m_pwd;
    }

    public void setM_pwd(String m_pwd) {
        this.m_pwd = m_pwd;
    }

    public String getM_dirction() {
        return m_dirction;
    }

    public void setM_dirction(String m_dirction) {
        this.m_dirction = m_dirction;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public String getM_tele() {
        return m_tele;
    }

    public void setM_tele(String m_tele) {
        this.m_tele = m_tele;
    }

    public String getM_mail() {
        return m_mail;
    }

    public void setM_mail(String m_mail) {
        this.m_mail = m_mail;
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "m_id=" + m_id +
                ", m_acc=" + m_acc +
                ", m_pwd='" + m_pwd + '\'' +
                ", m_dirction='" + m_dirction + '\'' +
                ", m_name='" + m_name + '\'' +
                ", m_tele='" + m_tele + '\'' +
                ", m_mail='" + m_mail + '\'' +
                '}';
    }
}
