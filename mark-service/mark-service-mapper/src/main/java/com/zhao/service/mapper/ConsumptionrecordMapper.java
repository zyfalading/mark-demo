package com.zhao.service.mapper;

import com.zhao.service.pojo.Consumptionrecord;
import com.zhao.service.pojo.ConsumptionrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConsumptionrecordMapper {
    long countByExample(ConsumptionrecordExample example);

    int deleteByExample(ConsumptionrecordExample example);

    int deleteByPrimaryKey(String serialnumber);

    int insert(Consumptionrecord record);

    int insertSelective(Consumptionrecord record);

    List<Consumptionrecord> selectByExample(ConsumptionrecordExample example);

    Consumptionrecord selectByPrimaryKey(String serialnumber);

    int updateByExampleSelective(@Param("record") Consumptionrecord record, @Param("example") ConsumptionrecordExample example);

    int updateByExample(@Param("record") Consumptionrecord record, @Param("example") ConsumptionrecordExample example);

    int updateByPrimaryKeySelective(Consumptionrecord record);

    int updateByPrimaryKey(Consumptionrecord record);
}