/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.dao;

import com.app.entities.Articles;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author kouam
 */
public interface ArticlesDao extends JpaRepository<Articles, Long>{
    
    @Query("select atc from articles atc where atc.nom like :x")
    public Page<Articles> searchArticle(@Param("x")String cAtc, Pageable pageable);
    
}
