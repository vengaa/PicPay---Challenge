package me.felipedev.picpaychallenge.picpaysimplificado.dtos;

import java.math.BigDecimal;

public record TransactionDTO(BigDecimal value, Long senderId, Long receivedId) {

}
