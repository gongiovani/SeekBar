package seekbar.giovanivani.com.seekbar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private SeekBar seekBar;
    private TextView textoExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seekBarId);
        textoExibicao = (TextView) findViewById(R.id.textoExibicaoId);

        //Instancia uma interface de controle .SeekBar.OnSeekBarChangeListener()

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            // Quando movimento o cursor, esse metodo e chamado
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textoExibicao.setText("Progresso " + i + " / " + seekBar.getMax());
            }

            @Override
            // Acionado quando preciono o SeekBar
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Seekbar pressionado", Toast.LENGTH_SHORT).show();

            }

            @Override
            // Acionado quando solto a SeekBar
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Salvar o valor", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
