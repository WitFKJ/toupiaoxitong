package HibernateSQL;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cunchu", schema = "toupiaoxiong", catalog = "")
public class CunchuEntity {
    private Integer cunchuUserNum;
    private Integer cunchuWenjuanNum;
    private Integer cunchuQuestNum;
    private Integer cunchuXuanxiangClass;
    private Integer cunchuXuanxiangPick;

    @Basic
    @Column(name = "cunchu_user_num", nullable = true)
    public Integer getCunchuUserNum() {
        return cunchuUserNum;
    }

    public void setCunchuUserNum(Integer cunchuUserNum) {
        this.cunchuUserNum = cunchuUserNum;
    }

    @Basic
    @Column(name = "cunchu_wenjuan_num", nullable = true)
    public Integer getCunchuWenjuanNum() {
        return cunchuWenjuanNum;
    }

    public void setCunchuWenjuanNum(Integer cunchuWenjuanNum) {
        this.cunchuWenjuanNum = cunchuWenjuanNum;
    }

    @Basic
    @Column(name = "cunchu_quest_num", nullable = true)
    public Integer getCunchuQuestNum() {
        return cunchuQuestNum;
    }

    public void setCunchuQuestNum(Integer cunchuQuestNum) {
        this.cunchuQuestNum = cunchuQuestNum;
    }

    @Basic
    @Column(name = "cunchu_xuanxiang_class", nullable = true)
    public Integer getCunchuXuanxiangClass() {
        return cunchuXuanxiangClass;
    }

    public void setCunchuXuanxiangClass(Integer cunchuXuanxiangClass) {
        this.cunchuXuanxiangClass = cunchuXuanxiangClass;
    }

    @Basic
    @Column(name = "cunchu_xuanxiang_pick", nullable = true)
    public Integer getCunchuXuanxiangPick() {
        return cunchuXuanxiangPick;
    }

    public void setCunchuXuanxiangPick(Integer cunchuXuanxiangPick) {
        this.cunchuXuanxiangPick = cunchuXuanxiangPick;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CunchuEntity that = (CunchuEntity) o;

        if (cunchuUserNum != null ? !cunchuUserNum.equals(that.cunchuUserNum) : that.cunchuUserNum != null)
            return false;
        if (cunchuWenjuanNum != null ? !cunchuWenjuanNum.equals(that.cunchuWenjuanNum) : that.cunchuWenjuanNum != null)
            return false;
        if (cunchuQuestNum != null ? !cunchuQuestNum.equals(that.cunchuQuestNum) : that.cunchuQuestNum != null)
            return false;
        if (cunchuXuanxiangClass != null ? !cunchuXuanxiangClass.equals(that.cunchuXuanxiangClass) : that.cunchuXuanxiangClass != null)
            return false;
        if (cunchuXuanxiangPick != null ? !cunchuXuanxiangPick.equals(that.cunchuXuanxiangPick) : that.cunchuXuanxiangPick != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cunchuUserNum != null ? cunchuUserNum.hashCode() : 0;
        result = 31 * result + (cunchuWenjuanNum != null ? cunchuWenjuanNum.hashCode() : 0);
        result = 31 * result + (cunchuQuestNum != null ? cunchuQuestNum.hashCode() : 0);
        result = 31 * result + (cunchuXuanxiangClass != null ? cunchuXuanxiangClass.hashCode() : 0);
        result = 31 * result + (cunchuXuanxiangPick != null ? cunchuXuanxiangPick.hashCode() : 0);
        return result;
    }
}
