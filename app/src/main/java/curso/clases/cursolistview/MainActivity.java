package curso.clases.cursolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import curso.clases.cursolistview.Adapters.CustomAdapter;
import curso.clases.cursolistview.Models.Usuarios;
import curso.clases.cursolistview.Utilities.Utilities;

public class MainActivity extends AppCompatActivity {
    List<Usuarios> lUsuarios;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Obtenemos usuarios*/
        lUsuarios = Utilities.GetList();
        /*obtenemos listview*/
        listView = findViewById(R.id.listView);
        /*Intanciar adaptador*/
        CustomAdapter customAdapter = new CustomAdapter(this,lUsuarios);
        /*asginar adaptador a nuestro listview*/
        listView.setAdapter(customAdapter);

    }
}