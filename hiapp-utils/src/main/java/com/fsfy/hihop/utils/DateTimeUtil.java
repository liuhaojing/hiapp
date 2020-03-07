package com.fsfy.hihop.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {

    /**
     * 获取日期格式化字符串
     * @param oneDay 日期
     * @param pattern 显示格式
     * @return 格式化日期字符串
     */
    public static String formatString(Date oneDay, String pattern){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(oneDay);
    }
}
