# WireGuardInterfacesApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**wireguardInterfaceCreate**](WireGuardInterfacesApi.md#wireguardInterfaceCreate) | **POST** /wireguard_interfaces | Create a WireGuard Interface
[**wireguardInterfaceDelete**](WireGuardInterfacesApi.md#wireguardInterfaceDelete) | **DELETE** /wireguard_interfaces/{id} | Delete a WireGuard Interface
[**wireguardInterfaceGet**](WireGuardInterfacesApi.md#wireguardInterfaceGet) | **GET** /wireguard_interfaces/{id} | Retrieve a WireGuard Interfaces
[**wireguardInterfaceList**](WireGuardInterfacesApi.md#wireguardInterfaceList) | **GET** /wireguard_interfaces | List all WireGuard Interfaces
[**wireguardPeerAllowedIPGet**](WireGuardInterfacesApi.md#wireguardPeerAllowedIPGet) | **GET** /wireguard_peers/{id}/allowed_ips/{child_id} | Retrieve the Allowed IP
[**wireguardPeerAllowedIPList**](WireGuardInterfacesApi.md#wireguardPeerAllowedIPList) | **GET** /wireguard_peers/{id}/allowed_ips | List all Allowed IPs for a WireGuard Peer
[**wireguardPeerConfig**](WireGuardInterfacesApi.md#wireguardPeerConfig) | **GET** /wireguard_peers/{id}/config | Retrieve Wireguard config template for Peer
[**wireguardPeerCreate**](WireGuardInterfacesApi.md#wireguardPeerCreate) | **POST** /wireguard_peers | Create a WireGuard Peer
[**wireguardPeerDelete**](WireGuardInterfacesApi.md#wireguardPeerDelete) | **DELETE** /wireguard_peers/{id} | Delete the WireGuard Peer
[**wireguardPeerGet**](WireGuardInterfacesApi.md#wireguardPeerGet) | **GET** /wireguard_peers/{id} | Retrieve the WireGuard Peer
[**wireguardPeerList**](WireGuardInterfacesApi.md#wireguardPeerList) | **GET** /wireguard_peers | List all WireGuard Peers
[**wireguardPeerUpdate**](WireGuardInterfacesApi.md#wireguardPeerUpdate) | **PATCH** /wireguard_peers/{id} | Update the WireGuard Peer



## wireguardInterfaceCreate

> WireguardInterfaceCreate202Response wireguardInterfaceCreate(wireguardInterfaceCreate)

Create a WireGuard Interface

Create a new WireGuard Interface. Current limitation of 10 interfaces per user can be created.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WireGuardInterfacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WireGuardInterfacesApi apiInstance = new WireGuardInterfacesApi(defaultClient);
        WireguardInterfaceCreate wireguardInterfaceCreate = new WireguardInterfaceCreate(); // WireguardInterfaceCreate | 
        try {
            WireguardInterfaceCreate202Response result = apiInstance.wireguardInterfaceCreate(wireguardInterfaceCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WireGuardInterfacesApi#wireguardInterfaceCreate");
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
 **wireguardInterfaceCreate** | [**WireguardInterfaceCreate**](WireguardInterfaceCreate.md)|  |

### Return type

[**WireguardInterfaceCreate202Response**](WireguardInterfaceCreate202Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful response |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |
| **0** | Unexpected error |  -  |


## wireguardInterfaceDelete

> WireguardInterfaceCreate202Response wireguardInterfaceDelete(id)

Delete a WireGuard Interface

Delete a WireGuard Interface.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WireGuardInterfacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WireGuardInterfacesApi apiInstance = new WireGuardInterfacesApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            WireguardInterfaceCreate202Response result = apiInstance.wireguardInterfaceDelete(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WireGuardInterfacesApi#wireguardInterfaceDelete");
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

[**WireguardInterfaceCreate202Response**](WireguardInterfaceCreate202Response.md)

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


## wireguardInterfaceGet

> WireguardInterfaceCreate202Response wireguardInterfaceGet(id)

Retrieve a WireGuard Interfaces

Retrieve a WireGuard Interfaces.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WireGuardInterfacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WireGuardInterfacesApi apiInstance = new WireGuardInterfacesApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            WireguardInterfaceCreate202Response result = apiInstance.wireguardInterfaceGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WireGuardInterfacesApi#wireguardInterfaceGet");
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

[**WireguardInterfaceCreate202Response**](WireguardInterfaceCreate202Response.md)

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


## wireguardInterfaceList

> WireguardInterfaceList200Response wireguardInterfaceList(pageNumber, pageSize, filterNetworkId)

List all WireGuard Interfaces

List all WireGuard Interfaces.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WireGuardInterfacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WireGuardInterfacesApi apiInstance = new WireGuardInterfacesApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterNetworkId = "6a09cdc3-8948-47f0-aa62-74ac943d6c58"; // String | The associated network id to filter on.
        try {
            WireguardInterfaceList200Response result = apiInstance.wireguardInterfaceList(pageNumber, pageSize, filterNetworkId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WireGuardInterfacesApi#wireguardInterfaceList");
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

[**WireguardInterfaceList200Response**](WireguardInterfaceList200Response.md)

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


## wireguardPeerAllowedIPGet

> WireguardPeerAllowedIPGet200Response wireguardPeerAllowedIPGet(id, childId)

Retrieve the Allowed IP

Retrieve the Allowed IP.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WireGuardInterfacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WireGuardInterfacesApi apiInstance = new WireGuardInterfacesApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        UUID childId = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the child resource
        try {
            WireguardPeerAllowedIPGet200Response result = apiInstance.wireguardPeerAllowedIPGet(id, childId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WireGuardInterfacesApi#wireguardPeerAllowedIPGet");
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
 **childId** | **UUID**| Identifies the child resource |

### Return type

[**WireguardPeerAllowedIPGet200Response**](WireguardPeerAllowedIPGet200Response.md)

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


## wireguardPeerAllowedIPList

> WireguardPeerAllowedIPList200Response wireguardPeerAllowedIPList(id, pageNumber, pageSize)

List all Allowed IPs for a WireGuard Peer

List all Allowed IPs for a WireGuard peer.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WireGuardInterfacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WireGuardInterfacesApi apiInstance = new WireGuardInterfacesApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            WireguardPeerAllowedIPList200Response result = apiInstance.wireguardPeerAllowedIPList(id, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WireGuardInterfacesApi#wireguardPeerAllowedIPList");
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
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**WireguardPeerAllowedIPList200Response**](WireguardPeerAllowedIPList200Response.md)

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


## wireguardPeerConfig

> String wireguardPeerConfig(id)

Retrieve Wireguard config template for Peer

Retrieve Wireguard config template for Peer

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WireGuardInterfacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WireGuardInterfacesApi apiInstance = new WireGuardInterfacesApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            String result = apiInstance.wireguardPeerConfig(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WireGuardInterfacesApi#wireguardPeerConfig");
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

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain; charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |


## wireguardPeerCreate

> WireguardPeerCreate202Response wireguardPeerCreate(id, wireguardPeerCreate)

Create a WireGuard Peer

Create a new WireGuard Peer. Current limitation of 5 peers per interface can be created.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WireGuardInterfacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WireGuardInterfacesApi apiInstance = new WireGuardInterfacesApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        WireguardPeerCreate wireguardPeerCreate = new WireguardPeerCreate(); // WireguardPeerCreate | 
        try {
            WireguardPeerCreate202Response result = apiInstance.wireguardPeerCreate(id, wireguardPeerCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WireGuardInterfacesApi#wireguardPeerCreate");
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
 **wireguardPeerCreate** | [**WireguardPeerCreate**](WireguardPeerCreate.md)|  |

### Return type

[**WireguardPeerCreate202Response**](WireguardPeerCreate202Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful response |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |
| **0** | Unexpected error |  -  |


## wireguardPeerDelete

> WireguardPeerCreate202Response wireguardPeerDelete(id)

Delete the WireGuard Peer

Delete the WireGuard peer.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WireGuardInterfacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WireGuardInterfacesApi apiInstance = new WireGuardInterfacesApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            WireguardPeerCreate202Response result = apiInstance.wireguardPeerDelete(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WireGuardInterfacesApi#wireguardPeerDelete");
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

[**WireguardPeerCreate202Response**](WireguardPeerCreate202Response.md)

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


## wireguardPeerGet

> WireguardPeerCreate202Response wireguardPeerGet(id)

Retrieve the WireGuard Peer

Retrieve the WireGuard peer.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WireGuardInterfacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WireGuardInterfacesApi apiInstance = new WireGuardInterfacesApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            WireguardPeerCreate202Response result = apiInstance.wireguardPeerGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WireGuardInterfacesApi#wireguardPeerGet");
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

[**WireguardPeerCreate202Response**](WireguardPeerCreate202Response.md)

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


## wireguardPeerList

> WireguardPeerList200Response wireguardPeerList(id, pageNumber, pageSize, filterWireguardInterfaceId)

List all WireGuard Peers

List all WireGuard peers.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WireGuardInterfacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WireGuardInterfacesApi apiInstance = new WireGuardInterfacesApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        UUID filterWireguardInterfaceId = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | The id of the associated WireGuard interface to filter on.
        try {
            WireguardPeerList200Response result = apiInstance.wireguardPeerList(id, pageNumber, pageSize, filterWireguardInterfaceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WireGuardInterfacesApi#wireguardPeerList");
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
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]
 **filterWireguardInterfaceId** | **UUID**| The id of the associated WireGuard interface to filter on. | [optional]

### Return type

[**WireguardPeerList200Response**](WireguardPeerList200Response.md)

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


## wireguardPeerUpdate

> WireguardPeerCreate202Response wireguardPeerUpdate(id, wireguardPeerPatch)

Update the WireGuard Peer

Update the WireGuard peer.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WireGuardInterfacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WireGuardInterfacesApi apiInstance = new WireGuardInterfacesApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        WireguardPeerPatch wireguardPeerPatch = new WireguardPeerPatch(); // WireguardPeerPatch | 
        try {
            WireguardPeerCreate202Response result = apiInstance.wireguardPeerUpdate(id, wireguardPeerPatch);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WireGuardInterfacesApi#wireguardPeerUpdate");
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
 **wireguardPeerPatch** | [**WireguardPeerPatch**](WireguardPeerPatch.md)|  |

### Return type

[**WireguardPeerCreate202Response**](WireguardPeerCreate202Response.md)

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

