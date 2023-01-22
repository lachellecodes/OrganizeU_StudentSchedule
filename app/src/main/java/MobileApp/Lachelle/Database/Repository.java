package MobileApp.Lachelle.Database;

import android.app.Application;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import MobileApp.Lachelle.dao.CourseDAO;
import MobileApp.Lachelle.dao.TermDAO;
import MobileApp.Lachelle.entities.Course;
import MobileApp.Lachelle.entities.Term;

public class Repository {

    private TermDAO mTermDAO;
    private CourseDAO mCourseDAO;
    private List<Term> mAllTerms;
    private List<Course> mAllCourses;

    private static int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public Repository(Application application) {
        OrganizeUDatabaseBuilder db = OrganizeUDatabaseBuilder.getDatabase(application);
        mTermDAO = db.termDAO();
        mCourseDAO = db.courseDAO();
    }

    public List<Term> getAllTerms() {
        databaseExecutor.execute(() -> {
            mAllTerms = mTermDAO.getAllTerms();
        });
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return mAllTerms;
    }

    public void insert(Term term){
        databaseExecutor.execute(() ->{
                mTermDAO.insert(term);
    });
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public void update(Term term){
        databaseExecutor.execute(() ->{
                mTermDAO.update(term);
    });
       try {
           Thread.sleep(1000);
       } catch (InterruptedException e){
           e.printStackTrace();
       }
    }

    public void delete(Term term){
        databaseExecutor.execute(() ->{
            mTermDAO.delete(term);
        });
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void insert(Course course){
        databaseExecutor.execute(() ->{
            mCourseDAO.insert(course);
        });
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public void update(Course course){
        databaseExecutor.execute(() ->{
            mCourseDAO.update(course);
        });
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public void delete(Course course){
        databaseExecutor.execute(() ->{
            mCourseDAO.delete(course);
        });
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }


}
