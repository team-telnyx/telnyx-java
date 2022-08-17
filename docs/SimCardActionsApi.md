# SimCardActionsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkSimCardActionGet**](SimCardActionsApi.md#bulkSimCardActionGet) | **GET** /bulk_sim_card_actions/{id} | Get bulk SIM card action details
[**listBulkSIMCardActions**](SimCardActionsApi.md#listBulkSIMCardActions) | **GET** /bulk_sim_card_actions | List bulk SIM card actions
[**listSIMCardActions**](SimCardActionsApi.md#listSIMCardActions) | **GET** /sim_card_actions | List SIM card actions
[**simCardActionGet**](SimCardActionsApi.md#simCardActionGet) | **GET** /sim_card_actions/{id} | Get SIM card action details



## bulkSimCardActionGet

> BulkSimCardActionGet200Response bulkSimCardActionGet(id)

Get bulk SIM card action details

This API fetches information about a bulk SIM card action. A bulk SIM card action contains details about a collection of individual SIM card actions.

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
            BulkSimCardActionGet200Response result = apiInstance.bulkSimCardActionGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardActionsApi#bulkSimCardActionGet");
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

[**BulkSimCardActionGet200Response**](BulkSimCardActionGet200Response.md)

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


## listBulkSIMCardActions

> ListBulkSIMCardActions200Response listBulkSIMCardActions(pageNumber, pageSize, filterActionType)

List bulk SIM card actions

This API lists a paginated collection of bulk SIM card actions. A bulk SIM card action contains details about a collection of individual SIM card actions.

### Example

```java
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
        String filterActionType = "bulk_set_public_ips"; // String | Filter by action type.
        try {
            ListBulkSIMCardActions200Response result = apiInstance.listBulkSIMCardActions(pageNumber, pageSize, filterActionType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardActionsApi#listBulkSIMCardActions");
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
 **filterActionType** | **String**| Filter by action type. | [optional] [enum: bulk_set_public_ips]

### Return type

[**ListBulkSIMCardActions200Response**](ListBulkSIMCardActions200Response.md)

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


## listSIMCardActions

> ListSIMCardActions200Response listSIMCardActions(pageNumber, pageSize, filterSimCardId, filterStatus, filterBulkSimCardActionId, filterActionType)

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
        UUID filterBulkSimCardActionId = UUID.fromString("47a1c2b0-cc7b-4ab1-bb98-b33fb0fc61b9"); // UUID | Filter by a bulk SIM card action ID.
        String filterActionType = "enable"; // String | Filter by action type.
        try {
            ListSIMCardActions200Response result = apiInstance.listSIMCardActions(pageNumber, pageSize, filterSimCardId, filterStatus, filterBulkSimCardActionId, filterActionType);
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
 **filterBulkSimCardActionId** | **UUID**| Filter by a bulk SIM card action ID. | [optional]
 **filterActionType** | **String**| Filter by action type. | [optional] [enum: enable, enable_standby_sim_card, disable, set_standby, remove_public_ip, set_public_ip]

### Return type

[**ListSIMCardActions200Response**](ListSIMCardActions200Response.md)

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

> SimCardActionGet200Response simCardActionGet(id)

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
            SimCardActionGet200Response result = apiInstance.simCardActionGet(id);
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

[**SimCardActionGet200Response**](SimCardActionGet200Response.md)

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

