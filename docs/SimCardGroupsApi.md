# SimCardGroupsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**removeSIMCardGroupPrivateWirelessGateway**](SimCardGroupsApi.md#removeSIMCardGroupPrivateWirelessGateway) | **POST** /sim_card_groups/{id}/actions/remove_private_wireless_gateway | Request Private Wireless Gateway removal from SIM card group
[**setSIMCardGroupPrivateWirelessGateway**](SimCardGroupsApi.md#setSIMCardGroupPrivateWirelessGateway) | **POST** /sim_card_groups/{id}/actions/set_private_wireless_gateway | Request Private Wireless Gateway assignment for SIM card group
[**simCardGroupDelete**](SimCardGroupsApi.md#simCardGroupDelete) | **DELETE** /sim_card_groups/{id} | Delete a SIM card group
[**simCardGroupUpdate**](SimCardGroupsApi.md#simCardGroupUpdate) | **PATCH** /sim_card_groups/{id} | Update a SIM card group
[**simCardGroupsGet**](SimCardGroupsApi.md#simCardGroupsGet) | **GET** /sim_card_groups/{id} | Get SIM card group
[**simCardGroupsGetAll**](SimCardGroupsApi.md#simCardGroupsGetAll) | **GET** /sim_card_groups | Get all SIM card groups
[**simCardGroupsPost**](SimCardGroupsApi.md#simCardGroupsPost) | **POST** /sim_card_groups | Create a SIM card group



## removeSIMCardGroupPrivateWirelessGateway

> SimCardGroupActionGet200Response removeSIMCardGroupPrivateWirelessGateway(id)

Request Private Wireless Gateway removal from SIM card group

This action will asynchronously remove an existing Private Wireless Gateway definition from a SIM card group. Completing this operation defines that all SIM cards in the SIM card group will get their traffic handled by Telnyx's default mobile network configuration.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardGroupsApi apiInstance = new SimCardGroupsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            SimCardGroupActionGet200Response result = apiInstance.removeSIMCardGroupPrivateWirelessGateway(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardGroupsApi#removeSIMCardGroupPrivateWirelessGateway");
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

[**SimCardGroupActionGet200Response**](SimCardGroupActionGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |
| **0** | Unexpected error |  -  |


## setSIMCardGroupPrivateWirelessGateway

> SimCardGroupActionGet200Response setSIMCardGroupPrivateWirelessGateway(id, setSIMCardGroupPrivateWirelessGatewayRequest)

Request Private Wireless Gateway assignment for SIM card group

This action will asynchronously assign a provisioned Private Wireless Gateway to the SIM card group. Completing this operation defines that all SIM cards in the SIM card group will get their traffic controlled by the associated Private Wireless Gateway. This operation will also imply that new SIM cards assigned to a group will inherit its network definitions. If it's moved to a different group that doesn't have a Private Wireless Gateway, it'll use Telnyx's default mobile network configuration.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardGroupsApi apiInstance = new SimCardGroupsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        SetSIMCardGroupPrivateWirelessGatewayRequest setSIMCardGroupPrivateWirelessGatewayRequest = new SetSIMCardGroupPrivateWirelessGatewayRequest(); // SetSIMCardGroupPrivateWirelessGatewayRequest | 
        try {
            SimCardGroupActionGet200Response result = apiInstance.setSIMCardGroupPrivateWirelessGateway(id, setSIMCardGroupPrivateWirelessGatewayRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardGroupsApi#setSIMCardGroupPrivateWirelessGateway");
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
 **setSIMCardGroupPrivateWirelessGatewayRequest** | [**SetSIMCardGroupPrivateWirelessGatewayRequest**](SetSIMCardGroupPrivateWirelessGatewayRequest.md)|  |

### Return type

[**SimCardGroupActionGet200Response**](SimCardGroupActionGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |
| **0** | Unexpected error |  -  |


## simCardGroupDelete

> SimCardGroupsPost200Response simCardGroupDelete(id)

Delete a SIM card group

Permanently deletes a SIM card group

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardGroupsApi apiInstance = new SimCardGroupsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            SimCardGroupsPost200Response result = apiInstance.simCardGroupDelete(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardGroupsApi#simCardGroupDelete");
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

[**SimCardGroupsPost200Response**](SimCardGroupsPost200Response.md)

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


## simCardGroupUpdate

> SimCardGroupsPost200Response simCardGroupUpdate(id, siMCardGroupPatch)

Update a SIM card group

Updates a SIM card group

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardGroupsApi apiInstance = new SimCardGroupsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        SIMCardGroupPatch siMCardGroupPatch = new SIMCardGroupPatch(); // SIMCardGroupPatch | 
        try {
            SimCardGroupsPost200Response result = apiInstance.simCardGroupUpdate(id, siMCardGroupPatch);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardGroupsApi#simCardGroupUpdate");
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
 **siMCardGroupPatch** | [**SIMCardGroupPatch**](SIMCardGroupPatch.md)|  |

### Return type

[**SimCardGroupsPost200Response**](SimCardGroupsPost200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **0** | Unexpected error |  -  |


## simCardGroupsGet

> SimCardGroupsPost200Response simCardGroupsGet(id)

Get SIM card group

Returns the details regarding a specific SIM card group

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardGroupsApi apiInstance = new SimCardGroupsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            SimCardGroupsPost200Response result = apiInstance.simCardGroupsGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardGroupsApi#simCardGroupsGet");
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

[**SimCardGroupsPost200Response**](SimCardGroupsPost200Response.md)

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


## simCardGroupsGetAll

> SimCardGroupsGetAll200Response simCardGroupsGetAll(pageNumber, pageSize, filterName, filterPrivateWirelessGatewayId)

Get all SIM card groups

Get all SIM card groups belonging to the user that match the given filters.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardGroupsApi apiInstance = new SimCardGroupsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        UUID filterName = UUID.randomUUID(); // UUID | A valid SIM card group name.
        UUID filterPrivateWirelessGatewayId = UUID.fromString("7606c6d3-ff7c-49c1-943d-68879e9d584d"); // UUID | A Private Wireless Gateway ID associated with the group.
        try {
            SimCardGroupsGetAll200Response result = apiInstance.simCardGroupsGetAll(pageNumber, pageSize, filterName, filterPrivateWirelessGatewayId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardGroupsApi#simCardGroupsGetAll");
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
 **filterName** | **UUID**| A valid SIM card group name. | [optional]
 **filterPrivateWirelessGatewayId** | **UUID**| A Private Wireless Gateway ID associated with the group. | [optional]

### Return type

[**SimCardGroupsGetAll200Response**](SimCardGroupsGetAll200Response.md)

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


## simCardGroupsPost

> SimCardGroupsPost200Response simCardGroupsPost(siMCardGroupCreate)

Create a SIM card group

Creates a new SIM card group object

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SimCardGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SimCardGroupsApi apiInstance = new SimCardGroupsApi(defaultClient);
        SIMCardGroupCreate siMCardGroupCreate = new SIMCardGroupCreate(); // SIMCardGroupCreate | 
        try {
            SimCardGroupsPost200Response result = apiInstance.simCardGroupsPost(siMCardGroupCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardGroupsApi#simCardGroupsPost");
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
 **siMCardGroupCreate** | [**SIMCardGroupCreate**](SIMCardGroupCreate.md)|  |

### Return type

[**SimCardGroupsPost200Response**](SimCardGroupsPost200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **0** | Unexpected error |  -  |

