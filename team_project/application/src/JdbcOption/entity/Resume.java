package JdbcOption.entity;

public class Resume {

    private int re_id;

    private int s_id;

    private int c_id;

    public Resume(int re_id, int s_id, int c_id) {
        this.re_id = re_id;
        this.s_id = s_id;
        this.c_id = c_id;
    }

    public int getRe_id() {
        return re_id;
    }

    public void setRe_id(int re_id) {
        this.re_id = re_id;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "re_id=" + re_id +
                ", s_id=" + s_id +
                ", c_id=" + c_id +
                '}';
    }
    /*
    create table link_team.group_table
(
    TID        varchar(10)  not null,
    UID        varchar(10)  not null,
    Work_labor varchar(500) null,
    CID        varchar(20)  null,
    primary key (TID, UID),
    constraint TID
        unique (TID)
);


     */
}
