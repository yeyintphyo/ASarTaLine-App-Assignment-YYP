package com.padcmyanmar.asartaline_app_assignment_yyp.data.vos;

import com.google.gson.annotations.SerializedName;

public class ShopByDistance {

    @SerializedName("shopByDistanceId")
    private String shopByDistanceId;

    @SerializedName("mealShop")
    private String mealShopId;

    @SerializedName("distanceInFeet")
    private String distanceInFeet;

    public String getShopByDistanceId() {
        return shopByDistanceId;
    }

    public String getMealShopId() {
        return mealShopId;
    }

    public String getDistanceInFeet() {
        return distanceInFeet;
    }
}
