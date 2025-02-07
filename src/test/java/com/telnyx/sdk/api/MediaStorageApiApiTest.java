/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.telnyx.sdk.api;

import com.telnyx.sdk.*;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListOfMediaResourcesResponse;
import com.telnyx.sdk.model.MediaResourceResponse;
import com.telnyx.sdk.model.UpdateMediaRequest;
import com.telnyx.sdk.model.UploadMediaRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for MediaStorageApiApi
 */
public class MediaStorageApiApiTest {

    private final MediaStorageApiApi api = new MediaStorageApiApi();

    /**
     * Upload media
     *
     * Upload media file to Telnyx so it can be used with other Telnyx services
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMediaStorageTest() throws ApiException {
        //UploadMediaRequest uploadMediaRequest = null;
        //MediaResourceResponse response = api.createMediaStorage(uploadMediaRequest);
        // TODO: test validations
    }

    /**
     * Deletes stored media
     *
     * Deletes a stored media file.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMediaStorageTest() throws ApiException {
        //String mediaName = null;
        //api.deleteMediaStorage(mediaName);
        // TODO: test validations
    }

    /**
     * Download stored media
     *
     * Downloads a stored media file.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadMediaStorageTest() throws ApiException {
        //String mediaName = null;
        //File response = api.downloadMediaStorage(mediaName);
        // TODO: test validations
    }

    /**
     * Retrieve stored media
     *
     * Returns the information about a stored media file.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMediaStorageTest() throws ApiException {
        //String mediaName = null;
        //MediaResourceResponse response = api.getMediaStorage(mediaName);
        // TODO: test validations
    }

    /**
     * List uploaded media
     *
     * Returns a list of stored media files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMediaStorageTest() throws ApiException {
        //String filterContentType = null;
        //ListOfMediaResourcesResponse response = api.listMediaStorage(filterContentType);
        // TODO: test validations
    }

    /**
     * Update stored media
     *
     * Updates a stored media file.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMediaStorageTest() throws ApiException {
        //String mediaName = null;
        //UpdateMediaRequest updateMediaRequest = null;
        //MediaResourceResponse response = api.updateMediaStorage(mediaName, updateMediaRequest);
        // TODO: test validations
    }
}
