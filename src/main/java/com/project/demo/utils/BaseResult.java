import java.io.Serializable;

import lombok.Data;

@Data
public class BaseResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private boolean success;

    private T result;

    private String errorCode;

    private String errorMessage;

    public static <T> BaseResult<T> success() {
        return new BaseResult<T>().setSuccess(true).setResult(data);
    }

    public static <T> BaseResult<T> fail(T data, String errorCode, String errorMessage) {
        return new BaseResult<T>().setSuccess(false).setResult(data).setErrorCode(errorCode)
                .setErrorMessage(errorMessage);
    }

    public static <T> BaseResult<T> fail(String errorCode, String errorMessage) {
        return fail(null, errorCode, errorMessage);
    }

    public static <T> BaseResult<T> fail(String errorCode) {
        return fail(null, errorCode, null);
    }

    public static <T> BaseResult<T> fail() {
        return new BaseResult<T>().setSuccess(false);
    }

}
