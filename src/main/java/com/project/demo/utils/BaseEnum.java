
public interface BaseEnum<T> {
    T getCode();

    static <T, V extends BaseEnum<T>> V parse(V[] values, T code) {
        for (V value : values) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
}
