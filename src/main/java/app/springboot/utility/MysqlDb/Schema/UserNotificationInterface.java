package app.springboot.utility.MysqlDb.Schema;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserNotificationInterface extends   JpaRepository<UserNotification, Long>  {
    default void addSomeCustomers() {
        //https://thorben-janssen.com/jpa-native-queries/
    }


}
