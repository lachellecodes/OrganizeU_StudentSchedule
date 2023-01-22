package MobileApp.Lachelle.entities;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName="course")
public class Course {

    @PrimaryKey(autoGenerate = true)
    private int courseID;

    private String courseName;
    private String courseStartDate;
    private String courseEndDate;
    private String status;
    private String courseInstructorName;
    private String courseInstructorPhone;
    private String courseInstructorEmail;
    private String notes;

    public Course(int courseID, String courseName, String courseStartDate, String courseEndDate, String status, String courseInstructorName, String courseInstructorPhone, String courseInstructorEmail, String notes) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseStartDate = courseStartDate;
        this.courseEndDate = courseEndDate;
        this.status = status;
        this.courseInstructorName = courseInstructorName;
        this.courseInstructorPhone = courseInstructorPhone;
        this.courseInstructorEmail = courseInstructorEmail;
        this.notes = notes;
    }

    public Course() {
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseStartDate() {
        return courseStartDate;
    }

    public void setCourseStartDate(String courseStartDate) {
        this.courseStartDate = courseStartDate;
    }

    public String getCourseEndDate() {
        return courseEndDate;
    }

    public void setCourseEndDate(String courseEndDate) {
        this.courseEndDate = courseEndDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCourseInstructorName() {
        return courseInstructorName;
    }

    public void setCourseInstructorName(String courseInstructorName) {
        this.courseInstructorName = courseInstructorName;
    }

    public String getCourseInstructorPhone() {
        return courseInstructorPhone;
    }

    public void setCourseInstructorPhone(String courseInstructorPhone) {
        this.courseInstructorPhone = courseInstructorPhone;
    }

    public String getCourseInstructorEmail() {
        return courseInstructorEmail;
    }

    public void setCourseInstructorEmail(String courseInstructorEmail) {
        this.courseInstructorEmail = courseInstructorEmail;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
