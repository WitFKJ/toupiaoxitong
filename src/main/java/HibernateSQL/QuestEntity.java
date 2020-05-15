package HibernateSQL;

import javax.persistence.*;

@Entity
@Table(name = "quest", schema = "toupiaoxiong", catalog = "")
@IdClass(QuestEntityPK.class)
public class QuestEntity {
    private int questWenjuanNum;
    private int questWhere;
    private Integer questXuanxiang;
    private Integer questClass;
    private String questTitle;

    @Id
    @Column(name = "quest_wenjuan_num", nullable = false)
    public int getQuestWenjuanNum() {
        return questWenjuanNum;
    }

    public void setQuestWenjuanNum(int questWenjuanNum) {
        this.questWenjuanNum = questWenjuanNum;
    }

    @Id
    @Column(name = "quest_where", nullable = false)
    public int getQuestWhere() {
        return questWhere;
    }

    public void setQuestWhere(int questWhere) {
        this.questWhere = questWhere;
    }

    @Basic
    @Column(name = "quest_xuanxiang", nullable = true)
    public Integer getQuestXuanxiang() {
        return questXuanxiang;
    }

    public void setQuestXuanxiang(Integer questXuanxiang) {
        this.questXuanxiang = questXuanxiang;
    }

    @Basic
    @Column(name = "quest_class", nullable = true)
    public Integer getQuestClass() {
        return questClass;
    }

    public void setQuestClass(Integer questClass) {
        this.questClass = questClass;
    }

    @Basic
    @Column(name = "quest_title", nullable = true, length = 100)
    public String getQuestTitle() {
        return questTitle;
    }

    public void setQuestTitle(String questTitle) {
        this.questTitle = questTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuestEntity that = (QuestEntity) o;

        if (questWenjuanNum != that.questWenjuanNum) return false;
        if (questWhere != that.questWhere) return false;
        if (questXuanxiang != null ? !questXuanxiang.equals(that.questXuanxiang) : that.questXuanxiang != null)
            return false;
        if (questClass != null ? !questClass.equals(that.questClass) : that.questClass != null) return false;
        if (questTitle != null ? !questTitle.equals(that.questTitle) : that.questTitle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = questWenjuanNum;
        result = 31 * result + questWhere;
        result = 31 * result + (questXuanxiang != null ? questXuanxiang.hashCode() : 0);
        result = 31 * result + (questClass != null ? questClass.hashCode() : 0);
        result = 31 * result + (questTitle != null ? questTitle.hashCode() : 0);
        return result;
    }
}
