package com.lh.dome.common.exception;


import com.lh.dome.common.constant.ErrorCodeConstants;

/**
 * 服务异常
 *
 * @author lihong
 * @date 2023/04/21
 */
public final class ServiceException extends RuntimeException
{
    private static final long serialVersionUID = 1L;

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 错误提示
     */
    private String message;

    /**
     * 错误明细，内部调试错误
     *
     */
    private String detailMessage;

    /**
     * 空构造方法，避免反序列化问题
     */
    public ServiceException()
    {
    }

    public ServiceException(String message)
    {
        this.message = message;
        this.errorCode = ErrorCodeConstants.BUSINESS_ERROR;
    }

    public ServiceException(String message, String errorCode)
    {
        this.message = message;
        this.errorCode = errorCode;
    }

    public String getDetailMessage()
    {
        return detailMessage;
    }

    @Override
    public String getMessage()
    {
        return message;
    }

    public String getErrorCode() {
        return errorCode;
    }
    public ServiceException setMessage(String message)
    {
        this.message = message;
        return this;
    }

    public ServiceException setDetailMessage(String detailMessage)
    {
        this.detailMessage = detailMessage;
        return this;
    }
}