package test;

import Task1.User;
import org.junit.Assert;
import org.junit.Test;

public class Task1Test {
    @Test
    public void test(){
        User user=User.builder().name("Arseni").occupation("Student").occupation("Ucu").age(19).build();
        Assert.assertEquals("User(name=Arseni, age=19, gender=null, weight=0.0, height=0.0, occupations=[Student, Ucu])",
                user.toString());
    }
}
