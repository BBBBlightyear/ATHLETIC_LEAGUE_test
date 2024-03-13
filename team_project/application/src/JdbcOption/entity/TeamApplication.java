package JdbcOption.entity;

import java.util.Date;

public class TeamApplication {

    public TeamApplication(int ta_id, int s_id, int t_id, String t_reason, String ta_status, Date ta_time) {
        this.ta_id = ta_id;
        this.s_id = s_id;
        this.t_id = t_id;
        this.t_reason = t_reason;
        this.ta_status = ta_status;
        this.ta_time = ta_time;
    }

    private int ta_id;
    private int s_id;
    private int t_id;

    private String t_reason;

    private String ta_status;

    private Date ta_time;

    public int getTa_id() {
        return ta_id;
    }

    public void setTa_id(int ta_id) {
        this.ta_id = ta_id;
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

    public String getT_reason() {
        return t_reason;
    }

    public void setT_reason(String t_reason) {
        this.t_reason = t_reason;
    }

    public String getTa_status() {
        return ta_status;
    }

    public void setTa_status(String ta_status) {
        this.ta_status = ta_status;
    }

    public Date getTa_time() {
        return ta_time;
    }

    @Override
    public String toString() {
        return "Team_application{" +
                "ta_id=" + ta_id +
                ", s_id=" + s_id +
                ", t_id=" + t_id +
                ", t_reason='" + t_reason + '\'' +
                ", ta_status='" + ta_status + '\'' +
                ", ta_time=" + ta_time +
                '}';
    }
//    public String time;
//    public Student student;
//
//    public Team_application(String time, Student student) {
//        this.time = time;
//        this.student = student;
//    }
//
//    public String getTime() {
//        return time;
//    }
//
//    public Student getStudent() {
//        return student;
//    }

}
