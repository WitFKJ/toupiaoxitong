package HibernateSQL;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "toupiaoxiong", catalog = "")
public class UserEntity {
    private int userNum;
    private String userName;
    private String userPasswd;

    @Id
    @Column(name = "user_num", nullable = false)
    public int getUserNum() {
        return userNum;
    }

    public void setUserNum(int userNum) {
        this.userNum = userNum;
    }

    @Basic
    @Column(name = "user_name", nullable = true, length = 20)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_passwd", nullable = false, length = 20)
    public String getUserPasswd() {
        return userPasswd;
    }

    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (userNum != that.userNum) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (userPasswd != null ? !userPasswd.equals(that.userPasswd) : that.userPasswd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userNum;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userPasswd != null ? userPasswd.hashCode() : 0);
        return result;
    }
}
