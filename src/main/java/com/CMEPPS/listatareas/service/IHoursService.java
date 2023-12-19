package com.CMEPPS.listatareas.service;

import java.util.List;
import java.util.Optional;

import com.CMEPPS.listatareas.model.Hours;

public interface IHoursService {
	List<Hours> getTodosByUser(String user);

	Optional<Hours> getTodoById(long id);

	void updateHours(Hours hours);

	void addHours(long id, String username, long hours);

	void deleteHours(long id);

	void saveHours(long id);
}
