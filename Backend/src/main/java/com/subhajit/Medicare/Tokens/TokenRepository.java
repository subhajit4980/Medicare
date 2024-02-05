package com.subhajit.Medicare.Tokens;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface TokenRepository extends MongoRepository<Token, String> {

    @Query("{'revoked': false, 'expired': false}")
    List<Token> findTokensByUserId(String userId);
    Optional<Token> findByToken(String token);
}