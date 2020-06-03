package wuqian.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {


    public static void main(String[] args) {
        String pattern="yyyyMMdd  HH：mm：ss";
        SimpleDateFormat sdf=new SimpleDateFormat(pattern);
        Date date=new Date();
         System.out.println(sdf.format(date));;



    }


}
