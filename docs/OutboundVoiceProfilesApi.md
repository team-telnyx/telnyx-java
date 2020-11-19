# OutboundVoiceProfilesApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOutboundVoiceProfile**](OutboundVoiceProfilesApi.md#createOutboundVoiceProfile) | **POST** /outbound_voice_profiles | Create an outbound voice profile
[**deleteOutboundVoiceProfile**](OutboundVoiceProfilesApi.md#deleteOutboundVoiceProfile) | **DELETE** /outbound_voice_profiles/{id} | Delete an outbound voice profile
[**getOutboundVoiceProfile**](OutboundVoiceProfilesApi.md#getOutboundVoiceProfile) | **GET** /outbound_voice_profiles/{id} | Retrieve an outbound voice profile
[**getOutboundVoiceProfiles**](OutboundVoiceProfilesApi.md#getOutboundVoiceProfiles) | **GET** /outbound_voice_profiles | Get all outbound voice profiles
[**updateOutboundVoiceProfile**](OutboundVoiceProfilesApi.md#updateOutboundVoiceProfile) | **PATCH** /outbound_voice_profiles/{id} | Updates an existing outbound voice profile.



## createOutboundVoiceProfile

> SingleOutboundVoiceProfile createOutboundVoiceProfile(outboundVoiceProfileWritable)

Create an outbound voice profile

Create an outbound voice profile.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.OutboundVoiceProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OutboundVoiceProfilesApi apiInstance = new OutboundVoiceProfilesApi(defaultClient);
        OutboundVoiceProfileWritable outboundVoiceProfileWritable = new OutboundVoiceProfileWritable(); // OutboundVoiceProfileWritable | Parameters that can be defined when creating an outbound voice profile
        try {
            SingleOutboundVoiceProfile result = apiInstance.createOutboundVoiceProfile(outboundVoiceProfileWritable);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OutboundVoiceProfilesApi#createOutboundVoiceProfile");
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
 **outboundVoiceProfileWritable** | [**OutboundVoiceProfileWritable**](OutboundVoiceProfileWritable.md)| Parameters that can be defined when creating an outbound voice profile |

### Return type

[**SingleOutboundVoiceProfile**](SingleOutboundVoiceProfile.md)

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


## deleteOutboundVoiceProfile

> SingleOutboundVoiceProfile deleteOutboundVoiceProfile(id)

Delete an outbound voice profile

Deletes an existing outbound voice profile.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.OutboundVoiceProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OutboundVoiceProfilesApi apiInstance = new OutboundVoiceProfilesApi(defaultClient);
        String id = 1293384261075731499; // String | Identifies the resource.
        try {
            SingleOutboundVoiceProfile result = apiInstance.deleteOutboundVoiceProfile(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OutboundVoiceProfilesApi#deleteOutboundVoiceProfile");
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

[**SingleOutboundVoiceProfile**](SingleOutboundVoiceProfile.md)

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


## getOutboundVoiceProfile

> SingleOutboundVoiceProfile getOutboundVoiceProfile(id)

Retrieve an outbound voice profile

Retrieves the details of an existing outbound voice profile.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.OutboundVoiceProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OutboundVoiceProfilesApi apiInstance = new OutboundVoiceProfilesApi(defaultClient);
        String id = 1293384261075731499; // String | Identifies the resource.
        try {
            SingleOutboundVoiceProfile result = apiInstance.getOutboundVoiceProfile(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OutboundVoiceProfilesApi#getOutboundVoiceProfile");
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

[**SingleOutboundVoiceProfile**](SingleOutboundVoiceProfile.md)

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


## getOutboundVoiceProfiles

> MultipleOutboundVoiceProfiles getOutboundVoiceProfiles(pageNumber, pageSize, filterNameContains, sort)

Get all outbound voice profiles

Get all outbound voice profiles belonging to the user that match the given filters.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.OutboundVoiceProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OutboundVoiceProfilesApi apiInstance = new OutboundVoiceProfilesApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load.
        Integer pageSize = 20; // Integer | The size of the page.
        String filterNameContains = office-profile; // String | Optional filter on outbound voice profile name.
        String sort = name; // String | Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the <code>-</code> prefix.<br/><br/> That is: <ul>   <li>     <code>name</code>: sorts the result by the     <code>name</code> field in ascending order.   </li>    <li>     <code>-name</code>: sorts the result by the     <code>name</code> field in descending order.   </li> </ul> <br/>
        try {
            MultipleOutboundVoiceProfiles result = apiInstance.getOutboundVoiceProfiles(pageNumber, pageSize, filterNameContains, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OutboundVoiceProfilesApi#getOutboundVoiceProfiles");
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
 **filterNameContains** | **String**| Optional filter on outbound voice profile name. | [optional]
 **sort** | **String**| Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt;-&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;name&lt;/code&gt;: sorts the result by the     &lt;code&gt;name&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-name&lt;/code&gt;: sorts the result by the     &lt;code&gt;name&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; | [optional] [default to -created_at] [enum: enabled, -enabled, created_at, -created_at, name, -name, service_plan, -service_plan, traffic_type, -traffic_type, usage_payment_method, -usage_payment_method]

### Return type

[**MultipleOutboundVoiceProfiles**](MultipleOutboundVoiceProfiles.md)

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
| **422** | Bad request |  -  |


## updateOutboundVoiceProfile

> SingleOutboundVoiceProfile updateOutboundVoiceProfile(id, outboundVoiceProfileWritable)

Updates an existing outbound voice profile.

Updates an existing outbound voice profile.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.OutboundVoiceProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OutboundVoiceProfilesApi apiInstance = new OutboundVoiceProfilesApi(defaultClient);
        String id = 1293384261075731499; // String | Identifies the resource.
        OutboundVoiceProfileWritable outboundVoiceProfileWritable = new OutboundVoiceProfileWritable(); // OutboundVoiceProfileWritable | Parameters that can be updated on an outbound voice profile
        try {
            SingleOutboundVoiceProfile result = apiInstance.updateOutboundVoiceProfile(id, outboundVoiceProfileWritable);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OutboundVoiceProfilesApi#updateOutboundVoiceProfile");
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
 **outboundVoiceProfileWritable** | [**OutboundVoiceProfileWritable**](OutboundVoiceProfileWritable.md)| Parameters that can be updated on an outbound voice profile |

### Return type

[**SingleOutboundVoiceProfile**](SingleOutboundVoiceProfile.md)

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

