public class Contato {
    private int id;
    private String nomeContato;
    private double telefone;
    private String email;

    public Contato(int id, String nomeContato, double telefone, String email) {
        this.id = id;
        this.nomeContato = nomeContato;
        this.telefone = telefone;
        this.email = email;
    }

    public void infoContato(){
        for(int i = 0; i <=4; i++){
            System.out.println("ID: " + this.getId());
            System.out.println("Nome: " + this.getNomeContato());
            System.out.println("Telefone: " + this.getTelefone());
            System.out.println("Email: " + this.getEmail());
        }
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
    public double getTelefone() {
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
