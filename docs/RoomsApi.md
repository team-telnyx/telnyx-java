# RoomsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRoom**](RoomsApi.md#createRoom) | **POST** /rooms | Create a room.
[**deleteRoom**](RoomsApi.md#deleteRoom) | **DELETE** /rooms/{room_id} | Delete a room.
[**listRooms**](RoomsApi.md#listRooms) | **GET** /rooms | View a list of rooms.
[**retrieveListRoomSessions**](RoomsApi.md#retrieveListRoomSessions) | **GET** /rooms/{room_id}/sessions | View a list of room sessions.
[**updateRoom**](RoomsApi.md#updateRoom) | **PATCH** /rooms/{room_id} | Update a room.
[**viewRoom**](RoomsApi.md#viewRoom) | **GET** /rooms/{room_id} | View a room.



## createRoom

> CreateRoom201Response createRoom(createRoomRequest)

Create a room.

Synchronously create a Room.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        CreateRoomRequest createRoomRequest = new CreateRoomRequest(); // CreateRoomRequest | Parameters that can be defined during room creation.
        try {
            CreateRoom201Response result = apiInstance.createRoom(createRoomRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#createRoom");
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
 **createRoomRequest** | [**CreateRoomRequest**](CreateRoomRequest.md)| Parameters that can be defined during room creation. |

### Return type

[**CreateRoom201Response**](CreateRoom201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create room response. |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |


## deleteRoom

> deleteRoom(roomId)

Delete a room.

Synchronously delete a Room. Participants from that room will be kicked out, they won't be able to join that room anymore, and you won't be charged anymore for that room.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        UUID roomId = UUID.fromString("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0"); // UUID | The unique identifier of a room.
        try {
            apiInstance.deleteRoom(roomId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#deleteRoom");
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
 **roomId** | **UUID**| The unique identifier of a room. |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The resource was deleted successfully. |  -  |
| **404** | Resource not found |  -  |


## listRooms

> ListRooms200Response listRooms(filterDateCreatedAtEq, filterDateCreatedAtGte, filterDateCreatedAtLte, filterDateUpdatedAtEq, filterDateUpdatedAtGte, filterDateUpdatedAtLte, filterUniqueName, includeSessions, pageSize, pageNumber)

View a list of rooms.



### Example

```java
import java.time.LocalDate;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        LocalDate filterDateCreatedAtEq = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering rooms created on that date.
        LocalDate filterDateCreatedAtGte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering rooms created after that date.
        LocalDate filterDateCreatedAtLte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering rooms created before that date.
        LocalDate filterDateUpdatedAtEq = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering rooms updated on that date.
        LocalDate filterDateUpdatedAtGte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering rooms updated after that date.
        LocalDate filterDateUpdatedAtLte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering rooms updated before that date.
        String filterUniqueName = "my_video_room"; // String | Unique_name for filtering rooms.
        Boolean includeSessions = true; // Boolean | To decide if room sessions should be included in the response.
        Integer pageSize = 20; // Integer | The size of the page
        Integer pageNumber = 1; // Integer | The page number to load
        try {
            ListRooms200Response result = apiInstance.listRooms(filterDateCreatedAtEq, filterDateCreatedAtGte, filterDateCreatedAtLte, filterDateUpdatedAtEq, filterDateUpdatedAtGte, filterDateUpdatedAtLte, filterUniqueName, includeSessions, pageSize, pageNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#listRooms");
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
 **filterDateCreatedAtEq** | **LocalDate**| ISO 8601 date for filtering rooms created on that date. | [optional]
 **filterDateCreatedAtGte** | **LocalDate**| ISO 8601 date for filtering rooms created after that date. | [optional]
 **filterDateCreatedAtLte** | **LocalDate**| ISO 8601 date for filtering rooms created before that date. | [optional]
 **filterDateUpdatedAtEq** | **LocalDate**| ISO 8601 date for filtering rooms updated on that date. | [optional]
 **filterDateUpdatedAtGte** | **LocalDate**| ISO 8601 date for filtering rooms updated after that date. | [optional]
 **filterDateUpdatedAtLte** | **LocalDate**| ISO 8601 date for filtering rooms updated before that date. | [optional]
 **filterUniqueName** | **String**| Unique_name for filtering rooms. | [optional]
 **includeSessions** | **Boolean**| To decide if room sessions should be included in the response. | [optional]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]

### Return type

[**ListRooms200Response**](ListRooms200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List rooms response. |  -  |


## retrieveListRoomSessions

> ListRoomSessions200Response retrieveListRoomSessions(roomId, filterDateCreatedAtEq, filterDateCreatedAtGte, filterDateCreatedAtLte, filterDateUpdatedAtEq, filterDateUpdatedAtGte, filterDateUpdatedAtLte, filterDateEndedAtEq, filterDateEndedAtGte, filterDateEndedAtLte, filterActive, includeParticipants, pageSize, pageNumber)

View a list of room sessions.



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
import com.telnyx.sdk.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        UUID roomId = UUID.fromString("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0"); // UUID | The unique identifier of a room.
        LocalDate filterDateCreatedAtEq = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room sessions created on that date.
        LocalDate filterDateCreatedAtGte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room sessions created after that date.
        LocalDate filterDateCreatedAtLte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room sessions created before that date.
        LocalDate filterDateUpdatedAtEq = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room sessions updated on that date.
        LocalDate filterDateUpdatedAtGte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room sessions updated after that date.
        LocalDate filterDateUpdatedAtLte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room sessions updated before that date.
        LocalDate filterDateEndedAtEq = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room sessions ended on that date.
        LocalDate filterDateEndedAtGte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room sessions ended after that date.
        LocalDate filterDateEndedAtLte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room sessions ended before that date.
        Boolean filterActive = true; // Boolean | Filter active or inactive room sessions.
        Boolean includeParticipants = true; // Boolean | To decide if room participants should be included in the response.
        Integer pageSize = 20; // Integer | The size of the page
        Integer pageNumber = 1; // Integer | The page number to load
        try {
            ListRoomSessions200Response result = apiInstance.retrieveListRoomSessions(roomId, filterDateCreatedAtEq, filterDateCreatedAtGte, filterDateCreatedAtLte, filterDateUpdatedAtEq, filterDateUpdatedAtGte, filterDateUpdatedAtLte, filterDateEndedAtEq, filterDateEndedAtGte, filterDateEndedAtLte, filterActive, includeParticipants, pageSize, pageNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#retrieveListRoomSessions");
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
 **roomId** | **UUID**| The unique identifier of a room. |
 **filterDateCreatedAtEq** | **LocalDate**| ISO 8601 date for filtering room sessions created on that date. | [optional]
 **filterDateCreatedAtGte** | **LocalDate**| ISO 8601 date for filtering room sessions created after that date. | [optional]
 **filterDateCreatedAtLte** | **LocalDate**| ISO 8601 date for filtering room sessions created before that date. | [optional]
 **filterDateUpdatedAtEq** | **LocalDate**| ISO 8601 date for filtering room sessions updated on that date. | [optional]
 **filterDateUpdatedAtGte** | **LocalDate**| ISO 8601 date for filtering room sessions updated after that date. | [optional]
 **filterDateUpdatedAtLte** | **LocalDate**| ISO 8601 date for filtering room sessions updated before that date. | [optional]
 **filterDateEndedAtEq** | **LocalDate**| ISO 8601 date for filtering room sessions ended on that date. | [optional]
 **filterDateEndedAtGte** | **LocalDate**| ISO 8601 date for filtering room sessions ended after that date. | [optional]
 **filterDateEndedAtLte** | **LocalDate**| ISO 8601 date for filtering room sessions ended before that date. | [optional]
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


## updateRoom

> CreateRoom201Response updateRoom(roomId, patchRoomRequest)

Update a room.

Synchronously update a Room.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        UUID roomId = UUID.fromString("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0"); // UUID | The unique identifier of a room.
        PatchRoomRequest patchRoomRequest = new PatchRoomRequest(); // PatchRoomRequest | Parameters that can be defined during room update.
        try {
            CreateRoom201Response result = apiInstance.updateRoom(roomId, patchRoomRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#updateRoom");
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
 **roomId** | **UUID**| The unique identifier of a room. |
 **patchRoomRequest** | [**PatchRoomRequest**](PatchRoomRequest.md)| Parameters that can be defined during room update. |

### Return type

[**CreateRoom201Response**](CreateRoom201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update room response. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |


## viewRoom

> CreateRoom201Response viewRoom(roomId, includeSessions)

View a room.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RoomsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RoomsApi apiInstance = new RoomsApi(defaultClient);
        UUID roomId = UUID.fromString("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0"); // UUID | The unique identifier of a room.
        Boolean includeSessions = true; // Boolean | To decide if room sessions should be included in the response.
        try {
            CreateRoom201Response result = apiInstance.viewRoom(roomId, includeSessions);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsApi#viewRoom");
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
 **roomId** | **UUID**| The unique identifier of a room. |
 **includeSessions** | **Boolean**| To decide if room sessions should be included in the response. | [optional]

### Return type

[**CreateRoom201Response**](CreateRoom201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get room response. |  -  |
| **404** | Resource not found |  -  |

