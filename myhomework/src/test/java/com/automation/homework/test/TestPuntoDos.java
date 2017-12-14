package com.automation.homework.test;

import org.testng.annotations.Test;

import com.automation.homework.pages.CarDetailPage;
import com.automation.homework.pages.CarPage;
import com.automation.homework.pages.FirstRoomDetailPage;
import com.automation.homework.pages.FirstRoomPage;
import com.automation.homework.pages.FlightPlusHotelDetailsPage;
import com.automation.homework.pages.FlightPlusHotelSearchHomePage;
import com.automation.homework.pages.FlightPlusHotelSearchResultsPage;

import junit.framework.Assert;

public class TestPuntoDos extends BaseTest {
	@Test
	public void testFlightPlusHotelResultsPage(){
		
		FlightPlusHotelSearchHomePage home=getHomePage2();
		if(home!=null){
		FlightPlusHotelSearchResultsPage results=home.buscar();
		if(results!=null){
		FlightPlusHotelDetailsPage details=results.ordenar();
		if(details!=null){
		FirstRoomPage room=details.pieza();
		if(room!=null){
		FirstRoomDetailPage roomDetail=room.seleccionar();
		if(roomDetail!=null){
		CarPage car=roomDetail.seleccionar();
		if(car!=null){
		CarDetailPage det=car.detalle();
		if(det!=null){
		Assert.assertNotNull("Search Results: Null", results);
		Assert.assertNotNull("Fake Origin: Null"+results.getFakeLinkOrigin());
		Assert.assertNotNull("Fake Destiny: Null"+results.getFakeLinkDestiny());
		Assert.assertNotNull("Fake Link Dates: Null"+results.getFakeLinkDates());
		Assert.assertNotNull("Fake rooms label: Null"+results.getRoomsLabel());
		Assert.assertNotNull("Travelers label: Null"+results.getTravelersLabel());
		Assert.assertNotNull("Details: Null",details);		
		Assert.assertEquals(results.getHotelName(), details.getHotelName());		
		Assert.assertNotNull("Room: Empty",room);		
		Assert.assertNotNull("Detail: Null",det);
		Assert.assertNotNull("Price: Null",det.getPrice());
		}
		}
		}
		}
		}
		}
		}
	
	}

}
