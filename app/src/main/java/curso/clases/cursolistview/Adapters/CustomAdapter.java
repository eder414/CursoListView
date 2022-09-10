package curso.clases.cursolistview.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import curso.clases.cursolistview.Models.Usuarios;
import curso.clases.cursolistview.R;

public class CustomAdapter extends BaseAdapter {
    /*atributos de nuestro ListView*/
    ImageView imageViewUsuario;
    TextView nombre,correo,edad,sexo;
    /*atributos de nuestro adaptador*/
    Context contexto;
    List<Usuarios> lUsuarios;

    public CustomAdapter(Context contexto, List<Usuarios> lUsuarios) {
        this.contexto = contexto;
        this.lUsuarios = lUsuarios;
    }

    @Override
    public int getCount() {
        return lUsuarios.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null){
            view = LayoutInflater.from(contexto).inflate(R.layout.listview_item,null);
        }
        /*obtenemos usuario actual*/
        Usuarios usuarios = lUsuarios.get(i);
        /*Obtengo imagen*/
        imageViewUsuario = view.findViewById(R.id.imgaViewUsario);
        /*obtento textviews*/
        nombre = view.findViewById(R.id.textViewNombre);
        correo = view.findViewById(R.id.textViewCorreo);
        edad = view.findViewById(R.id.textViewEdad);
        sexo = view.findViewById(R.id.textViewSexo);

        /*mandamos valores a los elementos*/
        nombre.setText(usuarios.getNombre());
        correo.setText(usuarios.getCorreo());
        edad.setText(String.valueOf(usuarios.getEdad()));
        sexo.setText(usuarios.getSexo());

        imageViewUsuario.setImageResource(usuarios.getImagen());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(contexto.getApplicationContext(),usuarios.getNombre(),Toast.LENGTH_LONG).show();
            }
        });
        imageViewUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(contexto.getApplicationContext(),usuarios.getNombre(),Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}
