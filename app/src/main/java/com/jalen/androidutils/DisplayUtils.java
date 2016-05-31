package com.jalen.androidutils;

import android.content.Context;
import android.util.TypedValue;

/**
 * Created by 于德海 on 2016/5/31.
 *
 * @version ${VERSION}
 * @decpter  dp,sp，px之间的转换
 */
public class DisplayUtils {

    /***
     * px转dip
     * @param context
     * @param pxValue
     * @return
     */
    public static int px2dip(Context context,float pxValue){
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue/scale+0.5f);
    }


    /***
     *  sp 转px
     * @param context
     * @param spValue
     * @return
     */
    public static int sp2px(Context context,float spValue){
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP,spValue,context.getResources().getDisplayMetrics());
    }


    /***
     * dp转px
     * @param context
     * @param dpValue
     * @return
     */
    public static int dp2px(Context context,float dpValue){
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,dpValue,context.getResources().getDisplayMetrics());
    }


}
