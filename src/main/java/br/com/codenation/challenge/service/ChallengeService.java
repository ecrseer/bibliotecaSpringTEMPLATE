package br.com.codenation.challenge.service;

import br.com.codenation.challenge.entity.Challenge;
import br.com.codenation.challenge.repository.ChallengeRepo;
import br.com.codenation.challenge.service.interfaces.ChallengeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChallengeService implements ChallengeServiceInterface,
        UserDetailsService {
    @Autowired
    private ChallengeRepo repo;


    @Override
    public List<Challenge> findByAccelerationIdAndUserId(
            Long accelerationId, Long userId) {
        return null;
    }

    @Override
    public List<Challenge> findAll() {
        return repo.findAll();
    }

    @Override
    public Challenge save(Challenge object) {
        return repo.save(object);
    }

    @Override
    public Challenge findByName(String nam){
        return repo.findByName(nam);
    }

    @Override
    public UserDetails loadUserByUsername(String s)
            throws UsernameNotFoundException {
        return repo.findByName(s);

    }
}
