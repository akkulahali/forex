package com.ali.forex.controller;

import com.ali.forex.dto.request.PariteSaveRequestDto;
import com.ali.forex.repository.entity.Kullanici;
import com.ali.forex.repository.entity.Parite;
import com.ali.forex.service.PariteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static com.ali.forex.constants.EndPoints.SAVE;

@RestController
@RequestMapping("/parite")
@RequiredArgsConstructor
public class PariteController {
    private final PariteService pariteService;

    @PostMapping(SAVE)
    public ResponseEntity<Parite> save(@RequestBody @Valid PariteSaveRequestDto dto){
        Parite parite = pariteService.saveDto(dto);
        return ResponseEntity.ok(parite);
    }
}