package com.util;/**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description:
 * @author fengzf fengzf@gstarcad.com
 * @date 2018/10/15 16:03
 * @version Vxxx (项目版本)
 * @redmine
 * @update @Description TODO(这里用一句话描述这个方法的作用)
 * @update @author fengzf fengzf@gstarcad.com
 * @update @date 2018/10/15 16:03
 */

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: TimeUtils.java
 * @Description:
 * @author: fengzf fengzf@gstarcad.com
 * @Date: 2018/10/15 16:03
 *
 */
public class TimeUtils {

    //获取当前时间---输入为时间格式，如yyyy-MM-dd HH:mm:ss
    public static String GetNowDate(String formate){
        String temp_str="";
        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(formate);
        temp_str=sdf.format(dt);
        return temp_str;
    }
}
