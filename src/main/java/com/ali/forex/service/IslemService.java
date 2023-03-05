package com.ali.forex.service;

import com.ali.forex.dto.request.IslemSaveRequestDto;
import com.ali.forex.mapper.IIslemMapper;
import com.ali.forex.repository.IIslemRepository;
import com.ali.forex.repository.entity.Islem;
import com.ali.forex.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class IslemService extends ServiceManager<Islem, Long> {
    private final IIslemRepository repository;

    public IslemService(IIslemRepository repository){
        super(repository);
        this.repository = repository;
    }

    public Islem saveDto(IslemSaveRequestDto dto) {
        return save(IIslemMapper.INSTANCE.toIslem(dto));
    }
}
