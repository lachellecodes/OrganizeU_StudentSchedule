package MobileApp.Lachelle.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import MobileApp.Lachelle.dao.CourseDAO;
import MobileApp.Lachelle.dao.TermDAO;
import MobileApp.Lachelle.entities.Course;
import MobileApp.Lachelle.entities.Term;

@Database(entities = {Course.class, Term.class}, version=1, exportSchema = false)
public abstract class OrganizeUDatabaseBuilder extends RoomDatabase {

    public abstract TermDAO termDAO();

    public abstract CourseDAO courseDAO();

    private static volatile OrganizeUDatabaseBuilder INSTANCE;

    static OrganizeUDatabaseBuilder getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (OrganizeUDatabaseBuilder.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), OrganizeUDatabaseBuilder.class, "StudentScheduler.db")
                            .fallbackToDestructiveMigration()
                            .allowMainThreadQueries()
                            .build();


                }
            }


        }
        return INSTANCE;
    }
}
