package whj.nb.vo;

/**
 * @Author: s2892
 * @Date: 2020/8/25 9:44
 */

public class ResultVO<T> {

    private Integer code;
    private String msg;
    private T t;


    public ResultVO(Integer code, String msg, T t) {
        this.code = code;
        this.msg = msg;
        this.t = t;
    }

    public ResultVO() {
    }


    @Override
    public String toString() {
        return "ResultVO{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", t=" + t +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
