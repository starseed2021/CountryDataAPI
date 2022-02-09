package countryDataAPI;

public class CountryDataAPISvc {

    public static void main(String[] args) {
        RouteHandler getCountryDataHandler = new GetCountryDataHandler();
        getCountryDataHandler.handleIndividualRequest();
        System.out.println("this class will eventually run the service.  maybe using TomCat");
    }
}
