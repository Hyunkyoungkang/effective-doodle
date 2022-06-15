package com.example.retrofittest;

import android.content.Context;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class railroadView {


    private ArrayList<Raindata> RaindataList;
    private RetrofitAPI retrofitAPI;
    private Matadate matadate; //
    private Context mContext; // 메인액티비티 정보
    private int Page;
    private int PerPage;
    public railroadView(Context context, int Page, int PerPage) {
        this.mContext = context;
        this.Page = Page;
        this.PerPage = PerPage;
    }
    public void loadData(){ // 통신 및 데이터 저장
        RetrofitClient retrofitClient = RetrofitClient.GetInstance();
        if(retrofitClient != null){
            retrofitAPI = RetrofitClient.getRetrofitAPI();
            retrofitAPI.Getdata(Page,PerPage,mContext.getResources().getString(R.string.Key)).enqueue(new Callback<Matadate>() {
                @Override
                public void onResponse(Call<Matadate> call, Response<Matadate> response) {
                    if(response.isSuccessful()){
                        matadate = response.body();
                        RaindataList = matadate.getData();
                        for (int i = 0 ; i < RaindataList.size() ; i++){
                           Log.d("받은값",RaindataList.get(i).toString());
                        }
                        ((MainActivity) mContext).dataview.setText(RaindataList.toString());
                    }
                }
                @Override
                public void onFailure(Call<Matadate> call, Throwable t) {

                }
            });
        }
    }
}
