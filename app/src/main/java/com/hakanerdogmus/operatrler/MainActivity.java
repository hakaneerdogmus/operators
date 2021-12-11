package com.hakanerdogmus.operatrler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Statements (operatörler)...


        int x = 5;
        System.out.println(x);
        x = x+1;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
        x=x * 5;
        System.out.println(x);

        int y=4;
        System.out.println(x>y);
        System.out.println(y>x);

        //and &&
        //or ||

        x = 3;
        y = 4;
        int z = 5;

        System.out.println(x<y && y<z);
        System.out.println(x<y || z<y);

        //eğer (if)

        if (x<y){
            System.out.println("y daha büyük");
        }
        else if(y<x){
            System.out.println("x daha büyük");
        }
        else if(x==y){
            System.out.println("x = y");
        }

// switch (degistirmek)

        int day = 4;
        String dayString ="";

        /*
        if(day == 1){
            dayString = "Monday";
        }
        else if (day == 2){
            dayString ="Tuesday";
        }
        else if (day == 3){
            dayString ="Wednesday";
        }
        else { dayString="Sunday";}

         */
        switch (day){
            case 1:
                dayString ="Monday";
                break;
            case 2:
                dayString ="Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            default: dayString = "Sunday";
                break;
        }






        System.out.println(dayString);









    }
}