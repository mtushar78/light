package com.comitit.light.repository;

import com.comitit.light.model.LightDBIdentity;
import com.comitit.light.model.LightInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LightInfoRepo extends JpaRepository<LightInfo, LightDBIdentity> {
}
