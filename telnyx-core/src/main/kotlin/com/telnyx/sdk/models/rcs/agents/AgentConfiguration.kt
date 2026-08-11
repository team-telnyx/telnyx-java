// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.agents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.BaseDeserializer
import com.telnyx.sdk.core.BaseSerializer
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AgentConfiguration
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val basics: JsonField<Basics>,
    private val campaign: JsonField<AgentCampaignConfiguration>,
    private val testing: JsonField<AgentTestingConfiguration>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("basics") @ExcludeMissing basics: JsonField<Basics> = JsonMissing.of(),
        @JsonProperty("campaign")
        @ExcludeMissing
        campaign: JsonField<AgentCampaignConfiguration> = JsonMissing.of(),
        @JsonProperty("testing")
        @ExcludeMissing
        testing: JsonField<AgentTestingConfiguration> = JsonMissing.of(),
    ) : this(basics, campaign, testing, mutableMapOf())

    /**
     * Basic agent identity and contact information. At least one complete phone, website, or email
     * contact is required.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun basics(): Basics = basics.getRequired("basics")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun campaign(): Optional<AgentCampaignConfiguration> = campaign.getOptional("campaign")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun testing(): Optional<AgentTestingConfiguration> = testing.getOptional("testing")

    /**
     * Returns the raw JSON value of [basics].
     *
     * Unlike [basics], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("basics") @ExcludeMissing fun _basics(): JsonField<Basics> = basics

    /**
     * Returns the raw JSON value of [campaign].
     *
     * Unlike [campaign], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("campaign")
    @ExcludeMissing
    fun _campaign(): JsonField<AgentCampaignConfiguration> = campaign

    /**
     * Returns the raw JSON value of [testing].
     *
     * Unlike [testing], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("testing")
    @ExcludeMissing
    fun _testing(): JsonField<AgentTestingConfiguration> = testing

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
         * Returns a mutable builder for constructing an instance of [AgentConfiguration].
         *
         * The following fields are required:
         * ```java
         * .basics()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentConfiguration]. */
    class Builder internal constructor() {

        private var basics: JsonField<Basics>? = null
        private var campaign: JsonField<AgentCampaignConfiguration> = JsonMissing.of()
        private var testing: JsonField<AgentTestingConfiguration> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agentConfiguration: AgentConfiguration) = apply {
            basics = agentConfiguration.basics
            campaign = agentConfiguration.campaign
            testing = agentConfiguration.testing
            additionalProperties = agentConfiguration.additionalProperties.toMutableMap()
        }

        /**
         * Basic agent identity and contact information. At least one complete phone, website, or
         * email contact is required.
         */
        fun basics(basics: Basics) = basics(JsonField.of(basics))

        /**
         * Sets [Builder.basics] to an arbitrary JSON value.
         *
         * You should usually call [Builder.basics] with a well-typed [Basics] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun basics(basics: JsonField<Basics>) = apply { this.basics = basics }

        /** Alias for calling [basics] with `Basics.ofUnionMember0(unionMember0)`. */
        fun basics(unionMember0: Basics.UnionMember0) = basics(Basics.ofUnionMember0(unionMember0))

        /** Alias for calling [basics] with `Basics.ofUnionMember1(unionMember1)`. */
        fun basics(unionMember1: Basics.UnionMember1) = basics(Basics.ofUnionMember1(unionMember1))

        /** Alias for calling [basics] with `Basics.ofUnionMember2(unionMember2)`. */
        fun basics(unionMember2: Basics.UnionMember2) = basics(Basics.ofUnionMember2(unionMember2))

        fun campaign(campaign: AgentCampaignConfiguration?) =
            campaign(JsonField.ofNullable(campaign))

        /** Alias for calling [Builder.campaign] with `campaign.orElse(null)`. */
        fun campaign(campaign: Optional<AgentCampaignConfiguration>) =
            campaign(campaign.getOrNull())

        /**
         * Sets [Builder.campaign] to an arbitrary JSON value.
         *
         * You should usually call [Builder.campaign] with a well-typed [AgentCampaignConfiguration]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun campaign(campaign: JsonField<AgentCampaignConfiguration>) = apply {
            this.campaign = campaign
        }

        fun testing(testing: AgentTestingConfiguration?) = testing(JsonField.ofNullable(testing))

        /** Alias for calling [Builder.testing] with `testing.orElse(null)`. */
        fun testing(testing: Optional<AgentTestingConfiguration>) = testing(testing.getOrNull())

        /**
         * Sets [Builder.testing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.testing] with a well-typed [AgentTestingConfiguration]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun testing(testing: JsonField<AgentTestingConfiguration>) = apply {
            this.testing = testing
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
         * Returns an immutable instance of [AgentConfiguration].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .basics()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentConfiguration =
            AgentConfiguration(
                checkRequired("basics", basics),
                campaign,
                testing,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): AgentConfiguration = apply {
        if (validated) {
            return@apply
        }

        basics().validate()
        campaign().ifPresent { it.validate() }
        testing().ifPresent { it.validate() }
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
        (basics.asKnown().getOrNull()?.validity() ?: 0) +
            (campaign.asKnown().getOrNull()?.validity() ?: 0) +
            (testing.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Basic agent identity and contact information. At least one complete phone, website, or email
     * contact is required.
     */
    @JsonDeserialize(using = Basics.Deserializer::class)
    @JsonSerialize(using = Basics.Serializer::class)
    class Basics
    private constructor(
        private val unionMember0: UnionMember0? = null,
        private val unionMember1: UnionMember1? = null,
        private val unionMember2: UnionMember2? = null,
        private val _json: JsonValue? = null,
    ) {

        fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

        fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)

        fun unionMember2(): Optional<UnionMember2> = Optional.ofNullable(unionMember2)

        fun isUnionMember0(): Boolean = unionMember0 != null

        fun isUnionMember1(): Boolean = unionMember1 != null

        fun isUnionMember2(): Boolean = unionMember2 != null

        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

        fun asUnionMember2(): UnionMember2 = unionMember2.getOrThrow("unionMember2")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.telnyx.sdk.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = basics.accept(new Basics.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitUnionMember0(UnionMember0 unionMember0) {
         *         return Optional.of(unionMember0.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                unionMember2 != null -> visitor.visitUnionMember2(unionMember2)
                else -> visitor.unknown(_json)
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
        fun validate(): Basics = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUnionMember0(unionMember0: UnionMember0) {
                        unionMember0.validate()
                    }

                    override fun visitUnionMember1(unionMember1: UnionMember1) {
                        unionMember1.validate()
                    }

                    override fun visitUnionMember2(unionMember2: UnionMember2) {
                        unionMember2.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitUnionMember0(unionMember0: UnionMember0) =
                        unionMember0.validity()

                    override fun visitUnionMember1(unionMember1: UnionMember1) =
                        unionMember1.validity()

                    override fun visitUnionMember2(unionMember2: UnionMember2) =
                        unionMember2.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Basics &&
                unionMember0 == other.unionMember0 &&
                unionMember1 == other.unionMember1 &&
                unionMember2 == other.unionMember2
        }

        override fun hashCode(): Int = Objects.hash(unionMember0, unionMember1, unionMember2)

        override fun toString(): String =
            when {
                unionMember0 != null -> "Basics{unionMember0=$unionMember0}"
                unionMember1 != null -> "Basics{unionMember1=$unionMember1}"
                unionMember2 != null -> "Basics{unionMember2=$unionMember2}"
                _json != null -> "Basics{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Basics")
            }

        companion object {

            @JvmStatic
            fun ofUnionMember0(unionMember0: UnionMember0) = Basics(unionMember0 = unionMember0)

            @JvmStatic
            fun ofUnionMember1(unionMember1: UnionMember1) = Basics(unionMember1 = unionMember1)

            @JvmStatic
            fun ofUnionMember2(unionMember2: UnionMember2) = Basics(unionMember2 = unionMember2)
        }

        /** An interface that defines how to map each variant of [Basics] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitUnionMember0(unionMember0: UnionMember0): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

            fun visitUnionMember2(unionMember2: UnionMember2): T

            /**
             * Maps an unknown variant of [Basics] to a value of type [T].
             *
             * An instance of [Basics] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Basics: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Basics>(Basics::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Basics {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                                Basics(unionMember0 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                                Basics(unionMember1 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<UnionMember2>())?.let {
                                Basics(unionMember2 = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Basics(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Basics>(Basics::class) {

            override fun serialize(
                value: Basics,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value.unionMember2 != null -> generator.writeObject(value.unionMember2)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Basics")
                }
            }
        }

        class UnionMember0
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val phoneNumber: JsonField<AgentPhoneContact>,
            private val brandColor: JsonField<String>,
            private val description: JsonField<String>,
            private val email: JsonField<AgentEmailContact>,
            private val heroUrl: JsonField<String>,
            private val logoUrl: JsonField<String>,
            private val privacyPolicyUrl: JsonField<String>,
            private val termsAndConditionsUrl: JsonField<String>,
            private val website: JsonField<AgentWebsiteContact>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("phone_number")
                @ExcludeMissing
                phoneNumber: JsonField<AgentPhoneContact> = JsonMissing.of(),
                @JsonProperty("brand_color")
                @ExcludeMissing
                brandColor: JsonField<String> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("email")
                @ExcludeMissing
                email: JsonField<AgentEmailContact> = JsonMissing.of(),
                @JsonProperty("hero_url")
                @ExcludeMissing
                heroUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("logo_url")
                @ExcludeMissing
                logoUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("privacy_policy_url")
                @ExcludeMissing
                privacyPolicyUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("terms_and_conditions_url")
                @ExcludeMissing
                termsAndConditionsUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("website")
                @ExcludeMissing
                website: JsonField<AgentWebsiteContact> = JsonMissing.of(),
            ) : this(
                phoneNumber,
                brandColor,
                description,
                email,
                heroUrl,
                logoUrl,
                privacyPolicyUrl,
                termsAndConditionsUrl,
                website,
                mutableMapOf(),
            )

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun phoneNumber(): AgentPhoneContact = phoneNumber.getRequired("phone_number")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun brandColor(): Optional<String> = brandColor.getOptional("brand_color")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun email(): Optional<AgentEmailContact> = email.getOptional("email")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun heroUrl(): Optional<String> = heroUrl.getOptional("hero_url")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun logoUrl(): Optional<String> = logoUrl.getOptional("logo_url")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun privacyPolicyUrl(): Optional<String> =
                privacyPolicyUrl.getOptional("privacy_policy_url")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun termsAndConditionsUrl(): Optional<String> =
                termsAndConditionsUrl.getOptional("terms_and_conditions_url")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun website(): Optional<AgentWebsiteContact> = website.getOptional("website")

            /**
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phone_number")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<AgentPhoneContact> = phoneNumber

            /**
             * Returns the raw JSON value of [brandColor].
             *
             * Unlike [brandColor], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("brand_color")
            @ExcludeMissing
            fun _brandColor(): JsonField<String> = brandColor

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [email].
             *
             * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("email")
            @ExcludeMissing
            fun _email(): JsonField<AgentEmailContact> = email

            /**
             * Returns the raw JSON value of [heroUrl].
             *
             * Unlike [heroUrl], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("hero_url") @ExcludeMissing fun _heroUrl(): JsonField<String> = heroUrl

            /**
             * Returns the raw JSON value of [logoUrl].
             *
             * Unlike [logoUrl], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("logo_url") @ExcludeMissing fun _logoUrl(): JsonField<String> = logoUrl

            /**
             * Returns the raw JSON value of [privacyPolicyUrl].
             *
             * Unlike [privacyPolicyUrl], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("privacy_policy_url")
            @ExcludeMissing
            fun _privacyPolicyUrl(): JsonField<String> = privacyPolicyUrl

            /**
             * Returns the raw JSON value of [termsAndConditionsUrl].
             *
             * Unlike [termsAndConditionsUrl], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("terms_and_conditions_url")
            @ExcludeMissing
            fun _termsAndConditionsUrl(): JsonField<String> = termsAndConditionsUrl

            /**
             * Returns the raw JSON value of [website].
             *
             * Unlike [website], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("website")
            @ExcludeMissing
            fun _website(): JsonField<AgentWebsiteContact> = website

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
                 * Returns a mutable builder for constructing an instance of [UnionMember0].
                 *
                 * The following fields are required:
                 * ```java
                 * .phoneNumber()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnionMember0]. */
            class Builder internal constructor() {

                private var phoneNumber: JsonField<AgentPhoneContact>? = null
                private var brandColor: JsonField<String> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var email: JsonField<AgentEmailContact> = JsonMissing.of()
                private var heroUrl: JsonField<String> = JsonMissing.of()
                private var logoUrl: JsonField<String> = JsonMissing.of()
                private var privacyPolicyUrl: JsonField<String> = JsonMissing.of()
                private var termsAndConditionsUrl: JsonField<String> = JsonMissing.of()
                private var website: JsonField<AgentWebsiteContact> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember0: UnionMember0) = apply {
                    phoneNumber = unionMember0.phoneNumber
                    brandColor = unionMember0.brandColor
                    description = unionMember0.description
                    email = unionMember0.email
                    heroUrl = unionMember0.heroUrl
                    logoUrl = unionMember0.logoUrl
                    privacyPolicyUrl = unionMember0.privacyPolicyUrl
                    termsAndConditionsUrl = unionMember0.termsAndConditionsUrl
                    website = unionMember0.website
                    additionalProperties = unionMember0.additionalProperties.toMutableMap()
                }

                fun phoneNumber(phoneNumber: AgentPhoneContact) =
                    phoneNumber(JsonField.of(phoneNumber))

                /**
                 * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumber] with a well-typed
                 * [AgentPhoneContact] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun phoneNumber(phoneNumber: JsonField<AgentPhoneContact>) = apply {
                    this.phoneNumber = phoneNumber
                }

                fun brandColor(brandColor: String) = brandColor(JsonField.of(brandColor))

                /**
                 * Sets [Builder.brandColor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.brandColor] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun brandColor(brandColor: JsonField<String>) = apply {
                    this.brandColor = brandColor
                }

                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                fun email(email: AgentEmailContact?) = email(JsonField.ofNullable(email))

                /** Alias for calling [Builder.email] with `email.orElse(null)`. */
                fun email(email: Optional<AgentEmailContact>) = email(email.getOrNull())

                /**
                 * Sets [Builder.email] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.email] with a well-typed [AgentEmailContact]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun email(email: JsonField<AgentEmailContact>) = apply { this.email = email }

                fun heroUrl(heroUrl: String) = heroUrl(JsonField.of(heroUrl))

                /**
                 * Sets [Builder.heroUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.heroUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun heroUrl(heroUrl: JsonField<String>) = apply { this.heroUrl = heroUrl }

                fun logoUrl(logoUrl: String) = logoUrl(JsonField.of(logoUrl))

                /**
                 * Sets [Builder.logoUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.logoUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun logoUrl(logoUrl: JsonField<String>) = apply { this.logoUrl = logoUrl }

                fun privacyPolicyUrl(privacyPolicyUrl: String) =
                    privacyPolicyUrl(JsonField.of(privacyPolicyUrl))

                /**
                 * Sets [Builder.privacyPolicyUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.privacyPolicyUrl] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun privacyPolicyUrl(privacyPolicyUrl: JsonField<String>) = apply {
                    this.privacyPolicyUrl = privacyPolicyUrl
                }

                fun termsAndConditionsUrl(termsAndConditionsUrl: String) =
                    termsAndConditionsUrl(JsonField.of(termsAndConditionsUrl))

                /**
                 * Sets [Builder.termsAndConditionsUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.termsAndConditionsUrl] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun termsAndConditionsUrl(termsAndConditionsUrl: JsonField<String>) = apply {
                    this.termsAndConditionsUrl = termsAndConditionsUrl
                }

                fun website(website: AgentWebsiteContact?) = website(JsonField.ofNullable(website))

                /** Alias for calling [Builder.website] with `website.orElse(null)`. */
                fun website(website: Optional<AgentWebsiteContact>) = website(website.getOrNull())

                /**
                 * Sets [Builder.website] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.website] with a well-typed [AgentWebsiteContact]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun website(website: JsonField<AgentWebsiteContact>) = apply {
                    this.website = website
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [UnionMember0].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .phoneNumber()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UnionMember0 =
                    UnionMember0(
                        checkRequired("phoneNumber", phoneNumber),
                        brandColor,
                        description,
                        email,
                        heroUrl,
                        logoUrl,
                        privacyPolicyUrl,
                        termsAndConditionsUrl,
                        website,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): UnionMember0 = apply {
                if (validated) {
                    return@apply
                }

                phoneNumber().validate()
                brandColor()
                description()
                email().ifPresent { it.validate() }
                heroUrl()
                logoUrl()
                privacyPolicyUrl()
                termsAndConditionsUrl()
                website().ifPresent { it.validate() }
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
                (phoneNumber.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (brandColor.asKnown().isPresent) 1 else 0) +
                    (if (description.asKnown().isPresent) 1 else 0) +
                    (email.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (heroUrl.asKnown().isPresent) 1 else 0) +
                    (if (logoUrl.asKnown().isPresent) 1 else 0) +
                    (if (privacyPolicyUrl.asKnown().isPresent) 1 else 0) +
                    (if (termsAndConditionsUrl.asKnown().isPresent) 1 else 0) +
                    (website.asKnown().getOrNull()?.validity() ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionMember0 &&
                    phoneNumber == other.phoneNumber &&
                    brandColor == other.brandColor &&
                    description == other.description &&
                    email == other.email &&
                    heroUrl == other.heroUrl &&
                    logoUrl == other.logoUrl &&
                    privacyPolicyUrl == other.privacyPolicyUrl &&
                    termsAndConditionsUrl == other.termsAndConditionsUrl &&
                    website == other.website &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    phoneNumber,
                    brandColor,
                    description,
                    email,
                    heroUrl,
                    logoUrl,
                    privacyPolicyUrl,
                    termsAndConditionsUrl,
                    website,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnionMember0{phoneNumber=$phoneNumber, brandColor=$brandColor, description=$description, email=$email, heroUrl=$heroUrl, logoUrl=$logoUrl, privacyPolicyUrl=$privacyPolicyUrl, termsAndConditionsUrl=$termsAndConditionsUrl, website=$website, additionalProperties=$additionalProperties}"
        }

        class UnionMember1
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val website: JsonField<AgentWebsiteContact>,
            private val brandColor: JsonField<String>,
            private val description: JsonField<String>,
            private val email: JsonField<AgentEmailContact>,
            private val heroUrl: JsonField<String>,
            private val logoUrl: JsonField<String>,
            private val phoneNumber: JsonField<AgentPhoneContact>,
            private val privacyPolicyUrl: JsonField<String>,
            private val termsAndConditionsUrl: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("website")
                @ExcludeMissing
                website: JsonField<AgentWebsiteContact> = JsonMissing.of(),
                @JsonProperty("brand_color")
                @ExcludeMissing
                brandColor: JsonField<String> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("email")
                @ExcludeMissing
                email: JsonField<AgentEmailContact> = JsonMissing.of(),
                @JsonProperty("hero_url")
                @ExcludeMissing
                heroUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("logo_url")
                @ExcludeMissing
                logoUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("phone_number")
                @ExcludeMissing
                phoneNumber: JsonField<AgentPhoneContact> = JsonMissing.of(),
                @JsonProperty("privacy_policy_url")
                @ExcludeMissing
                privacyPolicyUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("terms_and_conditions_url")
                @ExcludeMissing
                termsAndConditionsUrl: JsonField<String> = JsonMissing.of(),
            ) : this(
                website,
                brandColor,
                description,
                email,
                heroUrl,
                logoUrl,
                phoneNumber,
                privacyPolicyUrl,
                termsAndConditionsUrl,
                mutableMapOf(),
            )

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun website(): AgentWebsiteContact = website.getRequired("website")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun brandColor(): Optional<String> = brandColor.getOptional("brand_color")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun email(): Optional<AgentEmailContact> = email.getOptional("email")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun heroUrl(): Optional<String> = heroUrl.getOptional("hero_url")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun logoUrl(): Optional<String> = logoUrl.getOptional("logo_url")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun phoneNumber(): Optional<AgentPhoneContact> = phoneNumber.getOptional("phone_number")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun privacyPolicyUrl(): Optional<String> =
                privacyPolicyUrl.getOptional("privacy_policy_url")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun termsAndConditionsUrl(): Optional<String> =
                termsAndConditionsUrl.getOptional("terms_and_conditions_url")

            /**
             * Returns the raw JSON value of [website].
             *
             * Unlike [website], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("website")
            @ExcludeMissing
            fun _website(): JsonField<AgentWebsiteContact> = website

            /**
             * Returns the raw JSON value of [brandColor].
             *
             * Unlike [brandColor], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("brand_color")
            @ExcludeMissing
            fun _brandColor(): JsonField<String> = brandColor

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [email].
             *
             * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("email")
            @ExcludeMissing
            fun _email(): JsonField<AgentEmailContact> = email

            /**
             * Returns the raw JSON value of [heroUrl].
             *
             * Unlike [heroUrl], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("hero_url") @ExcludeMissing fun _heroUrl(): JsonField<String> = heroUrl

            /**
             * Returns the raw JSON value of [logoUrl].
             *
             * Unlike [logoUrl], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("logo_url") @ExcludeMissing fun _logoUrl(): JsonField<String> = logoUrl

            /**
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phone_number")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<AgentPhoneContact> = phoneNumber

            /**
             * Returns the raw JSON value of [privacyPolicyUrl].
             *
             * Unlike [privacyPolicyUrl], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("privacy_policy_url")
            @ExcludeMissing
            fun _privacyPolicyUrl(): JsonField<String> = privacyPolicyUrl

            /**
             * Returns the raw JSON value of [termsAndConditionsUrl].
             *
             * Unlike [termsAndConditionsUrl], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("terms_and_conditions_url")
            @ExcludeMissing
            fun _termsAndConditionsUrl(): JsonField<String> = termsAndConditionsUrl

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
                 * Returns a mutable builder for constructing an instance of [UnionMember1].
                 *
                 * The following fields are required:
                 * ```java
                 * .website()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnionMember1]. */
            class Builder internal constructor() {

                private var website: JsonField<AgentWebsiteContact>? = null
                private var brandColor: JsonField<String> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var email: JsonField<AgentEmailContact> = JsonMissing.of()
                private var heroUrl: JsonField<String> = JsonMissing.of()
                private var logoUrl: JsonField<String> = JsonMissing.of()
                private var phoneNumber: JsonField<AgentPhoneContact> = JsonMissing.of()
                private var privacyPolicyUrl: JsonField<String> = JsonMissing.of()
                private var termsAndConditionsUrl: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember1: UnionMember1) = apply {
                    website = unionMember1.website
                    brandColor = unionMember1.brandColor
                    description = unionMember1.description
                    email = unionMember1.email
                    heroUrl = unionMember1.heroUrl
                    logoUrl = unionMember1.logoUrl
                    phoneNumber = unionMember1.phoneNumber
                    privacyPolicyUrl = unionMember1.privacyPolicyUrl
                    termsAndConditionsUrl = unionMember1.termsAndConditionsUrl
                    additionalProperties = unionMember1.additionalProperties.toMutableMap()
                }

                fun website(website: AgentWebsiteContact) = website(JsonField.of(website))

                /**
                 * Sets [Builder.website] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.website] with a well-typed [AgentWebsiteContact]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun website(website: JsonField<AgentWebsiteContact>) = apply {
                    this.website = website
                }

                fun brandColor(brandColor: String) = brandColor(JsonField.of(brandColor))

                /**
                 * Sets [Builder.brandColor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.brandColor] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun brandColor(brandColor: JsonField<String>) = apply {
                    this.brandColor = brandColor
                }

                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                fun email(email: AgentEmailContact?) = email(JsonField.ofNullable(email))

                /** Alias for calling [Builder.email] with `email.orElse(null)`. */
                fun email(email: Optional<AgentEmailContact>) = email(email.getOrNull())

                /**
                 * Sets [Builder.email] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.email] with a well-typed [AgentEmailContact]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun email(email: JsonField<AgentEmailContact>) = apply { this.email = email }

                fun heroUrl(heroUrl: String) = heroUrl(JsonField.of(heroUrl))

                /**
                 * Sets [Builder.heroUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.heroUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun heroUrl(heroUrl: JsonField<String>) = apply { this.heroUrl = heroUrl }

                fun logoUrl(logoUrl: String) = logoUrl(JsonField.of(logoUrl))

                /**
                 * Sets [Builder.logoUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.logoUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun logoUrl(logoUrl: JsonField<String>) = apply { this.logoUrl = logoUrl }

                fun phoneNumber(phoneNumber: AgentPhoneContact?) =
                    phoneNumber(JsonField.ofNullable(phoneNumber))

                /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
                fun phoneNumber(phoneNumber: Optional<AgentPhoneContact>) =
                    phoneNumber(phoneNumber.getOrNull())

                /**
                 * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumber] with a well-typed
                 * [AgentPhoneContact] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun phoneNumber(phoneNumber: JsonField<AgentPhoneContact>) = apply {
                    this.phoneNumber = phoneNumber
                }

                fun privacyPolicyUrl(privacyPolicyUrl: String) =
                    privacyPolicyUrl(JsonField.of(privacyPolicyUrl))

                /**
                 * Sets [Builder.privacyPolicyUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.privacyPolicyUrl] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun privacyPolicyUrl(privacyPolicyUrl: JsonField<String>) = apply {
                    this.privacyPolicyUrl = privacyPolicyUrl
                }

                fun termsAndConditionsUrl(termsAndConditionsUrl: String) =
                    termsAndConditionsUrl(JsonField.of(termsAndConditionsUrl))

                /**
                 * Sets [Builder.termsAndConditionsUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.termsAndConditionsUrl] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun termsAndConditionsUrl(termsAndConditionsUrl: JsonField<String>) = apply {
                    this.termsAndConditionsUrl = termsAndConditionsUrl
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [UnionMember1].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .website()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UnionMember1 =
                    UnionMember1(
                        checkRequired("website", website),
                        brandColor,
                        description,
                        email,
                        heroUrl,
                        logoUrl,
                        phoneNumber,
                        privacyPolicyUrl,
                        termsAndConditionsUrl,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): UnionMember1 = apply {
                if (validated) {
                    return@apply
                }

                website().validate()
                brandColor()
                description()
                email().ifPresent { it.validate() }
                heroUrl()
                logoUrl()
                phoneNumber().ifPresent { it.validate() }
                privacyPolicyUrl()
                termsAndConditionsUrl()
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
                (website.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (brandColor.asKnown().isPresent) 1 else 0) +
                    (if (description.asKnown().isPresent) 1 else 0) +
                    (email.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (heroUrl.asKnown().isPresent) 1 else 0) +
                    (if (logoUrl.asKnown().isPresent) 1 else 0) +
                    (phoneNumber.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (privacyPolicyUrl.asKnown().isPresent) 1 else 0) +
                    (if (termsAndConditionsUrl.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionMember1 &&
                    website == other.website &&
                    brandColor == other.brandColor &&
                    description == other.description &&
                    email == other.email &&
                    heroUrl == other.heroUrl &&
                    logoUrl == other.logoUrl &&
                    phoneNumber == other.phoneNumber &&
                    privacyPolicyUrl == other.privacyPolicyUrl &&
                    termsAndConditionsUrl == other.termsAndConditionsUrl &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    website,
                    brandColor,
                    description,
                    email,
                    heroUrl,
                    logoUrl,
                    phoneNumber,
                    privacyPolicyUrl,
                    termsAndConditionsUrl,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnionMember1{website=$website, brandColor=$brandColor, description=$description, email=$email, heroUrl=$heroUrl, logoUrl=$logoUrl, phoneNumber=$phoneNumber, privacyPolicyUrl=$privacyPolicyUrl, termsAndConditionsUrl=$termsAndConditionsUrl, additionalProperties=$additionalProperties}"
        }

        class UnionMember2
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val email: JsonField<AgentEmailContact>,
            private val brandColor: JsonField<String>,
            private val description: JsonField<String>,
            private val heroUrl: JsonField<String>,
            private val logoUrl: JsonField<String>,
            private val phoneNumber: JsonField<AgentPhoneContact>,
            private val privacyPolicyUrl: JsonField<String>,
            private val termsAndConditionsUrl: JsonField<String>,
            private val website: JsonField<AgentWebsiteContact>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("email")
                @ExcludeMissing
                email: JsonField<AgentEmailContact> = JsonMissing.of(),
                @JsonProperty("brand_color")
                @ExcludeMissing
                brandColor: JsonField<String> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("hero_url")
                @ExcludeMissing
                heroUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("logo_url")
                @ExcludeMissing
                logoUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("phone_number")
                @ExcludeMissing
                phoneNumber: JsonField<AgentPhoneContact> = JsonMissing.of(),
                @JsonProperty("privacy_policy_url")
                @ExcludeMissing
                privacyPolicyUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("terms_and_conditions_url")
                @ExcludeMissing
                termsAndConditionsUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("website")
                @ExcludeMissing
                website: JsonField<AgentWebsiteContact> = JsonMissing.of(),
            ) : this(
                email,
                brandColor,
                description,
                heroUrl,
                logoUrl,
                phoneNumber,
                privacyPolicyUrl,
                termsAndConditionsUrl,
                website,
                mutableMapOf(),
            )

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun email(): AgentEmailContact = email.getRequired("email")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun brandColor(): Optional<String> = brandColor.getOptional("brand_color")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun heroUrl(): Optional<String> = heroUrl.getOptional("hero_url")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun logoUrl(): Optional<String> = logoUrl.getOptional("logo_url")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun phoneNumber(): Optional<AgentPhoneContact> = phoneNumber.getOptional("phone_number")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun privacyPolicyUrl(): Optional<String> =
                privacyPolicyUrl.getOptional("privacy_policy_url")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun termsAndConditionsUrl(): Optional<String> =
                termsAndConditionsUrl.getOptional("terms_and_conditions_url")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun website(): Optional<AgentWebsiteContact> = website.getOptional("website")

            /**
             * Returns the raw JSON value of [email].
             *
             * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("email")
            @ExcludeMissing
            fun _email(): JsonField<AgentEmailContact> = email

            /**
             * Returns the raw JSON value of [brandColor].
             *
             * Unlike [brandColor], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("brand_color")
            @ExcludeMissing
            fun _brandColor(): JsonField<String> = brandColor

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [heroUrl].
             *
             * Unlike [heroUrl], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("hero_url") @ExcludeMissing fun _heroUrl(): JsonField<String> = heroUrl

            /**
             * Returns the raw JSON value of [logoUrl].
             *
             * Unlike [logoUrl], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("logo_url") @ExcludeMissing fun _logoUrl(): JsonField<String> = logoUrl

            /**
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phone_number")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<AgentPhoneContact> = phoneNumber

            /**
             * Returns the raw JSON value of [privacyPolicyUrl].
             *
             * Unlike [privacyPolicyUrl], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("privacy_policy_url")
            @ExcludeMissing
            fun _privacyPolicyUrl(): JsonField<String> = privacyPolicyUrl

            /**
             * Returns the raw JSON value of [termsAndConditionsUrl].
             *
             * Unlike [termsAndConditionsUrl], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("terms_and_conditions_url")
            @ExcludeMissing
            fun _termsAndConditionsUrl(): JsonField<String> = termsAndConditionsUrl

            /**
             * Returns the raw JSON value of [website].
             *
             * Unlike [website], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("website")
            @ExcludeMissing
            fun _website(): JsonField<AgentWebsiteContact> = website

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
                 * Returns a mutable builder for constructing an instance of [UnionMember2].
                 *
                 * The following fields are required:
                 * ```java
                 * .email()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnionMember2]. */
            class Builder internal constructor() {

                private var email: JsonField<AgentEmailContact>? = null
                private var brandColor: JsonField<String> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var heroUrl: JsonField<String> = JsonMissing.of()
                private var logoUrl: JsonField<String> = JsonMissing.of()
                private var phoneNumber: JsonField<AgentPhoneContact> = JsonMissing.of()
                private var privacyPolicyUrl: JsonField<String> = JsonMissing.of()
                private var termsAndConditionsUrl: JsonField<String> = JsonMissing.of()
                private var website: JsonField<AgentWebsiteContact> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember2: UnionMember2) = apply {
                    email = unionMember2.email
                    brandColor = unionMember2.brandColor
                    description = unionMember2.description
                    heroUrl = unionMember2.heroUrl
                    logoUrl = unionMember2.logoUrl
                    phoneNumber = unionMember2.phoneNumber
                    privacyPolicyUrl = unionMember2.privacyPolicyUrl
                    termsAndConditionsUrl = unionMember2.termsAndConditionsUrl
                    website = unionMember2.website
                    additionalProperties = unionMember2.additionalProperties.toMutableMap()
                }

                fun email(email: AgentEmailContact) = email(JsonField.of(email))

                /**
                 * Sets [Builder.email] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.email] with a well-typed [AgentEmailContact]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun email(email: JsonField<AgentEmailContact>) = apply { this.email = email }

                fun brandColor(brandColor: String) = brandColor(JsonField.of(brandColor))

                /**
                 * Sets [Builder.brandColor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.brandColor] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun brandColor(brandColor: JsonField<String>) = apply {
                    this.brandColor = brandColor
                }

                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                fun heroUrl(heroUrl: String) = heroUrl(JsonField.of(heroUrl))

                /**
                 * Sets [Builder.heroUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.heroUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun heroUrl(heroUrl: JsonField<String>) = apply { this.heroUrl = heroUrl }

                fun logoUrl(logoUrl: String) = logoUrl(JsonField.of(logoUrl))

                /**
                 * Sets [Builder.logoUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.logoUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun logoUrl(logoUrl: JsonField<String>) = apply { this.logoUrl = logoUrl }

                fun phoneNumber(phoneNumber: AgentPhoneContact?) =
                    phoneNumber(JsonField.ofNullable(phoneNumber))

                /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
                fun phoneNumber(phoneNumber: Optional<AgentPhoneContact>) =
                    phoneNumber(phoneNumber.getOrNull())

                /**
                 * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumber] with a well-typed
                 * [AgentPhoneContact] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun phoneNumber(phoneNumber: JsonField<AgentPhoneContact>) = apply {
                    this.phoneNumber = phoneNumber
                }

                fun privacyPolicyUrl(privacyPolicyUrl: String) =
                    privacyPolicyUrl(JsonField.of(privacyPolicyUrl))

                /**
                 * Sets [Builder.privacyPolicyUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.privacyPolicyUrl] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun privacyPolicyUrl(privacyPolicyUrl: JsonField<String>) = apply {
                    this.privacyPolicyUrl = privacyPolicyUrl
                }

                fun termsAndConditionsUrl(termsAndConditionsUrl: String) =
                    termsAndConditionsUrl(JsonField.of(termsAndConditionsUrl))

                /**
                 * Sets [Builder.termsAndConditionsUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.termsAndConditionsUrl] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun termsAndConditionsUrl(termsAndConditionsUrl: JsonField<String>) = apply {
                    this.termsAndConditionsUrl = termsAndConditionsUrl
                }

                fun website(website: AgentWebsiteContact?) = website(JsonField.ofNullable(website))

                /** Alias for calling [Builder.website] with `website.orElse(null)`. */
                fun website(website: Optional<AgentWebsiteContact>) = website(website.getOrNull())

                /**
                 * Sets [Builder.website] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.website] with a well-typed [AgentWebsiteContact]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun website(website: JsonField<AgentWebsiteContact>) = apply {
                    this.website = website
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [UnionMember2].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .email()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UnionMember2 =
                    UnionMember2(
                        checkRequired("email", email),
                        brandColor,
                        description,
                        heroUrl,
                        logoUrl,
                        phoneNumber,
                        privacyPolicyUrl,
                        termsAndConditionsUrl,
                        website,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): UnionMember2 = apply {
                if (validated) {
                    return@apply
                }

                email().validate()
                brandColor()
                description()
                heroUrl()
                logoUrl()
                phoneNumber().ifPresent { it.validate() }
                privacyPolicyUrl()
                termsAndConditionsUrl()
                website().ifPresent { it.validate() }
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
                (email.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (brandColor.asKnown().isPresent) 1 else 0) +
                    (if (description.asKnown().isPresent) 1 else 0) +
                    (if (heroUrl.asKnown().isPresent) 1 else 0) +
                    (if (logoUrl.asKnown().isPresent) 1 else 0) +
                    (phoneNumber.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (privacyPolicyUrl.asKnown().isPresent) 1 else 0) +
                    (if (termsAndConditionsUrl.asKnown().isPresent) 1 else 0) +
                    (website.asKnown().getOrNull()?.validity() ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionMember2 &&
                    email == other.email &&
                    brandColor == other.brandColor &&
                    description == other.description &&
                    heroUrl == other.heroUrl &&
                    logoUrl == other.logoUrl &&
                    phoneNumber == other.phoneNumber &&
                    privacyPolicyUrl == other.privacyPolicyUrl &&
                    termsAndConditionsUrl == other.termsAndConditionsUrl &&
                    website == other.website &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    email,
                    brandColor,
                    description,
                    heroUrl,
                    logoUrl,
                    phoneNumber,
                    privacyPolicyUrl,
                    termsAndConditionsUrl,
                    website,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnionMember2{email=$email, brandColor=$brandColor, description=$description, heroUrl=$heroUrl, logoUrl=$logoUrl, phoneNumber=$phoneNumber, privacyPolicyUrl=$privacyPolicyUrl, termsAndConditionsUrl=$termsAndConditionsUrl, website=$website, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentConfiguration &&
            basics == other.basics &&
            campaign == other.campaign &&
            testing == other.testing &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(basics, campaign, testing, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentConfiguration{basics=$basics, campaign=$campaign, testing=$testing, additionalProperties=$additionalProperties}"
}
