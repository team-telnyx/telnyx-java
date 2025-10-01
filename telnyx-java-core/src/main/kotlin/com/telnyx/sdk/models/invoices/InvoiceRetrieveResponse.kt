// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.invoices

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class InvoiceRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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

        /** Returns a mutable builder for constructing an instance of [InvoiceRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InvoiceRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(invoiceRetrieveResponse: InvoiceRetrieveResponse) = apply {
            data = invoiceRetrieveResponse.data
            additionalProperties = invoiceRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [InvoiceRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InvoiceRetrieveResponse =
            InvoiceRetrieveResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): InvoiceRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.validate() }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: TelnyxInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val downloadUrl: JsonField<String>,
        private val fileId: JsonField<String>,
        private val invoiceId: JsonField<String>,
        private val paid: JsonField<Boolean>,
        private val periodEnd: JsonField<LocalDate>,
        private val periodStart: JsonField<LocalDate>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("download_url")
            @ExcludeMissing
            downloadUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("file_id") @ExcludeMissing fileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("invoice_id")
            @ExcludeMissing
            invoiceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("paid") @ExcludeMissing paid: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("period_end")
            @ExcludeMissing
            periodEnd: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("period_start")
            @ExcludeMissing
            periodStart: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(downloadUrl, fileId, invoiceId, paid, periodEnd, periodStart, url, mutableMapOf())

        /**
         * Present only if the query parameter `action=link` is set.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun downloadUrl(): Optional<String> = downloadUrl.getOptional("download_url")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fileId(): Optional<String> = fileId.getOptional("file_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun invoiceId(): Optional<String> = invoiceId.getOptional("invoice_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paid(): Optional<Boolean> = paid.getOptional("paid")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun periodEnd(): Optional<LocalDate> = periodEnd.getOptional("period_end")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun periodStart(): Optional<LocalDate> = periodStart.getOptional("period_start")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun url(): Optional<String> = url.getOptional("url")

        /**
         * Returns the raw JSON value of [downloadUrl].
         *
         * Unlike [downloadUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("download_url")
        @ExcludeMissing
        fun _downloadUrl(): JsonField<String> = downloadUrl

        /**
         * Returns the raw JSON value of [fileId].
         *
         * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

        /**
         * Returns the raw JSON value of [invoiceId].
         *
         * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId(): JsonField<String> = invoiceId

        /**
         * Returns the raw JSON value of [paid].
         *
         * Unlike [paid], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("paid") @ExcludeMissing fun _paid(): JsonField<Boolean> = paid

        /**
         * Returns the raw JSON value of [periodEnd].
         *
         * Unlike [periodEnd], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("period_end")
        @ExcludeMissing
        fun _periodEnd(): JsonField<LocalDate> = periodEnd

        /**
         * Returns the raw JSON value of [periodStart].
         *
         * Unlike [periodStart], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("period_start")
        @ExcludeMissing
        fun _periodStart(): JsonField<LocalDate> = periodStart

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var downloadUrl: JsonField<String> = JsonMissing.of()
            private var fileId: JsonField<String> = JsonMissing.of()
            private var invoiceId: JsonField<String> = JsonMissing.of()
            private var paid: JsonField<Boolean> = JsonMissing.of()
            private var periodEnd: JsonField<LocalDate> = JsonMissing.of()
            private var periodStart: JsonField<LocalDate> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                downloadUrl = data.downloadUrl
                fileId = data.fileId
                invoiceId = data.invoiceId
                paid = data.paid
                periodEnd = data.periodEnd
                periodStart = data.periodStart
                url = data.url
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Present only if the query parameter `action=link` is set. */
            fun downloadUrl(downloadUrl: String) = downloadUrl(JsonField.of(downloadUrl))

            /**
             * Sets [Builder.downloadUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.downloadUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun downloadUrl(downloadUrl: JsonField<String>) = apply {
                this.downloadUrl = downloadUrl
            }

            fun fileId(fileId: String) = fileId(JsonField.of(fileId))

            /**
             * Sets [Builder.fileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

            fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

            /**
             * Sets [Builder.invoiceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

            fun paid(paid: Boolean) = paid(JsonField.of(paid))

            /**
             * Sets [Builder.paid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paid] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paid(paid: JsonField<Boolean>) = apply { this.paid = paid }

            fun periodEnd(periodEnd: LocalDate) = periodEnd(JsonField.of(periodEnd))

            /**
             * Sets [Builder.periodEnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.periodEnd] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun periodEnd(periodEnd: JsonField<LocalDate>) = apply { this.periodEnd = periodEnd }

            fun periodStart(periodStart: LocalDate) = periodStart(JsonField.of(periodStart))

            /**
             * Sets [Builder.periodStart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.periodStart] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun periodStart(periodStart: JsonField<LocalDate>) = apply {
                this.periodStart = periodStart
            }

            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    downloadUrl,
                    fileId,
                    invoiceId,
                    paid,
                    periodEnd,
                    periodStart,
                    url,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            downloadUrl()
            fileId()
            invoiceId()
            paid()
            periodEnd()
            periodStart()
            url()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (downloadUrl.asKnown().isPresent) 1 else 0) +
                (if (fileId.asKnown().isPresent) 1 else 0) +
                (if (invoiceId.asKnown().isPresent) 1 else 0) +
                (if (paid.asKnown().isPresent) 1 else 0) +
                (if (periodEnd.asKnown().isPresent) 1 else 0) +
                (if (periodStart.asKnown().isPresent) 1 else 0) +
                (if (url.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                downloadUrl == other.downloadUrl &&
                fileId == other.fileId &&
                invoiceId == other.invoiceId &&
                paid == other.paid &&
                periodEnd == other.periodEnd &&
                periodStart == other.periodStart &&
                url == other.url &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                downloadUrl,
                fileId,
                invoiceId,
                paid,
                periodEnd,
                periodStart,
                url,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{downloadUrl=$downloadUrl, fileId=$fileId, invoiceId=$invoiceId, paid=$paid, periodEnd=$periodEnd, periodStart=$periodStart, url=$url, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvoiceRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InvoiceRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
