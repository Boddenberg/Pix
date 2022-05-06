package br.com.boddenberg.pixproject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import br.com.boddenberg.pixproject.entity.CPFKey;

public interface CPFKeyRepository extends MongoRepository<CPFKey, String> {

	@Query(value = "{'cpf': ?0}")
	String findByCpf(String cpfKey);
}
