package com.h2.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.h2.demo.dao.DeviceRepository;
import com.h2.demo.model.Dispositivo;
import com.h2.demo.signup.idemac;

@RestController
public class DeviceController {
	@Autowired
	private DeviceRepository repository;
	
	@PostMapping(path = "registrar")
	public ResponseEntity<?> create(@RequestBody Dispositivo device) {
		repository.save(device);
		
		idemac returnedDevice = new idemac();
		returnedDevice.setDeviceId(device.getId());
		returnedDevice.setMac_do_dispositivo(device.getMac());
		
		return new ResponseEntity<>(returnedDevice,HttpStatus.CREATED);
	}
	
	@GetMapping("/listar")
	public List<Dispositivo> getAll(){
		return repository.findAll();
	}
	
	@GetMapping("/listar/{deviceId}")
	public Optional<Dispositivo> getDevicebyID(@PathVariable Integer deviceId){
		return repository.getById(deviceId);
}
}
