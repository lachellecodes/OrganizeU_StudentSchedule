package MobileApp.Lachelle.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import MobileApp.Lachelle.Database.Repository;
import MobileApp.Lachelle.R;
import MobileApp.Lachelle.entities.Course;
import MobileApp.Lachelle.entities.Term;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        /*Term term = new Term(1,"Winter Term", "1/21/23", "2/28/2023");
        Repository repository = new Repository(getApplication());
        repository.insert(term);*/
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this, TermList.class);
                startActivity(intent);
            }
        });
    }


}