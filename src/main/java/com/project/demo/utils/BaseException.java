import java.io.Serializable;

/**
 * 
 * 非RuntimeException必要自己写catch块处理掉。如果不处理，程序将出现编译错误。
 * RuntimeException不用try catch捕捉将会导致程序运行中断，若用则不会中断。
 */
public class BaseException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = 8219499818301663828L;

    private String errorCode;

    private String errorMessage;

    public BaseException(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public BaseException(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    @Override
    public String getMessage() {
        return String.format("[ErrorCode]: %s [ErrorMessage]: %s", errorCode, errorMessage);
    }
}
