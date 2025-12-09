// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.campaign

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CampaignGetMnoMetadataResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val mno10999: JsonField<Mno10999>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("10999") @ExcludeMissing mno10999: JsonField<Mno10999> = JsonMissing.of()
    ) : this(mno10999, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mno10999(): Optional<Mno10999> = mno10999.getOptional("10999")

    /**
     * Returns the raw JSON value of [mno10999].
     *
     * Unlike [mno10999], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("10999") @ExcludeMissing fun _mno10999(): JsonField<Mno10999> = mno10999

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
         * Returns a mutable builder for constructing an instance of
         * [CampaignGetMnoMetadataResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CampaignGetMnoMetadataResponse]. */
    class Builder internal constructor() {

        private var mno10999: JsonField<Mno10999> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(campaignGetMnoMetadataResponse: CampaignGetMnoMetadataResponse) = apply {
            mno10999 = campaignGetMnoMetadataResponse.mno10999
            additionalProperties =
                campaignGetMnoMetadataResponse.additionalProperties.toMutableMap()
        }

        fun mno10999(mno10999: Mno10999) = mno10999(JsonField.of(mno10999))

        /**
         * Sets [Builder.mno10999] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mno10999] with a well-typed [Mno10999] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mno10999(mno10999: JsonField<Mno10999>) = apply { this.mno10999 = mno10999 }

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
         * Returns an immutable instance of [CampaignGetMnoMetadataResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CampaignGetMnoMetadataResponse =
            CampaignGetMnoMetadataResponse(mno10999, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): CampaignGetMnoMetadataResponse = apply {
        if (validated) {
            return@apply
        }

        mno10999().ifPresent { it.validate() }
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
    @JvmSynthetic internal fun validity(): Int = (mno10999.asKnown().getOrNull()?.validity() ?: 0)

    class Mno10999
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val minMsgSamples: JsonField<Long>,
        private val mno: JsonField<String>,
        private val mnoReview: JsonField<Boolean>,
        private val mnoSupport: JsonField<Boolean>,
        private val noEmbeddedLink: JsonField<Boolean>,
        private val noEmbeddedPhone: JsonField<Boolean>,
        private val qualify: JsonField<Boolean>,
        private val reqSubscriberHelp: JsonField<Boolean>,
        private val reqSubscriberOptin: JsonField<Boolean>,
        private val reqSubscriberOptout: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("minMsgSamples")
            @ExcludeMissing
            minMsgSamples: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("mno") @ExcludeMissing mno: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mnoReview")
            @ExcludeMissing
            mnoReview: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("mnoSupport")
            @ExcludeMissing
            mnoSupport: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("noEmbeddedLink")
            @ExcludeMissing
            noEmbeddedLink: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("noEmbeddedPhone")
            @ExcludeMissing
            noEmbeddedPhone: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("qualify") @ExcludeMissing qualify: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("reqSubscriberHelp")
            @ExcludeMissing
            reqSubscriberHelp: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("reqSubscriberOptin")
            @ExcludeMissing
            reqSubscriberOptin: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("reqSubscriberOptout")
            @ExcludeMissing
            reqSubscriberOptout: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            minMsgSamples,
            mno,
            mnoReview,
            mnoSupport,
            noEmbeddedLink,
            noEmbeddedPhone,
            qualify,
            reqSubscriberHelp,
            reqSubscriberOptin,
            reqSubscriberOptout,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun minMsgSamples(): Long = minMsgSamples.getRequired("minMsgSamples")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun mno(): String = mno.getRequired("mno")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun mnoReview(): Boolean = mnoReview.getRequired("mnoReview")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun mnoSupport(): Boolean = mnoSupport.getRequired("mnoSupport")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun noEmbeddedLink(): Boolean = noEmbeddedLink.getRequired("noEmbeddedLink")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun noEmbeddedPhone(): Boolean = noEmbeddedPhone.getRequired("noEmbeddedPhone")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun qualify(): Boolean = qualify.getRequired("qualify")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reqSubscriberHelp(): Boolean = reqSubscriberHelp.getRequired("reqSubscriberHelp")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reqSubscriberOptin(): Boolean = reqSubscriberOptin.getRequired("reqSubscriberOptin")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reqSubscriberOptout(): Boolean = reqSubscriberOptout.getRequired("reqSubscriberOptout")

        /**
         * Returns the raw JSON value of [minMsgSamples].
         *
         * Unlike [minMsgSamples], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("minMsgSamples")
        @ExcludeMissing
        fun _minMsgSamples(): JsonField<Long> = minMsgSamples

        /**
         * Returns the raw JSON value of [mno].
         *
         * Unlike [mno], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mno") @ExcludeMissing fun _mno(): JsonField<String> = mno

        /**
         * Returns the raw JSON value of [mnoReview].
         *
         * Unlike [mnoReview], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mnoReview") @ExcludeMissing fun _mnoReview(): JsonField<Boolean> = mnoReview

        /**
         * Returns the raw JSON value of [mnoSupport].
         *
         * Unlike [mnoSupport], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mnoSupport")
        @ExcludeMissing
        fun _mnoSupport(): JsonField<Boolean> = mnoSupport

        /**
         * Returns the raw JSON value of [noEmbeddedLink].
         *
         * Unlike [noEmbeddedLink], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("noEmbeddedLink")
        @ExcludeMissing
        fun _noEmbeddedLink(): JsonField<Boolean> = noEmbeddedLink

        /**
         * Returns the raw JSON value of [noEmbeddedPhone].
         *
         * Unlike [noEmbeddedPhone], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("noEmbeddedPhone")
        @ExcludeMissing
        fun _noEmbeddedPhone(): JsonField<Boolean> = noEmbeddedPhone

        /**
         * Returns the raw JSON value of [qualify].
         *
         * Unlike [qualify], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("qualify") @ExcludeMissing fun _qualify(): JsonField<Boolean> = qualify

        /**
         * Returns the raw JSON value of [reqSubscriberHelp].
         *
         * Unlike [reqSubscriberHelp], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("reqSubscriberHelp")
        @ExcludeMissing
        fun _reqSubscriberHelp(): JsonField<Boolean> = reqSubscriberHelp

        /**
         * Returns the raw JSON value of [reqSubscriberOptin].
         *
         * Unlike [reqSubscriberOptin], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("reqSubscriberOptin")
        @ExcludeMissing
        fun _reqSubscriberOptin(): JsonField<Boolean> = reqSubscriberOptin

        /**
         * Returns the raw JSON value of [reqSubscriberOptout].
         *
         * Unlike [reqSubscriberOptout], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("reqSubscriberOptout")
        @ExcludeMissing
        fun _reqSubscriberOptout(): JsonField<Boolean> = reqSubscriberOptout

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
             * Returns a mutable builder for constructing an instance of [Mno10999].
             *
             * The following fields are required:
             * ```java
             * .minMsgSamples()
             * .mno()
             * .mnoReview()
             * .mnoSupport()
             * .noEmbeddedLink()
             * .noEmbeddedPhone()
             * .qualify()
             * .reqSubscriberHelp()
             * .reqSubscriberOptin()
             * .reqSubscriberOptout()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Mno10999]. */
        class Builder internal constructor() {

            private var minMsgSamples: JsonField<Long>? = null
            private var mno: JsonField<String>? = null
            private var mnoReview: JsonField<Boolean>? = null
            private var mnoSupport: JsonField<Boolean>? = null
            private var noEmbeddedLink: JsonField<Boolean>? = null
            private var noEmbeddedPhone: JsonField<Boolean>? = null
            private var qualify: JsonField<Boolean>? = null
            private var reqSubscriberHelp: JsonField<Boolean>? = null
            private var reqSubscriberOptin: JsonField<Boolean>? = null
            private var reqSubscriberOptout: JsonField<Boolean>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(mno10999: Mno10999) = apply {
                minMsgSamples = mno10999.minMsgSamples
                mno = mno10999.mno
                mnoReview = mno10999.mnoReview
                mnoSupport = mno10999.mnoSupport
                noEmbeddedLink = mno10999.noEmbeddedLink
                noEmbeddedPhone = mno10999.noEmbeddedPhone
                qualify = mno10999.qualify
                reqSubscriberHelp = mno10999.reqSubscriberHelp
                reqSubscriberOptin = mno10999.reqSubscriberOptin
                reqSubscriberOptout = mno10999.reqSubscriberOptout
                additionalProperties = mno10999.additionalProperties.toMutableMap()
            }

            fun minMsgSamples(minMsgSamples: Long) = minMsgSamples(JsonField.of(minMsgSamples))

            /**
             * Sets [Builder.minMsgSamples] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minMsgSamples] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minMsgSamples(minMsgSamples: JsonField<Long>) = apply {
                this.minMsgSamples = minMsgSamples
            }

            fun mno(mno: String) = mno(JsonField.of(mno))

            /**
             * Sets [Builder.mno] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mno] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mno(mno: JsonField<String>) = apply { this.mno = mno }

            fun mnoReview(mnoReview: Boolean) = mnoReview(JsonField.of(mnoReview))

            /**
             * Sets [Builder.mnoReview] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mnoReview] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mnoReview(mnoReview: JsonField<Boolean>) = apply { this.mnoReview = mnoReview }

            fun mnoSupport(mnoSupport: Boolean) = mnoSupport(JsonField.of(mnoSupport))

            /**
             * Sets [Builder.mnoSupport] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mnoSupport] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mnoSupport(mnoSupport: JsonField<Boolean>) = apply { this.mnoSupport = mnoSupport }

            fun noEmbeddedLink(noEmbeddedLink: Boolean) =
                noEmbeddedLink(JsonField.of(noEmbeddedLink))

            /**
             * Sets [Builder.noEmbeddedLink] to an arbitrary JSON value.
             *
             * You should usually call [Builder.noEmbeddedLink] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun noEmbeddedLink(noEmbeddedLink: JsonField<Boolean>) = apply {
                this.noEmbeddedLink = noEmbeddedLink
            }

            fun noEmbeddedPhone(noEmbeddedPhone: Boolean) =
                noEmbeddedPhone(JsonField.of(noEmbeddedPhone))

            /**
             * Sets [Builder.noEmbeddedPhone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.noEmbeddedPhone] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun noEmbeddedPhone(noEmbeddedPhone: JsonField<Boolean>) = apply {
                this.noEmbeddedPhone = noEmbeddedPhone
            }

            fun qualify(qualify: Boolean) = qualify(JsonField.of(qualify))

            /**
             * Sets [Builder.qualify] to an arbitrary JSON value.
             *
             * You should usually call [Builder.qualify] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun qualify(qualify: JsonField<Boolean>) = apply { this.qualify = qualify }

            fun reqSubscriberHelp(reqSubscriberHelp: Boolean) =
                reqSubscriberHelp(JsonField.of(reqSubscriberHelp))

            /**
             * Sets [Builder.reqSubscriberHelp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reqSubscriberHelp] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reqSubscriberHelp(reqSubscriberHelp: JsonField<Boolean>) = apply {
                this.reqSubscriberHelp = reqSubscriberHelp
            }

            fun reqSubscriberOptin(reqSubscriberOptin: Boolean) =
                reqSubscriberOptin(JsonField.of(reqSubscriberOptin))

            /**
             * Sets [Builder.reqSubscriberOptin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reqSubscriberOptin] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun reqSubscriberOptin(reqSubscriberOptin: JsonField<Boolean>) = apply {
                this.reqSubscriberOptin = reqSubscriberOptin
            }

            fun reqSubscriberOptout(reqSubscriberOptout: Boolean) =
                reqSubscriberOptout(JsonField.of(reqSubscriberOptout))

            /**
             * Sets [Builder.reqSubscriberOptout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reqSubscriberOptout] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun reqSubscriberOptout(reqSubscriberOptout: JsonField<Boolean>) = apply {
                this.reqSubscriberOptout = reqSubscriberOptout
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
             * Returns an immutable instance of [Mno10999].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .minMsgSamples()
             * .mno()
             * .mnoReview()
             * .mnoSupport()
             * .noEmbeddedLink()
             * .noEmbeddedPhone()
             * .qualify()
             * .reqSubscriberHelp()
             * .reqSubscriberOptin()
             * .reqSubscriberOptout()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Mno10999 =
                Mno10999(
                    checkRequired("minMsgSamples", minMsgSamples),
                    checkRequired("mno", mno),
                    checkRequired("mnoReview", mnoReview),
                    checkRequired("mnoSupport", mnoSupport),
                    checkRequired("noEmbeddedLink", noEmbeddedLink),
                    checkRequired("noEmbeddedPhone", noEmbeddedPhone),
                    checkRequired("qualify", qualify),
                    checkRequired("reqSubscriberHelp", reqSubscriberHelp),
                    checkRequired("reqSubscriberOptin", reqSubscriberOptin),
                    checkRequired("reqSubscriberOptout", reqSubscriberOptout),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Mno10999 = apply {
            if (validated) {
                return@apply
            }

            minMsgSamples()
            mno()
            mnoReview()
            mnoSupport()
            noEmbeddedLink()
            noEmbeddedPhone()
            qualify()
            reqSubscriberHelp()
            reqSubscriberOptin()
            reqSubscriberOptout()
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
            (if (minMsgSamples.asKnown().isPresent) 1 else 0) +
                (if (mno.asKnown().isPresent) 1 else 0) +
                (if (mnoReview.asKnown().isPresent) 1 else 0) +
                (if (mnoSupport.asKnown().isPresent) 1 else 0) +
                (if (noEmbeddedLink.asKnown().isPresent) 1 else 0) +
                (if (noEmbeddedPhone.asKnown().isPresent) 1 else 0) +
                (if (qualify.asKnown().isPresent) 1 else 0) +
                (if (reqSubscriberHelp.asKnown().isPresent) 1 else 0) +
                (if (reqSubscriberOptin.asKnown().isPresent) 1 else 0) +
                (if (reqSubscriberOptout.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Mno10999 &&
                minMsgSamples == other.minMsgSamples &&
                mno == other.mno &&
                mnoReview == other.mnoReview &&
                mnoSupport == other.mnoSupport &&
                noEmbeddedLink == other.noEmbeddedLink &&
                noEmbeddedPhone == other.noEmbeddedPhone &&
                qualify == other.qualify &&
                reqSubscriberHelp == other.reqSubscriberHelp &&
                reqSubscriberOptin == other.reqSubscriberOptin &&
                reqSubscriberOptout == other.reqSubscriberOptout &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                minMsgSamples,
                mno,
                mnoReview,
                mnoSupport,
                noEmbeddedLink,
                noEmbeddedPhone,
                qualify,
                reqSubscriberHelp,
                reqSubscriberOptin,
                reqSubscriberOptout,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Mno10999{minMsgSamples=$minMsgSamples, mno=$mno, mnoReview=$mnoReview, mnoSupport=$mnoSupport, noEmbeddedLink=$noEmbeddedLink, noEmbeddedPhone=$noEmbeddedPhone, qualify=$qualify, reqSubscriberHelp=$reqSubscriberHelp, reqSubscriberOptin=$reqSubscriberOptin, reqSubscriberOptout=$reqSubscriberOptout, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CampaignGetMnoMetadataResponse &&
            mno10999 == other.mno10999 &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(mno10999, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CampaignGetMnoMetadataResponse{mno10999=$mno10999, additionalProperties=$additionalProperties}"
}
