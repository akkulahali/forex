package com.ali.forex.controller;

import com.ali.forex.dto.request.KullaniciSaveRequestDto;
import com.ali.forex.repository.entity.Kullanici;
import com.ali.forex.service.KullaniciService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static com.ali.forex.constants.EndPoints.*;

@RestController
@RequestMapping("/kullanici")
@RequiredArgsConstructor
public class KullaniciController {
    private final KullaniciService kullaniciService;

    @PostMapping(SAVE)
    public ResponseEntity<Kullanici> save(@RequestBody @Valid KullaniciSaveRequestDto dto){
        Kullanici kullanici = kullaniciService.saveDto(dto);
        return ResponseEntity.ok(kullanici);
    }
}
