package com.lsg.community.provider;

import com.lsg.community.dto.AccessTokenDTO;
import com.lsg.community.dto.GithubUser;
import okhttp3.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * 描述
 *
 * @outhor 李曙光
 * @time 2019-08-30  22:33
 */
@Component
public class GithubProvider {
    public  String getAccessToken(AccessTokenDTO accessTokenDTO){
         MediaType mediaType = MediaType.get("application/json; charset=utf-8");
        OkHttpClient client = new OkHttpClient();

        RequestBody body = RequestBody.create(mediaType, com.alibaba.fastjson.JSON.toJSONString(accessTokenDTO));
        Request request = new Request.Builder()
                .url("https://github.com/login/oauth/access_token")
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            String string =response.body().string();
            String token = string.split("&")[0].split("=")[1];
            return token;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public GithubUser getuser(String accessToken){
        OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url("https://api.github.com/user?access_token="+accessToken)
                    .build();
        try {
            Response response = client.newCall(request).execute();
            String string =response.body().string();
            GithubUser githubUser = com.alibaba.fastjson.JSON.parseObject(string, GithubUser.class);
            return  githubUser;
        } catch (IOException e) {
        }
           return null;
    }
}
