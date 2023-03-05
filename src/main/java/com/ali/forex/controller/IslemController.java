package com.ali.forex.controller;

import com.ali.forex.dto.request.IslemSaveRequestDto;
import com.ali.forex.repository.entity.Islem;
import com.ali.forex.service.IslemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.ali.forex.constants.EndPoints.*;

@RestController
@RequestMapping("/islem")
@RequiredArgsConstructor
public class IslemController {
    private final IslemService islemService;

    @PostMapping(SAVE)
    public ResponseEntity<Islem> save(@RequestBody IslemSaveRequestDto dto){
        return ResponseEntity.ok(islemService.saveDto(dto));
    }
}
