package top.alexmmd.gateway.api;

/**
 * 封装API的错误码
 *
 * @author Alex 2021/12/16
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
