package interview;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BatchGenerator {
    public static void main(String[] args) {

        //        System.out.println(LocalDate.now());
        //        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        //        System.out.println(LocalDateTime.now().getYear());
        //        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        //        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");
        DateTimeFormatter batch = DateTimeFormatter.ofPattern("uuuuMMddHH");
        DateTimeFormatter yyyymmdd = DateTimeFormatter.ofPattern("uuuuMMdd");

        String batchPart1 =  LocalDateTime.now().format(batch) + LocalDateTime.now().getMinute()/10;
        System.out.println(batchPart1);

        //last 3 days
        int z=1;
        for(int d = 1 ; d < 4; d++){
            for(int i=0; i< 24; i++){
                for(int j= 0; j < 7; j++){
                    System.out.println(z +": "+ LocalDate.now().minusDays(d).format(yyyymmdd)+i+j);
                    z++;
                }
            }
        }

        System.out.println("---------");
            for(int i=0; i <= LocalDateTime.now().getHour(); i++){
                for(int j= 0; j <= LocalDateTime.now().getMinute()/10; j++){
                    System.out.println(z +": "+ LocalDate.now().format(yyyymmdd)+i+j);
                    z++;
                }
            }

        //------
        // check for last 1 day of data.
            //regular every 10 mins.

        // check for last 3 days [upto -3 Hrs] of unprocessed data every 4 Hrs.
            // will take care of outages.
            //

    }
}
