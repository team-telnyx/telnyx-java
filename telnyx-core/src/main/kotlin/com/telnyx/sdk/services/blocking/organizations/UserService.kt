// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.organizations

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.organizations.users.UserGetGroupsReportParams
import com.telnyx.sdk.models.organizations.users.UserGetGroupsReportResponse
import com.telnyx.sdk.models.organizations.users.UserListPage
import com.telnyx.sdk.models.organizations.users.UserListParams
import com.telnyx.sdk.models.organizations.users.UserRetrieveParams
import com.telnyx.sdk.models.organizations.users.UserRetrieveResponse
import com.telnyx.sdk.services.blocking.organizations.users.ActionService
import java.util.function.Consumer

/** Operations related to users in your organization */
interface UserService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserService

    /** Operations related to users in your organization */
    fun actions(): ActionService

    /** Returns a user in your organization. */
    fun retrieve(id: String): UserRetrieveResponse = retrieve(id, UserRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: UserRetrieveParams = UserRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: UserRetrieveParams = UserRetrieveParams.none(),
    ): UserRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: UserRetrieveParams): UserRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): UserRetrieveResponse =
        retrieve(id, UserRetrieveParams.none(), requestOptions)

    /** Returns a list of the users in your organization. */
    fun list(): UserListPage = list(UserListParams.none())

    /** @see list */
    fun list(
        params: UserListParams = UserListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserListPage

    /** @see list */
    fun list(params: UserListParams = UserListParams.none()): UserListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): UserListPage =
        list(UserListParams.none(), requestOptions)

    /**
     * Returns a report of all users in your organization with their group memberships. This
     * endpoint returns all users without pagination and always includes group information. The
     * report can be retrieved in JSON or CSV format by sending specific content-type headers.
     */
    fun getGroupsReport(): UserGetGroupsReportResponse =
        getGroupsReport(UserGetGroupsReportParams.none())

    /** @see getGroupsReport */
    fun getGroupsReport(
        params: UserGetGroupsReportParams = UserGetGroupsReportParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserGetGroupsReportResponse

    /** @see getGroupsReport */
    fun getGroupsReport(
        params: UserGetGroupsReportParams = UserGetGroupsReportParams.none()
    ): UserGetGroupsReportResponse = getGroupsReport(params, RequestOptions.none())

    /** @see getGroupsReport */
    fun getGroupsReport(requestOptions: RequestOptions): UserGetGroupsReportResponse =
        getGroupsReport(UserGetGroupsReportParams.none(), requestOptions)

    /** A view of [UserService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserService.WithRawResponse

        /** Operations related to users in your organization */
        fun actions(): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /organizations/users/{id}`, but is otherwise the
         * same as [UserService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<UserRetrieveResponse> =
            retrieve(id, UserRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: UserRetrieveParams = UserRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: UserRetrieveParams = UserRetrieveParams.none(),
        ): HttpResponseFor<UserRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: UserRetrieveParams): HttpResponseFor<UserRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserRetrieveResponse> =
            retrieve(id, UserRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /organizations/users`, but is otherwise the same as
         * [UserService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<UserListPage> = list(UserListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: UserListParams = UserListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: UserListParams = UserListParams.none()): HttpResponseFor<UserListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<UserListPage> =
            list(UserListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /organizations/users/users_groups_report`, but is
         * otherwise the same as [UserService.getGroupsReport].
         */
        @MustBeClosed
        fun getGroupsReport(): HttpResponseFor<UserGetGroupsReportResponse> =
            getGroupsReport(UserGetGroupsReportParams.none())

        /** @see getGroupsReport */
        @MustBeClosed
        fun getGroupsReport(
            params: UserGetGroupsReportParams = UserGetGroupsReportParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserGetGroupsReportResponse>

        /** @see getGroupsReport */
        @MustBeClosed
        fun getGroupsReport(
            params: UserGetGroupsReportParams = UserGetGroupsReportParams.none()
        ): HttpResponseFor<UserGetGroupsReportResponse> =
            getGroupsReport(params, RequestOptions.none())

        /** @see getGroupsReport */
        @MustBeClosed
        fun getGroupsReport(
            requestOptions: RequestOptions
        ): HttpResponseFor<UserGetGroupsReportResponse> =
            getGroupsReport(UserGetGroupsReportParams.none(), requestOptions)
    }
}
