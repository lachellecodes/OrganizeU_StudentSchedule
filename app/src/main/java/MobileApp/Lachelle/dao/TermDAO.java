package MobileApp.Lachelle.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import MobileApp.Lachelle.entities.Term;

@Dao
public interface TermDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Term term);
    @Update
    void update(Term term);
    @Delete
    void delete (Term term);
    @Query("SELECT * FROM TERM ORDER BY termID ASC")
    List<Term> getAllTerms();

}
