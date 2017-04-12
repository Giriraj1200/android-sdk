package com.loginradius.androidsdk.api;


import com.loginradius.androidsdk.handler.AsyncHandler;
import com.loginradius.androidsdk.handler.JsonDeserializer;
import com.loginradius.androidsdk.handler.RestRequest;
import com.loginradius.androidsdk.resource.Endpoint;

import com.loginradius.androidsdk.response.customobject.ReadCustomObject;
import com.loginradius.androidsdk.response.login.LoginParams;
import com.loginradius.androidsdk.response.lrAccessToken;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by loginradius on 23-Nov-16.
 */

public class ReadCustomObjectbyTokenAPI {


    public void getResponse(LoginParams value, lrAccessToken token,final AsyncHandler<ReadCustomObject> handler)
    {
        HashMap<String,String> params = new LinkedHashMap<>();
        params.put("apikey", value.apikey);
        params.put("access_token",token.access_token);
        params.put("objectname",value.objectname);




        RestRequest.get(Endpoint.getCustomObjectUrl(),params,new AsyncHandler<String>()
        {
            @Override
            public void onSuccess(String response) {

                ReadCustomObject readCustomObject = JsonDeserializer.deserializeJson(response,ReadCustomObject.class);
                handler.onSuccess(readCustomObject);
            }

            @Override
            public void onFailure(Throwable error, String response) {
                handler.onFailure(error, response);
            }
        });
    }
}
