package com.example.retrofittest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static RetrofitClient instance = null;
    private static RetrofitAPI retrofitAPI;
    private final static String BASE_URL = "https://api.odcloud.kr/api/";
    private RetrofitClient(){
    /*
    생성자의 정의
    생성자는 클래스 이름과 같은 이름의 함수다.
    생성자는 void, int 등의 반환형이 선언돼 있지 않아서 리턴값이 없다.
    생성자는 중복정의될 수 있다.
    생성자는 객체를 초기화하는 작업만 하는 함수다.
    생성자를 정의하지 않으면 컴파일러가 알아서 디폴트 생성자를 만들어 사용한다.
    -생성자 사용법
    객체를 선언할 때 보통 이렇게 한다.
    클래스명 객체명 = new 클래스명(); = 보통 객체생성할떄 사용된다.(무의식적으로 사용하고있는셈)
    생성자에 값을 넣는다는것은 내가 생성자에게 내가 입력해준 값을 갖는 객체를 만든다는것이다.
    생성자을 쓸떄 보통 this라는 용어를 자주쓰는데 이건멀까??
    this = 객체(자기자신)을 참조한다
    public class Car{
        String name;
        public Car(String name){
        this.name(Car안에 변수지칭) = name(생성자에게 입력한 값);
        this의 의미는 Car 클래스안에 있는 변수를 지칭하는것.(즉 객체안 자기자신한테만 있는 변수을 가르키는것)
        }
     }
    */
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        retrofitAPI = retrofit.create(RetrofitAPI.class);
    }

    public static RetrofitClient GetInstance() {
        if(instance == null){
            instance = new RetrofitClient();
        }
        return instance;
    }

    public static RetrofitAPI getRetrofitAPI() {
        return retrofitAPI;
    }


}
