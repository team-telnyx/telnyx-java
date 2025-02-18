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
import com.telnyx.sdk.model.CreateMigration200Response;
import com.telnyx.sdk.model.CreateMigrationSource200Response;
import com.telnyx.sdk.model.ListMigrationSourceCoverage200Response;
import com.telnyx.sdk.model.ListMigrationSources200Response;
import com.telnyx.sdk.model.ListMigrations200Response;
import com.telnyx.sdk.model.MigrationParams;
import com.telnyx.sdk.model.MigrationSourceParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for DataMigrationApi
 */
public class DataMigrationApiTest {

    private final DataMigrationApi api = new DataMigrationApi();

    /**
     * Create a Migration
     *
     * Initiate a migration of data from an external provider into Telnyx Cloud Storage. Currently, only S3 is supported.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMigrationTest() throws ApiException {
        //MigrationParams migrationParams = null;
        //CreateMigration200Response response = api.createMigration(migrationParams);
        // TODO: test validations
    }

    /**
     * Create a Migration Source
     *
     * Create a source from which data can be migrated from.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMigrationSourceTest() throws ApiException {
        //MigrationSourceParams migrationSourceParams = null;
        //CreateMigrationSource200Response response = api.createMigrationSource(migrationSourceParams);
        // TODO: test validations
    }

    /**
     * Delete a Migration Source
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMigrationSourceTest() throws ApiException {
        //String id = null;
        //CreateMigrationSource200Response response = api.deleteMigrationSource(id);
        // TODO: test validations
    }

    /**
     * Get a Migration
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMigrationTest() throws ApiException {
        //String id = null;
        //CreateMigration200Response response = api.getMigration(id);
        // TODO: test validations
    }

    /**
     * Get a Migration Source
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMigrationSourceTest() throws ApiException {
        //String id = null;
        //CreateMigrationSource200Response response = api.getMigrationSource(id);
        // TODO: test validations
    }

    /**
     * List Migration Source coverage
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMigrationSourceCoverageTest() throws ApiException {
        //ListMigrationSourceCoverage200Response response = api.listMigrationSourceCoverage();
        // TODO: test validations
    }

    /**
     * List all Migration Sources
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMigrationSourcesTest() throws ApiException {
        //ListMigrationSources200Response response = api.listMigrationSources();
        // TODO: test validations
    }

    /**
     * List all Migrations
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMigrationsTest() throws ApiException {
        //ListMigrations200Response response = api.listMigrations();
        // TODO: test validations
    }

    /**
     * Stop a Migration
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void stopMigrationTest() throws ApiException {
        //String id = null;
        //CreateMigration200Response response = api.stopMigration(id);
        // TODO: test validations
    }
}
