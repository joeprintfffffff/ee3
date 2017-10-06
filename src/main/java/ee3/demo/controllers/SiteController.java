package ee3.demo.controllers;

import ee3.demo.models.User;
import ee3.demo.models.UserMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SiteController {

    @Autowired
    ee3.demo.repositories.mysql.UserRepository userRepository;

    @Autowired
    ee3.demo.repositories.mongodb.UserRepository userRepository1;

    @RequestMapping("/add")
    public @ResponseBody String add(String name){
        userRepository.save(new User(name));
        return "new record with name"+name+" added";
    }

    @RequestMapping("/edit")
    public @ResponseBody String add(String oldName,String newName){
        User user = userRepository.findByName(oldName);
        user.setName(newName);
        userRepository.save(user);
        return "OK";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }

    @GetMapping(path="/")
    public @ResponseBody String index() {
        // This returns a JSON or XML with the users
        return userRepository.getClass().toString();
    }

    @GetMapping(path="/all-mongo")
    public @ResponseBody Iterable<UserMongo> getAllUsersMysql() {
        // This returns a JSON or XML with the users
        return userRepository1.findAll();
    }
}
