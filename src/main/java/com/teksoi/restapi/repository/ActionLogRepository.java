package com.teksoi.restapi.repository;

import com.teksoi.restapi.model.ActionLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Mozahid on 11/1/17.
 */
@Repository
public interface ActionLogRepository extends JpaRepository<ActionLog, Integer> {

}
