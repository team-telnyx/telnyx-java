# VerifyApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVerification**](VerifyApi.md#createVerification) | **POST** /verifications | Trigger a verification
[**createVerifyProfile**](VerifyApi.md#createVerifyProfile) | **POST** /verify_profiles | Create a Verify profile
[**deleteVerifyProfile**](VerifyApi.md#deleteVerifyProfile) | **DELETE** /verify_profiles/{verify_profile_id} | Delete a Verify profile
[**listVerifications**](VerifyApi.md#listVerifications) | **GET** /verifications/by_phone_number/{phone_number} | List verifications by phone number
[**listVerifyProfiles**](VerifyApi.md#listVerifyProfiles) | **GET** /verify_profiles | List all Verify profiles
[**retrieveVerification**](VerifyApi.md#retrieveVerification) | **GET** /verifications/{verification_id} | Retrieve a verification
[**retrieveVerifyProfile**](VerifyApi.md#retrieveVerifyProfile) | **GET** /verify_profiles/{verify_profile_id} | Retrieve a Verify profile
[**updateVerifyProfile**](VerifyApi.md#updateVerifyProfile) | **PATCH** /verify_profiles/{verify_profile_id} | Update a Verify profile
[**verifyVerificationCode**](VerifyApi.md#verifyVerificationCode) | **POST** /verifications/by_phone_number/{phone_number}/actions/verify | Submit a verification code



## createVerification

> CreateVerificationResponse createVerification(createVerificationRequest)

Trigger a verification

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VerifyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VerifyApi apiInstance = new VerifyApi(defaultClient);
        CreateVerificationRequest createVerificationRequest = new CreateVerificationRequest(); // CreateVerificationRequest | 
        try {
            CreateVerificationResponse result = apiInstance.createVerification(createVerificationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifyApi#createVerification");
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
 **createVerificationRequest** | [**CreateVerificationRequest**](CreateVerificationRequest.md)|  |

### Return type

[**CreateVerificationResponse**](CreateVerificationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected verifications response to a valid request. |  -  |
| **400** | Unexpected error |  -  |


## createVerifyProfile

> VerifyProfileResponse createVerifyProfile(createVerifyProfileRequest)

Create a Verify profile

Creates a new Verify profile to associate verifications with.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VerifyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VerifyApi apiInstance = new VerifyApi(defaultClient);
        CreateVerifyProfileRequest createVerifyProfileRequest = new CreateVerifyProfileRequest(); // CreateVerifyProfileRequest | 
        try {
            VerifyProfileResponse result = apiInstance.createVerifyProfile(createVerifyProfileRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifyApi#createVerifyProfile");
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
 **createVerifyProfileRequest** | [**CreateVerifyProfileRequest**](CreateVerifyProfileRequest.md)|  |

### Return type

[**VerifyProfileResponse**](VerifyProfileResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected Verify profile response to a valid request. |  -  |
| **400** | Unexpected error |  -  |


## deleteVerifyProfile

> VerifyProfileResponse deleteVerifyProfile(verifyProfileId)

Delete a Verify profile

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VerifyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VerifyApi apiInstance = new VerifyApi(defaultClient);
        UUID verifyProfileId = 12ade33a-21c0-473b-b055-b3c836e1c292; // UUID | The identifier of the Verify profile to delete.
        try {
            VerifyProfileResponse result = apiInstance.deleteVerifyProfile(verifyProfileId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifyApi#deleteVerifyProfile");
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
 **verifyProfileId** | [**UUID**](.md)| The identifier of the Verify profile to delete. |

### Return type

[**VerifyProfileResponse**](VerifyProfileResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected Verify profile response to a valid request. |  -  |
| **400** | Unexpected error |  -  |


## listVerifications

> ListVerificationsResponse listVerifications(phoneNumber)

List verifications by phone number

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VerifyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VerifyApi apiInstance = new VerifyApi(defaultClient);
        String phoneNumber = +13035551234; // String | The phone number associated with the verifications to retrieve.
        try {
            ListVerificationsResponse result = apiInstance.listVerifications(phoneNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifyApi#listVerifications");
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
 **phoneNumber** | **String**| The phone number associated with the verifications to retrieve. |

### Return type

[**ListVerificationsResponse**](ListVerificationsResponse.md)

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


## listVerifyProfiles

> ListVerifyProfilesResponse listVerifyProfiles().filterName(filterName).pageSize(pageSize).pageNumber(pageNumber).execute();

List all Verify profiles

Gets a paginated list of Verify profiles.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VerifyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VerifyApi apiInstance = new VerifyApi(defaultClient);
        String filterName = "filterName_example"; // String | 
        Integer pageSize = 25; // Integer | 
        Integer pageNumber = 1; // Integer | 
        try {
            ListVerifyProfilesResponse result = api.listVerifyProfiles()
                .filterName(filterName)
                .pageSize(pageSize)
                .pageNumber(pageNumber)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifyApi#listVerifyProfiles");
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
 **filterName** | **String**|  | [optional]
 **pageSize** | **Integer**|  | [optional] [default to 25]
 **pageNumber** | **Integer**|  | [optional] [default to 1]

### Return type

[**ListVerifyProfilesResponse**](ListVerifyProfilesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected Verify profile response to a valid request. |  -  |
| **400** | Unexpected error |  -  |


## retrieveVerification

> RetrieveVerificationResponse retrieveVerification(verificationId)

Retrieve a verification

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VerifyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VerifyApi apiInstance = new VerifyApi(defaultClient);
        UUID verificationId = 12ade33a-21c0-473b-b055-b3c836e1c292; // UUID | The identifier of the verification to retrieve.
        try {
            RetrieveVerificationResponse result = apiInstance.retrieveVerification(verificationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifyApi#retrieveVerification");
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
 **verificationId** | [**UUID**](.md)| The identifier of the verification to retrieve. |

### Return type

[**RetrieveVerificationResponse**](RetrieveVerificationResponse.md)

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


## retrieveVerifyProfile

> VerifyProfileResponse retrieveVerifyProfile(verifyProfileId)

Retrieve a Verify profile

Gets a single Verify profile.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VerifyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VerifyApi apiInstance = new VerifyApi(defaultClient);
        UUID verifyProfileId = 12ade33a-21c0-473b-b055-b3c836e1c292; // UUID | The identifier of the Verify profile to retrieve.
        try {
            VerifyProfileResponse result = apiInstance.retrieveVerifyProfile(verifyProfileId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifyApi#retrieveVerifyProfile");
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
 **verifyProfileId** | [**UUID**](.md)| The identifier of the Verify profile to retrieve. |

### Return type

[**VerifyProfileResponse**](VerifyProfileResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected Verify profile response to a valid request. |  -  |
| **400** | Unexpected error |  -  |


## updateVerifyProfile

> VerifyProfileResponse updateVerifyProfile(verifyProfileId, updateVerifyProfileRequest)

Update a Verify profile

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VerifyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VerifyApi apiInstance = new VerifyApi(defaultClient);
        UUID verifyProfileId = 12ade33a-21c0-473b-b055-b3c836e1c292; // UUID | The identifier of the Verify profile to update.
        UpdateVerifyProfileRequest updateVerifyProfileRequest = new UpdateVerifyProfileRequest(); // UpdateVerifyProfileRequest | 
        try {
            VerifyProfileResponse result = apiInstance.updateVerifyProfile(verifyProfileId, updateVerifyProfileRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifyApi#updateVerifyProfile");
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
 **verifyProfileId** | [**UUID**](.md)| The identifier of the Verify profile to update. |
 **updateVerifyProfileRequest** | [**UpdateVerifyProfileRequest**](UpdateVerifyProfileRequest.md)|  |

### Return type

[**VerifyProfileResponse**](VerifyProfileResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected Verify profile response to a valid request. |  -  |
| **400** | Unexpected error |  -  |


## verifyVerificationCode

> VerifyVerificationCodeResponse verifyVerificationCode(phoneNumber, verifyVerificationCodeRequest)

Submit a verification code

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VerifyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VerifyApi apiInstance = new VerifyApi(defaultClient);
        String phoneNumber = +13035551234; // String | The phone number associated with the verification code being verified.
        VerifyVerificationCodeRequest verifyVerificationCodeRequest = new VerifyVerificationCodeRequest(); // VerifyVerificationCodeRequest | 
        try {
            VerifyVerificationCodeResponse result = apiInstance.verifyVerificationCode(phoneNumber, verifyVerificationCodeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifyApi#verifyVerificationCode");
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
 **phoneNumber** | **String**| The phone number associated with the verification code being verified. |
 **verifyVerificationCodeRequest** | [**VerifyVerificationCodeRequest**](VerifyVerificationCodeRequest.md)|  |

### Return type

[**VerifyVerificationCodeResponse**](VerifyVerificationCodeResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected verify response to a valid request. |  -  |
| **400** | Unexpected error |  -  |

