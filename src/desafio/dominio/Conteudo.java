package desafio.dominio;

public abstract class Conteudo { 
    /* classe abstract não pode ser usada em outras classes para criar objeto, 
    essa classe só existe para simplicar o código, 
    é uma classe mãe (herança) para as classes Mentoria e Curso, 
    assim só descrevemos o método calcularXp aqui
    */
    protected static final double XP_PADRAO = 10d; //final representa constante

    private String titulo;
    private String decricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return this.decricao;
    }

    public void setDescricao(String decricao) {
        this.decricao = decricao;
    }





}
