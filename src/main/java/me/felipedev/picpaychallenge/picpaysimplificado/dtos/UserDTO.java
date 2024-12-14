package me.felipedev.picpaychallenge.picpaysimplificado.dtos;

import me.felipedev.picpaychallenge.picpaysimplificado.domain.user.UserType;

import java.math.BigDecimal;

public record UserDTO (String firstName, String lastName, String document, String email, String password, BigDecimal balance, UserType userType){
}
