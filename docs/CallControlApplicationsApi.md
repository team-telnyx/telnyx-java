# CallControlApplicationsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCallControlApplication**](CallControlApplicationsApi.md#createCallControlApplication) | **POST** /call_control_applications | Create a call control application
[**deleteCallControlApplication**](CallControlApplicationsApi.md#deleteCallControlApplication) | **DELETE** /call_control_applications/{id} | Delete a call control application
[**listCallControlApplications**](CallControlApplicationsApi.md#listCallControlApplications) | **GET** /call_control_applications | List call control applications
[**retrieveCallControlApplication**](CallControlApplicationsApi.md#retrieveCallControlApplication) | **GET** /call_control_applications/{id} | Retrieve a call control application
[**updateCallControlApplication**](CallControlApplicationsApi.md#updateCallControlApplication) | **PATCH** /call_control_applications/{id} | Update a call control application



## createCallControlApplication

> CallControlApplicationResponse createCallControlApplication(createCallControlApplicationRequest)

Create a call control application

Create a call control application.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallControlApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallControlApplicationsApi apiInstance = new CallControlApplicationsApi(defaultClient);
        CreateCallControlApplicationRequest createCallControlApplicationRequest = new CreateCallControlApplicationRequest(); // CreateCallControlApplicationRequest | Create call control application request.
        try {
            CallControlApplicationResponse result = apiInstance.createCallControlApplication(createCallControlApplicationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallControlApplicationsApi#createCallControlApplication");
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
 **createCallControlApplicationRequest** | [**CreateCallControlApplicationRequest**](CreateCallControlApplicationRequest.md)| Create call control application request. |

### Return type

[**CallControlApplicationResponse**](CallControlApplicationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response with details about a call control application. |  -  |
| **422** | Bad Request |  -  |


## deleteCallControlApplication

> CallControlApplicationResponse deleteCallControlApplication(id)

Delete a call control application

Deletes a call control application.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallControlApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallControlApplicationsApi apiInstance = new CallControlApplicationsApi(defaultClient);
        String id = 1293384261075731499; // String | Identifies the resource.
        try {
            CallControlApplicationResponse result = apiInstance.deleteCallControlApplication(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallControlApplicationsApi#deleteCallControlApplication");
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

[**CallControlApplicationResponse**](CallControlApplicationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a call control application. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |


## listCallControlApplications

> ListCallControlApplicationsResponse listCallControlApplications().pageNumber(pageNumber).pageSize(pageSize).filterApplicationNameContains(filterApplicationNameContains).filterOutboundVoiceProfileId(filterOutboundVoiceProfileId).sort(sort).execute();

List call control applications

Return a list of call control applications.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallControlApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallControlApplicationsApi apiInstance = new CallControlApplicationsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterApplicationNameContains = "\"null\""; // String | If present, applications with <code>application_name</code> containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters.
        String filterOutboundVoiceProfileId = 1293384261075731499; // String | Identifies the associated outbound voice profile.
        String sort = connection_name; // String | Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the <code> -</code> prefix.<br/><br/> That is: <ul>   <li>     <code>connection_name</code>: sorts the result by the     <code>connection_name</code> field in ascending order.   </li>    <li>     <code>-connection_name</code>: sorts the result by the     <code>connection_name</code> field in descending order.   </li> </ul> <br/> If not given, results are sorted by <code>created_at</code> in descending order.
        try {
            ListCallControlApplicationsResponse result = api.listCallControlApplications()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .filterApplicationNameContains(filterApplicationNameContains)
                .filterOutboundVoiceProfileId(filterOutboundVoiceProfileId)
                .sort(sort)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallControlApplicationsApi#listCallControlApplications");
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
 **filterApplicationNameContains** | **String**| If present, applications with &lt;code&gt;application_name&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters. | [optional] [default to &quot;null&quot;]
 **filterOutboundVoiceProfileId** | **String**| Identifies the associated outbound voice profile. | [optional]
 **sort** | **String**| Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt; -&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; If not given, results are sorted by &lt;code&gt;created_at&lt;/code&gt; in descending order. | [optional] [default to created_at] [enum: created_at, connection_name, active]

### Return type

[**ListCallControlApplicationsResponse**](ListCallControlApplicationsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of call control applications. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |


## retrieveCallControlApplication

> CallControlApplicationResponse retrieveCallControlApplication(id)

Retrieve a call control application

Retrieves the details of an existing call control application.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallControlApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallControlApplicationsApi apiInstance = new CallControlApplicationsApi(defaultClient);
        String id = 1293384261075731499; // String | Identifies the resource.
        try {
            CallControlApplicationResponse result = apiInstance.retrieveCallControlApplication(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallControlApplicationsApi#retrieveCallControlApplication");
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

[**CallControlApplicationResponse**](CallControlApplicationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a call control application. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |


## updateCallControlApplication

> CallControlApplicationResponse updateCallControlApplication(id, updateCallControlApplicationRequest)

Update a call control application

Updates settings of an existing call control application.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallControlApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallControlApplicationsApi apiInstance = new CallControlApplicationsApi(defaultClient);
        String id = 1293384261075731499; // String | Identifies the resource.
        UpdateCallControlApplicationRequest updateCallControlApplicationRequest = new UpdateCallControlApplicationRequest(); // UpdateCallControlApplicationRequest | Update call control application request.
        try {
            CallControlApplicationResponse result = apiInstance.updateCallControlApplication(id, updateCallControlApplicationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallControlApplicationsApi#updateCallControlApplication");
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
 **updateCallControlApplicationRequest** | [**UpdateCallControlApplicationRequest**](UpdateCallControlApplicationRequest.md)| Update call control application request. |

### Return type

[**CallControlApplicationResponse**](CallControlApplicationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a call control application. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |

