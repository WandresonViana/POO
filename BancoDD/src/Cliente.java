public class Cliente {
    private int cPF;
    private String nomeCliente;
    private String email;
    private char sexo;



    public Cliente(int cPF, String nomeCliente, String email, char sexo) {
        cPF = cPF;
        this.nomeCliente = nomeCliente;
        this.email = email;
        this.sexo = sexo;
    }



    public int getcPF() {
        return cPF;
    }



    public void setcPF(int cPF) {
        this.cPF = cPF;
    }



    public String getNomeCliente() {
        return nomeCliente;
    }



    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    public char getSexo() {
        return sexo;
    }



    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    

}
