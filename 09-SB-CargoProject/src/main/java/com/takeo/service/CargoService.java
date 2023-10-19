package com.takeo.service;

import java.util.List;

import com.takeo.dto.CargoDto;

public interface CargoService {

     CargoDto createCargo(CargoDto cargoDto);
    CargoDto updateCargo(CargoDto cargoDto, Integer cargoId);
    CargoDto getCargoById(Integer cargoId);
    List<CargoDto> getAllCargo();
    void deleteCargo(Integer cargoId);
}
