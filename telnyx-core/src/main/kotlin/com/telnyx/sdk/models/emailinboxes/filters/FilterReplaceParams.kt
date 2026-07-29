// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.filters

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Replaces both sender filter lists atomically. Omitting either list clears that list. Use `POST`
 * or `DELETE` for incremental changes.
 */
class FilterReplaceParams
private constructor(
    private val inboxId: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun inboxId(): Optional<String> = Optional.ofNullable(inboxId)

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowlist(): Optional<List<String>> = body.allowlist()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun blocklist(): Optional<List<String>> = body.blocklist()

    /**
     * Returns the raw JSON value of [allowlist].
     *
     * Unlike [allowlist], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _allowlist(): JsonField<List<String>> = body._allowlist()

    /**
     * Returns the raw JSON value of [blocklist].
     *
     * Unlike [blocklist], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _blocklist(): JsonField<List<String>> = body._blocklist()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): FilterReplaceParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [FilterReplaceParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FilterReplaceParams]. */
    class Builder internal constructor() {

        private var inboxId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(filterReplaceParams: FilterReplaceParams) = apply {
            inboxId = filterReplaceParams.inboxId
            body = filterReplaceParams.body.toBuilder()
            additionalHeaders = filterReplaceParams.additionalHeaders.toBuilder()
            additionalQueryParams = filterReplaceParams.additionalQueryParams.toBuilder()
        }

        fun inboxId(inboxId: String?) = apply { this.inboxId = inboxId }

        /** Alias for calling [Builder.inboxId] with `inboxId.orElse(null)`. */
        fun inboxId(inboxId: Optional<String>) = inboxId(inboxId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [allowlist]
         * - [blocklist]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun allowlist(allowlist: List<String>) = apply { body.allowlist(allowlist) }

        /**
         * Sets [Builder.allowlist] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowlist] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allowlist(allowlist: JsonField<List<String>>) = apply { body.allowlist(allowlist) }

        /**
         * Adds a single [String] to [Builder.allowlist].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowlist(allowlist: String) = apply { body.addAllowlist(allowlist) }

        fun blocklist(blocklist: List<String>) = apply { body.blocklist(blocklist) }

        /**
         * Sets [Builder.blocklist] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blocklist] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun blocklist(blocklist: JsonField<List<String>>) = apply { body.blocklist(blocklist) }

        /**
         * Adds a single [String] to [Builder.blocklist].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBlocklist(blocklist: String) = apply { body.addBlocklist(blocklist) }

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

        fun additionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun putAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun replaceAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) =
            apply {
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
         * Returns an immutable instance of [FilterReplaceParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FilterReplaceParams =
            FilterReplaceParams(
                inboxId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> inboxId ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * The complete filter configuration. An omitted list is replaced with an empty list. Unknown
     * keys are ignored by the controller.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val allowlist: JsonField<List<String>>,
        private val blocklist: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("allowlist")
            @ExcludeMissing
            allowlist: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("blocklist")
            @ExcludeMissing
            blocklist: JsonField<List<String>> = JsonMissing.of(),
        ) : this(allowlist, blocklist, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allowlist(): Optional<List<String>> = allowlist.getOptional("allowlist")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun blocklist(): Optional<List<String>> = blocklist.getOptional("blocklist")

        /**
         * Returns the raw JSON value of [allowlist].
         *
         * Unlike [allowlist], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("allowlist")
        @ExcludeMissing
        fun _allowlist(): JsonField<List<String>> = allowlist

        /**
         * Returns the raw JSON value of [blocklist].
         *
         * Unlike [blocklist], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("blocklist")
        @ExcludeMissing
        fun _blocklist(): JsonField<List<String>> = blocklist

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

            private var allowlist: JsonField<MutableList<String>>? = null
            private var blocklist: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                allowlist = body.allowlist.map { it.toMutableList() }
                blocklist = body.blocklist.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun allowlist(allowlist: List<String>) = allowlist(JsonField.of(allowlist))

            /**
             * Sets [Builder.allowlist] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowlist] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun allowlist(allowlist: JsonField<List<String>>) = apply {
                this.allowlist = allowlist.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.allowlist].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAllowlist(allowlist: String) = apply {
                this.allowlist =
                    (this.allowlist ?: JsonField.of(mutableListOf())).also {
                        checkKnown("allowlist", it).add(allowlist)
                    }
            }

            fun blocklist(blocklist: List<String>) = blocklist(JsonField.of(blocklist))

            /**
             * Sets [Builder.blocklist] to an arbitrary JSON value.
             *
             * You should usually call [Builder.blocklist] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun blocklist(blocklist: JsonField<List<String>>) = apply {
                this.blocklist = blocklist.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.blocklist].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addBlocklist(blocklist: String) = apply {
                this.blocklist =
                    (this.blocklist ?: JsonField.of(mutableListOf())).also {
                        checkKnown("blocklist", it).add(blocklist)
                    }
            }

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
            fun build(): Body =
                Body(
                    (allowlist ?: JsonMissing.of()).map { it.toImmutable() },
                    (blocklist ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            allowlist()
            blocklist()
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
            (allowlist.asKnown().getOrNull()?.size ?: 0) +
                (blocklist.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                allowlist == other.allowlist &&
                blocklist == other.blocklist &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(allowlist, blocklist, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{allowlist=$allowlist, blocklist=$blocklist, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FilterReplaceParams &&
            inboxId == other.inboxId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(inboxId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FilterReplaceParams{inboxId=$inboxId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
