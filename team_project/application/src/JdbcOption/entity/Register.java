package JdbcOption.entity;

public class Register {

    public Register(int r_id, int r_number, String r_name, String r_major) {
        this.r_id = r_id;
        this.r_number = r_number;
        this.r_name = r_name;
        this.r_major = r_major;
    }

    private int r_id;

    private int r_number;

    private String r_name;

    private String r_major;

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public int getR_number() {
        return r_number;
    }

    public void setR_number(int r_number) {
        this.r_number = r_number;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }

    public String getR_major() {
        return r_major;
    }

    public void setR_major(String r_major) {
        this.r_major = r_major;
    }

    @Override
    public String toString() {
        return "Regist{" +
                "r_id=" + r_id +
                ", r_number=" + r_number +
                ", r_name='" + r_name + '\'' +
                ", r_major='" + r_major + '\'' +
                '}';
    }
}
