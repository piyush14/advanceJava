package com.spring.rest.SpringRest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/advertise")
public class AdvertiseController {
	static HashMap<Integer,Advertise> advHm=new HashMap<Integer,Advertise>();  
	//static List <Advertise> advList = new ArrayList<Advertise>();
	static int count;

	@RequestMapping(value = "/allcategory", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public Advertise getAllCategories(){
		Advertise a = new Advertise();
		
		List<String> myList = new ArrayList<String>();
		myList.add("electronics");
		myList.add("home decor");
		a.setCategoryList(myList);
		
		return a;
	}
	
	@RequestMapping(value = "/postAd", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public HashMap<Integer, Advertise> postNewAdd(@RequestBody Advertise adv){
		
		
		Advertise advertise = new Advertise();
		advertise.setTitle( adv.getTitle());
		advertise.setName(adv.getName());
		advertise.setCategory(adv.getTitle());
		advertise.setDescription(adv.getDescription());
		advertise.setPhotoCount(adv.getPhotoCount());
		
		advHm.put(count++,advertise);
		//advList.add(advertise);
		return advHm;
	}
	
	
	@RequestMapping(value = "/actions", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public void returnAllActions(@RequestHeader("auth_token") String auth_token){
		if(auth_token.equals("ppp")){
			System.out.println("token matched");
		}
	}
	
	
	@RequestMapping(value = "/postAd/{id}", method = RequestMethod.PUT)
	public HashMap<Integer, Advertise> updateExistingAdd(@PathVariable (value="id")int id,@RequestBody Advertise adv ){
		advHm.replace(id, adv);
		//Iterator it = advList.iterator();
		System.out.println(id);
		
		return advHm;
		//return advList;
	}
	
	
	@RequestMapping(value = "/posts", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public Advertise allAdvertise(@RequestHeader("auth_token_posts") int auth_token_posts){
		return advHm.get(auth_token_posts);
		
	}
	
	@RequestMapping(value = "/post", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String deleteAdvertise(@RequestHeader("auth_token_delete") int auth_token_delete){
		advHm.remove(auth_token_delete);
		
		return "Advertisement deleted by user : "+auth_token_delete;
	}
}
