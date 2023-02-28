package dns.core;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

@Data
public class TransferZone implements Serializable {
    private String master;
    private Integer operationType;
    private Map<String, Zone> zoneMap;
}
