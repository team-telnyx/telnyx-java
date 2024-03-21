# BrandsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBrandPost**](BrandsApi.md#createBrandPost) | **POST** /brand | Create Brand
[**deleteBrand**](BrandsApi.md#deleteBrand) | **DELETE** /brand/{brandId} | Delete Brand
[**getBrand**](BrandsApi.md#getBrand) | **GET** /brand/{brandId} | Get Brand
[**getBrandFeedbackById**](BrandsApi.md#getBrandFeedbackById) | **GET** /brand/feedback/{brandId} | Get Brand Feedback By Id
[**getBrands**](BrandsApi.md#getBrands) | **GET** /brand | List Brands
[**listExternalVettings**](BrandsApi.md#listExternalVettings) | **GET** /brand/{brandId}/externalVetting | List External Vettings
[**postOrderExternalVetting**](BrandsApi.md#postOrderExternalVetting) | **POST** /brand/{brandId}/externalVetting | Order Brand External Vetting
[**putExternalVettingRecord**](BrandsApi.md#putExternalVettingRecord) | **PUT** /brand/{brandId}/externalVetting | Import External Vetting Record
[**revetBrand**](BrandsApi.md#revetBrand) | **PUT** /brand/{brandId}/revet | Revet Brand
[**updateBrand**](BrandsApi.md#updateBrand) | **PUT** /brand/{brandId} | Update Brand



## createBrandPost

> Object createBrandPost(createBrand)

Create Brand

This endpoint is used to create a new brand. A brand is an entity created by The Campaign Registry (TCR) that represents an organization or a company. It is this entity that TCR created campaigns will be associated with. Each brand creation will entail an upfront, non-refundable $4 expense.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BrandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BrandsApi apiInstance = new BrandsApi(defaultClient);
        CreateBrand createBrand = new CreateBrand(); // CreateBrand | 
        try {
            Object result = apiInstance.createBrandPost(createBrand);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandsApi#createBrandPost");
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
 **createBrand** | [**CreateBrand**](CreateBrand.md)|  |

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


## deleteBrand

> Object deleteBrand(brandId)

Delete Brand

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BrandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BrandsApi apiInstance = new BrandsApi(defaultClient);
        String brandId = "brandId_example"; // String | 
        try {
            Object result = apiInstance.deleteBrand(brandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandsApi#deleteBrand");
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
 **brandId** | **String**|  |

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
| **422** | Validation Error |  -  |


## getBrand

> TelnyxBrand getBrand(brandId)

Get Brand

Retrieve a brand by `brandId`.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BrandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BrandsApi apiInstance = new BrandsApi(defaultClient);
        String brandId = "brandId_example"; // String | 
        try {
            TelnyxBrand result = apiInstance.getBrand(brandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandsApi#getBrand");
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
 **brandId** | **String**|  |

### Return type

[**TelnyxBrand**](TelnyxBrand.md)

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


## getBrandFeedbackById

> BrandFeedback getBrandFeedbackById(brandId)

Get Brand Feedback By Id

Get feedback about a brand by ID. This endpoint can be used after creating or revetting
a brand.

Possible values for `.category[].id`:

* `TAX_ID` - Data mismatch related to tax id and its associated properties.
* `STOCK_SYMBOL` - Non public entity registered as a public for profit entity or
  the stock information mismatch.
* `GOVERNMENT_ENTITY` - Non government entity registered as a government entity.
  Must be a U.S. government entity.
* `NONPROFIT` - Not a recognized non-profit entity. No IRS tax-exempt status
  found.
* `OTHERS` - Details of the data misrepresentation if any.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BrandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BrandsApi apiInstance = new BrandsApi(defaultClient);
        String brandId = "brandId_example"; // String | 
        try {
            BrandFeedback result = apiInstance.getBrandFeedbackById(brandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandsApi#getBrandFeedbackById");
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
 **brandId** | **String**|  |

### Return type

[**BrandFeedback**](BrandFeedback.md)

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


## getBrands

> BrandRecordSetCSP getBrands(page, recordsPerPage, displayName, entityType, state, country)

List Brands

This endpoint is used to list all brands associated with your organization.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BrandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BrandsApi apiInstance = new BrandsApi(defaultClient);
        Integer page = 1; // Integer | 
        Integer recordsPerPage = 10; // Integer | number of records per page. maximum of 500
        String displayName = "displayName_example"; // String | 
        String entityType = "entityType_example"; // String | 
        String state = "state_example"; // String | 
        String country = "country_example"; // String | 
        try {
            BrandRecordSetCSP result = apiInstance.getBrands(page, recordsPerPage, displayName, entityType, state, country);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandsApi#getBrands");
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
 **page** | **Integer**|  | [optional] [default to 1]
 **recordsPerPage** | **Integer**| number of records per page. maximum of 500 | [optional] [default to 10]
 **displayName** | **String**|  | [optional]
 **entityType** | **String**|  | [optional]
 **state** | **String**|  | [optional]
 **country** | **String**|  | [optional]

### Return type

[**BrandRecordSetCSP**](BrandRecordSetCSP.md)

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


## listExternalVettings

> Object listExternalVettings(brandId)

List External Vettings

Get list of valid external vetting record for a given brand

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BrandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BrandsApi apiInstance = new BrandsApi(defaultClient);
        String brandId = "brandId_example"; // String | 
        try {
            Object result = apiInstance.listExternalVettings(brandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandsApi#listExternalVettings");
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
 **brandId** | **String**|  |

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
| **422** | Validation Error |  -  |


## postOrderExternalVetting

> Object postOrderExternalVetting(brandId, orderExternalVetting)

Order Brand External Vetting

Order new external vetting for a brand

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BrandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BrandsApi apiInstance = new BrandsApi(defaultClient);
        String brandId = "brandId_example"; // String | 
        OrderExternalVetting orderExternalVetting = new OrderExternalVetting(); // OrderExternalVetting | 
        try {
            Object result = apiInstance.postOrderExternalVetting(brandId, orderExternalVetting);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandsApi#postOrderExternalVetting");
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
 **brandId** | **String**|  |
 **orderExternalVetting** | [**OrderExternalVetting**](OrderExternalVetting.md)|  |

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


## putExternalVettingRecord

> ExternalVetting putExternalVettingRecord(brandId, importExternalVetting)

Import External Vetting Record

This operation can be used to import an external vetting record from a TCR-approved
vetting provider. If the vetting provider confirms validity of the record, it will be
saved with the brand and will be considered for future campaign qualification.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BrandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BrandsApi apiInstance = new BrandsApi(defaultClient);
        String brandId = "brandId_example"; // String | 
        ImportExternalVetting importExternalVetting = new ImportExternalVetting(); // ImportExternalVetting | 
        try {
            ExternalVetting result = apiInstance.putExternalVettingRecord(brandId, importExternalVetting);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandsApi#putExternalVettingRecord");
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
 **brandId** | **String**|  |
 **importExternalVetting** | [**ImportExternalVetting**](ImportExternalVetting.md)|  |

### Return type

[**ExternalVetting**](ExternalVetting.md)

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


## revetBrand

> Object revetBrand(brandId)

Revet Brand

This operation allows you to revet the brand. However, revetting is allowed once after the successful brand registration and thereafter limited to once every 3 months.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BrandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BrandsApi apiInstance = new BrandsApi(defaultClient);
        String brandId = "brandId_example"; // String | 
        try {
            Object result = apiInstance.revetBrand(brandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandsApi#revetBrand");
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
 **brandId** | **String**|  |

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
| **422** | Validation Error |  -  |


## updateBrand

> TelnyxBrand updateBrand(brandId, updateBrand)

Update Brand

Update a brand's attributes by `brandId`.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BrandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BrandsApi apiInstance = new BrandsApi(defaultClient);
        String brandId = "brandId_example"; // String | 
        UpdateBrand updateBrand = new UpdateBrand(); // UpdateBrand | 
        try {
            TelnyxBrand result = apiInstance.updateBrand(brandId, updateBrand);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandsApi#updateBrand");
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
 **brandId** | **String**|  |
 **updateBrand** | [**UpdateBrand**](UpdateBrand.md)|  |

### Return type

[**TelnyxBrand**](TelnyxBrand.md)

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

