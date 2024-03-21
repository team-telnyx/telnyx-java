# VerifiedNumbersApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVerifiedNumber**](VerifiedNumbersApi.md#createVerifiedNumber) | **POST** /verified_numbers | Request phone number verification
[**deleteVerifiedNumber**](VerifiedNumbersApi.md#deleteVerifiedNumber) | **DELETE** /verified_numbers/{phone_number} | Delete a verified number
[**getVerifiedNumber**](VerifiedNumbersApi.md#getVerifiedNumber) | **GET** /verified_numbers/{phone_number} | Retrieve a verified number
[**listVerifiedNumbers**](VerifiedNumbersApi.md#listVerifiedNumbers) | **GET** /verified_numbers | List all Verified Numbers
[**verifyVerificationCode**](VerifiedNumbersApi.md#verifyVerificationCode) | **POST** /verified_numbers/{phone_number}/actions/verify | Submit verification code



## createVerifiedNumber

> CreateVerifiedNumberResponse createVerifiedNumber(createVerifiedNumberRequest)

Request phone number verification

Initiates phone number verification procedure.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VerifiedNumbersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VerifiedNumbersApi apiInstance = new VerifiedNumbersApi(defaultClient);
        CreateVerifiedNumberRequest createVerifiedNumberRequest = new CreateVerifiedNumberRequest(); // CreateVerifiedNumberRequest | 
        try {
            CreateVerifiedNumberResponse result = apiInstance.createVerifiedNumber(createVerifiedNumberRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifiedNumbersApi#createVerifiedNumber");
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
 **createVerifiedNumberRequest** | [**CreateVerifiedNumberRequest**](CreateVerifiedNumberRequest.md)|  |

### Return type

[**CreateVerifiedNumberResponse**](CreateVerifiedNumberResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response to a valid request. |  -  |
| **400** | Unexpected error |  -  |
| **401** | Unauthorized Request |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |


## deleteVerifiedNumber

> VerifiedNumberResponseDataWrapper deleteVerifiedNumber(phoneNumber)

Delete a verified number

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VerifiedNumbersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VerifiedNumbersApi apiInstance = new VerifiedNumbersApi(defaultClient);
        String phoneNumber = "+15551234567"; // String | The phone number being deleted.
        try {
            VerifiedNumberResponseDataWrapper result = apiInstance.deleteVerifiedNumber(phoneNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifiedNumbersApi#deleteVerifiedNumber");
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
 **phoneNumber** | **String**| The phone number being deleted. |

### Return type

[**VerifiedNumberResponseDataWrapper**](VerifiedNumberResponseDataWrapper.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected verifications response to a valid request. |  -  |
| **400** | Unexpected error |  -  |
| **401** | Unauthorized Request |  -  |
| **404** | Resource Not Found |  -  |


## getVerifiedNumber

> VerifiedNumberResponseDataWrapper getVerifiedNumber(phoneNumber)

Retrieve a verified number

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VerifiedNumbersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VerifiedNumbersApi apiInstance = new VerifiedNumbersApi(defaultClient);
        String phoneNumber = "+15551234567"; // String | The phone number being requested.
        try {
            VerifiedNumberResponseDataWrapper result = apiInstance.getVerifiedNumber(phoneNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifiedNumbersApi#getVerifiedNumber");
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
 **phoneNumber** | **String**| The phone number being requested. |

### Return type

[**VerifiedNumberResponseDataWrapper**](VerifiedNumberResponseDataWrapper.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected verifications response to a valid request. |  -  |
| **400** | Unexpected error |  -  |
| **401** | Unauthorized Request |  -  |
| **404** | Resource Not Found |  -  |


## listVerifiedNumbers

> ListVerifiedNumbersResponse listVerifiedNumbers().pageSize(pageSize).pageNumber(pageNumber).execute();

List all Verified Numbers

Gets a paginated list of Verified Numbers.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VerifiedNumbersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VerifiedNumbersApi apiInstance = new VerifiedNumbersApi(defaultClient);
        Integer pageSize = 25; // Integer | 
        Integer pageNumber = 1; // Integer | 
        try {
            ListVerifiedNumbersResponse result = api.listVerifiedNumbers()
                .pageSize(pageSize)
                .pageNumber(pageNumber)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifiedNumbersApi#listVerifiedNumbers");
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
 **pageSize** | **Integer**|  | [optional] [default to 25]
 **pageNumber** | **Integer**|  | [optional] [default to 1]

### Return type

[**ListVerifiedNumbersResponse**](ListVerifiedNumbersResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response to a valid request. |  -  |
| **400** | Unexpected error |  -  |
| **401** | Unauthorized Request |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |


## verifyVerificationCode

> VerifiedNumberResponseDataWrapper verifyVerificationCode(phoneNumber, verifyVerificationCodeRequest)

Submit verification code

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VerifiedNumbersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VerifiedNumbersApi apiInstance = new VerifiedNumbersApi(defaultClient);
        String phoneNumber = "+15551234567"; // String | The phone number being verified.
        VerifyVerificationCodeRequest verifyVerificationCodeRequest = new VerifyVerificationCodeRequest(); // VerifyVerificationCodeRequest | 
        try {
            VerifiedNumberResponseDataWrapper result = apiInstance.verifyVerificationCode(phoneNumber, verifyVerificationCodeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifiedNumbersApi#verifyVerificationCode");
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
 **phoneNumber** | **String**| The phone number being verified. |
 **verifyVerificationCodeRequest** | [**VerifyVerificationCodeRequest**](VerifyVerificationCodeRequest.md)|  |

### Return type

[**VerifiedNumberResponseDataWrapper**](VerifiedNumberResponseDataWrapper.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response to a valid request. |  -  |
| **400** | Unexpected error |  -  |
| **401** | Unauthorized Request |  -  |
| **404** | Resource Not Found |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |

