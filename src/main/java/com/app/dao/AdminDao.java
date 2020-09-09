/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.dao;


import com.app.entities.Admin;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author kouam
 */

public interface AdminDao extends JpaRepository<Admin, Long>{
    
    @Query("select adm from admin adm where adm.username like :x")
    public Page<Admin> searchAdmin(@Param("x")String cAdm, Pageable pageable);
    
}
