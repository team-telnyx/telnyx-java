# CallControlApplicationsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCallControlApplication**](CallControlApplicationsApi.md#createCallControlApplication) | **POST** /call_control_applications | Create a call control application
[**deleteCallControlApplication**](CallControlApplicationsApi.md#deleteCallControlApplication) | **DELETE** /call_control_applications/{id} | Delete a call control application
[**listCallControlApplications**](CallControlApplicationsApi.md#listCallControlApplications) | **GET** /call_control_applications | List call control applications
[**retrieveCallControlApplication**](CallControlApplicationsApi.md#retrieveCallControlApplication) | **GET** /call_control_applications/{id} | Retrieve a call control application
[**updateCallControlApplication**](CallControlApplicationsApi.md#updateCallControlApplication) | **PATCH** /call_control_applications/{id} | Update a call control application

<a name="createCallControlApplication"></a>
# **createCallControlApplication**
> CallControlApplicationResponse createCallControlApplication(body)

Create a call control application

Create a call control application.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CallControlApplicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallControlApplicationsApi apiInstance = new CallControlApplicationsApi();
CreateCallControlApplicationRequest body = new CreateCallControlApplicationRequest(); // CreateCallControlApplicationRequest | Create call control application request.
try {
    CallControlApplicationResponse result = apiInstance.createCallControlApplication(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallControlApplicationsApi#createCallControlApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateCallControlApplicationRequest**](CreateCallControlApplicationRequest.md)| Create call control application request. |

### Return type

[**CallControlApplicationResponse**](CallControlApplicationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCallControlApplication"></a>
# **deleteCallControlApplication**
> CallControlApplicationResponse deleteCallControlApplication(id)

Delete a call control application

Deletes a call control application.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CallControlApplicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallControlApplicationsApi apiInstance = new CallControlApplicationsApi();
String id = "id_example"; // String | Identifies the resource.
try {
    CallControlApplicationResponse result = apiInstance.deleteCallControlApplication(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallControlApplicationsApi#deleteCallControlApplication");
    e.printStackTrace();
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

<a name="listCallControlApplications"></a>
# **listCallControlApplications**
> ListCallControlApplicationsResponse listCallControlApplications(pageNumber, pageSize, filterApplicationNameContains, filterOutboundOutboundVoiceProfileId, sort)

List call control applications

Return a list of call control applications.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CallControlApplicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallControlApplicationsApi apiInstance = new CallControlApplicationsApi();
Integer pageNumber = 1; // Integer | The page number to load
Integer pageSize = 20; // Integer | The size of the page
String filterApplicationNameContains = "null"; // String | If present, applications with <code>application_name</code> containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters.
String filterOutboundOutboundVoiceProfileId = "filterOutboundOutboundVoiceProfileId_example"; // String | Identifies the associated outbound voice profile.
String sort = "created_at"; // String | Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the <code> -</code> prefix.<br/><br/> That is: <ul>   <li>     <code>connection_name</code>: sorts the result by the     <code>connection_name</code> field in ascending order.   </li>    <li>     <code>-connection_name</code>: sorts the result by the     <code>connection_name</code> field in descending order.   </li> </ul> <br/> If not given, results are sorted by <code>created_at</code> in descending order.
try {
    ListCallControlApplicationsResponse result = apiInstance.listCallControlApplications(pageNumber, pageSize, filterApplicationNameContains, filterOutboundOutboundVoiceProfileId, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallControlApplicationsApi#listCallControlApplications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1] [enum: ]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20] [enum: ]
 **filterApplicationNameContains** | **String**| If present, applications with &lt;code&gt;application_name&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters. | [optional] [default to null]
 **filterOutboundOutboundVoiceProfileId** | **String**| Identifies the associated outbound voice profile. | [optional]
 **sort** | **String**| Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt; -&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; If not given, results are sorted by &lt;code&gt;created_at&lt;/code&gt; in descending order. | [optional] [default to created_at] [enum: created_at, connection_name, active]

### Return type

[**ListCallControlApplicationsResponse**](ListCallControlApplicationsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveCallControlApplication"></a>
# **retrieveCallControlApplication**
> CallControlApplicationResponse retrieveCallControlApplication(id)

Retrieve a call control application

Retrieves the details of an existing call control application.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CallControlApplicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallControlApplicationsApi apiInstance = new CallControlApplicationsApi();
String id = "id_example"; // String | Identifies the resource.
try {
    CallControlApplicationResponse result = apiInstance.retrieveCallControlApplication(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallControlApplicationsApi#retrieveCallControlApplication");
    e.printStackTrace();
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

<a name="updateCallControlApplication"></a>
# **updateCallControlApplication**
> CallControlApplicationResponse updateCallControlApplication(body, id)

Update a call control application

Updates settings of an existing call control application.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CallControlApplicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallControlApplicationsApi apiInstance = new CallControlApplicationsApi();
UpdateCallControlApplicationRequest body = new UpdateCallControlApplicationRequest(); // UpdateCallControlApplicationRequest | Update call control application request.
String id = "id_example"; // String | Identifies the resource.
try {
    CallControlApplicationResponse result = apiInstance.updateCallControlApplication(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallControlApplicationsApi#updateCallControlApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateCallControlApplicationRequest**](UpdateCallControlApplicationRequest.md)| Update call control application request. |
 **id** | **String**| Identifies the resource. |

### Return type

[**CallControlApplicationResponse**](CallControlApplicationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

