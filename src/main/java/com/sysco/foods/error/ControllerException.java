package com.sysco.foods.error;

import java.util.Date;

public class ControllerException {
    int errNum;
    String message;
    Long timestamp;
    String path;

    public ControllerException(int status, String message, String path) {
        super();
        this.errNum =status;
        this.message=message;
        this.path=path;
        this.timestamp=new Date().getTime();
    }

    public int getErrNum() {
        return errNum;
    }

    public void setErrNum(int errNum) {
        this.errNum = errNum;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
