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
		// TODO Auto-generated method stub

	}

	@Override
	public void addHours(long id, String username, long hours) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteHours(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveHours(long id) {
		// TODO Auto-generated method stub

	}

}
