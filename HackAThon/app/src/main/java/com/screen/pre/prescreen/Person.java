package com.screen.pre.prescreen;

/**
 * Created by devin on 1/14/2018.
 */

public class Person {

    String name, age, education, email, hobbies;
    Long phoneNumber;
    Double gpa;

    public Person(String name, String age, String education, String email, String hobbies, Long phoneNumber, Double gpa) {
        this.name = name;
        this.age = age;
        this.education = education;
        this.email = email;
        this.hobbies = hobbies;
        this.phoneNumber = phoneNumber;
        this.gpa = gpa;
    }

    public int compareTo(Person x) {
        int w = 0;
        if (gpa - x.getGpa() > 1 || gpa - x.getGpa() < -1) {
            w = (int) (gpa - x.getGpa());
        } else if (gpa - x.getGpa() > 0) {
            w = 1;
        } else if (gpa - x.getGpa() < 0) {
            w = - 1;
        }
        return w;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", education='" + education + '\'' +
                ", email='" + email + '\'' +
                ", hobbies='" + hobbies + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", gpa=" + gpa +
                '}';
    }
}
