package HibernateSQL;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class QuestEntityPK implements Serializable {
    private int questWenjuanNum;
    private int questWhere;

    @Column(name = "quest_wenjuan_num", nullable = false)
    @Id
    public int getQuestWenjuanNum() {
        return questWenjuanNum;
    }

    public void setQuestWenjuanNum(int questWenjuanNum) {
        this.questWenjuanNum = questWenjuanNum;
    }

    @Column(name = "quest_where", nullable = false)
    @Id
    public int getQuestWhere() {
        return questWhere;
    }

    public void setQuestWhere(int questWhere) {
        this.questWhere = questWhere;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuestEntityPK that = (QuestEntityPK) o;

        if (questWenjuanNum != that.questWenjuanNum) return false;
        if (questWhere != that.questWhere) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = questWenjuanNum;
        result = 31 * result + questWhere;
        return result;
    }
}
