package com.cqupt.utils;


import com.cqupt.entity.ResultBean;

/**
 * Created by Administrator on 2017/8/9.
 */
public class ResultUtil {

    public static ResultBean success (Object data){
        ResultBean result = new ResultBean();
        result.setCode(0);
        result.setMsg("suceess");
        result.setData(data);
        return result;
    }

    public static ResultBean success (){
        return success(null);
    }

    public static ResultBean error (Integer code,String msg){
        ResultBean result = new ResultBean();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
