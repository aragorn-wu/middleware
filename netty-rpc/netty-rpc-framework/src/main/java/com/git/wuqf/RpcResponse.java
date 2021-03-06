package com.git.wuqf;

/**
 * Created by wuqf on 2016/12/13.
 */
public class RpcResponse {
    private String requestId;
    private Throwable error;
    private Object result;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Throwable getError() {
        return error;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public boolean isError() {
        if (error == null) {
            return false;
        }
        return true;
    }

    public void setError(Throwable error) {
        this.error = error;
    }
}
