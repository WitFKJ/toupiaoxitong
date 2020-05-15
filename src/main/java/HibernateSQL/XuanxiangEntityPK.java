package HibernateSQL;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class XuanxiangEntityPK implements Serializable {
    private int wenjuanNum;
    private int questNum;
    private int xuanxiangNum;

    @Column(name = "wenjuan_num", nullable = false)
    @Id
    public int getWenjuanNum() {
        return wenjuanNum;
    }

    public void setWenjuanNum(int wenjuanNum) {
        this.wenjuanNum = wenjuanNum;
    }

    @Column(name = "quest_num", nullable = false)
    @Id
    public int getQuestNum() {
        return questNum;
    }

    public void setQuestNum(int questNum) {
        this.questNum = questNum;
    }

    @Column(name = "xuanxiang_num", nullable = false)
    @Id
    public int getXuanxiangNum() {
        return xuanxiangNum;
    }

    public void setXuanxiangNum(int xuanxiangNum) {
        this.xuanxiangNum = xuanxiangNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        XuanxiangEntityPK that = (XuanxiangEntityPK) o;

        if (wenjuanNum != that.wenjuanNum) return false;
        if (questNum != that.questNum) return false;
        if (xuanxiangNum != that.xuanxiangNum) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = wenjuanNum;
        result = 31 * result + questNum;
        result = 31 * result + xuanxiangNum;
        return result;
    }
}
