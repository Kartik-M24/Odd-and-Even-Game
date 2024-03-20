package nz.ac.auckland.se281;

import nz.ac.auckland.se281.Types.CateringType;
import nz.ac.auckland.se281.Types.FloralType;

public class VenueHireSystem {
  private String venueName;
  private String venueCode;
  private Integer capacityInput;
  private Integer hireFeeInput;
  

  public VenueHireSystem() {}

  public void printVenues() {
    
  }

  public void createVenue(
      String venueName, String venueCode, String capacityInput, String hireFeeInput) {
        //Assign inputs to variables
        this.venueName = venueName;
        this.venueCode = venueCode;
        this.capacityInput = Integer.parseInt(capacityInput);
        this.hireFeeInput = Integer.parseInt(hireFeeInput);

        //Check if user inputs are valid
        if ((this.venueName.strip()).isEmpty() == true){
          MessageCli.VENUE_NOT_CREATED_EMPTY_NAME.printMessage();
        }
        if (this.capacityInput <= 0) {
          MessageCli.VENUE_NOT_CREATED_INVALID_NUMBER.printMessage("capacity", " positive");
        }




  }

  public void setSystemDate(String dateInput) {
    // TODO implement this method
  }

  public void printSystemDate() {
    // TODO implement this method
  }

  public void makeBooking(String[] options) {
    // TODO implement this method
  }

  public void printBookings(String venueCode) {
    // TODO implement this method
  }

  public void addCateringService(String bookingReference, CateringType cateringType) {
    // TODO implement this method
  }

  public void addServiceMusic(String bookingReference) {
    // TODO implement this method
  }

  public void addServiceFloral(String bookingReference, FloralType floralType) {
    // TODO implement this method
  }

  public void viewInvoice(String bookingReference) {
    // TODO implement this method
  }
}
