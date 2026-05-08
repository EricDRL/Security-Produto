package er.sec.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tbl_produtos")
@Data
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTIFY)
    private Long id;
    private String nome;
}