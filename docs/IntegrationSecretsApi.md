# IntegrationSecretsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIntegrationSecret**](IntegrationSecretsApi.md#createIntegrationSecret) | **POST** /integration_secrets | Create a secret
[**deleteIntegrationSecret**](IntegrationSecretsApi.md#deleteIntegrationSecret) | **DELETE** /integration_secrets/{id} | Delete an integration secret
[**listIntegrationSecrets**](IntegrationSecretsApi.md#listIntegrationSecrets) | **GET** /integration_secrets | List integration secrets



## createIntegrationSecret

> IntegrationSecretCreatedResponse createIntegrationSecret(createIntegrationSecretRequest)

Create a secret

Create a new secret with an associated identifier that can be used to securely integrate with other services.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.IntegrationSecretsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        IntegrationSecretsApi apiInstance = new IntegrationSecretsApi(defaultClient);
        CreateIntegrationSecretRequest createIntegrationSecretRequest = new CreateIntegrationSecretRequest(); // CreateIntegrationSecretRequest | 
        try {
            IntegrationSecretCreatedResponse result = apiInstance.createIntegrationSecret(createIntegrationSecretRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationSecretsApi#createIntegrationSecret");
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
 **createIntegrationSecretRequest** | [**CreateIntegrationSecretRequest**](CreateIntegrationSecretRequest.md)|  |

### Return type

[**IntegrationSecretCreatedResponse**](IntegrationSecretCreatedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## deleteIntegrationSecret

> deleteIntegrationSecret(id)

Delete an integration secret

Delete an integration secret given its ID.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.IntegrationSecretsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        IntegrationSecretsApi apiInstance = new IntegrationSecretsApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            apiInstance.deleteIntegrationSecret(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationSecretsApi#deleteIntegrationSecret");
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
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The resource was deleted successfully. |  -  |
| **404** | Secret Not found |  -  |


## listIntegrationSecrets

> IntegrationSecretsListData listIntegrationSecrets()

List integration secrets

Retrieve a list of all integration secrets configured by the user.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.IntegrationSecretsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        IntegrationSecretsApi apiInstance = new IntegrationSecretsApi(defaultClient);
        try {
            IntegrationSecretsListData result = apiInstance.listIntegrationSecrets();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationSecretsApi#listIntegrationSecrets");
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

[**IntegrationSecretsListData**](IntegrationSecretsListData.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

