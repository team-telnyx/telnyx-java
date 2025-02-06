

# NetworkCoverageAvailableServicesInner

## oneOf schemas
* [AvailableService](AvailableService.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.NetworkCoverageAvailableServicesInner;
import com.telnyx.sdk.model.AvailableService;

public class Example {
    public static void main(String[] args) {
        NetworkCoverageAvailableServicesInner exampleNetworkCoverageAvailableServicesInner = new NetworkCoverageAvailableServicesInner();

        // create a new AvailableService
        AvailableService exampleAvailableService = new AvailableService();
        // set NetworkCoverageAvailableServicesInner to AvailableService
        exampleNetworkCoverageAvailableServicesInner.setActualInstance(exampleAvailableService);
        // to get back the AvailableService set earlier
        AvailableService testAvailableService = (AvailableService) exampleNetworkCoverageAvailableServicesInner.getActualInstance();
    }
}
```


