# RoomParticipantsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listRoomParticipants**](RoomParticipantsApi.md#listRoomParticipants) | **GET** /room_participants | View a list of room participants.
[**viewRoomParticipant**](RoomParticipantsApi.md#viewRoomParticipant) | **GET** /room_participants/{room_participant_id} | View a room participant.



## listRoomParticipants

> ListRoomParticipants200Response listRoomParticipants(filterDateJoinedAtEq, filterDateJoinedAtGte, filterDateJoinedAtLte, filterDateUpdatedAtEq, filterDateUpdatedAtGte, filterDateUpdatedAtLte, filterDateLeftAtEq, filterDateLeftAtGte, filterDateLeftAtLte, filterContext, filterSessionId, pageSize, pageNumber)

View a list of room participants.



### Example

```java
import java.time.LocalDate;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RoomParticipantsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RoomParticipantsApi apiInstance = new RoomParticipantsApi(defaultClient);
        LocalDate filterDateJoinedAtEq = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room participants that joined on that date.
        LocalDate filterDateJoinedAtGte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room participants that joined after that date.
        LocalDate filterDateJoinedAtLte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room participants that joined before that date.
        LocalDate filterDateUpdatedAtEq = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room participants updated on that date.
        LocalDate filterDateUpdatedAtGte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room participants updated after that date.
        LocalDate filterDateUpdatedAtLte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room participants updated before that date.
        LocalDate filterDateLeftAtEq = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room participants that left on that date.
        LocalDate filterDateLeftAtGte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room participants that left after that date.
        LocalDate filterDateLeftAtLte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room participants that left before that date.
        String filterContext = "Alice"; // String | Filter room participants based on the context.
        String filterSessionId = "0ccc7b54-4df3-4bca-a65a-3da1ecc777f0"; // String | Session_id for filtering room participants.
        Integer pageSize = 20; // Integer | The size of the page
        Integer pageNumber = 1; // Integer | The page number to load
        try {
            ListRoomParticipants200Response result = apiInstance.listRoomParticipants(filterDateJoinedAtEq, filterDateJoinedAtGte, filterDateJoinedAtLte, filterDateUpdatedAtEq, filterDateUpdatedAtGte, filterDateUpdatedAtLte, filterDateLeftAtEq, filterDateLeftAtGte, filterDateLeftAtLte, filterContext, filterSessionId, pageSize, pageNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomParticipantsApi#listRoomParticipants");
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
 **filterDateJoinedAtEq** | **LocalDate**| ISO 8601 date for filtering room participants that joined on that date. | [optional]
 **filterDateJoinedAtGte** | **LocalDate**| ISO 8601 date for filtering room participants that joined after that date. | [optional]
 **filterDateJoinedAtLte** | **LocalDate**| ISO 8601 date for filtering room participants that joined before that date. | [optional]
 **filterDateUpdatedAtEq** | **LocalDate**| ISO 8601 date for filtering room participants updated on that date. | [optional]
 **filterDateUpdatedAtGte** | **LocalDate**| ISO 8601 date for filtering room participants updated after that date. | [optional]
 **filterDateUpdatedAtLte** | **LocalDate**| ISO 8601 date for filtering room participants updated before that date. | [optional]
 **filterDateLeftAtEq** | **LocalDate**| ISO 8601 date for filtering room participants that left on that date. | [optional]
 **filterDateLeftAtGte** | **LocalDate**| ISO 8601 date for filtering room participants that left after that date. | [optional]
 **filterDateLeftAtLte** | **LocalDate**| ISO 8601 date for filtering room participants that left before that date. | [optional]
 **filterContext** | **String**| Filter room participants based on the context. | [optional]
 **filterSessionId** | **String**| Session_id for filtering room participants. | [optional]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]

### Return type

[**ListRoomParticipants200Response**](ListRoomParticipants200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List room participants response. |  -  |


## viewRoomParticipant

> ViewRoomParticipant200Response viewRoomParticipant(roomParticipantId)

View a room participant.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RoomParticipantsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RoomParticipantsApi apiInstance = new RoomParticipantsApi(defaultClient);
        UUID roomParticipantId = UUID.fromString("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0"); // UUID | The unique identifier of a room participant.
        try {
            ViewRoomParticipant200Response result = apiInstance.viewRoomParticipant(roomParticipantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomParticipantsApi#viewRoomParticipant");
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
 **roomParticipantId** | **UUID**| The unique identifier of a room participant. |

### Return type

[**ViewRoomParticipant200Response**](ViewRoomParticipant200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get room participant response. |  -  |
| **404** | Resource not found |  -  |

