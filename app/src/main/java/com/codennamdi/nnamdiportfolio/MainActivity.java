package com.codennamdi.nnamdiportfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycler_view_project);

        Project[] portfolioProjectsArray = {
                new Project("Dodgemax","It's all about dodging obstacles in a strange world. It's very addictive and hardcore.", R.drawable.dodgemax_img),
                new Project("Age In Minute App", "It calculate how long you have lived in minute by taking your date of birth as an input. Implemented using Android studio, XML and Kotlin",R.drawable._60_f_321614224_nmuwh1gwdccpfdsolr7n511q4hp97yak),
                new Project("Calculator App","A simple calculator app made with Android Studio, XML and Kotlin.",R.drawable.calculator_img),
                new Project("BMI Calculator","Simple Bmi calculator that takes input of your gender, age, feet, inches and weight to get your Bmi result. Implemented using Android studio, XML and Java. In this project i learnt about TextView, EditText, ImageView, Methods, if statement, Variables",R.drawable.bmi_cal_img),
                new Project("Inches To Meter","Simple converter app, which converts inch to meter by taking the input of the inches. Implemented using Android studio, XML and Java",R.drawable.meter_img),
                new Project("Calculator Two Number App","This app has two sections 'For addition and subtraction' it basically take two inputs and add or subtract them depending on the section your did the operation in.", R.drawable.cal_two_num_img),
                new Project("Hungry Lab","Hungry lab is a restaurant app which contains all the list of items the restaurant has, the app has three sections the 'The Starters, Main Menu and dessert section'. To order, you would click on the email address to place an order. In this project i learnt about classes & Object, arrays, ListView, Intent",R.drawable.hungry_lab_img)
        };

        ProjectsAdapter adapter = new ProjectsAdapter(portfolioProjectsArray);
        list.setAdapter(adapter);
    }
}