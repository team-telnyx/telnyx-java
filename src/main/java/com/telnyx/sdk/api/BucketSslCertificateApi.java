package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;
import com.telnyx.sdk.model.GetStorageSSLCertificates200Response;
import jakarta.ws.rs.core.GenericType;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class BucketSslCertificateApi {

    private ApiClient apiClient;

    public BucketSslCertificateApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BucketSslCertificateApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get the API client
     *
     * @return API client
     */
    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Set the API client
     *
     * @param apiClient an instance of API client
     */
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
   * Add SSL Certificate
   * Uploads an SSL certificate and its matching secret so that you can use Telnyx’s storage as your CDN.
   * @param bucketName The name of the bucket (required)
   * @param certificate The SSL certificate file (optional)
   * @param privateKey The private key file (optional)
   * @return GetStorageSSLCertificates200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> SSL Certificate Response </td><td>  -  </td></tr>
     </table>
   */
    public GetStorageSSLCertificates200Response addStorageSSLCertificate(
        String bucketName,
        File certificate,
        File privateKey
    ) throws ApiException {
        return addStorageSSLCertificateWithHttpInfo(
            bucketName,
            certificate,
            privateKey
        ).getData();
    }

    /**
   * Add SSL Certificate
   * Uploads an SSL certificate and its matching secret so that you can use Telnyx’s storage as your CDN.
   * @param bucketName The name of the bucket (required)
   * @param certificate The SSL certificate file (optional)
   * @param privateKey The private key file (optional)
   * @return ApiResponse&lt;GetStorageSSLCertificates200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> SSL Certificate Response </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        GetStorageSSLCertificates200Response
    > addStorageSSLCertificateWithHttpInfo(
        String bucketName,
        File certificate,
        File privateKey
    ) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'bucketName' when calling addStorageSSLCertificate"
            );
        }

        // create path and map variables
        String localVarPath =
            "/storage/buckets/{bucketName}/ssl_certificate".replaceAll(
                    "\\{" + "bucketName" + "\\}",
                    apiClient.escapeString(bucketName.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (certificate != null) localVarFormParams.put(
            "certificate",
            certificate
        );
        if (privateKey != null) localVarFormParams.put(
            "private_key",
            privateKey
        );

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "multipart/form-data" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<GetStorageSSLCertificates200Response> localVarReturnType =
            new GenericType<GetStorageSSLCertificates200Response>() {};

        return apiClient.invokeAPI(
            "BucketSslCertificateApi.addStorageSSLCertificate",
            localVarPath,
            "PUT",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Get Bucket SSL Certificate
   * Returns the stored certificate detail of a bucket, if applicable.
   * @param bucketName The name of the bucket (required)
   * @return GetStorageSSLCertificates200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> SSL Certificate Response </td><td>  -  </td></tr>
     </table>
   */
    public GetStorageSSLCertificates200Response getStorageSSLCertificates(
        String bucketName
    ) throws ApiException {
        return getStorageSSLCertificatesWithHttpInfo(bucketName).getData();
    }

    /**
   * Get Bucket SSL Certificate
   * Returns the stored certificate detail of a bucket, if applicable.
   * @param bucketName The name of the bucket (required)
   * @return ApiResponse&lt;GetStorageSSLCertificates200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> SSL Certificate Response </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        GetStorageSSLCertificates200Response
    > getStorageSSLCertificatesWithHttpInfo(String bucketName)
        throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'bucketName' when calling getStorageSSLCertificates"
            );
        }

        // create path and map variables
        String localVarPath =
            "/storage/buckets/{bucketName}/ssl_certificate".replaceAll(
                    "\\{" + "bucketName" + "\\}",
                    apiClient.escapeString(bucketName.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = {};
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<GetStorageSSLCertificates200Response> localVarReturnType =
            new GenericType<GetStorageSSLCertificates200Response>() {};

        return apiClient.invokeAPI(
            "BucketSslCertificateApi.getStorageSSLCertificates",
            localVarPath,
            "GET",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Remove SSL Certificate
   * Deletes an SSL certificate and its matching secret.
   * @param bucketName Bucket Name (required)
   * @return GetStorageSSLCertificates200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> SSL Certificate Response </td><td>  -  </td></tr>
     </table>
   */
    public GetStorageSSLCertificates200Response removeStorageSSLCertificate(
        String bucketName
    ) throws ApiException {
        return removeStorageSSLCertificateWithHttpInfo(bucketName).getData();
    }

    /**
   * Remove SSL Certificate
   * Deletes an SSL certificate and its matching secret.
   * @param bucketName Bucket Name (required)
   * @return ApiResponse&lt;GetStorageSSLCertificates200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> SSL Certificate Response </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        GetStorageSSLCertificates200Response
    > removeStorageSSLCertificateWithHttpInfo(String bucketName)
        throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'bucketName' when calling removeStorageSSLCertificate"
            );
        }

        // create path and map variables
        String localVarPath =
            "/storage/buckets/{bucketName}/ssl_certificate".replaceAll(
                    "\\{" + "bucketName" + "\\}",
                    apiClient.escapeString(bucketName.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = {};
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<GetStorageSSLCertificates200Response> localVarReturnType =
            new GenericType<GetStorageSSLCertificates200Response>() {};

        return apiClient.invokeAPI(
            "BucketSslCertificateApi.removeStorageSSLCertificate",
            localVarPath,
            "DELETE",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }
}
