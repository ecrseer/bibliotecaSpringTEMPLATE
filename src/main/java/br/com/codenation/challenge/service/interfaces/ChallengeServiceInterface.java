package br.com.codenation.challenge.service.interfaces;


import br.com.codenation.challenge.entity.Challenge;

import java.util.List;
import java.util.Optional;

public interface ChallengeServiceInterface extends ServiceInterface<Challenge> {

    List<Challenge> findByAccelerationIdAndUserId(Long accelerationId, Long userId);

       Challenge findByName(String nam);

}
