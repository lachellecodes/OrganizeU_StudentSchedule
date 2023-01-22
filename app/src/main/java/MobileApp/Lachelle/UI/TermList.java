package MobileApp.Lachelle.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import MobileApp.Lachelle.Database.Repository;
import MobileApp.Lachelle.R;
import MobileApp.Lachelle.entities.Course;
import MobileApp.Lachelle.entities.Term;

public class TermList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_term_list);
        FloatingActionButton fab=findViewById(R.id.floatingActionButton2);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TermList.this, TermDetails.class);
                startActivity(intent);
            }
        });
    }

    public boolean onCreateTermMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.addTerm:
                Term term = new Term(1, "Winter Term", "1/21/23", "2/28/2023");
                Repository repository = new Repository(getApplication());
                repository.insert(term);
                Course course = new Course(1, "Data Anyaltics", "1/22/2023", "3/31/2023", "In Progress", "Sherry Jerry", "281-330-8004", "sjerry@wgu.edu", "Send welcome email.");
                repository.insert(course);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}