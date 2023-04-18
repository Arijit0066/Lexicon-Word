package com.example.ixdict;

import com.example.ixdict.Models.ApiResponse;

public interface OnFetchDataListener {
    void onFetchData(ApiResponse apiResponse, String Message);
    void onError(String message);
}
