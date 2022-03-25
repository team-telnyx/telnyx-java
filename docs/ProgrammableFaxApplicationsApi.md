# ProgrammableFaxApplicationsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFaxApplication**](ProgrammableFaxApplicationsApi.md#createFaxApplication) | **POST** /fax_applications | Creates a Fax Application
[**deleteFaxApplication**](ProgrammableFaxApplicationsApi.md#deleteFaxApplication) | **DELETE** /fax_applications/{id} | Deletes a Fax Application
[**getFaxApplication**](ProgrammableFaxApplicationsApi.md#getFaxApplication) | **GET** /fax_applications/{id} | Retrieve a Fax Application
[**listFaxApplications**](ProgrammableFaxApplicationsApi.md#listFaxApplications) | **GET** /fax_applications | List all Fax Applications
[**updateFaxApplication**](ProgrammableFaxApplicationsApi.md#updateFaxApplication) | **PATCH** /fax_applications/{id} | Update a Fax Application



## createFaxApplication

> FaxApplicationResponse createFaxApplication(createFaxApplicationRequest)

Creates a Fax Application

Creates a new Fax Application based on the parameters sent in the request. The application name and webhook URL are required. Once created, you can assign phone numbers to your application using the `/phone_numbers` endpoint.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ProgrammableFaxApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProgrammableFaxApplicationsApi apiInstance = new ProgrammableFaxApplicationsApi(defaultClient);
        CreateFaxApplicationRequest createFaxApplicationRequest = new CreateFaxApplicationRequest(); // CreateFaxApplicationRequest | Parameters that can be set when creating a Fax Application
        try {
            FaxApplicationResponse result = apiInstance.createFaxApplication(createFaxApplicationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammableFaxApplicationsApi#createFaxApplication");
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
 **createFaxApplicationRequest** | [**CreateFaxApplicationRequest**](CreateFaxApplicationRequest.md)| Parameters that can be set when creating a Fax Application |

### Return type

[**FaxApplicationResponse**](FaxApplicationResponse.md)

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


## deleteFaxApplication

> FaxApplicationResponse deleteFaxApplication(id)

Deletes a Fax Application

Permanently deletes a Fax Application. Deletion may be prevented if the application is in use by phone numbers.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ProgrammableFaxApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProgrammableFaxApplicationsApi apiInstance = new ProgrammableFaxApplicationsApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        try {
            FaxApplicationResponse result = apiInstance.deleteFaxApplication(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammableFaxApplicationsApi#deleteFaxApplication");
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

[**FaxApplicationResponse**](FaxApplicationResponse.md)

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


## getFaxApplication

> FaxApplicationResponse getFaxApplication(id)

Retrieve a Fax Application

Return the details of an existing Fax Application inside the 'data' attribute of the response.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ProgrammableFaxApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProgrammableFaxApplicationsApi apiInstance = new ProgrammableFaxApplicationsApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        try {
            FaxApplicationResponse result = apiInstance.getFaxApplication(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammableFaxApplicationsApi#getFaxApplication");
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

[**FaxApplicationResponse**](FaxApplicationResponse.md)

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


## listFaxApplications

> GetAllFaxApplicationsResponse listFaxApplications(pageNumber, pageSize, filterApplicationNameContains, filterOutboundOutboundVoiceProfileId, sort)

List all Fax Applications

This endpoint returns a list of your Fax Applications inside the 'data' attribute of the response. You can adjust which applications are listed by using filters. Fax Applications are used to configure how you send and receive faxes using the Programmable Fax API with Telnyx.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ProgrammableFaxApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProgrammableFaxApplicationsApi apiInstance = new ProgrammableFaxApplicationsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterApplicationNameContains = "null"; // String | If present, applications with <code>application_name</code> containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters.
        String filterOutboundOutboundVoiceProfileId = "1293384261075731499"; // String | Identifies the associated outbound voice profile.
        String sort = "created_at"; // String | Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the <code> -</code> prefix.<br/><br/> That is: <ul>   <li>     <code>connection_name</code>: sorts the result by the     <code>connection_name</code> field in ascending order.   </li>    <li>     <code>-connection_name</code>: sorts the result by the     <code>connection_name</code> field in descending order.   </li> </ul> <br/> If not given, results are sorted by <code>created_at</code> in descending order.
        try {
            GetAllFaxApplicationsResponse result = apiInstance.listFaxApplications(pageNumber, pageSize, filterApplicationNameContains, filterOutboundOutboundVoiceProfileId, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammableFaxApplicationsApi#listFaxApplications");
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
 **filterApplicationNameContains** | **String**| If present, applications with &lt;code&gt;application_name&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters. | [optional] [default to null]
 **filterOutboundOutboundVoiceProfileId** | **String**| Identifies the associated outbound voice profile. | [optional]
 **sort** | **String**| Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt; -&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; If not given, results are sorted by &lt;code&gt;created_at&lt;/code&gt; in descending order. | [optional] [default to created_at] [enum: created_at, connection_name, active]

### Return type

[**GetAllFaxApplicationsResponse**](GetAllFaxApplicationsResponse.md)

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


## updateFaxApplication

> FaxApplicationResponse updateFaxApplication(id, updateFaxApplicationRequest)

Update a Fax Application

Updates settings of an existing Fax Application based on the parameters of the request.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ProgrammableFaxApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProgrammableFaxApplicationsApi apiInstance = new ProgrammableFaxApplicationsApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        UpdateFaxApplicationRequest updateFaxApplicationRequest = new UpdateFaxApplicationRequest(); // UpdateFaxApplicationRequest | Parameters to be updated for the Fax Application
        try {
            FaxApplicationResponse result = apiInstance.updateFaxApplication(id, updateFaxApplicationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProgrammableFaxApplicationsApi#updateFaxApplication");
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
 **updateFaxApplicationRequest** | [**UpdateFaxApplicationRequest**](UpdateFaxApplicationRequest.md)| Parameters to be updated for the Fax Application |

### Return type

[**FaxApplicationResponse**](FaxApplicationResponse.md)

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

