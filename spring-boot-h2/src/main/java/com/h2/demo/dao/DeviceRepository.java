package com.h2.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.h2.demo.model.Dispositivo;

public interface DeviceRepository extends JpaRepository<Dispositivo, Long>{

	Optional<Dispositivo> getById(Integer deviceId);

}
