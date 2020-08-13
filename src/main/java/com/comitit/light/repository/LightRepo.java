package com.comitit.light.repository;

import com.comitit.light.model.LightEntity;
import com.comitit.light.model.LightInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface LightRepo extends JpaRepository<LightEntity,Integer> {
    @Modifying
    @Transactional
    @Query(value = "update light_entity set is_turned_on = :isTurnedOn " +
                    "where light_info_db_no = :dbNo and light_info_light_no = :lightNo",
            nativeQuery = true)
    void updateIsOn(boolean isTurnedOn, int dbNo, int lightNo);

    public LightEntity findByLightInfo(LightInfo lightInfo);
}
