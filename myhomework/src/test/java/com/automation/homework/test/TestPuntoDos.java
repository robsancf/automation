package com.automation.homework.test;

import org.testng.annotations.Test;

import com.automation.homework.pages.FlightPlusHotelDetailsPage;
import com.automation.homework.pages.FlightPlusHotelSearchHomePage;
import com.automation.homework.pages.FlightPlusHotelSearchResultsPage;

import junit.framework.Assert;

public class TestPuntoDos extends BaseTest {
	@Test
	public void testFlightPlusHotelResultsPage(){
		
		FlightPlusHotelSearchHomePage home=getHomePage2();
		FlightPlusHotelSearchResultsPage results=home.buscar();
		Assert.assertNotNull("Search Results: Null", results);
		Assert.assertNotNull("Fake Origin: Null"+results.getFakeLinkOrigin());
		Assert.assertNotNull("Fake Destiny: Null"+results.getFakeLinkDestiny());
		Assert.assertNotNull("Fake Link Dates: Null"+results.getFakeLinkDates());
		Assert.assertNotNull("Fake rooms label: Null"+results.getRoomsLabel());
		Assert.assertNotNull("Travelers label: Null"+results.getTravelersLabel());
		FlightPlusHotelDetailsPage details=results.ordenar();
		
	}

}
