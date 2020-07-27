package br.com.codenation.challenge.service.interfaces;


import br.com.codenation.challenge.entity.Challenge;

import java.util.List;

public interface ChallengeServiceInterface extends ServiceInterface<Challenge> {

    List<Challenge> findByAccelerationIdAndUserId(Long accelerationId, Long userId);

}
