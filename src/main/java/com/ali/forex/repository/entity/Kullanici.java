package com.ali.forex.repository.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tblkullanici")
public class Kullanici {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ad;
    String soyad;
    String email;
    String password;
    String telefon;
    Double bakiye;
}
