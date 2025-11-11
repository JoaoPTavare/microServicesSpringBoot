package ms_work.entites;

import jakarta.persistence.*;

@Entity
@Table
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String cep;

    @Column
    private String cidade;

    @Column
    private String Estado;

    @OneToOne
    private Worker worker;

    public Endereco() {
    }

    public Endereco(Long id, String cep, String cidade, Worker worker, String Estado) {
        this.id = id;
        this.cep = cep;
        this.cidade = cidade;
        this.worker = worker;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
