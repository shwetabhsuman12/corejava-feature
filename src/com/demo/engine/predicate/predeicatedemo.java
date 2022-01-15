package com.demo.engine.predicate;

import java.util.function.Predicate;

public class predeicatedemo {
    private Predicate<String> condition=student -> student.equals("shwetabh");
    private Predicate<String> condition_fail=fail -> fail.equals("F");
    private Predicate<String> condition_success=Predicate.not(condition_fail);
    public Boolean verifyStudentName(String name)
    {
        return condition.test(name);
    }

    public String verifyPassorFail(String grade)
    {
        if(condition_success.test(grade)){
            return "success";
        }else{
            return "fail";
        }
    }

}
