# AuthenticationProvidersApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAuthenticationProvider**](AuthenticationProvidersApi.md#createAuthenticationProvider) | **POST** /authentication_providers | Creates an authentication provider
[**deleteAuthenticationProvider**](AuthenticationProvidersApi.md#deleteAuthenticationProvider) | **DELETE** /authentication_providers/{id} | Deletes an authentication provider
[**findAuthenticationProviders**](AuthenticationProvidersApi.md#findAuthenticationProviders) | **GET** /authentication_providers | List all SSO authentication providers
[**getAuthenticationProvider**](AuthenticationProvidersApi.md#getAuthenticationProvider) | **GET** /authentication_providers/{id} | Retrieve an authentication provider
[**updateAuthenticationProvider**](AuthenticationProvidersApi.md#updateAuthenticationProvider) | **PATCH** /authentication_providers/{id} | Update an authentication provider



## createAuthenticationProvider

> CreateAuthenticationProvider200Response createAuthenticationProvider(authenticationProviderCreate)

Creates an authentication provider

Creates an authentication provider.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AuthenticationProvidersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AuthenticationProvidersApi apiInstance = new AuthenticationProvidersApi(defaultClient);
        AuthenticationProviderCreate authenticationProviderCreate = new AuthenticationProviderCreate(); // AuthenticationProviderCreate | 
        try {
            CreateAuthenticationProvider200Response result = apiInstance.createAuthenticationProvider(authenticationProviderCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationProvidersApi#createAuthenticationProvider");
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
 **authenticationProviderCreate** | [**AuthenticationProviderCreate**](AuthenticationProviderCreate.md)|  |

### Return type

[**CreateAuthenticationProvider200Response**](CreateAuthenticationProvider200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **422** | Bad request |  -  |


## deleteAuthenticationProvider

> CreateAuthenticationProvider200Response deleteAuthenticationProvider(id)

Deletes an authentication provider

Deletes an existing authentication provider.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AuthenticationProvidersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AuthenticationProvidersApi apiInstance = new AuthenticationProvidersApi(defaultClient);
        String id = "id_example"; // String | authentication provider ID
        try {
            CreateAuthenticationProvider200Response result = apiInstance.deleteAuthenticationProvider(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationProvidersApi#deleteAuthenticationProvider");
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
 **id** | **String**| authentication provider ID |

### Return type

[**CreateAuthenticationProvider200Response**](CreateAuthenticationProvider200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |


## findAuthenticationProviders

> FindAuthenticationProviders200Response findAuthenticationProviders(pageNumber, pageSize, sort)

List all SSO authentication providers

Returns a list of your SSO authentication providers.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AuthenticationProvidersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AuthenticationProvidersApi apiInstance = new AuthenticationProvidersApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String sort = "name"; // String | Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the <code>-</code> prefix.<br/><br/> That is: <ul>   <li>     <code>name</code>: sorts the result by the     <code>name</code> field in ascending order.   </li>   <li>     <code>-name</code>: sorts the result by the     <code>name</code> field in descending order.   </li> </ul><br/>If not given, results are sorted by <code>created_at</code> in descending order.
        try {
            FindAuthenticationProviders200Response result = apiInstance.findAuthenticationProviders(pageNumber, pageSize, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationProvidersApi#findAuthenticationProviders");
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
 **sort** | **String**| Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt;-&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;name&lt;/code&gt;: sorts the result by the     &lt;code&gt;name&lt;/code&gt; field in ascending order.   &lt;/li&gt;   &lt;li&gt;     &lt;code&gt;-name&lt;/code&gt;: sorts the result by the     &lt;code&gt;name&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt;&lt;br/&gt;If not given, results are sorted by &lt;code&gt;created_at&lt;/code&gt; in descending order. | [optional] [default to -created_at] [enum: name, -name, short_name, -short_name, active, -active, created_at, -created_at, updated_at, -updated_at]

### Return type

[**FindAuthenticationProviders200Response**](FindAuthenticationProviders200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |


## getAuthenticationProvider

> CreateAuthenticationProvider200Response getAuthenticationProvider(id)

Retrieve an authentication provider

Retrieves the details of an existing authentication provider.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AuthenticationProvidersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AuthenticationProvidersApi apiInstance = new AuthenticationProvidersApi(defaultClient);
        String id = "id_example"; // String | authentication provider ID
        try {
            CreateAuthenticationProvider200Response result = apiInstance.getAuthenticationProvider(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationProvidersApi#getAuthenticationProvider");
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
 **id** | **String**| authentication provider ID |

### Return type

[**CreateAuthenticationProvider200Response**](CreateAuthenticationProvider200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |


## updateAuthenticationProvider

> CreateAuthenticationProvider200Response updateAuthenticationProvider(id, updateAuthenticationProviderRequest)

Update an authentication provider

Updates settings of an existing authentication provider.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AuthenticationProvidersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AuthenticationProvidersApi apiInstance = new AuthenticationProvidersApi(defaultClient);
        String id = "id_example"; // String | Identifies the resource.
        UpdateAuthenticationProviderRequest updateAuthenticationProviderRequest = new UpdateAuthenticationProviderRequest(); // UpdateAuthenticationProviderRequest | 
        try {
            CreateAuthenticationProvider200Response result = apiInstance.updateAuthenticationProvider(id, updateAuthenticationProviderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationProvidersApi#updateAuthenticationProvider");
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
 **updateAuthenticationProviderRequest** | [**UpdateAuthenticationProviderRequest**](UpdateAuthenticationProviderRequest.md)|  |

### Return type

[**CreateAuthenticationProvider200Response**](CreateAuthenticationProvider200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |

