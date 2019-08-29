package com.zph.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.zph.springboot.pojo.Category;

@Mapper
public interface CategoryMapper {
	
	@Select("select * from category_")
	List<Category> findAll();
}
