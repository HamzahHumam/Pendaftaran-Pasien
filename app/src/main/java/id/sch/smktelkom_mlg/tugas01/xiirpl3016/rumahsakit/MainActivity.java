
package id.sch.smktelkom_mlg.tugas01.xiirpl3016.rumahsakit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText NamaPasien;
    EditText AlamatPasien;
    EditText TahunPasien;
    EditText LamaMenginapPasien;
    RadioButton radioButtonLaki, radioButtonPerempuan;
    CheckBox checkBoxAnggrek, checkBoxMawar, checkBoxMelati;
    Spinner spinnerPenyakit;
    Button buttonOK;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NamaPasien = (EditText) findViewById(R.id.NamaPasien);
        AlamatPasien = (EditText) findViewById(R.id.AlamatPasien);
        TahunPasien = (EditText) findViewById(R.id.TahunPasien);
        LamaMenginapPasien = (EditText) findViewById(R.id.LamaMenginapPasien);

        radioButtonLaki = (RadioButton) findViewById(R.id.radioButtonLaki);
        radioButtonPerempuan = (RadioButton) findViewById(R.id.radioButtonPerempuan);

        checkBoxAnggrek = (CheckBox) findViewById(R.id.checkBoxAnggrek);
        checkBoxMawar = (CheckBox) findViewById(R.id.checkBoxMawar);
        checkBoxMelati = (CheckBox) findViewById(R.id.checkBoxMelati);

        spinnerPenyakit = (Spinner) findViewById(R.id.spinnerPenyakit);
        buttonOK = (Button) findViewById(R.id.buttonOK);
        tvHasil = (TextView) findViewById(R.id.tvHasil);

    }

}


