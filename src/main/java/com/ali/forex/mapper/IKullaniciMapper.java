package com.ali.forex.mapper;

import com.ali.forex.dto.request.KullaniciSaveRequestDto;
import com.ali.forex.repository.entity.Kullanici;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IKullaniciMapper {
    IKullaniciMapper INSTANCE = Mappers.getMapper(IKullaniciMapper.class);
    Kullanici toKullanici(final KullaniciSaveRequestDto dto);
}
