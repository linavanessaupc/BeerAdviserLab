package co.edu.unipiloto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        TextView list = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.Color);
        String prodType = String.valueOf(color.getSelectedItemId());

        if (prodType.equals("0")) {
            String temp = "1. Productos químicos" +
                    "\n2. Productos de construcción";

            list.setText(temp);
        }
        if (prodType.equals("1")) {
            String temp = "1. Cereales" +
                    "\n2. Soja" +
                    "\n3. Legumbres" +
                    "\n4. Semillas";
            list.setText(temp);
        }
        if (prodType.equals("2")) {
            String temp = "1. Agua" +
                    "\n2. Gasolina" +
                    "\n3. Petróleo" +
                    "\n4. Leche" +
                    "\n5. Miel";
            list.setText(temp);
        }
        if (prodType.equals("3")) {
            String temp = "1. Frutas" +
                    "\n2. Vegetales" +
                    "\n3. Flores" +
                    "\n4. Medicamentos";
            list.setText(temp);
        }
        if (prodType.equals("4")) {
            String temp = "1. Madera" +
                    "\n2. Leña" +
                    "\n3. Carbón vegetal" +
                    "\n4. Papel" +
                    "\n5. Resina";
            list.setText(temp);
        }
    }
}