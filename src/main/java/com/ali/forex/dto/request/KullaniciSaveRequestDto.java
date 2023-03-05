package com.ali.forex.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class KullaniciSaveRequestDto {
    String ad;
    String soyad;
    String email;
    String password;
    String telefon;
}
