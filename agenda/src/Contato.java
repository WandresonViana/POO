public class Contato {
    private int id;
    private String nomeContato;
    private int telefone;
    private String email;

    public Contato(int id, String nomeContato, int telefone, String email) {
        this.id = id;
        this.nomeContato = nomeContato;
        this.telefone = telefone;
        this.email = email;
    }

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomeContato() {
        return nomeContato;
    }
    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
