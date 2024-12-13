package me.felipedev.picpaychallenge.picpaysimplificado.repositories;

import me.felipedev.picpaychallenge.picpaysimplificado.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
