package com.ali.forex.mapper;

import com.ali.forex.dto.request.IslemSaveRequestDto;
import com.ali.forex.repository.entity.Islem;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IIslemMapper {
    IIslemMapper INSTANCE = Mappers.getMapper(IIslemMapper.class);
    Islem toIslem (final IslemSaveRequestDto dto);
}
