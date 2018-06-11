package exemplopolimorfismo;

/**
 *
 * @author acabezaslopez
 */
public class ExemploPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona a = new Alumno(4, "Ana", 32);
        System.out.println(a.toString());
    }

}
