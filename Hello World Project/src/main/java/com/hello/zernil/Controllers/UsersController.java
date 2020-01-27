package com.hello.zernil.Controllers;

import com.hello.zernil.Hibernate.UsersEntity;
import com.hello.zernil.Hibernate.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.List;


@Controller
@RequestMapping("/users/register")
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String viewRegistration(Map<String, Object> model){
        UsersEntity userForm = new UsersEntity();
        model.put("userForm", userForm);

        return "Registration";
}
    @RequestMapping(method = RequestMethod.POST)
    public String processRegistration(@ModelAttribute("userForm") UsersEntity user, Map<String, Object> model){
        user.setDate_created(LocalDateTime.now());
        usersRepository.save(user);
        return "Registered";
    }
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String findUsers(Map<String, Object> model) {
        UsersEntity userSearch = new UsersEntity();
        model.put("userSearch", userSearch);
        return "Users";
    }
    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public String getUserInfo(@ModelAttribute("userSearch") UsersEntity username, Map<String, Object> model){
        UsersEntity entity = usersRepository.findUsersEntityByUsername(username.getUsername());
        model.put("userSearch", entity);
        return "UserData";
    }

}
