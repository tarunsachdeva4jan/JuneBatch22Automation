package com.envision.automation.framework.core;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class DataExamples {

    public static void main(String[] args) {
        //Using Date class
        Date currentDate = new Date();
        System.out.println(currentDate);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String formattedDate =sdf.format(currentDate);
        System.out.println(formattedDate);


        //LocalDateTime class;
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        String dayOfMonth = String.valueOf(ldt.getDayOfMonth());
        String monthInInt = String.valueOf(ldt.getMonthValue());
        String year = String.valueOf(ldt.getYear());
        System.out.println(dayOfMonth+"/"+monthInInt+"/"+year);
    }
}
