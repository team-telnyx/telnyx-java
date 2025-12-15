// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaginghostednumberorders.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.MultipartField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.io.InputStream
import java.nio.file.Path
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.io.path.inputStream
import kotlin.io.path.name
import kotlin.jvm.optionals.getOrNull

/** Upload file required for a messaging hosted number order */
class ActionUploadFileParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * Must be the last month's bill with proof of ownership of all of the numbers in the order in
     * PDF format.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bill(): Optional<InputStream> = body.bill()

    /**
     * Must be a signed LOA for the numbers in the order in PDF format.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun loa(): Optional<InputStream> = body.loa()

    /**
     * Returns the raw multipart value of [bill].
     *
     * Unlike [bill], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _bill(): MultipartField<InputStream> = body._bill()

    /**
     * Returns the raw multipart value of [loa].
     *
     * Unlike [loa], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _loa(): MultipartField<InputStream> = body._loa()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ActionUploadFileParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ActionUploadFileParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionUploadFileParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionUploadFileParams: ActionUploadFileParams) = apply {
            id = actionUploadFileParams.id
            body = actionUploadFileParams.body.toBuilder()
            additionalHeaders = actionUploadFileParams.additionalHeaders.toBuilder()
            additionalQueryParams = actionUploadFileParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [bill]
         * - [loa]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Must be the last month's bill with proof of ownership of all of the numbers in the order
         * in PDF format.
         */
        fun bill(bill: InputStream) = apply { body.bill(bill) }

        /**
         * Sets [Builder.bill] to an arbitrary multipart value.
         *
         * You should usually call [Builder.bill] with a well-typed [InputStream] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bill(bill: MultipartField<InputStream>) = apply { body.bill(bill) }

        /**
         * Must be the last month's bill with proof of ownership of all of the numbers in the order
         * in PDF format.
         */
        fun bill(bill: ByteArray) = apply { body.bill(bill) }

        /**
         * Must be the last month's bill with proof of ownership of all of the numbers in the order
         * in PDF format.
         */
        fun bill(path: Path) = apply { body.bill(path) }

        /** Must be a signed LOA for the numbers in the order in PDF format. */
        fun loa(loa: InputStream) = apply { body.loa(loa) }

        /**
         * Sets [Builder.loa] to an arbitrary multipart value.
         *
         * You should usually call [Builder.loa] with a well-typed [InputStream] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun loa(loa: MultipartField<InputStream>) = apply { body.loa(loa) }

        /** Must be a signed LOA for the numbers in the order in PDF format. */
        fun loa(loa: ByteArray) = apply { body.loa(loa) }

        /** Must be a signed LOA for the numbers in the order in PDF format. */
        fun loa(path: Path) = apply { body.loa(path) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [ActionUploadFileParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ActionUploadFileParams =
            ActionUploadFileParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf("bill" to _bill(), "loa" to _loa()) +
                _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val bill: MultipartField<InputStream>,
        private val loa: MultipartField<InputStream>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * Must be the last month's bill with proof of ownership of all of the numbers in the order
         * in PDF format.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bill(): Optional<InputStream> = bill.value.getOptional("bill")

        /**
         * Must be a signed LOA for the numbers in the order in PDF format.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun loa(): Optional<InputStream> = loa.value.getOptional("loa")

        /**
         * Returns the raw multipart value of [bill].
         *
         * Unlike [bill], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("bill") @ExcludeMissing fun _bill(): MultipartField<InputStream> = bill

        /**
         * Returns the raw multipart value of [loa].
         *
         * Unlike [loa], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("loa") @ExcludeMissing fun _loa(): MultipartField<InputStream> = loa

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var bill: MultipartField<InputStream> = MultipartField.of(null)
            private var loa: MultipartField<InputStream> = MultipartField.of(null)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                bill = body.bill
                loa = body.loa
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Must be the last month's bill with proof of ownership of all of the numbers in the
             * order in PDF format.
             */
            fun bill(bill: InputStream) = bill(MultipartField.of(bill))

            /**
             * Sets [Builder.bill] to an arbitrary multipart value.
             *
             * You should usually call [Builder.bill] with a well-typed [InputStream] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bill(bill: MultipartField<InputStream>) = apply { this.bill = bill }

            /**
             * Must be the last month's bill with proof of ownership of all of the numbers in the
             * order in PDF format.
             */
            fun bill(bill: ByteArray) = bill(bill.inputStream())

            /**
             * Must be the last month's bill with proof of ownership of all of the numbers in the
             * order in PDF format.
             */
            fun bill(path: Path) =
                bill(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            /** Must be a signed LOA for the numbers in the order in PDF format. */
            fun loa(loa: InputStream) = loa(MultipartField.of(loa))

            /**
             * Sets [Builder.loa] to an arbitrary multipart value.
             *
             * You should usually call [Builder.loa] with a well-typed [InputStream] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun loa(loa: MultipartField<InputStream>) = apply { this.loa = loa }

            /** Must be a signed LOA for the numbers in the order in PDF format. */
            fun loa(loa: ByteArray) = loa(loa.inputStream())

            /** Must be a signed LOA for the numbers in the order in PDF format. */
            fun loa(path: Path) =
                loa(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body = Body(bill, loa, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            bill()
            loa()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                bill == other.bill &&
                loa == other.loa &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(bill, loa, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{bill=$bill, loa=$loa, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionUploadFileParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionUploadFileParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
