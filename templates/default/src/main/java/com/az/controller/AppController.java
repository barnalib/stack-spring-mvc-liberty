package com.az.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.RequestMethod;    
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;    

import com.az.model.User;
import com.az.service.UserService;

import lombok.extern.java.Log;

@Log
@Controller
public class AppController {

	@Autowired
	private UserService userService;
	
	@Value("${homePage.welcomeMsg}")
	private String welcomeMessage;
	
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		log.info("welcome second Method Call");
		model.put("message",this.welcomeMessage);
		return "home";
	}
	
	// Just for testing purpose
	@RequestMapping("/Az")
	public String viewUser(ModelMap model) {
		log.info("welcome second Method Call");
		model.put("message", this.welcomeMessage);
		log.info("welcome second Method End");
		return "home";
	}
        // Just for testing purpose
	@RequestMapping("/usr")
	public String view(ModelMap model) {
		log.info("welcome third Method Call");
		model.put("message", this.welcomeMessage);
		log.info("welcome second Method End");
		return "home";
	}
 
       @RequestMapping(value="/save",method = RequestMethod.POST)    
       public String save(@ModelAttribute("user") User user){    
          userService.save(user);    
          return "redirect:/usr";//will redirect to view user
       }  
    @RequestMapping("/add")    
    public String showform(Model m){    
        m.addAttribute("command", new User());  
        return "add";   
    } 
    @RequestMapping(value="/deleteuser/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable long id){    
        userService.delete(id);    
        return "redirect:/usr";    
    }     
	
	@ModelAttribute("userList")
	public List<User> fetchAllUsers(){
		return userService.getAllUsers();
	}
}
