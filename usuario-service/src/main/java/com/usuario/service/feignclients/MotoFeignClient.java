package com.usuario.service.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.usuario.service.models.Moto;

@FeignClient(name = "moto-service" , url= "http://localhost:8003")
public interface MotoFeignClient {
	
	@PostMapping  
	public Moto save(@RequestBody Moto moto);
	
	@GetMapping("/usuario/{usuarioid}")
	public List<Moto> getMotos(@PathVariable int usuarioid);
}
