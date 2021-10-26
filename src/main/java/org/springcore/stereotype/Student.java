package org.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("ob")
@Scope("prototype")
public class Student {
    @Value("Hrithik Sawant")
    private String studentname;
    @Value("Mumbai")
    private String city;
    @Value("#{temp}")
    private List<String> subjects;

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentname='" + studentname + '\'' +
                ", city='" + city + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
