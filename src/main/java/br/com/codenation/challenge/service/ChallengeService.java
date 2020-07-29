package br.com.codenation.challenge.service;

import br.com.codenation.challenge.entity.Challenge;
import br.com.codenation.challenge.service.interfaces.ChallengeServiceInterface;

import java.util.List;

public class ChallengeService implements ChallengeServiceInterface {
    @Override
    public List<Challenge> findByAccelerationIdAndUserId(Long accelerationId, Long userId) {
        return null;
    }

    @Override
    public Challenge save(Challenge object) {
        return null;
    }
}
