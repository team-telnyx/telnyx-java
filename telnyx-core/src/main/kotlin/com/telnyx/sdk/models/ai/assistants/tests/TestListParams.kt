// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.tests

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieves a paginated list of assistant tests with optional filtering capabilities */
class TestListParams
private constructor(
    private val destination: String?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val telnyxConversationChannel: String?,
    private val testSuite: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter tests by destination (phone number, webhook URL, etc.) */
    fun destination(): Optional<String> = Optional.ofNullable(destination)

    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Filter tests by communication channel (e.g., 'web_chat', 'sms') */
    fun telnyxConversationChannel(): Optional<String> =
        Optional.ofNullable(telnyxConversationChannel)

    /** Filter tests by test suite name */
    fun testSuite(): Optional<String> = Optional.ofNullable(testSuite)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): TestListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [TestListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TestListParams]. */
    class Builder internal constructor() {

        private var destination: String? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var telnyxConversationChannel: String? = null
        private var testSuite: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(testListParams: TestListParams) = apply {
            destination = testListParams.destination
            pageNumber = testListParams.pageNumber
            pageSize = testListParams.pageSize
            telnyxConversationChannel = testListParams.telnyxConversationChannel
            testSuite = testListParams.testSuite
            additionalHeaders = testListParams.additionalHeaders.toBuilder()
            additionalQueryParams = testListParams.additionalQueryParams.toBuilder()
        }

        /** Filter tests by destination (phone number, webhook URL, etc.) */
        fun destination(destination: String?) = apply { this.destination = destination }

        /** Alias for calling [Builder.destination] with `destination.orElse(null)`. */
        fun destination(destination: Optional<String>) = destination(destination.getOrNull())

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

        /** Filter tests by communication channel (e.g., 'web_chat', 'sms') */
        fun telnyxConversationChannel(telnyxConversationChannel: String?) = apply {
            this.telnyxConversationChannel = telnyxConversationChannel
        }

        /**
         * Alias for calling [Builder.telnyxConversationChannel] with
         * `telnyxConversationChannel.orElse(null)`.
         */
        fun telnyxConversationChannel(telnyxConversationChannel: Optional<String>) =
            telnyxConversationChannel(telnyxConversationChannel.getOrNull())

        /** Filter tests by test suite name */
        fun testSuite(testSuite: String?) = apply { this.testSuite = testSuite }

        /** Alias for calling [Builder.testSuite] with `testSuite.orElse(null)`. */
        fun testSuite(testSuite: Optional<String>) = testSuite(testSuite.getOrNull())

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
         * Returns an immutable instance of [TestListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TestListParams =
            TestListParams(
                destination,
                pageNumber,
                pageSize,
                telnyxConversationChannel,
                testSuite,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                destination?.let { put("destination", it) }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                telnyxConversationChannel?.let { put("telnyx_conversation_channel", it) }
                testSuite?.let { put("test_suite", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TestListParams &&
            destination == other.destination &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            telnyxConversationChannel == other.telnyxConversationChannel &&
            testSuite == other.testSuite &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            destination,
            pageNumber,
            pageSize,
            telnyxConversationChannel,
            testSuite,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "TestListParams{destination=$destination, pageNumber=$pageNumber, pageSize=$pageSize, telnyxConversationChannel=$telnyxConversationChannel, testSuite=$testSuite, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
