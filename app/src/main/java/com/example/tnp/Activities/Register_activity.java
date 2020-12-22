package com.example.tnp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tnp.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Register_activity extends AppCompatActivity {


    private EditText userEmail, userPassword, userPassword2, userName;
    private ProgressBar loadingProgress;
    private Button regBtn;
    private Button regLogin;


    private FirebaseAuth mAuth;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //inu viwes
        userEmail = findViewById(R.id.regMail);
        userPassword = findViewById(R.id.regPassword);
        userPassword2 = findViewById(R.id.regPassword2);
        userName = findViewById(R.id.regName);
        loadingProgress = findViewById(R.id.ProgressBar);
        regBtn = findViewById(R.id.regBtn);
        loadingProgress.setVisibility(View.INVISIBLE);
        regLogin = findViewById(R.id.regLogin);


        mAuth = FirebaseAuth.getInstance();


        regBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
               regBtn.setVisibility(View.INVISIBLE);
               loadingProgress.setVisibility(View.INVISIBLE);
               final String email= userEmail.getText().toString();
               final String password = userPassword.getText().toString();
               final String password2 = userPassword2.getText().toString();
               final String name = userName.getText().toString();

               if( email.isEmpty() || name.isEmpty() || password.isEmpty() || password2.isEmpty() || !password.equals(password2) ){

                   //something goes wrong pop up a message : all field must be filled

                   showMessage("Please Verify all field");
                   regBtn.setVisibility(View.VISIBLE);
                   loadingProgress.setVisibility(View.INVISIBLE);

               }
               else {

                   // everything is ok and all fields are field now can start creting user account
                   //CreateUserAccount meathod will try to create the user if email is valid*

                   CreateUserAccount(email,name,password);
               }
            }
        });
        regLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Register_activity.this, Login_activity.class));
            }
        });
    }

    private void CreateUserAccount(String email, String name, String password) {

        //this method create user account with specific email and password

        mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){

                    //user accoun created successfully
                    showMessage("Account Created");
                    //after we create User account we need to update his profile and name
                    updateUserInfo(name,mAuth.getCurrentUser());
                }
                else {
                    //account creation failed
                    showMessage("Account creation failed" + task.getException().getMessage());
                    regBtn.setVisibility(View.VISIBLE);
                    loadingProgress.setVisibility(View.INVISIBLE);
                }
            }
        });


    }

    //update user
    private void updateUserInfo(String name, FirebaseUser currentUser) {

        updateUI();
    }

    private void updateUI() {
        Intent Homeactivity = new Intent(getApplicationContext(), Home_activity.class);
        startActivity(Homeactivity);
        finish();
    }

    //simple message to shwo toast message
    private void showMessage(String message) {

        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();
    }



}




