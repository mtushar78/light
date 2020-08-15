package com.comitit.light.repository;

import com.comitit.light.model.LightDBIdentity;
import com.comitit.light.model.LightInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LightInfoRepo extends JpaRepository<LightInfo, LightDBIdentity> {

    @Query(value = "select count(*) from light_info where db_no = :dbNo and light_no = :lightNo",
            nativeQuery = true)
    Integer ifLightInfoExists(int dbNo, int lightNo);
}
