package com.demo.engine;

import com.demo.engine.predicate.model.student;
import com.demo.engine.predicate.predeicatedemo;

import java.util.ArrayList;
import java.util.List;

public class start {
    public static void main(String args[])
    {
        predeicatedemo predicateDemo=new predeicatedemo();
        if(predicateDemo.verifyStudentName("shwetabh")){
            System.out.println("Valid name");

        }
        System.out.println(predicateDemo.verifyPassorFail("F"));


        //working with model
        student studentObj=new student();
        System.out.println(studentObj.getName());
       if(predicateDemo.verifyStudentName(studentObj.getName()))
       {
           System.out.println("Verified name again...");
       }
       System.out.println(predicateDemo.verifyPassorFail(studentObj.getGrade()));

    }
}
