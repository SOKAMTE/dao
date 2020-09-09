/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.dao;

import com.app.entities.Discussion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author kouam
 */
public interface DiscussionDao extends JpaRepository<Discussion, Long> {
    
    @Query("select disc from discussion disc where disc.message like :x")
    public Page<Discussion> searchDiscussion(@Param("x")String cDisc, Pageable pageable);
    
}
