package HibernateSQL;

import javax.persistence.*;

@Entity
@Table(name = "xuanxiang", schema = "toupiaoxiong", catalog = "")
@IdClass(XuanxiangEntityPK.class)
public class XuanxiangEntity {
    private int wenjuanNum;
    private int questNum;
    private int xuanxiangNum;
    private String xuanxiangTitle;

    @Id
    @Column(name = "wenjuan_num", nullable = false)
    public int getWenjuanNum() {
        return wenjuanNum;
    }

    public void setWenjuanNum(int wenjuanNum) {
        this.wenjuanNum = wenjuanNum;
    }

    @Id
    @Column(name = "quest_num", nullable = false)
    public int getQuestNum() {
        return questNum;
    }

    public void setQuestNum(int questNum) {
        this.questNum = questNum;
    }

    @Id
    @Column(name = "xuanxiang_num", nullable = false)
    public int getXuanxiangNum() {
        return xuanxiangNum;
    }

    public void setXuanxiangNum(int xuanxiangNum) {
        this.xuanxiangNum = xuanxiangNum;
    }

    @Basic
    @Column(name = "xuanxiang_title", nullable = true, length = 30)
    public String getXuanxiangTitle() {
        return xuanxiangTitle;
    }

    public void setXuanxiangTitle(String xuanxiangTitle) {
        this.xuanxiangTitle = xuanxiangTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        XuanxiangEntity that = (XuanxiangEntity) o;

        if (wenjuanNum != that.wenjuanNum) return false;
        if (questNum != that.questNum) return false;
        if (xuanxiangNum != that.xuanxiangNum) return false;
        if (xuanxiangTitle != null ? !xuanxiangTitle.equals(that.xuanxiangTitle) : that.xuanxiangTitle != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = wenjuanNum;
        result = 31 * result + questNum;
        result = 31 * result + xuanxiangNum;
        result = 31 * result + (xuanxiangTitle != null ? xuanxiangTitle.hashCode() : 0);
        return result;
    }
}
