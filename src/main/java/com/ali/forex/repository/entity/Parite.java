package com.ali.forex.repository.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name ="tblparite")
public class Parite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
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
