package com.automation.homework.test;

import org.testng.annotations.Test;

import com.automation.homework.pages.FlightBookingDetailsPage;
import com.automation.homework.pages.FlightInformationPage;
import com.automation.homework.pages.FlightSearchHomePage;
import com.automation.homework.pages.FlightSearchResultsPage;
import com.automation.homework.pages.FlightSelectedObjectPage;

import junit.framework.Assert;

public class TestPuntoUno extends BaseTest {
	
	@Test
	public void testFlightSearchResultsPage(){
		FlightSearchHomePage home = getHomePage();
		if(home!=null){		
		FlightSearchResultsPage results = home.buscar();
		if(results!=null){
		results.orderingByShortestDuration();
		FlightSelectedObjectPage selected=results.buscar();
		if(selected!=null){
		FlightInformationPage information=selected.seleccionar();
		if(information!=null){
		FlightBookingDetailsPage bookingDetails=information.open();
		if(bookingDetails!=null){
		bookingDetails.activateValidations();
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
		Assert.assertTrue("Duration Ordered: False", results.ShortestDurationIsOrdered());
		Assert.assertNotNull("Selected: Null", selected);
		Assert.assertNotNull("Information Page: Null",information);
		Assert.assertNotNull("Trip Total Price: Null", information.getTripTotalPrice());
		Assert.assertNotNull("Price guarantee: Null",information.getPriceGuarantee());
		Assert.assertNotNull("Departure Date: Null",information.getDepartureDate());
		Assert.assertNotNull("Departure Origin: Null",information.getDepartureFromPlace());
		Assert.assertNotNull("Departure Destiny: Null",information.getDepartureToPlace());
		Assert.assertNotNull("Departure Start Hour: Null",information.getDepartureStartHour());
		Assert.assertNotNull("Departure Arriving Hour: Null",information.getDepartureArrivingHour());
		Assert.assertNotNull("Departure Duration Trip: Null",information.getDepartureDurationTrip());
		Assert.assertNotNull("Return Date: Null",information.getReturnDate());
		Assert.assertNotNull("Return Origin: Null",information.getReturnFromPlace());
		Assert.assertNotNull("Return Destiny: Null",information.getReturnToPlace());
		Assert.assertNotNull("Return Start Hour: Null",information.getReturnStartHour());
		Assert.assertNotNull("Return Arriving Hour: Null",information.getReturnArrivingHour());
		Assert.assertNotNull("Return Duration Trip: Null",information.getReturnDurationTrip());
		Assert.assertTrue("First Name Validation: Validation absent",bookingDetails.isValidatedFirstName());
		Assert.assertTrue("Last Name Validation: Validation absent",bookingDetails.isValidatedLastName());
		Assert.assertTrue("Phone Number Validation: Validation absent",bookingDetails.isValidatedPhoneNumber());
		Assert.assertTrue("Card Holder Name Validation: Validation absent",bookingDetails.isValidatedCardHolderName());
		Assert.assertTrue("Credit Card Validation: Validation absent",bookingDetails.isValidatedCreditCard());
		}
		}
		}
		}
		}
	}
	
	
		
		
		
	

}
