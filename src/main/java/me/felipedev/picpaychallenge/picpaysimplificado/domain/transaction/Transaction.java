package me.felipedev.picpaychallenge.picpaysimplificado.domain.transaction;

import jakarta.persistence.*;
import lombok.*;
import me.felipedev.picpaychallenge.picpaysimplificado.domain.user.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "transaction")
@Table(name = "transaction")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount;

    @ManyToOne // Um usuário pode ter várias transções mas uma transação só pode ter um usuário
    @JoinColumn(name = "sender_id")
    private User sender;

    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private User receiver;

    private LocalDateTime timestamp;


}
