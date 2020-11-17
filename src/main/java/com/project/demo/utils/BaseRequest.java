import java.io.Serializable;
import java.util.Map;

import lombok.Data;

@Data
public class BaseRequest implements Serializable {

    private static final long serialVersionUID = -5142311382683693286L;

    private Long id;

    /**
     * extra param (Not required)
     */
    private Map<String, String> extraMap;
}
