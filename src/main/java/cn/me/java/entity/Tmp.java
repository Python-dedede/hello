package cn.me.java.entity;

public class Tmp {
    private Integer id;

    private String nick;

    private Integer age;

    private Integer deptno;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Tmp{" +
                "id=" + id +
                ", nick='" + nick + '\'' +
                ", age=" + age +
                ", deptno=" + deptno +
                '}';
    }
}