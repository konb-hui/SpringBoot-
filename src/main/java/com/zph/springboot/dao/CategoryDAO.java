package com.zph.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zph.springboot.pojo.Category;

//JpaRepository 这个父接口，就提供了CRUD, 分页等等一系列的查询了，直接拿来用，都不需要二次开发的了。
public interface CategoryDAO extends JpaRepository<Category, Integer> {

}
