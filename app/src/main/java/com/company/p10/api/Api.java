package com.company.p10.api;

import com.company.p10.model.ApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("sampleapi.json")
    Call<ApiResponse> buscar();
}
