package com.screen.pre.prescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class UserForm extends AppCompatActivity {

    static Person person;

    private EditText inputName;
    private EditText inputAge;
    private EditText inputEducation;
    private EditText inputHobbies;
    private EditText inputPhoneNumber;
    private EditText inputEmail;
    private EditText inputGPA;
    private Button submitButton;
    private CheckBox inputGender;
    private EditText inputExperience;


        public Person getPerson() {
            return person;
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_form);

        inputName = (EditText) findViewById(R.id.Name);
        inputAge = (EditText) findViewById(R.id.Age);
        inputEducation = (EditText) findViewById(R.id.Education);
        inputPhoneNumber = (EditText) findViewById(R.id.PhoneNumber);
        inputEmail = (EditText) findViewById(R.id.Email);
        inputHobbies = (EditText) findViewById(R.id.Hobbies);
        inputGPA = (EditText) findViewById(R.id.gpa);
        submitButton = (Button) findViewById(R.id.FirstPageButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                create();
                start();
                Toast.makeText(UserForm.this, "Clicked 'NEXT, calculating percentile'", Toast.LENGTH_SHORT).show();

            }
        });
    }


    public void create() {
        person = new Person(inputName.getText().toString(),
                inputAge.getText().toString(),
                inputEducation.getText().toString(),
                inputEmail.getText().toString(),
                inputHobbies.getText().toString(),
                Long.valueOf(inputPhoneNumber.getText().toString()),
                Double.valueOf(inputGPA.getText().toString()));
        Driver.add(person);
        Driver.add(new Person("Billy Joe", "23", "Harvard", "Bdabeast@gmail.com", "Aviation", 4089817460l, 3.9));
        Driver.add(new Person("Light Bulb", "25", "UCSD", "Shiny.light@gmail.com", "electricity", 9035743454l, 3.5));
        Driver.add(new Person("Havana Lilly", "27", "Cal Poly", "Lilly@gmail.com", "Comic books", 4082357609l, 3.8));
        Driver.add(new Person("Michael Daniels", "28", "Harvy Mudd", "daniel874@gmail.com", "Dancing", 3347541254l, 3.8));
        Driver.sort(Driver.list);
    }
    public void start() {
        Intent newActivity = new Intent(this, Activity2.class);
        startActivity(newActivity);
    }

}
