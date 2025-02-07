# VerifyApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFlashcallVerification**](VerifyApi.md#createFlashcallVerification) | **POST** /verifications/flashcall | Trigger Flash call verification
[**createVerificationCall**](VerifyApi.md#createVerificationCall) | **POST** /verifications/call | Trigger Call verification
[**createVerificationSms**](VerifyApi.md#createVerificationSms) | **POST** /verifications/sms | Trigger SMS verification
[**createVerifyProfile**](VerifyApi.md#createVerifyProfile) | **POST** /verify_profiles | Create a Verify profile
[**deleteProfile**](VerifyApi.md#deleteProfile) | **DELETE** /verify_profiles/{verify_profile_id} | Delete Verify profile
[**getVerifyProfile**](VerifyApi.md#getVerifyProfile) | **GET** /verify_profiles/{verify_profile_id} | Retrieve Verify profile
[**listProfileMessageTemplates**](VerifyApi.md#listProfileMessageTemplates) | **GET** /verify_profiles/templates | Retrieve Verify profile message templates
[**listProfiles**](VerifyApi.md#listProfiles) | **GET** /verify_profiles | List all Verify profiles
[**listVerifications**](VerifyApi.md#listVerifications) | **GET** /verifications/by_phone_number/{phone_number} | List verifications by phone number
[**retrieveVerification**](VerifyApi.md#retrieveVerification) | **GET** /verifications/{verification_id} | Retrieve verification
[**updateVerifyProfile**](VerifyApi.md#updateVerifyProfile) | **PATCH** /verify_profiles/{verify_profile_id} | Update Verify profile
[**verifyVerificationCodeById**](VerifyApi.md#verifyVerificationCodeById) | **POST** /verifications/{verification_id}/actions/verify | Verify verification code by ID
[**verifyVerificationCodeByPhoneNumber**](VerifyApi.md#verifyVerificationCodeByPhoneNumber) | **POST** /verifications/by_phone_number/{phone_number}/actions/verify | Verify verification code by phone number



## createFlashcallVerification

> CreateVerificationResponse createFlashcallVerification(createVerificationRequestFlashcall)

Trigger Flash call verification

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
        CreateVerificationRequestFlashcall createVerificationRequestFlashcall = new CreateVerificationRequestFlashcall(); // CreateVerificationRequestFlashcall | 
        try {
            CreateVerificationResponse result = apiInstance.createFlashcallVerification(createVerificationRequestFlashcall);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifyApi#createFlashcallVerification");
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
 **createVerificationRequestFlashcall** | [**CreateVerificationRequestFlashcall**](CreateVerificationRequestFlashcall.md)|  |

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


## createVerificationCall

> CreateVerificationResponse createVerificationCall(createVerificationRequestCall)

Trigger Call verification

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
        CreateVerificationRequestCall createVerificationRequestCall = new CreateVerificationRequestCall(); // CreateVerificationRequestCall | 
        try {
            CreateVerificationResponse result = apiInstance.createVerificationCall(createVerificationRequestCall);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifyApi#createVerificationCall");
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
 **createVerificationRequestCall** | [**CreateVerificationRequestCall**](CreateVerificationRequestCall.md)|  |

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


## createVerificationSms

> CreateVerificationResponse createVerificationSms(createVerificationRequestSMS)

Trigger SMS verification

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
        CreateVerificationRequestSMS createVerificationRequestSMS = new CreateVerificationRequestSMS(); // CreateVerificationRequestSMS | 
        try {
            CreateVerificationResponse result = apiInstance.createVerificationSms(createVerificationRequestSMS);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifyApi#createVerificationSms");
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
 **createVerificationRequestSMS** | [**CreateVerificationRequestSMS**](CreateVerificationRequestSMS.md)|  |

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

> VerifyProfileResponseDataWrapper createVerifyProfile(createVerifyProfileRequest)

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
            VerifyProfileResponseDataWrapper result = apiInstance.createVerifyProfile(createVerifyProfileRequest);
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

[**VerifyProfileResponseDataWrapper**](VerifyProfileResponseDataWrapper.md)

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


## deleteProfile

> VerifyProfileResponseDataWrapper deleteProfile(verifyProfileId)

Delete Verify profile

### Example

```java
import java.util.UUID;
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
        UUID verifyProfileId = UUID.fromString("12ade33a-21c0-473b-b055-b3c836e1c292"); // UUID | The identifier of the Verify profile to delete.
        try {
            VerifyProfileResponseDataWrapper result = apiInstance.deleteProfile(verifyProfileId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifyApi#deleteProfile");
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
 **verifyProfileId** | **UUID**| The identifier of the Verify profile to delete. |

### Return type

[**VerifyProfileResponseDataWrapper**](VerifyProfileResponseDataWrapper.md)

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


## getVerifyProfile

> VerifyProfileResponseDataWrapper getVerifyProfile(verifyProfileId)

Retrieve Verify profile

Gets a single Verify profile.

### Example

```java
import java.util.UUID;
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
        UUID verifyProfileId = UUID.fromString("12ade33a-21c0-473b-b055-b3c836e1c292"); // UUID | The identifier of the Verify profile to retrieve.
        try {
            VerifyProfileResponseDataWrapper result = apiInstance.getVerifyProfile(verifyProfileId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifyApi#getVerifyProfile");
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
 **verifyProfileId** | **UUID**| The identifier of the Verify profile to retrieve. |

### Return type

[**VerifyProfileResponseDataWrapper**](VerifyProfileResponseDataWrapper.md)

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


## listProfileMessageTemplates

> ListVerifyProfileMessageTemplateResponse listProfileMessageTemplates()

Retrieve Verify profile message templates

List all Verify profile message templates.

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
        try {
            ListVerifyProfileMessageTemplateResponse result = apiInstance.listProfileMessageTemplates();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifyApi#listProfileMessageTemplates");
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

[**ListVerifyProfileMessageTemplateResponse**](ListVerifyProfileMessageTemplateResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected Verify profile message template response to a valid request. |  -  |


## listProfiles

> ListVerifyProfilesResponse listProfiles().filterName(filterName).pageSize(pageSize).pageNumber(pageNumber).execute();

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
            ListVerifyProfilesResponse result = api.listProfiles()
                .filterName(filterName)
                .pageSize(pageSize)
                .pageNumber(pageNumber)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifyApi#listProfiles");
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
        String phoneNumber = "+13035551234"; // String | The phone number associated with the verifications to retrieve.
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


## retrieveVerification

> RetrieveVerificationResponse retrieveVerification(verificationId)

Retrieve verification

### Example

```java
import java.util.UUID;
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
        UUID verificationId = UUID.fromString("12ade33a-21c0-473b-b055-b3c836e1c292"); // UUID | The identifier of the verification to retrieve.
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
 **verificationId** | **UUID**| The identifier of the verification to retrieve. |

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


## updateVerifyProfile

> VerifyProfileResponseDataWrapper updateVerifyProfile(verifyProfileId, updateVerifyProfileRequest)

Update Verify profile

### Example

```java
import java.util.UUID;
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
        UUID verifyProfileId = UUID.fromString("12ade33a-21c0-473b-b055-b3c836e1c292"); // UUID | The identifier of the Verify profile to update.
        UpdateVerifyProfileRequest updateVerifyProfileRequest = new UpdateVerifyProfileRequest(); // UpdateVerifyProfileRequest | 
        try {
            VerifyProfileResponseDataWrapper result = apiInstance.updateVerifyProfile(verifyProfileId, updateVerifyProfileRequest);
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
 **verifyProfileId** | **UUID**| The identifier of the Verify profile to update. |
 **updateVerifyProfileRequest** | [**UpdateVerifyProfileRequest**](UpdateVerifyProfileRequest.md)|  |

### Return type

[**VerifyProfileResponseDataWrapper**](VerifyProfileResponseDataWrapper.md)

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


## verifyVerificationCodeById

> VerifyVerificationCodeResponse verifyVerificationCodeById(verificationId, verifyVerificationCodeRequestById)

Verify verification code by ID

### Example

```java
import java.util.UUID;
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
        UUID verificationId = UUID.fromString("12ade33a-21c0-473b-b055-b3c836e1c292"); // UUID | The identifier of the verification to retrieve.
        VerifyVerificationCodeRequestById verifyVerificationCodeRequestById = new VerifyVerificationCodeRequestById(); // VerifyVerificationCodeRequestById | 
        try {
            VerifyVerificationCodeResponse result = apiInstance.verifyVerificationCodeById(verificationId, verifyVerificationCodeRequestById);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifyApi#verifyVerificationCodeById");
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
 **verificationId** | **UUID**| The identifier of the verification to retrieve. |
 **verifyVerificationCodeRequestById** | [**VerifyVerificationCodeRequestById**](VerifyVerificationCodeRequestById.md)|  |

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


## verifyVerificationCodeByPhoneNumber

> VerifyVerificationCodeResponse verifyVerificationCodeByPhoneNumber(phoneNumber, verifyVerificationCodeRequestByPhoneNumber)

Verify verification code by phone number

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
        String phoneNumber = "+13035551234"; // String | The phone number associated with the verification code being verified.
        VerifyVerificationCodeRequestByPhoneNumber verifyVerificationCodeRequestByPhoneNumber = new VerifyVerificationCodeRequestByPhoneNumber(); // VerifyVerificationCodeRequestByPhoneNumber | 
        try {
            VerifyVerificationCodeResponse result = apiInstance.verifyVerificationCodeByPhoneNumber(phoneNumber, verifyVerificationCodeRequestByPhoneNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifyApi#verifyVerificationCodeByPhoneNumber");
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
 **verifyVerificationCodeRequestByPhoneNumber** | [**VerifyVerificationCodeRequestByPhoneNumber**](VerifyVerificationCodeRequestByPhoneNumber.md)|  |

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

