package com.ali.forex.dto.request;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IslemSaveRequestDto {
    Long pariteid;
    String islemyonu;//LONG VEYA SHORT
    Double size;
    Long kullaniciid;
}
