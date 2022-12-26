package JyotiProject;


public class MainClass {
	public static void main(String args[]) {
		HotelAvailability hotelClass = new HotelAvailability();
		hotelClass.OpenTheApplicationURL("Chrome");
		hotelClass.EnterDestination();
		hotelClass.SelectDates();
		hotelClass.SelectRoomandOccupancy();
		hotelClass.SearchRooms();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hotelClass.SortByRating();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hotelClass.ListofRentofHotels();
		hotelClass.DescendingOrderCheck();
		hotelClass.CloseBrowser();
	}

}
