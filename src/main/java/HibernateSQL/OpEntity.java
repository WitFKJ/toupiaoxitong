package HibernateSQL;

import javax.persistence.*;

@Entity
@Table(name = "op", schema = "toupiaoxiong", catalog = "")
public class OpEntity {
    private int opNum;
    private String opName;
    private String opPasswd;

    @Id
    @Column(name = "op_num", nullable = false)
    public int getOpNum() {
        return opNum;
    }

    public void setOpNum(int opNum) {
        this.opNum = opNum;
    }

    @Basic
    @Column(name = "op_name", nullable = true, length = 30)
    public String getOpName() {
        return opName;
    }

    public void setOpName(String opName) {
        this.opName = opName;
    }

    @Basic
    @Column(name = "op_passwd", nullable = true, length = 20)
    public String getOpPasswd() {
        return opPasswd;
    }

    public void setOpPasswd(String opPasswd) {
        this.opPasswd = opPasswd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OpEntity opEntity = (OpEntity) o;

        if (opNum != opEntity.opNum) return false;
        if (opName != null ? !opName.equals(opEntity.opName) : opEntity.opName != null) return false;
        if (opPasswd != null ? !opPasswd.equals(opEntity.opPasswd) : opEntity.opPasswd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = opNum;
        result = 31 * result + (opName != null ? opName.hashCode() : 0);
        result = 31 * result + (opPasswd != null ? opPasswd.hashCode() : 0);
        return result;
    }
}
