package com.controller;

import com.model.CuxUsers;
import com.dao.TestCuxUsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by CodeX4J.
 */
@Controller
@RequestMapping("cuxUsers")
@ResponseBody
public class CuxUsersController {
    @Autowired
    private TestCuxUsersMapper usersMapper;

    @RequestMapping("query1")
    public List<CuxUsers> query1() {
        CuxUsers cuxUsers1 = new CuxUsers();
        cuxUsers1.setUserName("bb");
        List<CuxUsers> usersList = usersMapper.selectUserbyparam1(cuxUsers1);
        System.out.println(usersList);
        return usersList;
    }

    @RequestMapping("query2")
    public CuxUsers  query2(int id) {
        return new CuxUsers();
    }

    @RequestMapping("query3")
    public CuxUsers  query3() {
        return new CuxUsers();
    }

    @RequestMapping("query4")
    public CuxUsers query4() {
        return new CuxUsers();
    }
}