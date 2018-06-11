
package exemplopolimorfismo;

/**
 *
 * @author acabezaslopez
 */
public class Alumno extends Persona{
    private int nota;

    public Alumno() {
    }

    public Alumno(int nota, String nome, int edade) {
        super(nome, edade);
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nota=" + nota + ", nome=" + super.getNome() + ", edade=" + super.getEdade() + '}';
    }
    
    
}
