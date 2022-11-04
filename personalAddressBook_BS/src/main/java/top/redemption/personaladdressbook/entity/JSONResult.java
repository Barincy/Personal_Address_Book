package top.redemption.personaladdressbook.entity;

public class JSONResult {
    private boolean success;

    private String msg;

    private Object data;

    public JSONResult() {

    }

    public JSONResult(Boolean success, String msg){
        this.success = success;
        this.msg = msg;
    }

    public JSONResult(Boolean success, String msg, Object data){
        this.success = success;
        this.msg = msg;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
