package com.gbi.alanpan.alanproject.dragrecyclerview.retrofit;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by alan.pan on 2016/11/1.
 */
public interface FileUploadService {

    // 上传单个文件
    @Multipart
    @POST("upload")
    Call<ResponseBody> uploadFile(
            @Part("description") RequestBody description,
            @Part("") MultipartBody.Part file);

    // 上传多个文件
    @Multipart
    @POST("upload")
    Call<ResponseBody> uploadMultipleFiles(
            @Part("description") RequestBody description,
            @Part("") MultipartBody.Part file1,
            @Part("") MultipartBody.Part file2);
}
