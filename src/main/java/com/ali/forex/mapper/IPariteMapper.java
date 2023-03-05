package com.ali.forex.mapper;

import com.ali.forex.dto.request.PariteSaveRequestDto;
import com.ali.forex.repository.entity.Parite;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IPariteMapper {
    IPariteMapper INSTANCE = Mappers.getMapper(IPariteMapper.class);
    Parite toParite (final PariteSaveRequestDto dto);
}
