package com.myweb.service.xnly.impl;

import com.myweb.dao.mybatis.MenuMapper;
import com.myweb.dao.mybatis.TableinfoMapper;
import com.myweb.dao.mybatis.UserMapper;
import com.myweb.pojo.mybatis.*;
import com.myweb.service.xnly.UserService;
import com.myweb.vo.Result;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("userService")
@Transactional(value = "myTM", readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MenuMapper menuMapper;

    @Autowired
    private TableinfoMapper tableinfoMapper;

    @Override
    public Result login(HttpSession session, String username, String password) {
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(username)
                .andPasswordEqualTo(password);
        List<User> userList = userMapper.selectByExample(example);
        Result result = new Result();
        if (userList.size() == 0) {
            result.setStatus(1);
            result.setMessage("用户名或密码错误，请重新检查您的输入！");
        } else if (userList.size() > 1) {
            result.setStatus(2);
            result.setMessage("有多个相同用户，请发送邮件到：331527770@qq.com联系管理员！");
        } else {
            result.setStatus(0);
            session.setAttribute("user", userList.get(0));
        }
        return result;
    }


    public Result logout(HttpSession session) {
        session.removeAttribute("user");
        return null;
    }

    @Override
    public Map<String, Object> getMyMenus(HttpSession session) {
        Map map = new HashMap<String, String>();
        MenuExample parent = new MenuExample();
        parent.setOrderByClause("shunxu");
        map.put("parent", menuMapper.selectByExample(parent));
        MenuExample children = new MenuExample();
        children.createCriteria().andParentNotEqualTo(0);
        children.setOrderByClause("shunxu");
        map.put("children", menuMapper.selectByExample(children));
        return map;
    }

    @Override
    public Map<String, Object> getUserMap(HttpSession session, Map<String, Object> map) {
        Menu profile = new Menu();
        profile.setName("个人信息");
        profile.setUrl("user/profile.do");
        map.put("profile", profile);
        Menu settings = new Menu();
        settings.setName("账号设置");
        settings.setUrl("user/settings.do");
        map.put("settings", settings);
        Menu logout = new Menu();
        logout.setName("退出登录");
        logout.setUrl("user/logout.do");
        map.put("logout", logout);
        return map;
    }

    @Override
    public Map<String, Object> getColumnsNameMap(HttpSession session, Map<String, Object> map, String tableName, String columns) {
        if (StringUtils.isNotBlank(columns)) {
            TableinfoExample tableinfoExample = new TableinfoExample();
            tableinfoExample.createCriteria().andTablenameEqualTo(tableName);
            tableinfoExample.setOrderByClause("shunxu");
            map.put(columns, tableinfoMapper.selectByExample(tableinfoExample));
        }
        return map;
    }

    @Override
    public Map<String, Object> getTitleMap(HttpSession session, String title, String tableTitle) {
        Map map = new HashMap<String, String>();
        map.put("title", title);
        map = this.getUserMap(session,map);
        map.put("tableName", tableTitle);
        return map;
    }
}
