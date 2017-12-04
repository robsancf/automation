package com.automation.homework.test;

import org.testng.annotations.Test;

import com.automation.homework.pages.FlightSearchHomePage;
import com.automation.homework.pages.FlightSearchResultsPage;
import com.automation.homework.pages.FlightSelectedObjectPage;

import junit.framework.Assert;

public class TestPuntoUno extends BaseTest {
	
	@Test
	public void testFlightSearchResultsPage(){
		FlightSearchHomePage home = getHomePage();
		FlightSearchResultsPage results = home.buscar();
		Assert.assertNotNull("Ordering Combo: Null",results.getSortListBoxCombo());
		Assert.assertNotNull("Price (Lowest): Null",results.getLowestPriceSelectedValue());
		Assert.assertNotNull("Price (Highest): Null",results.getHighestPriceSelectedValue());
		Assert.assertNotNull("Duration (Shortest): Null)",results.getShortestDurationSelectedValue());
		Assert.assertNotNull("Duration (Longest): Nulll",results.getLongestDurationSelectedValue());
		Assert.assertNotNull("Departure (Earliest): Null",results.getDepartureEarliestSelectedValue());
		Assert.assertNotNull("Departure (Latest): Null",results.getDepartureLatestSelectedValue());
		Assert.assertNotNull("Arrival (Earliest): Null",results.getArrivalEarliestSelectedValue());
		Assert.assertNotNull("Arrival (Latest): Null", results.getArrivalLatestSelectedValue());
		Assert.assertNotNull("Select Buttons: Null", results.getSelectButtons());
		Assert.assertNotNull("Durations: Null", results.getFlightDurations());
		Assert.assertNotNull("Flight Details and Baggage Fees: Null",results.getFlightDetailsBaggageFees());
		results.orderingByShortestDuration();
		//Assert.assertTrue("Duration Ordered: False", results.ShortestDurationIsOrdered());
		FlightSelectedObjectPage selected=results.buscar();
		Assert.assertNotNull("Selected: Null", selected);
		Assert.assertFalse("There is a Popup: True",selected.closePopUp());
		
		
		
	}
	
	
		
		
		
	

}
