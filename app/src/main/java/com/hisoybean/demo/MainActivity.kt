package com.hisoybean.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hisoybean.common.utils.AppUtils
import com.hisoybean.common.utils.DeviceUtils
import com.hisoybean.common.utils.LogUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DeviceUtils.getSDKVersionName()
        LogUtils.i("versionName: ${AppUtils.getAppVersionName()}")
        LogUtils.i("versionCode: ${AppUtils.getAppVersionCode()}")
    }
}