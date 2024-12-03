package common.data;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LocationID {
    private Integer first;
    private Integer second;
}