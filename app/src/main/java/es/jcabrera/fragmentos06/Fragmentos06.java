package es.jcabrera.fragmentos06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Fragmentos06 extends AppCompatActivity {
    private Button btnMostrarDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmentos06);

        btnMostrarDialog = (Button) findViewById(R.id.ver);
        btnMostrarDialog.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Fragmento1 dialogFragment = Fragmento1
                        .newInstance("   DIALOGFRAGMENT");
                dialogFragment.show(getSupportFragmentManager(), "dialog");
            }

        });
    }

    public void doPositiveClick() {
        Toast.makeText(this, "OK PULSADO", Toast.LENGTH_SHORT).show();
    }

    public void doNegativeClick() {
        Toast.makeText(this, "CANCEL PULSADO", Toast.LENGTH_SHORT).show();
    }
}

