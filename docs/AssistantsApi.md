# AssistantsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNewAssistantPublicAssistantsPost**](AssistantsApi.md#createNewAssistantPublicAssistantsPost) | **POST** /ai/assistants | Create an assistant
[**deleteAssistantPublicAssistantsAssistantIdDelete**](AssistantsApi.md#deleteAssistantPublicAssistantsAssistantIdDelete) | **DELETE** /ai/assistants/{assistant_id} | Delete an assistant
[**getAssistantPublicAssistantsAssistantIdGet**](AssistantsApi.md#getAssistantPublicAssistantsAssistantIdGet) | **GET** /ai/assistants/{assistant_id} | Get an assistant
[**getAssistantsPublicAssistantsGet**](AssistantsApi.md#getAssistantsPublicAssistantsGet) | **GET** /ai/assistants | List assistants
[**updateAssistantPublicAssistantsAssistantIdPost**](AssistantsApi.md#updateAssistantPublicAssistantsAssistantIdPost) | **POST** /ai/assistants/{assistant_id} | Update an assistant



## createNewAssistantPublicAssistantsPost

> Assistant createNewAssistantPublicAssistantsPost(createAssistantRequest)

Create an assistant

Create a new AI Assistant.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AssistantsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AssistantsApi apiInstance = new AssistantsApi(defaultClient);
        CreateAssistantRequest createAssistantRequest = new CreateAssistantRequest(); // CreateAssistantRequest | 
        try {
            Assistant result = apiInstance.createNewAssistantPublicAssistantsPost(createAssistantRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssistantsApi#createNewAssistantPublicAssistantsPost");
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
 **createAssistantRequest** | [**CreateAssistantRequest**](CreateAssistantRequest.md)|  |

### Return type

[**Assistant**](Assistant.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## deleteAssistantPublicAssistantsAssistantIdDelete

> AssistantDeletedResponse deleteAssistantPublicAssistantsAssistantIdDelete(assistantId)

Delete an assistant

Delete an AI Assistant by `assistant_id`.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AssistantsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AssistantsApi apiInstance = new AssistantsApi(defaultClient);
        String assistantId = "assistantId_example"; // String | 
        try {
            AssistantDeletedResponse result = apiInstance.deleteAssistantPublicAssistantsAssistantIdDelete(assistantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssistantsApi#deleteAssistantPublicAssistantsAssistantIdDelete");
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
 **assistantId** | **String**|  |

### Return type

[**AssistantDeletedResponse**](AssistantDeletedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## getAssistantPublicAssistantsAssistantIdGet

> Assistant getAssistantPublicAssistantsAssistantIdGet(assistantId)

Get an assistant

Retrieve an AI Assistant configuration by `assistant_id`.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AssistantsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AssistantsApi apiInstance = new AssistantsApi(defaultClient);
        String assistantId = "assistantId_example"; // String | 
        try {
            Assistant result = apiInstance.getAssistantPublicAssistantsAssistantIdGet(assistantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssistantsApi#getAssistantPublicAssistantsAssistantIdGet");
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
 **assistantId** | **String**|  |

### Return type

[**Assistant**](Assistant.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## getAssistantsPublicAssistantsGet

> AssistantsListData getAssistantsPublicAssistantsGet()

List assistants

Retrieve a list of all AI Assistants configured by the user.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AssistantsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AssistantsApi apiInstance = new AssistantsApi(defaultClient);
        try {
            AssistantsListData result = apiInstance.getAssistantsPublicAssistantsGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssistantsApi#getAssistantsPublicAssistantsGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**AssistantsListData**](AssistantsListData.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## updateAssistantPublicAssistantsAssistantIdPost

> Object updateAssistantPublicAssistantsAssistantIdPost(assistantId, updateAssistantRequest)

Update an assistant

Update an AI Assistant's attributes.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AssistantsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AssistantsApi apiInstance = new AssistantsApi(defaultClient);
        String assistantId = "assistantId_example"; // String | 
        UpdateAssistantRequest updateAssistantRequest = new UpdateAssistantRequest(); // UpdateAssistantRequest | 
        try {
            Object result = apiInstance.updateAssistantPublicAssistantsAssistantIdPost(assistantId, updateAssistantRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssistantsApi#updateAssistantPublicAssistantsAssistantIdPost");
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
 **assistantId** | **String**|  |
 **updateAssistantRequest** | [**UpdateAssistantRequest**](UpdateAssistantRequest.md)|  |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

