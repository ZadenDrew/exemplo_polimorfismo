
package exemplopolimorfismo;

/**
 *
 * @author acabezaslopez
 */
public class Persona {
    private String nome;
    private int edade;

    public Persona() {
    }

    public Persona(String nome, int edade) {
        this.nome = nome;
        this.edade = edade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEdade() {
        return edade;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    @Override
    public String toString() {
        return "Persona{" + "nome=" + nome + ", edade=" + edade + '}';
    }
    
}
