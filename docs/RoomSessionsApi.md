# RoomSessionsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**endSession**](RoomSessionsApi.md#endSession) | **POST** /room_sessions/{room_session_id}/actions/end | End a room session.
[**kickParticipantInSession**](RoomSessionsApi.md#kickParticipantInSession) | **POST** /room_sessions/{room_session_id}/actions/kick | Kick participants from a room session.
[**listRoomSessions**](RoomSessionsApi.md#listRoomSessions) | **GET** /room_sessions | View a list of room sessions.
[**muteParticipantInSession**](RoomSessionsApi.md#muteParticipantInSession) | **POST** /room_sessions/{room_session_id}/actions/mute | Mute participants in room session.
[**retrieveListRoomParticipants**](RoomSessionsApi.md#retrieveListRoomParticipants) | **GET** /room_sessions/{room_session_id}/participants | View a list of room participants.
[**unmuteParticipantInSession**](RoomSessionsApi.md#unmuteParticipantInSession) | **POST** /room_sessions/{room_session_id}/actions/unmute | Unmute participants in room session.
[**viewRoomSession**](RoomSessionsApi.md#viewRoomSession) | **GET** /room_sessions/{room_session_id} | View a room session.



## endSession

> EndSession200Response endSession(roomSessionId)

End a room session.

Note: this will also kick all participants currently present in the room

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RoomSessionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");

        RoomSessionsApi apiInstance = new RoomSessionsApi(defaultClient);
        UUID roomSessionId = UUID.fromString("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0"); // UUID | The unique identifier of a room session.
        try {
            EndSession200Response result = apiInstance.endSession(roomSessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomSessionsApi#endSession");
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
 **roomSessionId** | **UUID**| The unique identifier of a room session. |

### Return type

[**EndSession200Response**](EndSession200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success Action Response |  -  |


## kickParticipantInSession

> EndSession200Response kickParticipantInSession(roomSessionId, actionsParticipantsRequest)

Kick participants from a room session.



### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RoomSessionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");

        RoomSessionsApi apiInstance = new RoomSessionsApi(defaultClient);
        UUID roomSessionId = UUID.fromString("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0"); // UUID | The unique identifier of a room session.
        ActionsParticipantsRequest actionsParticipantsRequest = new ActionsParticipantsRequest(); // ActionsParticipantsRequest | Parameters that can be defined during Kick action.
        try {
            EndSession200Response result = apiInstance.kickParticipantInSession(roomSessionId, actionsParticipantsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomSessionsApi#kickParticipantInSession");
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
 **roomSessionId** | **UUID**| The unique identifier of a room session. |
 **actionsParticipantsRequest** | [**ActionsParticipantsRequest**](ActionsParticipantsRequest.md)| Parameters that can be defined during Kick action. |

### Return type

[**EndSession200Response**](EndSession200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success Action Response |  -  |


## listRoomSessions

> ListRoomSessions200Response listRoomSessions(filterDateCreatedAtEq, filterDateCreatedAtGte, filterDateCreatedAtLte, filterDateUpdatedAtEq, filterDateUpdatedAtGte, filterDateUpdatedAtLte, filterDateEndedAtEq, filterDateEndedAtGte, filterDateEndedAtLte, filterRoomId, filterActive, includeParticipants, pageSize, pageNumber)

View a list of room sessions.



### Example

```java
import java.time.LocalDate;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RoomSessionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RoomSessionsApi apiInstance = new RoomSessionsApi(defaultClient);
        LocalDate filterDateCreatedAtEq = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room sessions created on that date.
        LocalDate filterDateCreatedAtGte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room sessions created after that date.
        LocalDate filterDateCreatedAtLte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room sessions created before that date.
        LocalDate filterDateUpdatedAtEq = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room sessions updated on that date.
        LocalDate filterDateUpdatedAtGte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room sessions updated after that date.
        LocalDate filterDateUpdatedAtLte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room sessions updated before that date.
        LocalDate filterDateEndedAtEq = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room sessions ended on that date.
        LocalDate filterDateEndedAtGte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room sessions ended after that date.
        LocalDate filterDateEndedAtLte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room sessions ended before that date.
        String filterRoomId = "0ccc7b54-4df3-4bca-a65a-3da1ecc777f0"; // String | Room_id for filtering room sessions.
        Boolean filterActive = true; // Boolean | Filter active or inactive room sessions.
        Boolean includeParticipants = true; // Boolean | To decide if room participants should be included in the response.
        Integer pageSize = 20; // Integer | The size of the page
        Integer pageNumber = 1; // Integer | The page number to load
        try {
            ListRoomSessions200Response result = apiInstance.listRoomSessions(filterDateCreatedAtEq, filterDateCreatedAtGte, filterDateCreatedAtLte, filterDateUpdatedAtEq, filterDateUpdatedAtGte, filterDateUpdatedAtLte, filterDateEndedAtEq, filterDateEndedAtGte, filterDateEndedAtLte, filterRoomId, filterActive, includeParticipants, pageSize, pageNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomSessionsApi#listRoomSessions");
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
 **filterDateCreatedAtEq** | **LocalDate**| ISO 8601 date for filtering room sessions created on that date. | [optional]
 **filterDateCreatedAtGte** | **LocalDate**| ISO 8601 date for filtering room sessions created after that date. | [optional]
 **filterDateCreatedAtLte** | **LocalDate**| ISO 8601 date for filtering room sessions created before that date. | [optional]
 **filterDateUpdatedAtEq** | **LocalDate**| ISO 8601 date for filtering room sessions updated on that date. | [optional]
 **filterDateUpdatedAtGte** | **LocalDate**| ISO 8601 date for filtering room sessions updated after that date. | [optional]
 **filterDateUpdatedAtLte** | **LocalDate**| ISO 8601 date for filtering room sessions updated before that date. | [optional]
 **filterDateEndedAtEq** | **LocalDate**| ISO 8601 date for filtering room sessions ended on that date. | [optional]
 **filterDateEndedAtGte** | **LocalDate**| ISO 8601 date for filtering room sessions ended after that date. | [optional]
 **filterDateEndedAtLte** | **LocalDate**| ISO 8601 date for filtering room sessions ended before that date. | [optional]
 **filterRoomId** | **String**| Room_id for filtering room sessions. | [optional]
 **filterActive** | **Boolean**| Filter active or inactive room sessions. | [optional]
 **includeParticipants** | **Boolean**| To decide if room participants should be included in the response. | [optional]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]

### Return type

[**ListRoomSessions200Response**](ListRoomSessions200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List room sessions response. |  -  |


## muteParticipantInSession

> EndSession200Response muteParticipantInSession(roomSessionId, actionsParticipantsRequest)

Mute participants in room session.



### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RoomSessionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");

        RoomSessionsApi apiInstance = new RoomSessionsApi(defaultClient);
        UUID roomSessionId = UUID.fromString("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0"); // UUID | The unique identifier of a room session.
        ActionsParticipantsRequest actionsParticipantsRequest = new ActionsParticipantsRequest(); // ActionsParticipantsRequest | Parameters that can be defined during Mute action.
        try {
            EndSession200Response result = apiInstance.muteParticipantInSession(roomSessionId, actionsParticipantsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomSessionsApi#muteParticipantInSession");
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
 **roomSessionId** | **UUID**| The unique identifier of a room session. |
 **actionsParticipantsRequest** | [**ActionsParticipantsRequest**](ActionsParticipantsRequest.md)| Parameters that can be defined during Mute action. |

### Return type

[**EndSession200Response**](EndSession200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success Action Response |  -  |


## retrieveListRoomParticipants

> ListRoomParticipants200Response retrieveListRoomParticipants(roomSessionId, filterDateJoinedAtEq, filterDateJoinedAtGte, filterDateJoinedAtLte, filterDateUpdatedAtEq, filterDateUpdatedAtGte, filterDateUpdatedAtLte, filterDateLeftAtEq, filterDateLeftAtGte, filterDateLeftAtLte, filterContext, pageSize, pageNumber)

View a list of room participants.



### Example

```java
import java.time.LocalDate;
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RoomSessionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RoomSessionsApi apiInstance = new RoomSessionsApi(defaultClient);
        UUID roomSessionId = UUID.fromString("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0"); // UUID | The unique identifier of a room session.
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
        Integer pageSize = 20; // Integer | The size of the page
        Integer pageNumber = 1; // Integer | The page number to load
        try {
            ListRoomParticipants200Response result = apiInstance.retrieveListRoomParticipants(roomSessionId, filterDateJoinedAtEq, filterDateJoinedAtGte, filterDateJoinedAtLte, filterDateUpdatedAtEq, filterDateUpdatedAtGte, filterDateUpdatedAtLte, filterDateLeftAtEq, filterDateLeftAtGte, filterDateLeftAtLte, filterContext, pageSize, pageNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomSessionsApi#retrieveListRoomParticipants");
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
 **roomSessionId** | **UUID**| The unique identifier of a room session. |
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


## unmuteParticipantInSession

> EndSession200Response unmuteParticipantInSession(roomSessionId, actionsParticipantsRequest)

Unmute participants in room session.



### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RoomSessionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");

        RoomSessionsApi apiInstance = new RoomSessionsApi(defaultClient);
        UUID roomSessionId = UUID.fromString("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0"); // UUID | The unique identifier of a room session.
        ActionsParticipantsRequest actionsParticipantsRequest = new ActionsParticipantsRequest(); // ActionsParticipantsRequest | Parameters that can be defined during Unmute action.
        try {
            EndSession200Response result = apiInstance.unmuteParticipantInSession(roomSessionId, actionsParticipantsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomSessionsApi#unmuteParticipantInSession");
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
 **roomSessionId** | **UUID**| The unique identifier of a room session. |
 **actionsParticipantsRequest** | [**ActionsParticipantsRequest**](ActionsParticipantsRequest.md)| Parameters that can be defined during Unmute action. |

### Return type

[**EndSession200Response**](EndSession200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success Action Response |  -  |


## viewRoomSession

> ViewRoomSession200Response viewRoomSession(roomSessionId, includeParticipants)

View a room session.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RoomSessionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RoomSessionsApi apiInstance = new RoomSessionsApi(defaultClient);
        UUID roomSessionId = UUID.fromString("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0"); // UUID | The unique identifier of a room session.
        Boolean includeParticipants = true; // Boolean | To decide if room participants should be included in the response.
        try {
            ViewRoomSession200Response result = apiInstance.viewRoomSession(roomSessionId, includeParticipants);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomSessionsApi#viewRoomSession");
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
 **roomSessionId** | **UUID**| The unique identifier of a room session. |
 **includeParticipants** | **Boolean**| To decide if room participants should be included in the response. | [optional]

### Return type

[**ViewRoomSession200Response**](ViewRoomSession200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get room session response. |  -  |
| **404** | Resource not found |  -  |

