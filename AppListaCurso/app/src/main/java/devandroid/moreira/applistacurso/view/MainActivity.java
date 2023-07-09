package devandroid.moreira.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.moreira.applistacurso.R;
import devandroid.moreira.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {
    //ClassePessoa
    Pessoa pessoa;

    //EditTEXTS
    EditText editPrimeiroNome;
    EditText editSobreNomeAluno;
    EditText editNomeCurso;
    EditText editTelefoneContato;

    //Button
    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     pessoa = new Pessoa();
     pessoa.setPrimeiroNome("Mateus");
     pessoa.setSobreNome("Moreira");
     pessoa.setCursoDesejado("Android");
     pessoa.setTelefoneContato("11-898765");


    editPrimeiroNome = findViewById(R.id.editprimeiroNome);
    editSobreNomeAluno = findViewById(R.id.editSobreNomeAluno);
    editNomeCurso = findViewById(R.id.editNomeCurso);
    editTelefoneContato = findViewById(R.id.editTelefoneContato);

    btnLimpar = findViewById(R.id.btnLimpar);
    btnSalvar = findViewById(R.id.btnSalvar);
    btnFinalizar = findViewById(R.id.btnFinalizar);

     editPrimeiroNome.setText(pessoa.getPrimeiroNome());
     editSobreNomeAluno.setText(pessoa.getSobreNome());
     editNomeCurso.setText(pessoa.getCursoDesejado());
     editTelefoneContato.setText(pessoa.getTelefoneContato());

    // funcionamento dos botões
    btnLimpar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
         editPrimeiroNome.setText("");
         editSobreNomeAluno.setText("");
         editNomeCurso.setText("");
         editTelefoneContato.setText("");
        }
    });

    btnFinalizar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this,"Volte Sempre",Toast.LENGTH_LONG).show();
            finish();

        }
    });

    btnSalvar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
            pessoa.setSobreNome(editSobreNomeAluno.getText().toString());
            pessoa.setCursoDesejado(editNomeCurso.getText().toString());
            pessoa.setTelefoneContato(editTelefoneContato.getText().toString());

            Toast.makeText(MainActivity.this,"Salvo"+pessoa.toString(),Toast.LENGTH_LONG).show();

        }
    });
    }
}