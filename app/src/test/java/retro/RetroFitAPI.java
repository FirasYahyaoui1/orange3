package retro;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFitAPI {
    public static Retrofit getRetrofit(String Url){
        Gson gson=new GsonBuilder().setLenient().create();
        return new Retrofit.Builder()
                .baseUrl(Url)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }
}
