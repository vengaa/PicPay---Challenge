package me.felipedev.picpaychallenge.picpaysimplificado.services;

import me.felipedev.picpaychallenge.picpaysimplificado.domain.user.User;
import me.felipedev.picpaychallenge.picpaysimplificado.domain.user.UserType;
import me.felipedev.picpaychallenge.picpaysimplificado.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void validateTransaction(User sender, BigDecimal amount) throws Exception {
        if (sender.getUserType() == UserType.COMMON) {
            throw new Exception("Usuário do tipo lojista não está autorizado a realizar transação.");
        }

        if (sender.getBalance().compareTo(amount) < 0) {
            throw new Exception("Saldo insuficiente.");
        }

    }

    public User findUserById(Long id) throws Exception {
        return userRepository.findById(id).orElseThrow(() -> new Exception("Saldo insuficiente."));
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

}
