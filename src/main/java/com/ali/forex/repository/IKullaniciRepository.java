package com.ali.forex.repository;

import com.ali.forex.repository.entity.Kullanici;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IKullaniciRepository extends JpaRepository<Kullanici,Long> {
}
