package com.comitit.light.repository;

import com.comitit.light.model.LightEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LightRepo extends JpaRepository<LightEntity,Integer> {
}
