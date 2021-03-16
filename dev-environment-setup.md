You'll need to ensure that you have at least Java 8 (JDK 1.8+) installed on your computer. If not, follow the [official installation instructions](https://www.java.com/en/download/) for your operating system to install it. You can check this by running the following:

```bash
java --version
```

Install the [Telnyx Java SDK](https://github.com/team-telnyx/telnyx-java/tree/v2) for:

### Maven

```xml
<dependency>
  <groupId>com.telnyx.sdk</groupId>
  <artifactId>telnyx</artifactId>
  <version>2.0.8-beta</version>
  <scope>compile</scope>
</dependency>
```

### Gradle

```
compile "com.telnyx.sdk:telnyx:2.0.8-beta"
```

## Search for Phone Number Example

Demo below instanciates the Telnyx client; searches for phone numbers in the Raleigh, NC area and prints the result to console.

```java
import com.telnyx.sdk.*;
import com.telnyx.sdk.api.NumberSearchApi;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import java.util.List;
import java.util.stream.Collectors;

public class MessagingExample {

    public static void main(String[] args) throws ApiException {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");

        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("//Your-API-Key!");

        NumberSearchApi numberSearchApi = new NumberSearchApi(defaultClient);
        ListAvailablePhoneNumbersResponse availableNumbers =  numberSearchApi.listAvailablePhoneNumbers()
                .filterCountryCode("US")
                .filterAdministrativeArea("NC")
                .filterLocality("Raleigh")
                .execute();
        List<PhoneNumber> numbers = availableNumbers.getData()
                .stream()
                .map(AvailablePhoneNumber::getPhoneNumber)
                 .map(number -> new PhoneNumber().phoneNumber(number))
                .collect(Collectors.toList());
        System.out.println(numbers);
    }
}

```
