# SimCardGroupsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSimCardGroup**](SimCardGroupsApi.md#createSimCardGroup) | **POST** /sim_card_groups | Create a SIM card group
[**deleteSimCardGroup**](SimCardGroupsApi.md#deleteSimCardGroup) | **DELETE** /sim_card_groups/{id} | Delete a SIM card group
[**getAllSimCardGroups**](SimCardGroupsApi.md#getAllSimCardGroups) | **GET** /sim_card_groups | Get all SIM card groups
[**getSimCardGroup**](SimCardGroupsApi.md#getSimCardGroup) | **GET** /sim_card_groups/{id} | Get SIM card group
[**removeSimCardGroupPrivateWirelessGateway**](SimCardGroupsApi.md#removeSimCardGroupPrivateWirelessGateway) | **POST** /sim_card_groups/{id}/actions/remove_private_wireless_gateway | Request Private Wireless Gateway removal from SIM card group
[**setPrivateWirelessGatewayForSimCardGroup**](SimCardGroupsApi.md#setPrivateWirelessGatewayForSimCardGroup) | **POST** /sim_card_groups/{id}/actions/set_private_wireless_gateway | Request Private Wireless Gateway assignment for SIM card group
[**updateSimCardGroup**](SimCardGroupsApi.md#updateSimCardGroup) | **PATCH** /sim_card_groups/{id} | Update a SIM card group



## createSimCardGroup

> CreateSimCardGroup200Response createSimCardGroup(siMCardGroupCreate)

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
            CreateSimCardGroup200Response result = apiInstance.createSimCardGroup(siMCardGroupCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardGroupsApi#createSimCardGroup");
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

[**CreateSimCardGroup200Response**](CreateSimCardGroup200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |


## deleteSimCardGroup

> CreateSimCardGroup200Response deleteSimCardGroup(id)

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
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the SIM group.
        try {
            CreateSimCardGroup200Response result = apiInstance.deleteSimCardGroup(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardGroupsApi#deleteSimCardGroup");
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
 **id** | **UUID**| Identifies the SIM group. |

### Return type

[**CreateSimCardGroup200Response**](CreateSimCardGroup200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |


## getAllSimCardGroups

> GetAllSimCardGroups200Response getAllSimCardGroups(pageNumber, pageSize, filterName, filterPrivateWirelessGatewayId)

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
            GetAllSimCardGroups200Response result = apiInstance.getAllSimCardGroups(pageNumber, pageSize, filterName, filterPrivateWirelessGatewayId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardGroupsApi#getAllSimCardGroups");
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

[**GetAllSimCardGroups200Response**](GetAllSimCardGroups200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |


## getSimCardGroup

> CreateSimCardGroup200Response getSimCardGroup(id, includeIccids)

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
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the SIM group.
        Boolean includeIccids = false; // Boolean | It includes a list of associated ICCIDs.
        try {
            CreateSimCardGroup200Response result = apiInstance.getSimCardGroup(id, includeIccids);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardGroupsApi#getSimCardGroup");
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
 **id** | **UUID**| Identifies the SIM group. |
 **includeIccids** | **Boolean**| It includes a list of associated ICCIDs. | [optional] [default to false]

### Return type

[**CreateSimCardGroup200Response**](CreateSimCardGroup200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |


## removeSimCardGroupPrivateWirelessGateway

> GetSimCardGroupAction200Response removeSimCardGroupPrivateWirelessGateway(id)

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
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the SIM group.
        try {
            GetSimCardGroupAction200Response result = apiInstance.removeSimCardGroupPrivateWirelessGateway(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardGroupsApi#removeSimCardGroupPrivateWirelessGateway");
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
 **id** | **UUID**| Identifies the SIM group. |

### Return type

[**GetSimCardGroupAction200Response**](GetSimCardGroupAction200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |


## setPrivateWirelessGatewayForSimCardGroup

> GetSimCardGroupAction200Response setPrivateWirelessGatewayForSimCardGroup(id, setPrivateWirelessGatewayForSimCardGroupRequest)

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
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the SIM group.
        SetPrivateWirelessGatewayForSimCardGroupRequest setPrivateWirelessGatewayForSimCardGroupRequest = new SetPrivateWirelessGatewayForSimCardGroupRequest(); // SetPrivateWirelessGatewayForSimCardGroupRequest | 
        try {
            GetSimCardGroupAction200Response result = apiInstance.setPrivateWirelessGatewayForSimCardGroup(id, setPrivateWirelessGatewayForSimCardGroupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardGroupsApi#setPrivateWirelessGatewayForSimCardGroup");
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
 **id** | **UUID**| Identifies the SIM group. |
 **setPrivateWirelessGatewayForSimCardGroupRequest** | [**SetPrivateWirelessGatewayForSimCardGroupRequest**](SetPrivateWirelessGatewayForSimCardGroupRequest.md)|  |

### Return type

[**GetSimCardGroupAction200Response**](GetSimCardGroupAction200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |


## updateSimCardGroup

> CreateSimCardGroup200Response updateSimCardGroup(id, siMCardGroupPatch)

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
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the SIM group.
        SIMCardGroupPatch siMCardGroupPatch = new SIMCardGroupPatch(); // SIMCardGroupPatch | 
        try {
            CreateSimCardGroup200Response result = apiInstance.updateSimCardGroup(id, siMCardGroupPatch);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SimCardGroupsApi#updateSimCardGroup");
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
 **id** | **UUID**| Identifies the SIM group. |
 **siMCardGroupPatch** | [**SIMCardGroupPatch**](SIMCardGroupPatch.md)|  |

### Return type

[**CreateSimCardGroup200Response**](CreateSimCardGroup200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |

