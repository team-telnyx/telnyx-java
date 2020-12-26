# TeXmlApplicationsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTexmlApplication**](TeXmlApplicationsApi.md#createTexmlApplication) | **POST** /texml_applications | Creates a TeXML Application
[**deleteTexmlApplication**](TeXmlApplicationsApi.md#deleteTexmlApplication) | **DELETE** /texml_applications/{id} | Deletes a TeXML Application
[**findTexmlApplications**](TeXmlApplicationsApi.md#findTexmlApplications) | **GET** /texml_applications | List all TeXML Applications
[**getTexmlApplication**](TeXmlApplicationsApi.md#getTexmlApplication) | **GET** /texml_applications/{id} | Retrieve a TeXML Application
[**updateTexmlApplication**](TeXmlApplicationsApi.md#updateTexmlApplication) | **PATCH** /texml_applications/{id} | Update a TeXML Application



## createTexmlApplication

> InlineResponse2011 createTexmlApplication(createTexmlApplicationRequest)

Creates a TeXML Application

Creates a TeXML Application.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlApplicationsApi apiInstance = new TeXmlApplicationsApi(defaultClient);
        CreateTexmlApplicationRequest createTexmlApplicationRequest = new CreateTexmlApplicationRequest(); // CreateTexmlApplicationRequest | Parameters that can be set when creating a TeXML Application
        try {
            InlineResponse2011 result = apiInstance.createTexmlApplication(createTexmlApplicationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlApplicationsApi#createTexmlApplication");
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
 **createTexmlApplicationRequest** | [**CreateTexmlApplicationRequest**](CreateTexmlApplicationRequest.md)| Parameters that can be set when creating a TeXML Application |

### Return type

[**InlineResponse2011**](InlineResponse2011.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |
| **422** | Bad request |  -  |


## deleteTexmlApplication

> InlineResponse2011 deleteTexmlApplication(id)

Deletes a TeXML Application

Deletes a TeXML Application.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlApplicationsApi apiInstance = new TeXmlApplicationsApi(defaultClient);
        String id = 1293384261075731499; // String | Identifies the resource.
        try {
            InlineResponse2011 result = apiInstance.deleteTexmlApplication(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlApplicationsApi#deleteTexmlApplication");
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

[**InlineResponse2011**](InlineResponse2011.md)

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


## findTexmlApplications

> InlineResponse2001 findTexmlApplications(pageNumber, pageSize, filterFriendlyNameContains, filterOutboundVoiceProfileId, sort)

List all TeXML Applications

Returns a list of your TeXML Applications.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlApplicationsApi apiInstance = new TeXmlApplicationsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load.
        Integer pageSize = 20; // Integer | The size of the page.
        String filterFriendlyNameContains = "\"null\""; // String | If present, applications with <code>friendly_name</code> containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters.
        String filterOutboundVoiceProfileId = 1293384261075731499; // String | Identifies the associated outbound voice profile.
        String sort = connection_name; // String | Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the <code> -</code> prefix.<br/><br/> That is: <ul>   <li>     <code>connection_name</code>: sorts the result by the     <code>connection_name</code> field in ascending order.   </li>    <li>     <code>-connection_name</code>: sorts the result by the     <code>connection_name</code> field in descending order.   </li> </ul> <br/> If not given, results are sorted by <code>created_at</code> in descending order.
        try {
            InlineResponse2001 result = apiInstance.findTexmlApplications(pageNumber, pageSize, filterFriendlyNameContains, filterOutboundVoiceProfileId, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlApplicationsApi#findTexmlApplications");
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
 **filterFriendlyNameContains** | **String**| If present, applications with &lt;code&gt;friendly_name&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters. | [optional] [default to &quot;null&quot;]
 **filterOutboundVoiceProfileId** | **String**| Identifies the associated outbound voice profile. | [optional]
 **sort** | **String**| Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt; -&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; If not given, results are sorted by &lt;code&gt;created_at&lt;/code&gt; in descending order. | [optional] [default to created_at] [enum: created_at, connection_name, active]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

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


## getTexmlApplication

> InlineResponse2011 getTexmlApplication(id)

Retrieve a TeXML Application

Retrieves the details of an existing TeXML Application.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlApplicationsApi apiInstance = new TeXmlApplicationsApi(defaultClient);
        String id = 1293384261075731499; // String | Identifies the resource.
        try {
            InlineResponse2011 result = apiInstance.getTexmlApplication(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlApplicationsApi#getTexmlApplication");
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

[**InlineResponse2011**](InlineResponse2011.md)

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


## updateTexmlApplication

> InlineResponse2011 updateTexmlApplication(id, updateTexmlApplicationRequest)

Update a TeXML Application

Updates settings of an existing TeXML Application.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlApplicationsApi apiInstance = new TeXmlApplicationsApi(defaultClient);
        String id = 1293384261075731499; // String | Identifies the resource.
        UpdateTexmlApplicationRequest updateTexmlApplicationRequest = new UpdateTexmlApplicationRequest(); // UpdateTexmlApplicationRequest | Parameters that can be updated in a TeXML Application
        try {
            InlineResponse2011 result = apiInstance.updateTexmlApplication(id, updateTexmlApplicationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlApplicationsApi#updateTexmlApplication");
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
 **updateTexmlApplicationRequest** | [**UpdateTexmlApplicationRequest**](UpdateTexmlApplicationRequest.md)| Parameters that can be updated in a TeXML Application |

### Return type

[**InlineResponse2011**](InlineResponse2011.md)

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

