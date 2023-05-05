
package newtime.DTO;

public class Usuario {
    private int chave;
    private String nomeUsuario;
    private String senha;
    private String nascimento;

    /**
     * @return the chave
     */
    public int getChave() {
        return chave;
    }

    /**
     * @param chave the chave to set
     */
    public void setChave(int chave) {
        this.chave = chave;
    }

    /**
     * @return the nomeUsuario
     */
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    /**
     * @param nomeUsuario the nomeUsuario to set
     */
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the nascimento
     */
    public String getNascimento() {
        return nascimento;
    }

    /**
     * @param nascimento the nascimento to set
     */
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    
    
}
