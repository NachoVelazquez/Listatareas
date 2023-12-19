package com.CMEPPS.listatareas.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.CMEPPS.listatareas.model.Hours;
import com.CMEPPS.listatareas.repository.HoursRepository;

@Service
public class HoursService implements IHoursService {

	@Autowired
	private HoursRepository hoursRepository;

	@Override
	public List<Hours> getTodosByUser(String user) {
		return hoursRepository.findByUserName(user);
	}

	@Override
	public Optional<Hours> getTodoById(long id) {
		return hoursRepository.findById(id);
	}

	@Override
	public void updateHours(Hours hours) {
		hoursRepository.save(hours);
	}

	@Override
	public void addHours(long id, String username, long hours) {
		hoursRepository.save(new Hours(id, username, hours));
	}

	@Override
	public void deleteHours(long id) {
		Optional<Hours> hours = hoursRepository.findById(id);
		if (hours.isPresent()) {
			hoursRepository.delete(hours.get());
		}
	}

	@Override
	public void saveHours(Hours hours) {
		hoursRepository.save(hours);
	}
}
