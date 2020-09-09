/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.dao;

import com.app.entities.ArticleType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author kouam
 */
public interface ArticleTypeDao extends JpaRepository<ArticleType, Long> {
    
    @Query("select atcTp from article_type atcTp where atcTp.Type like :x")
    public Page<ArticleType> searchArticleType(@Param("x")String cAtcTp, Pageable pageable);
    
}
