package com.springboot.dao.master;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.springboot.entity.People;

/**
 * @author Louis
 * @title: PeopleDao
 * @projectName springbootstudy
 * @description: TODO
 * @date 2019/5/28 10:36
 */
@Mapper
public interface PeopleDao {

	List<People> find();

	People find(@Param("id") Integer id);

}
