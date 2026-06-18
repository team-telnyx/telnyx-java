// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieves paginated history of test runs for a specific test suite with filtering options */
class RunListParams
private constructor(
    private val suiteName: String?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val status: String?,
    private val testSuiteRunId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun suiteName(): Optional<String> = Optional.ofNullable(suiteName)

    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Filter runs by execution status (pending, running, completed, failed, timeout) */
    fun status(): Optional<String> = Optional.ofNullable(status)

    /** Filter runs by specific suite execution batch ID */
    fun testSuiteRunId(): Optional<String> = Optional.ofNullable(testSuiteRunId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): RunListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [RunListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunListParams]. */
    class Builder internal constructor() {

        private var suiteName: String? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var status: String? = null
        private var testSuiteRunId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(runListParams: RunListParams) = apply {
            suiteName = runListParams.suiteName
            pageNumber = runListParams.pageNumber
            pageSize = runListParams.pageSize
            status = runListParams.status
            testSuiteRunId = runListParams.testSuiteRunId
            additionalHeaders = runListParams.additionalHeaders.toBuilder()
            additionalQueryParams = runListParams.additionalQueryParams.toBuilder()
        }

        fun suiteName(suiteName: String?) = apply { this.suiteName = suiteName }

        /** Alias for calling [Builder.suiteName] with `suiteName.orElse(null)`. */
        fun suiteName(suiteName: Optional<String>) = suiteName(suiteName.getOrNull())

        fun pageNumber(pageNumber: Long?) = apply { this.pageNumber = pageNumber }

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Long) = pageNumber(pageNumber as Long?)

        /** Alias for calling [Builder.pageNumber] with `pageNumber.orElse(null)`. */
        fun pageNumber(pageNumber: Optional<Long>) = pageNumber(pageNumber.getOrNull())

        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /** Filter runs by execution status (pending, running, completed, failed, timeout) */
        fun status(status: String?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<String>) = status(status.getOrNull())

        /** Filter runs by specific suite execution batch ID */
        fun testSuiteRunId(testSuiteRunId: String?) = apply { this.testSuiteRunId = testSuiteRunId }

        /** Alias for calling [Builder.testSuiteRunId] with `testSuiteRunId.orElse(null)`. */
        fun testSuiteRunId(testSuiteRunId: Optional<String>) =
            testSuiteRunId(testSuiteRunId.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [RunListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RunListParams =
            RunListParams(
                suiteName,
                pageNumber,
                pageSize,
                status,
                testSuiteRunId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> suiteName ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                status?.let { put("status", it) }
                testSuiteRunId?.let { put("test_suite_run_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunListParams &&
            suiteName == other.suiteName &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            status == other.status &&
            testSuiteRunId == other.testSuiteRunId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            suiteName,
            pageNumber,
            pageSize,
            status,
            testSuiteRunId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "RunListParams{suiteName=$suiteName, pageNumber=$pageNumber, pageSize=$pageSize, status=$status, testSuiteRunId=$testSuiteRunId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
