package curso.clases.cursolistview.Utilities;

import java.util.ArrayList;
import java.util.List;

import curso.clases.cursolistview.Models.Usuarios;
import curso.clases.cursolistview.R;

public class Utilities {

    public static List<Usuarios> GetList(){
        /*lista usuarios*/
        List<Usuarios> lUsuarios = new ArrayList<Usuarios>();
        /*Llenar lista usuarios*/
        lUsuarios.add(new Usuarios("Eder Alexis", "Masculino", "eder414c@hotmail.com", 31, R.drawable.caracangrejo));
        lUsuarios.add(new Usuarios("Juan Perez", "Masculino", "juan_perez@hotmail.com", 25, R.drawable.cell));
        lUsuarios.add(new Usuarios("Carmela Zavala", "Femenino", "czavala@hotmail.com", 40, R.drawable.saitama));
        lUsuarios.add(new Usuarios("Armando", "Masculino", "aramadohoyyos@hotmail.com", 31, R.drawable.gorila));
        lUsuarios.add(new Usuarios("Juliana", "Femenino", "juliana@hotmail.com", 21, R.drawable.caracangrejo));
        lUsuarios.add(new Usuarios("Fernanda", "Femenino", "fernandac@hotmail.com", 45, R.drawable.saitama));
        return lUsuarios;
    }
}
