# AdvancedOptInOptOutApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAutorespConfig**](AdvancedOptInOptOutApi.md#createAutorespConfig) | **POST** /messaging_profiles/{profile_id}/autoresp_configs | Create Auto-Reponse Setting
[**deleteAutorespConfig**](AdvancedOptInOptOutApi.md#deleteAutorespConfig) | **DELETE** /messaging_profiles/{profile_id}/autoresp_configs/{autoresp_cfg_id} | Delete Auto-Response Setting
[**getAutorespConfig**](AdvancedOptInOptOutApi.md#getAutorespConfig) | **GET** /messaging_profiles/{profile_id}/autoresp_configs/{autoresp_cfg_id} | Get Auto-Response Setting
[**getAutorespConfigs**](AdvancedOptInOptOutApi.md#getAutorespConfigs) | **GET** /messaging_profiles/{profile_id}/autoresp_configs | List Auto-Response Settings
[**updateAutoRespConfig**](AdvancedOptInOptOutApi.md#updateAutoRespConfig) | **PUT** /messaging_profiles/{profile_id}/autoresp_configs/{autoresp_cfg_id} | Update Auto-Response Setting



## createAutorespConfig

> AutorespConfigResponseSchema createAutorespConfig(profileId, autoRespConfigCreateSchema)

Create Auto-Reponse Setting

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AdvancedOptInOptOutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AdvancedOptInOptOutApi apiInstance = new AdvancedOptInOptOutApi(defaultClient);
        String profileId = "profileId_example"; // String | 
        AutoRespConfigCreateSchema autoRespConfigCreateSchema = new AutoRespConfigCreateSchema(); // AutoRespConfigCreateSchema | 
        try {
            AutorespConfigResponseSchema result = apiInstance.createAutorespConfig(profileId, autoRespConfigCreateSchema);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvancedOptInOptOutApi#createAutorespConfig");
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
 **profileId** | **String**|  |
 **autoRespConfigCreateSchema** | [**AutoRespConfigCreateSchema**](AutoRespConfigCreateSchema.md)|  |

### Return type

[**AutorespConfigResponseSchema**](AutorespConfigResponseSchema.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **0** | Unexpected error |  -  |


## deleteAutorespConfig

> Object deleteAutorespConfig(profileId, autorespCfgId)

Delete Auto-Response Setting

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AdvancedOptInOptOutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AdvancedOptInOptOutApi apiInstance = new AdvancedOptInOptOutApi(defaultClient);
        UUID profileId = UUID.randomUUID(); // UUID | 
        UUID autorespCfgId = UUID.randomUUID(); // UUID | 
        try {
            Object result = apiInstance.deleteAutorespConfig(profileId, autorespCfgId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvancedOptInOptOutApi#deleteAutorespConfig");
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
 **profileId** | **UUID**|  |
 **autorespCfgId** | **UUID**|  |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **0** | Unexpected error |  -  |


## getAutorespConfig

> AutorespConfigResponseSchema getAutorespConfig(profileId, autorespCfgId)

Get Auto-Response Setting

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AdvancedOptInOptOutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AdvancedOptInOptOutApi apiInstance = new AdvancedOptInOptOutApi(defaultClient);
        UUID profileId = UUID.randomUUID(); // UUID | 
        UUID autorespCfgId = UUID.randomUUID(); // UUID | 
        try {
            AutorespConfigResponseSchema result = apiInstance.getAutorespConfig(profileId, autorespCfgId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvancedOptInOptOutApi#getAutorespConfig");
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
 **profileId** | **UUID**|  |
 **autorespCfgId** | **UUID**|  |

### Return type

[**AutorespConfigResponseSchema**](AutorespConfigResponseSchema.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **0** | Unexpected error |  -  |


## getAutorespConfigs

> AutorespConfigsResponseSchema getAutorespConfigs(profileId, countryCode, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte)

List Auto-Response Settings

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AdvancedOptInOptOutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AdvancedOptInOptOutApi apiInstance = new AdvancedOptInOptOutApi(defaultClient);
        UUID profileId = UUID.randomUUID(); // UUID | 
        String countryCode = "countryCode_example"; // String | 
        String createdAtGte = "createdAtGte_example"; // String | 
        String createdAtLte = "createdAtLte_example"; // String | 
        String updatedAtGte = "updatedAtGte_example"; // String | 
        String updatedAtLte = "updatedAtLte_example"; // String | 
        try {
            AutorespConfigsResponseSchema result = apiInstance.getAutorespConfigs(profileId, countryCode, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvancedOptInOptOutApi#getAutorespConfigs");
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
 **profileId** | **UUID**|  |
 **countryCode** | **String**|  | [optional]
 **createdAtGte** | **String**|  | [optional]
 **createdAtLte** | **String**|  | [optional]
 **updatedAtGte** | **String**|  | [optional]
 **updatedAtLte** | **String**|  | [optional]

### Return type

[**AutorespConfigsResponseSchema**](AutorespConfigsResponseSchema.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **0** | Unexpected error |  -  |


## updateAutoRespConfig

> AutorespConfigResponseSchema updateAutoRespConfig(profileId, autorespCfgId, autoRespConfigCreateSchema)

Update Auto-Response Setting

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AdvancedOptInOptOutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AdvancedOptInOptOutApi apiInstance = new AdvancedOptInOptOutApi(defaultClient);
        UUID profileId = UUID.randomUUID(); // UUID | 
        UUID autorespCfgId = UUID.randomUUID(); // UUID | 
        AutoRespConfigCreateSchema autoRespConfigCreateSchema = new AutoRespConfigCreateSchema(); // AutoRespConfigCreateSchema | 
        try {
            AutorespConfigResponseSchema result = apiInstance.updateAutoRespConfig(profileId, autorespCfgId, autoRespConfigCreateSchema);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvancedOptInOptOutApi#updateAutoRespConfig");
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
 **profileId** | **UUID**|  |
 **autorespCfgId** | **UUID**|  |
 **autoRespConfigCreateSchema** | [**AutoRespConfigCreateSchema**](AutoRespConfigCreateSchema.md)|  |

### Return type

[**AutorespConfigResponseSchema**](AutorespConfigResponseSchema.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **0** | Unexpected error |  -  |

