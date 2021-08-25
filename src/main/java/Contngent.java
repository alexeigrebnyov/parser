import java.util.Objects;

public class Contngent {
    private String emc;
    private String date;
    private String code;
    private String sex;

    public String getEmc() {
        return emc;
    }

    public void setEmc(String emc) {
        this.emc = emc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Contngent{" +
                "emc='" + emc + '\'' +
                ", date='" + date + '\'' +
                ", code='" + code + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contngent contngent = (Contngent) o;
        return Objects.equals(getEmc(), contngent.getEmc()) &&
                Objects.equals(getDate(), contngent.getDate()) &&
                Objects.equals(getCode(), contngent.getCode()) &&
                Objects.equals(getSex(), contngent.getSex());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmc(), getDate(), getCode(), getSex());
    }
}
