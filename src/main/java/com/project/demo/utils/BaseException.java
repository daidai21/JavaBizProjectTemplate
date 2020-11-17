import java.io.Serializable;

public class BaseException extends Exception implements Serializable {

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
