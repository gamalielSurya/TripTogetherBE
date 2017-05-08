package com.gamaliel.surya.rest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gamaliel.surya.model.City;
import com.gamaliel.surya.model.TripDestination;
import com.gamaliel.surya.model.TripPlan;
import com.gamaliel.surya.repository.CityRepository;
import com.gamaliel.surya.repository.TripDestinationRepository;
import com.gamaliel.surya.repository.TripPlanRepository;

@RestController
public class RestServiceController {

	//++++++++++++++++++++++++++++ TRIP PLAN +++++++++++++++++++++++++++++
	@Autowired
	TripPlanRepository tripPlanRepo;
	TripPlan myTripPlan;
	//=====READ
	@RequestMapping("readalltripplan")
	@ResponseBody
	public String readAllTripPlan() {
		String output = "";
		try {
			List<TripPlan> myList = (List<TripPlan>)tripPlanRepo.findAll();
			for(TripPlan tp : myList) {
				output = tp.toString();
				output+="\n\n";
			}
		} catch (Exception e) {
			return "Error : " + e.getMessage();
		}
		
		return output;
	}
	//=====READ_ONE
	@RequestMapping("readonetripplan")
	@ResponseBody
	public String readOneTripPlan(int id) {
		try{
			myTripPlan = tripPlanRepo.findOne(id);
		} catch (Exception e) {
			return "Error : " + e.getMessage(); 
		}
		
		return myTripPlan.toString();
	}
	//=====CREATE
	@RequestMapping("createtripplan")
	@ResponseBody
	public String createTripPlan(
			String title, String startDate, String finishDate,
			Integer minBudget, Integer maxBudget, Integer creatorId,
			String itinerary, String link, boolean smoking,
			boolean alcohol, boolean pet) throws Exception {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date dateStart;
		Date dateFinish;
		try{
			dateStart = formatter.parse(startDate);
			dateFinish = formatter.parse(finishDate);
		} catch (Exception e) {
			return "Error. "+ e.getMessage();
		}
		
		TripPlan myTripPlan = new TripPlan(
				title, dateStart, dateFinish,
				minBudget, maxBudget, creatorId,
				itinerary, link, smoking,
				alcohol, pet
				);
		try{
			tripPlanRepo.save(myTripPlan);	
		} catch (Exception e) {
			return e.getMessage();
		}
		return "Create trip plan success.\n";
	}
	//=====UPDATE
	@RequestMapping("updatetripplan")
	@ResponseBody
	public String updatetripplan(int id, 
			String title, String startDate, String finishDate,
			Integer minBudget, Integer maxBudget, Integer creatorId,
			String itinerary, String link, boolean smoking,
			boolean alcohol, boolean pet) throws Exception {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date dateStart;
		Date dateFinish;
		try{
			dateStart = formatter.parse(startDate);
			dateFinish = formatter.parse(finishDate);
		} catch (Exception e) {
			return "Error : "+ e.getMessage();
		}
		
		try{
			myTripPlan = tripPlanRepo.findOne(id);
			myTripPlan.setTitle(title);
			myTripPlan.setStart_date(dateStart);
			myTripPlan.setFinish_date(dateFinish);
			myTripPlan.setMin_budget(minBudget);
			myTripPlan.setMax_budget(maxBudget);
			myTripPlan.setCreator_id(creatorId);
			myTripPlan.setItinerary(itinerary);
			myTripPlan.setLink(link);
			myTripPlan.setSmoking(smoking);
			myTripPlan.setAlcohol(alcohol);
			myTripPlan.setPet(pet);
		} catch (Exception e) {
			return "Error : " + e.getMessage();
		}
		
		try {
			tripPlanRepo.save(myTripPlan);
		} catch (Exception e) {
			return e.getMessage();
		}
		
		return "Update success";
	}
	//=====DELETE
	@RequestMapping("deletetripplan")
	@ResponseBody
	public String deleteTripPlan(int id) {
		try {
			tripPlanRepo.delete(id);
		} catch (Exception e) {
			return e.getMessage();
		}
		return "Delete success";
	}
	
	
	//++++++++++++++++++++++++++++ TRIP DESTINATION +++++++++++++++++++++++++++++
	@Autowired
	TripDestinationRepository tripDestRepo;
	List<TripDestination> myDest;
	
	@Autowired
	CityRepository cityRepo;
	City myCity;
	
	//=====READ
	@RequestMapping("readDestination")
	@ResponseBody
	public String readDestination(int id) {
		String output = "";
		try {
			myDest = tripDestRepo.findByTpId(id);
			for(TripDestination td : myDest) {
				myCity = cityRepo.findOne(td.getTpId());
				output = myCity.getName();
				output+="\n";
			}
		} catch (Exception e) {
			return "Error : " + e.getMessage();
		}
		return output;
	}
	
	//Trip Activity
	
	
	
}
