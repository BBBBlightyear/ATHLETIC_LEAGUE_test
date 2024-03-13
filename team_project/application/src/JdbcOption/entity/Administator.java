package JdbcOption.entity;

public class Administator {
    public Administator(int a_id, int a_acc, int a_pwd) {
        this.a_id = a_id;
        this.a_acc = a_acc;
        this.a_pwd = a_pwd;
    }

    private int a_id;
    private int a_acc;
    private int a_pwd;

    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public int getA_acc() {
        return a_acc;
    }

    public void setA_acc(int a_acc) {
        this.a_acc = a_acc;
    }

    public int getA_pwd() {
        return a_pwd;
    }

    public void setA_pwd(int a_pwd) {
        this.a_pwd = a_pwd;
    }

    @Override
    public String toString() {
        return "Administator{" +
                "a_id=" + a_id +
                ", a_acc=" + a_acc +
                ", a_pwd=" + a_pwd +
                '}';
    }
}
