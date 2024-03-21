# PhoneNumberOrdersApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createComment**](PhoneNumberOrdersApi.md#createComment) | **POST** /comments | Create a comment
[**createNumberOrder**](PhoneNumberOrdersApi.md#createNumberOrder) | **POST** /number_orders | Create a number order
[**getNumberOrderPhoneNumber**](PhoneNumberOrdersApi.md#getNumberOrderPhoneNumber) | **GET** /number_order_phone_numbers/{number_order_phone_number_id} | Retrieve a number order phone number.
[**getSubNumberOrder**](PhoneNumberOrdersApi.md#getSubNumberOrder) | **GET** /sub_number_orders/{sub_number_order_id} | Retrieve a sub number order
[**listComments**](PhoneNumberOrdersApi.md#listComments) | **GET** /comments | Retrieve all comments
[**listNumberOrders**](PhoneNumberOrdersApi.md#listNumberOrders) | **GET** /number_orders | List number orders
[**listRegulatoryRequirements**](PhoneNumberOrdersApi.md#listRegulatoryRequirements) | **GET** /phone_numbers_regulatory_requirements | Retrieve regulartory requirements
[**listSubNumberOrders**](PhoneNumberOrdersApi.md#listSubNumberOrders) | **GET** /sub_number_orders | List sub number orders
[**markCommentRead**](PhoneNumberOrdersApi.md#markCommentRead) | **PATCH** /comments/{id}/read | Mark a comment as read
[**retrieveComment**](PhoneNumberOrdersApi.md#retrieveComment) | **GET** /comments/{id} | Retrieve a comment
[**retrieveNumberOrder**](PhoneNumberOrdersApi.md#retrieveNumberOrder) | **GET** /number_orders/{number_order_id} | Retrieve a number order
[**retrieveOrderPhoneNumbers**](PhoneNumberOrdersApi.md#retrieveOrderPhoneNumbers) | **GET** /number_order_phone_numbers | Retrieve a list of phone numbers associated to orders
[**updateNumberOrder**](PhoneNumberOrdersApi.md#updateNumberOrder) | **PATCH** /number_orders/{number_order_id} | Update a number order
[**updateNumberOrderPhoneNumber**](PhoneNumberOrdersApi.md#updateNumberOrderPhoneNumber) | **PATCH** /number_order_phone_numbers/{number_order_phone_number_id} | Update a number order phone number.
[**updateSubNumberOrder**](PhoneNumberOrdersApi.md#updateSubNumberOrder) | **PATCH** /sub_number_orders/{sub_number_order_id} | Update a sub number order



## createComment

> CreateComment200Response createComment(comment)

Create a comment

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberOrdersApi apiInstance = new PhoneNumberOrdersApi(defaultClient);
        Comment comment = new Comment(); // Comment | 
        try {
            CreateComment200Response result = apiInstance.createComment(comment);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberOrdersApi#createComment");
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
 **comment** | [**Comment**](Comment.md)|  |

### Return type

[**CreateComment200Response**](CreateComment200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Comment Response |  -  |
| **0** | Unexpected error |  -  |


## createNumberOrder

> NumberOrderResponse createNumberOrder(createNumberOrderRequest)

Create a number order

Creates a phone number order.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberOrdersApi apiInstance = new PhoneNumberOrdersApi(defaultClient);
        CreateNumberOrderRequest createNumberOrderRequest = new CreateNumberOrderRequest(); // CreateNumberOrderRequest | 
        try {
            NumberOrderResponse result = apiInstance.createNumberOrder(createNumberOrderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberOrdersApi#createNumberOrder");
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
 **createNumberOrderRequest** | [**CreateNumberOrderRequest**](CreateNumberOrderRequest.md)|  |

### Return type

[**NumberOrderResponse**](NumberOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number order. |  -  |
| **0** | Unexpected error |  -  |


## getNumberOrderPhoneNumber

> NumberOrderPhoneNumberResponse getNumberOrderPhoneNumber(numberOrderPhoneNumberId)

Retrieve a number order phone number.

Get an existing number order phone number.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberOrdersApi apiInstance = new PhoneNumberOrdersApi(defaultClient);
        String numberOrderPhoneNumberId = "numberOrderPhoneNumberId_example"; // String | The number order phone number ID.
        try {
            NumberOrderPhoneNumberResponse result = apiInstance.getNumberOrderPhoneNumber(numberOrderPhoneNumberId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberOrdersApi#getNumberOrderPhoneNumber");
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
 **numberOrderPhoneNumberId** | **String**| The number order phone number ID. |

### Return type

[**NumberOrderPhoneNumberResponse**](NumberOrderPhoneNumberResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number order phone number. |  -  |
| **0** | Unexpected error |  -  |


## getSubNumberOrder

> SubNumberOrderResponse getSubNumberOrder(subNumberOrderId, filterIncludePhoneNumbers)

Retrieve a sub number order

Get an existing sub number order.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberOrdersApi apiInstance = new PhoneNumberOrdersApi(defaultClient);
        String subNumberOrderId = "subNumberOrderId_example"; // String | The sub number order ID.
        Boolean filterIncludePhoneNumbers = false; // Boolean | Include the first 50 phone number objects in the results
        try {
            SubNumberOrderResponse result = apiInstance.getSubNumberOrder(subNumberOrderId, filterIncludePhoneNumbers);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberOrdersApi#getSubNumberOrder");
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
 **subNumberOrderId** | **String**| The sub number order ID. |
 **filterIncludePhoneNumbers** | **Boolean**| Include the first 50 phone number objects in the results | [optional] [default to false]

### Return type

[**SubNumberOrderResponse**](SubNumberOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a sub number order. |  -  |
| **0** | Unexpected error |  -  |


## listComments

> ListComments200Response listComments(filterCommentRecordType, filterCommentRecordId)

Retrieve all comments

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberOrdersApi apiInstance = new PhoneNumberOrdersApi(defaultClient);
        String filterCommentRecordType = "sub_number_order"; // String | Record type that the comment relates to i.e number_order, sub_number_order or number_order_phone_number
        String filterCommentRecordId = "8ffb3622-7c6b-4ccc-b65f-7a3dc0099576"; // String | ID of the record the comments relate to
        try {
            ListComments200Response result = apiInstance.listComments(filterCommentRecordType, filterCommentRecordId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberOrdersApi#listComments");
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
 **filterCommentRecordType** | **String**| Record type that the comment relates to i.e number_order, sub_number_order or number_order_phone_number |
 **filterCommentRecordId** | **String**| ID of the record the comments relate to |

### Return type

[**ListComments200Response**](ListComments200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of Comment Responses |  -  |
| **0** | Unexpected error |  -  |


## listNumberOrders

> ListNumberOrdersResponse listNumberOrders().filterStatus(filterStatus).filterCreatedAtGt(filterCreatedAtGt).filterCreatedAtLt(filterCreatedAtLt).filterPhoneNumbersCount(filterPhoneNumbersCount).filterCustomerReference(filterCustomerReference).filterRequirementsMet(filterRequirementsMet).pageNumber(pageNumber).pageSize(pageSize).execute();

List number orders

Get a paginated list of number orders.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberOrdersApi apiInstance = new PhoneNumberOrdersApi(defaultClient);
        String filterStatus = "filterStatus_example"; // String | Filter number orders by status.
        String filterCreatedAtGt = "filterCreatedAtGt_example"; // String | Filter number orders later than this value.
        String filterCreatedAtLt = "filterCreatedAtLt_example"; // String | Filter number orders earlier than this value.
        String filterPhoneNumbersCount = "filterPhoneNumbersCount_example"; // String | Filter number order with this amount of numbers
        String filterCustomerReference = "filterCustomerReference_example"; // String | Filter number orders via the customer reference set.
        Boolean filterRequirementsMet = true; // Boolean | Filter number orders by requirements met.
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListNumberOrdersResponse result = api.listNumberOrders()
                .filterStatus(filterStatus)
                .filterCreatedAtGt(filterCreatedAtGt)
                .filterCreatedAtLt(filterCreatedAtLt)
                .filterPhoneNumbersCount(filterPhoneNumbersCount)
                .filterCustomerReference(filterCustomerReference)
                .filterRequirementsMet(filterRequirementsMet)
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberOrdersApi#listNumberOrders");
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
 **filterStatus** | **String**| Filter number orders by status. | [optional]
 **filterCreatedAtGt** | **String**| Filter number orders later than this value. | [optional]
 **filterCreatedAtLt** | **String**| Filter number orders earlier than this value. | [optional]
 **filterPhoneNumbersCount** | **String**| Filter number order with this amount of numbers | [optional]
 **filterCustomerReference** | **String**| Filter number orders via the customer reference set. | [optional]
 **filterRequirementsMet** | **Boolean**| Filter number orders by requirements met. | [optional]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**ListNumberOrdersResponse**](ListNumberOrdersResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of number orders. |  -  |
| **0** | Unexpected error |  -  |


## listRegulatoryRequirements

> ListRegulatoryRequirements200Response listRegulatoryRequirements(filterPhoneNumber)

Retrieve regulartory requirements

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberOrdersApi apiInstance = new PhoneNumberOrdersApi(defaultClient);
        String filterPhoneNumber = "+41215470622,+41215470633"; // String | Record type phone number/ phone numbers
        try {
            ListRegulatoryRequirements200Response result = apiInstance.listRegulatoryRequirements(filterPhoneNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberOrdersApi#listRegulatoryRequirements");
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
 **filterPhoneNumber** | **String**| Record type phone number/ phone numbers |

### Return type

[**ListRegulatoryRequirements200Response**](ListRegulatoryRequirements200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of Regulatory Requiremenst Responses |  -  |
| **0** | Unexpected error |  -  |


## listSubNumberOrders

> ListSubNumberOrdersResponse listSubNumberOrders().filterUserId(filterUserId).filterOrderRequestId(filterOrderRequestId).filterCountryCode(filterCountryCode).filterPhoneNumberType(filterPhoneNumberType).filterPhoneNumbersCount(filterPhoneNumbersCount).filterIncludePhoneNumbers(filterIncludePhoneNumbers).execute();

List sub number orders

Get a paginated list of sub number orders.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberOrdersApi apiInstance = new PhoneNumberOrdersApi(defaultClient);
        UUID filterUserId = UUID.fromString("d70873cd-7c98-401a-81b6-b1ae08246995"); // UUID | User ID of the user who owns the sub number order
        UUID filterOrderRequestId = UUID.fromString("12ade33a-21c0-473b-b055-b3c836e1c293"); // UUID | ID of the number order the sub number order belongs to
        String filterCountryCode = "US"; // String | ISO alpha-2 country code.
        String filterPhoneNumberType = "local"; // String | Phone Number Type
        Integer filterPhoneNumbersCount = 1; // Integer | Amount of numbers in the sub number order
        Boolean filterIncludePhoneNumbers = false; // Boolean | Include the first 50 phone number objects for each sub order in the results. Note: use of this filter could produce unexpected results due to payload size.
        try {
            ListSubNumberOrdersResponse result = api.listSubNumberOrders()
                .filterUserId(filterUserId)
                .filterOrderRequestId(filterOrderRequestId)
                .filterCountryCode(filterCountryCode)
                .filterPhoneNumberType(filterPhoneNumberType)
                .filterPhoneNumbersCount(filterPhoneNumbersCount)
                .filterIncludePhoneNumbers(filterIncludePhoneNumbers)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberOrdersApi#listSubNumberOrders");
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
 **filterUserId** | **UUID**| User ID of the user who owns the sub number order | [optional]
 **filterOrderRequestId** | **UUID**| ID of the number order the sub number order belongs to | [optional]
 **filterCountryCode** | **String**| ISO alpha-2 country code. | [optional]
 **filterPhoneNumberType** | **String**| Phone Number Type | [optional]
 **filterPhoneNumbersCount** | **Integer**| Amount of numbers in the sub number order | [optional]
 **filterIncludePhoneNumbers** | **Boolean**| Include the first 50 phone number objects for each sub order in the results. Note: use of this filter could produce unexpected results due to payload size. | [optional] [default to false]

### Return type

[**ListSubNumberOrdersResponse**](ListSubNumberOrdersResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of sub number orders. |  -  |
| **0** | Unexpected error |  -  |


## markCommentRead

> MarkCommentRead200Response markCommentRead(id)

Mark a comment as read

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberOrdersApi apiInstance = new PhoneNumberOrdersApi(defaultClient);
        String id = "id_example"; // String | The comment ID.
        try {
            MarkCommentRead200Response result = apiInstance.markCommentRead(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberOrdersApi#markCommentRead");
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
 **id** | **String**| The comment ID. |

### Return type

[**MarkCommentRead200Response**](MarkCommentRead200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Comment Response |  -  |
| **0** | Unexpected error |  -  |


## retrieveComment

> CreateComment200Response retrieveComment(id)

Retrieve a comment

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberOrdersApi apiInstance = new PhoneNumberOrdersApi(defaultClient);
        String id = "id_example"; // String | The comment ID.
        try {
            CreateComment200Response result = apiInstance.retrieveComment(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberOrdersApi#retrieveComment");
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
 **id** | **String**| The comment ID. |

### Return type

[**CreateComment200Response**](CreateComment200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Comment Response |  -  |
| **0** | Unexpected error |  -  |


## retrieveNumberOrder

> NumberOrderResponse retrieveNumberOrder(numberOrderId)

Retrieve a number order

Get an existing phone number order.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberOrdersApi apiInstance = new PhoneNumberOrdersApi(defaultClient);
        String numberOrderId = "numberOrderId_example"; // String | The number order ID.
        try {
            NumberOrderResponse result = apiInstance.retrieveNumberOrder(numberOrderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberOrdersApi#retrieveNumberOrder");
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
 **numberOrderId** | **String**| The number order ID. |

### Return type

[**NumberOrderResponse**](NumberOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number order. |  -  |
| **0** | Unexpected error |  -  |


## retrieveOrderPhoneNumbers

> ListNumberOrderPhoneNumbersResponse retrieveOrderPhoneNumbers()

Retrieve a list of phone numbers associated to orders

Get a list of phone numbers associated to orders.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberOrdersApi apiInstance = new PhoneNumberOrdersApi(defaultClient);
        try {
            ListNumberOrderPhoneNumbersResponse result = apiInstance.retrieveOrderPhoneNumbers();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberOrdersApi#retrieveOrderPhoneNumbers");
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

[**ListNumberOrderPhoneNumbersResponse**](ListNumberOrderPhoneNumbersResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of number order phone numbers. |  -  |
| **0** | Unexpected error |  -  |


## updateNumberOrder

> NumberOrderResponse updateNumberOrder(numberOrderId, updateNumberOrderRequest)

Update a number order

Updates a phone number order.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberOrdersApi apiInstance = new PhoneNumberOrdersApi(defaultClient);
        String numberOrderId = "numberOrderId_example"; // String | The number order ID.
        UpdateNumberOrderRequest updateNumberOrderRequest = new UpdateNumberOrderRequest(); // UpdateNumberOrderRequest | 
        try {
            NumberOrderResponse result = apiInstance.updateNumberOrder(numberOrderId, updateNumberOrderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberOrdersApi#updateNumberOrder");
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
 **numberOrderId** | **String**| The number order ID. |
 **updateNumberOrderRequest** | [**UpdateNumberOrderRequest**](UpdateNumberOrderRequest.md)|  |

### Return type

[**NumberOrderResponse**](NumberOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number order. |  -  |
| **0** | Unexpected error |  -  |


## updateNumberOrderPhoneNumber

> NumberOrderPhoneNumberResponse updateNumberOrderPhoneNumber(numberOrderPhoneNumberId, updateNumberOrderPhoneNumberRequest)

Update a number order phone number.

Updates a number order phone number.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberOrdersApi apiInstance = new PhoneNumberOrdersApi(defaultClient);
        String numberOrderPhoneNumberId = "numberOrderPhoneNumberId_example"; // String | The number order phone number ID.
        UpdateNumberOrderPhoneNumberRequest updateNumberOrderPhoneNumberRequest = new UpdateNumberOrderPhoneNumberRequest(); // UpdateNumberOrderPhoneNumberRequest | 
        try {
            NumberOrderPhoneNumberResponse result = apiInstance.updateNumberOrderPhoneNumber(numberOrderPhoneNumberId, updateNumberOrderPhoneNumberRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberOrdersApi#updateNumberOrderPhoneNumber");
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
 **numberOrderPhoneNumberId** | **String**| The number order phone number ID. |
 **updateNumberOrderPhoneNumberRequest** | [**UpdateNumberOrderPhoneNumberRequest**](UpdateNumberOrderPhoneNumberRequest.md)|  |

### Return type

[**NumberOrderPhoneNumberResponse**](NumberOrderPhoneNumberResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number order phone number. |  -  |
| **0** | Unexpected error |  -  |


## updateSubNumberOrder

> SubNumberOrderResponse updateSubNumberOrder(subNumberOrderId, updateSubNumberOrderRequest)

Update a sub number order

Updates a sub number order.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberOrdersApi apiInstance = new PhoneNumberOrdersApi(defaultClient);
        String subNumberOrderId = "subNumberOrderId_example"; // String | The sub number order ID.
        UpdateSubNumberOrderRequest updateSubNumberOrderRequest = new UpdateSubNumberOrderRequest(); // UpdateSubNumberOrderRequest | 
        try {
            SubNumberOrderResponse result = apiInstance.updateSubNumberOrder(subNumberOrderId, updateSubNumberOrderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberOrdersApi#updateSubNumberOrder");
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
 **subNumberOrderId** | **String**| The sub number order ID. |
 **updateSubNumberOrderRequest** | [**UpdateSubNumberOrderRequest**](UpdateSubNumberOrderRequest.md)|  |

### Return type

[**SubNumberOrderResponse**](SubNumberOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a sub number order. |  -  |
| **0** | Unexpected error |  -  |

