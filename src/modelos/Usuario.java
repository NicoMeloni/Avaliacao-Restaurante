package modelos;

public class Usuario {
    protected String nomeUsuario, senha, email, dataCadastro;
    protected int idUsuario;
    
    public Usuario(String nome, String senha) {
        this.nomeUsuario = nome;
        this.senha = senha;
    }

    public Usuario(String nome, String senha, String email, int idUsuario, String dataCadastro) {
        this.nomeUsuario = nome;
        this.senha = senha;
        this.email = email;
        this.idUsuario = idUsuario;
        this.dataCadastro = dataCadastro;
    }
    
    @Override
    public String toString(){
        return String.format("""
                idUsuario: %s
                nome: %s
                senha: %s
                email: %s
                data: %s
                """, (this.idUsuario != 0 ? this.idUsuario : ""),nomeUsuario, senha, email, dataCadastro);
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
