package com.ali.forex.service;

import com.ali.forex.dto.request.PariteSaveRequestDto;
import com.ali.forex.mapper.IPariteMapper;
import com.ali.forex.repository.IPariteRepository;
import com.ali.forex.repository.entity.Kullanici;
import com.ali.forex.repository.entity.Parite;
import com.ali.forex.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class PariteService extends ServiceManager<Parite, Long> {
    private final IPariteRepository repository;

    public PariteService(IPariteRepository repository){
        super(repository);
        this.repository = repository;
    }

    public Parite saveDto(PariteSaveRequestDto dto) {
        return save(IPariteMapper.INSTANCE.toParite(dto));
    }
}
