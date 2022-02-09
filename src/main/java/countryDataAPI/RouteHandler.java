package countryDataAPI;

public abstract class RouteHandler {
    //todo make this type paramaterized
    public void handleIndividualRequest() {
            //this method will be overwritten by children
    }

    public void handleBatchRequest() {
            //just calls handleIndividualRequest a bunch of times
    }


    //class to handle most of our buisness logic.
    // Will be used by the CountryDataAPISvc to direct routes
    // handles two routes: single request and batch request
    // will send routes to DAO
}
