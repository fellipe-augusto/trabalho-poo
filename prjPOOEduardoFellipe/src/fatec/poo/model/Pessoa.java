package fatec.poo.model;

/**
 *
 * @author Eduardo Ribeiro
 */

public class Pessoa {
    
    private String cpf;
    private String nome;
    private String endereco;
    private String cidade;
    private String uf;
    private String cep;
    private String ddd;
    private String telefone;

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public static boolean validarCpf(String cpf) {
        int Digito1 = 0, Digito2 = 0, aux = 0, Num;

        if (cpf == null || cpf.length() < 11)
            return false;
        else
        {
            for (int i = 0; i < 10; i++)
            {
                if (cpf.charAt(i) == cpf.charAt(i + 1)){
                    aux++;
                }
            }
            if (aux == 10){
                return false;
            }
            else
            {
                for (int i = 0; i < 9; i++)
                {
                    Num = (cpf.charAt(i) - 48);
                    Digito1 += Num * (10 - i);
                    Digito2 += Num * (11 - i);
                }
                Digito1 = (Digito1 * 10) % 11;
                Digito2 = ((Digito2 + (Digito1 * 2)) * 10) % 11;

                if (Digito1 == 10){
                    Digito1 = 0;
                }

                if (Digito2 == 10){
                    Digito2 = 0;
                }
                if (Digito1 == (cpf.charAt(9) - 48) && Digito2 == (cpf.charAt(10) - 48)){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
    }
}
