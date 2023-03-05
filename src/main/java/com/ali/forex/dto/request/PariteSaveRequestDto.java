package com.ali.forex.dto.request;

import com.ali.forex.repository.entity.EPariteDurumu;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PariteSaveRequestDto {
    Double alisdeger;
    Double satisdeger;
    Long lastupdate;
    String name;
    int pipsize;
    int kaldirac;
    double minislemboyutu;
    double maksislemboyutu;
    double swapuzun;
    double swapkisa;
    EPariteDurumu durum;
}
