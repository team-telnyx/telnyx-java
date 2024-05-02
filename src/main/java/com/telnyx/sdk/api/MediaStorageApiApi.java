package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import java.io.File;
import com.telnyx.sdk.model.ListOfMediaResourcesResponse;
import com.telnyx.sdk.model.MediaResourceResponse;
import com.telnyx.sdk.model.UpdateMediaRequest;
import com.telnyx.sdk.model.UploadMediaRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class MediaStorageApiApi {
  private ApiClient apiClient;

  public MediaStorageApiApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MediaStorageApiApi(ApiClient apiClient) {
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
   * Upload media
   * Upload media file to Telnyx so it can be used with other Telnyx services
   * @param uploadMediaRequest Upload media request (required)
   * @return MediaResourceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> A response describing a media resource </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public MediaResourceResponse createMediaStorage(UploadMediaRequest uploadMediaRequest) throws ApiException {
    return createMediaStorageWithHttpInfo(uploadMediaRequest).getData();
  }

  /**
   * Upload media
   * Upload media file to Telnyx so it can be used with other Telnyx services
   * @param uploadMediaRequest Upload media request (required)
   * @return ApiResponse&lt;MediaResourceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> A response describing a media resource </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MediaResourceResponse> createMediaStorageWithHttpInfo(UploadMediaRequest uploadMediaRequest) throws ApiException {
    Object localVarPostBody = uploadMediaRequest;
    
    // verify the required parameter 'uploadMediaRequest' is set
    if (uploadMediaRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'uploadMediaRequest' when calling createMediaStorage");
    }
    
    // create path and map variables
    String localVarPath = "/media";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<MediaResourceResponse> localVarReturnType = new GenericType<MediaResourceResponse>() {};

    return apiClient.invokeAPI("MediaStorageApiApi.createMediaStorage", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Deletes stored media
   * Deletes a stored media file.
   * @param mediaName Uniquely identifies a media resource. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The media was deleted successfully. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public void deleteMediaStorage(String mediaName) throws ApiException {
    deleteMediaStorageWithHttpInfo(mediaName);
  }

  /**
   * Deletes stored media
   * Deletes a stored media file.
   * @param mediaName Uniquely identifies a media resource. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The media was deleted successfully. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteMediaStorageWithHttpInfo(String mediaName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'mediaName' is set
    if (mediaName == null) {
      throw new ApiException(400, "Missing the required parameter 'mediaName' when calling deleteMediaStorage");
    }
    
    // create path and map variables
    String localVarPath = "/media/{media_name}"
      .replaceAll("\\{" + "media_name" + "\\}", apiClient.escapeString(mediaName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    return apiClient.invokeAPI("MediaStorageApiApi.deleteMediaStorage", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Download stored media
   * Downloads a stored media file.
   * @param mediaName Uniquely identifies a media resource. (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response describing a media resource </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public File downloadMedia(String mediaName) throws ApiException {
    return downloadMediaWithHttpInfo(mediaName).getData();
  }

  /**
   * Download stored media
   * Downloads a stored media file.
   * @param mediaName Uniquely identifies a media resource. (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response describing a media resource </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> downloadMediaWithHttpInfo(String mediaName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'mediaName' is set
    if (mediaName == null) {
      throw new ApiException(400, "Missing the required parameter 'mediaName' when calling downloadMedia");
    }
    
    // create path and map variables
    String localVarPath = "/media/{media_name}/download"
      .replaceAll("\\{" + "media_name" + "\\}", apiClient.escapeString(mediaName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<File> localVarReturnType = new GenericType<File>() {};

    return apiClient.invokeAPI("MediaStorageApiApi.downloadMedia", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve stored media
   * Returns the information about a stored media file.
   * @param mediaName Uniquely identifies a media resource. (required)
   * @return MediaResourceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response describing a media resource </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public MediaResourceResponse getMediaStorage(String mediaName) throws ApiException {
    return getMediaStorageWithHttpInfo(mediaName).getData();
  }

  /**
   * Retrieve stored media
   * Returns the information about a stored media file.
   * @param mediaName Uniquely identifies a media resource. (required)
   * @return ApiResponse&lt;MediaResourceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response describing a media resource </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MediaResourceResponse> getMediaStorageWithHttpInfo(String mediaName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'mediaName' is set
    if (mediaName == null) {
      throw new ApiException(400, "Missing the required parameter 'mediaName' when calling getMediaStorage");
    }
    
    // create path and map variables
    String localVarPath = "/media/{media_name}"
      .replaceAll("\\{" + "media_name" + "\\}", apiClient.escapeString(mediaName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<MediaResourceResponse> localVarReturnType = new GenericType<MediaResourceResponse>() {};

    return apiClient.invokeAPI("MediaStorageApiApi.getMediaStorage", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List uploaded media
   * Returns a list of stored media files.
   * @param filterContentType Filters files by given content types (optional)
   * @return ListOfMediaResourcesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response with a list of media resources </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListOfMediaResourcesResponse listMediaStorage(String filterContentType) throws ApiException {
    return listMediaStorageWithHttpInfo(filterContentType).getData();
  }

  /**
   * List uploaded media
   * Returns a list of stored media files.
   * @param filterContentType Filters files by given content types (optional)
   * @return ApiResponse&lt;ListOfMediaResourcesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response with a list of media resources </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListOfMediaResourcesResponse> listMediaStorageWithHttpInfo(String filterContentType) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/media";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[content_type][]", filterContentType));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListOfMediaResourcesResponse> localVarReturnType = new GenericType<ListOfMediaResourcesResponse>() {};

    return apiClient.invokeAPI("MediaStorageApiApi.listMediaStorage", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update stored media
   * Updates a stored media file.
   * @param mediaName Uniquely identifies a media resource. (required)
   * @param updateMediaRequest Update media request (required)
   * @return MediaResourceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response describing a media resource </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public MediaResourceResponse updateMediaStorage(String mediaName, UpdateMediaRequest updateMediaRequest) throws ApiException {
    return updateMediaStorageWithHttpInfo(mediaName, updateMediaRequest).getData();
  }

  /**
   * Update stored media
   * Updates a stored media file.
   * @param mediaName Uniquely identifies a media resource. (required)
   * @param updateMediaRequest Update media request (required)
   * @return ApiResponse&lt;MediaResourceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response describing a media resource </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MediaResourceResponse> updateMediaStorageWithHttpInfo(String mediaName, UpdateMediaRequest updateMediaRequest) throws ApiException {
    Object localVarPostBody = updateMediaRequest;
    
    // verify the required parameter 'mediaName' is set
    if (mediaName == null) {
      throw new ApiException(400, "Missing the required parameter 'mediaName' when calling updateMediaStorage");
    }
    
    // verify the required parameter 'updateMediaRequest' is set
    if (updateMediaRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateMediaRequest' when calling updateMediaStorage");
    }
    
    // create path and map variables
    String localVarPath = "/media/{media_name}"
      .replaceAll("\\{" + "media_name" + "\\}", apiClient.escapeString(mediaName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<MediaResourceResponse> localVarReturnType = new GenericType<MediaResourceResponse>() {};

    return apiClient.invokeAPI("MediaStorageApiApi.updateMediaStorage", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
