package com.automation.homework.test;

import org.openqa.selenium.NoSuchElementException;
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
		Assert.assertNotNull("Search Results: Null", results);
		Assert.assertNotNull("Fake Origin: Null"+results.getFakeLinkOrigin());
		Assert.assertNotNull("Fake Destiny: Null"+results.getFakeLinkDestiny());
		Assert.assertNotNull("Fake Link Dates: Null"+results.getFakeLinkDates());
		Assert.assertNotNull("Fake rooms label: Null"+results.getRoomsLabel());
		Assert.assertNotNull("Travelers label: Null"+results.getTravelersLabel());
		FlightPlusHotelDetailsPage details=results.ordenar();
		Assert.assertNotNull("Details: Null",details);	
		Assert.assertEquals(results.getHotelName(), details.getHotelName());
		FirstRoomPage room=details.pieza();
		Assert.assertNotNull("Room: Empty",room);
		FirstRoomDetailPage roomDetail=room.seleccionar();
		CarPage car=roomDetail.seleccionar();
		CarDetailPage det=car.detalle();
		Assert.assertEquals("$32", det.getPrice().getText());
		}
		}
		
	}

}
