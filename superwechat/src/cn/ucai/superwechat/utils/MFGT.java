package cn.ucai.superwechat.utils;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;

import cn.ucai.superwechat.R;
import cn.ucai.superwechat.ui.GuideActivity;
import cn.ucai.superwechat.ui.LoginActivity;
import cn.ucai.superwechat.ui.RegisterActivity;
import cn.ucai.superwechat.ui.SettingsActivity;
import cn.ucai.superwechat.ui.SplashActivity;
import cn.ucai.superwechat.ui.UserProfileActivity;

/**
 * Created by clawpo on 2017/1/10.
 */

public class MFGT {
    public static void finish(Activity activity){
        activity.finish();
        activity.overridePendingTransition(R.anim.push_left_in,R.anim.push_left_out);
    }

    public static void startActivity(Activity context, Class<?> clz){
        context.startActivity(new Intent(context, clz));
        context.overridePendingTransition(R.anim.push_right_in,R.anim.push_right_out);
    }

    public static void startActivity(Activity context, Intent intent){
        context.startActivity(intent);
        context.overridePendingTransition(R.anim.push_right_in,R.anim.push_right_out);
    }

    public static void gotoLogin(Activity activity){
        startActivity(activity, LoginActivity.class);
    }

    public static void gotoLoginCleanTask(Activity activity){
        startActivity(activity, new Intent(activity,LoginActivity.class)
        .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
    }

    public static void gotoRegister(Activity activity){
        startActivity(activity, RegisterActivity.class);
    }

    public static void gotoGuide(SplashActivity activity) {
        startActivity(activity, GuideActivity.class);
    }

    public static void gotoSettings(FragmentActivity activity) {
        startActivity(activity, SettingsActivity.class);
    }

    public static void gotoUserProfile(Activity activity) {
        startActivity(activity, UserProfileActivity.class);
    }
}
