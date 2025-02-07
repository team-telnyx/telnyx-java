# DebuggingApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listCallEvents**](DebuggingApi.md#listCallEvents) | **GET** /call_events | List call events



## listCallEvents

> ListCallEventsResponse listCallEvents().filterLegId(filterLegId).filterApplicationSessionId(filterApplicationSessionId).filterConnectionId(filterConnectionId).filterProduct(filterProduct).filterFrom(filterFrom).filterTo(filterTo).filterFailed(filterFailed).filterType(filterType).filterName(filterName).filterOccurredAtGt(filterOccurredAtGt).filterOccurredAtGte(filterOccurredAtGte).filterOccurredAtLt(filterOccurredAtLt).filterOccurredAtLte(filterOccurredAtLte).filterOccurredAtEq(filterOccurredAtEq).pageNumber(pageNumber).pageSize(pageSize).execute();

List call events

Filters call events by given filter parameters. Events are ordered by `occurred_at`. If filter for `leg_id` or `application_session_id` is not present, it only filters events from the last 24 hours.

**Note**: Only one `filter[occurred_at]` can be passed.


### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.DebuggingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DebuggingApi apiInstance = new DebuggingApi(defaultClient);
        UUID filterLegId = UUID.randomUUID(); // UUID | The unique identifier of an individual call leg.
        UUID filterApplicationSessionId = UUID.randomUUID(); // UUID | The unique identifier of the call session. A session may include multiple call leg events.
        String filterConnectionId = "filterConnectionId_example"; // String | The unique identifier of the conection.
        String filterProduct = "call_control"; // String | Filter by product.
        String filterFrom = "+12025550142"; // String | Filter by From number.
        String filterTo = "+12025550142"; // String | Filter by To number.
        Boolean filterFailed = false; // Boolean | Delivery failed or not.
        String filterType = "command"; // String | Event type
        String filterName = "webhook"; // String | Event name
        String filterOccurredAtGt = "2019-03-29T11:10:00Z"; // String | Event occurred_at: greater than
        String filterOccurredAtGte = "2019-03-29T11:10:00Z"; // String | Event occurred_at: greater than or equal
        String filterOccurredAtLt = "2019-03-29T11:10:00Z"; // String | Event occurred_at: lower than
        String filterOccurredAtLte = "2019-03-29T11:10:00Z"; // String | Event occurred_at: lower than or equal
        String filterOccurredAtEq = "2019-03-29T11:10:00Z"; // String | Event occurred_at: equal
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListCallEventsResponse result = api.listCallEvents()
                .filterLegId(filterLegId)
                .filterApplicationSessionId(filterApplicationSessionId)
                .filterConnectionId(filterConnectionId)
                .filterProduct(filterProduct)
                .filterFrom(filterFrom)
                .filterTo(filterTo)
                .filterFailed(filterFailed)
                .filterType(filterType)
                .filterName(filterName)
                .filterOccurredAtGt(filterOccurredAtGt)
                .filterOccurredAtGte(filterOccurredAtGte)
                .filterOccurredAtLt(filterOccurredAtLt)
                .filterOccurredAtLte(filterOccurredAtLte)
                .filterOccurredAtEq(filterOccurredAtEq)
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DebuggingApi#listCallEvents");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterLegId** | **UUID**| The unique identifier of an individual call leg. | [optional]
 **filterApplicationSessionId** | **UUID**| The unique identifier of the call session. A session may include multiple call leg events. | [optional]
 **filterConnectionId** | **String**| The unique identifier of the conection. | [optional]
 **filterProduct** | **String**| Filter by product. | [optional] [enum: call_control, fax, texml]
 **filterFrom** | **String**| Filter by From number. | [optional]
 **filterTo** | **String**| Filter by To number. | [optional]
 **filterFailed** | **Boolean**| Delivery failed or not. | [optional]
 **filterType** | **String**| Event type | [optional] [enum: command, webhook]
 **filterName** | **String**| Event name | [optional]
 **filterOccurredAtGt** | **String**| Event occurred_at: greater than | [optional]
 **filterOccurredAtGte** | **String**| Event occurred_at: greater than or equal | [optional]
 **filterOccurredAtLt** | **String**| Event occurred_at: lower than | [optional]
 **filterOccurredAtLte** | **String**| Event occurred_at: lower than or equal | [optional]
 **filterOccurredAtEq** | **String**| Event occurred_at: equal | [optional]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**ListCallEventsResponse**](ListCallEventsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of call events. |  -  |
| **0** | Unexpected error |  -  |

