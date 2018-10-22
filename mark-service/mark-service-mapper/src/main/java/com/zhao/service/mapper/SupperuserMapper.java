package com.zhao.service.mapper;


import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.zhao.service.pojo.Supperuser;
import com.zhao.service.pojo.SupperuserExample;

public interface SupperuserMapper {
    long countByExample(SupperuserExample example);

    int deleteByExample(SupperuserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Supperuser record);

    int insertSelective(Supperuser record);

    List<Supperuser> selectByExample(SupperuserExample example);

    Supperuser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Supperuser record, @Param("example") SupperuserExample example);

    int updateByExample(@Param("record") Supperuser record, @Param("example") SupperuserExample example);

    int updateByPrimaryKeySelective(Supperuser record);

    int updateByPrimaryKey(Supperuser record);
}