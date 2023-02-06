package com.shenyy.dp.adapter.exercise;

public class ApiAdapter implements TargetApi{
    public static void main(String[] args) {
        TargetApi adapter = new ApiAdapter(new UserApi());
        adapter.postRequest();
    }

    UserApi userApi;

    public ApiAdapter(UserApi userApi) {
        this.userApi = userApi;
    }

    @Override
    public void postRequest() {
        userApi.getRequest();
    }
}
