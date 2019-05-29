package 기타;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

public class DayOfProgrammer {

    static String dayOfProgrammer(int year){
        String y = Integer.toString(year);
        y = y+"0101";
        String result = "";
        try{
            result = addDate(y,255);
        } catch(Exception ex){}

        return result;
    }

    static String addDate(String dt,int d){
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date date = null;
        Calendar cal = Calendar.getInstance();
        try{date = format.parse(dt);} catch(Exception ex){}
        cal.setTime(date);
        cal.add(Calendar.DATE, d);      //년 더하기
        String result = format.format(cal.getTime());
        String year = result.substring(0,4);
        String month = result.substring(4,6);
        String day = result.substring(6,8);
        result = day+"."+month+"."+year;
        return result;
    }

    public static void main(String[] args) {
        try{
            String result = dayOfProgrammer(2015);
            System.out.println(result);
        } catch(Exception ex){};
    }
}
