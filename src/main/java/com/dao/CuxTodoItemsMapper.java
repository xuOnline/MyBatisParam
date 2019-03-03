package com.dao;

import com.model.CuxTodoItems;
import com.model.CuxTodoItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CuxTodoItemsMapper {
    long countByExample(CuxTodoItemsExample example);

    int deleteByExample(CuxTodoItemsExample example);

    int deleteByPrimaryKey(Integer todoItemId);

    int insert(CuxTodoItems record);

    int insertSelective(CuxTodoItems record);

    List<CuxTodoItems> selectByExample(CuxTodoItemsExample example);

    CuxTodoItems selectByPrimaryKey(Integer todoItemId);

    int updateByExampleSelective(@Param("record") CuxTodoItems record, @Param("example") CuxTodoItemsExample example);

    int updateByExample(@Param("record") CuxTodoItems record, @Param("example") CuxTodoItemsExample example);

    int updateByPrimaryKeySelective(CuxTodoItems record);

    int updateByPrimaryKey(CuxTodoItems record);
}