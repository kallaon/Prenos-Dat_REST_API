package com.rest.jezik;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class User {

    @SerializedName("data")
    @Expose
    public Data data;

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("data", data).toString();
    }

}