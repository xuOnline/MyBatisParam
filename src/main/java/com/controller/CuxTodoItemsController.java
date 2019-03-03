package com.controller;

import com.model.CuxTodoItems;
import com.service.CuxTodoItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("cuxTodoItems")
@ResponseBody
public class CuxTodoItemsController {
    @Autowired
    private CuxTodoItemsService service;

    @RequestMapping("query1")
    public List<CuxTodoItems> query1() {
        return service.query1();
    }

    @RequestMapping("query2")
    public List<CuxTodoItems> query2() {
        return service.query2();
    }

    @RequestMapping("query3")
    public List<CuxTodoItems> query3() {
        return service.query3();
    }

    @RequestMapping("query4")
    public List<CuxTodoItems> query4() {
        return service.query4();
    }

    @RequestMapping("query5")
    public List<CuxTodoItems> query5() {
        return service.query5();
    }

    @RequestMapping("query6")
    public List<CuxTodoItems> query6() {
        return service.query6();
    }

    @RequestMapping("query7")
    public List<CuxTodoItems> query7() {
        return service.query7();
    }


}