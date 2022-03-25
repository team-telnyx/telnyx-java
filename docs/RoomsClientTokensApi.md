# RoomsClientTokensApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRoomClientToken**](RoomsClientTokensApi.md#createRoomClientToken) | **POST** /rooms/{room_id}/actions/generate_join_client_token | Create Client Token to join a room.
[**refreshRoomClientToken**](RoomsClientTokensApi.md#refreshRoomClientToken) | **POST** /rooms/{room_id}/actions/refresh_client_token | Refresh Client Token to join a room.



## createRoomClientToken

> CreateRoomClientTokenResponse createRoomClientToken(roomId, createRoomClientTokenRequest)

Create Client Token to join a room.

Synchronously create an Client Token to join a Room. Client Token is necessary to join a Telnyx Room. Client Token will expire after `token_ttl_secs`, a Refresh Token is also provided to refresh a Client Token, the Refresh Token expires after `refresh_token_ttl_secs`.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RoomsClientTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RoomsClientTokensApi apiInstance = new RoomsClientTokensApi(defaultClient);
        UUID roomId = UUID.fromString("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0"); // UUID | The unique identifier of a room.
        CreateRoomClientTokenRequest createRoomClientTokenRequest = new CreateRoomClientTokenRequest(); // CreateRoomClientTokenRequest | Parameters that can be defined during Room Client Token creation.
        try {
            CreateRoomClientTokenResponse result = apiInstance.createRoomClientToken(roomId, createRoomClientTokenRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsClientTokensApi#createRoomClientToken");
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
 **createRoomClientTokenRequest** | [**CreateRoomClientTokenRequest**](CreateRoomClientTokenRequest.md)| Parameters that can be defined during Room Client Token creation. |

### Return type

[**CreateRoomClientTokenResponse**](CreateRoomClientTokenResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create room client token response. |  -  |
| **403** | Forbidden |  -  |


## refreshRoomClientToken

> RefreshRoomClientTokenResponse refreshRoomClientToken(roomId, refreshRoomClientTokenRequest)

Refresh Client Token to join a room.

Synchronously refresh an Client Token to join a Room. Client Token is necessary to join a Telnyx Room. Client Token will expire after `token_ttl_secs`.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RoomsClientTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");

        RoomsClientTokensApi apiInstance = new RoomsClientTokensApi(defaultClient);
        UUID roomId = UUID.fromString("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0"); // UUID | The unique identifier of a room.
        RefreshRoomClientTokenRequest refreshRoomClientTokenRequest = new RefreshRoomClientTokenRequest(); // RefreshRoomClientTokenRequest | Parameters that can be defined during Room Client Token refresh.
        try {
            RefreshRoomClientTokenResponse result = apiInstance.refreshRoomClientToken(roomId, refreshRoomClientTokenRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomsClientTokensApi#refreshRoomClientToken");
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
 **refreshRoomClientTokenRequest** | [**RefreshRoomClientTokenRequest**](RefreshRoomClientTokenRequest.md)| Parameters that can be defined during Room Client Token refresh. |

### Return type

[**RefreshRoomClientTokenResponse**](RefreshRoomClientTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Refresh room client token response. |  -  |
| **403** | Forbidden |  -  |

