package desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    
    private LocalDate data;

    public Mentoria (){ // Construtor vazio

    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
}
