# PortingOrdersApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activatePortingOrder**](PortingOrdersApi.md#activatePortingOrder) | **POST** /porting_orders/{id}/actions/activate | Activate every number in a porting order asynchronously.
[**cancelPortingOrder**](PortingOrdersApi.md#cancelPortingOrder) | **POST** /porting_orders/{id}/actions/cancel | Cancel a porting order
[**confirmPortingOrder**](PortingOrdersApi.md#confirmPortingOrder) | **POST** /porting_orders/{id}/actions/confirm | Submit a porting order.
[**createAdditionalDocuments**](PortingOrdersApi.md#createAdditionalDocuments) | **POST** /porting_orders/{id}/additional_documents | Create a list of additional documents
[**createLoaConfiguration**](PortingOrdersApi.md#createLoaConfiguration) | **POST** /porting/loa_configurations | Create a LOA configuration
[**createPhoneNumberConfigurations**](PortingOrdersApi.md#createPhoneNumberConfigurations) | **POST** /porting_orders/phone_number_configurations | Create a list of phone number configurations
[**createPortingComment**](PortingOrdersApi.md#createPortingComment) | **POST** /porting_orders/{id}/comments | Create a comment for a porting order
[**createPortingOrder**](PortingOrdersApi.md#createPortingOrder) | **POST** /porting_orders | Create a porting order
[**createPortingPhoneNumberBlock**](PortingOrdersApi.md#createPortingPhoneNumberBlock) | **POST** /porting_orders/{porting_order_id}/phone_number_blocks | Create a phone number block
[**createPortingPhoneNumberExtension**](PortingOrdersApi.md#createPortingPhoneNumberExtension) | **POST** /porting_orders/{porting_order_id}/phone_number_extensions | Create a phone number extension
[**createPortingReport**](PortingOrdersApi.md#createPortingReport) | **POST** /porting/reports | Create a porting related report
[**deleteAdditionalDocument**](PortingOrdersApi.md#deleteAdditionalDocument) | **DELETE** /porting_orders/{id}/additional_documents/{additional_document_id} | Delete an additional document
[**deleteLoaConfiguration**](PortingOrdersApi.md#deleteLoaConfiguration) | **DELETE** /porting/loa_configurations/{id} | Delete a LOA configuration
[**deletePortingOrder**](PortingOrdersApi.md#deletePortingOrder) | **DELETE** /porting_orders/{id} | Delete a porting order
[**deletePortingPhoneNumberBlock**](PortingOrdersApi.md#deletePortingPhoneNumberBlock) | **DELETE** /porting_orders/{porting_order_id}/phone_number_blocks/{id} | Delete a phone number block
[**deletePortingPhoneNumberExtension**](PortingOrdersApi.md#deletePortingPhoneNumberExtension) | **DELETE** /porting_orders/{porting_order_id}/phone_number_extensions/{id} | Delete a phone number extension
[**getLoaConfiguration**](PortingOrdersApi.md#getLoaConfiguration) | **GET** /porting/loa_configurations/{id} | Retrieve a LOA configuration
[**getPortingOrder**](PortingOrdersApi.md#getPortingOrder) | **GET** /porting_orders/{id} | Retrieve a porting order
[**getPortingOrderLoaTemplate**](PortingOrdersApi.md#getPortingOrderLoaTemplate) | **GET** /porting_orders/{id}/loa_template | Download a porting order loa template
[**getPortingOrderSubRequest**](PortingOrdersApi.md#getPortingOrderSubRequest) | **GET** /porting_orders/{id}/sub_request | Retrieve the associated V1 sub_request_id and port_request_id
[**getPortingOrdersActivationJob**](PortingOrdersApi.md#getPortingOrdersActivationJob) | **GET** /porting_orders/{id}/activation_jobs/{activationJobId} | Retrieve a porting activation job
[**getPortingReport**](PortingOrdersApi.md#getPortingReport) | **GET** /porting/reports/{id} | Retrieve a report
[**listAdditionalDocuments**](PortingOrdersApi.md#listAdditionalDocuments) | **GET** /porting_orders/{id}/additional_documents | List additional documents
[**listAllowedFocWindows**](PortingOrdersApi.md#listAllowedFocWindows) | **GET** /porting_orders/{id}/allowed_foc_windows | List allowed FOC dates
[**listExceptionTypes**](PortingOrdersApi.md#listExceptionTypes) | **GET** /porting_orders/exception_types | List all exception types
[**listLoaConfigurations**](PortingOrdersApi.md#listLoaConfigurations) | **GET** /porting/loa_configurations | List LOA configurations
[**listPhoneNumberConfigurations**](PortingOrdersApi.md#listPhoneNumberConfigurations) | **GET** /porting_orders/phone_number_configurations | List all phone number configurations
[**listPortingEvents**](PortingOrdersApi.md#listPortingEvents) | **GET** /porting/events | List all porting events
[**listPortingOrderActivationJobs**](PortingOrdersApi.md#listPortingOrderActivationJobs) | **GET** /porting_orders/{id}/activation_jobs | List all porting activation jobs
[**listPortingOrderComments**](PortingOrdersApi.md#listPortingOrderComments) | **GET** /porting_orders/{id}/comments | List all comments of a porting order
[**listPortingOrderRequirements**](PortingOrdersApi.md#listPortingOrderRequirements) | **GET** /porting_orders/{id}/requirements | List porting order requirements
[**listPortingOrders**](PortingOrdersApi.md#listPortingOrders) | **GET** /porting_orders | List all porting orders
[**listPortingPhoneNumberBlocks**](PortingOrdersApi.md#listPortingPhoneNumberBlocks) | **GET** /porting_orders/{porting_order_id}/phone_number_blocks | List all phone number blocks
[**listPortingPhoneNumberExtensions**](PortingOrdersApi.md#listPortingPhoneNumberExtensions) | **GET** /porting_orders/{porting_order_id}/phone_number_extensions | List all phone number extensions
[**listPortingPhoneNumbers**](PortingOrdersApi.md#listPortingPhoneNumbers) | **GET** /porting_phone_numbers | List all porting phone numbers
[**listPortingReports**](PortingOrdersApi.md#listPortingReports) | **GET** /porting/reports | List porting related reports
[**listVerificationCodes**](PortingOrdersApi.md#listVerificationCodes) | **GET** /porting_orders/{id}/verification_codes | List verification codes
[**previewLoaConfiguration**](PortingOrdersApi.md#previewLoaConfiguration) | **GET** /porting/loa_configurations/{id}/preview | Preview a LOA configuration
[**previewLoaConfigurationParams**](PortingOrdersApi.md#previewLoaConfigurationParams) | **POST** /porting/loa_configuration/preview | Preview the LOA configuration parameters
[**republishPortingEvent**](PortingOrdersApi.md#republishPortingEvent) | **POST** /porting/events/{id}/republish | Republish a porting event
[**sendPortingVerificationCodes**](PortingOrdersApi.md#sendPortingVerificationCodes) | **POST** /porting_orders/{id}/verification_codes/send | Send the verification codes
[**sharePortingOrder**](PortingOrdersApi.md#sharePortingOrder) | **POST** /porting_orders/{id}/actions/share | Share a porting order
[**showPortingEvent**](PortingOrdersApi.md#showPortingEvent) | **GET** /porting/events/{id} | Show a porting event
[**updateLoaConfiguration**](PortingOrdersApi.md#updateLoaConfiguration) | **PATCH** /porting/loa_configurations/{id} | Update a LOA configuration
[**updatePortingOrder**](PortingOrdersApi.md#updatePortingOrder) | **PATCH** /porting_orders/{id} | Edit a porting order
[**updatePortingOrdersActivationJob**](PortingOrdersApi.md#updatePortingOrdersActivationJob) | **PATCH** /porting_orders/{id}/activation_jobs/{activationJobId} | Update a porting activation job
[**verifyPortingVerificationCodes**](PortingOrdersApi.md#verifyPortingVerificationCodes) | **POST** /porting_orders/{id}/verification_codes/verify | Verify the verification code for a list of phone numbers



## activatePortingOrder

> ActivatePortingOrder202Response activatePortingOrder(id)

Activate every number in a porting order asynchronously.

Activate each number in a porting order asynchronously. This operation is limited to US FastPort orders only.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        try {
            ActivatePortingOrder202Response result = apiInstance.activatePortingOrder(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#activatePortingOrder");
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
 **id** | **UUID**| Porting Order id |

### Return type

[**ActivatePortingOrder202Response**](ActivatePortingOrder202Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## cancelPortingOrder

> CancelPortingOrder200Response cancelPortingOrder(id)

Cancel a porting order

Cancel a porting order

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        try {
            CancelPortingOrder200Response result = apiInstance.cancelPortingOrder(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#cancelPortingOrder");
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
 **id** | **UUID**| Porting Order id |

### Return type

[**CancelPortingOrder200Response**](CancelPortingOrder200Response.md)

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
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## confirmPortingOrder

> ConfirmPortingOrder200Response confirmPortingOrder(id)

Submit a porting order.

Confirm and submit your porting order.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        try {
            ConfirmPortingOrder200Response result = apiInstance.confirmPortingOrder(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#confirmPortingOrder");
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
 **id** | **UUID**| Porting Order id |

### Return type

[**ConfirmPortingOrder200Response**](ConfirmPortingOrder200Response.md)

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
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## createAdditionalDocuments

> CreateAdditionalDocuments201Response createAdditionalDocuments(id, createAdditionalDocumentsRequest)

Create a list of additional documents

Creates a list of additional documents for a porting order.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        CreateAdditionalDocumentsRequest createAdditionalDocumentsRequest = new CreateAdditionalDocumentsRequest(); // CreateAdditionalDocumentsRequest | A list of additional document parameters
        try {
            CreateAdditionalDocuments201Response result = apiInstance.createAdditionalDocuments(id, createAdditionalDocumentsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#createAdditionalDocuments");
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
 **id** | **UUID**| Porting Order id |
 **createAdditionalDocumentsRequest** | [**CreateAdditionalDocumentsRequest**](CreateAdditionalDocumentsRequest.md)| A list of additional document parameters |

### Return type

[**CreateAdditionalDocuments201Response**](CreateAdditionalDocuments201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## createLoaConfiguration

> CreateLoaConfiguration201Response createLoaConfiguration(previewLoaConfigurationParamsRequest)

Create a LOA configuration

Create a LOA configuration.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        PreviewLoaConfigurationParamsRequest previewLoaConfigurationParamsRequest = new PreviewLoaConfigurationParamsRequest(); // PreviewLoaConfigurationParamsRequest | 
        try {
            CreateLoaConfiguration201Response result = apiInstance.createLoaConfiguration(previewLoaConfigurationParamsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#createLoaConfiguration");
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
 **previewLoaConfigurationParamsRequest** | [**PreviewLoaConfigurationParamsRequest**](PreviewLoaConfigurationParamsRequest.md)|  |

### Return type

[**CreateLoaConfiguration201Response**](CreateLoaConfiguration201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |
| **500** | Internal server error |  -  |


## createPhoneNumberConfigurations

> CreatePhoneNumberConfigurations201Response createPhoneNumberConfigurations(createPhoneNumberConfigurationsRequest)

Create a list of phone number configurations

Creates a list of phone number configurations.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        CreatePhoneNumberConfigurationsRequest createPhoneNumberConfigurationsRequest = new CreatePhoneNumberConfigurationsRequest(); // CreatePhoneNumberConfigurationsRequest | A list of phone number configuration parameters
        try {
            CreatePhoneNumberConfigurations201Response result = apiInstance.createPhoneNumberConfigurations(createPhoneNumberConfigurationsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#createPhoneNumberConfigurations");
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
 **createPhoneNumberConfigurationsRequest** | [**CreatePhoneNumberConfigurationsRequest**](CreatePhoneNumberConfigurationsRequest.md)| A list of phone number configuration parameters |

### Return type

[**CreatePhoneNumberConfigurations201Response**](CreatePhoneNumberConfigurations201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## createPortingComment

> CreatePortingComment201Response createPortingComment(id, createPortingOrderComment)

Create a comment for a porting order

Creates a new comment for a porting order.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        CreatePortingOrderComment createPortingOrderComment = new CreatePortingOrderComment(); // CreatePortingOrderComment | 
        try {
            CreatePortingComment201Response result = apiInstance.createPortingComment(id, createPortingOrderComment);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#createPortingComment");
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
 **id** | **UUID**| Porting Order id |
 **createPortingOrderComment** | [**CreatePortingOrderComment**](CreatePortingOrderComment.md)|  |

### Return type

[**CreatePortingComment201Response**](CreatePortingComment201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## createPortingOrder

> CreatePortingOrder201Response createPortingOrder(createPortingOrder)

Create a porting order

Creates a new porting order object.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        CreatePortingOrder createPortingOrder = new CreatePortingOrder(); // CreatePortingOrder | 
        try {
            CreatePortingOrder201Response result = apiInstance.createPortingOrder(createPortingOrder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#createPortingOrder");
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
 **createPortingOrder** | [**CreatePortingOrder**](CreatePortingOrder.md)|  |

### Return type

[**CreatePortingOrder201Response**](CreatePortingOrder201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## createPortingPhoneNumberBlock

> CreatePortingPhoneNumberBlock201Response createPortingPhoneNumberBlock(portingOrderId, createPortingPhoneNumberBlockRequest)

Create a phone number block

Creates a new phone number block.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID portingOrderId = UUID.randomUUID(); // UUID | Identifies the Porting Order associated with the phone number block
        CreatePortingPhoneNumberBlockRequest createPortingPhoneNumberBlockRequest = new CreatePortingPhoneNumberBlockRequest(); // CreatePortingPhoneNumberBlockRequest | 
        try {
            CreatePortingPhoneNumberBlock201Response result = apiInstance.createPortingPhoneNumberBlock(portingOrderId, createPortingPhoneNumberBlockRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#createPortingPhoneNumberBlock");
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
 **portingOrderId** | **UUID**| Identifies the Porting Order associated with the phone number block |
 **createPortingPhoneNumberBlockRequest** | [**CreatePortingPhoneNumberBlockRequest**](CreatePortingPhoneNumberBlockRequest.md)|  |

### Return type

[**CreatePortingPhoneNumberBlock201Response**](CreatePortingPhoneNumberBlock201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |
| **404** | Not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## createPortingPhoneNumberExtension

> CreatePortingPhoneNumberExtension201Response createPortingPhoneNumberExtension(portingOrderId, createPortingPhoneNumberExtensionRequest)

Create a phone number extension

Creates a new phone number extension.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID portingOrderId = UUID.randomUUID(); // UUID | Identifies the Porting Order associated with the phone number extension
        CreatePortingPhoneNumberExtensionRequest createPortingPhoneNumberExtensionRequest = new CreatePortingPhoneNumberExtensionRequest(); // CreatePortingPhoneNumberExtensionRequest | 
        try {
            CreatePortingPhoneNumberExtension201Response result = apiInstance.createPortingPhoneNumberExtension(portingOrderId, createPortingPhoneNumberExtensionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#createPortingPhoneNumberExtension");
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
 **portingOrderId** | **UUID**| Identifies the Porting Order associated with the phone number extension |
 **createPortingPhoneNumberExtensionRequest** | [**CreatePortingPhoneNumberExtensionRequest**](CreatePortingPhoneNumberExtensionRequest.md)|  |

### Return type

[**CreatePortingPhoneNumberExtension201Response**](CreatePortingPhoneNumberExtension201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |
| **404** | Not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## createPortingReport

> CreatePortingReport201Response createPortingReport(createPortingReportRequest)

Create a porting related report

Generate reports about porting operations.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        CreatePortingReportRequest createPortingReportRequest = new CreatePortingReportRequest(); // CreatePortingReportRequest | 
        try {
            CreatePortingReport201Response result = apiInstance.createPortingReport(createPortingReportRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#createPortingReport");
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
 **createPortingReportRequest** | [**CreatePortingReportRequest**](CreatePortingReportRequest.md)|  |

### Return type

[**CreatePortingReport201Response**](CreatePortingReport201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |
| **500** | Internal server error |  -  |


## deleteAdditionalDocument

> deleteAdditionalDocument(id, additionalDocumentId)

Delete an additional document

Deletes an additional document for a porting order.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        UUID additionalDocumentId = UUID.randomUUID(); // UUID | Additional document identification.
        try {
            apiInstance.deleteAdditionalDocument(id, additionalDocumentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#deleteAdditionalDocument");
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
 **id** | **UUID**| Porting Order id |
 **additionalDocumentId** | **UUID**| Additional document identification. |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |


## deleteLoaConfiguration

> deleteLoaConfiguration(id)

Delete a LOA configuration

Delete a specific LOA configuration.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Identifies a LOA configuration.
        try {
            apiInstance.deleteLoaConfiguration(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#deleteLoaConfiguration");
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
 **id** | **UUID**| Identifies a LOA configuration. |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal server error |  -  |


## deletePortingOrder

> deletePortingOrder(id)

Delete a porting order

Deletes an existing porting order. This operation is restrict to porting orders in draft state.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        try {
            apiInstance.deletePortingOrder(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#deletePortingOrder");
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
 **id** | **UUID**| Porting Order id |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## deletePortingPhoneNumberBlock

> CreatePortingPhoneNumberBlock201Response deletePortingPhoneNumberBlock(portingOrderId, id)

Delete a phone number block

Deletes a phone number block.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID portingOrderId = UUID.randomUUID(); // UUID | Identifies the Porting Order associated with the phone number block
        UUID id = UUID.randomUUID(); // UUID | Identifies the phone number block to be deleted
        try {
            CreatePortingPhoneNumberBlock201Response result = apiInstance.deletePortingPhoneNumberBlock(portingOrderId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#deletePortingPhoneNumberBlock");
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
 **portingOrderId** | **UUID**| Identifies the Porting Order associated with the phone number block |
 **id** | **UUID**| Identifies the phone number block to be deleted |

### Return type

[**CreatePortingPhoneNumberBlock201Response**](CreatePortingPhoneNumberBlock201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | Not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## deletePortingPhoneNumberExtension

> CreatePortingPhoneNumberExtension201Response deletePortingPhoneNumberExtension(portingOrderId, id)

Delete a phone number extension

Deletes a phone number extension.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID portingOrderId = UUID.randomUUID(); // UUID | Identifies the Porting Order associated with the phone number extension
        UUID id = UUID.randomUUID(); // UUID | Identifies the phone number extension to be deleted
        try {
            CreatePortingPhoneNumberExtension201Response result = apiInstance.deletePortingPhoneNumberExtension(portingOrderId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#deletePortingPhoneNumberExtension");
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
 **portingOrderId** | **UUID**| Identifies the Porting Order associated with the phone number extension |
 **id** | **UUID**| Identifies the phone number extension to be deleted |

### Return type

[**CreatePortingPhoneNumberExtension201Response**](CreatePortingPhoneNumberExtension201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | Not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## getLoaConfiguration

> CreateLoaConfiguration201Response getLoaConfiguration(id)

Retrieve a LOA configuration

Retrieve a specific LOA configuration.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Identifies a LOA configuration.
        try {
            CreateLoaConfiguration201Response result = apiInstance.getLoaConfiguration(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#getLoaConfiguration");
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
 **id** | **UUID**| Identifies a LOA configuration. |

### Return type

[**CreateLoaConfiguration201Response**](CreateLoaConfiguration201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal server error |  -  |


## getPortingOrder

> GetPortingOrder200Response getPortingOrder(id, includePhoneNumbers)

Retrieve a porting order

Retrieves the details of an existing porting order.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        Boolean includePhoneNumbers = true; // Boolean | Include the first 50 phone number objects in the results
        try {
            GetPortingOrder200Response result = apiInstance.getPortingOrder(id, includePhoneNumbers);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#getPortingOrder");
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
 **id** | **UUID**| Porting Order id |
 **includePhoneNumbers** | **Boolean**| Include the first 50 phone number objects in the results | [optional] [default to true]

### Return type

[**GetPortingOrder200Response**](GetPortingOrder200Response.md)

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


## getPortingOrderLoaTemplate

> File getPortingOrderLoaTemplate(id, loaConfigurationId)

Download a porting order loa template

Download a porting order loa template

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        UUID loaConfigurationId = UUID.fromString("a36c2277-446b-4d11-b4ea-322e02a5c08d"); // UUID | The identifier of the LOA configuration to use for the template. If not provided, the default LOA configuration will be used.
        try {
            File result = apiInstance.getPortingOrderLoaTemplate(id, loaConfigurationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#getPortingOrderLoaTemplate");
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
 **id** | **UUID**| Porting Order id |
 **loaConfigurationId** | **UUID**| The identifier of the LOA configuration to use for the template. If not provided, the default LOA configuration will be used. | [optional]

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Unauthorized |  -  |


## getPortingOrderSubRequest

> GetPortingOrderSubRequest200Response getPortingOrderSubRequest(id)

Retrieve the associated V1 sub_request_id and port_request_id

Retrieve the associated V1 sub_request_id and port_request_id

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        try {
            GetPortingOrderSubRequest200Response result = apiInstance.getPortingOrderSubRequest(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#getPortingOrderSubRequest");
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
 **id** | **UUID**| Porting Order id |

### Return type

[**GetPortingOrderSubRequest200Response**](GetPortingOrderSubRequest200Response.md)

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
| **404** | Porting Order not found |  -  |


## getPortingOrdersActivationJob

> ActivatePortingOrder202Response getPortingOrdersActivationJob(id, activationJobId)

Retrieve a porting activation job

Returns a porting activation job.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        UUID activationJobId = UUID.randomUUID(); // UUID | Activation Job Identifier
        try {
            ActivatePortingOrder202Response result = apiInstance.getPortingOrdersActivationJob(id, activationJobId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#getPortingOrdersActivationJob");
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
 **id** | **UUID**| Porting Order id |
 **activationJobId** | **UUID**| Activation Job Identifier |

### Return type

[**ActivatePortingOrder202Response**](ActivatePortingOrder202Response.md)

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
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## getPortingReport

> CreatePortingReport201Response getPortingReport(id)

Retrieve a report

Retrieve a specific report generated.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Identifies a report.
        try {
            CreatePortingReport201Response result = apiInstance.getPortingReport(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#getPortingReport");
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
 **id** | **UUID**| Identifies a report. |

### Return type

[**CreatePortingReport201Response**](CreatePortingReport201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal server error |  -  |


## listAdditionalDocuments

> ListAdditionalDocuments200Response listAdditionalDocuments(id, pageNumber, pageSize, filterDocumentType, filterDocumentTypeIn, sort)

List additional documents

Returns a list of additional documents for a porting order.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterDocumentType = "loa"; // String | Filter additional documents of a specific document type
        List<String> filterDocumentTypeIn = Arrays.asList(); // List<String> | Filter additional documents by a list of document types
        String sort = "created_at"; // String | Specifies the sort order for results. If not given, results are sorted by created_at in descending order.
        try {
            ListAdditionalDocuments200Response result = apiInstance.listAdditionalDocuments(id, pageNumber, pageSize, filterDocumentType, filterDocumentTypeIn, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#listAdditionalDocuments");
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
 **id** | **UUID**| Porting Order id |
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]
 **filterDocumentType** | **String**| Filter additional documents of a specific document type | [optional] [enum: loa, invoice, csr, other]
 **filterDocumentTypeIn** | **List&lt;String&gt;**| Filter additional documents by a list of document types | [optional] [enum: loa, invoice, csr, other]
 **sort** | **String**| Specifies the sort order for results. If not given, results are sorted by created_at in descending order. | [optional] [enum: created_at, -created_at]

### Return type

[**ListAdditionalDocuments200Response**](ListAdditionalDocuments200Response.md)

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


## listAllowedFocWindows

> ListAllowedFocWindows200Response listAllowedFocWindows(id)

List allowed FOC dates

Returns a list of allowed FOC dates for a porting order.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        try {
            ListAllowedFocWindows200Response result = apiInstance.listAllowedFocWindows(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#listAllowedFocWindows");
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
 **id** | **UUID**| Porting Order id |

### Return type

[**ListAllowedFocWindows200Response**](ListAllowedFocWindows200Response.md)

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


## listExceptionTypes

> ListExceptionTypes200Response listExceptionTypes()

List all exception types

Returns a list of all possible exception types for a porting order.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        try {
            ListExceptionTypes200Response result = apiInstance.listExceptionTypes();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#listExceptionTypes");
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

[**ListExceptionTypes200Response**](ListExceptionTypes200Response.md)

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
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## listLoaConfigurations

> ListLoaConfigurations200Response listLoaConfigurations(pageNumber, pageSize)

List LOA configurations

List the LOA configurations.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListLoaConfigurations200Response result = apiInstance.listLoaConfigurations(pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#listLoaConfigurations");
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

### Return type

[**ListLoaConfigurations200Response**](ListLoaConfigurations200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |
| **500** | Internal server error |  -  |


## listPhoneNumberConfigurations

> ListPhoneNumberConfigurations200Response listPhoneNumberConfigurations(pageNumber, pageSize, filterPortingOrderId, filterPortingOrderIdIn, filterPortingOrderStatus, filterPortingOrderStatusIn, filterPortingPhoneNumber, filterPortingPhoneNumberIn, filterUserBundleId, filterUserBundleIdIn, sort)

List all phone number configurations

Returns a list of phone number configurations paginated.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        UUID filterPortingOrderId = UUID.fromString("f3575e15-32ce-400e-a4c0-dd78800c20b0"); // UUID | Filter results by porting order id
        List<UUID> filterPortingOrderIdIn = Arrays.asList(); // List<UUID> | Filter results by a list of porting order ids
        String filterPortingOrderStatus = "activation-in-progress"; // String | Filter results by a specific porting order status
        List<String> filterPortingOrderStatusIn = Arrays.asList(); // List<String> | Filter results by specific porting order statuses
        UUID filterPortingPhoneNumber = UUID.fromString("5d6f7ede-1961-4717-bfb5-db392c5efc2d"); // UUID | Filter results by a specific porting phone number ID
        List<UUID> filterPortingPhoneNumberIn = Arrays.asList(); // List<UUID> | Filter results by a list of porting phone number IDs
        UUID filterUserBundleId = UUID.fromString("5d6f7ede-1961-4717-bfb5-db392c5efc2d"); // UUID | Filter results by a specific user bundle ID
        List<UUID> filterUserBundleIdIn = Arrays.asList(); // List<UUID> | Filter results by a list of user bundle IDs
        String sort = "created_at"; // String | Specifies the sort order for results. If not given, results are sorted by created_at in descending order.
        try {
            ListPhoneNumberConfigurations200Response result = apiInstance.listPhoneNumberConfigurations(pageNumber, pageSize, filterPortingOrderId, filterPortingOrderIdIn, filterPortingOrderStatus, filterPortingOrderStatusIn, filterPortingPhoneNumber, filterPortingPhoneNumberIn, filterUserBundleId, filterUserBundleIdIn, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#listPhoneNumberConfigurations");
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
 **filterPortingOrderId** | **UUID**| Filter results by porting order id | [optional]
 **filterPortingOrderIdIn** | **List&lt;UUID&gt;**| Filter results by a list of porting order ids | [optional]
 **filterPortingOrderStatus** | **String**| Filter results by a specific porting order status | [optional] [enum: activation-in-progress, cancel-pending, cancelled, draft, exception, foc-date-confirmed, in-process, ported, submitted]
 **filterPortingOrderStatusIn** | **List&lt;String&gt;**| Filter results by specific porting order statuses | [optional] [enum: activation-in-progress, cancel-pending, cancelled, draft, exception, foc-date-confirmed, in-process, ported, submitted]
 **filterPortingPhoneNumber** | **UUID**| Filter results by a specific porting phone number ID | [optional]
 **filterPortingPhoneNumberIn** | **List&lt;UUID&gt;**| Filter results by a list of porting phone number IDs | [optional]
 **filterUserBundleId** | **UUID**| Filter results by a specific user bundle ID | [optional]
 **filterUserBundleIdIn** | **List&lt;UUID&gt;**| Filter results by a list of user bundle IDs | [optional]
 **sort** | **String**| Specifies the sort order for results. If not given, results are sorted by created_at in descending order. | [optional] [enum: created_at, -created_at]

### Return type

[**ListPhoneNumberConfigurations200Response**](ListPhoneNumberConfigurations200Response.md)

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
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## listPortingEvents

> ListPortingEvents200Response listPortingEvents(pageNumber, pageSize, filterType, filterPortingOrderId, filterCreatedAtGte, filterCreatedAtLte)

List all porting events

Returns a list of all porting events.

### Example

```java
import java.time.OffsetDateTime;
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterType = "porting_order.deleted"; // String | Filter by event type.
        UUID filterPortingOrderId = UUID.fromString("34dc46a9-53ed-4e01-9454-26227ea13326"); // UUID | Filter by porting order ID.
        OffsetDateTime filterCreatedAtGte = OffsetDateTime.parse("2021-01-01T00:00Z"); // OffsetDateTime | Filter by created at greater than or equal to.
        OffsetDateTime filterCreatedAtLte = OffsetDateTime.parse("2021-01-01T00:00Z"); // OffsetDateTime | Filter by created at less than or equal to.
        try {
            ListPortingEvents200Response result = apiInstance.listPortingEvents(pageNumber, pageSize, filterType, filterPortingOrderId, filterCreatedAtGte, filterCreatedAtLte);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#listPortingEvents");
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
 **filterType** | **String**| Filter by event type. | [optional] [enum: porting_order.deleted, porting_order.loa_updated, porting_order.messaging_changed, porting_order.status_changed, porting_order.sharing_token_expired, porting_order.new_comment, porting_order.split]
 **filterPortingOrderId** | **UUID**| Filter by porting order ID. | [optional]
 **filterCreatedAtGte** | **OffsetDateTime**| Filter by created at greater than or equal to. | [optional]
 **filterCreatedAtLte** | **OffsetDateTime**| Filter by created at less than or equal to. | [optional]

### Return type

[**ListPortingEvents200Response**](ListPortingEvents200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **500** | Internal server error |  -  |


## listPortingOrderActivationJobs

> ListPortingOrderActivationJobs200Response listPortingOrderActivationJobs(id, pageNumber, pageSize)

List all porting activation jobs

Returns a list of your porting activation jobs.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListPortingOrderActivationJobs200Response result = apiInstance.listPortingOrderActivationJobs(id, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#listPortingOrderActivationJobs");
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
 **id** | **UUID**| Porting Order id |
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**ListPortingOrderActivationJobs200Response**](ListPortingOrderActivationJobs200Response.md)

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
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## listPortingOrderComments

> ListPortingOrderComments200Response listPortingOrderComments(id, pageNumber, pageSize)

List all comments of a porting order

Returns a list of all comments of a porting order.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListPortingOrderComments200Response result = apiInstance.listPortingOrderComments(id, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#listPortingOrderComments");
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
 **id** | **UUID**| Porting Order id |
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**ListPortingOrderComments200Response**](ListPortingOrderComments200Response.md)

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
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## listPortingOrderRequirements

> ListPortingOrderRequirements200Response listPortingOrderRequirements(id, pageNumber, pageSize)

List porting order requirements

Returns a list of all requirements based on country/number type for this porting order.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListPortingOrderRequirements200Response result = apiInstance.listPortingOrderRequirements(id, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#listPortingOrderRequirements");
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
 **id** | **UUID**| Porting Order id |
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**ListPortingOrderRequirements200Response**](ListPortingOrderRequirements200Response.md)

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
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## listPortingOrders

> ListPortingOrders200Response listPortingOrders(pageNumber, pageSize, includePhoneNumbers, filterStatus, filterStatusIn, filterCustomerReference, filterParentSupportKey, filterPhoneNumbersCountryCode, filterPhoneNumbersCarrierName, filterMiscType, filterEndUserAdminEntityName, filterEndUserAdminAuthPersonName, filterActivationSettingsFastPortEligible, filterActivationSettingsFocDatetimeRequestedGt, filterActivationSettingsFocDatetimeRequestedLt, filterPhoneNumbersPhoneNumberContains, sort)

List all porting orders

Returns a list of your porting order.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        Boolean includePhoneNumbers = true; // Boolean | Include the first 50 phone number objects in the results
        String filterStatus = "draft"; // String | Filter results by status
        String filterStatusIn = "draft"; // String | Filter porting orders by multiple statuses
        String filterCustomerReference = "123abc"; // String | Filter results by customer_reference
        String filterParentSupportKey = "123abc"; // String | Filter results by parent_support_key
        String filterPhoneNumbersCountryCode = "US"; // String | Filter results by country ISO 3166-1 alpha-2 code
        String filterPhoneNumbersCarrierName = "Telnyx"; // String | Filter results by old service provider
        PortingOrderType filterMiscType = PortingOrderType.fromValue("full"); // PortingOrderType | Filter results by porting order type
        String filterEndUserAdminEntityName = "Porter McPortersen"; // String | Filter results by person or company name
        String filterEndUserAdminAuthPersonName = "Admin McPortersen"; // String | Filter results by authorized person
        Boolean filterActivationSettingsFastPortEligible = false; // Boolean | Filter results by fast port eligible
        String filterActivationSettingsFocDatetimeRequestedGt = "2021-03-25T10:00:00.000Z"; // String | Filter results by foc date later than this value
        String filterActivationSettingsFocDatetimeRequestedLt = "2021-03-25T10:00:00.000Z"; // String | Filter results by foc date earlier than this value
        String filterPhoneNumbersPhoneNumberContains = "+13038675309"; // String | Filter results by full or partial phone_number
        String sort = "created_at"; // String | Specifies the sort order for results. If not given, results are sorted by created_at in descending order.
        try {
            ListPortingOrders200Response result = apiInstance.listPortingOrders(pageNumber, pageSize, includePhoneNumbers, filterStatus, filterStatusIn, filterCustomerReference, filterParentSupportKey, filterPhoneNumbersCountryCode, filterPhoneNumbersCarrierName, filterMiscType, filterEndUserAdminEntityName, filterEndUserAdminAuthPersonName, filterActivationSettingsFastPortEligible, filterActivationSettingsFocDatetimeRequestedGt, filterActivationSettingsFocDatetimeRequestedLt, filterPhoneNumbersPhoneNumberContains, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#listPortingOrders");
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
 **includePhoneNumbers** | **Boolean**| Include the first 50 phone number objects in the results | [optional] [default to true]
 **filterStatus** | **String**| Filter results by status | [optional] [enum: draft, in-process, submitted, exception, foc-date-confirmed, cancel-pending, ported, cancelled]
 **filterStatusIn** | **String**| Filter porting orders by multiple statuses | [optional] [enum: draft, in-process, submitted, exception, foc-date-confirmed, cancel-pending, ported, cancelled]
 **filterCustomerReference** | **String**| Filter results by customer_reference | [optional]
 **filterParentSupportKey** | **String**| Filter results by parent_support_key | [optional]
 **filterPhoneNumbersCountryCode** | **String**| Filter results by country ISO 3166-1 alpha-2 code | [optional]
 **filterPhoneNumbersCarrierName** | **String**| Filter results by old service provider | [optional]
 **filterMiscType** | **PortingOrderType**| Filter results by porting order type | [optional] [enum: full, partial]
 **filterEndUserAdminEntityName** | **String**| Filter results by person or company name | [optional]
 **filterEndUserAdminAuthPersonName** | **String**| Filter results by authorized person | [optional]
 **filterActivationSettingsFastPortEligible** | **Boolean**| Filter results by fast port eligible | [optional]
 **filterActivationSettingsFocDatetimeRequestedGt** | **String**| Filter results by foc date later than this value | [optional]
 **filterActivationSettingsFocDatetimeRequestedLt** | **String**| Filter results by foc date earlier than this value | [optional]
 **filterPhoneNumbersPhoneNumberContains** | **String**| Filter results by full or partial phone_number | [optional]
 **sort** | **String**| Specifies the sort order for results. If not given, results are sorted by created_at in descending order. | [optional] [enum: created_at, -created_at, activation_settings.foc_datetime_requested, -activation_settings.foc_datetime_requested]

### Return type

[**ListPortingOrders200Response**](ListPortingOrders200Response.md)

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
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## listPortingPhoneNumberBlocks

> ListPortingPhoneNumberBlocks200Response listPortingPhoneNumberBlocks(portingOrderId, filterPhoneNumber, filterPhoneNumberIn, sort, pageNumber, pageSize)

List all phone number blocks

Returns a list of all phone number blocks of a porting order.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID portingOrderId = UUID.randomUUID(); // UUID | Identifies the Porting Order associated with the phone number blocks
        String filterPhoneNumber = "+12003151212"; // String | Filter results by phone number
        List<String> filterPhoneNumberIn = Arrays.asList(); // List<String> | Filter results by a list of phone numbers
        String sort = "-created_at"; // String | Specifies the sort order for results. If not given, results are sorted by created_at in descending order
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListPortingPhoneNumberBlocks200Response result = apiInstance.listPortingPhoneNumberBlocks(portingOrderId, filterPhoneNumber, filterPhoneNumberIn, sort, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#listPortingPhoneNumberBlocks");
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
 **portingOrderId** | **UUID**| Identifies the Porting Order associated with the phone number blocks |
 **filterPhoneNumber** | **String**| Filter results by phone number | [optional]
 **filterPhoneNumberIn** | **List&lt;String&gt;**| Filter results by a list of phone numbers | [optional]
 **sort** | **String**| Specifies the sort order for results. If not given, results are sorted by created_at in descending order | [optional] [enum: -created_at, created_at]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**ListPortingPhoneNumberBlocks200Response**](ListPortingPhoneNumberBlocks200Response.md)

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
| **404** | Not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## listPortingPhoneNumberExtensions

> ListPortingPhoneNumberExtensions200Response listPortingPhoneNumberExtensions(portingOrderId, filterPhoneNumber, filterPhoneNumberIn, filterPortingPhoneNumberId, filterPortingPhoneNumberIdIn, sort, pageNumber, pageSize)

List all phone number extensions

Returns a list of all phone number extensions of a porting order.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID portingOrderId = UUID.randomUUID(); // UUID | Identifies the Porting Order associated with the phone number extensions
        String filterPhoneNumber = "+12003151212"; // String | Filter results by phone number
        List<String> filterPhoneNumberIn = Arrays.asList(); // List<String> | Filter results by a list of phone numbers
        UUID filterPortingPhoneNumberId = UUID.fromString("04f8f1b9-310c-4a3c-963e-7dfc54765140"); // UUID | Filter results by porting phone number id
        UUID filterPortingPhoneNumberIdIn = UUID.fromString("04f8f1b9-310c-4a3c-963e-7dfc54765140"); // UUID | Filter results by a list of porting phone number ids
        String sort = "-created_at"; // String | Specifies the sort order for results. If not given, results are sorted by created_at in descending order
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListPortingPhoneNumberExtensions200Response result = apiInstance.listPortingPhoneNumberExtensions(portingOrderId, filterPhoneNumber, filterPhoneNumberIn, filterPortingPhoneNumberId, filterPortingPhoneNumberIdIn, sort, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#listPortingPhoneNumberExtensions");
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
 **portingOrderId** | **UUID**| Identifies the Porting Order associated with the phone number extensions |
 **filterPhoneNumber** | **String**| Filter results by phone number | [optional]
 **filterPhoneNumberIn** | **List&lt;String&gt;**| Filter results by a list of phone numbers | [optional]
 **filterPortingPhoneNumberId** | **UUID**| Filter results by porting phone number id | [optional]
 **filterPortingPhoneNumberIdIn** | **UUID**| Filter results by a list of porting phone number ids | [optional]
 **sort** | **String**| Specifies the sort order for results. If not given, results are sorted by created_at in descending order | [optional] [enum: -created_at, created_at]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**ListPortingPhoneNumberExtensions200Response**](ListPortingPhoneNumberExtensions200Response.md)

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
| **404** | Not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## listPortingPhoneNumbers

> ListPortingPhoneNumbers200Response listPortingPhoneNumbers(pageNumber, pageSize, filterPortingOrderId, filterPortingOrderIdIn, filterSupportKeyEq, filterSupportKeyIn, filterPhoneNumber, filterPhoneNumberIn, filterPortingOrderStatus, filterActivationStatus, filterPortabilityStatus)

List all porting phone numbers

Returns a list of your porting phone numbers.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        UUID filterPortingOrderId = UUID.fromString("f3575e15-32ce-400e-a4c0-dd78800c20b0"); // UUID | Filter results by porting order id
        List<UUID> filterPortingOrderIdIn = Arrays.asList(); // List<UUID> | Filter results by a list of porting order ids
        String filterSupportKeyEq = "sr_a12345"; // String | Filter results by support key
        List<String> filterSupportKeyIn = Arrays.asList(); // List<String> | Filter results by a list of support keys
        String filterPhoneNumber = "+12003151212"; // String | Filter results by phone number
        List<String> filterPhoneNumberIn = Arrays.asList(); // List<String> | Filter results by a list of phone numbers
        String filterPortingOrderStatus = "draft"; // String | Filter results by porting order status
        PortingOrderActivationStatus filterActivationStatus = PortingOrderActivationStatus.fromValue("New"); // PortingOrderActivationStatus | Filter results by activation status
        PortabilityStatus filterPortabilityStatus = PortabilityStatus.fromValue("pending"); // PortabilityStatus | Filter results by portability status
        try {
            ListPortingPhoneNumbers200Response result = apiInstance.listPortingPhoneNumbers(pageNumber, pageSize, filterPortingOrderId, filterPortingOrderIdIn, filterSupportKeyEq, filterSupportKeyIn, filterPhoneNumber, filterPhoneNumberIn, filterPortingOrderStatus, filterActivationStatus, filterPortabilityStatus);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#listPortingPhoneNumbers");
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
 **filterPortingOrderId** | **UUID**| Filter results by porting order id | [optional]
 **filterPortingOrderIdIn** | **List&lt;UUID&gt;**| Filter results by a list of porting order ids | [optional]
 **filterSupportKeyEq** | **String**| Filter results by support key | [optional]
 **filterSupportKeyIn** | **List&lt;String&gt;**| Filter results by a list of support keys | [optional]
 **filterPhoneNumber** | **String**| Filter results by phone number | [optional]
 **filterPhoneNumberIn** | **List&lt;String&gt;**| Filter results by a list of phone numbers | [optional]
 **filterPortingOrderStatus** | **String**| Filter results by porting order status | [optional] [enum: draft, in-process, submitted, exception, foc-date-confirmed, cancel-pending, ported, cancelled]
 **filterActivationStatus** | **PortingOrderActivationStatus**| Filter results by activation status | [optional] [enum: New, Pending, Conflict, Cancel Pending, Failed, Concurred, Activate RDY, Disconnect Pending, Concurrence Sent, Old, Sending, Active, Cancelled]
 **filterPortabilityStatus** | **PortabilityStatus**| Filter results by portability status | [optional] [enum: pending, confirmed, provisional]

### Return type

[**ListPortingPhoneNumbers200Response**](ListPortingPhoneNumbers200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## listPortingReports

> ListPortingReports200Response listPortingReports(pageNumber, pageSize, filterReportType, filterStatus)

List porting related reports

List the reports generated about porting operations.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterReportType = "export_porting_orders_csv"; // String | Filter reports of a specific type
        String filterStatus = "pending"; // String | Filter reports of a specific status
        try {
            ListPortingReports200Response result = apiInstance.listPortingReports(pageNumber, pageSize, filterReportType, filterStatus);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#listPortingReports");
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
 **filterReportType** | **String**| Filter reports of a specific type | [optional] [enum: export_porting_orders_csv]
 **filterStatus** | **String**| Filter reports of a specific status | [optional] [enum: pending, completed]

### Return type

[**ListPortingReports200Response**](ListPortingReports200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |
| **500** | Internal server error |  -  |


## listVerificationCodes

> ListVerificationCodes200Response listVerificationCodes(id, pageNumber, pageSize, filterPhoneNumber, filterPhoneNumberIn, filterVerified, sort)

List verification codes

Returns a list of verification codes for a porting order.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterPhoneNumber = "+12003151212"; // String | Filter results by phone number
        List<String> filterPhoneNumberIn = Arrays.asList(); // List<String> | Filter results by a list of phone numbers
        Boolean filterVerified = true; // Boolean | Filter verification codes that have been verified or not
        String sort = "created_at"; // String | Specifies the sort order for results. If not given, results are sorted by created_at in descending order.
        try {
            ListVerificationCodes200Response result = apiInstance.listVerificationCodes(id, pageNumber, pageSize, filterPhoneNumber, filterPhoneNumberIn, filterVerified, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#listVerificationCodes");
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
 **id** | **UUID**| Porting Order id |
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]
 **filterPhoneNumber** | **String**| Filter results by phone number | [optional]
 **filterPhoneNumberIn** | **List&lt;String&gt;**| Filter results by a list of phone numbers | [optional]
 **filterVerified** | **Boolean**| Filter verification codes that have been verified or not | [optional]
 **sort** | **String**| Specifies the sort order for results. If not given, results are sorted by created_at in descending order. | [optional] [enum: created_at, -created_at]

### Return type

[**ListVerificationCodes200Response**](ListVerificationCodes200Response.md)

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


## previewLoaConfiguration

> File previewLoaConfiguration(id)

Preview a LOA configuration

Preview a specific LOA configuration.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Identifies a LOA configuration.
        try {
            File result = apiInstance.previewLoaConfiguration(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#previewLoaConfiguration");
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
 **id** | **UUID**| Identifies a LOA configuration. |

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal server error |  -  |


## previewLoaConfigurationParams

> File previewLoaConfigurationParams(previewLoaConfigurationParamsRequest)

Preview the LOA configuration parameters

Preview the LOA template that would be generated without need to create LOA configuration.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        PreviewLoaConfigurationParamsRequest previewLoaConfigurationParamsRequest = new PreviewLoaConfigurationParamsRequest(); // PreviewLoaConfigurationParamsRequest | 
        try {
            File result = apiInstance.previewLoaConfigurationParams(previewLoaConfigurationParamsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#previewLoaConfigurationParams");
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
 **previewLoaConfigurationParamsRequest** | [**PreviewLoaConfigurationParamsRequest**](PreviewLoaConfigurationParamsRequest.md)|  |

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/pdf

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |
| **500** | Internal server error |  -  |


## republishPortingEvent

> republishPortingEvent(id)

Republish a porting event

Republish a specific porting event.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Identifies the porting event.
        try {
            apiInstance.republishPortingEvent(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#republishPortingEvent");
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
 **id** | **UUID**| Identifies the porting event. |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |


## sendPortingVerificationCodes

> sendPortingVerificationCodes(id, sendPortingVerificationCodesRequest)

Send the verification codes

Send the verification code for all porting phone numbers.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        SendPortingVerificationCodesRequest sendPortingVerificationCodesRequest = new SendPortingVerificationCodesRequest(); // SendPortingVerificationCodesRequest | A list of phone numbers to send the verification codes to and the method to send them by
        try {
            apiInstance.sendPortingVerificationCodes(id, sendPortingVerificationCodesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#sendPortingVerificationCodes");
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
 **id** | **UUID**| Porting Order id |
 **sendPortingVerificationCodesRequest** | [**SendPortingVerificationCodesRequest**](SendPortingVerificationCodesRequest.md)| A list of phone numbers to send the verification codes to and the method to send them by | [optional]

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## sharePortingOrder

> SharePortingOrder201Response sharePortingOrder(id, sharePortingOrderRequest)

Share a porting order

Creates a sharing token for a porting order. The token can be used to share the porting order with non-Telnyx users.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        SharePortingOrderRequest sharePortingOrderRequest = new SharePortingOrderRequest(); // SharePortingOrderRequest | 
        try {
            SharePortingOrder201Response result = apiInstance.sharePortingOrder(id, sharePortingOrderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#sharePortingOrder");
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
 **id** | **UUID**| Porting Order id |
 **sharePortingOrderRequest** | [**SharePortingOrderRequest**](SharePortingOrderRequest.md)|  |

### Return type

[**SharePortingOrder201Response**](SharePortingOrder201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Porting Order not found |  -  |


## showPortingEvent

> ShowPortingEvent200Response showPortingEvent(id)

Show a porting event

Show a specific porting event.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Identifies the porting event.
        try {
            ShowPortingEvent200Response result = apiInstance.showPortingEvent(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#showPortingEvent");
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
 **id** | **UUID**| Identifies the porting event. |

### Return type

[**ShowPortingEvent200Response**](ShowPortingEvent200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |


## updateLoaConfiguration

> CreateLoaConfiguration201Response updateLoaConfiguration(id, previewLoaConfigurationParamsRequest)

Update a LOA configuration

Update a specific LOA configuration.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Identifies a LOA configuration.
        PreviewLoaConfigurationParamsRequest previewLoaConfigurationParamsRequest = new PreviewLoaConfigurationParamsRequest(); // PreviewLoaConfigurationParamsRequest | 
        try {
            CreateLoaConfiguration201Response result = apiInstance.updateLoaConfiguration(id, previewLoaConfigurationParamsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#updateLoaConfiguration");
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
 **id** | **UUID**| Identifies a LOA configuration. |
 **previewLoaConfigurationParamsRequest** | [**PreviewLoaConfigurationParamsRequest**](PreviewLoaConfigurationParamsRequest.md)|  |

### Return type

[**CreateLoaConfiguration201Response**](CreateLoaConfiguration201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |
| **500** | Internal server error |  -  |


## updatePortingOrder

> UpdatePortingOrder200Response updatePortingOrder(id, updatePortingOrder)

Edit a porting order

Edits the details of an existing porting order.

Any or all of a porting orders attributes may be included in the resource object included in a PATCH request.

If a request does not include all of the attributes for a resource, the system will interpret the missing attributes as if they were included with their current values. To explicitly set something to null, it must be included in the request with a null value.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        UpdatePortingOrder updatePortingOrder = new UpdatePortingOrder(); // UpdatePortingOrder | 
        try {
            UpdatePortingOrder200Response result = apiInstance.updatePortingOrder(id, updatePortingOrder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#updatePortingOrder");
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
 **id** | **UUID**| Porting Order id |
 **updatePortingOrder** | [**UpdatePortingOrder**](UpdatePortingOrder.md)|  |

### Return type

[**UpdatePortingOrder200Response**](UpdatePortingOrder200Response.md)

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
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## updatePortingOrdersActivationJob

> ActivatePortingOrder202Response updatePortingOrdersActivationJob(id, activationJobId, updatePortingOrdersActivationJobRequest)

Update a porting activation job

Updates the activation time of a porting activation job.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        UUID activationJobId = UUID.randomUUID(); // UUID | Activation Job Identifier
        UpdatePortingOrdersActivationJobRequest updatePortingOrdersActivationJobRequest = new UpdatePortingOrdersActivationJobRequest(); // UpdatePortingOrdersActivationJobRequest | 
        try {
            ActivatePortingOrder202Response result = apiInstance.updatePortingOrdersActivationJob(id, activationJobId, updatePortingOrdersActivationJobRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#updatePortingOrdersActivationJob");
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
 **id** | **UUID**| Porting Order id |
 **activationJobId** | **UUID**| Activation Job Identifier |
 **updatePortingOrdersActivationJobRequest** | [**UpdatePortingOrdersActivationJobRequest**](UpdatePortingOrdersActivationJobRequest.md)|  |

### Return type

[**ActivatePortingOrder202Response**](ActivatePortingOrder202Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | Not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## verifyPortingVerificationCodes

> VerifyPortingVerificationCodes200Response verifyPortingVerificationCodes(id, verifyPortingVerificationCodesRequest)

Verify the verification code for a list of phone numbers

Verifies the verification code for a list of phone numbers.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrdersApi apiInstance = new PortingOrdersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        VerifyPortingVerificationCodesRequest verifyPortingVerificationCodesRequest = new VerifyPortingVerificationCodesRequest(); // VerifyPortingVerificationCodesRequest | A list of phone numbers and their verification codes
        try {
            VerifyPortingVerificationCodes200Response result = apiInstance.verifyPortingVerificationCodes(id, verifyPortingVerificationCodesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrdersApi#verifyPortingVerificationCodes");
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
 **id** | **UUID**| Porting Order id |
 **verifyPortingVerificationCodesRequest** | [**VerifyPortingVerificationCodesRequest**](VerifyPortingVerificationCodesRequest.md)| A list of phone numbers and their verification codes |

### Return type

[**VerifyPortingVerificationCodes200Response**](VerifyPortingVerificationCodes200Response.md)

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
| **422** | Unprocessable entity. Check message field in response for details. |  -  |

