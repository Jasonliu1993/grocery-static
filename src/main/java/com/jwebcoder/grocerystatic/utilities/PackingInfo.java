package com.jwebcoder.grocerystatic.utilities;


import com.jwebcoder.grocerystatic.dto.Message;
import com.jwebcoder.grocerystatic.exception.ErrorException;
import com.jwebcoder.grocerystatic.exception.StatusCode;

/**
 * Created by Jason on 10/10/2017.
 */
public class PackingInfo {

    public static Message changeException2Message (ErrorException errorException) {
        Message message = new Message();

        message.setCode(errorException.getCode());
        message.setMessage(errorException.getMessage());

        return message;
    }

    public static Message changeData2Message(Object object) {

        Message message = new Message();

        message.setCode(StatusCode.SUCCESSFUL.getCode());
        message.setMessage(StatusCode.SUCCESSFUL.getErrorMessage());
        message.setData(object);

        return message;
    }

}
