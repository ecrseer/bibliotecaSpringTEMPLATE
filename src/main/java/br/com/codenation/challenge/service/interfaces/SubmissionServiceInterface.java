package br.com.codenation.challenge.service.interfaces;


import br.com.codenation.challenge.entity.Submission;

import java.math.BigDecimal;
import java.util.List;

public interface SubmissionServiceInterface extends ServiceInterface<Submission> {

    BigDecimal findHigherScoreByChallengeId(Long challengeId);

    List<Submission> findByChallengeIdAndAccelerationId(Long challengeId, Long accelerationId);

}
