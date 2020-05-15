package HibernateSQL;

import javax.persistence.*;

@Entity
@Table(name = "wenjuan", schema = "toupiaoxiong", catalog = "")
public class WenjuanEntity {
    private int wenjuanNum;
    private String wenjuanClass;
    private Integer wenjuanQuest;
    private String wenjuanTitle;

    @Id
    @Column(name = "wenjuan_num", nullable = false)
    public int getWenjuanNum() {
        return wenjuanNum;
    }

    public void setWenjuanNum(int wenjuanNum) {
        this.wenjuanNum = wenjuanNum;
    }

    @Basic
    @Column(name = "wenjuan_class", nullable = true, length = 20)
    public String getWenjuanClass() {
        return wenjuanClass;
    }

    public void setWenjuanClass(String wenjuanClass) {
        this.wenjuanClass = wenjuanClass;
    }

    @Basic
    @Column(name = "wenjuan_quest", nullable = true)
    public Integer getWenjuanQuest() {
        return wenjuanQuest;
    }

    public void setWenjuanQuest(Integer wenjuanQuest) {
        this.wenjuanQuest = wenjuanQuest;
    }

    @Basic
    @Column(name = "wenjuan_title", nullable = true, length = 40)
    public String getWenjuanTitle() {
        return wenjuanTitle;
    }

    public void setWenjuanTitle(String wenjuanTitle) {
        this.wenjuanTitle = wenjuanTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WenjuanEntity that = (WenjuanEntity) o;

        if (wenjuanNum != that.wenjuanNum) return false;
        if (wenjuanClass != null ? !wenjuanClass.equals(that.wenjuanClass) : that.wenjuanClass != null) return false;
        if (wenjuanQuest != null ? !wenjuanQuest.equals(that.wenjuanQuest) : that.wenjuanQuest != null) return false;
        if (wenjuanTitle != null ? !wenjuanTitle.equals(that.wenjuanTitle) : that.wenjuanTitle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = wenjuanNum;
        result = 31 * result + (wenjuanClass != null ? wenjuanClass.hashCode() : 0);
        result = 31 * result + (wenjuanQuest != null ? wenjuanQuest.hashCode() : 0);
        result = 31 * result + (wenjuanTitle != null ? wenjuanTitle.hashCode() : 0);
        return result;
    }
}
