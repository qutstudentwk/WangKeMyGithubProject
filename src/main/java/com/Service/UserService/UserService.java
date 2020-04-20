package com.Service.UserService;

import com.Controller.userController.entity.UserPasswordBean;
import com.ORM.model.userModel.TblUser;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;

/**
 * author 07087 uniview.co
 * description userService
 */
public interface UserService {

    /**
     * 根据id查询用户信息
     * @param userId 用户id
     * @return UserBean
     */
    TblUser getUserInfo(Integer userId);

    /**
     * 登陆
     * @param tblUser 用户信息
     * @return 登陆成功与否
     */
    Integer isLogin(TblUser tblUser);

    /**
     * 根据用户名查询用户信息
     * @param userName 用户名
     * @return UserBean
     */
    TblUser getUserInfoByName(String userName);

    /**
     * 查询角色列表
     */
    List<TblUser> getUserList();

    /**
     * 添加用户
     */
    Integer addUser(TblUser tblUser);

    /**
     * 修改用户
     */
    Integer modifyUser(TblUser tblUser);

    /**
     * 删除用户
     */
    Integer deleteUser(Integer userId);

    /**
     * 修改密码
     */
    Integer modifyPIN(UserPasswordBean userPasswordBean);

    /**
     * 查询院系人员信息
     */
    List<TblUser> findAcademyUserList(Integer academyId);

}
