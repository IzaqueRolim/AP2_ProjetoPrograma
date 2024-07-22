import model.Biblioteca;
import model.Funcionario;
import model.Usuario;
import view.MenuPrincipal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        MenuPrincipal menuPrincipal = new MenuPrincipal(biblioteca);
    }
}