package com.Controller.userController;

import com.Controller.entity.Result;
import com.Controller.userController.entity.UserPasswordBean;
import com.ORM.model.userModel.TblUser;
import com.Service.UserService.UserService;
import com.Util.Constants;
import com.Util.VerifyCodeUtil;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;


/**
 * author 07087 uniview.co
 * description user info controller
 * time 2020.03.07
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getCaptcha")
    public void getCaptcha(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //设置页面不缓存
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        String verifyCode = VerifyCodeUtil.generateTextCode(VerifyCodeUtil.TYPE_ALL_MIXED, 4, null);
        //将验证码放到HttpSession里面
        request.getSession().setAttribute(Constants.VALIDATE_CODE, verifyCode);
        //设置输出的内容的类型为JPEG图像
        response.setContentType("image/jpeg");
        BufferedImage bufferedImage = VerifyCodeUtil.generateImageCode(verifyCode, 116, 36, 5, true, new Color(249, 205, 173), null, null);
        //写给浏览器
        //ImageIO.write(bufferedImage, "JPEG", response.getOutputStream());
        JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(response.getOutputStream());
        encoder.encode(bufferedImage);
    }

    /**
     * 登陆
     * @param userName
     * @param password
     * @return
     */

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<Result> login(HttpServletRequest request, @RequestParam String userName, @RequestParam String password, @RequestParam String captcha)
    {

        TblUser user = new TblUser();
        user.setUserName(userName);
        user.setPassword(password);
        Integer flag = userService.isLogin(user);
        HttpSession session = request.getSession();

        String trueCaptcha = (String) session.getAttribute(Constants.VALIDATE_CODE);
        if (0 == flag)
        {
            Result result = new Result("用户名或密码错误，登陆失败！",201,null,0);
            return ResponseEntity.ok(result);
        }

        else if(trueCaptcha == null){
            Result result = new Result("session超时",201,null,0);
            return ResponseEntity.ok(result);
        }
        else if(null == session){
            Result result = new Result("验证码超时",201,null,0);
            return ResponseEntity.ok(result);
        }
        else if(!trueCaptcha.toLowerCase().equals(captcha.toLowerCase())){
            Result result = new Result("验证码错误",201,null,0);
            return ResponseEntity.ok(result);
        }
        else
        {
            TblUser currentUser = userService.getUserInfoByName(userName);
            Result result = new Result("登陆成功！",200,currentUser,1);
            return ResponseEntity.ok(result);
        }
    }

    /**
     * 根据id查询用户信息
     * @return UserBean 用户信息对象
     */
    @RequestMapping(value = "/findUserInfo", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<Result> getUserInfo(@RequestParam Integer userId)
    {
        TblUser tblUser = new TblUser();
        tblUser = userService.getUserInfo(userId);
        if (null != tblUser)
        {
            Result result = new Result("用户信息查询完成！",200,tblUser,1);
            return ResponseEntity.ok(result);
        }else
        {
            Result result = new Result("用户信息查询失败！",201,null,0);
            return ResponseEntity.ok(result);
        }
    }

    /**
     * 查询全部用户信息
     */
    @RequestMapping(value = "/findUserList", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<Result> getUserList()
    {
        List<TblUser> userList = userService.getUserList();
        if (0 != userList.size())
        {
            Result result = new Result("用户信息列表查询完成！",0,userList,userList.size());
            return ResponseEntity.ok(result);
        }else
        {
            Result result = new Result("用户信息列表无数据！",0,null,0);
            return ResponseEntity.ok(result);
        }
    }

    /**
     * 根据用户名查询用户信息
     */
    @RequestMapping(value = "/findUserInfoByName", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<Result> getUserInfoByName(@RequestParam String userName)
    {
        TblUser tblUser = userService.getUserInfoByName(userName);
        if (null != tblUser)
        {
            Result result = new Result("用户信息查询完成！",200,tblUser,1);
            return ResponseEntity.ok(result);
        }else
        {
            Result result = new Result("用户信息查询失败！",201,null,0);
            return ResponseEntity.ok(result);
        }
    }

    /**
     * 添加用户
     */
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<Result> addUser(@RequestBody TblUser tblUser)
    {
        TblUser tblUserTmp = userService.getUserInfoByName(tblUser.getUserName());
        if (null != tblUserTmp)
        {
            //数据库已有此用户
            Result result = new Result("用户已存在！",201,null,0);
            return ResponseEntity.ok(result);
        }else
        {
            Integer flag = userService.addUser(tblUser);
            if (0 != flag)
            {
                Result result = new Result("用户添加成功！",200,null,0);
                return ResponseEntity.ok(result);
            }else
            {
                Result result = new Result("用户添加失败,请检查格式！",201,null,0);
                return ResponseEntity.ok(result);
            }
        }
    }

    /**
     * 修改用户
     */
    @RequestMapping(value = "/modifyUser", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<Result> modifyUser(@RequestBody TblUser tblUser)
    {
        Integer flag = userService.modifyUser(tblUser);
        if (0 != flag)
        {
            Result result = new Result("用户修改成功！",200,null,0);
            return ResponseEntity.ok(result);
        }else
        {
            Result result = new Result("用户修改失败,请检查格式！",201,null,0);
            return ResponseEntity.ok(result);
        }
    }

    /**
     * 删除用户
     */
    @RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<Result> deleteUser(@RequestParam Integer userId)
    {
        Integer flag = userService.deleteUser(userId);
        if (0 != flag)
        {
            Result result = new Result("用户删除成功！",200,null,0);
            return ResponseEntity.ok(result);
        }else
        {
            Result result = new Result("用户删除失败！",201,null,0);
            return ResponseEntity.ok(result);
        }
    }
    /**
     * 修改密码
     */
    @RequestMapping(value = "/modifyPIN", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<Result> modifyPIN(@RequestBody UserPasswordBean userPasswordBean)
    {
        Integer flag = userService.modifyPIN(userPasswordBean);
        if (0 != flag)
        {
            Result result = new Result("密码修改成功",200,null,0);
            return ResponseEntity.ok(result);
        }else
        {
            Result result = new Result("原密码不正确！",201,null,0);
            return ResponseEntity.ok(result);
        }
    }

    /**
     * 查询院系人员
     */
    @RequestMapping(value = "/findAcademyUserList", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<Result> findAcademyUserList(@RequestParam Integer academyId)
    {
        List<TblUser> userList = userService.findAcademyUserList(academyId);
        if (!userList.isEmpty())
        {
            Result result = new Result("查询成功",0, userList,userList.size());
            return ResponseEntity.ok(result);
        }else
        {
            Result result = new Result("查询失败！",201,null,0);
            return ResponseEntity.ok(result);
        }
    }

}
