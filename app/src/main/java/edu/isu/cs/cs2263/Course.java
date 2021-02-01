package edu.isu.cs.cs2263;


import java.io.Serializable;

public class Course implements Serializable {
    public String courseName;
    public int courseNumber;
    public int number_of_Credits;

    public Course(String courseName, int courseNumber,int number_of_Credits){}

    // getter methods
    public String getCourseName(){
        return courseName;
    }
    public int getCourseNumber(){
        return courseNumber;
    }
    public int getNumber_of_Credits(){
        return  number_of_Credits;
    }

        // setter methods
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public void setCourseNumber(int courseNumber){
        this.courseNumber = courseNumber;
    }
    public void setNumber_of_Credits(int number_of_Credits){
        this.number_of_Credits = number_of_Credits;

    }

    public String toString(){
        return String.format("%s %d -%s", courseName, courseNumber, number_of_Credits);
    }
}
