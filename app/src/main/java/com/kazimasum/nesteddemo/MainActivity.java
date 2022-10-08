package com.kazimasum.nesteddemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<DataModel> mList;
    private ItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.main_recyclervie);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mList = new ArrayList<>();

        //list1
        List<String> nestedList1 = new ArrayList<>();
        nestedList1.add("Foundation Course in English");
        nestedList1.add("Business Organization");
        nestedList1.add("Computer Basic and PC Software");
        nestedList1.add("Mathematics");
        nestedList1.add("PC Software Lab");

        List<String> nestedList2 = new ArrayList<>();
        nestedList2.add("Accountancy1");
        nestedList2.add("Programming using C");
        nestedList2.add("Digital and Architecture");
        nestedList2.add("Discrete Mathematics");
        nestedList2.add("C Lab");
        nestedList2.add("Assembly Lab");

        List<String> nestedList3 = new ArrayList<>();
        nestedList3.add("Data and File Structure");
        nestedList3.add("Database Management System");
        nestedList3.add("System Analysis and Design");
        nestedList3.add("Programming in C++");
        nestedList3.add("C++ LAB");
        nestedList3.add("DBMS Lab");
        nestedList3.add("DS Lab");

        List<String> nestedList4 = new ArrayList<>();
        nestedList4.add("Statistical Techniques");
        nestedList4.add("Java Programming");
        nestedList4.add("Fundamentals of Computer Network");
        nestedList4.add("Introduction to Algorithm Design");
        nestedList4.add("Java Lab");

        List<String> nestedList5 = new ArrayList<>();
        nestedList5.add("Introduction to Software Engg");
        nestedList5.add("Network Programming and Admin");
        nestedList5.add("Web Programming");
        nestedList5.add("Numerical Techniques");
        nestedList5.add("Web Programming LAB");
        nestedList5.add("Computer Orinted Numerical LAB");

        List<String> nestedList6 = new ArrayList<>();
        nestedList6.add("Operating System");
        nestedList6.add("Window Programming using VB");
        nestedList6.add("e-Commerce");
        nestedList6.add("Automata");


        List<String> nestedList7 = new ArrayList<>();
        nestedList7.add("TCP/IP Programming");
        nestedList7.add("Python Programming");
        nestedList7.add("JSP- Web Programming");
        nestedList7.add("System Analysis and Design");

        List<String> nestedList8 = new ArrayList<>();
        nestedList8.add("Introduction to IOT");
        nestedList8.add("Windows Graphics");
        nestedList8.add("Machine Learning");
        nestedList8.add("Final Year Project");

        mList.add(new DataModel(nestedList1 , "First Semester"));
        mList.add(new DataModel( nestedList2,"Second Semester"));
        mList.add(new DataModel( nestedList3,"Third Semester"));
        mList.add(new DataModel(nestedList4 ,"Fourth Semester"));
        mList.add(new DataModel(nestedList5,"Fifth Semester"));
        mList.add(new DataModel(nestedList6,"Sixth Semester"));
        mList.add(new DataModel(nestedList7 ,"Seventh Semester"));
        mList.add(new DataModel(nestedList8 ,"Eight Semester"));

        adapter = new ItemAdapter(mList);
        recyclerView.setAdapter(adapter);
    }
}