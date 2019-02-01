package com.zwxu.common;


public enum TimeType {
    ERA(0),
    YEAR(1),
    MONTH(2),
    WEEK_OF_YEAR(3),
    WEEK_OF_MONTH(4),
    DATE(5),
    DAY_OF_MONTH(5),
    DAY_OF_YEAR(6),
    DAY_OF_WEEK(7),
    DAY_OF_WEEK_IN_MONTH(8),
    AM_PM(9),
    HOUR(10),
    HOUR_OF_DAY(11),
    MINUTE(12),
    SECOND(13),
    MILLISECOND(14);
   //必须增加一个构造函数,变量,得到该变量的值
    private int mState = 0;
    private TimeType(int value) {
        mState = value;
    }

    /**
     * @return 枚举变量实际返回值
     */
    public int getState() {
        return mState;
    }

}