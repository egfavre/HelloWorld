import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Date;

/**
 * Created by user on 6/28/16.
 */
public class Test {



    public static void main(String[] args) throws InterruptedException {
        int i = (int) (new Date().getTime()/1000);
        Thread.sleep(10000);
        int j = (int) (new Date().getTime()/1000);
        System.out.println(i);
        System.out.println(j);

    }

}
