package com.dao;

import com.model.CuxUsers;
import com.model.CuxUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CuxUsersMapper {
    long countByExample(CuxUsersExample example);

    int deleteByExample(CuxUsersExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(CuxUsers record);

    int insertSelective(CuxUsers record);

    List<CuxUsers> selectByExample(CuxUsersExample example);

    CuxUsers selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") CuxUsers record, @Param("example") CuxUsersExample example);

    int updateByExample(@Param("record") CuxUsers record, @Param("example") CuxUsersExample example);

    int updateByPrimaryKeySelective(CuxUsers record);

    int updateByPrimaryKey(CuxUsers record);
}