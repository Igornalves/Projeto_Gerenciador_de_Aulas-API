package igor.com.br.gerenciador_de_aulas.modules.turma.entities;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import igor.com.br.gerenciador_de_aulas.modules.aluno.entities.AlunoEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class TurmaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank
    private String sigla;

    @NotBlank
    private String tipo;

    @NotBlank
    private int ano; 

    @OneToMany(mappedBy = "turmaEntity")
    private Set<AlunoEntity> alunos;

    @CreationTimestamp
    private LocalDateTime dataDeCriacao;
}
