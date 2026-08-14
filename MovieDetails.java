
public class MovieDetails {
	
	String movieName;
	int releasedYear;
	int ticketPrice;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MovieDetails M1  = new MovieDetails();
       M1.movieName="DEVARA";
       M1.releasedYear=2025;
       M1.ticketPrice=250;
       System.out.println("Movie 1 details");
       System.out.println("Movie Name:"+M1.movieName);
       System.out.println("Released Year:"+M1.releasedYear);
       System.out.println("Ticket Price:"+M1.ticketPrice);
       System.out.println("========================");
       MovieDetails M2  = new MovieDetails();
       M2.movieName="KALKI";
       M2.releasedYear=2024;
       M2.ticketPrice=300;
       System.out.println("Movie 2 details");
       System.out.println("Movie Name:"+M2.movieName);
       System.out.println("Released Year:"+M2.releasedYear);
       System.out.println("Ticket Price:"+M2.ticketPrice);
       
       System.out.println("========================");
       MovieDetails M3  = new MovieDetails();
       M3.movieName="DHURANDHAR";
       M3.releasedYear=2026;
       M3.ticketPrice=200;
       System.out.println("Movie 3 details");
       System.out.println("Movie Name:"+M3.movieName);
       System.out.println("Released Year:"+M3.releasedYear);
       System.out.println("Ticket Price:"+M3.ticketPrice);
       
       
       
	}

}
