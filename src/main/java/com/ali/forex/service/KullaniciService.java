package com.ali.forex.service;

import com.ali.forex.dto.request.KullaniciSaveRequestDto;
import com.ali.forex.mapper.IKullaniciMapper;
import com.ali.forex.repository.IKullaniciRepository;
import com.ali.forex.repository.entity.Kullanici;
import com.ali.forex.utility.ServiceManager;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class KullaniciService extends ServiceManager<Kullanici, Long> {
    private final IKullaniciRepository repository;

    public KullaniciService(IKullaniciRepository repository){
        super(repository);
        this.repository = repository;
    }

    public Kullanici saveDto(KullaniciSaveRequestDto dto) {
        return save(IKullaniciMapper.INSTANCE.toKullanici(dto));
    }
}
