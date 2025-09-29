// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumberassignmentbyprofile

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
import com.telnyx.api.core.BaseDeserializer
import com.telnyx.api.core.BaseSerializer
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.allMaxBy
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.getOrThrow
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

@JsonDeserialize(using = PhoneNumberAssignmentByProfileAssignResponse.Deserializer::class)
@JsonSerialize(using = PhoneNumberAssignmentByProfileAssignResponse.Serializer::class)
class PhoneNumberAssignmentByProfileAssignResponse
private constructor(
    private val assignProfileToCampaign: AssignProfileToCampaignResponse? = null,
    private val settingsDataErrorMessage: SettingsDataErrorMessage? = null,
    private val _json: JsonValue? = null,
) {

    fun assignProfileToCampaign(): Optional<AssignProfileToCampaignResponse> =
        Optional.ofNullable(assignProfileToCampaign)

    fun settingsDataErrorMessage(): Optional<SettingsDataErrorMessage> =
        Optional.ofNullable(settingsDataErrorMessage)

    fun isAssignProfileToCampaign(): Boolean = assignProfileToCampaign != null

    fun isSettingsDataErrorMessage(): Boolean = settingsDataErrorMessage != null

    fun asAssignProfileToCampaign(): AssignProfileToCampaignResponse =
        assignProfileToCampaign.getOrThrow("assignProfileToCampaign")

    fun asSettingsDataErrorMessage(): SettingsDataErrorMessage =
        settingsDataErrorMessage.getOrThrow("settingsDataErrorMessage")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            assignProfileToCampaign != null ->
                visitor.visitAssignProfileToCampaign(assignProfileToCampaign)
            settingsDataErrorMessage != null ->
                visitor.visitSettingsDataErrorMessage(settingsDataErrorMessage)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): PhoneNumberAssignmentByProfileAssignResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitAssignProfileToCampaign(
                    assignProfileToCampaign: AssignProfileToCampaignResponse
                ) {
                    assignProfileToCampaign.validate()
                }

                override fun visitSettingsDataErrorMessage(
                    settingsDataErrorMessage: SettingsDataErrorMessage
                ) {
                    settingsDataErrorMessage.validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitAssignProfileToCampaign(
                    assignProfileToCampaign: AssignProfileToCampaignResponse
                ) = assignProfileToCampaign.validity()

                override fun visitSettingsDataErrorMessage(
                    settingsDataErrorMessage: SettingsDataErrorMessage
                ) = settingsDataErrorMessage.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberAssignmentByProfileAssignResponse &&
            assignProfileToCampaign == other.assignProfileToCampaign &&
            settingsDataErrorMessage == other.settingsDataErrorMessage
    }

    override fun hashCode(): Int = Objects.hash(assignProfileToCampaign, settingsDataErrorMessage)

    override fun toString(): String =
        when {
            assignProfileToCampaign != null ->
                "PhoneNumberAssignmentByProfileAssignResponse{assignProfileToCampaign=$assignProfileToCampaign}"
            settingsDataErrorMessage != null ->
                "PhoneNumberAssignmentByProfileAssignResponse{settingsDataErrorMessage=$settingsDataErrorMessage}"
            _json != null -> "PhoneNumberAssignmentByProfileAssignResponse{_unknown=$_json}"
            else ->
                throw IllegalStateException("Invalid PhoneNumberAssignmentByProfileAssignResponse")
        }

    companion object {

        @JvmStatic
        fun ofAssignProfileToCampaign(assignProfileToCampaign: AssignProfileToCampaignResponse) =
            PhoneNumberAssignmentByProfileAssignResponse(
                assignProfileToCampaign = assignProfileToCampaign
            )

        @JvmStatic
        fun ofSettingsDataErrorMessage(settingsDataErrorMessage: SettingsDataErrorMessage) =
            PhoneNumberAssignmentByProfileAssignResponse(
                settingsDataErrorMessage = settingsDataErrorMessage
            )
    }

    /**
     * An interface that defines how to map each variant of
     * [PhoneNumberAssignmentByProfileAssignResponse] to a value of type [T].
     */
    interface Visitor<out T> {

        fun visitAssignProfileToCampaign(
            assignProfileToCampaign: AssignProfileToCampaignResponse
        ): T

        fun visitSettingsDataErrorMessage(settingsDataErrorMessage: SettingsDataErrorMessage): T

        /**
         * Maps an unknown variant of [PhoneNumberAssignmentByProfileAssignResponse] to a value of
         * type [T].
         *
         * An instance of [PhoneNumberAssignmentByProfileAssignResponse] can contain an unknown
         * variant if it was deserialized from data that doesn't match any known variant. For
         * example, if the SDK is on an older version than the API, then the API may respond with
         * new variants that the SDK is unaware of.
         *
         * @throws TelnyxInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw TelnyxInvalidDataException(
                "Unknown PhoneNumberAssignmentByProfileAssignResponse: $json"
            )
        }
    }

    internal class Deserializer :
        BaseDeserializer<PhoneNumberAssignmentByProfileAssignResponse>(
            PhoneNumberAssignmentByProfileAssignResponse::class
        ) {

        override fun ObjectCodec.deserialize(
            node: JsonNode
        ): PhoneNumberAssignmentByProfileAssignResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<AssignProfileToCampaignResponse>())
                            ?.let {
                                PhoneNumberAssignmentByProfileAssignResponse(
                                    assignProfileToCampaign = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<SettingsDataErrorMessage>())?.let {
                            PhoneNumberAssignmentByProfileAssignResponse(
                                settingsDataErrorMessage = it,
                                _json = json,
                            )
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> PhoneNumberAssignmentByProfileAssignResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<PhoneNumberAssignmentByProfileAssignResponse>(
            PhoneNumberAssignmentByProfileAssignResponse::class
        ) {

        override fun serialize(
            value: PhoneNumberAssignmentByProfileAssignResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.assignProfileToCampaign != null ->
                    generator.writeObject(value.assignProfileToCampaign)
                value.settingsDataErrorMessage != null ->
                    generator.writeObject(value.settingsDataErrorMessage)
                value._json != null -> generator.writeObject(value._json)
                else ->
                    throw IllegalStateException(
                        "Invalid PhoneNumberAssignmentByProfileAssignResponse"
                    )
            }
        }
    }

    class AssignProfileToCampaignResponse
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val messagingProfileId: JsonField<String>,
        private val taskId: JsonField<String>,
        private val campaignId: JsonField<String>,
        private val tcrCampaignId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("messagingProfileId")
            @ExcludeMissing
            messagingProfileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("taskId") @ExcludeMissing taskId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("campaignId")
            @ExcludeMissing
            campaignId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tcrCampaignId")
            @ExcludeMissing
            tcrCampaignId: JsonField<String> = JsonMissing.of(),
        ) : this(messagingProfileId, taskId, campaignId, tcrCampaignId, mutableMapOf())

        /**
         * The ID of the messaging profile that you want to link to the specified campaign.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun messagingProfileId(): String = messagingProfileId.getRequired("messagingProfileId")

        /**
         * The ID of the task associated with assigning a messaging profile to a campaign.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun taskId(): String = taskId.getRequired("taskId")

        /**
         * The ID of the campaign you want to link to the specified messaging profile. If you supply
         * this ID in the request, do not also include a tcrCampaignId.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun campaignId(): Optional<String> = campaignId.getOptional("campaignId")

        /**
         * The TCR ID of the shared campaign you want to link to the specified messaging profile
         * (for campaigns not created using Telnyx 10DLC services only). If you supply this ID in
         * the request, do not also include a campaignId.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tcrCampaignId(): Optional<String> = tcrCampaignId.getOptional("tcrCampaignId")

        /**
         * Returns the raw JSON value of [messagingProfileId].
         *
         * Unlike [messagingProfileId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("messagingProfileId")
        @ExcludeMissing
        fun _messagingProfileId(): JsonField<String> = messagingProfileId

        /**
         * Returns the raw JSON value of [taskId].
         *
         * Unlike [taskId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("taskId") @ExcludeMissing fun _taskId(): JsonField<String> = taskId

        /**
         * Returns the raw JSON value of [campaignId].
         *
         * Unlike [campaignId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("campaignId")
        @ExcludeMissing
        fun _campaignId(): JsonField<String> = campaignId

        /**
         * Returns the raw JSON value of [tcrCampaignId].
         *
         * Unlike [tcrCampaignId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tcrCampaignId")
        @ExcludeMissing
        fun _tcrCampaignId(): JsonField<String> = tcrCampaignId

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
             * [AssignProfileToCampaignResponse].
             *
             * The following fields are required:
             * ```java
             * .messagingProfileId()
             * .taskId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AssignProfileToCampaignResponse]. */
        class Builder internal constructor() {

            private var messagingProfileId: JsonField<String>? = null
            private var taskId: JsonField<String>? = null
            private var campaignId: JsonField<String> = JsonMissing.of()
            private var tcrCampaignId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(assignProfileToCampaignResponse: AssignProfileToCampaignResponse) =
                apply {
                    messagingProfileId = assignProfileToCampaignResponse.messagingProfileId
                    taskId = assignProfileToCampaignResponse.taskId
                    campaignId = assignProfileToCampaignResponse.campaignId
                    tcrCampaignId = assignProfileToCampaignResponse.tcrCampaignId
                    additionalProperties =
                        assignProfileToCampaignResponse.additionalProperties.toMutableMap()
                }

            /** The ID of the messaging profile that you want to link to the specified campaign. */
            fun messagingProfileId(messagingProfileId: String) =
                messagingProfileId(JsonField.of(messagingProfileId))

            /**
             * Sets [Builder.messagingProfileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messagingProfileId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun messagingProfileId(messagingProfileId: JsonField<String>) = apply {
                this.messagingProfileId = messagingProfileId
            }

            /** The ID of the task associated with assigning a messaging profile to a campaign. */
            fun taskId(taskId: String) = taskId(JsonField.of(taskId))

            /**
             * Sets [Builder.taskId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taskId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taskId(taskId: JsonField<String>) = apply { this.taskId = taskId }

            /**
             * The ID of the campaign you want to link to the specified messaging profile. If you
             * supply this ID in the request, do not also include a tcrCampaignId.
             */
            fun campaignId(campaignId: String) = campaignId(JsonField.of(campaignId))

            /**
             * Sets [Builder.campaignId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.campaignId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun campaignId(campaignId: JsonField<String>) = apply { this.campaignId = campaignId }

            /**
             * The TCR ID of the shared campaign you want to link to the specified messaging profile
             * (for campaigns not created using Telnyx 10DLC services only). If you supply this ID
             * in the request, do not also include a campaignId.
             */
            fun tcrCampaignId(tcrCampaignId: String) = tcrCampaignId(JsonField.of(tcrCampaignId))

            /**
             * Sets [Builder.tcrCampaignId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tcrCampaignId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tcrCampaignId(tcrCampaignId: JsonField<String>) = apply {
                this.tcrCampaignId = tcrCampaignId
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
             * Returns an immutable instance of [AssignProfileToCampaignResponse].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .messagingProfileId()
             * .taskId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AssignProfileToCampaignResponse =
                AssignProfileToCampaignResponse(
                    checkRequired("messagingProfileId", messagingProfileId),
                    checkRequired("taskId", taskId),
                    campaignId,
                    tcrCampaignId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AssignProfileToCampaignResponse = apply {
            if (validated) {
                return@apply
            }

            messagingProfileId()
            taskId()
            campaignId()
            tcrCampaignId()
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
            (if (messagingProfileId.asKnown().isPresent) 1 else 0) +
                (if (taskId.asKnown().isPresent) 1 else 0) +
                (if (campaignId.asKnown().isPresent) 1 else 0) +
                (if (tcrCampaignId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AssignProfileToCampaignResponse &&
                messagingProfileId == other.messagingProfileId &&
                taskId == other.taskId &&
                campaignId == other.campaignId &&
                tcrCampaignId == other.tcrCampaignId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                messagingProfileId,
                taskId,
                campaignId,
                tcrCampaignId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AssignProfileToCampaignResponse{messagingProfileId=$messagingProfileId, taskId=$taskId, campaignId=$campaignId, tcrCampaignId=$tcrCampaignId, additionalProperties=$additionalProperties}"
    }

    class SettingsDataErrorMessage
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val message: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of()
        ) : this(message, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun message(): String = message.getRequired("message")

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

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
             * Returns a mutable builder for constructing an instance of [SettingsDataErrorMessage].
             *
             * The following fields are required:
             * ```java
             * .message()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SettingsDataErrorMessage]. */
        class Builder internal constructor() {

            private var message: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(settingsDataErrorMessage: SettingsDataErrorMessage) = apply {
                message = settingsDataErrorMessage.message
                additionalProperties = settingsDataErrorMessage.additionalProperties.toMutableMap()
            }

            fun message(message: String) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<String>) = apply { this.message = message }

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
             * Returns an immutable instance of [SettingsDataErrorMessage].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .message()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SettingsDataErrorMessage =
                SettingsDataErrorMessage(
                    checkRequired("message", message),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): SettingsDataErrorMessage = apply {
            if (validated) {
                return@apply
            }

            message()
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
        @JvmSynthetic internal fun validity(): Int = (if (message.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SettingsDataErrorMessage &&
                message == other.message &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(message, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SettingsDataErrorMessage{message=$message, additionalProperties=$additionalProperties}"
    }
}
