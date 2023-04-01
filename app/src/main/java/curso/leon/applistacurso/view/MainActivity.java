package curso.leon.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaTimestamp;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import curso.leon.applistacurso.R;
import curso.leon.applistacurso.controller.PessoaController;
import curso.leon.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    PessoaController controller;
    EditText editPrimeiroNome;
    EditText editSobrenome;
    EditText editNomeCurso;
    EditText editTelefone;

    Button buttonSalvar;
    Button buttonLimpar;
    Button buttonFinalizar;
    Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controller = new PessoaController();
        pessoa = new Pessoa();

        pessoa.setNomeCurso("Programação Dispositivos Móveis");
        pessoa.setPrimeiroNome("Leon");
        pessoa.setSobrenomee("Heck Branchi");
        pessoa.setTelefoneContato("51 99559955");

       Log.i("teste log","Infos: "+pessoa.toString());

       editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
       editSobrenome = findViewById(R.id.editSobrenome);
       editNomeCurso = findViewById(R.id.editNomeCurso);
       editTelefone = findViewById(R.id.editTelefone);
       buttonSalvar = findViewById(R.id.buttonSalvar);
       buttonLimpar = findViewById(R.id.buttonLimpar);
       buttonFinalizar = findViewById(R.id.buttonFinalizar);

       editPrimeiroNome.setText(pessoa.getPrimeiroNome());
       editSobrenome.setText(pessoa.getSobrenomee());
       editNomeCurso.setText(pessoa.getNomeCurso());
       editTelefone.setText(pessoa.getTelefoneContato());

       buttonSalvar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
               pessoa.setSobrenomee(editSobrenome.getText().toString());
               pessoa.setNomeCurso(editNomeCurso.getText().toString());
               pessoa.setTelefoneContato(editTelefone.getText().toString());

               Toast.makeText(MainActivity.this, "Salvo :"+pessoa.toString(), Toast.LENGTH_LONG).show();
           }
       });
       buttonLimpar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               editPrimeiroNome.setText(" ");
               editSobrenome.setText(" ");
               editNomeCurso.setText(" ");
               editTelefone.setText(" ");

           }
       });
       buttonFinalizar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "volte sempre", Toast.LENGTH_LONG).show();
               finish();
           }
       });

    }
}