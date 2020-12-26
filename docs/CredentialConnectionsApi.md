# CredentialConnectionsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCredentialConnection**](CredentialConnectionsApi.md#createCredentialConnection) | **POST** /credential_connections | Create a credential connection
[**deleteCredentialConnection**](CredentialConnectionsApi.md#deleteCredentialConnection) | **DELETE** /credential_connections/{id} | Delete a credential connection
[**listCredentialConnections**](CredentialConnectionsApi.md#listCredentialConnections) | **GET** /credential_connections | List credential connections
[**retrieveCredentialConnection**](CredentialConnectionsApi.md#retrieveCredentialConnection) | **GET** /credential_connections/{id} | Retrieve a credential connection
[**updateCredentialConnection**](CredentialConnectionsApi.md#updateCredentialConnection) | **PATCH** /credential_connections/{id} | Update a credential connection



## createCredentialConnection

> CredentialConnectionResponse createCredentialConnection(createCredentialConnectionRequest)

Create a credential connection

Creates a credential connection.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CredentialConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CredentialConnectionsApi apiInstance = new CredentialConnectionsApi(defaultClient);
        CreateCredentialConnectionRequest createCredentialConnectionRequest = new CreateCredentialConnectionRequest(); // CreateCredentialConnectionRequest | Parameters that can be defined during credential connection creation
        try {
            CredentialConnectionResponse result = apiInstance.createCredentialConnection(createCredentialConnectionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialConnectionsApi#createCredentialConnection");
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
 **createCredentialConnectionRequest** | [**CreateCredentialConnectionRequest**](CreateCredentialConnectionRequest.md)| Parameters that can be defined during credential connection creation |

### Return type

[**CredentialConnectionResponse**](CredentialConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response with details about a credential connection. |  -  |
| **422** | Bad request |  -  |


## deleteCredentialConnection

> CredentialConnectionResponse deleteCredentialConnection(id)

Delete a credential connection

Deletes an existing credential connection.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CredentialConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CredentialConnectionsApi apiInstance = new CredentialConnectionsApi(defaultClient);
        String id = "id_example"; // String | Identifies the resource.
        try {
            CredentialConnectionResponse result = apiInstance.deleteCredentialConnection(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialConnectionsApi#deleteCredentialConnection");
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
 **id** | **String**| Identifies the resource. |

### Return type

[**CredentialConnectionResponse**](CredentialConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a credential connection. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |


## listCredentialConnections

> ListCredentialConnectionsResponse listCredentialConnections().pageNumber(pageNumber).pageSize(pageSize).filterConnectionNameContains(filterConnectionNameContains).filterOutboundOutboundVoiceProfileId(filterOutboundOutboundVoiceProfileId).sort(sort).execute();

List credential connections

Returns a list of your credential connections.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CredentialConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CredentialConnectionsApi apiInstance = new CredentialConnectionsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load.
        Integer pageSize = 20; // Integer | The size of the page.
        String filterConnectionNameContains = "\"null\""; // String | If present, connections with <code>connection_name</code> containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters.
        String filterOutboundOutboundVoiceProfileId = 1293384261075731499; // String | Identifies the associated outbound voice profile.
        String sort = connection_name; // String | Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the <code> -</code> prefix.<br/><br/> That is: <ul>   <li>     <code>connection_name</code>: sorts the result by the     <code>connection_name</code> field in ascending order.   </li>    <li>     <code>-connection_name</code>: sorts the result by the     <code>connection_name</code> field in descending order.   </li> </ul> <br/> If not given, results are sorted by <code>created_at</code> in descending order.
        try {
            ListCredentialConnectionsResponse result = api.listCredentialConnections()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .filterConnectionNameContains(filterConnectionNameContains)
                .filterOutboundOutboundVoiceProfileId(filterOutboundOutboundVoiceProfileId)
                .sort(sort)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialConnectionsApi#listCredentialConnections");
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
 **pageNumber** | **Integer**| The page number to load. | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page. | [optional] [default to 20]
 **filterConnectionNameContains** | **String**| If present, connections with &lt;code&gt;connection_name&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters. | [optional] [default to &quot;null&quot;]
 **filterOutboundOutboundVoiceProfileId** | **String**| Identifies the associated outbound voice profile. | [optional]
 **sort** | **String**| Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt; -&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; If not given, results are sorted by &lt;code&gt;created_at&lt;/code&gt; in descending order. | [optional] [default to created_at] [enum: created_at, connection_name, active]

### Return type

[**ListCredentialConnectionsResponse**](ListCredentialConnectionsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of credential connections. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |


## retrieveCredentialConnection

> CredentialConnectionResponse retrieveCredentialConnection(id)

Retrieve a credential connection

Retrieves the details of an existing credential connection.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CredentialConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CredentialConnectionsApi apiInstance = new CredentialConnectionsApi(defaultClient);
        String id = "id_example"; // String | Identifies the resource.
        try {
            CredentialConnectionResponse result = apiInstance.retrieveCredentialConnection(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialConnectionsApi#retrieveCredentialConnection");
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
 **id** | **String**| Identifies the resource. |

### Return type

[**CredentialConnectionResponse**](CredentialConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a credential connection. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |


## updateCredentialConnection

> CredentialConnectionResponse updateCredentialConnection(id, updateCredentialConnectionRequest)

Update a credential connection

Updates settings of an existing credential connection.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CredentialConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CredentialConnectionsApi apiInstance = new CredentialConnectionsApi(defaultClient);
        String id = "id_example"; // String | Identifies the resource.
        UpdateCredentialConnectionRequest updateCredentialConnectionRequest = new UpdateCredentialConnectionRequest(); // UpdateCredentialConnectionRequest | Parameters that can be updated in a credential connection
        try {
            CredentialConnectionResponse result = apiInstance.updateCredentialConnection(id, updateCredentialConnectionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialConnectionsApi#updateCredentialConnection");
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
 **id** | **String**| Identifies the resource. |
 **updateCredentialConnectionRequest** | [**UpdateCredentialConnectionRequest**](UpdateCredentialConnectionRequest.md)| Parameters that can be updated in a credential connection |

### Return type

[**CredentialConnectionResponse**](CredentialConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a credential connection. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |

