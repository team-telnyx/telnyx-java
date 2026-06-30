// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.organizations

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.organizations.users.UserGetGroupsReportParams
import com.telnyx.sdk.models.organizations.users.UserGetGroupsReportResponse
import com.telnyx.sdk.models.organizations.users.UserListPageAsync
import com.telnyx.sdk.models.organizations.users.UserListParams
import com.telnyx.sdk.models.organizations.users.UserRetrieveParams
import com.telnyx.sdk.models.organizations.users.UserRetrieveResponse
import com.telnyx.sdk.services.async.organizations.users.ActionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Operations related to users in your organization */
interface UserServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync

    /** Operations related to users in your organization */
    fun actions(): ActionServiceAsync

    /** Returns a user in your organization. */
    fun retrieve(id: String): CompletableFuture<UserRetrieveResponse> =
        retrieve(id, UserRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: UserRetrieveParams = UserRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: UserRetrieveParams = UserRetrieveParams.none(),
    ): CompletableFuture<UserRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: UserRetrieveParams): CompletableFuture<UserRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserRetrieveResponse> =
        retrieve(id, UserRetrieveParams.none(), requestOptions)

    /** Returns a list of the users in your organization. */
    fun list(): CompletableFuture<UserListPageAsync> = list(UserListParams.none())

    /** @see list */
    fun list(
        params: UserListParams = UserListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserListPageAsync>

    /** @see list */
    fun list(params: UserListParams = UserListParams.none()): CompletableFuture<UserListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<UserListPageAsync> =
        list(UserListParams.none(), requestOptions)

    /**
     * Returns a report of all users in your organization with their group memberships. This
     * endpoint returns all users without pagination and always includes group information. The
     * report can be retrieved in JSON or CSV format by sending specific content-type headers.
     */
    fun getGroupsReport(): CompletableFuture<UserGetGroupsReportResponse> =
        getGroupsReport(UserGetGroupsReportParams.none())

    /** @see getGroupsReport */
    fun getGroupsReport(
        params: UserGetGroupsReportParams = UserGetGroupsReportParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserGetGroupsReportResponse>

    /** @see getGroupsReport */
    fun getGroupsReport(
        params: UserGetGroupsReportParams = UserGetGroupsReportParams.none()
    ): CompletableFuture<UserGetGroupsReportResponse> =
        getGroupsReport(params, RequestOptions.none())

    /** @see getGroupsReport */
    fun getGroupsReport(
        requestOptions: RequestOptions
    ): CompletableFuture<UserGetGroupsReportResponse> =
        getGroupsReport(UserGetGroupsReportParams.none(), requestOptions)

    /** A view of [UserServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync.WithRawResponse

        /** Operations related to users in your organization */
        fun actions(): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /organizations/users/{id}`, but is otherwise the
         * same as [UserServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<UserRetrieveResponse>> =
            retrieve(id, UserRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: UserRetrieveParams = UserRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: UserRetrieveParams = UserRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<UserRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: UserRetrieveParams
        ): CompletableFuture<HttpResponseFor<UserRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserRetrieveResponse>> =
            retrieve(id, UserRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /organizations/users`, but is otherwise the same as
         * [UserServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<UserListPageAsync>> =
            list(UserListParams.none())

        /** @see list */
        fun list(
            params: UserListParams = UserListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserListPageAsync>>

        /** @see list */
        fun list(
            params: UserListParams = UserListParams.none()
        ): CompletableFuture<HttpResponseFor<UserListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<UserListPageAsync>> =
            list(UserListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /organizations/users/users_groups_report`, but is
         * otherwise the same as [UserServiceAsync.getGroupsReport].
         */
        fun getGroupsReport(): CompletableFuture<HttpResponseFor<UserGetGroupsReportResponse>> =
            getGroupsReport(UserGetGroupsReportParams.none())

        /** @see getGroupsReport */
        fun getGroupsReport(
            params: UserGetGroupsReportParams = UserGetGroupsReportParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserGetGroupsReportResponse>>

        /** @see getGroupsReport */
        fun getGroupsReport(
            params: UserGetGroupsReportParams = UserGetGroupsReportParams.none()
        ): CompletableFuture<HttpResponseFor<UserGetGroupsReportResponse>> =
            getGroupsReport(params, RequestOptions.none())

        /** @see getGroupsReport */
        fun getGroupsReport(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<UserGetGroupsReportResponse>> =
            getGroupsReport(UserGetGroupsReportParams.none(), requestOptions)
    }
}
