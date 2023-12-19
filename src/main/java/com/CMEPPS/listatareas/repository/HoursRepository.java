package com.CMEPPS.listatareas.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.CMEPPS.listatareas.model.Hours;

public interface HoursRepository extends JpaRepository<Hours, Long> {
	List < Hours > findByUserName(String user);
}
