package com.loginradius.androidsdk.response.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by loginradius on 10/23/2017.
 */

public class TwoFactorAuthentication {

    @SerializedName("IsEnabled")
    @Expose
    private Boolean isEnabled;
    @SerializedName("IsRequired")
    @Expose
    private Boolean isRequired;
    @SerializedName("IsGoogleAuthenticator")
    @Expose
    private Boolean isGoogleAuthenticator;

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Boolean getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    public Boolean getIsGoogleAuthenticator() {
        return isGoogleAuthenticator;
    }

    public void setIsGoogleAuthenticator(Boolean isGoogleAuthenticator) {
        this.isGoogleAuthenticator = isGoogleAuthenticator;
    }

}
