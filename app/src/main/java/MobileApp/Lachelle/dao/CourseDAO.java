package MobileApp.Lachelle.dao;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import MobileApp.Lachelle.entities.Course;
import MobileApp.Lachelle.entities.Term;

@Dao
public interface CourseDAO {


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Course course);
    @Update
    void update(Course course);
    @Delete
    void delete (Course course);
    @Query("SELECT * FROM COURSE ORDER BY courseID ASC")
    List<Course> getAllCourses();
    @Query("SELECT * FROM COURSE WHERE courseID= :courseID ORDER BY courseID ASC")
    List<Course> getCourseById(int courseID);
}
