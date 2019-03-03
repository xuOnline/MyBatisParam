package com.service;

import com.dao.TestCuxTodoItemsMapper;
import com.model.CuxTodoItems;
import com.model.CuxUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuxTodoItemsService {
    @Autowired
    private TestCuxTodoItemsMapper todoItemsMapper;

    public List<CuxTodoItems> query1() {
        return todoItemsMapper.selectItembyparam1(1,"medium");
    }

    public List<CuxTodoItems>  query2() {

        CuxTodoItems items = new CuxTodoItems();
        items.setUserId(1);
        items.setPriority("low");
        List<CuxTodoItems> itemsList = todoItemsMapper.selectItembyparam2(items);
        return itemsList;
    }

    public List<CuxTodoItems> query3() {
        CuxTodoItems items = new CuxTodoItems();
        items.setPriority("high");
        CuxUsers users = new CuxUsers();
        users.setUserId(2);
        List<CuxTodoItems> itemsList = todoItemsMapper.selectItembyparam3(items,users);
        return itemsList;
    }

    public List<CuxTodoItems> query4() {
        return todoItemsMapper.selectItembyparam4(2);
    }

    public List<CuxTodoItems> query5() {
        List<CuxTodoItems> itemsList = todoItemsMapper.selectItembyparam5(1,"high");
        return itemsList;
    }

    public List<CuxTodoItems> query6() {
        CuxTodoItems items = new CuxTodoItems();
        items.setUserId(2);
        items.setPriority("high");
        List<CuxTodoItems> itemsList = todoItemsMapper.selectItembyparam6(items);
        return itemsList;
    }
    public List<CuxTodoItems> query7(){
        CuxTodoItems items = new CuxTodoItems();
        items.setPriority("medium");
        CuxUsers users = new CuxUsers();
        users.setUserId(1);
        List<CuxTodoItems> itemsList = todoItemsMapper.selectItembyparam7(items,users);
        return itemsList;
    }


}
