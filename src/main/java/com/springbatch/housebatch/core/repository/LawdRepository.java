package com.springbatch.housebatch.core.repository;

import com.springbatch.housebatch.core.entity.Lawd;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LawdRepository extends JpaRepository <Lawd, Long> {
    Optional<Lawd> findByLawdCd(String lawdCd);
}
