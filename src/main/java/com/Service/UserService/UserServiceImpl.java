package com.Service.UserService;

import com.Controller.userController.entity.UserPasswordBean;
import com.ORM.mapper.userMapper.TblUserMapper;
import com.ORM.model.userModel.TblUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private TblUserMapper tblUserMapper;

    @Override
    public TblUser getUserInfo(Integer userId) {
        TblUser userBean = new TblUser();
        userBean = tblUserMapper.selectByPrimaryKey(userId);
        return userBean;
    }

    @Override
    public Integer isLogin(TblUser tblUser) {
        Integer flag = 0;
        TblUser userBean = new TblUser();
        userBean = tblUserMapper.selectByUserName(tblUser.getUserName());
        if(userBean != null && tblUser.getPassword().equals(userBean.getPassword()))
        {
            flag = 1;
            return flag;
        }else {
            return flag;
        }
    }

    @Override
    public List<TblUser> getUserList() {
        List<TblUser> userList = tblUserMapper.selectAll();
        List<TblUser> user = new ArrayList<>();
        for (TblUser tblUser : userList) {
            if (2 == tblUser.getRoleId())
            {
                user.add(tblUser);
            }
        }
        userList.removeAll(user);
        return userList;
    }

    @Override
    public TblUser getUserInfoByName(String userName) {
        TblUser userBean = tblUserMapper.selectByUserName(userName);
        return userBean;
    }

    @Override
    public Integer addUser(TblUser tblUser) {
        Integer flag = tblUserMapper.insert(tblUser);
        return flag;
    }

    @Override
    public Integer modifyUser(TblUser tblUser) {
        Integer flag = tblUserMapper.updateByPrimaryKey(tblUser);
        return flag;
    }

    @Override
    public Integer deleteUser(Integer userId) {
        Integer flag = tblUserMapper.deleteByPrimaryKey(userId);
        return flag;
    }

    @Override
    public Integer modifyPIN(UserPasswordBean userPasswordBean) {
        Integer flag = 0;
        //获取被修改的用户信息
        TblUser tblUser = tblUserMapper.selectByPrimaryKey(userPasswordBean.getUserId());
        if (tblUser.getPassword().equals(userPasswordBean.getOldPassword()))
        {
            tblUser.setPassword(userPasswordBean.getNewPassword());
            //旧密码与输入的一样
            flag = tblUserMapper.updateByPrimaryKey(tblUser);
        }
        return flag;
    }

    @Override
    public List<TblUser> findAcademyUserList(Integer academyId) {
        List<TblUser> userList = tblUserMapper.selectByAcademyId(academyId);
        return userList;
    }
}
