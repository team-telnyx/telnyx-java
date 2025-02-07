# VirtualCrossConnectsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVirtualCrossConnect**](VirtualCrossConnectsApi.md#createVirtualCrossConnect) | **POST** /virtual_cross_connects | Create a Virtual Cross Connect
[**deleteVirtualCrossConnect**](VirtualCrossConnectsApi.md#deleteVirtualCrossConnect) | **DELETE** /virtual_cross_connects/{id} | Delete a Virtual Cross Connect
[**getVirtualCrossConnect**](VirtualCrossConnectsApi.md#getVirtualCrossConnect) | **GET** /virtual_cross_connects/{id} | Retrieve a Virtual Cross Connect
[**listVirtualCrossConnectCoverage**](VirtualCrossConnectsApi.md#listVirtualCrossConnectCoverage) | **GET** /virtual_cross_connects_coverage | List Virtual Cross Connect Cloud Coverage
[**listVirtualCrossConnects**](VirtualCrossConnectsApi.md#listVirtualCrossConnects) | **GET** /virtual_cross_connects | List all Virtual Cross Connects
[**updateVirtualCrossConnect**](VirtualCrossConnectsApi.md#updateVirtualCrossConnect) | **PATCH** /virtual_cross_connects/{id} | Update the Virtual Cross Connect



## createVirtualCrossConnect

> CreateVirtualCrossConnect200Response createVirtualCrossConnect(virtualCrossConnectCreate)

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
            CreateVirtualCrossConnect200Response result = apiInstance.createVirtualCrossConnect(virtualCrossConnectCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualCrossConnectsApi#createVirtualCrossConnect");
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

[**CreateVirtualCrossConnect200Response**](CreateVirtualCrossConnect200Response.md)

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


## deleteVirtualCrossConnect

> CreateVirtualCrossConnect200Response deleteVirtualCrossConnect(id)

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
            CreateVirtualCrossConnect200Response result = apiInstance.deleteVirtualCrossConnect(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualCrossConnectsApi#deleteVirtualCrossConnect");
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

[**CreateVirtualCrossConnect200Response**](CreateVirtualCrossConnect200Response.md)

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


## getVirtualCrossConnect

> CreateVirtualCrossConnect200Response getVirtualCrossConnect(id)

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
            CreateVirtualCrossConnect200Response result = apiInstance.getVirtualCrossConnect(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualCrossConnectsApi#getVirtualCrossConnect");
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

[**CreateVirtualCrossConnect200Response**](CreateVirtualCrossConnect200Response.md)

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


## listVirtualCrossConnectCoverage

> ListVirtualCrossConnectCoverage200Response listVirtualCrossConnectCoverage(pageNumber, pageSize, filtersAvailableBandwidthContains, filterCloudProvider, filterCloudProviderRegion, filterLocationRegion, filterLocationSite, filterLocationPop, filterLocationCode)

List Virtual Cross Connect Cloud Coverage

List Virtual Cross Connects Cloud Coverage.<br /><br />This endpoint shows which cloud regions are available for the `location_code` your Virtual Cross Connect will be provisioned in.

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
        Integer filtersAvailableBandwidthContains = 50; // Integer | The available bandwidth to filter on.
        String filterCloudProvider = "aws"; // String | The Telnyx region code
        String filterCloudProviderRegion = "us-east-1"; // String | The cloud provider region code to filter on
        String filterLocationRegion = "AMER"; // String | The region of associated location to filter on.
        String filterLocationSite = "SJC"; // String | The site of associated location to filter on.
        String filterLocationPop = "SV1"; // String | The POP of associated location to filter on.
        String filterLocationCode = "silicon_valley-ca"; // String | The code of associated location to filter on.
        try {
            ListVirtualCrossConnectCoverage200Response result = apiInstance.listVirtualCrossConnectCoverage(pageNumber, pageSize, filtersAvailableBandwidthContains, filterCloudProvider, filterCloudProviderRegion, filterLocationRegion, filterLocationSite, filterLocationPop, filterLocationCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualCrossConnectsApi#listVirtualCrossConnectCoverage");
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
 **filtersAvailableBandwidthContains** | **Integer**| The available bandwidth to filter on. | [optional]
 **filterCloudProvider** | **String**| The Telnyx region code | [optional] [enum: aws, azure, gce]
 **filterCloudProviderRegion** | **String**| The cloud provider region code to filter on | [optional]
 **filterLocationRegion** | **String**| The region of associated location to filter on. | [optional]
 **filterLocationSite** | **String**| The site of associated location to filter on. | [optional]
 **filterLocationPop** | **String**| The POP of associated location to filter on. | [optional]
 **filterLocationCode** | **String**| The code of associated location to filter on. | [optional]

### Return type

[**ListVirtualCrossConnectCoverage200Response**](ListVirtualCrossConnectCoverage200Response.md)

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


## listVirtualCrossConnects

> ListVirtualCrossConnects200Response listVirtualCrossConnects(pageNumber, pageSize, filterNetworkId)

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
            ListVirtualCrossConnects200Response result = apiInstance.listVirtualCrossConnects(pageNumber, pageSize, filterNetworkId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualCrossConnectsApi#listVirtualCrossConnects");
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

[**ListVirtualCrossConnects200Response**](ListVirtualCrossConnects200Response.md)

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


## updateVirtualCrossConnect

> CreateVirtualCrossConnect200Response updateVirtualCrossConnect(id, virtualCrossConnectPatch)

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
            CreateVirtualCrossConnect200Response result = apiInstance.updateVirtualCrossConnect(id, virtualCrossConnectPatch);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VirtualCrossConnectsApi#updateVirtualCrossConnect");
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

[**CreateVirtualCrossConnect200Response**](CreateVirtualCrossConnect200Response.md)

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

