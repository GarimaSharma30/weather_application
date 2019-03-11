package com.weatherapp.rest;

import com.weatherapp.model.WeatherModel;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface IApiInterface {

    @POST(URLS.CURRENT)
    Call<ResponseBody> currentTemp(@Query(Params.KEY) String key, @Query("q") String place);

   /* @POST(URLS.REGISTER)
    Call<ResponseBody> register(@Body HashMap<String, String> data);

    @GET(URLS.DETAILS)
    Call<ResponseBody> details(@Header("Authorization") String token);*/

    /*@GET(URLS.GET_ALL_PRODUCTS)
    Call<Product> getProducts(@Header("Authorization") String token*//*, @Query(Params.TEMPLE_ID) String temple_id, @Query(Params.SEARCH) String search, @Query(Params.PAGE) String page*//*);

    @GET(URLS.GET_PRODUCT_BY_ID)
    Call<ProductDetail> getProductById(@Header("Authorization") String token, @Query(Params.ID) String id);

    @GET(URLS.GET_ALL_TEMPLES)
    Call<Temple> getTemples(@Header("Authorization") String token*//*, @Query(Params.TEMPLE_ID) String temple_id, @Query(Params.SEARCH) String search, @Query(Params.PAGE) String page*//*);
*/
   /* @GET(URLS.GET_TEMPLE_BY_ID)
    Call<ResponseBody> getTempleById(@Header("Authorization") String token, @Query(Params.TEMPLE_ID) String temple_id);

    @GET(URLS.GET_DARSHAN)
    Call<ResponseBody> getDarshan(@Header("Authorization") String token*//*, @Query(Params.TEMPLE_ID) String temple_id, @Query(Params.PAGE) String page*//*);

    @GET(URLS.GET_CART)
    Call<ResponseBody> getCart(@Header("Authorization") String token, @Query(Params.USER_ID) int user_id, @Query(Params.ORDER_NUMBER) String order_number);
*/
   /* Get Ordered Items (User):
    Endpoint:
            /api/getOrders

    Request Body/Parameters:
            1 .    *user_id: <int> //  Cart items of the User
            2 .    *status : “Ordered” // must be ‘Ordered’ (null) for Ordered items.


    Result Success:



Add to Cart :        [POST]
Endpoint:
    /api/addToCart

Request Body/Parameters :
user_id
product_id
Quantity ; //must be the increment/ decrement value (update ) or the actual value (first order)



    Result Success:
{
“success” : “_____________”
}

*/



}