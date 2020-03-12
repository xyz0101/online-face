package com.jenkin.onlineface.users.controller;


import com.jenkin.onlineface.users.entity.UserQuestions;
import com.jenkin.onlineface.users.entity.vos.UserQuestionsVO;
import com.jenkin.onlineface.users.service.UserQuestionsService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jenkin
 * @since 2020-03-12
 */
@RestController
@RequestMapping("/users/user-questions")
@Api(tags = "用户收藏或拉黑的题目")
public class UserQuestionsController {

    @Autowired
    private UserQuestionsService userQuestionsService;
    @GetMapping("/listUserQuestions")
    public List<UserQuestionsVO> listUserQuestions(){
       return  userQuestionsService.listUserQuestions();
    }
    @GetMapping("/listAll")
    public List<UserQuestions> listAll(){
        return  userQuestionsService.list();
    }
    @GetMapping("/listByParam")
    public List<UserQuestionsVO> listAll(String uid,String title){
        return  userQuestionsService.listUserQuestionsByTitle(uid,title);
    }
}

