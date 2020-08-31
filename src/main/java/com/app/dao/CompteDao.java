/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.dao;

import com.app.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author kouam
 */
public interface CompteDao extends JpaRepository<Compte, Long>{
    
}
