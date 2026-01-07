
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Articulo a1 = new Articulo("Java Lehen OOP", new Autor("Aitzol Elu"), LocalDate.now(), Categoria.BACKEND);
        System.out.println(a1.toString());
    }
}
