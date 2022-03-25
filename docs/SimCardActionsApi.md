# SimCardActionsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listSIMCardActions**](SimCardActionsApi.md#listSIMCardActions) | **GET** /sim_card_actions | List SIM card actions
[**simCardActionGet**](SimCardActionsApi.md#simCardActionGet) | **GET** /sim_card_actions/{id} | Get SIM card action details



## listSIMCardActions

> SimCardActionCollectionResponse listSIMCardActions(pageNumber, pageSize, filterSimCardId, filterStatus, filterActionType)

List SIM card actions

This API lists a paginated collection of SIM card actions. It enables exploring a collection of existing asynchronous operations using specific filters.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardActionsApi apiInstance = new SimCardActionsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        UUID filterSimCardId = UUID.fromString("47a1c2b0-cc7b-4ab1-bb98-b33fb0fc61b9"); // UUID | A valid SIM card ID.
        String filterStatus = "in-progress"; // String | Filter by a specific status of the resource's lifecycle.
        String filterActionType = "enable"; // String | Filter by action type.
        try {
            SimCardActionCollectionResponse result = apiInstance.listSIMCardActions(pageNumber, pageSize, filterSimCardId, filterStatus, filterActionType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardActionsApi#listSIMCardActions");
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
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]
 **filterSimCardId** | **UUID**| A valid SIM card ID. | [optional]
 **filterStatus** | **String**| Filter by a specific status of the resource&#39;s lifecycle. | [optional] [enum: in-progress, completed, failed]
 **filterActionType** | **String**| Filter by action type. | [optional] [enum: enable, enable_standby_sim_card, disable, set_standby, remove_public_ip, set_public_ip]

### Return type

[**SimCardActionCollectionResponse**](SimCardActionCollectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |


## simCardActionGet

> SIMCardActionResponse simCardActionGet(id)

Get SIM card action details

This API fetches detailed information about a SIM card action to follow-up on an existing asynchronous operation.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardActionsApi apiInstance = new SimCardActionsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            SIMCardActionResponse result = apiInstance.simCardActionGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardActionsApi#simCardActionGet");
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
 **id** | **UUID**| Identifies the resource. |

### Return type

[**SIMCardActionResponse**](SIMCardActionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **0** | Unexpected error |  -  |

