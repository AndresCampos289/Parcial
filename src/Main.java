
import Controlador.PersonasController;
import Modelo.ModeloPersonas;
import Vista.frmPersonas;
import Vista.frmPrincipal;

public class Main {

    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmPersonas VistaPersonas = new frmPersonas(null,true);
        ModeloPersonas PersonasModel = new ModeloPersonas();
        PersonasController ControladorPaciente = new PersonasController(VistaPrincipal, VistaPersonas, PersonasModel);
        
    }   
}
