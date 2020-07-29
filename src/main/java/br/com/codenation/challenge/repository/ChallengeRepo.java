package br.com.codenation.challenge.repository;

import br.com.codenation.challenge.entity.Challenge;
import org.springframework.data.repository.CrudRepository;

public interface ChallengeRepo extends CrudRepository<Challenge,Long> {
}
