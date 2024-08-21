package co.edu.unipiloto;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        TextView list = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.Color);
        String prodType = String.valueOf(color.getSelectedItemId());

        if (prodType.equals("0")) {
            String temp = "1. Carreteras y Autopistas" +
                    "\n2. Puentes y Túneles" +
                    "\n3. Sistemas de Transporte Público" +
                    "\n4. Redes de Agua y Alcantarillado" +
                    "\n5. Infraestructura Energética";
            list.setText(temp);
        }
        if (prodType.equals("1")) {
            String temp = "1. Construcción de Museos" +
                    "\n2. Centros Culturales" +
                    "\n3. Parques de Diversiones" +
                    "\n4. Eventos Culturales" +
                    "\n5. Restauración de Monumentos";
            list.setText(temp);
        }
        if (prodType.equals("2")) {
            String temp = "1. Escuelas y Universidades" +
                    "\n2. Plataformas Educativas en Línea" +
                    "\n3. Bibliotecas Públicas" +
                    "\n4. Laboratorios de Investigación";
            list.setText(temp);
        }
        if (prodType.equals("3")) {
            String temp = "1. Hospitales" +
                    "\n2. Centros de Salud" +
                    "\n3. Programas de Vacunación" +
                    "\n4. Campañas de Conscientización sobre Salud Pública" +
                    "\n5. Instalaciones de Rehabilitación";
            list.setText(temp);
        }
        if (prodType.equals("4")) {
            String temp = "1. Redes de Fibra Óptica" +
                    "\n2. Desarrollo de Centros de Datos" +
                    "\n3. Creación de Aplicaciones y Software" +
                    "\n4. Torres de Telecomunicaciones" +
                    "\n5. Programas de Ciberseguridad";
            list.setText(temp);
        }
        if (prodType.equals("5")) {
            String temp = "1. Reforestación" +
                    "\n2. Parques Eólicos y Plantas Solares" +
                    "\n3. Sistemas de Gestión de Residios" +
                    "\n4. Limpieza y Restauración de Ecosistemas" +
                    "\n5. Campañas de Educación Ambiental";
            list.setText(temp);
        }

    }

}
