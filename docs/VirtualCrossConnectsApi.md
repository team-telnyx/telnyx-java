# VirtualCrossConnectsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**virtaulCrossConnectList**](VirtualCrossConnectsApi.md#virtaulCrossConnectList) | **GET** /virtual_cross_connects | List all Virtual Cross Connects
[**virtaulCrossConnectRegionList**](VirtualCrossConnectsApi.md#virtaulCrossConnectRegionList) | **GET** /virtual_cross_connect_regions | List all Virtual Cross Connect Cloud Regions
[**virtualCrossConnectCreate**](VirtualCrossConnectsApi.md#virtualCrossConnectCreate) | **POST** /virtual_cross_connects | Create a Virtual Cross Connect
[**virtualCrossConnectDelete**](VirtualCrossConnectsApi.md#virtualCrossConnectDelete) | **DELETE** /virtual_cross_connects/{id} | Delete a Virtual Cross Connect
[**virtualCrossConnectGet**](VirtualCrossConnectsApi.md#virtualCrossConnectGet) | **GET** /virtual_cross_connects/{id} | Retrieve a Virtual Cross Connect
[**virtualCrossConnectProvision**](VirtualCrossConnectsApi.md#virtualCrossConnectProvision) | **POST** /virtual_cross_connects/{id}/actions/provision | Provision a Virtual Cross Connect
[**virtualCrossConnectRegionGet**](VirtualCrossConnectsApi.md#virtualCrossConnectRegionGet) | **GET** /virtual_cross_connect_regions/{id} | Retrieve a Virtual Cross Connect Cloud Regions
[**virtualCrossConnectUpdate**](VirtualCrossConnectsApi.md#virtualCrossConnectUpdate) | **PATCH** /virtual_cross_connects/{id} | Update the Virtual Cross Connect



## virtaulCrossConnectList

> VirtaulCrossConnectList200Response virtaulCrossConnectList(pageNumber, pageSize, filterNetworkId)

List all Virtual Cross Connects

List all Virtual Cross Connects.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VirtualCrossConnectsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VirtualCrossConnectsApi apiInstance = new VirtualCrossConnectsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterNetworkId = "6a09cdc3-8948-47f0-aa62-74ac943d6c58"; // String | The associated network id to filter on.
        try {
            VirtaulCrossConnectList200Response result = apiInstance.virtaulCrossConnectList(pageNumber, pageSize, filterNetworkId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualCrossConnectsApi#virtaulCrossConnectList");
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
 **filterNetworkId** | **String**| The associated network id to filter on. | [optional]

### Return type

[**VirtaulCrossConnectList200Response**](VirtaulCrossConnectList200Response.md)

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


## virtaulCrossConnectRegionList

> VirtaulCrossConnectRegionList200Response virtaulCrossConnectRegionList(pageNumber, pageSize, filterRegionCode, filterCloudProvider)

List all Virtual Cross Connect Cloud Regions

List all Virtual Cross Connects Cloud Regions.<br /><br />This endpoint shows which cloud regions are available for the `region_code` your Virtual Cross Connect will be provisioned in.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VirtualCrossConnectsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VirtualCrossConnectsApi apiInstance = new VirtualCrossConnectsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterRegionCode = "ashburn-va"; // String | The Telnyx region code
        String filterCloudProvider = "aws"; // String | The Telnyx region code
        try {
            VirtaulCrossConnectRegionList200Response result = apiInstance.virtaulCrossConnectRegionList(pageNumber, pageSize, filterRegionCode, filterCloudProvider);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualCrossConnectsApi#virtaulCrossConnectRegionList");
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
 **filterRegionCode** | **String**| The Telnyx region code | [optional]
 **filterCloudProvider** | **String**| The Telnyx region code | [optional] [enum: aws, azure, gce]

### Return type

[**VirtaulCrossConnectRegionList200Response**](VirtaulCrossConnectRegionList200Response.md)

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


## virtualCrossConnectCreate

> VirtualCrossConnectCreate200Response virtualCrossConnectCreate(virtualCrossConnectCreate)

Create a Virtual Cross Connect

Create a new Virtual Cross Connect.<br /><br />For AWS and GCE, you have the option of creating the primary connection first and the secondary connection later. You also have the option of disabling the primary and/or secondary connections at any time and later re-enabling them. With Azure, you do not have this option. Azure requires both the primary and secondary connections to be created at the same time and they can not be independantly disabled.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VirtualCrossConnectsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VirtualCrossConnectsApi apiInstance = new VirtualCrossConnectsApi(defaultClient);
        VirtualCrossConnectCreate virtualCrossConnectCreate = new VirtualCrossConnectCreate(); // VirtualCrossConnectCreate | 
        try {
            VirtualCrossConnectCreate200Response result = apiInstance.virtualCrossConnectCreate(virtualCrossConnectCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualCrossConnectsApi#virtualCrossConnectCreate");
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
 **virtualCrossConnectCreate** | [**VirtualCrossConnectCreate**](VirtualCrossConnectCreate.md)|  |

### Return type

[**VirtualCrossConnectCreate200Response**](VirtualCrossConnectCreate200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |
| **0** | Unexpected error |  -  |


## virtualCrossConnectDelete

> VirtualCrossConnectCreate200Response virtualCrossConnectDelete(id)

Delete a Virtual Cross Connect

Delete a Virtual Cross Connect.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VirtualCrossConnectsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VirtualCrossConnectsApi apiInstance = new VirtualCrossConnectsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            VirtualCrossConnectCreate200Response result = apiInstance.virtualCrossConnectDelete(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualCrossConnectsApi#virtualCrossConnectDelete");
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

[**VirtualCrossConnectCreate200Response**](VirtualCrossConnectCreate200Response.md)

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


## virtualCrossConnectGet

> VirtualCrossConnectCreate200Response virtualCrossConnectGet(id)

Retrieve a Virtual Cross Connect

Retrieve a Virtual Cross Connect.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VirtualCrossConnectsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VirtualCrossConnectsApi apiInstance = new VirtualCrossConnectsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            VirtualCrossConnectCreate200Response result = apiInstance.virtualCrossConnectGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualCrossConnectsApi#virtualCrossConnectGet");
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

[**VirtualCrossConnectCreate200Response**](VirtualCrossConnectCreate200Response.md)

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


## virtualCrossConnectProvision

> VirtualCrossConnectCreate200Response virtualCrossConnectProvision(id)

Provision a Virtual Cross Connect

Provision a new Virtual Cross Connect.<br /><br />This endpoint is only necessary for GCE cloud regions. Once you have patched your Cloud IPs, you must POST this request to trigger the provision.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VirtualCrossConnectsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VirtualCrossConnectsApi apiInstance = new VirtualCrossConnectsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            VirtualCrossConnectCreate200Response result = apiInstance.virtualCrossConnectProvision(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualCrossConnectsApi#virtualCrossConnectProvision");
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

[**VirtualCrossConnectCreate200Response**](VirtualCrossConnectCreate200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful response |  -  |
| **0** | Unexpected error |  -  |


## virtualCrossConnectRegionGet

> VirtualCrossConnectRegionGet200Response virtualCrossConnectRegionGet(id)

Retrieve a Virtual Cross Connect Cloud Regions

Retrieve a Virtual Cross Connect Cloud Regions.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VirtualCrossConnectsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VirtualCrossConnectsApi apiInstance = new VirtualCrossConnectsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            VirtualCrossConnectRegionGet200Response result = apiInstance.virtualCrossConnectRegionGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualCrossConnectsApi#virtualCrossConnectRegionGet");
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

[**VirtualCrossConnectRegionGet200Response**](VirtualCrossConnectRegionGet200Response.md)

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


## virtualCrossConnectUpdate

> VirtualCrossConnectCreate200Response virtualCrossConnectUpdate(id, virtualCrossConnectPatch)

Update the Virtual Cross Connect

Update the Virtual Cross Connect.<br /><br />Cloud IPs can only be patched during the `created` state, as GCE will only inform you of your generated IP once the pending connection requested has been accepted. Once the Virtual Cross Connect has moved to `provisioning`, the IPs can no longer be patched.<br /><br />Once the Virtual Cross Connect has moved to `provisioned` and you are ready to enable routing, you can toggle the routing announcements to `true`.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VirtualCrossConnectsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VirtualCrossConnectsApi apiInstance = new VirtualCrossConnectsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        VirtualCrossConnectPatch virtualCrossConnectPatch = new VirtualCrossConnectPatch(); // VirtualCrossConnectPatch | 
        try {
            VirtualCrossConnectCreate200Response result = apiInstance.virtualCrossConnectUpdate(id, virtualCrossConnectPatch);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualCrossConnectsApi#virtualCrossConnectUpdate");
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
 **virtualCrossConnectPatch** | [**VirtualCrossConnectPatch**](VirtualCrossConnectPatch.md)|  |

### Return type

[**VirtualCrossConnectCreate200Response**](VirtualCrossConnectCreate200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |
| **0** | Unexpected error |  -  |

