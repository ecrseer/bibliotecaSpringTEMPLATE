package br.com.codenation.challenge.repository;

import br.com.codenation.challenge.entity.Challenge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ChallengeRepo extends CrudRepository<Challenge,Long> {

    List<Challenge> findAllByAccelerationsIdAndSubmissionsIdUserId(
            Long accelerationId,Long userId
    );
    List<Challenge> findAll();

    Challenge findByName(String name);


}
