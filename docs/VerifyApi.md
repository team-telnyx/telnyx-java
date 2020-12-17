# VerifyApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVerification**](VerifyApi.md#createVerification) | **POST** /verifications | Trigger a verification
[**createVerifyProfile**](VerifyApi.md#createVerifyProfile) | **POST** /verify_profiles | Create a Verify profile
[**deleteVerifyProfile**](VerifyApi.md#deleteVerifyProfile) | **DELETE** /verify_profiles/{verify_profile_id} | Delete a Verify profile
[**listVerifyProfiles**](VerifyApi.md#listVerifyProfiles) | **GET** /verify_profiles | List all Verify profiles
[**retrieveVerificationById**](VerifyApi.md#retrieveVerificationById) | **GET** /verifications/{verification_id} | Retrieve a verification
[**retrieveVerificationByPhoneNumber**](VerifyApi.md#retrieveVerificationByPhoneNumber) | **GET** /verifications/by_phone_number/{phone_number} | Retrieve a verification by phone number
[**retrieveVerifyProfile**](VerifyApi.md#retrieveVerifyProfile) | **GET** /verify_profiles/{verify_profile_id} | Retrieve a Verify profile
[**updateVerifyProfile**](VerifyApi.md#updateVerifyProfile) | **PATCH** /verify_profiles/{verify_profile_id} | Update a Verify profile
[**verifyVerificationByPhoneNumber**](VerifyApi.md#verifyVerificationByPhoneNumber) | **POST** /verifications/by_phone_number/{phone_number}/actions/verify | Submit a verification code



## createVerification

> CreateVerificationResponse createVerification(verificationRequest)

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
        VerificationRequest verificationRequest = new VerificationRequest(); // VerificationRequest | 
        try {
            CreateVerificationResponse result = apiInstance.createVerification(verificationRequest);
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
 **verificationRequest** | [**VerificationRequest**](VerificationRequest.md)|  |

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
| **0** | Unexpected error |  -  |


## createVerifyProfile

> CreateVerifyProfileResponse createVerifyProfile(verifyProfileRequest)

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
        VerifyProfileRequest verifyProfileRequest = new VerifyProfileRequest(); // VerifyProfileRequest | 
        try {
            CreateVerifyProfileResponse result = apiInstance.createVerifyProfile(verifyProfileRequest);
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
 **verifyProfileRequest** | [**VerifyProfileRequest**](VerifyProfileRequest.md)|  |

### Return type

[**CreateVerifyProfileResponse**](CreateVerifyProfileResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected Verify profile response to a valid request. |  -  |
| **0** | Unexpected error |  -  |


## deleteVerifyProfile

> DeleteVerifyProfileResponse deleteVerifyProfile(verifyProfileId)

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
            DeleteVerifyProfileResponse result = apiInstance.deleteVerifyProfile(verifyProfileId);
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

[**DeleteVerifyProfileResponse**](DeleteVerifyProfileResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected Verify profile response to a valid request. |  -  |
| **0** | Unexpected error |  -  |


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
| **0** | Unexpected error |  -  |


## retrieveVerificationById

> RetrieveVerificationResponse retrieveVerificationById(verificationId)

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
            RetrieveVerificationResponse result = apiInstance.retrieveVerificationById(verificationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifyApi#retrieveVerificationById");
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
| **0** | Unexpected error |  -  |


## retrieveVerificationByPhoneNumber

> ListVerificationsResponse retrieveVerificationByPhoneNumber(phoneNumber)

Retrieve a verification by phone number

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
        String phoneNumber = +13035551234; // String | The phone number associated with the verification to retrieve.
        try {
            ListVerificationsResponse result = apiInstance.retrieveVerificationByPhoneNumber(phoneNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifyApi#retrieveVerificationByPhoneNumber");
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
 **phoneNumber** | **String**| The phone number associated with the verification to retrieve. |

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
| **0** | Unexpected error |  -  |


## retrieveVerifyProfile

> CreateVerifyProfileResponse retrieveVerifyProfile(verifyProfileId)

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
            CreateVerifyProfileResponse result = apiInstance.retrieveVerifyProfile(verifyProfileId);
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

[**CreateVerifyProfileResponse**](CreateVerifyProfileResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected Verify profile response to a valid request. |  -  |
| **0** | Unexpected error |  -  |


## updateVerifyProfile

> UpdateVerifyProfileResponse updateVerifyProfile(verifyProfileId, verifyProfileRequest)

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
        VerifyProfileRequest verifyProfileRequest = new VerifyProfileRequest(); // VerifyProfileRequest | 
        try {
            UpdateVerifyProfileResponse result = apiInstance.updateVerifyProfile(verifyProfileId, verifyProfileRequest);
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
 **verifyProfileRequest** | [**VerifyProfileRequest**](VerifyProfileRequest.md)|  |

### Return type

[**UpdateVerifyProfileResponse**](UpdateVerifyProfileResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected Verify profile response to a valid request. |  -  |
| **0** | Unexpected error |  -  |


## verifyVerificationByPhoneNumber

> VerificationVerify verifyVerificationByPhoneNumber(phoneNumber, verificationCodeRequest)

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
        String phoneNumber = +13035551234; // String | The phone number associated with the verification being verified.
        VerificationCodeRequest verificationCodeRequest = new VerificationCodeRequest(); // VerificationCodeRequest | 
        try {
            VerificationVerify result = apiInstance.verifyVerificationByPhoneNumber(phoneNumber, verificationCodeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifyApi#verifyVerificationByPhoneNumber");
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
 **phoneNumber** | **String**| The phone number associated with the verification being verified. |
 **verificationCodeRequest** | [**VerificationCodeRequest**](VerificationCodeRequest.md)|  |

### Return type

[**VerificationVerify**](VerificationVerify.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected verify response to a valid request. |  -  |
| **0** | Unexpected error |  -  |

