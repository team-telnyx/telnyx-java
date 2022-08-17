# RoomCompositionsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRoomComposition**](RoomCompositionsApi.md#createRoomComposition) | **POST** /room_compositions | Create a room composition.
[**deleteRoomComposition**](RoomCompositionsApi.md#deleteRoomComposition) | **DELETE** /room_compositions/{room_composition_id} | Delete a room composition.
[**listRoomCompositions**](RoomCompositionsApi.md#listRoomCompositions) | **GET** /room_compositions | View a list of room compositions.
[**viewRoomComposition**](RoomCompositionsApi.md#viewRoomComposition) | **GET** /room_compositions/{room_composition_id} | View a room composition.



## createRoomComposition

> CreateRoomComposition202Response createRoomComposition(createRoomCompositionRequest)

Create a room composition.

Asynchronously create a room composition.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RoomCompositionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RoomCompositionsApi apiInstance = new RoomCompositionsApi(defaultClient);
        CreateRoomCompositionRequest createRoomCompositionRequest = new CreateRoomCompositionRequest(); // CreateRoomCompositionRequest | Parameters that can be defined during room composition creation.
        try {
            CreateRoomComposition202Response result = apiInstance.createRoomComposition(createRoomCompositionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomCompositionsApi#createRoomComposition");
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
 **createRoomCompositionRequest** | [**CreateRoomCompositionRequest**](CreateRoomCompositionRequest.md)| Parameters that can be defined during room composition creation. |

### Return type

[**CreateRoomComposition202Response**](CreateRoomComposition202Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Create room composition response. |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |


## deleteRoomComposition

> deleteRoomComposition(roomCompositionId)

Delete a room composition.

Synchronously delete a room composition.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RoomCompositionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RoomCompositionsApi apiInstance = new RoomCompositionsApi(defaultClient);
        UUID roomCompositionId = UUID.fromString("5219b3af-87c6-4c08-9b58-5a533d893e21"); // UUID | The unique identifier of a room composition.
        try {
            apiInstance.deleteRoomComposition(roomCompositionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomCompositionsApi#deleteRoomComposition");
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
 **roomCompositionId** | **UUID**| The unique identifier of a room composition. |

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


## listRoomCompositions

> ListRoomCompositions200Response listRoomCompositions(filterDateCreatedAtEq, filterDateCreatedAtGte, filterDateCreatedAtLte, filterSessionId, filterStatus, pageSize, pageNumber)

View a list of room compositions.



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
import com.telnyx.sdk.api.RoomCompositionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RoomCompositionsApi apiInstance = new RoomCompositionsApi(defaultClient);
        LocalDate filterDateCreatedAtEq = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room compositions created on that date.
        LocalDate filterDateCreatedAtGte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room compositions created after that date.
        LocalDate filterDateCreatedAtLte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room compositions created before that date.
        UUID filterSessionId = UUID.fromString("92e7d459-bcc5-4386-9f5f-6dd14a82588d"); // UUID | The session_id for filtering room compositions.
        String filterStatus = "completed"; // String | The status for filtering room compositions.
        Integer pageSize = 20; // Integer | The size of the page
        Integer pageNumber = 1; // Integer | The page number to load
        try {
            ListRoomCompositions200Response result = apiInstance.listRoomCompositions(filterDateCreatedAtEq, filterDateCreatedAtGte, filterDateCreatedAtLte, filterSessionId, filterStatus, pageSize, pageNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomCompositionsApi#listRoomCompositions");
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
 **filterDateCreatedAtEq** | **LocalDate**| ISO 8601 date for filtering room compositions created on that date. | [optional]
 **filterDateCreatedAtGte** | **LocalDate**| ISO 8601 date for filtering room compositions created after that date. | [optional]
 **filterDateCreatedAtLte** | **LocalDate**| ISO 8601 date for filtering room compositions created before that date. | [optional]
 **filterSessionId** | **UUID**| The session_id for filtering room compositions. | [optional]
 **filterStatus** | **String**| The status for filtering room compositions. | [optional] [enum: completed, processing, enqueued]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]

### Return type

[**ListRoomCompositions200Response**](ListRoomCompositions200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List room compositions response. |  -  |


## viewRoomComposition

> CreateRoomComposition202Response viewRoomComposition(roomCompositionId)

View a room composition.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RoomCompositionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RoomCompositionsApi apiInstance = new RoomCompositionsApi(defaultClient);
        UUID roomCompositionId = UUID.fromString("5219b3af-87c6-4c08-9b58-5a533d893e21"); // UUID | The unique identifier of a room composition.
        try {
            CreateRoomComposition202Response result = apiInstance.viewRoomComposition(roomCompositionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomCompositionsApi#viewRoomComposition");
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
 **roomCompositionId** | **UUID**| The unique identifier of a room composition. |

### Return type

[**CreateRoomComposition202Response**](CreateRoomComposition202Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get room composition response. |  -  |
| **404** | Resource not found |  -  |

