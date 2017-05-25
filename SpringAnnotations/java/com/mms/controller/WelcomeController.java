
package com.mms.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mms.dto.User;

@Controller
public class WelcomeController {
	
	/*@RequestMapping(value="/Welcome")
	public ModelAndView hello(){
		ModelAndView model=new ModelAndView("WelcomeForm");
		model.addObject("msg", "Spring MVC success");
		return model;
		}
		
		@RequestMapping(value="/Welcome/{user}/{city}")
		public ModelAndView helloagain(@PathVariable("user") String name,@PathVariable("city") String CityName){
			ModelAndView model=new ModelAndView("WelcomeForm");
			model.addObject("msg", "Welcome" +" "+ name +" "+ "from" +" "+CityName);
			return model;
		
	}*/
		
		/*@RequestMapping(value="/Success" ,method=RequestMethod.POST)
		public ModelAndView success(@RequestParam("user")String name,@RequestParam("city")String city){
			ModelAndView model=new ModelAndView("Success");
			model.addObject("msg", "Login Successful" +" "+ name +" "+ "from" +" "+ city);
			return model;
			}
		
		@RequestMapping(value="/Success1" ,method=RequestMethod.POST)
		public ModelAndView success(@RequestParam Map<String,String> reqPar){
			
			String name= reqPar.get("user");
			String city= reqPar.get("city");
			ModelAndView model=new ModelAndView("Success");
			model.addObject("msg", "Login Successful" +" "+ name +" "+ "from" +" "+ city);
			return model;
			}
			
	@RequestMapping(value="/Success2" ,method=RequestMethod.POST)
	public ModelAndView success(@ModelAttribute("user1")User user){
	ModelAndView model=new ModelAndView("Success");
	model.addObject("msg", "Login Successful");
	return model;
	}*/

	@RequestMapping(value="/login" ,method=RequestMethod.GET)
	public ModelAndView login(){
		ModelAndView model=new ModelAndView("WelcomeForm");
		model.addObject("msg", "Please enter details");
		return model;
		}
@InitBinder
	
	public void dateBinder(WebDataBinder binder)
	{
	  SimpleDateFormat format = new SimpleDateFormat("mm/dd/yyyy");
	  binder.registerCustomEditor(Date.class, "dob", new CustomDateEditor(format, false));
	  binder.registerCustomEditor(String.class, "user", new UserNameCustomEditor());
		
		
	}
	
	
	@RequestMapping(value="/Success3" ,method=RequestMethod.POST)
	public ModelAndView success(@Valid @ModelAttribute("user1")User user, BindingResult result)
	{
		if(result.hasErrors())
		{
		 ModelAndView model= new ModelAndView("WelcomeForm");
	     return model;
	}
		ModelAndView model=new ModelAndView("Success");
		model.addObject("msg", "Login Successful");
		return model;
	
}}