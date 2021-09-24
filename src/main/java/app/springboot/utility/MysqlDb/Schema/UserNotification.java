package app.springboot.utility.MysqlDb.Schema;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_user_notification")
public class UserNotification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    //@Column(name = "uid" )
    public String uid;

    ///@Column(name = "item_id" )
    public String item_id ;

    //@Column(name = "comment_id" )
    public String comment_id;

    //@Column(name = "mark_action" )
    public String mark_action ;

    //@Column(name = "is_read" )
    public String is_read ;

    //@Column(name = "date_added" )
    private Date date_added;

    //@Column(name = "date_updated" )
    //private Date date_updated;


    @Override
    public String toString() {
        return "UserNotification{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", item_id='" + item_id + '\'' +
                ", comment_id='" + comment_id + '\'' +
                ", mark_action='" + mark_action + '\'' +
                ", is_read='" + is_read + '\'' +
                ", date_added=" + date_added +
                ", date_updated=" + "date_updated" +
                '}';
    }

}