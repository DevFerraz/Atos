package Heranca;

public class Funcionario extends Pessoa implements OrganizacaoEmpresa {
    private String cargo;
    private String funcao;
    private String setor;

    @Override
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String getCargo() {
        return this.cargo;
    }

    @Override
    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String getSetor() {
        return this.setor;
    }

    @Override
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String getFuncao() {
        return funcao;
    }
}


