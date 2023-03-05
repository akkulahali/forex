package com.ali.forex.repository.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name ="tblislem")
public class Islem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long pariteid;
    String islemyonu;//LONG VEYA SHORT
    Long openingdate;
    Long closingdate;
    Double openingvalue;
    Double closingvalue;
    Double size;
    Double swap;
    Double komisyon;
    Double kar;
    Long kullaniciid;
    EIslemDurumu islemdurumu;
}
