package JdbcOption.entity;

import java.util.Date;

public class Invitation {
    public Invitation(int i_id, int s_id, int t_id, String i_reason, String i_status, Date i_time) {
        this.i_id = i_id;
        this.s_id = s_id;
        this.t_id = t_id;
        this.i_reason = i_reason;
        this.i_status = i_status;
        this.i_time = i_time;
    }

    //定义消息发出的时间
    private int i_id;
    private int s_id;
    private int t_id;

    private String i_reason;

    private String i_status;

    private Date i_time;

    public int getI_id() {
        return i_id;
    }

    public void setI_id(int i_id) {
        this.i_id = i_id;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public String getI_reason() {
        return i_reason;
    }

    public void setI_reason(String i_reason) {
        this.i_reason = i_reason;
    }

    public String getI_status() {
        return i_status;
    }

    public void setI_status(String i_status) {
        this.i_status = i_status;
    }

    public Date getI_time() {
        return i_time;
    }

    public void setI_time(Date i_time) {
        this.i_time = i_time;
    }

    @Override
    public String toString() {
        return "Invitation{" +
                "i_id=" + i_id +
                ", s_id=" + s_id +
                ", t_id=" + t_id +
                ", i_reason='" + i_reason + '\'' +
                ", i_status='" + i_status + '\'' +
                ", i_time=" + i_time +
                '}';
    }
}
