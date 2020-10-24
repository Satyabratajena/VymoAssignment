package info.androidhive.vymo;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;

public class Login extends AppCompatActivity
{
        EditText et_owner;
        EditText et_repo;
        Button btn_submit;



        String owner, repo;

        @Override
        protected void onCreate (Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.login);


            et_owner = findViewById(R.id.et_owner);
            et_repo = findViewById(R.id.et_repo);
            btn_submit = findViewById(R.id.btn);

           // text_password = findViewById(R.id.text_password);
           // text_name = findViewById(R.id.text_name);


            btn_submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    owner = et_owner.getText().toString();
                    repo = et_repo.getText().toString();

                    if (owner.isEmpty() || repo.isEmpty())
                        {
                        Toast.makeText(Login.this, "All fields are required", Toast.LENGTH_SHORT).show();
                        }
                    else
                        {
                        Toast.makeText(Login.this, "If not Signed in into Github do Sign in first", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(Login.this, Home.class));
                        }
                }
            });
        }
    }




