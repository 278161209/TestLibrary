package com.example.mylibrary.util;

import android.content.Context;
import android.widget.Toast;

/**
 * author : Chao
 * date   : 2021/2/2 10:24
 * desc   : 测试
 */
public class TestUtils {

    public static void showToast(Context context) {
        Toast.makeText(context.getApplicationContext(), "调用远程库成功", Toast.LENGTH_SHORT).show();
    }
}
