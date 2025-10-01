// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.bundlepricing.userbundles

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.bundlepricing.billingbundles.BillingBundleSummary
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class UserBundleListUnusedResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Data> = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

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

        /**
         * Returns a mutable builder for constructing an instance of [UserBundleListUnusedResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserBundleListUnusedResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(userBundleListUnusedResponse: UserBundleListUnusedResponse) = apply {
            data = userBundleListUnusedResponse.data.map { it.toMutableList() }
            additionalProperties = userBundleListUnusedResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
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
         * Returns an immutable instance of [UserBundleListUnusedResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UserBundleListUnusedResponse =
            UserBundleListUnusedResponse(
                checkRequired("data", data).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UserBundleListUnusedResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
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
    @JvmSynthetic
    internal fun validity(): Int =
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val billingBundle: JsonField<BillingBundleSummary>,
        private val userBundleIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("billing_bundle")
            @ExcludeMissing
            billingBundle: JsonField<BillingBundleSummary> = JsonMissing.of(),
            @JsonProperty("user_bundle_ids")
            @ExcludeMissing
            userBundleIds: JsonField<List<String>> = JsonMissing.of(),
        ) : this(billingBundle, userBundleIds, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billingBundle(): BillingBundleSummary = billingBundle.getRequired("billing_bundle")

        /**
         * List of user bundle IDs for given bundle.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun userBundleIds(): List<String> = userBundleIds.getRequired("user_bundle_ids")

        /**
         * Returns the raw JSON value of [billingBundle].
         *
         * Unlike [billingBundle], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_bundle")
        @ExcludeMissing
        fun _billingBundle(): JsonField<BillingBundleSummary> = billingBundle

        /**
         * Returns the raw JSON value of [userBundleIds].
         *
         * Unlike [userBundleIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("user_bundle_ids")
        @ExcludeMissing
        fun _userBundleIds(): JsonField<List<String>> = userBundleIds

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

            /**
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .billingBundle()
             * .userBundleIds()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var billingBundle: JsonField<BillingBundleSummary>? = null
            private var userBundleIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                billingBundle = data.billingBundle
                userBundleIds = data.userBundleIds.map { it.toMutableList() }
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun billingBundle(billingBundle: BillingBundleSummary) =
                billingBundle(JsonField.of(billingBundle))

            /**
             * Sets [Builder.billingBundle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingBundle] with a well-typed
             * [BillingBundleSummary] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun billingBundle(billingBundle: JsonField<BillingBundleSummary>) = apply {
                this.billingBundle = billingBundle
            }

            /** List of user bundle IDs for given bundle. */
            fun userBundleIds(userBundleIds: List<String>) =
                userBundleIds(JsonField.of(userBundleIds))

            /**
             * Sets [Builder.userBundleIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userBundleIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun userBundleIds(userBundleIds: JsonField<List<String>>) = apply {
                this.userBundleIds = userBundleIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [userBundleIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUserBundleId(userBundleId: String) = apply {
                userBundleIds =
                    (userBundleIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("userBundleIds", it).add(userBundleId)
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .billingBundle()
             * .userBundleIds()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("billingBundle", billingBundle),
                    checkRequired("userBundleIds", userBundleIds).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            billingBundle().validate()
            userBundleIds()
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
            (billingBundle.asKnown().getOrNull()?.validity() ?: 0) +
                (userBundleIds.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                billingBundle == other.billingBundle &&
                userBundleIds == other.userBundleIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(billingBundle, userBundleIds, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{billingBundle=$billingBundle, userBundleIds=$userBundleIds, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserBundleListUnusedResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UserBundleListUnusedResponse{data=$data, additionalProperties=$additionalProperties}"
}
