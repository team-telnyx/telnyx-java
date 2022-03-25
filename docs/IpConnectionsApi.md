# IpConnectionsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIpConnection**](IpConnectionsApi.md#createIpConnection) | **POST** /ip_connections | Create an Ip connection
[**deleteIpConnection**](IpConnectionsApi.md#deleteIpConnection) | **DELETE** /ip_connections/{id} | Delete an Ip connection
[**listIpConnections**](IpConnectionsApi.md#listIpConnections) | **GET** /ip_connections | List Ip connections
[**retrieveIpConnection**](IpConnectionsApi.md#retrieveIpConnection) | **GET** /ip_connections/{id} | Retrieve an Ip connection
[**updateIpConnection**](IpConnectionsApi.md#updateIpConnection) | **PATCH** /ip_connections/{id} | Update an Ip connection



## createIpConnection

> IpConnectionResponse createIpConnection(createIpConnectionRequest)

Create an Ip connection

Creates an IP connection.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.IpConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        IpConnectionsApi apiInstance = new IpConnectionsApi(defaultClient);
        CreateIpConnectionRequest createIpConnectionRequest = new CreateIpConnectionRequest(); // CreateIpConnectionRequest | Parameters that can be defined during IP connection creation
        try {
            IpConnectionResponse result = apiInstance.createIpConnection(createIpConnectionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpConnectionsApi#createIpConnection");
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
 **createIpConnectionRequest** | [**CreateIpConnectionRequest**](CreateIpConnectionRequest.md)| Parameters that can be defined during IP connection creation |

### Return type

[**IpConnectionResponse**](IpConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response with details about an IP connection. |  -  |
| **422** | Bad request |  -  |


## deleteIpConnection

> IpConnectionResponse deleteIpConnection(id)

Delete an Ip connection

Deletes an existing IP connection.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.IpConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        IpConnectionsApi apiInstance = new IpConnectionsApi(defaultClient);
        String id = "id_example"; // String | Identifies the type of resource.
        try {
            IpConnectionResponse result = apiInstance.deleteIpConnection(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpConnectionsApi#deleteIpConnection");
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
 **id** | **String**| Identifies the type of resource. |

### Return type

[**IpConnectionResponse**](IpConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about an IP connection. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |


## listIpConnections

> ListIpConnectionsResponse listIpConnections().pageNumber(pageNumber).pageSize(pageSize).filterConnectionNameContains(filterConnectionNameContains).filterOutboundOutboundVoiceProfileId(filterOutboundOutboundVoiceProfileId).sort(sort).execute();

List Ip connections

Returns a list of your IP connections.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.IpConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        IpConnectionsApi apiInstance = new IpConnectionsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterConnectionNameContains = "null"; // String | If present, connections with <code>connection_name</code> containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters.
        String filterOutboundOutboundVoiceProfileId = "1293384261075731499"; // String | Identifies the associated outbound voice profile.
        String sort = "created_at"; // String | Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the <code> -</code> prefix.<br/><br/> That is: <ul>   <li>     <code>connection_name</code>: sorts the result by the     <code>connection_name</code> field in ascending order.   </li>    <li>     <code>-connection_name</code>: sorts the result by the     <code>connection_name</code> field in descending order.   </li> </ul> <br/> If not given, results are sorted by <code>created_at</code> in descending order.
        try {
            ListIpConnectionsResponse result = api.listIpConnections()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .filterConnectionNameContains(filterConnectionNameContains)
                .filterOutboundOutboundVoiceProfileId(filterOutboundOutboundVoiceProfileId)
                .sort(sort)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpConnectionsApi#listIpConnections");
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
 **filterConnectionNameContains** | **String**| If present, connections with &lt;code&gt;connection_name&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters. | [optional] [default to null]
 **filterOutboundOutboundVoiceProfileId** | **String**| Identifies the associated outbound voice profile. | [optional]
 **sort** | **String**| Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt; -&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; If not given, results are sorted by &lt;code&gt;created_at&lt;/code&gt; in descending order. | [optional] [default to created_at] [enum: created_at, connection_name, active]

### Return type

[**ListIpConnectionsResponse**](ListIpConnectionsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of IP connections. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |


## retrieveIpConnection

> IpConnectionResponse retrieveIpConnection(id)

Retrieve an Ip connection

Retrieves the details of an existing ip connection.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.IpConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        IpConnectionsApi apiInstance = new IpConnectionsApi(defaultClient);
        String id = "id_example"; // String | IP Connection ID
        try {
            IpConnectionResponse result = apiInstance.retrieveIpConnection(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpConnectionsApi#retrieveIpConnection");
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
 **id** | **String**| IP Connection ID |

### Return type

[**IpConnectionResponse**](IpConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about an IP connection. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |


## updateIpConnection

> IpConnectionResponse updateIpConnection(id, updateIpConnectionRequest)

Update an Ip connection

Updates settings of an existing IP connection.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.IpConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        IpConnectionsApi apiInstance = new IpConnectionsApi(defaultClient);
        String id = "id_example"; // String | Identifies the type of resource.
        UpdateIpConnectionRequest updateIpConnectionRequest = new UpdateIpConnectionRequest(); // UpdateIpConnectionRequest | Parameters that can be updated in a IP connection
        try {
            IpConnectionResponse result = apiInstance.updateIpConnection(id, updateIpConnectionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpConnectionsApi#updateIpConnection");
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
 **id** | **String**| Identifies the type of resource. |
 **updateIpConnectionRequest** | [**UpdateIpConnectionRequest**](UpdateIpConnectionRequest.md)| Parameters that can be updated in a IP connection |

### Return type

[**IpConnectionResponse**](IpConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about an IP connection. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |

