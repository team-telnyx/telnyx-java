// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls

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
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Initiate an outbound TeXML call. Telnyx will request TeXML from the XML Request URL configured
 * for the connection in the Mission Control Portal.
 */
class CallCallsParams
private constructor(
    private val accountSid: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun accountSid(): Optional<String> = Optional.ofNullable(accountSid)

    fun body(): Body = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CallCallsParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CallCallsParams]. */
    class Builder internal constructor() {

        private var accountSid: String? = null
        private var body: Body? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(callCallsParams: CallCallsParams) = apply {
            accountSid = callCallsParams.accountSid
            body = callCallsParams.body
            additionalHeaders = callCallsParams.additionalHeaders.toBuilder()
            additionalQueryParams = callCallsParams.additionalQueryParams.toBuilder()
        }

        fun accountSid(accountSid: String?) = apply { this.accountSid = accountSid }

        /** Alias for calling [Builder.accountSid] with `accountSid.orElse(null)`. */
        fun accountSid(accountSid: Optional<String>) = accountSid(accountSid.getOrNull())

        fun body(body: Body) = apply { this.body = body }

        /** Alias for calling [body] with `Body.ofWithUrl(withUrl)`. */
        fun body(withUrl: Body.WithUrl) = body(Body.ofWithUrl(withUrl))

        /** Alias for calling [body] with `Body.ofWithTeXml(withTeXml)`. */
        fun body(withTeXml: Body.WithTeXml) = body(Body.ofWithTeXml(withTeXml))

        /** Alias for calling [body] with `Body.ofApplicationDefault(applicationDefault)`. */
        fun body(applicationDefault: Body.ApplicationDefault) =
            body(Body.ofApplicationDefault(applicationDefault))

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
         * Returns an immutable instance of [CallCallsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CallCallsParams =
            CallCallsParams(
                accountSid,
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> accountSid ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val withUrl: WithUrl? = null,
        private val withTeXml: WithTeXml? = null,
        private val applicationDefault: ApplicationDefault? = null,
        private val _json: JsonValue? = null,
    ) {

        fun withUrl(): Optional<WithUrl> = Optional.ofNullable(withUrl)

        fun withTeXml(): Optional<WithTeXml> = Optional.ofNullable(withTeXml)

        fun applicationDefault(): Optional<ApplicationDefault> =
            Optional.ofNullable(applicationDefault)

        fun isWithUrl(): Boolean = withUrl != null

        fun isWithTeXml(): Boolean = withTeXml != null

        fun isApplicationDefault(): Boolean = applicationDefault != null

        fun asWithUrl(): WithUrl = withUrl.getOrThrow("withUrl")

        fun asWithTeXml(): WithTeXml = withTeXml.getOrThrow("withTeXml")

        fun asApplicationDefault(): ApplicationDefault =
            applicationDefault.getOrThrow("applicationDefault")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                withUrl != null -> visitor.visitWithUrl(withUrl)
                withTeXml != null -> visitor.visitWithTeXml(withTeXml)
                applicationDefault != null -> visitor.visitApplicationDefault(applicationDefault)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitWithUrl(withUrl: WithUrl) {
                        withUrl.validate()
                    }

                    override fun visitWithTeXml(withTeXml: WithTeXml) {
                        withTeXml.validate()
                    }

                    override fun visitApplicationDefault(applicationDefault: ApplicationDefault) {
                        applicationDefault.validate()
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
                    override fun visitWithUrl(withUrl: WithUrl) = withUrl.validity()

                    override fun visitWithTeXml(withTeXml: WithTeXml) = withTeXml.validity()

                    override fun visitApplicationDefault(applicationDefault: ApplicationDefault) =
                        applicationDefault.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                withUrl == other.withUrl &&
                withTeXml == other.withTeXml &&
                applicationDefault == other.applicationDefault
        }

        override fun hashCode(): Int = Objects.hash(withUrl, withTeXml, applicationDefault)

        override fun toString(): String =
            when {
                withUrl != null -> "Body{withUrl=$withUrl}"
                withTeXml != null -> "Body{withTeXml=$withTeXml}"
                applicationDefault != null -> "Body{applicationDefault=$applicationDefault}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            @JvmStatic fun ofWithUrl(withUrl: WithUrl) = Body(withUrl = withUrl)

            @JvmStatic fun ofWithTeXml(withTeXml: WithTeXml) = Body(withTeXml = withTeXml)

            @JvmStatic
            fun ofApplicationDefault(applicationDefault: ApplicationDefault) =
                Body(applicationDefault = applicationDefault)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitWithUrl(withUrl: WithUrl): T

            fun visitWithTeXml(withTeXml: WithTeXml): T

            fun visitApplicationDefault(applicationDefault: ApplicationDefault): T

            /**
             * Maps an unknown variant of [Body] to a value of type [T].
             *
             * An instance of [Body] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Body: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Body>(Body::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Body {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<WithUrl>())?.let {
                                Body(withUrl = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<WithTeXml>())?.let {
                                Body(withTeXml = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ApplicationDefault>())?.let {
                                Body(applicationDefault = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Body(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Body>(Body::class) {

            override fun serialize(
                value: Body,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.withUrl != null -> generator.writeObject(value.withUrl)
                    value.withTeXml != null -> generator.writeObject(value.withTeXml)
                    value.applicationDefault != null ->
                        generator.writeObject(value.applicationDefault)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }

        class WithUrl
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val url: JsonField<String>,
            private val applicationSid: JsonField<String>,
            private val asyncAmd: JsonField<Boolean>,
            private val asyncAmdStatusCallback: JsonField<String>,
            private val asyncAmdStatusCallbackMethod: JsonField<AsyncAmdStatusCallbackMethod>,
            private val callerId: JsonField<String>,
            private val cancelPlaybackOnDetectMessageEnd: JsonField<Boolean>,
            private val cancelPlaybackOnMachineDetection: JsonField<Boolean>,
            private val customHeaders: JsonField<List<CustomHeader>>,
            private val detectionMode: JsonField<DetectionMode>,
            private val fallbackUrl: JsonField<String>,
            private val from: JsonField<String>,
            private val machineDetection: JsonField<MachineDetection>,
            private val machineDetectionSilenceTimeout: JsonField<Long>,
            private val machineDetectionSpeechEndThreshold: JsonField<Long>,
            private val machineDetectionSpeechThreshold: JsonField<Long>,
            private val machineDetectionTimeout: JsonField<Long>,
            private val mediaEncryption: JsonField<MediaEncryption>,
            private val preferredCodecs: JsonField<String>,
            private val record: JsonField<Boolean>,
            private val recordingChannels: JsonField<RecordingChannels>,
            private val recordingStatusCallback: JsonField<String>,
            private val recordingStatusCallbackEvent: JsonField<String>,
            private val recordingStatusCallbackMethod: JsonField<RecordingStatusCallbackMethod>,
            private val recordingTimeout: JsonField<Long>,
            private val recordingTrack: JsonField<RecordingTrack>,
            private val sendRecordingUrl: JsonField<Boolean>,
            private val sipAuthPassword: JsonField<String>,
            private val sipAuthUsername: JsonField<String>,
            private val sipRegion: JsonField<SipRegion>,
            private val statusCallback: JsonField<String>,
            private val statusCallbackEvent: JsonField<StatusCallbackEvent>,
            private val statusCallbackMethod: JsonField<StatusCallbackMethod>,
            private val superviseCallSid: JsonField<String>,
            private val supervisingRole: JsonField<SupervisingRole>,
            private val texml: JsonValue,
            private val timeLimit: JsonField<Long>,
            private val timeout: JsonField<Long>,
            private val to: JsonField<String>,
            private val trim: JsonField<Trim>,
            private val urlMethod: JsonField<UrlMethod>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("Url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ApplicationSid")
                @ExcludeMissing
                applicationSid: JsonField<String> = JsonMissing.of(),
                @JsonProperty("AsyncAmd")
                @ExcludeMissing
                asyncAmd: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("AsyncAmdStatusCallback")
                @ExcludeMissing
                asyncAmdStatusCallback: JsonField<String> = JsonMissing.of(),
                @JsonProperty("AsyncAmdStatusCallbackMethod")
                @ExcludeMissing
                asyncAmdStatusCallbackMethod: JsonField<AsyncAmdStatusCallbackMethod> =
                    JsonMissing.of(),
                @JsonProperty("CallerId")
                @ExcludeMissing
                callerId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("CancelPlaybackOnDetectMessageEnd")
                @ExcludeMissing
                cancelPlaybackOnDetectMessageEnd: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("CancelPlaybackOnMachineDetection")
                @ExcludeMissing
                cancelPlaybackOnMachineDetection: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("CustomHeaders")
                @ExcludeMissing
                customHeaders: JsonField<List<CustomHeader>> = JsonMissing.of(),
                @JsonProperty("DetectionMode")
                @ExcludeMissing
                detectionMode: JsonField<DetectionMode> = JsonMissing.of(),
                @JsonProperty("FallbackUrl")
                @ExcludeMissing
                fallbackUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("From") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
                @JsonProperty("MachineDetection")
                @ExcludeMissing
                machineDetection: JsonField<MachineDetection> = JsonMissing.of(),
                @JsonProperty("MachineDetectionSilenceTimeout")
                @ExcludeMissing
                machineDetectionSilenceTimeout: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("MachineDetectionSpeechEndThreshold")
                @ExcludeMissing
                machineDetectionSpeechEndThreshold: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("MachineDetectionSpeechThreshold")
                @ExcludeMissing
                machineDetectionSpeechThreshold: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("MachineDetectionTimeout")
                @ExcludeMissing
                machineDetectionTimeout: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("MediaEncryption")
                @ExcludeMissing
                mediaEncryption: JsonField<MediaEncryption> = JsonMissing.of(),
                @JsonProperty("PreferredCodecs")
                @ExcludeMissing
                preferredCodecs: JsonField<String> = JsonMissing.of(),
                @JsonProperty("Record")
                @ExcludeMissing
                record: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("RecordingChannels")
                @ExcludeMissing
                recordingChannels: JsonField<RecordingChannels> = JsonMissing.of(),
                @JsonProperty("RecordingStatusCallback")
                @ExcludeMissing
                recordingStatusCallback: JsonField<String> = JsonMissing.of(),
                @JsonProperty("RecordingStatusCallbackEvent")
                @ExcludeMissing
                recordingStatusCallbackEvent: JsonField<String> = JsonMissing.of(),
                @JsonProperty("RecordingStatusCallbackMethod")
                @ExcludeMissing
                recordingStatusCallbackMethod: JsonField<RecordingStatusCallbackMethod> =
                    JsonMissing.of(),
                @JsonProperty("RecordingTimeout")
                @ExcludeMissing
                recordingTimeout: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("RecordingTrack")
                @ExcludeMissing
                recordingTrack: JsonField<RecordingTrack> = JsonMissing.of(),
                @JsonProperty("SendRecordingUrl")
                @ExcludeMissing
                sendRecordingUrl: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("SipAuthPassword")
                @ExcludeMissing
                sipAuthPassword: JsonField<String> = JsonMissing.of(),
                @JsonProperty("SipAuthUsername")
                @ExcludeMissing
                sipAuthUsername: JsonField<String> = JsonMissing.of(),
                @JsonProperty("SipRegion")
                @ExcludeMissing
                sipRegion: JsonField<SipRegion> = JsonMissing.of(),
                @JsonProperty("StatusCallback")
                @ExcludeMissing
                statusCallback: JsonField<String> = JsonMissing.of(),
                @JsonProperty("StatusCallbackEvent")
                @ExcludeMissing
                statusCallbackEvent: JsonField<StatusCallbackEvent> = JsonMissing.of(),
                @JsonProperty("StatusCallbackMethod")
                @ExcludeMissing
                statusCallbackMethod: JsonField<StatusCallbackMethod> = JsonMissing.of(),
                @JsonProperty("SuperviseCallSid")
                @ExcludeMissing
                superviseCallSid: JsonField<String> = JsonMissing.of(),
                @JsonProperty("SupervisingRole")
                @ExcludeMissing
                supervisingRole: JsonField<SupervisingRole> = JsonMissing.of(),
                @JsonProperty("Texml") @ExcludeMissing texml: JsonValue = JsonMissing.of(),
                @JsonProperty("TimeLimit")
                @ExcludeMissing
                timeLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("Timeout")
                @ExcludeMissing
                timeout: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("To") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
                @JsonProperty("Trim") @ExcludeMissing trim: JsonField<Trim> = JsonMissing.of(),
                @JsonProperty("UrlMethod")
                @ExcludeMissing
                urlMethod: JsonField<UrlMethod> = JsonMissing.of(),
            ) : this(
                url,
                applicationSid,
                asyncAmd,
                asyncAmdStatusCallback,
                asyncAmdStatusCallbackMethod,
                callerId,
                cancelPlaybackOnDetectMessageEnd,
                cancelPlaybackOnMachineDetection,
                customHeaders,
                detectionMode,
                fallbackUrl,
                from,
                machineDetection,
                machineDetectionSilenceTimeout,
                machineDetectionSpeechEndThreshold,
                machineDetectionSpeechThreshold,
                machineDetectionTimeout,
                mediaEncryption,
                preferredCodecs,
                record,
                recordingChannels,
                recordingStatusCallback,
                recordingStatusCallbackEvent,
                recordingStatusCallbackMethod,
                recordingTimeout,
                recordingTrack,
                sendRecordingUrl,
                sipAuthPassword,
                sipAuthUsername,
                sipRegion,
                statusCallback,
                statusCallbackEvent,
                statusCallbackMethod,
                superviseCallSid,
                supervisingRole,
                texml,
                timeLimit,
                timeout,
                to,
                trim,
                urlMethod,
                mutableMapOf(),
            )

            /**
             * The URL from which Telnyx will retrieve the TeXML call instructions.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun url(): String = url.getRequired("Url")

            /**
             * The ID of the TeXML Application.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun applicationSid(): Optional<String> = applicationSid.getOptional("ApplicationSid")

            /**
             * Select whether to perform answering machine detection in the background. By default
             * execution is blocked until Answering Machine Detection is completed.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun asyncAmd(): Optional<Boolean> = asyncAmd.getOptional("AsyncAmd")

            /**
             * URL destination for Telnyx to send AMD callback events to for the call.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun asyncAmdStatusCallback(): Optional<String> =
                asyncAmdStatusCallback.getOptional("AsyncAmdStatusCallback")

            /**
             * HTTP request type used for `AsyncAmdStatusCallback`. The default value is inherited
             * from TeXML Application setting.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun asyncAmdStatusCallbackMethod(): Optional<AsyncAmdStatusCallbackMethod> =
                asyncAmdStatusCallbackMethod.getOptional("AsyncAmdStatusCallbackMethod")

            /**
             * To be used as the caller id name (SIP From Display Name) presented to the destination
             * (`To` number). The string should have a maximum of 128 characters, containing only
             * letters, numbers, spaces, and `-_~!.+` special characters. If ommited, the display
             * name will be the same as the number in the `From` field.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun callerId(): Optional<String> = callerId.getOptional("CallerId")

            /**
             * Whether to cancel ongoing playback on `greeting ended` detection. Defaults to `true`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cancelPlaybackOnDetectMessageEnd(): Optional<Boolean> =
                cancelPlaybackOnDetectMessageEnd.getOptional("CancelPlaybackOnDetectMessageEnd")

            /**
             * Whether to cancel ongoing playback on `machine` detection. Defaults to `true`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cancelPlaybackOnMachineDetection(): Optional<Boolean> =
                cancelPlaybackOnMachineDetection.getOptional("CancelPlaybackOnMachineDetection")

            /**
             * Custom HTTP headers to be sent with the call. Each header should be an object with
             * 'name' and 'value' properties.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun customHeaders(): Optional<List<CustomHeader>> =
                customHeaders.getOptional("CustomHeaders")

            /**
             * Allows you to chose between Premium and Standard detections.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun detectionMode(): Optional<DetectionMode> =
                detectionMode.getOptional("DetectionMode")

            /**
             * A failover URL for which Telnyx will retrieve the TeXML call instructions if the
             * `Url` is not responding.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun fallbackUrl(): Optional<String> = fallbackUrl.getOptional("FallbackUrl")

            /**
             * The phone number of the party that initiated the call. Phone numbers are formatted
             * with a `+` and country code.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun from(): Optional<String> = from.getOptional("From")

            /**
             * Enables Answering Machine Detection.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun machineDetection(): Optional<MachineDetection> =
                machineDetection.getOptional("MachineDetection")

            /**
             * If initial silence duration is greater than this value, consider it a machine.
             * Ignored when `premium` detection is used.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun machineDetectionSilenceTimeout(): Optional<Long> =
                machineDetectionSilenceTimeout.getOptional("MachineDetectionSilenceTimeout")

            /**
             * Silence duration threshold after a greeting message or voice for it be considered
             * human. Ignored when `premium` detection is used.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun machineDetectionSpeechEndThreshold(): Optional<Long> =
                machineDetectionSpeechEndThreshold.getOptional("MachineDetectionSpeechEndThreshold")

            /**
             * Maximum threshold of a human greeting. If greeting longer than this value, considered
             * machine. Ignored when `premium` detection is used.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun machineDetectionSpeechThreshold(): Optional<Long> =
                machineDetectionSpeechThreshold.getOptional("MachineDetectionSpeechThreshold")

            /**
             * Maximum timeout threshold in milliseconds for overall detection.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun machineDetectionTimeout(): Optional<Long> =
                machineDetectionTimeout.getOptional("MachineDetectionTimeout")

            /**
             * Defines whether media should be encrypted on the call. When set to `SRTP`, the call
             * will use Secure Real-time Transport Protocol for media encryption. When set to
             * `DTLS`, the call will use DTLS for media encryption. Only supported for SIP
             * destinations.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mediaEncryption(): Optional<MediaEncryption> =
                mediaEncryption.getOptional("MediaEncryption")

            /**
             * The list of comma-separated codecs to be offered on a call.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun preferredCodecs(): Optional<String> = preferredCodecs.getOptional("PreferredCodecs")

            /**
             * Whether to record the entire participant's call leg. Defaults to `false`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun record(): Optional<Boolean> = record.getOptional("Record")

            /**
             * The number of channels in the final recording. Defaults to `mono`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordingChannels(): Optional<RecordingChannels> =
                recordingChannels.getOptional("RecordingChannels")

            /**
             * The URL the recording callbacks will be sent to.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordingStatusCallback(): Optional<String> =
                recordingStatusCallback.getOptional("RecordingStatusCallback")

            /**
             * The changes to the recording's state that should generate a call to
             * `RecoridngStatusCallback`. Can be: `in-progress`, `completed` and `absent`. Separate
             * multiple values with a space. Defaults to `completed`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordingStatusCallbackEvent(): Optional<String> =
                recordingStatusCallbackEvent.getOptional("RecordingStatusCallbackEvent")

            /**
             * HTTP request type used for `RecordingStatusCallback`. Defaults to `POST`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordingStatusCallbackMethod(): Optional<RecordingStatusCallbackMethod> =
                recordingStatusCallbackMethod.getOptional("RecordingStatusCallbackMethod")

            /**
             * The number of seconds that Telnyx will wait for the recording to be stopped if
             * silence is detected. The timer only starts when the speech is detected. Please note
             * that the transcription is used to detect silence and the related charge will be
             * applied. The minimum value is 0. The default value is 0 (infinite)
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordingTimeout(): Optional<Long> =
                recordingTimeout.getOptional("RecordingTimeout")

            /**
             * The audio track to record for the call. The default is `both`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordingTrack(): Optional<RecordingTrack> =
                recordingTrack.getOptional("RecordingTrack")

            /**
             * Whether to send RecordingUrl in webhooks.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sendRecordingUrl(): Optional<Boolean> =
                sendRecordingUrl.getOptional("SendRecordingUrl")

            /**
             * The password to use for SIP authentication.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sipAuthPassword(): Optional<String> = sipAuthPassword.getOptional("SipAuthPassword")

            /**
             * The username to use for SIP authentication.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sipAuthUsername(): Optional<String> = sipAuthUsername.getOptional("SipAuthUsername")

            /**
             * Defines the SIP region to be used for the call.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sipRegion(): Optional<SipRegion> = sipRegion.getOptional("SipRegion")

            /**
             * URL destination for Telnyx to send status callback events to for the call.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun statusCallback(): Optional<String> = statusCallback.getOptional("StatusCallback")

            /**
             * The call events for which Telnyx should send a webhook. Multiple events can be
             * defined when separated by a space.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun statusCallbackEvent(): Optional<StatusCallbackEvent> =
                statusCallbackEvent.getOptional("StatusCallbackEvent")

            /**
             * HTTP request type used for `StatusCallback`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun statusCallbackMethod(): Optional<StatusCallbackMethod> =
                statusCallbackMethod.getOptional("StatusCallbackMethod")

            /**
             * The call control ID of the existing call to supervise. When provided, the created leg
             * will be added to the specified call in supervising mode. Status callbacks and action
             * callbacks will NOT be sent for the supervising leg.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun superviseCallSid(): Optional<String> =
                superviseCallSid.getOptional("SuperviseCallSid")

            /**
             * The supervising role for the new leg. Determines the audio behavior: barge (hear both
             * sides), whisper (only hear supervisor), monitor (hear both sides but supervisor
             * muted). Default: barge
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun supervisingRole(): Optional<SupervisingRole> =
                supervisingRole.getOptional("SupervisingRole")

            /**
             * This arbitrary value can be deserialized into a custom type using the `convert`
             * method:
             * ```java
             * MyClass myObject = withUrl.texml().convert(MyClass.class);
             * ```
             */
            @JsonProperty("Texml") @ExcludeMissing fun _texml(): JsonValue = texml

            /**
             * The maximum duration of the call in seconds. The minimum value is 30 and the maximum
             * value is 14400 (4 hours). Default is 14400 seconds.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun timeLimit(): Optional<Long> = timeLimit.getOptional("TimeLimit")

            /**
             * The number of seconds to wait for the called party to answer the call before the call
             * is canceled. The minimum value is 5 and the maximum value is 120. Default is 30
             * seconds.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun timeout(): Optional<Long> = timeout.getOptional("Timeout")

            /**
             * The phone number of the called party. Phone numbers are formatted with a `+` and
             * country code.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun to(): Optional<String> = to.getOptional("To")

            /**
             * Whether to trim any leading and trailing silence from the recording. Defaults to
             * `trim-silence`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun trim(): Optional<Trim> = trim.getOptional("Trim")

            /**
             * HTTP request type used for `Url`. The default value is inherited from TeXML
             * Application setting.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun urlMethod(): Optional<UrlMethod> = urlMethod.getOptional("UrlMethod")

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("Url") @ExcludeMissing fun _url(): JsonField<String> = url

            /**
             * Returns the raw JSON value of [applicationSid].
             *
             * Unlike [applicationSid], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("ApplicationSid")
            @ExcludeMissing
            fun _applicationSid(): JsonField<String> = applicationSid

            /**
             * Returns the raw JSON value of [asyncAmd].
             *
             * Unlike [asyncAmd], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("AsyncAmd") @ExcludeMissing fun _asyncAmd(): JsonField<Boolean> = asyncAmd

            /**
             * Returns the raw JSON value of [asyncAmdStatusCallback].
             *
             * Unlike [asyncAmdStatusCallback], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("AsyncAmdStatusCallback")
            @ExcludeMissing
            fun _asyncAmdStatusCallback(): JsonField<String> = asyncAmdStatusCallback

            /**
             * Returns the raw JSON value of [asyncAmdStatusCallbackMethod].
             *
             * Unlike [asyncAmdStatusCallbackMethod], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("AsyncAmdStatusCallbackMethod")
            @ExcludeMissing
            fun _asyncAmdStatusCallbackMethod(): JsonField<AsyncAmdStatusCallbackMethod> =
                asyncAmdStatusCallbackMethod

            /**
             * Returns the raw JSON value of [callerId].
             *
             * Unlike [callerId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("CallerId") @ExcludeMissing fun _callerId(): JsonField<String> = callerId

            /**
             * Returns the raw JSON value of [cancelPlaybackOnDetectMessageEnd].
             *
             * Unlike [cancelPlaybackOnDetectMessageEnd], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("CancelPlaybackOnDetectMessageEnd")
            @ExcludeMissing
            fun _cancelPlaybackOnDetectMessageEnd(): JsonField<Boolean> =
                cancelPlaybackOnDetectMessageEnd

            /**
             * Returns the raw JSON value of [cancelPlaybackOnMachineDetection].
             *
             * Unlike [cancelPlaybackOnMachineDetection], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("CancelPlaybackOnMachineDetection")
            @ExcludeMissing
            fun _cancelPlaybackOnMachineDetection(): JsonField<Boolean> =
                cancelPlaybackOnMachineDetection

            /**
             * Returns the raw JSON value of [customHeaders].
             *
             * Unlike [customHeaders], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("CustomHeaders")
            @ExcludeMissing
            fun _customHeaders(): JsonField<List<CustomHeader>> = customHeaders

            /**
             * Returns the raw JSON value of [detectionMode].
             *
             * Unlike [detectionMode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("DetectionMode")
            @ExcludeMissing
            fun _detectionMode(): JsonField<DetectionMode> = detectionMode

            /**
             * Returns the raw JSON value of [fallbackUrl].
             *
             * Unlike [fallbackUrl], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("FallbackUrl")
            @ExcludeMissing
            fun _fallbackUrl(): JsonField<String> = fallbackUrl

            /**
             * Returns the raw JSON value of [from].
             *
             * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("From") @ExcludeMissing fun _from(): JsonField<String> = from

            /**
             * Returns the raw JSON value of [machineDetection].
             *
             * Unlike [machineDetection], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("MachineDetection")
            @ExcludeMissing
            fun _machineDetection(): JsonField<MachineDetection> = machineDetection

            /**
             * Returns the raw JSON value of [machineDetectionSilenceTimeout].
             *
             * Unlike [machineDetectionSilenceTimeout], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("MachineDetectionSilenceTimeout")
            @ExcludeMissing
            fun _machineDetectionSilenceTimeout(): JsonField<Long> = machineDetectionSilenceTimeout

            /**
             * Returns the raw JSON value of [machineDetectionSpeechEndThreshold].
             *
             * Unlike [machineDetectionSpeechEndThreshold], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("MachineDetectionSpeechEndThreshold")
            @ExcludeMissing
            fun _machineDetectionSpeechEndThreshold(): JsonField<Long> =
                machineDetectionSpeechEndThreshold

            /**
             * Returns the raw JSON value of [machineDetectionSpeechThreshold].
             *
             * Unlike [machineDetectionSpeechThreshold], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("MachineDetectionSpeechThreshold")
            @ExcludeMissing
            fun _machineDetectionSpeechThreshold(): JsonField<Long> =
                machineDetectionSpeechThreshold

            /**
             * Returns the raw JSON value of [machineDetectionTimeout].
             *
             * Unlike [machineDetectionTimeout], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("MachineDetectionTimeout")
            @ExcludeMissing
            fun _machineDetectionTimeout(): JsonField<Long> = machineDetectionTimeout

            /**
             * Returns the raw JSON value of [mediaEncryption].
             *
             * Unlike [mediaEncryption], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("MediaEncryption")
            @ExcludeMissing
            fun _mediaEncryption(): JsonField<MediaEncryption> = mediaEncryption

            /**
             * Returns the raw JSON value of [preferredCodecs].
             *
             * Unlike [preferredCodecs], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("PreferredCodecs")
            @ExcludeMissing
            fun _preferredCodecs(): JsonField<String> = preferredCodecs

            /**
             * Returns the raw JSON value of [record].
             *
             * Unlike [record], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("Record") @ExcludeMissing fun _record(): JsonField<Boolean> = record

            /**
             * Returns the raw JSON value of [recordingChannels].
             *
             * Unlike [recordingChannels], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("RecordingChannels")
            @ExcludeMissing
            fun _recordingChannels(): JsonField<RecordingChannels> = recordingChannels

            /**
             * Returns the raw JSON value of [recordingStatusCallback].
             *
             * Unlike [recordingStatusCallback], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("RecordingStatusCallback")
            @ExcludeMissing
            fun _recordingStatusCallback(): JsonField<String> = recordingStatusCallback

            /**
             * Returns the raw JSON value of [recordingStatusCallbackEvent].
             *
             * Unlike [recordingStatusCallbackEvent], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("RecordingStatusCallbackEvent")
            @ExcludeMissing
            fun _recordingStatusCallbackEvent(): JsonField<String> = recordingStatusCallbackEvent

            /**
             * Returns the raw JSON value of [recordingStatusCallbackMethod].
             *
             * Unlike [recordingStatusCallbackMethod], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("RecordingStatusCallbackMethod")
            @ExcludeMissing
            fun _recordingStatusCallbackMethod(): JsonField<RecordingStatusCallbackMethod> =
                recordingStatusCallbackMethod

            /**
             * Returns the raw JSON value of [recordingTimeout].
             *
             * Unlike [recordingTimeout], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("RecordingTimeout")
            @ExcludeMissing
            fun _recordingTimeout(): JsonField<Long> = recordingTimeout

            /**
             * Returns the raw JSON value of [recordingTrack].
             *
             * Unlike [recordingTrack], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("RecordingTrack")
            @ExcludeMissing
            fun _recordingTrack(): JsonField<RecordingTrack> = recordingTrack

            /**
             * Returns the raw JSON value of [sendRecordingUrl].
             *
             * Unlike [sendRecordingUrl], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("SendRecordingUrl")
            @ExcludeMissing
            fun _sendRecordingUrl(): JsonField<Boolean> = sendRecordingUrl

            /**
             * Returns the raw JSON value of [sipAuthPassword].
             *
             * Unlike [sipAuthPassword], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("SipAuthPassword")
            @ExcludeMissing
            fun _sipAuthPassword(): JsonField<String> = sipAuthPassword

            /**
             * Returns the raw JSON value of [sipAuthUsername].
             *
             * Unlike [sipAuthUsername], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("SipAuthUsername")
            @ExcludeMissing
            fun _sipAuthUsername(): JsonField<String> = sipAuthUsername

            /**
             * Returns the raw JSON value of [sipRegion].
             *
             * Unlike [sipRegion], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("SipRegion")
            @ExcludeMissing
            fun _sipRegion(): JsonField<SipRegion> = sipRegion

            /**
             * Returns the raw JSON value of [statusCallback].
             *
             * Unlike [statusCallback], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("StatusCallback")
            @ExcludeMissing
            fun _statusCallback(): JsonField<String> = statusCallback

            /**
             * Returns the raw JSON value of [statusCallbackEvent].
             *
             * Unlike [statusCallbackEvent], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("StatusCallbackEvent")
            @ExcludeMissing
            fun _statusCallbackEvent(): JsonField<StatusCallbackEvent> = statusCallbackEvent

            /**
             * Returns the raw JSON value of [statusCallbackMethod].
             *
             * Unlike [statusCallbackMethod], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("StatusCallbackMethod")
            @ExcludeMissing
            fun _statusCallbackMethod(): JsonField<StatusCallbackMethod> = statusCallbackMethod

            /**
             * Returns the raw JSON value of [superviseCallSid].
             *
             * Unlike [superviseCallSid], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("SuperviseCallSid")
            @ExcludeMissing
            fun _superviseCallSid(): JsonField<String> = superviseCallSid

            /**
             * Returns the raw JSON value of [supervisingRole].
             *
             * Unlike [supervisingRole], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("SupervisingRole")
            @ExcludeMissing
            fun _supervisingRole(): JsonField<SupervisingRole> = supervisingRole

            /**
             * Returns the raw JSON value of [timeLimit].
             *
             * Unlike [timeLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("TimeLimit") @ExcludeMissing fun _timeLimit(): JsonField<Long> = timeLimit

            /**
             * Returns the raw JSON value of [timeout].
             *
             * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("Timeout") @ExcludeMissing fun _timeout(): JsonField<Long> = timeout

            /**
             * Returns the raw JSON value of [to].
             *
             * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("To") @ExcludeMissing fun _to(): JsonField<String> = to

            /**
             * Returns the raw JSON value of [trim].
             *
             * Unlike [trim], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("Trim") @ExcludeMissing fun _trim(): JsonField<Trim> = trim

            /**
             * Returns the raw JSON value of [urlMethod].
             *
             * Unlike [urlMethod], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("UrlMethod")
            @ExcludeMissing
            fun _urlMethod(): JsonField<UrlMethod> = urlMethod

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
                 * Returns a mutable builder for constructing an instance of [WithUrl].
                 *
                 * The following fields are required:
                 * ```java
                 * .url()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [WithUrl]. */
            class Builder internal constructor() {

                private var url: JsonField<String>? = null
                private var applicationSid: JsonField<String> = JsonMissing.of()
                private var asyncAmd: JsonField<Boolean> = JsonMissing.of()
                private var asyncAmdStatusCallback: JsonField<String> = JsonMissing.of()
                private var asyncAmdStatusCallbackMethod: JsonField<AsyncAmdStatusCallbackMethod> =
                    JsonMissing.of()
                private var callerId: JsonField<String> = JsonMissing.of()
                private var cancelPlaybackOnDetectMessageEnd: JsonField<Boolean> = JsonMissing.of()
                private var cancelPlaybackOnMachineDetection: JsonField<Boolean> = JsonMissing.of()
                private var customHeaders: JsonField<MutableList<CustomHeader>>? = null
                private var detectionMode: JsonField<DetectionMode> = JsonMissing.of()
                private var fallbackUrl: JsonField<String> = JsonMissing.of()
                private var from: JsonField<String> = JsonMissing.of()
                private var machineDetection: JsonField<MachineDetection> = JsonMissing.of()
                private var machineDetectionSilenceTimeout: JsonField<Long> = JsonMissing.of()
                private var machineDetectionSpeechEndThreshold: JsonField<Long> = JsonMissing.of()
                private var machineDetectionSpeechThreshold: JsonField<Long> = JsonMissing.of()
                private var machineDetectionTimeout: JsonField<Long> = JsonMissing.of()
                private var mediaEncryption: JsonField<MediaEncryption> = JsonMissing.of()
                private var preferredCodecs: JsonField<String> = JsonMissing.of()
                private var record: JsonField<Boolean> = JsonMissing.of()
                private var recordingChannels: JsonField<RecordingChannels> = JsonMissing.of()
                private var recordingStatusCallback: JsonField<String> = JsonMissing.of()
                private var recordingStatusCallbackEvent: JsonField<String> = JsonMissing.of()
                private var recordingStatusCallbackMethod:
                    JsonField<RecordingStatusCallbackMethod> =
                    JsonMissing.of()
                private var recordingTimeout: JsonField<Long> = JsonMissing.of()
                private var recordingTrack: JsonField<RecordingTrack> = JsonMissing.of()
                private var sendRecordingUrl: JsonField<Boolean> = JsonMissing.of()
                private var sipAuthPassword: JsonField<String> = JsonMissing.of()
                private var sipAuthUsername: JsonField<String> = JsonMissing.of()
                private var sipRegion: JsonField<SipRegion> = JsonMissing.of()
                private var statusCallback: JsonField<String> = JsonMissing.of()
                private var statusCallbackEvent: JsonField<StatusCallbackEvent> = JsonMissing.of()
                private var statusCallbackMethod: JsonField<StatusCallbackMethod> = JsonMissing.of()
                private var superviseCallSid: JsonField<String> = JsonMissing.of()
                private var supervisingRole: JsonField<SupervisingRole> = JsonMissing.of()
                private var texml: JsonValue = JsonMissing.of()
                private var timeLimit: JsonField<Long> = JsonMissing.of()
                private var timeout: JsonField<Long> = JsonMissing.of()
                private var to: JsonField<String> = JsonMissing.of()
                private var trim: JsonField<Trim> = JsonMissing.of()
                private var urlMethod: JsonField<UrlMethod> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(withUrl: WithUrl) = apply {
                    url = withUrl.url
                    applicationSid = withUrl.applicationSid
                    asyncAmd = withUrl.asyncAmd
                    asyncAmdStatusCallback = withUrl.asyncAmdStatusCallback
                    asyncAmdStatusCallbackMethod = withUrl.asyncAmdStatusCallbackMethod
                    callerId = withUrl.callerId
                    cancelPlaybackOnDetectMessageEnd = withUrl.cancelPlaybackOnDetectMessageEnd
                    cancelPlaybackOnMachineDetection = withUrl.cancelPlaybackOnMachineDetection
                    customHeaders = withUrl.customHeaders.map { it.toMutableList() }
                    detectionMode = withUrl.detectionMode
                    fallbackUrl = withUrl.fallbackUrl
                    from = withUrl.from
                    machineDetection = withUrl.machineDetection
                    machineDetectionSilenceTimeout = withUrl.machineDetectionSilenceTimeout
                    machineDetectionSpeechEndThreshold = withUrl.machineDetectionSpeechEndThreshold
                    machineDetectionSpeechThreshold = withUrl.machineDetectionSpeechThreshold
                    machineDetectionTimeout = withUrl.machineDetectionTimeout
                    mediaEncryption = withUrl.mediaEncryption
                    preferredCodecs = withUrl.preferredCodecs
                    record = withUrl.record
                    recordingChannels = withUrl.recordingChannels
                    recordingStatusCallback = withUrl.recordingStatusCallback
                    recordingStatusCallbackEvent = withUrl.recordingStatusCallbackEvent
                    recordingStatusCallbackMethod = withUrl.recordingStatusCallbackMethod
                    recordingTimeout = withUrl.recordingTimeout
                    recordingTrack = withUrl.recordingTrack
                    sendRecordingUrl = withUrl.sendRecordingUrl
                    sipAuthPassword = withUrl.sipAuthPassword
                    sipAuthUsername = withUrl.sipAuthUsername
                    sipRegion = withUrl.sipRegion
                    statusCallback = withUrl.statusCallback
                    statusCallbackEvent = withUrl.statusCallbackEvent
                    statusCallbackMethod = withUrl.statusCallbackMethod
                    superviseCallSid = withUrl.superviseCallSid
                    supervisingRole = withUrl.supervisingRole
                    texml = withUrl.texml
                    timeLimit = withUrl.timeLimit
                    timeout = withUrl.timeout
                    to = withUrl.to
                    trim = withUrl.trim
                    urlMethod = withUrl.urlMethod
                    additionalProperties = withUrl.additionalProperties.toMutableMap()
                }

                /** The URL from which Telnyx will retrieve the TeXML call instructions. */
                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

                /** The ID of the TeXML Application. */
                fun applicationSid(applicationSid: String) =
                    applicationSid(JsonField.of(applicationSid))

                /**
                 * Sets [Builder.applicationSid] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.applicationSid] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun applicationSid(applicationSid: JsonField<String>) = apply {
                    this.applicationSid = applicationSid
                }

                /**
                 * Select whether to perform answering machine detection in the background. By
                 * default execution is blocked until Answering Machine Detection is completed.
                 */
                fun asyncAmd(asyncAmd: Boolean) = asyncAmd(JsonField.of(asyncAmd))

                /**
                 * Sets [Builder.asyncAmd] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.asyncAmd] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun asyncAmd(asyncAmd: JsonField<Boolean>) = apply { this.asyncAmd = asyncAmd }

                /** URL destination for Telnyx to send AMD callback events to for the call. */
                fun asyncAmdStatusCallback(asyncAmdStatusCallback: String) =
                    asyncAmdStatusCallback(JsonField.of(asyncAmdStatusCallback))

                /**
                 * Sets [Builder.asyncAmdStatusCallback] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.asyncAmdStatusCallback] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun asyncAmdStatusCallback(asyncAmdStatusCallback: JsonField<String>) = apply {
                    this.asyncAmdStatusCallback = asyncAmdStatusCallback
                }

                /**
                 * HTTP request type used for `AsyncAmdStatusCallback`. The default value is
                 * inherited from TeXML Application setting.
                 */
                fun asyncAmdStatusCallbackMethod(
                    asyncAmdStatusCallbackMethod: AsyncAmdStatusCallbackMethod
                ) = asyncAmdStatusCallbackMethod(JsonField.of(asyncAmdStatusCallbackMethod))

                /**
                 * Sets [Builder.asyncAmdStatusCallbackMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.asyncAmdStatusCallbackMethod] with a well-typed
                 * [AsyncAmdStatusCallbackMethod] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun asyncAmdStatusCallbackMethod(
                    asyncAmdStatusCallbackMethod: JsonField<AsyncAmdStatusCallbackMethod>
                ) = apply { this.asyncAmdStatusCallbackMethod = asyncAmdStatusCallbackMethod }

                /**
                 * To be used as the caller id name (SIP From Display Name) presented to the
                 * destination (`To` number). The string should have a maximum of 128 characters,
                 * containing only letters, numbers, spaces, and `-_~!.+` special characters. If
                 * ommited, the display name will be the same as the number in the `From` field.
                 */
                fun callerId(callerId: String) = callerId(JsonField.of(callerId))

                /**
                 * Sets [Builder.callerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.callerId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun callerId(callerId: JsonField<String>) = apply { this.callerId = callerId }

                /**
                 * Whether to cancel ongoing playback on `greeting ended` detection. Defaults to
                 * `true`.
                 */
                fun cancelPlaybackOnDetectMessageEnd(cancelPlaybackOnDetectMessageEnd: Boolean) =
                    cancelPlaybackOnDetectMessageEnd(JsonField.of(cancelPlaybackOnDetectMessageEnd))

                /**
                 * Sets [Builder.cancelPlaybackOnDetectMessageEnd] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cancelPlaybackOnDetectMessageEnd] with a
                 * well-typed [Boolean] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun cancelPlaybackOnDetectMessageEnd(
                    cancelPlaybackOnDetectMessageEnd: JsonField<Boolean>
                ) = apply {
                    this.cancelPlaybackOnDetectMessageEnd = cancelPlaybackOnDetectMessageEnd
                }

                /**
                 * Whether to cancel ongoing playback on `machine` detection. Defaults to `true`.
                 */
                fun cancelPlaybackOnMachineDetection(cancelPlaybackOnMachineDetection: Boolean) =
                    cancelPlaybackOnMachineDetection(JsonField.of(cancelPlaybackOnMachineDetection))

                /**
                 * Sets [Builder.cancelPlaybackOnMachineDetection] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cancelPlaybackOnMachineDetection] with a
                 * well-typed [Boolean] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun cancelPlaybackOnMachineDetection(
                    cancelPlaybackOnMachineDetection: JsonField<Boolean>
                ) = apply {
                    this.cancelPlaybackOnMachineDetection = cancelPlaybackOnMachineDetection
                }

                /**
                 * Custom HTTP headers to be sent with the call. Each header should be an object
                 * with 'name' and 'value' properties.
                 */
                fun customHeaders(customHeaders: List<CustomHeader>) =
                    customHeaders(JsonField.of(customHeaders))

                /**
                 * Sets [Builder.customHeaders] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customHeaders] with a well-typed
                 * `List<CustomHeader>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun customHeaders(customHeaders: JsonField<List<CustomHeader>>) = apply {
                    this.customHeaders = customHeaders.map { it.toMutableList() }
                }

                /**
                 * Adds a single [CustomHeader] to [customHeaders].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCustomHeader(customHeader: CustomHeader) = apply {
                    customHeaders =
                        (customHeaders ?: JsonField.of(mutableListOf())).also {
                            checkKnown("customHeaders", it).add(customHeader)
                        }
                }

                /** Allows you to chose between Premium and Standard detections. */
                fun detectionMode(detectionMode: DetectionMode) =
                    detectionMode(JsonField.of(detectionMode))

                /**
                 * Sets [Builder.detectionMode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.detectionMode] with a well-typed [DetectionMode]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun detectionMode(detectionMode: JsonField<DetectionMode>) = apply {
                    this.detectionMode = detectionMode
                }

                /**
                 * A failover URL for which Telnyx will retrieve the TeXML call instructions if the
                 * `Url` is not responding.
                 */
                fun fallbackUrl(fallbackUrl: String) = fallbackUrl(JsonField.of(fallbackUrl))

                /**
                 * Sets [Builder.fallbackUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fallbackUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fallbackUrl(fallbackUrl: JsonField<String>) = apply {
                    this.fallbackUrl = fallbackUrl
                }

                /**
                 * The phone number of the party that initiated the call. Phone numbers are
                 * formatted with a `+` and country code.
                 */
                fun from(from: String) = from(JsonField.of(from))

                /**
                 * Sets [Builder.from] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.from] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun from(from: JsonField<String>) = apply { this.from = from }

                /** Enables Answering Machine Detection. */
                fun machineDetection(machineDetection: MachineDetection) =
                    machineDetection(JsonField.of(machineDetection))

                /**
                 * Sets [Builder.machineDetection] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.machineDetection] with a well-typed
                 * [MachineDetection] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun machineDetection(machineDetection: JsonField<MachineDetection>) = apply {
                    this.machineDetection = machineDetection
                }

                /**
                 * If initial silence duration is greater than this value, consider it a machine.
                 * Ignored when `premium` detection is used.
                 */
                fun machineDetectionSilenceTimeout(machineDetectionSilenceTimeout: Long) =
                    machineDetectionSilenceTimeout(JsonField.of(machineDetectionSilenceTimeout))

                /**
                 * Sets [Builder.machineDetectionSilenceTimeout] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.machineDetectionSilenceTimeout] with a
                 * well-typed [Long] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun machineDetectionSilenceTimeout(
                    machineDetectionSilenceTimeout: JsonField<Long>
                ) = apply { this.machineDetectionSilenceTimeout = machineDetectionSilenceTimeout }

                /**
                 * Silence duration threshold after a greeting message or voice for it be considered
                 * human. Ignored when `premium` detection is used.
                 */
                fun machineDetectionSpeechEndThreshold(machineDetectionSpeechEndThreshold: Long) =
                    machineDetectionSpeechEndThreshold(
                        JsonField.of(machineDetectionSpeechEndThreshold)
                    )

                /**
                 * Sets [Builder.machineDetectionSpeechEndThreshold] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.machineDetectionSpeechEndThreshold] with a
                 * well-typed [Long] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun machineDetectionSpeechEndThreshold(
                    machineDetectionSpeechEndThreshold: JsonField<Long>
                ) = apply {
                    this.machineDetectionSpeechEndThreshold = machineDetectionSpeechEndThreshold
                }

                /**
                 * Maximum threshold of a human greeting. If greeting longer than this value,
                 * considered machine. Ignored when `premium` detection is used.
                 */
                fun machineDetectionSpeechThreshold(machineDetectionSpeechThreshold: Long) =
                    machineDetectionSpeechThreshold(JsonField.of(machineDetectionSpeechThreshold))

                /**
                 * Sets [Builder.machineDetectionSpeechThreshold] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.machineDetectionSpeechThreshold] with a
                 * well-typed [Long] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun machineDetectionSpeechThreshold(
                    machineDetectionSpeechThreshold: JsonField<Long>
                ) = apply { this.machineDetectionSpeechThreshold = machineDetectionSpeechThreshold }

                /** Maximum timeout threshold in milliseconds for overall detection. */
                fun machineDetectionTimeout(machineDetectionTimeout: Long) =
                    machineDetectionTimeout(JsonField.of(machineDetectionTimeout))

                /**
                 * Sets [Builder.machineDetectionTimeout] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.machineDetectionTimeout] with a well-typed
                 * [Long] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun machineDetectionTimeout(machineDetectionTimeout: JsonField<Long>) = apply {
                    this.machineDetectionTimeout = machineDetectionTimeout
                }

                /**
                 * Defines whether media should be encrypted on the call. When set to `SRTP`, the
                 * call will use Secure Real-time Transport Protocol for media encryption. When set
                 * to `DTLS`, the call will use DTLS for media encryption. Only supported for SIP
                 * destinations.
                 */
                fun mediaEncryption(mediaEncryption: MediaEncryption) =
                    mediaEncryption(JsonField.of(mediaEncryption))

                /**
                 * Sets [Builder.mediaEncryption] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mediaEncryption] with a well-typed
                 * [MediaEncryption] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun mediaEncryption(mediaEncryption: JsonField<MediaEncryption>) = apply {
                    this.mediaEncryption = mediaEncryption
                }

                /** The list of comma-separated codecs to be offered on a call. */
                fun preferredCodecs(preferredCodecs: String) =
                    preferredCodecs(JsonField.of(preferredCodecs))

                /**
                 * Sets [Builder.preferredCodecs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.preferredCodecs] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun preferredCodecs(preferredCodecs: JsonField<String>) = apply {
                    this.preferredCodecs = preferredCodecs
                }

                /** Whether to record the entire participant's call leg. Defaults to `false`. */
                fun record(record: Boolean) = record(JsonField.of(record))

                /**
                 * Sets [Builder.record] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.record] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun record(record: JsonField<Boolean>) = apply { this.record = record }

                /** The number of channels in the final recording. Defaults to `mono`. */
                fun recordingChannels(recordingChannels: RecordingChannels) =
                    recordingChannels(JsonField.of(recordingChannels))

                /**
                 * Sets [Builder.recordingChannels] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordingChannels] with a well-typed
                 * [RecordingChannels] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun recordingChannels(recordingChannels: JsonField<RecordingChannels>) = apply {
                    this.recordingChannels = recordingChannels
                }

                /** The URL the recording callbacks will be sent to. */
                fun recordingStatusCallback(recordingStatusCallback: String) =
                    recordingStatusCallback(JsonField.of(recordingStatusCallback))

                /**
                 * Sets [Builder.recordingStatusCallback] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordingStatusCallback] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun recordingStatusCallback(recordingStatusCallback: JsonField<String>) = apply {
                    this.recordingStatusCallback = recordingStatusCallback
                }

                /**
                 * The changes to the recording's state that should generate a call to
                 * `RecoridngStatusCallback`. Can be: `in-progress`, `completed` and `absent`.
                 * Separate multiple values with a space. Defaults to `completed`.
                 */
                fun recordingStatusCallbackEvent(recordingStatusCallbackEvent: String) =
                    recordingStatusCallbackEvent(JsonField.of(recordingStatusCallbackEvent))

                /**
                 * Sets [Builder.recordingStatusCallbackEvent] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordingStatusCallbackEvent] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun recordingStatusCallbackEvent(recordingStatusCallbackEvent: JsonField<String>) =
                    apply {
                        this.recordingStatusCallbackEvent = recordingStatusCallbackEvent
                    }

                /** HTTP request type used for `RecordingStatusCallback`. Defaults to `POST`. */
                fun recordingStatusCallbackMethod(
                    recordingStatusCallbackMethod: RecordingStatusCallbackMethod
                ) = recordingStatusCallbackMethod(JsonField.of(recordingStatusCallbackMethod))

                /**
                 * Sets [Builder.recordingStatusCallbackMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordingStatusCallbackMethod] with a well-typed
                 * [RecordingStatusCallbackMethod] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun recordingStatusCallbackMethod(
                    recordingStatusCallbackMethod: JsonField<RecordingStatusCallbackMethod>
                ) = apply { this.recordingStatusCallbackMethod = recordingStatusCallbackMethod }

                /**
                 * The number of seconds that Telnyx will wait for the recording to be stopped if
                 * silence is detected. The timer only starts when the speech is detected. Please
                 * note that the transcription is used to detect silence and the related charge will
                 * be applied. The minimum value is 0. The default value is 0 (infinite)
                 */
                fun recordingTimeout(recordingTimeout: Long) =
                    recordingTimeout(JsonField.of(recordingTimeout))

                /**
                 * Sets [Builder.recordingTimeout] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordingTimeout] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun recordingTimeout(recordingTimeout: JsonField<Long>) = apply {
                    this.recordingTimeout = recordingTimeout
                }

                /** The audio track to record for the call. The default is `both`. */
                fun recordingTrack(recordingTrack: RecordingTrack) =
                    recordingTrack(JsonField.of(recordingTrack))

                /**
                 * Sets [Builder.recordingTrack] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordingTrack] with a well-typed
                 * [RecordingTrack] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun recordingTrack(recordingTrack: JsonField<RecordingTrack>) = apply {
                    this.recordingTrack = recordingTrack
                }

                /** Whether to send RecordingUrl in webhooks. */
                fun sendRecordingUrl(sendRecordingUrl: Boolean) =
                    sendRecordingUrl(JsonField.of(sendRecordingUrl))

                /**
                 * Sets [Builder.sendRecordingUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sendRecordingUrl] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun sendRecordingUrl(sendRecordingUrl: JsonField<Boolean>) = apply {
                    this.sendRecordingUrl = sendRecordingUrl
                }

                /** The password to use for SIP authentication. */
                fun sipAuthPassword(sipAuthPassword: String) =
                    sipAuthPassword(JsonField.of(sipAuthPassword))

                /**
                 * Sets [Builder.sipAuthPassword] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sipAuthPassword] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun sipAuthPassword(sipAuthPassword: JsonField<String>) = apply {
                    this.sipAuthPassword = sipAuthPassword
                }

                /** The username to use for SIP authentication. */
                fun sipAuthUsername(sipAuthUsername: String) =
                    sipAuthUsername(JsonField.of(sipAuthUsername))

                /**
                 * Sets [Builder.sipAuthUsername] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sipAuthUsername] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun sipAuthUsername(sipAuthUsername: JsonField<String>) = apply {
                    this.sipAuthUsername = sipAuthUsername
                }

                /** Defines the SIP region to be used for the call. */
                fun sipRegion(sipRegion: SipRegion) = sipRegion(JsonField.of(sipRegion))

                /**
                 * Sets [Builder.sipRegion] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sipRegion] with a well-typed [SipRegion] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sipRegion(sipRegion: JsonField<SipRegion>) = apply {
                    this.sipRegion = sipRegion
                }

                /** URL destination for Telnyx to send status callback events to for the call. */
                fun statusCallback(statusCallback: String) =
                    statusCallback(JsonField.of(statusCallback))

                /**
                 * Sets [Builder.statusCallback] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.statusCallback] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun statusCallback(statusCallback: JsonField<String>) = apply {
                    this.statusCallback = statusCallback
                }

                /**
                 * The call events for which Telnyx should send a webhook. Multiple events can be
                 * defined when separated by a space.
                 */
                fun statusCallbackEvent(statusCallbackEvent: StatusCallbackEvent) =
                    statusCallbackEvent(JsonField.of(statusCallbackEvent))

                /**
                 * Sets [Builder.statusCallbackEvent] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.statusCallbackEvent] with a well-typed
                 * [StatusCallbackEvent] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun statusCallbackEvent(statusCallbackEvent: JsonField<StatusCallbackEvent>) =
                    apply {
                        this.statusCallbackEvent = statusCallbackEvent
                    }

                /** HTTP request type used for `StatusCallback`. */
                fun statusCallbackMethod(statusCallbackMethod: StatusCallbackMethod) =
                    statusCallbackMethod(JsonField.of(statusCallbackMethod))

                /**
                 * Sets [Builder.statusCallbackMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.statusCallbackMethod] with a well-typed
                 * [StatusCallbackMethod] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun statusCallbackMethod(statusCallbackMethod: JsonField<StatusCallbackMethod>) =
                    apply {
                        this.statusCallbackMethod = statusCallbackMethod
                    }

                /**
                 * The call control ID of the existing call to supervise. When provided, the created
                 * leg will be added to the specified call in supervising mode. Status callbacks and
                 * action callbacks will NOT be sent for the supervising leg.
                 */
                fun superviseCallSid(superviseCallSid: String) =
                    superviseCallSid(JsonField.of(superviseCallSid))

                /**
                 * Sets [Builder.superviseCallSid] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.superviseCallSid] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun superviseCallSid(superviseCallSid: JsonField<String>) = apply {
                    this.superviseCallSid = superviseCallSid
                }

                /**
                 * The supervising role for the new leg. Determines the audio behavior: barge (hear
                 * both sides), whisper (only hear supervisor), monitor (hear both sides but
                 * supervisor muted). Default: barge
                 */
                fun supervisingRole(supervisingRole: SupervisingRole) =
                    supervisingRole(JsonField.of(supervisingRole))

                /**
                 * Sets [Builder.supervisingRole] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.supervisingRole] with a well-typed
                 * [SupervisingRole] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun supervisingRole(supervisingRole: JsonField<SupervisingRole>) = apply {
                    this.supervisingRole = supervisingRole
                }

                fun texml(texml: JsonValue) = apply { this.texml = texml }

                /**
                 * The maximum duration of the call in seconds. The minimum value is 30 and the
                 * maximum value is 14400 (4 hours). Default is 14400 seconds.
                 */
                fun timeLimit(timeLimit: Long) = timeLimit(JsonField.of(timeLimit))

                /**
                 * Sets [Builder.timeLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timeLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun timeLimit(timeLimit: JsonField<Long>) = apply { this.timeLimit = timeLimit }

                /**
                 * The number of seconds to wait for the called party to answer the call before the
                 * call is canceled. The minimum value is 5 and the maximum value is 120. Default is
                 * 30 seconds.
                 */
                fun timeout(timeout: Long) = timeout(JsonField.of(timeout))

                /**
                 * Sets [Builder.timeout] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timeout] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun timeout(timeout: JsonField<Long>) = apply { this.timeout = timeout }

                /**
                 * The phone number of the called party. Phone numbers are formatted with a `+` and
                 * country code.
                 */
                fun to(to: String) = to(JsonField.of(to))

                /**
                 * Sets [Builder.to] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.to] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun to(to: JsonField<String>) = apply { this.to = to }

                /**
                 * Whether to trim any leading and trailing silence from the recording. Defaults to
                 * `trim-silence`.
                 */
                fun trim(trim: Trim) = trim(JsonField.of(trim))

                /**
                 * Sets [Builder.trim] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.trim] with a well-typed [Trim] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun trim(trim: JsonField<Trim>) = apply { this.trim = trim }

                /**
                 * HTTP request type used for `Url`. The default value is inherited from TeXML
                 * Application setting.
                 */
                fun urlMethod(urlMethod: UrlMethod) = urlMethod(JsonField.of(urlMethod))

                /**
                 * Sets [Builder.urlMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.urlMethod] with a well-typed [UrlMethod] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun urlMethod(urlMethod: JsonField<UrlMethod>) = apply {
                    this.urlMethod = urlMethod
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
                 * Returns an immutable instance of [WithUrl].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .url()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): WithUrl =
                    WithUrl(
                        checkRequired("url", url),
                        applicationSid,
                        asyncAmd,
                        asyncAmdStatusCallback,
                        asyncAmdStatusCallbackMethod,
                        callerId,
                        cancelPlaybackOnDetectMessageEnd,
                        cancelPlaybackOnMachineDetection,
                        (customHeaders ?: JsonMissing.of()).map { it.toImmutable() },
                        detectionMode,
                        fallbackUrl,
                        from,
                        machineDetection,
                        machineDetectionSilenceTimeout,
                        machineDetectionSpeechEndThreshold,
                        machineDetectionSpeechThreshold,
                        machineDetectionTimeout,
                        mediaEncryption,
                        preferredCodecs,
                        record,
                        recordingChannels,
                        recordingStatusCallback,
                        recordingStatusCallbackEvent,
                        recordingStatusCallbackMethod,
                        recordingTimeout,
                        recordingTrack,
                        sendRecordingUrl,
                        sipAuthPassword,
                        sipAuthUsername,
                        sipRegion,
                        statusCallback,
                        statusCallbackEvent,
                        statusCallbackMethod,
                        superviseCallSid,
                        supervisingRole,
                        texml,
                        timeLimit,
                        timeout,
                        to,
                        trim,
                        urlMethod,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): WithUrl = apply {
                if (validated) {
                    return@apply
                }

                url()
                applicationSid()
                asyncAmd()
                asyncAmdStatusCallback()
                asyncAmdStatusCallbackMethod().ifPresent { it.validate() }
                callerId()
                cancelPlaybackOnDetectMessageEnd()
                cancelPlaybackOnMachineDetection()
                customHeaders().ifPresent { it.forEach { it.validate() } }
                detectionMode().ifPresent { it.validate() }
                fallbackUrl()
                from()
                machineDetection().ifPresent { it.validate() }
                machineDetectionSilenceTimeout()
                machineDetectionSpeechEndThreshold()
                machineDetectionSpeechThreshold()
                machineDetectionTimeout()
                mediaEncryption().ifPresent { it.validate() }
                preferredCodecs()
                record()
                recordingChannels().ifPresent { it.validate() }
                recordingStatusCallback()
                recordingStatusCallbackEvent()
                recordingStatusCallbackMethod().ifPresent { it.validate() }
                recordingTimeout()
                recordingTrack().ifPresent { it.validate() }
                sendRecordingUrl()
                sipAuthPassword()
                sipAuthUsername()
                sipRegion().ifPresent { it.validate() }
                statusCallback()
                statusCallbackEvent().ifPresent { it.validate() }
                statusCallbackMethod().ifPresent { it.validate() }
                superviseCallSid()
                supervisingRole().ifPresent { it.validate() }
                timeLimit()
                timeout()
                to()
                trim().ifPresent { it.validate() }
                urlMethod().ifPresent { it.validate() }
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
                (if (url.asKnown().isPresent) 1 else 0) +
                    (if (applicationSid.asKnown().isPresent) 1 else 0) +
                    (if (asyncAmd.asKnown().isPresent) 1 else 0) +
                    (if (asyncAmdStatusCallback.asKnown().isPresent) 1 else 0) +
                    (asyncAmdStatusCallbackMethod.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (callerId.asKnown().isPresent) 1 else 0) +
                    (if (cancelPlaybackOnDetectMessageEnd.asKnown().isPresent) 1 else 0) +
                    (if (cancelPlaybackOnMachineDetection.asKnown().isPresent) 1 else 0) +
                    (customHeaders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (detectionMode.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (fallbackUrl.asKnown().isPresent) 1 else 0) +
                    (if (from.asKnown().isPresent) 1 else 0) +
                    (machineDetection.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (machineDetectionSilenceTimeout.asKnown().isPresent) 1 else 0) +
                    (if (machineDetectionSpeechEndThreshold.asKnown().isPresent) 1 else 0) +
                    (if (machineDetectionSpeechThreshold.asKnown().isPresent) 1 else 0) +
                    (if (machineDetectionTimeout.asKnown().isPresent) 1 else 0) +
                    (mediaEncryption.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (preferredCodecs.asKnown().isPresent) 1 else 0) +
                    (if (record.asKnown().isPresent) 1 else 0) +
                    (recordingChannels.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (recordingStatusCallback.asKnown().isPresent) 1 else 0) +
                    (if (recordingStatusCallbackEvent.asKnown().isPresent) 1 else 0) +
                    (recordingStatusCallbackMethod.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (recordingTimeout.asKnown().isPresent) 1 else 0) +
                    (recordingTrack.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (sendRecordingUrl.asKnown().isPresent) 1 else 0) +
                    (if (sipAuthPassword.asKnown().isPresent) 1 else 0) +
                    (if (sipAuthUsername.asKnown().isPresent) 1 else 0) +
                    (sipRegion.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (statusCallback.asKnown().isPresent) 1 else 0) +
                    (statusCallbackEvent.asKnown().getOrNull()?.validity() ?: 0) +
                    (statusCallbackMethod.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (superviseCallSid.asKnown().isPresent) 1 else 0) +
                    (supervisingRole.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (timeLimit.asKnown().isPresent) 1 else 0) +
                    (if (timeout.asKnown().isPresent) 1 else 0) +
                    (if (to.asKnown().isPresent) 1 else 0) +
                    (trim.asKnown().getOrNull()?.validity() ?: 0) +
                    (urlMethod.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * HTTP request type used for `AsyncAmdStatusCallback`. The default value is inherited
             * from TeXML Application setting.
             */
            class AsyncAmdStatusCallbackMethod
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val GET = of("GET")

                    @JvmField val POST = of("POST")

                    @JvmStatic
                    fun of(value: String) = AsyncAmdStatusCallbackMethod(JsonField.of(value))
                }

                /** An enum containing [AsyncAmdStatusCallbackMethod]'s known values. */
                enum class Known {
                    GET,
                    POST,
                }

                /**
                 * An enum containing [AsyncAmdStatusCallbackMethod]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [AsyncAmdStatusCallbackMethod] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    GET,
                    POST,
                    /**
                     * An enum member indicating that [AsyncAmdStatusCallbackMethod] was
                     * instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        GET -> Value.GET
                        POST -> Value.POST
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        GET -> Known.GET
                        POST -> Known.POST
                        else ->
                            throw TelnyxInvalidDataException(
                                "Unknown AsyncAmdStatusCallbackMethod: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): AsyncAmdStatusCallbackMethod = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AsyncAmdStatusCallbackMethod && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class CustomHeader
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val name: JsonField<String>,
                private val value: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<String> = JsonMissing.of(),
                ) : this(name, value, mutableMapOf())

                /**
                 * The name of the custom header
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * The value of the custom header
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun value(): String = value.getRequired("value")

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                     * Returns a mutable builder for constructing an instance of [CustomHeader].
                     *
                     * The following fields are required:
                     * ```java
                     * .name()
                     * .value()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CustomHeader]. */
                class Builder internal constructor() {

                    private var name: JsonField<String>? = null
                    private var value: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(customHeader: CustomHeader) = apply {
                        name = customHeader.name
                        value = customHeader.value
                        additionalProperties = customHeader.additionalProperties.toMutableMap()
                    }

                    /** The name of the custom header */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /** The value of the custom header */
                    fun value(value: String) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<String>) = apply { this.value = value }

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
                     * Returns an immutable instance of [CustomHeader].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .name()
                     * .value()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): CustomHeader =
                        CustomHeader(
                            checkRequired("name", name),
                            checkRequired("value", value),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): CustomHeader = apply {
                    if (validated) {
                        return@apply
                    }

                    name()
                    value()
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
                    (if (name.asKnown().isPresent) 1 else 0) +
                        (if (value.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CustomHeader &&
                        name == other.name &&
                        value == other.value &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(name, value, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CustomHeader{name=$name, value=$value, additionalProperties=$additionalProperties}"
            }

            /** Allows you to chose between Premium and Standard detections. */
            class DetectionMode
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PREMIUM = of("Premium")

                    @JvmField val REGULAR = of("Regular")

                    @JvmStatic fun of(value: String) = DetectionMode(JsonField.of(value))
                }

                /** An enum containing [DetectionMode]'s known values. */
                enum class Known {
                    PREMIUM,
                    REGULAR,
                }

                /**
                 * An enum containing [DetectionMode]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [DetectionMode] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PREMIUM,
                    REGULAR,
                    /**
                     * An enum member indicating that [DetectionMode] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PREMIUM -> Value.PREMIUM
                        REGULAR -> Value.REGULAR
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        PREMIUM -> Known.PREMIUM
                        REGULAR -> Known.REGULAR
                        else -> throw TelnyxInvalidDataException("Unknown DetectionMode: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): DetectionMode = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is DetectionMode && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Enables Answering Machine Detection. */
            class MachineDetection
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ENABLE = of("Enable")

                    @JvmField val DISABLE = of("Disable")

                    @JvmField val DETECT_MESSAGE_END = of("DetectMessageEnd")

                    @JvmStatic fun of(value: String) = MachineDetection(JsonField.of(value))
                }

                /** An enum containing [MachineDetection]'s known values. */
                enum class Known {
                    ENABLE,
                    DISABLE,
                    DETECT_MESSAGE_END,
                }

                /**
                 * An enum containing [MachineDetection]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [MachineDetection] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ENABLE,
                    DISABLE,
                    DETECT_MESSAGE_END,
                    /**
                     * An enum member indicating that [MachineDetection] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ENABLE -> Value.ENABLE
                        DISABLE -> Value.DISABLE
                        DETECT_MESSAGE_END -> Value.DETECT_MESSAGE_END
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ENABLE -> Known.ENABLE
                        DISABLE -> Known.DISABLE
                        DETECT_MESSAGE_END -> Known.DETECT_MESSAGE_END
                        else -> throw TelnyxInvalidDataException("Unknown MachineDetection: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): MachineDetection = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is MachineDetection && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Defines whether media should be encrypted on the call. When set to `SRTP`, the call
             * will use Secure Real-time Transport Protocol for media encryption. When set to
             * `DTLS`, the call will use DTLS for media encryption. Only supported for SIP
             * destinations.
             */
            class MediaEncryption
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val DISABLED = of("disabled")

                    @JvmField val SRTP = of("SRTP")

                    @JvmField val DTLS = of("DTLS")

                    @JvmStatic fun of(value: String) = MediaEncryption(JsonField.of(value))
                }

                /** An enum containing [MediaEncryption]'s known values. */
                enum class Known {
                    DISABLED,
                    SRTP,
                    DTLS,
                }

                /**
                 * An enum containing [MediaEncryption]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [MediaEncryption] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DISABLED,
                    SRTP,
                    DTLS,
                    /**
                     * An enum member indicating that [MediaEncryption] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        DISABLED -> Value.DISABLED
                        SRTP -> Value.SRTP
                        DTLS -> Value.DTLS
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        DISABLED -> Known.DISABLED
                        SRTP -> Known.SRTP
                        DTLS -> Known.DTLS
                        else -> throw TelnyxInvalidDataException("Unknown MediaEncryption: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): MediaEncryption = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is MediaEncryption && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** The number of channels in the final recording. Defaults to `mono`. */
            class RecordingChannels
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val MONO = of("mono")

                    @JvmField val DUAL = of("dual")

                    @JvmStatic fun of(value: String) = RecordingChannels(JsonField.of(value))
                }

                /** An enum containing [RecordingChannels]'s known values. */
                enum class Known {
                    MONO,
                    DUAL,
                }

                /**
                 * An enum containing [RecordingChannels]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [RecordingChannels] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MONO,
                    DUAL,
                    /**
                     * An enum member indicating that [RecordingChannels] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        MONO -> Value.MONO
                        DUAL -> Value.DUAL
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        MONO -> Known.MONO
                        DUAL -> Known.DUAL
                        else ->
                            throw TelnyxInvalidDataException("Unknown RecordingChannels: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): RecordingChannels = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RecordingChannels && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** HTTP request type used for `RecordingStatusCallback`. Defaults to `POST`. */
            class RecordingStatusCallbackMethod
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val GET = of("GET")

                    @JvmField val POST = of("POST")

                    @JvmStatic
                    fun of(value: String) = RecordingStatusCallbackMethod(JsonField.of(value))
                }

                /** An enum containing [RecordingStatusCallbackMethod]'s known values. */
                enum class Known {
                    GET,
                    POST,
                }

                /**
                 * An enum containing [RecordingStatusCallbackMethod]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [RecordingStatusCallbackMethod] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    GET,
                    POST,
                    /**
                     * An enum member indicating that [RecordingStatusCallbackMethod] was
                     * instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        GET -> Value.GET
                        POST -> Value.POST
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        GET -> Known.GET
                        POST -> Known.POST
                        else ->
                            throw TelnyxInvalidDataException(
                                "Unknown RecordingStatusCallbackMethod: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): RecordingStatusCallbackMethod = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RecordingStatusCallbackMethod && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** The audio track to record for the call. The default is `both`. */
            class RecordingTrack
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val INBOUND = of("inbound")

                    @JvmField val OUTBOUND = of("outbound")

                    @JvmField val BOTH = of("both")

                    @JvmStatic fun of(value: String) = RecordingTrack(JsonField.of(value))
                }

                /** An enum containing [RecordingTrack]'s known values. */
                enum class Known {
                    INBOUND,
                    OUTBOUND,
                    BOTH,
                }

                /**
                 * An enum containing [RecordingTrack]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [RecordingTrack] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INBOUND,
                    OUTBOUND,
                    BOTH,
                    /**
                     * An enum member indicating that [RecordingTrack] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        INBOUND -> Value.INBOUND
                        OUTBOUND -> Value.OUTBOUND
                        BOTH -> Value.BOTH
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        INBOUND -> Known.INBOUND
                        OUTBOUND -> Known.OUTBOUND
                        BOTH -> Known.BOTH
                        else -> throw TelnyxInvalidDataException("Unknown RecordingTrack: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): RecordingTrack = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RecordingTrack && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Defines the SIP region to be used for the call. */
            class SipRegion @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val US = of("US")

                    @JvmField val EUROPE = of("Europe")

                    @JvmField val CANADA = of("Canada")

                    @JvmField val AUSTRALIA = of("Australia")

                    @JvmField val MIDDLE_EAST = of("Middle East")

                    @JvmStatic fun of(value: String) = SipRegion(JsonField.of(value))
                }

                /** An enum containing [SipRegion]'s known values. */
                enum class Known {
                    US,
                    EUROPE,
                    CANADA,
                    AUSTRALIA,
                    MIDDLE_EAST,
                }

                /**
                 * An enum containing [SipRegion]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [SipRegion] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    US,
                    EUROPE,
                    CANADA,
                    AUSTRALIA,
                    MIDDLE_EAST,
                    /**
                     * An enum member indicating that [SipRegion] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        US -> Value.US
                        EUROPE -> Value.EUROPE
                        CANADA -> Value.CANADA
                        AUSTRALIA -> Value.AUSTRALIA
                        MIDDLE_EAST -> Value.MIDDLE_EAST
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        US -> Known.US
                        EUROPE -> Known.EUROPE
                        CANADA -> Known.CANADA
                        AUSTRALIA -> Known.AUSTRALIA
                        MIDDLE_EAST -> Known.MIDDLE_EAST
                        else -> throw TelnyxInvalidDataException("Unknown SipRegion: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): SipRegion = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SipRegion && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * The call events for which Telnyx should send a webhook. Multiple events can be
             * defined when separated by a space.
             */
            class StatusCallbackEvent
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val INITIATED = of("initiated")

                    @JvmField val RINGING = of("ringing")

                    @JvmField val ANSWERED = of("answered")

                    @JvmField val COMPLETED = of("completed")

                    @JvmStatic fun of(value: String) = StatusCallbackEvent(JsonField.of(value))
                }

                /** An enum containing [StatusCallbackEvent]'s known values. */
                enum class Known {
                    INITIATED,
                    RINGING,
                    ANSWERED,
                    COMPLETED,
                }

                /**
                 * An enum containing [StatusCallbackEvent]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [StatusCallbackEvent] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INITIATED,
                    RINGING,
                    ANSWERED,
                    COMPLETED,
                    /**
                     * An enum member indicating that [StatusCallbackEvent] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        INITIATED -> Value.INITIATED
                        RINGING -> Value.RINGING
                        ANSWERED -> Value.ANSWERED
                        COMPLETED -> Value.COMPLETED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        INITIATED -> Known.INITIATED
                        RINGING -> Known.RINGING
                        ANSWERED -> Known.ANSWERED
                        COMPLETED -> Known.COMPLETED
                        else ->
                            throw TelnyxInvalidDataException("Unknown StatusCallbackEvent: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): StatusCallbackEvent = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is StatusCallbackEvent && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** HTTP request type used for `StatusCallback`. */
            class StatusCallbackMethod
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val GET = of("GET")

                    @JvmField val POST = of("POST")

                    @JvmStatic fun of(value: String) = StatusCallbackMethod(JsonField.of(value))
                }

                /** An enum containing [StatusCallbackMethod]'s known values. */
                enum class Known {
                    GET,
                    POST,
                }

                /**
                 * An enum containing [StatusCallbackMethod]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [StatusCallbackMethod] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    GET,
                    POST,
                    /**
                     * An enum member indicating that [StatusCallbackMethod] was instantiated with
                     * an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        GET -> Value.GET
                        POST -> Value.POST
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        GET -> Known.GET
                        POST -> Known.POST
                        else ->
                            throw TelnyxInvalidDataException("Unknown StatusCallbackMethod: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): StatusCallbackMethod = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is StatusCallbackMethod && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * The supervising role for the new leg. Determines the audio behavior: barge (hear both
             * sides), whisper (only hear supervisor), monitor (hear both sides but supervisor
             * muted). Default: barge
             */
            class SupervisingRole
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val BARGE = of("barge")

                    @JvmField val WHISPER = of("whisper")

                    @JvmField val MONITOR = of("monitor")

                    @JvmStatic fun of(value: String) = SupervisingRole(JsonField.of(value))
                }

                /** An enum containing [SupervisingRole]'s known values. */
                enum class Known {
                    BARGE,
                    WHISPER,
                    MONITOR,
                }

                /**
                 * An enum containing [SupervisingRole]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [SupervisingRole] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    BARGE,
                    WHISPER,
                    MONITOR,
                    /**
                     * An enum member indicating that [SupervisingRole] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        BARGE -> Value.BARGE
                        WHISPER -> Value.WHISPER
                        MONITOR -> Value.MONITOR
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        BARGE -> Known.BARGE
                        WHISPER -> Known.WHISPER
                        MONITOR -> Known.MONITOR
                        else -> throw TelnyxInvalidDataException("Unknown SupervisingRole: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): SupervisingRole = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SupervisingRole && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Whether to trim any leading and trailing silence from the recording. Defaults to
             * `trim-silence`.
             */
            class Trim @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val TRIM_SILENCE = of("trim-silence")

                    @JvmField val DO_NOT_TRIM = of("do-not-trim")

                    @JvmStatic fun of(value: String) = Trim(JsonField.of(value))
                }

                /** An enum containing [Trim]'s known values. */
                enum class Known {
                    TRIM_SILENCE,
                    DO_NOT_TRIM,
                }

                /**
                 * An enum containing [Trim]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Trim] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TRIM_SILENCE,
                    DO_NOT_TRIM,
                    /**
                     * An enum member indicating that [Trim] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        TRIM_SILENCE -> Value.TRIM_SILENCE
                        DO_NOT_TRIM -> Value.DO_NOT_TRIM
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        TRIM_SILENCE -> Known.TRIM_SILENCE
                        DO_NOT_TRIM -> Known.DO_NOT_TRIM
                        else -> throw TelnyxInvalidDataException("Unknown Trim: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Trim = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Trim && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * HTTP request type used for `Url`. The default value is inherited from TeXML
             * Application setting.
             */
            class UrlMethod @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val GET = of("GET")

                    @JvmField val POST = of("POST")

                    @JvmStatic fun of(value: String) = UrlMethod(JsonField.of(value))
                }

                /** An enum containing [UrlMethod]'s known values. */
                enum class Known {
                    GET,
                    POST,
                }

                /**
                 * An enum containing [UrlMethod]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [UrlMethod] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    GET,
                    POST,
                    /**
                     * An enum member indicating that [UrlMethod] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        GET -> Value.GET
                        POST -> Value.POST
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        GET -> Known.GET
                        POST -> Known.POST
                        else -> throw TelnyxInvalidDataException("Unknown UrlMethod: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): UrlMethod = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is UrlMethod && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is WithUrl &&
                    url == other.url &&
                    applicationSid == other.applicationSid &&
                    asyncAmd == other.asyncAmd &&
                    asyncAmdStatusCallback == other.asyncAmdStatusCallback &&
                    asyncAmdStatusCallbackMethod == other.asyncAmdStatusCallbackMethod &&
                    callerId == other.callerId &&
                    cancelPlaybackOnDetectMessageEnd == other.cancelPlaybackOnDetectMessageEnd &&
                    cancelPlaybackOnMachineDetection == other.cancelPlaybackOnMachineDetection &&
                    customHeaders == other.customHeaders &&
                    detectionMode == other.detectionMode &&
                    fallbackUrl == other.fallbackUrl &&
                    from == other.from &&
                    machineDetection == other.machineDetection &&
                    machineDetectionSilenceTimeout == other.machineDetectionSilenceTimeout &&
                    machineDetectionSpeechEndThreshold ==
                        other.machineDetectionSpeechEndThreshold &&
                    machineDetectionSpeechThreshold == other.machineDetectionSpeechThreshold &&
                    machineDetectionTimeout == other.machineDetectionTimeout &&
                    mediaEncryption == other.mediaEncryption &&
                    preferredCodecs == other.preferredCodecs &&
                    record == other.record &&
                    recordingChannels == other.recordingChannels &&
                    recordingStatusCallback == other.recordingStatusCallback &&
                    recordingStatusCallbackEvent == other.recordingStatusCallbackEvent &&
                    recordingStatusCallbackMethod == other.recordingStatusCallbackMethod &&
                    recordingTimeout == other.recordingTimeout &&
                    recordingTrack == other.recordingTrack &&
                    sendRecordingUrl == other.sendRecordingUrl &&
                    sipAuthPassword == other.sipAuthPassword &&
                    sipAuthUsername == other.sipAuthUsername &&
                    sipRegion == other.sipRegion &&
                    statusCallback == other.statusCallback &&
                    statusCallbackEvent == other.statusCallbackEvent &&
                    statusCallbackMethod == other.statusCallbackMethod &&
                    superviseCallSid == other.superviseCallSid &&
                    supervisingRole == other.supervisingRole &&
                    texml == other.texml &&
                    timeLimit == other.timeLimit &&
                    timeout == other.timeout &&
                    to == other.to &&
                    trim == other.trim &&
                    urlMethod == other.urlMethod &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    url,
                    applicationSid,
                    asyncAmd,
                    asyncAmdStatusCallback,
                    asyncAmdStatusCallbackMethod,
                    callerId,
                    cancelPlaybackOnDetectMessageEnd,
                    cancelPlaybackOnMachineDetection,
                    customHeaders,
                    detectionMode,
                    fallbackUrl,
                    from,
                    machineDetection,
                    machineDetectionSilenceTimeout,
                    machineDetectionSpeechEndThreshold,
                    machineDetectionSpeechThreshold,
                    machineDetectionTimeout,
                    mediaEncryption,
                    preferredCodecs,
                    record,
                    recordingChannels,
                    recordingStatusCallback,
                    recordingStatusCallbackEvent,
                    recordingStatusCallbackMethod,
                    recordingTimeout,
                    recordingTrack,
                    sendRecordingUrl,
                    sipAuthPassword,
                    sipAuthUsername,
                    sipRegion,
                    statusCallback,
                    statusCallbackEvent,
                    statusCallbackMethod,
                    superviseCallSid,
                    supervisingRole,
                    texml,
                    timeLimit,
                    timeout,
                    to,
                    trim,
                    urlMethod,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "WithUrl{url=$url, applicationSid=$applicationSid, asyncAmd=$asyncAmd, asyncAmdStatusCallback=$asyncAmdStatusCallback, asyncAmdStatusCallbackMethod=$asyncAmdStatusCallbackMethod, callerId=$callerId, cancelPlaybackOnDetectMessageEnd=$cancelPlaybackOnDetectMessageEnd, cancelPlaybackOnMachineDetection=$cancelPlaybackOnMachineDetection, customHeaders=$customHeaders, detectionMode=$detectionMode, fallbackUrl=$fallbackUrl, from=$from, machineDetection=$machineDetection, machineDetectionSilenceTimeout=$machineDetectionSilenceTimeout, machineDetectionSpeechEndThreshold=$machineDetectionSpeechEndThreshold, machineDetectionSpeechThreshold=$machineDetectionSpeechThreshold, machineDetectionTimeout=$machineDetectionTimeout, mediaEncryption=$mediaEncryption, preferredCodecs=$preferredCodecs, record=$record, recordingChannels=$recordingChannels, recordingStatusCallback=$recordingStatusCallback, recordingStatusCallbackEvent=$recordingStatusCallbackEvent, recordingStatusCallbackMethod=$recordingStatusCallbackMethod, recordingTimeout=$recordingTimeout, recordingTrack=$recordingTrack, sendRecordingUrl=$sendRecordingUrl, sipAuthPassword=$sipAuthPassword, sipAuthUsername=$sipAuthUsername, sipRegion=$sipRegion, statusCallback=$statusCallback, statusCallbackEvent=$statusCallbackEvent, statusCallbackMethod=$statusCallbackMethod, superviseCallSid=$superviseCallSid, supervisingRole=$supervisingRole, texml=$texml, timeLimit=$timeLimit, timeout=$timeout, to=$to, trim=$trim, urlMethod=$urlMethod, additionalProperties=$additionalProperties}"
        }

        class WithTeXml
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val texml: JsonField<String>,
            private val applicationSid: JsonField<String>,
            private val asyncAmd: JsonField<Boolean>,
            private val asyncAmdStatusCallback: JsonField<String>,
            private val asyncAmdStatusCallbackMethod: JsonField<AsyncAmdStatusCallbackMethod>,
            private val callerId: JsonField<String>,
            private val cancelPlaybackOnDetectMessageEnd: JsonField<Boolean>,
            private val cancelPlaybackOnMachineDetection: JsonField<Boolean>,
            private val customHeaders: JsonField<List<CustomHeader>>,
            private val detectionMode: JsonField<DetectionMode>,
            private val fallbackUrl: JsonField<String>,
            private val from: JsonField<String>,
            private val machineDetection: JsonField<MachineDetection>,
            private val machineDetectionSilenceTimeout: JsonField<Long>,
            private val machineDetectionSpeechEndThreshold: JsonField<Long>,
            private val machineDetectionSpeechThreshold: JsonField<Long>,
            private val machineDetectionTimeout: JsonField<Long>,
            private val mediaEncryption: JsonField<MediaEncryption>,
            private val preferredCodecs: JsonField<String>,
            private val record: JsonField<Boolean>,
            private val recordingChannels: JsonField<RecordingChannels>,
            private val recordingStatusCallback: JsonField<String>,
            private val recordingStatusCallbackEvent: JsonField<String>,
            private val recordingStatusCallbackMethod: JsonField<RecordingStatusCallbackMethod>,
            private val recordingTimeout: JsonField<Long>,
            private val recordingTrack: JsonField<RecordingTrack>,
            private val sendRecordingUrl: JsonField<Boolean>,
            private val sipAuthPassword: JsonField<String>,
            private val sipAuthUsername: JsonField<String>,
            private val sipRegion: JsonField<SipRegion>,
            private val statusCallback: JsonField<String>,
            private val statusCallbackEvent: JsonField<StatusCallbackEvent>,
            private val statusCallbackMethod: JsonField<StatusCallbackMethod>,
            private val superviseCallSid: JsonField<String>,
            private val supervisingRole: JsonField<SupervisingRole>,
            private val timeLimit: JsonField<Long>,
            private val timeout: JsonField<Long>,
            private val to: JsonField<String>,
            private val trim: JsonField<Trim>,
            private val url: JsonValue,
            private val urlMethod: JsonField<UrlMethod>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("Texml") @ExcludeMissing texml: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ApplicationSid")
                @ExcludeMissing
                applicationSid: JsonField<String> = JsonMissing.of(),
                @JsonProperty("AsyncAmd")
                @ExcludeMissing
                asyncAmd: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("AsyncAmdStatusCallback")
                @ExcludeMissing
                asyncAmdStatusCallback: JsonField<String> = JsonMissing.of(),
                @JsonProperty("AsyncAmdStatusCallbackMethod")
                @ExcludeMissing
                asyncAmdStatusCallbackMethod: JsonField<AsyncAmdStatusCallbackMethod> =
                    JsonMissing.of(),
                @JsonProperty("CallerId")
                @ExcludeMissing
                callerId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("CancelPlaybackOnDetectMessageEnd")
                @ExcludeMissing
                cancelPlaybackOnDetectMessageEnd: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("CancelPlaybackOnMachineDetection")
                @ExcludeMissing
                cancelPlaybackOnMachineDetection: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("CustomHeaders")
                @ExcludeMissing
                customHeaders: JsonField<List<CustomHeader>> = JsonMissing.of(),
                @JsonProperty("DetectionMode")
                @ExcludeMissing
                detectionMode: JsonField<DetectionMode> = JsonMissing.of(),
                @JsonProperty("FallbackUrl")
                @ExcludeMissing
                fallbackUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("From") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
                @JsonProperty("MachineDetection")
                @ExcludeMissing
                machineDetection: JsonField<MachineDetection> = JsonMissing.of(),
                @JsonProperty("MachineDetectionSilenceTimeout")
                @ExcludeMissing
                machineDetectionSilenceTimeout: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("MachineDetectionSpeechEndThreshold")
                @ExcludeMissing
                machineDetectionSpeechEndThreshold: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("MachineDetectionSpeechThreshold")
                @ExcludeMissing
                machineDetectionSpeechThreshold: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("MachineDetectionTimeout")
                @ExcludeMissing
                machineDetectionTimeout: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("MediaEncryption")
                @ExcludeMissing
                mediaEncryption: JsonField<MediaEncryption> = JsonMissing.of(),
                @JsonProperty("PreferredCodecs")
                @ExcludeMissing
                preferredCodecs: JsonField<String> = JsonMissing.of(),
                @JsonProperty("Record")
                @ExcludeMissing
                record: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("RecordingChannels")
                @ExcludeMissing
                recordingChannels: JsonField<RecordingChannels> = JsonMissing.of(),
                @JsonProperty("RecordingStatusCallback")
                @ExcludeMissing
                recordingStatusCallback: JsonField<String> = JsonMissing.of(),
                @JsonProperty("RecordingStatusCallbackEvent")
                @ExcludeMissing
                recordingStatusCallbackEvent: JsonField<String> = JsonMissing.of(),
                @JsonProperty("RecordingStatusCallbackMethod")
                @ExcludeMissing
                recordingStatusCallbackMethod: JsonField<RecordingStatusCallbackMethod> =
                    JsonMissing.of(),
                @JsonProperty("RecordingTimeout")
                @ExcludeMissing
                recordingTimeout: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("RecordingTrack")
                @ExcludeMissing
                recordingTrack: JsonField<RecordingTrack> = JsonMissing.of(),
                @JsonProperty("SendRecordingUrl")
                @ExcludeMissing
                sendRecordingUrl: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("SipAuthPassword")
                @ExcludeMissing
                sipAuthPassword: JsonField<String> = JsonMissing.of(),
                @JsonProperty("SipAuthUsername")
                @ExcludeMissing
                sipAuthUsername: JsonField<String> = JsonMissing.of(),
                @JsonProperty("SipRegion")
                @ExcludeMissing
                sipRegion: JsonField<SipRegion> = JsonMissing.of(),
                @JsonProperty("StatusCallback")
                @ExcludeMissing
                statusCallback: JsonField<String> = JsonMissing.of(),
                @JsonProperty("StatusCallbackEvent")
                @ExcludeMissing
                statusCallbackEvent: JsonField<StatusCallbackEvent> = JsonMissing.of(),
                @JsonProperty("StatusCallbackMethod")
                @ExcludeMissing
                statusCallbackMethod: JsonField<StatusCallbackMethod> = JsonMissing.of(),
                @JsonProperty("SuperviseCallSid")
                @ExcludeMissing
                superviseCallSid: JsonField<String> = JsonMissing.of(),
                @JsonProperty("SupervisingRole")
                @ExcludeMissing
                supervisingRole: JsonField<SupervisingRole> = JsonMissing.of(),
                @JsonProperty("TimeLimit")
                @ExcludeMissing
                timeLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("Timeout")
                @ExcludeMissing
                timeout: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("To") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
                @JsonProperty("Trim") @ExcludeMissing trim: JsonField<Trim> = JsonMissing.of(),
                @JsonProperty("Url") @ExcludeMissing url: JsonValue = JsonMissing.of(),
                @JsonProperty("UrlMethod")
                @ExcludeMissing
                urlMethod: JsonField<UrlMethod> = JsonMissing.of(),
            ) : this(
                texml,
                applicationSid,
                asyncAmd,
                asyncAmdStatusCallback,
                asyncAmdStatusCallbackMethod,
                callerId,
                cancelPlaybackOnDetectMessageEnd,
                cancelPlaybackOnMachineDetection,
                customHeaders,
                detectionMode,
                fallbackUrl,
                from,
                machineDetection,
                machineDetectionSilenceTimeout,
                machineDetectionSpeechEndThreshold,
                machineDetectionSpeechThreshold,
                machineDetectionTimeout,
                mediaEncryption,
                preferredCodecs,
                record,
                recordingChannels,
                recordingStatusCallback,
                recordingStatusCallbackEvent,
                recordingStatusCallbackMethod,
                recordingTimeout,
                recordingTrack,
                sendRecordingUrl,
                sipAuthPassword,
                sipAuthUsername,
                sipRegion,
                statusCallback,
                statusCallbackEvent,
                statusCallbackMethod,
                superviseCallSid,
                supervisingRole,
                timeLimit,
                timeout,
                to,
                trim,
                url,
                urlMethod,
                mutableMapOf(),
            )

            /**
             * TeXML to be used as instructions for the call. If provided, the call will execute
             * these instructions instead of fetching from the Url.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun texml(): String = texml.getRequired("Texml")

            /**
             * The ID of the TeXML Application.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun applicationSid(): Optional<String> = applicationSid.getOptional("ApplicationSid")

            /**
             * Select whether to perform answering machine detection in the background. By default
             * execution is blocked until Answering Machine Detection is completed.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun asyncAmd(): Optional<Boolean> = asyncAmd.getOptional("AsyncAmd")

            /**
             * URL destination for Telnyx to send AMD callback events to for the call.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun asyncAmdStatusCallback(): Optional<String> =
                asyncAmdStatusCallback.getOptional("AsyncAmdStatusCallback")

            /**
             * HTTP request type used for `AsyncAmdStatusCallback`. The default value is inherited
             * from TeXML Application setting.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun asyncAmdStatusCallbackMethod(): Optional<AsyncAmdStatusCallbackMethod> =
                asyncAmdStatusCallbackMethod.getOptional("AsyncAmdStatusCallbackMethod")

            /**
             * To be used as the caller id name (SIP From Display Name) presented to the destination
             * (`To` number). The string should have a maximum of 128 characters, containing only
             * letters, numbers, spaces, and `-_~!.+` special characters. If ommited, the display
             * name will be the same as the number in the `From` field.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun callerId(): Optional<String> = callerId.getOptional("CallerId")

            /**
             * Whether to cancel ongoing playback on `greeting ended` detection. Defaults to `true`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cancelPlaybackOnDetectMessageEnd(): Optional<Boolean> =
                cancelPlaybackOnDetectMessageEnd.getOptional("CancelPlaybackOnDetectMessageEnd")

            /**
             * Whether to cancel ongoing playback on `machine` detection. Defaults to `true`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cancelPlaybackOnMachineDetection(): Optional<Boolean> =
                cancelPlaybackOnMachineDetection.getOptional("CancelPlaybackOnMachineDetection")

            /**
             * Custom HTTP headers to be sent with the call. Each header should be an object with
             * 'name' and 'value' properties.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun customHeaders(): Optional<List<CustomHeader>> =
                customHeaders.getOptional("CustomHeaders")

            /**
             * Allows you to chose between Premium and Standard detections.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun detectionMode(): Optional<DetectionMode> =
                detectionMode.getOptional("DetectionMode")

            /**
             * A failover URL for which Telnyx will retrieve the TeXML call instructions if the
             * `Url` is not responding.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun fallbackUrl(): Optional<String> = fallbackUrl.getOptional("FallbackUrl")

            /**
             * The phone number of the party that initiated the call. Phone numbers are formatted
             * with a `+` and country code.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun from(): Optional<String> = from.getOptional("From")

            /**
             * Enables Answering Machine Detection.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun machineDetection(): Optional<MachineDetection> =
                machineDetection.getOptional("MachineDetection")

            /**
             * If initial silence duration is greater than this value, consider it a machine.
             * Ignored when `premium` detection is used.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun machineDetectionSilenceTimeout(): Optional<Long> =
                machineDetectionSilenceTimeout.getOptional("MachineDetectionSilenceTimeout")

            /**
             * Silence duration threshold after a greeting message or voice for it be considered
             * human. Ignored when `premium` detection is used.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun machineDetectionSpeechEndThreshold(): Optional<Long> =
                machineDetectionSpeechEndThreshold.getOptional("MachineDetectionSpeechEndThreshold")

            /**
             * Maximum threshold of a human greeting. If greeting longer than this value, considered
             * machine. Ignored when `premium` detection is used.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun machineDetectionSpeechThreshold(): Optional<Long> =
                machineDetectionSpeechThreshold.getOptional("MachineDetectionSpeechThreshold")

            /**
             * Maximum timeout threshold in milliseconds for overall detection.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun machineDetectionTimeout(): Optional<Long> =
                machineDetectionTimeout.getOptional("MachineDetectionTimeout")

            /**
             * Defines whether media should be encrypted on the call. When set to `SRTP`, the call
             * will use Secure Real-time Transport Protocol for media encryption. When set to
             * `DTLS`, the call will use DTLS for media encryption. Only supported for SIP
             * destinations.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mediaEncryption(): Optional<MediaEncryption> =
                mediaEncryption.getOptional("MediaEncryption")

            /**
             * The list of comma-separated codecs to be offered on a call.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun preferredCodecs(): Optional<String> = preferredCodecs.getOptional("PreferredCodecs")

            /**
             * Whether to record the entire participant's call leg. Defaults to `false`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun record(): Optional<Boolean> = record.getOptional("Record")

            /**
             * The number of channels in the final recording. Defaults to `mono`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordingChannels(): Optional<RecordingChannels> =
                recordingChannels.getOptional("RecordingChannels")

            /**
             * The URL the recording callbacks will be sent to.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordingStatusCallback(): Optional<String> =
                recordingStatusCallback.getOptional("RecordingStatusCallback")

            /**
             * The changes to the recording's state that should generate a call to
             * `RecoridngStatusCallback`. Can be: `in-progress`, `completed` and `absent`. Separate
             * multiple values with a space. Defaults to `completed`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordingStatusCallbackEvent(): Optional<String> =
                recordingStatusCallbackEvent.getOptional("RecordingStatusCallbackEvent")

            /**
             * HTTP request type used for `RecordingStatusCallback`. Defaults to `POST`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordingStatusCallbackMethod(): Optional<RecordingStatusCallbackMethod> =
                recordingStatusCallbackMethod.getOptional("RecordingStatusCallbackMethod")

            /**
             * The number of seconds that Telnyx will wait for the recording to be stopped if
             * silence is detected. The timer only starts when the speech is detected. Please note
             * that the transcription is used to detect silence and the related charge will be
             * applied. The minimum value is 0. The default value is 0 (infinite)
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordingTimeout(): Optional<Long> =
                recordingTimeout.getOptional("RecordingTimeout")

            /**
             * The audio track to record for the call. The default is `both`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordingTrack(): Optional<RecordingTrack> =
                recordingTrack.getOptional("RecordingTrack")

            /**
             * Whether to send RecordingUrl in webhooks.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sendRecordingUrl(): Optional<Boolean> =
                sendRecordingUrl.getOptional("SendRecordingUrl")

            /**
             * The password to use for SIP authentication.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sipAuthPassword(): Optional<String> = sipAuthPassword.getOptional("SipAuthPassword")

            /**
             * The username to use for SIP authentication.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sipAuthUsername(): Optional<String> = sipAuthUsername.getOptional("SipAuthUsername")

            /**
             * Defines the SIP region to be used for the call.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sipRegion(): Optional<SipRegion> = sipRegion.getOptional("SipRegion")

            /**
             * URL destination for Telnyx to send status callback events to for the call.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun statusCallback(): Optional<String> = statusCallback.getOptional("StatusCallback")

            /**
             * The call events for which Telnyx should send a webhook. Multiple events can be
             * defined when separated by a space.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun statusCallbackEvent(): Optional<StatusCallbackEvent> =
                statusCallbackEvent.getOptional("StatusCallbackEvent")

            /**
             * HTTP request type used for `StatusCallback`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun statusCallbackMethod(): Optional<StatusCallbackMethod> =
                statusCallbackMethod.getOptional("StatusCallbackMethod")

            /**
             * The call control ID of the existing call to supervise. When provided, the created leg
             * will be added to the specified call in supervising mode. Status callbacks and action
             * callbacks will NOT be sent for the supervising leg.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun superviseCallSid(): Optional<String> =
                superviseCallSid.getOptional("SuperviseCallSid")

            /**
             * The supervising role for the new leg. Determines the audio behavior: barge (hear both
             * sides), whisper (only hear supervisor), monitor (hear both sides but supervisor
             * muted). Default: barge
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun supervisingRole(): Optional<SupervisingRole> =
                supervisingRole.getOptional("SupervisingRole")

            /**
             * The maximum duration of the call in seconds. The minimum value is 30 and the maximum
             * value is 14400 (4 hours). Default is 14400 seconds.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun timeLimit(): Optional<Long> = timeLimit.getOptional("TimeLimit")

            /**
             * The number of seconds to wait for the called party to answer the call before the call
             * is canceled. The minimum value is 5 and the maximum value is 120. Default is 30
             * seconds.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun timeout(): Optional<Long> = timeout.getOptional("Timeout")

            /**
             * The phone number of the called party. Phone numbers are formatted with a `+` and
             * country code.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun to(): Optional<String> = to.getOptional("To")

            /**
             * Whether to trim any leading and trailing silence from the recording. Defaults to
             * `trim-silence`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun trim(): Optional<Trim> = trim.getOptional("Trim")

            /**
             * This arbitrary value can be deserialized into a custom type using the `convert`
             * method:
             * ```java
             * MyClass myObject = withTeXml.url().convert(MyClass.class);
             * ```
             */
            @JsonProperty("Url") @ExcludeMissing fun _url(): JsonValue = url

            /**
             * HTTP request type used for `Url`. The default value is inherited from TeXML
             * Application setting.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun urlMethod(): Optional<UrlMethod> = urlMethod.getOptional("UrlMethod")

            /**
             * Returns the raw JSON value of [texml].
             *
             * Unlike [texml], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("Texml") @ExcludeMissing fun _texml(): JsonField<String> = texml

            /**
             * Returns the raw JSON value of [applicationSid].
             *
             * Unlike [applicationSid], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("ApplicationSid")
            @ExcludeMissing
            fun _applicationSid(): JsonField<String> = applicationSid

            /**
             * Returns the raw JSON value of [asyncAmd].
             *
             * Unlike [asyncAmd], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("AsyncAmd") @ExcludeMissing fun _asyncAmd(): JsonField<Boolean> = asyncAmd

            /**
             * Returns the raw JSON value of [asyncAmdStatusCallback].
             *
             * Unlike [asyncAmdStatusCallback], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("AsyncAmdStatusCallback")
            @ExcludeMissing
            fun _asyncAmdStatusCallback(): JsonField<String> = asyncAmdStatusCallback

            /**
             * Returns the raw JSON value of [asyncAmdStatusCallbackMethod].
             *
             * Unlike [asyncAmdStatusCallbackMethod], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("AsyncAmdStatusCallbackMethod")
            @ExcludeMissing
            fun _asyncAmdStatusCallbackMethod(): JsonField<AsyncAmdStatusCallbackMethod> =
                asyncAmdStatusCallbackMethod

            /**
             * Returns the raw JSON value of [callerId].
             *
             * Unlike [callerId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("CallerId") @ExcludeMissing fun _callerId(): JsonField<String> = callerId

            /**
             * Returns the raw JSON value of [cancelPlaybackOnDetectMessageEnd].
             *
             * Unlike [cancelPlaybackOnDetectMessageEnd], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("CancelPlaybackOnDetectMessageEnd")
            @ExcludeMissing
            fun _cancelPlaybackOnDetectMessageEnd(): JsonField<Boolean> =
                cancelPlaybackOnDetectMessageEnd

            /**
             * Returns the raw JSON value of [cancelPlaybackOnMachineDetection].
             *
             * Unlike [cancelPlaybackOnMachineDetection], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("CancelPlaybackOnMachineDetection")
            @ExcludeMissing
            fun _cancelPlaybackOnMachineDetection(): JsonField<Boolean> =
                cancelPlaybackOnMachineDetection

            /**
             * Returns the raw JSON value of [customHeaders].
             *
             * Unlike [customHeaders], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("CustomHeaders")
            @ExcludeMissing
            fun _customHeaders(): JsonField<List<CustomHeader>> = customHeaders

            /**
             * Returns the raw JSON value of [detectionMode].
             *
             * Unlike [detectionMode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("DetectionMode")
            @ExcludeMissing
            fun _detectionMode(): JsonField<DetectionMode> = detectionMode

            /**
             * Returns the raw JSON value of [fallbackUrl].
             *
             * Unlike [fallbackUrl], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("FallbackUrl")
            @ExcludeMissing
            fun _fallbackUrl(): JsonField<String> = fallbackUrl

            /**
             * Returns the raw JSON value of [from].
             *
             * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("From") @ExcludeMissing fun _from(): JsonField<String> = from

            /**
             * Returns the raw JSON value of [machineDetection].
             *
             * Unlike [machineDetection], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("MachineDetection")
            @ExcludeMissing
            fun _machineDetection(): JsonField<MachineDetection> = machineDetection

            /**
             * Returns the raw JSON value of [machineDetectionSilenceTimeout].
             *
             * Unlike [machineDetectionSilenceTimeout], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("MachineDetectionSilenceTimeout")
            @ExcludeMissing
            fun _machineDetectionSilenceTimeout(): JsonField<Long> = machineDetectionSilenceTimeout

            /**
             * Returns the raw JSON value of [machineDetectionSpeechEndThreshold].
             *
             * Unlike [machineDetectionSpeechEndThreshold], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("MachineDetectionSpeechEndThreshold")
            @ExcludeMissing
            fun _machineDetectionSpeechEndThreshold(): JsonField<Long> =
                machineDetectionSpeechEndThreshold

            /**
             * Returns the raw JSON value of [machineDetectionSpeechThreshold].
             *
             * Unlike [machineDetectionSpeechThreshold], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("MachineDetectionSpeechThreshold")
            @ExcludeMissing
            fun _machineDetectionSpeechThreshold(): JsonField<Long> =
                machineDetectionSpeechThreshold

            /**
             * Returns the raw JSON value of [machineDetectionTimeout].
             *
             * Unlike [machineDetectionTimeout], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("MachineDetectionTimeout")
            @ExcludeMissing
            fun _machineDetectionTimeout(): JsonField<Long> = machineDetectionTimeout

            /**
             * Returns the raw JSON value of [mediaEncryption].
             *
             * Unlike [mediaEncryption], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("MediaEncryption")
            @ExcludeMissing
            fun _mediaEncryption(): JsonField<MediaEncryption> = mediaEncryption

            /**
             * Returns the raw JSON value of [preferredCodecs].
             *
             * Unlike [preferredCodecs], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("PreferredCodecs")
            @ExcludeMissing
            fun _preferredCodecs(): JsonField<String> = preferredCodecs

            /**
             * Returns the raw JSON value of [record].
             *
             * Unlike [record], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("Record") @ExcludeMissing fun _record(): JsonField<Boolean> = record

            /**
             * Returns the raw JSON value of [recordingChannels].
             *
             * Unlike [recordingChannels], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("RecordingChannels")
            @ExcludeMissing
            fun _recordingChannels(): JsonField<RecordingChannels> = recordingChannels

            /**
             * Returns the raw JSON value of [recordingStatusCallback].
             *
             * Unlike [recordingStatusCallback], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("RecordingStatusCallback")
            @ExcludeMissing
            fun _recordingStatusCallback(): JsonField<String> = recordingStatusCallback

            /**
             * Returns the raw JSON value of [recordingStatusCallbackEvent].
             *
             * Unlike [recordingStatusCallbackEvent], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("RecordingStatusCallbackEvent")
            @ExcludeMissing
            fun _recordingStatusCallbackEvent(): JsonField<String> = recordingStatusCallbackEvent

            /**
             * Returns the raw JSON value of [recordingStatusCallbackMethod].
             *
             * Unlike [recordingStatusCallbackMethod], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("RecordingStatusCallbackMethod")
            @ExcludeMissing
            fun _recordingStatusCallbackMethod(): JsonField<RecordingStatusCallbackMethod> =
                recordingStatusCallbackMethod

            /**
             * Returns the raw JSON value of [recordingTimeout].
             *
             * Unlike [recordingTimeout], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("RecordingTimeout")
            @ExcludeMissing
            fun _recordingTimeout(): JsonField<Long> = recordingTimeout

            /**
             * Returns the raw JSON value of [recordingTrack].
             *
             * Unlike [recordingTrack], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("RecordingTrack")
            @ExcludeMissing
            fun _recordingTrack(): JsonField<RecordingTrack> = recordingTrack

            /**
             * Returns the raw JSON value of [sendRecordingUrl].
             *
             * Unlike [sendRecordingUrl], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("SendRecordingUrl")
            @ExcludeMissing
            fun _sendRecordingUrl(): JsonField<Boolean> = sendRecordingUrl

            /**
             * Returns the raw JSON value of [sipAuthPassword].
             *
             * Unlike [sipAuthPassword], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("SipAuthPassword")
            @ExcludeMissing
            fun _sipAuthPassword(): JsonField<String> = sipAuthPassword

            /**
             * Returns the raw JSON value of [sipAuthUsername].
             *
             * Unlike [sipAuthUsername], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("SipAuthUsername")
            @ExcludeMissing
            fun _sipAuthUsername(): JsonField<String> = sipAuthUsername

            /**
             * Returns the raw JSON value of [sipRegion].
             *
             * Unlike [sipRegion], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("SipRegion")
            @ExcludeMissing
            fun _sipRegion(): JsonField<SipRegion> = sipRegion

            /**
             * Returns the raw JSON value of [statusCallback].
             *
             * Unlike [statusCallback], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("StatusCallback")
            @ExcludeMissing
            fun _statusCallback(): JsonField<String> = statusCallback

            /**
             * Returns the raw JSON value of [statusCallbackEvent].
             *
             * Unlike [statusCallbackEvent], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("StatusCallbackEvent")
            @ExcludeMissing
            fun _statusCallbackEvent(): JsonField<StatusCallbackEvent> = statusCallbackEvent

            /**
             * Returns the raw JSON value of [statusCallbackMethod].
             *
             * Unlike [statusCallbackMethod], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("StatusCallbackMethod")
            @ExcludeMissing
            fun _statusCallbackMethod(): JsonField<StatusCallbackMethod> = statusCallbackMethod

            /**
             * Returns the raw JSON value of [superviseCallSid].
             *
             * Unlike [superviseCallSid], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("SuperviseCallSid")
            @ExcludeMissing
            fun _superviseCallSid(): JsonField<String> = superviseCallSid

            /**
             * Returns the raw JSON value of [supervisingRole].
             *
             * Unlike [supervisingRole], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("SupervisingRole")
            @ExcludeMissing
            fun _supervisingRole(): JsonField<SupervisingRole> = supervisingRole

            /**
             * Returns the raw JSON value of [timeLimit].
             *
             * Unlike [timeLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("TimeLimit") @ExcludeMissing fun _timeLimit(): JsonField<Long> = timeLimit

            /**
             * Returns the raw JSON value of [timeout].
             *
             * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("Timeout") @ExcludeMissing fun _timeout(): JsonField<Long> = timeout

            /**
             * Returns the raw JSON value of [to].
             *
             * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("To") @ExcludeMissing fun _to(): JsonField<String> = to

            /**
             * Returns the raw JSON value of [trim].
             *
             * Unlike [trim], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("Trim") @ExcludeMissing fun _trim(): JsonField<Trim> = trim

            /**
             * Returns the raw JSON value of [urlMethod].
             *
             * Unlike [urlMethod], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("UrlMethod")
            @ExcludeMissing
            fun _urlMethod(): JsonField<UrlMethod> = urlMethod

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
                 * Returns a mutable builder for constructing an instance of [WithTeXml].
                 *
                 * The following fields are required:
                 * ```java
                 * .texml()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [WithTeXml]. */
            class Builder internal constructor() {

                private var texml: JsonField<String>? = null
                private var applicationSid: JsonField<String> = JsonMissing.of()
                private var asyncAmd: JsonField<Boolean> = JsonMissing.of()
                private var asyncAmdStatusCallback: JsonField<String> = JsonMissing.of()
                private var asyncAmdStatusCallbackMethod: JsonField<AsyncAmdStatusCallbackMethod> =
                    JsonMissing.of()
                private var callerId: JsonField<String> = JsonMissing.of()
                private var cancelPlaybackOnDetectMessageEnd: JsonField<Boolean> = JsonMissing.of()
                private var cancelPlaybackOnMachineDetection: JsonField<Boolean> = JsonMissing.of()
                private var customHeaders: JsonField<MutableList<CustomHeader>>? = null
                private var detectionMode: JsonField<DetectionMode> = JsonMissing.of()
                private var fallbackUrl: JsonField<String> = JsonMissing.of()
                private var from: JsonField<String> = JsonMissing.of()
                private var machineDetection: JsonField<MachineDetection> = JsonMissing.of()
                private var machineDetectionSilenceTimeout: JsonField<Long> = JsonMissing.of()
                private var machineDetectionSpeechEndThreshold: JsonField<Long> = JsonMissing.of()
                private var machineDetectionSpeechThreshold: JsonField<Long> = JsonMissing.of()
                private var machineDetectionTimeout: JsonField<Long> = JsonMissing.of()
                private var mediaEncryption: JsonField<MediaEncryption> = JsonMissing.of()
                private var preferredCodecs: JsonField<String> = JsonMissing.of()
                private var record: JsonField<Boolean> = JsonMissing.of()
                private var recordingChannels: JsonField<RecordingChannels> = JsonMissing.of()
                private var recordingStatusCallback: JsonField<String> = JsonMissing.of()
                private var recordingStatusCallbackEvent: JsonField<String> = JsonMissing.of()
                private var recordingStatusCallbackMethod:
                    JsonField<RecordingStatusCallbackMethod> =
                    JsonMissing.of()
                private var recordingTimeout: JsonField<Long> = JsonMissing.of()
                private var recordingTrack: JsonField<RecordingTrack> = JsonMissing.of()
                private var sendRecordingUrl: JsonField<Boolean> = JsonMissing.of()
                private var sipAuthPassword: JsonField<String> = JsonMissing.of()
                private var sipAuthUsername: JsonField<String> = JsonMissing.of()
                private var sipRegion: JsonField<SipRegion> = JsonMissing.of()
                private var statusCallback: JsonField<String> = JsonMissing.of()
                private var statusCallbackEvent: JsonField<StatusCallbackEvent> = JsonMissing.of()
                private var statusCallbackMethod: JsonField<StatusCallbackMethod> = JsonMissing.of()
                private var superviseCallSid: JsonField<String> = JsonMissing.of()
                private var supervisingRole: JsonField<SupervisingRole> = JsonMissing.of()
                private var timeLimit: JsonField<Long> = JsonMissing.of()
                private var timeout: JsonField<Long> = JsonMissing.of()
                private var to: JsonField<String> = JsonMissing.of()
                private var trim: JsonField<Trim> = JsonMissing.of()
                private var url: JsonValue = JsonMissing.of()
                private var urlMethod: JsonField<UrlMethod> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(withTeXml: WithTeXml) = apply {
                    texml = withTeXml.texml
                    applicationSid = withTeXml.applicationSid
                    asyncAmd = withTeXml.asyncAmd
                    asyncAmdStatusCallback = withTeXml.asyncAmdStatusCallback
                    asyncAmdStatusCallbackMethod = withTeXml.asyncAmdStatusCallbackMethod
                    callerId = withTeXml.callerId
                    cancelPlaybackOnDetectMessageEnd = withTeXml.cancelPlaybackOnDetectMessageEnd
                    cancelPlaybackOnMachineDetection = withTeXml.cancelPlaybackOnMachineDetection
                    customHeaders = withTeXml.customHeaders.map { it.toMutableList() }
                    detectionMode = withTeXml.detectionMode
                    fallbackUrl = withTeXml.fallbackUrl
                    from = withTeXml.from
                    machineDetection = withTeXml.machineDetection
                    machineDetectionSilenceTimeout = withTeXml.machineDetectionSilenceTimeout
                    machineDetectionSpeechEndThreshold =
                        withTeXml.machineDetectionSpeechEndThreshold
                    machineDetectionSpeechThreshold = withTeXml.machineDetectionSpeechThreshold
                    machineDetectionTimeout = withTeXml.machineDetectionTimeout
                    mediaEncryption = withTeXml.mediaEncryption
                    preferredCodecs = withTeXml.preferredCodecs
                    record = withTeXml.record
                    recordingChannels = withTeXml.recordingChannels
                    recordingStatusCallback = withTeXml.recordingStatusCallback
                    recordingStatusCallbackEvent = withTeXml.recordingStatusCallbackEvent
                    recordingStatusCallbackMethod = withTeXml.recordingStatusCallbackMethod
                    recordingTimeout = withTeXml.recordingTimeout
                    recordingTrack = withTeXml.recordingTrack
                    sendRecordingUrl = withTeXml.sendRecordingUrl
                    sipAuthPassword = withTeXml.sipAuthPassword
                    sipAuthUsername = withTeXml.sipAuthUsername
                    sipRegion = withTeXml.sipRegion
                    statusCallback = withTeXml.statusCallback
                    statusCallbackEvent = withTeXml.statusCallbackEvent
                    statusCallbackMethod = withTeXml.statusCallbackMethod
                    superviseCallSid = withTeXml.superviseCallSid
                    supervisingRole = withTeXml.supervisingRole
                    timeLimit = withTeXml.timeLimit
                    timeout = withTeXml.timeout
                    to = withTeXml.to
                    trim = withTeXml.trim
                    url = withTeXml.url
                    urlMethod = withTeXml.urlMethod
                    additionalProperties = withTeXml.additionalProperties.toMutableMap()
                }

                /**
                 * TeXML to be used as instructions for the call. If provided, the call will execute
                 * these instructions instead of fetching from the Url.
                 */
                fun texml(texml: String) = texml(JsonField.of(texml))

                /**
                 * Sets [Builder.texml] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.texml] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun texml(texml: JsonField<String>) = apply { this.texml = texml }

                /** The ID of the TeXML Application. */
                fun applicationSid(applicationSid: String) =
                    applicationSid(JsonField.of(applicationSid))

                /**
                 * Sets [Builder.applicationSid] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.applicationSid] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun applicationSid(applicationSid: JsonField<String>) = apply {
                    this.applicationSid = applicationSid
                }

                /**
                 * Select whether to perform answering machine detection in the background. By
                 * default execution is blocked until Answering Machine Detection is completed.
                 */
                fun asyncAmd(asyncAmd: Boolean) = asyncAmd(JsonField.of(asyncAmd))

                /**
                 * Sets [Builder.asyncAmd] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.asyncAmd] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun asyncAmd(asyncAmd: JsonField<Boolean>) = apply { this.asyncAmd = asyncAmd }

                /** URL destination for Telnyx to send AMD callback events to for the call. */
                fun asyncAmdStatusCallback(asyncAmdStatusCallback: String) =
                    asyncAmdStatusCallback(JsonField.of(asyncAmdStatusCallback))

                /**
                 * Sets [Builder.asyncAmdStatusCallback] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.asyncAmdStatusCallback] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun asyncAmdStatusCallback(asyncAmdStatusCallback: JsonField<String>) = apply {
                    this.asyncAmdStatusCallback = asyncAmdStatusCallback
                }

                /**
                 * HTTP request type used for `AsyncAmdStatusCallback`. The default value is
                 * inherited from TeXML Application setting.
                 */
                fun asyncAmdStatusCallbackMethod(
                    asyncAmdStatusCallbackMethod: AsyncAmdStatusCallbackMethod
                ) = asyncAmdStatusCallbackMethod(JsonField.of(asyncAmdStatusCallbackMethod))

                /**
                 * Sets [Builder.asyncAmdStatusCallbackMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.asyncAmdStatusCallbackMethod] with a well-typed
                 * [AsyncAmdStatusCallbackMethod] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun asyncAmdStatusCallbackMethod(
                    asyncAmdStatusCallbackMethod: JsonField<AsyncAmdStatusCallbackMethod>
                ) = apply { this.asyncAmdStatusCallbackMethod = asyncAmdStatusCallbackMethod }

                /**
                 * To be used as the caller id name (SIP From Display Name) presented to the
                 * destination (`To` number). The string should have a maximum of 128 characters,
                 * containing only letters, numbers, spaces, and `-_~!.+` special characters. If
                 * ommited, the display name will be the same as the number in the `From` field.
                 */
                fun callerId(callerId: String) = callerId(JsonField.of(callerId))

                /**
                 * Sets [Builder.callerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.callerId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun callerId(callerId: JsonField<String>) = apply { this.callerId = callerId }

                /**
                 * Whether to cancel ongoing playback on `greeting ended` detection. Defaults to
                 * `true`.
                 */
                fun cancelPlaybackOnDetectMessageEnd(cancelPlaybackOnDetectMessageEnd: Boolean) =
                    cancelPlaybackOnDetectMessageEnd(JsonField.of(cancelPlaybackOnDetectMessageEnd))

                /**
                 * Sets [Builder.cancelPlaybackOnDetectMessageEnd] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cancelPlaybackOnDetectMessageEnd] with a
                 * well-typed [Boolean] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun cancelPlaybackOnDetectMessageEnd(
                    cancelPlaybackOnDetectMessageEnd: JsonField<Boolean>
                ) = apply {
                    this.cancelPlaybackOnDetectMessageEnd = cancelPlaybackOnDetectMessageEnd
                }

                /**
                 * Whether to cancel ongoing playback on `machine` detection. Defaults to `true`.
                 */
                fun cancelPlaybackOnMachineDetection(cancelPlaybackOnMachineDetection: Boolean) =
                    cancelPlaybackOnMachineDetection(JsonField.of(cancelPlaybackOnMachineDetection))

                /**
                 * Sets [Builder.cancelPlaybackOnMachineDetection] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cancelPlaybackOnMachineDetection] with a
                 * well-typed [Boolean] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun cancelPlaybackOnMachineDetection(
                    cancelPlaybackOnMachineDetection: JsonField<Boolean>
                ) = apply {
                    this.cancelPlaybackOnMachineDetection = cancelPlaybackOnMachineDetection
                }

                /**
                 * Custom HTTP headers to be sent with the call. Each header should be an object
                 * with 'name' and 'value' properties.
                 */
                fun customHeaders(customHeaders: List<CustomHeader>) =
                    customHeaders(JsonField.of(customHeaders))

                /**
                 * Sets [Builder.customHeaders] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customHeaders] with a well-typed
                 * `List<CustomHeader>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun customHeaders(customHeaders: JsonField<List<CustomHeader>>) = apply {
                    this.customHeaders = customHeaders.map { it.toMutableList() }
                }

                /**
                 * Adds a single [CustomHeader] to [customHeaders].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCustomHeader(customHeader: CustomHeader) = apply {
                    customHeaders =
                        (customHeaders ?: JsonField.of(mutableListOf())).also {
                            checkKnown("customHeaders", it).add(customHeader)
                        }
                }

                /** Allows you to chose between Premium and Standard detections. */
                fun detectionMode(detectionMode: DetectionMode) =
                    detectionMode(JsonField.of(detectionMode))

                /**
                 * Sets [Builder.detectionMode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.detectionMode] with a well-typed [DetectionMode]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun detectionMode(detectionMode: JsonField<DetectionMode>) = apply {
                    this.detectionMode = detectionMode
                }

                /**
                 * A failover URL for which Telnyx will retrieve the TeXML call instructions if the
                 * `Url` is not responding.
                 */
                fun fallbackUrl(fallbackUrl: String) = fallbackUrl(JsonField.of(fallbackUrl))

                /**
                 * Sets [Builder.fallbackUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fallbackUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fallbackUrl(fallbackUrl: JsonField<String>) = apply {
                    this.fallbackUrl = fallbackUrl
                }

                /**
                 * The phone number of the party that initiated the call. Phone numbers are
                 * formatted with a `+` and country code.
                 */
                fun from(from: String) = from(JsonField.of(from))

                /**
                 * Sets [Builder.from] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.from] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun from(from: JsonField<String>) = apply { this.from = from }

                /** Enables Answering Machine Detection. */
                fun machineDetection(machineDetection: MachineDetection) =
                    machineDetection(JsonField.of(machineDetection))

                /**
                 * Sets [Builder.machineDetection] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.machineDetection] with a well-typed
                 * [MachineDetection] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun machineDetection(machineDetection: JsonField<MachineDetection>) = apply {
                    this.machineDetection = machineDetection
                }

                /**
                 * If initial silence duration is greater than this value, consider it a machine.
                 * Ignored when `premium` detection is used.
                 */
                fun machineDetectionSilenceTimeout(machineDetectionSilenceTimeout: Long) =
                    machineDetectionSilenceTimeout(JsonField.of(machineDetectionSilenceTimeout))

                /**
                 * Sets [Builder.machineDetectionSilenceTimeout] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.machineDetectionSilenceTimeout] with a
                 * well-typed [Long] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun machineDetectionSilenceTimeout(
                    machineDetectionSilenceTimeout: JsonField<Long>
                ) = apply { this.machineDetectionSilenceTimeout = machineDetectionSilenceTimeout }

                /**
                 * Silence duration threshold after a greeting message or voice for it be considered
                 * human. Ignored when `premium` detection is used.
                 */
                fun machineDetectionSpeechEndThreshold(machineDetectionSpeechEndThreshold: Long) =
                    machineDetectionSpeechEndThreshold(
                        JsonField.of(machineDetectionSpeechEndThreshold)
                    )

                /**
                 * Sets [Builder.machineDetectionSpeechEndThreshold] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.machineDetectionSpeechEndThreshold] with a
                 * well-typed [Long] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun machineDetectionSpeechEndThreshold(
                    machineDetectionSpeechEndThreshold: JsonField<Long>
                ) = apply {
                    this.machineDetectionSpeechEndThreshold = machineDetectionSpeechEndThreshold
                }

                /**
                 * Maximum threshold of a human greeting. If greeting longer than this value,
                 * considered machine. Ignored when `premium` detection is used.
                 */
                fun machineDetectionSpeechThreshold(machineDetectionSpeechThreshold: Long) =
                    machineDetectionSpeechThreshold(JsonField.of(machineDetectionSpeechThreshold))

                /**
                 * Sets [Builder.machineDetectionSpeechThreshold] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.machineDetectionSpeechThreshold] with a
                 * well-typed [Long] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun machineDetectionSpeechThreshold(
                    machineDetectionSpeechThreshold: JsonField<Long>
                ) = apply { this.machineDetectionSpeechThreshold = machineDetectionSpeechThreshold }

                /** Maximum timeout threshold in milliseconds for overall detection. */
                fun machineDetectionTimeout(machineDetectionTimeout: Long) =
                    machineDetectionTimeout(JsonField.of(machineDetectionTimeout))

                /**
                 * Sets [Builder.machineDetectionTimeout] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.machineDetectionTimeout] with a well-typed
                 * [Long] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun machineDetectionTimeout(machineDetectionTimeout: JsonField<Long>) = apply {
                    this.machineDetectionTimeout = machineDetectionTimeout
                }

                /**
                 * Defines whether media should be encrypted on the call. When set to `SRTP`, the
                 * call will use Secure Real-time Transport Protocol for media encryption. When set
                 * to `DTLS`, the call will use DTLS for media encryption. Only supported for SIP
                 * destinations.
                 */
                fun mediaEncryption(mediaEncryption: MediaEncryption) =
                    mediaEncryption(JsonField.of(mediaEncryption))

                /**
                 * Sets [Builder.mediaEncryption] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mediaEncryption] with a well-typed
                 * [MediaEncryption] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun mediaEncryption(mediaEncryption: JsonField<MediaEncryption>) = apply {
                    this.mediaEncryption = mediaEncryption
                }

                /** The list of comma-separated codecs to be offered on a call. */
                fun preferredCodecs(preferredCodecs: String) =
                    preferredCodecs(JsonField.of(preferredCodecs))

                /**
                 * Sets [Builder.preferredCodecs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.preferredCodecs] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun preferredCodecs(preferredCodecs: JsonField<String>) = apply {
                    this.preferredCodecs = preferredCodecs
                }

                /** Whether to record the entire participant's call leg. Defaults to `false`. */
                fun record(record: Boolean) = record(JsonField.of(record))

                /**
                 * Sets [Builder.record] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.record] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun record(record: JsonField<Boolean>) = apply { this.record = record }

                /** The number of channels in the final recording. Defaults to `mono`. */
                fun recordingChannels(recordingChannels: RecordingChannels) =
                    recordingChannels(JsonField.of(recordingChannels))

                /**
                 * Sets [Builder.recordingChannels] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordingChannels] with a well-typed
                 * [RecordingChannels] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun recordingChannels(recordingChannels: JsonField<RecordingChannels>) = apply {
                    this.recordingChannels = recordingChannels
                }

                /** The URL the recording callbacks will be sent to. */
                fun recordingStatusCallback(recordingStatusCallback: String) =
                    recordingStatusCallback(JsonField.of(recordingStatusCallback))

                /**
                 * Sets [Builder.recordingStatusCallback] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordingStatusCallback] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun recordingStatusCallback(recordingStatusCallback: JsonField<String>) = apply {
                    this.recordingStatusCallback = recordingStatusCallback
                }

                /**
                 * The changes to the recording's state that should generate a call to
                 * `RecoridngStatusCallback`. Can be: `in-progress`, `completed` and `absent`.
                 * Separate multiple values with a space. Defaults to `completed`.
                 */
                fun recordingStatusCallbackEvent(recordingStatusCallbackEvent: String) =
                    recordingStatusCallbackEvent(JsonField.of(recordingStatusCallbackEvent))

                /**
                 * Sets [Builder.recordingStatusCallbackEvent] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordingStatusCallbackEvent] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun recordingStatusCallbackEvent(recordingStatusCallbackEvent: JsonField<String>) =
                    apply {
                        this.recordingStatusCallbackEvent = recordingStatusCallbackEvent
                    }

                /** HTTP request type used for `RecordingStatusCallback`. Defaults to `POST`. */
                fun recordingStatusCallbackMethod(
                    recordingStatusCallbackMethod: RecordingStatusCallbackMethod
                ) = recordingStatusCallbackMethod(JsonField.of(recordingStatusCallbackMethod))

                /**
                 * Sets [Builder.recordingStatusCallbackMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordingStatusCallbackMethod] with a well-typed
                 * [RecordingStatusCallbackMethod] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun recordingStatusCallbackMethod(
                    recordingStatusCallbackMethod: JsonField<RecordingStatusCallbackMethod>
                ) = apply { this.recordingStatusCallbackMethod = recordingStatusCallbackMethod }

                /**
                 * The number of seconds that Telnyx will wait for the recording to be stopped if
                 * silence is detected. The timer only starts when the speech is detected. Please
                 * note that the transcription is used to detect silence and the related charge will
                 * be applied. The minimum value is 0. The default value is 0 (infinite)
                 */
                fun recordingTimeout(recordingTimeout: Long) =
                    recordingTimeout(JsonField.of(recordingTimeout))

                /**
                 * Sets [Builder.recordingTimeout] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordingTimeout] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun recordingTimeout(recordingTimeout: JsonField<Long>) = apply {
                    this.recordingTimeout = recordingTimeout
                }

                /** The audio track to record for the call. The default is `both`. */
                fun recordingTrack(recordingTrack: RecordingTrack) =
                    recordingTrack(JsonField.of(recordingTrack))

                /**
                 * Sets [Builder.recordingTrack] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordingTrack] with a well-typed
                 * [RecordingTrack] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun recordingTrack(recordingTrack: JsonField<RecordingTrack>) = apply {
                    this.recordingTrack = recordingTrack
                }

                /** Whether to send RecordingUrl in webhooks. */
                fun sendRecordingUrl(sendRecordingUrl: Boolean) =
                    sendRecordingUrl(JsonField.of(sendRecordingUrl))

                /**
                 * Sets [Builder.sendRecordingUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sendRecordingUrl] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun sendRecordingUrl(sendRecordingUrl: JsonField<Boolean>) = apply {
                    this.sendRecordingUrl = sendRecordingUrl
                }

                /** The password to use for SIP authentication. */
                fun sipAuthPassword(sipAuthPassword: String) =
                    sipAuthPassword(JsonField.of(sipAuthPassword))

                /**
                 * Sets [Builder.sipAuthPassword] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sipAuthPassword] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun sipAuthPassword(sipAuthPassword: JsonField<String>) = apply {
                    this.sipAuthPassword = sipAuthPassword
                }

                /** The username to use for SIP authentication. */
                fun sipAuthUsername(sipAuthUsername: String) =
                    sipAuthUsername(JsonField.of(sipAuthUsername))

                /**
                 * Sets [Builder.sipAuthUsername] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sipAuthUsername] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun sipAuthUsername(sipAuthUsername: JsonField<String>) = apply {
                    this.sipAuthUsername = sipAuthUsername
                }

                /** Defines the SIP region to be used for the call. */
                fun sipRegion(sipRegion: SipRegion) = sipRegion(JsonField.of(sipRegion))

                /**
                 * Sets [Builder.sipRegion] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sipRegion] with a well-typed [SipRegion] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sipRegion(sipRegion: JsonField<SipRegion>) = apply {
                    this.sipRegion = sipRegion
                }

                /** URL destination for Telnyx to send status callback events to for the call. */
                fun statusCallback(statusCallback: String) =
                    statusCallback(JsonField.of(statusCallback))

                /**
                 * Sets [Builder.statusCallback] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.statusCallback] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun statusCallback(statusCallback: JsonField<String>) = apply {
                    this.statusCallback = statusCallback
                }

                /**
                 * The call events for which Telnyx should send a webhook. Multiple events can be
                 * defined when separated by a space.
                 */
                fun statusCallbackEvent(statusCallbackEvent: StatusCallbackEvent) =
                    statusCallbackEvent(JsonField.of(statusCallbackEvent))

                /**
                 * Sets [Builder.statusCallbackEvent] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.statusCallbackEvent] with a well-typed
                 * [StatusCallbackEvent] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun statusCallbackEvent(statusCallbackEvent: JsonField<StatusCallbackEvent>) =
                    apply {
                        this.statusCallbackEvent = statusCallbackEvent
                    }

                /** HTTP request type used for `StatusCallback`. */
                fun statusCallbackMethod(statusCallbackMethod: StatusCallbackMethod) =
                    statusCallbackMethod(JsonField.of(statusCallbackMethod))

                /**
                 * Sets [Builder.statusCallbackMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.statusCallbackMethod] with a well-typed
                 * [StatusCallbackMethod] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun statusCallbackMethod(statusCallbackMethod: JsonField<StatusCallbackMethod>) =
                    apply {
                        this.statusCallbackMethod = statusCallbackMethod
                    }

                /**
                 * The call control ID of the existing call to supervise. When provided, the created
                 * leg will be added to the specified call in supervising mode. Status callbacks and
                 * action callbacks will NOT be sent for the supervising leg.
                 */
                fun superviseCallSid(superviseCallSid: String) =
                    superviseCallSid(JsonField.of(superviseCallSid))

                /**
                 * Sets [Builder.superviseCallSid] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.superviseCallSid] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun superviseCallSid(superviseCallSid: JsonField<String>) = apply {
                    this.superviseCallSid = superviseCallSid
                }

                /**
                 * The supervising role for the new leg. Determines the audio behavior: barge (hear
                 * both sides), whisper (only hear supervisor), monitor (hear both sides but
                 * supervisor muted). Default: barge
                 */
                fun supervisingRole(supervisingRole: SupervisingRole) =
                    supervisingRole(JsonField.of(supervisingRole))

                /**
                 * Sets [Builder.supervisingRole] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.supervisingRole] with a well-typed
                 * [SupervisingRole] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun supervisingRole(supervisingRole: JsonField<SupervisingRole>) = apply {
                    this.supervisingRole = supervisingRole
                }

                /**
                 * The maximum duration of the call in seconds. The minimum value is 30 and the
                 * maximum value is 14400 (4 hours). Default is 14400 seconds.
                 */
                fun timeLimit(timeLimit: Long) = timeLimit(JsonField.of(timeLimit))

                /**
                 * Sets [Builder.timeLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timeLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun timeLimit(timeLimit: JsonField<Long>) = apply { this.timeLimit = timeLimit }

                /**
                 * The number of seconds to wait for the called party to answer the call before the
                 * call is canceled. The minimum value is 5 and the maximum value is 120. Default is
                 * 30 seconds.
                 */
                fun timeout(timeout: Long) = timeout(JsonField.of(timeout))

                /**
                 * Sets [Builder.timeout] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timeout] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun timeout(timeout: JsonField<Long>) = apply { this.timeout = timeout }

                /**
                 * The phone number of the called party. Phone numbers are formatted with a `+` and
                 * country code.
                 */
                fun to(to: String) = to(JsonField.of(to))

                /**
                 * Sets [Builder.to] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.to] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun to(to: JsonField<String>) = apply { this.to = to }

                /**
                 * Whether to trim any leading and trailing silence from the recording. Defaults to
                 * `trim-silence`.
                 */
                fun trim(trim: Trim) = trim(JsonField.of(trim))

                /**
                 * Sets [Builder.trim] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.trim] with a well-typed [Trim] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun trim(trim: JsonField<Trim>) = apply { this.trim = trim }

                fun url(url: JsonValue) = apply { this.url = url }

                /**
                 * HTTP request type used for `Url`. The default value is inherited from TeXML
                 * Application setting.
                 */
                fun urlMethod(urlMethod: UrlMethod) = urlMethod(JsonField.of(urlMethod))

                /**
                 * Sets [Builder.urlMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.urlMethod] with a well-typed [UrlMethod] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun urlMethod(urlMethod: JsonField<UrlMethod>) = apply {
                    this.urlMethod = urlMethod
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
                 * Returns an immutable instance of [WithTeXml].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .texml()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): WithTeXml =
                    WithTeXml(
                        checkRequired("texml", texml),
                        applicationSid,
                        asyncAmd,
                        asyncAmdStatusCallback,
                        asyncAmdStatusCallbackMethod,
                        callerId,
                        cancelPlaybackOnDetectMessageEnd,
                        cancelPlaybackOnMachineDetection,
                        (customHeaders ?: JsonMissing.of()).map { it.toImmutable() },
                        detectionMode,
                        fallbackUrl,
                        from,
                        machineDetection,
                        machineDetectionSilenceTimeout,
                        machineDetectionSpeechEndThreshold,
                        machineDetectionSpeechThreshold,
                        machineDetectionTimeout,
                        mediaEncryption,
                        preferredCodecs,
                        record,
                        recordingChannels,
                        recordingStatusCallback,
                        recordingStatusCallbackEvent,
                        recordingStatusCallbackMethod,
                        recordingTimeout,
                        recordingTrack,
                        sendRecordingUrl,
                        sipAuthPassword,
                        sipAuthUsername,
                        sipRegion,
                        statusCallback,
                        statusCallbackEvent,
                        statusCallbackMethod,
                        superviseCallSid,
                        supervisingRole,
                        timeLimit,
                        timeout,
                        to,
                        trim,
                        url,
                        urlMethod,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): WithTeXml = apply {
                if (validated) {
                    return@apply
                }

                texml()
                applicationSid()
                asyncAmd()
                asyncAmdStatusCallback()
                asyncAmdStatusCallbackMethod().ifPresent { it.validate() }
                callerId()
                cancelPlaybackOnDetectMessageEnd()
                cancelPlaybackOnMachineDetection()
                customHeaders().ifPresent { it.forEach { it.validate() } }
                detectionMode().ifPresent { it.validate() }
                fallbackUrl()
                from()
                machineDetection().ifPresent { it.validate() }
                machineDetectionSilenceTimeout()
                machineDetectionSpeechEndThreshold()
                machineDetectionSpeechThreshold()
                machineDetectionTimeout()
                mediaEncryption().ifPresent { it.validate() }
                preferredCodecs()
                record()
                recordingChannels().ifPresent { it.validate() }
                recordingStatusCallback()
                recordingStatusCallbackEvent()
                recordingStatusCallbackMethod().ifPresent { it.validate() }
                recordingTimeout()
                recordingTrack().ifPresent { it.validate() }
                sendRecordingUrl()
                sipAuthPassword()
                sipAuthUsername()
                sipRegion().ifPresent { it.validate() }
                statusCallback()
                statusCallbackEvent().ifPresent { it.validate() }
                statusCallbackMethod().ifPresent { it.validate() }
                superviseCallSid()
                supervisingRole().ifPresent { it.validate() }
                timeLimit()
                timeout()
                to()
                trim().ifPresent { it.validate() }
                urlMethod().ifPresent { it.validate() }
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
                (if (texml.asKnown().isPresent) 1 else 0) +
                    (if (applicationSid.asKnown().isPresent) 1 else 0) +
                    (if (asyncAmd.asKnown().isPresent) 1 else 0) +
                    (if (asyncAmdStatusCallback.asKnown().isPresent) 1 else 0) +
                    (asyncAmdStatusCallbackMethod.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (callerId.asKnown().isPresent) 1 else 0) +
                    (if (cancelPlaybackOnDetectMessageEnd.asKnown().isPresent) 1 else 0) +
                    (if (cancelPlaybackOnMachineDetection.asKnown().isPresent) 1 else 0) +
                    (customHeaders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (detectionMode.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (fallbackUrl.asKnown().isPresent) 1 else 0) +
                    (if (from.asKnown().isPresent) 1 else 0) +
                    (machineDetection.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (machineDetectionSilenceTimeout.asKnown().isPresent) 1 else 0) +
                    (if (machineDetectionSpeechEndThreshold.asKnown().isPresent) 1 else 0) +
                    (if (machineDetectionSpeechThreshold.asKnown().isPresent) 1 else 0) +
                    (if (machineDetectionTimeout.asKnown().isPresent) 1 else 0) +
                    (mediaEncryption.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (preferredCodecs.asKnown().isPresent) 1 else 0) +
                    (if (record.asKnown().isPresent) 1 else 0) +
                    (recordingChannels.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (recordingStatusCallback.asKnown().isPresent) 1 else 0) +
                    (if (recordingStatusCallbackEvent.asKnown().isPresent) 1 else 0) +
                    (recordingStatusCallbackMethod.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (recordingTimeout.asKnown().isPresent) 1 else 0) +
                    (recordingTrack.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (sendRecordingUrl.asKnown().isPresent) 1 else 0) +
                    (if (sipAuthPassword.asKnown().isPresent) 1 else 0) +
                    (if (sipAuthUsername.asKnown().isPresent) 1 else 0) +
                    (sipRegion.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (statusCallback.asKnown().isPresent) 1 else 0) +
                    (statusCallbackEvent.asKnown().getOrNull()?.validity() ?: 0) +
                    (statusCallbackMethod.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (superviseCallSid.asKnown().isPresent) 1 else 0) +
                    (supervisingRole.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (timeLimit.asKnown().isPresent) 1 else 0) +
                    (if (timeout.asKnown().isPresent) 1 else 0) +
                    (if (to.asKnown().isPresent) 1 else 0) +
                    (trim.asKnown().getOrNull()?.validity() ?: 0) +
                    (urlMethod.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * HTTP request type used for `AsyncAmdStatusCallback`. The default value is inherited
             * from TeXML Application setting.
             */
            class AsyncAmdStatusCallbackMethod
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val GET = of("GET")

                    @JvmField val POST = of("POST")

                    @JvmStatic
                    fun of(value: String) = AsyncAmdStatusCallbackMethod(JsonField.of(value))
                }

                /** An enum containing [AsyncAmdStatusCallbackMethod]'s known values. */
                enum class Known {
                    GET,
                    POST,
                }

                /**
                 * An enum containing [AsyncAmdStatusCallbackMethod]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [AsyncAmdStatusCallbackMethod] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    GET,
                    POST,
                    /**
                     * An enum member indicating that [AsyncAmdStatusCallbackMethod] was
                     * instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        GET -> Value.GET
                        POST -> Value.POST
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        GET -> Known.GET
                        POST -> Known.POST
                        else ->
                            throw TelnyxInvalidDataException(
                                "Unknown AsyncAmdStatusCallbackMethod: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): AsyncAmdStatusCallbackMethod = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AsyncAmdStatusCallbackMethod && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class CustomHeader
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val name: JsonField<String>,
                private val value: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<String> = JsonMissing.of(),
                ) : this(name, value, mutableMapOf())

                /**
                 * The name of the custom header
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * The value of the custom header
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun value(): String = value.getRequired("value")

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                     * Returns a mutable builder for constructing an instance of [CustomHeader].
                     *
                     * The following fields are required:
                     * ```java
                     * .name()
                     * .value()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CustomHeader]. */
                class Builder internal constructor() {

                    private var name: JsonField<String>? = null
                    private var value: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(customHeader: CustomHeader) = apply {
                        name = customHeader.name
                        value = customHeader.value
                        additionalProperties = customHeader.additionalProperties.toMutableMap()
                    }

                    /** The name of the custom header */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /** The value of the custom header */
                    fun value(value: String) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<String>) = apply { this.value = value }

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
                     * Returns an immutable instance of [CustomHeader].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .name()
                     * .value()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): CustomHeader =
                        CustomHeader(
                            checkRequired("name", name),
                            checkRequired("value", value),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): CustomHeader = apply {
                    if (validated) {
                        return@apply
                    }

                    name()
                    value()
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
                    (if (name.asKnown().isPresent) 1 else 0) +
                        (if (value.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CustomHeader &&
                        name == other.name &&
                        value == other.value &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(name, value, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CustomHeader{name=$name, value=$value, additionalProperties=$additionalProperties}"
            }

            /** Allows you to chose between Premium and Standard detections. */
            class DetectionMode
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PREMIUM = of("Premium")

                    @JvmField val REGULAR = of("Regular")

                    @JvmStatic fun of(value: String) = DetectionMode(JsonField.of(value))
                }

                /** An enum containing [DetectionMode]'s known values. */
                enum class Known {
                    PREMIUM,
                    REGULAR,
                }

                /**
                 * An enum containing [DetectionMode]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [DetectionMode] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PREMIUM,
                    REGULAR,
                    /**
                     * An enum member indicating that [DetectionMode] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PREMIUM -> Value.PREMIUM
                        REGULAR -> Value.REGULAR
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        PREMIUM -> Known.PREMIUM
                        REGULAR -> Known.REGULAR
                        else -> throw TelnyxInvalidDataException("Unknown DetectionMode: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): DetectionMode = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is DetectionMode && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Enables Answering Machine Detection. */
            class MachineDetection
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ENABLE = of("Enable")

                    @JvmField val DISABLE = of("Disable")

                    @JvmField val DETECT_MESSAGE_END = of("DetectMessageEnd")

                    @JvmStatic fun of(value: String) = MachineDetection(JsonField.of(value))
                }

                /** An enum containing [MachineDetection]'s known values. */
                enum class Known {
                    ENABLE,
                    DISABLE,
                    DETECT_MESSAGE_END,
                }

                /**
                 * An enum containing [MachineDetection]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [MachineDetection] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ENABLE,
                    DISABLE,
                    DETECT_MESSAGE_END,
                    /**
                     * An enum member indicating that [MachineDetection] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ENABLE -> Value.ENABLE
                        DISABLE -> Value.DISABLE
                        DETECT_MESSAGE_END -> Value.DETECT_MESSAGE_END
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ENABLE -> Known.ENABLE
                        DISABLE -> Known.DISABLE
                        DETECT_MESSAGE_END -> Known.DETECT_MESSAGE_END
                        else -> throw TelnyxInvalidDataException("Unknown MachineDetection: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): MachineDetection = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is MachineDetection && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Defines whether media should be encrypted on the call. When set to `SRTP`, the call
             * will use Secure Real-time Transport Protocol for media encryption. When set to
             * `DTLS`, the call will use DTLS for media encryption. Only supported for SIP
             * destinations.
             */
            class MediaEncryption
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val DISABLED = of("disabled")

                    @JvmField val SRTP = of("SRTP")

                    @JvmField val DTLS = of("DTLS")

                    @JvmStatic fun of(value: String) = MediaEncryption(JsonField.of(value))
                }

                /** An enum containing [MediaEncryption]'s known values. */
                enum class Known {
                    DISABLED,
                    SRTP,
                    DTLS,
                }

                /**
                 * An enum containing [MediaEncryption]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [MediaEncryption] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DISABLED,
                    SRTP,
                    DTLS,
                    /**
                     * An enum member indicating that [MediaEncryption] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        DISABLED -> Value.DISABLED
                        SRTP -> Value.SRTP
                        DTLS -> Value.DTLS
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        DISABLED -> Known.DISABLED
                        SRTP -> Known.SRTP
                        DTLS -> Known.DTLS
                        else -> throw TelnyxInvalidDataException("Unknown MediaEncryption: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): MediaEncryption = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is MediaEncryption && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** The number of channels in the final recording. Defaults to `mono`. */
            class RecordingChannels
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val MONO = of("mono")

                    @JvmField val DUAL = of("dual")

                    @JvmStatic fun of(value: String) = RecordingChannels(JsonField.of(value))
                }

                /** An enum containing [RecordingChannels]'s known values. */
                enum class Known {
                    MONO,
                    DUAL,
                }

                /**
                 * An enum containing [RecordingChannels]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [RecordingChannels] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MONO,
                    DUAL,
                    /**
                     * An enum member indicating that [RecordingChannels] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        MONO -> Value.MONO
                        DUAL -> Value.DUAL
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        MONO -> Known.MONO
                        DUAL -> Known.DUAL
                        else ->
                            throw TelnyxInvalidDataException("Unknown RecordingChannels: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): RecordingChannels = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RecordingChannels && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** HTTP request type used for `RecordingStatusCallback`. Defaults to `POST`. */
            class RecordingStatusCallbackMethod
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val GET = of("GET")

                    @JvmField val POST = of("POST")

                    @JvmStatic
                    fun of(value: String) = RecordingStatusCallbackMethod(JsonField.of(value))
                }

                /** An enum containing [RecordingStatusCallbackMethod]'s known values. */
                enum class Known {
                    GET,
                    POST,
                }

                /**
                 * An enum containing [RecordingStatusCallbackMethod]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [RecordingStatusCallbackMethod] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    GET,
                    POST,
                    /**
                     * An enum member indicating that [RecordingStatusCallbackMethod] was
                     * instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        GET -> Value.GET
                        POST -> Value.POST
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        GET -> Known.GET
                        POST -> Known.POST
                        else ->
                            throw TelnyxInvalidDataException(
                                "Unknown RecordingStatusCallbackMethod: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): RecordingStatusCallbackMethod = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RecordingStatusCallbackMethod && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** The audio track to record for the call. The default is `both`. */
            class RecordingTrack
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val INBOUND = of("inbound")

                    @JvmField val OUTBOUND = of("outbound")

                    @JvmField val BOTH = of("both")

                    @JvmStatic fun of(value: String) = RecordingTrack(JsonField.of(value))
                }

                /** An enum containing [RecordingTrack]'s known values. */
                enum class Known {
                    INBOUND,
                    OUTBOUND,
                    BOTH,
                }

                /**
                 * An enum containing [RecordingTrack]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [RecordingTrack] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INBOUND,
                    OUTBOUND,
                    BOTH,
                    /**
                     * An enum member indicating that [RecordingTrack] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        INBOUND -> Value.INBOUND
                        OUTBOUND -> Value.OUTBOUND
                        BOTH -> Value.BOTH
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        INBOUND -> Known.INBOUND
                        OUTBOUND -> Known.OUTBOUND
                        BOTH -> Known.BOTH
                        else -> throw TelnyxInvalidDataException("Unknown RecordingTrack: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): RecordingTrack = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RecordingTrack && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Defines the SIP region to be used for the call. */
            class SipRegion @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val US = of("US")

                    @JvmField val EUROPE = of("Europe")

                    @JvmField val CANADA = of("Canada")

                    @JvmField val AUSTRALIA = of("Australia")

                    @JvmField val MIDDLE_EAST = of("Middle East")

                    @JvmStatic fun of(value: String) = SipRegion(JsonField.of(value))
                }

                /** An enum containing [SipRegion]'s known values. */
                enum class Known {
                    US,
                    EUROPE,
                    CANADA,
                    AUSTRALIA,
                    MIDDLE_EAST,
                }

                /**
                 * An enum containing [SipRegion]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [SipRegion] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    US,
                    EUROPE,
                    CANADA,
                    AUSTRALIA,
                    MIDDLE_EAST,
                    /**
                     * An enum member indicating that [SipRegion] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        US -> Value.US
                        EUROPE -> Value.EUROPE
                        CANADA -> Value.CANADA
                        AUSTRALIA -> Value.AUSTRALIA
                        MIDDLE_EAST -> Value.MIDDLE_EAST
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        US -> Known.US
                        EUROPE -> Known.EUROPE
                        CANADA -> Known.CANADA
                        AUSTRALIA -> Known.AUSTRALIA
                        MIDDLE_EAST -> Known.MIDDLE_EAST
                        else -> throw TelnyxInvalidDataException("Unknown SipRegion: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): SipRegion = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SipRegion && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * The call events for which Telnyx should send a webhook. Multiple events can be
             * defined when separated by a space.
             */
            class StatusCallbackEvent
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val INITIATED = of("initiated")

                    @JvmField val RINGING = of("ringing")

                    @JvmField val ANSWERED = of("answered")

                    @JvmField val COMPLETED = of("completed")

                    @JvmStatic fun of(value: String) = StatusCallbackEvent(JsonField.of(value))
                }

                /** An enum containing [StatusCallbackEvent]'s known values. */
                enum class Known {
                    INITIATED,
                    RINGING,
                    ANSWERED,
                    COMPLETED,
                }

                /**
                 * An enum containing [StatusCallbackEvent]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [StatusCallbackEvent] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INITIATED,
                    RINGING,
                    ANSWERED,
                    COMPLETED,
                    /**
                     * An enum member indicating that [StatusCallbackEvent] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        INITIATED -> Value.INITIATED
                        RINGING -> Value.RINGING
                        ANSWERED -> Value.ANSWERED
                        COMPLETED -> Value.COMPLETED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        INITIATED -> Known.INITIATED
                        RINGING -> Known.RINGING
                        ANSWERED -> Known.ANSWERED
                        COMPLETED -> Known.COMPLETED
                        else ->
                            throw TelnyxInvalidDataException("Unknown StatusCallbackEvent: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): StatusCallbackEvent = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is StatusCallbackEvent && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** HTTP request type used for `StatusCallback`. */
            class StatusCallbackMethod
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val GET = of("GET")

                    @JvmField val POST = of("POST")

                    @JvmStatic fun of(value: String) = StatusCallbackMethod(JsonField.of(value))
                }

                /** An enum containing [StatusCallbackMethod]'s known values. */
                enum class Known {
                    GET,
                    POST,
                }

                /**
                 * An enum containing [StatusCallbackMethod]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [StatusCallbackMethod] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    GET,
                    POST,
                    /**
                     * An enum member indicating that [StatusCallbackMethod] was instantiated with
                     * an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        GET -> Value.GET
                        POST -> Value.POST
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        GET -> Known.GET
                        POST -> Known.POST
                        else ->
                            throw TelnyxInvalidDataException("Unknown StatusCallbackMethod: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): StatusCallbackMethod = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is StatusCallbackMethod && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * The supervising role for the new leg. Determines the audio behavior: barge (hear both
             * sides), whisper (only hear supervisor), monitor (hear both sides but supervisor
             * muted). Default: barge
             */
            class SupervisingRole
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val BARGE = of("barge")

                    @JvmField val WHISPER = of("whisper")

                    @JvmField val MONITOR = of("monitor")

                    @JvmStatic fun of(value: String) = SupervisingRole(JsonField.of(value))
                }

                /** An enum containing [SupervisingRole]'s known values. */
                enum class Known {
                    BARGE,
                    WHISPER,
                    MONITOR,
                }

                /**
                 * An enum containing [SupervisingRole]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [SupervisingRole] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    BARGE,
                    WHISPER,
                    MONITOR,
                    /**
                     * An enum member indicating that [SupervisingRole] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        BARGE -> Value.BARGE
                        WHISPER -> Value.WHISPER
                        MONITOR -> Value.MONITOR
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        BARGE -> Known.BARGE
                        WHISPER -> Known.WHISPER
                        MONITOR -> Known.MONITOR
                        else -> throw TelnyxInvalidDataException("Unknown SupervisingRole: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): SupervisingRole = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SupervisingRole && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Whether to trim any leading and trailing silence from the recording. Defaults to
             * `trim-silence`.
             */
            class Trim @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val TRIM_SILENCE = of("trim-silence")

                    @JvmField val DO_NOT_TRIM = of("do-not-trim")

                    @JvmStatic fun of(value: String) = Trim(JsonField.of(value))
                }

                /** An enum containing [Trim]'s known values. */
                enum class Known {
                    TRIM_SILENCE,
                    DO_NOT_TRIM,
                }

                /**
                 * An enum containing [Trim]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Trim] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TRIM_SILENCE,
                    DO_NOT_TRIM,
                    /**
                     * An enum member indicating that [Trim] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        TRIM_SILENCE -> Value.TRIM_SILENCE
                        DO_NOT_TRIM -> Value.DO_NOT_TRIM
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        TRIM_SILENCE -> Known.TRIM_SILENCE
                        DO_NOT_TRIM -> Known.DO_NOT_TRIM
                        else -> throw TelnyxInvalidDataException("Unknown Trim: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Trim = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Trim && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * HTTP request type used for `Url`. The default value is inherited from TeXML
             * Application setting.
             */
            class UrlMethod @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val GET = of("GET")

                    @JvmField val POST = of("POST")

                    @JvmStatic fun of(value: String) = UrlMethod(JsonField.of(value))
                }

                /** An enum containing [UrlMethod]'s known values. */
                enum class Known {
                    GET,
                    POST,
                }

                /**
                 * An enum containing [UrlMethod]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [UrlMethod] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    GET,
                    POST,
                    /**
                     * An enum member indicating that [UrlMethod] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        GET -> Value.GET
                        POST -> Value.POST
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        GET -> Known.GET
                        POST -> Known.POST
                        else -> throw TelnyxInvalidDataException("Unknown UrlMethod: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): UrlMethod = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is UrlMethod && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is WithTeXml &&
                    texml == other.texml &&
                    applicationSid == other.applicationSid &&
                    asyncAmd == other.asyncAmd &&
                    asyncAmdStatusCallback == other.asyncAmdStatusCallback &&
                    asyncAmdStatusCallbackMethod == other.asyncAmdStatusCallbackMethod &&
                    callerId == other.callerId &&
                    cancelPlaybackOnDetectMessageEnd == other.cancelPlaybackOnDetectMessageEnd &&
                    cancelPlaybackOnMachineDetection == other.cancelPlaybackOnMachineDetection &&
                    customHeaders == other.customHeaders &&
                    detectionMode == other.detectionMode &&
                    fallbackUrl == other.fallbackUrl &&
                    from == other.from &&
                    machineDetection == other.machineDetection &&
                    machineDetectionSilenceTimeout == other.machineDetectionSilenceTimeout &&
                    machineDetectionSpeechEndThreshold ==
                        other.machineDetectionSpeechEndThreshold &&
                    machineDetectionSpeechThreshold == other.machineDetectionSpeechThreshold &&
                    machineDetectionTimeout == other.machineDetectionTimeout &&
                    mediaEncryption == other.mediaEncryption &&
                    preferredCodecs == other.preferredCodecs &&
                    record == other.record &&
                    recordingChannels == other.recordingChannels &&
                    recordingStatusCallback == other.recordingStatusCallback &&
                    recordingStatusCallbackEvent == other.recordingStatusCallbackEvent &&
                    recordingStatusCallbackMethod == other.recordingStatusCallbackMethod &&
                    recordingTimeout == other.recordingTimeout &&
                    recordingTrack == other.recordingTrack &&
                    sendRecordingUrl == other.sendRecordingUrl &&
                    sipAuthPassword == other.sipAuthPassword &&
                    sipAuthUsername == other.sipAuthUsername &&
                    sipRegion == other.sipRegion &&
                    statusCallback == other.statusCallback &&
                    statusCallbackEvent == other.statusCallbackEvent &&
                    statusCallbackMethod == other.statusCallbackMethod &&
                    superviseCallSid == other.superviseCallSid &&
                    supervisingRole == other.supervisingRole &&
                    timeLimit == other.timeLimit &&
                    timeout == other.timeout &&
                    to == other.to &&
                    trim == other.trim &&
                    url == other.url &&
                    urlMethod == other.urlMethod &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    texml,
                    applicationSid,
                    asyncAmd,
                    asyncAmdStatusCallback,
                    asyncAmdStatusCallbackMethod,
                    callerId,
                    cancelPlaybackOnDetectMessageEnd,
                    cancelPlaybackOnMachineDetection,
                    customHeaders,
                    detectionMode,
                    fallbackUrl,
                    from,
                    machineDetection,
                    machineDetectionSilenceTimeout,
                    machineDetectionSpeechEndThreshold,
                    machineDetectionSpeechThreshold,
                    machineDetectionTimeout,
                    mediaEncryption,
                    preferredCodecs,
                    record,
                    recordingChannels,
                    recordingStatusCallback,
                    recordingStatusCallbackEvent,
                    recordingStatusCallbackMethod,
                    recordingTimeout,
                    recordingTrack,
                    sendRecordingUrl,
                    sipAuthPassword,
                    sipAuthUsername,
                    sipRegion,
                    statusCallback,
                    statusCallbackEvent,
                    statusCallbackMethod,
                    superviseCallSid,
                    supervisingRole,
                    timeLimit,
                    timeout,
                    to,
                    trim,
                    url,
                    urlMethod,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "WithTeXml{texml=$texml, applicationSid=$applicationSid, asyncAmd=$asyncAmd, asyncAmdStatusCallback=$asyncAmdStatusCallback, asyncAmdStatusCallbackMethod=$asyncAmdStatusCallbackMethod, callerId=$callerId, cancelPlaybackOnDetectMessageEnd=$cancelPlaybackOnDetectMessageEnd, cancelPlaybackOnMachineDetection=$cancelPlaybackOnMachineDetection, customHeaders=$customHeaders, detectionMode=$detectionMode, fallbackUrl=$fallbackUrl, from=$from, machineDetection=$machineDetection, machineDetectionSilenceTimeout=$machineDetectionSilenceTimeout, machineDetectionSpeechEndThreshold=$machineDetectionSpeechEndThreshold, machineDetectionSpeechThreshold=$machineDetectionSpeechThreshold, machineDetectionTimeout=$machineDetectionTimeout, mediaEncryption=$mediaEncryption, preferredCodecs=$preferredCodecs, record=$record, recordingChannels=$recordingChannels, recordingStatusCallback=$recordingStatusCallback, recordingStatusCallbackEvent=$recordingStatusCallbackEvent, recordingStatusCallbackMethod=$recordingStatusCallbackMethod, recordingTimeout=$recordingTimeout, recordingTrack=$recordingTrack, sendRecordingUrl=$sendRecordingUrl, sipAuthPassword=$sipAuthPassword, sipAuthUsername=$sipAuthUsername, sipRegion=$sipRegion, statusCallback=$statusCallback, statusCallbackEvent=$statusCallbackEvent, statusCallbackMethod=$statusCallbackMethod, superviseCallSid=$superviseCallSid, supervisingRole=$supervisingRole, timeLimit=$timeLimit, timeout=$timeout, to=$to, trim=$trim, url=$url, urlMethod=$urlMethod, additionalProperties=$additionalProperties}"
        }

        class ApplicationDefault
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val applicationSid: JsonField<String>,
            private val asyncAmd: JsonField<Boolean>,
            private val asyncAmdStatusCallback: JsonField<String>,
            private val asyncAmdStatusCallbackMethod: JsonField<AsyncAmdStatusCallbackMethod>,
            private val callerId: JsonField<String>,
            private val cancelPlaybackOnDetectMessageEnd: JsonField<Boolean>,
            private val cancelPlaybackOnMachineDetection: JsonField<Boolean>,
            private val customHeaders: JsonField<List<CustomHeader>>,
            private val detectionMode: JsonField<DetectionMode>,
            private val fallbackUrl: JsonField<String>,
            private val from: JsonField<String>,
            private val machineDetection: JsonField<MachineDetection>,
            private val machineDetectionSilenceTimeout: JsonField<Long>,
            private val machineDetectionSpeechEndThreshold: JsonField<Long>,
            private val machineDetectionSpeechThreshold: JsonField<Long>,
            private val machineDetectionTimeout: JsonField<Long>,
            private val mediaEncryption: JsonField<MediaEncryption>,
            private val preferredCodecs: JsonField<String>,
            private val record: JsonField<Boolean>,
            private val recordingChannels: JsonField<RecordingChannels>,
            private val recordingStatusCallback: JsonField<String>,
            private val recordingStatusCallbackEvent: JsonField<String>,
            private val recordingStatusCallbackMethod: JsonField<RecordingStatusCallbackMethod>,
            private val recordingTimeout: JsonField<Long>,
            private val recordingTrack: JsonField<RecordingTrack>,
            private val sendRecordingUrl: JsonField<Boolean>,
            private val sipAuthPassword: JsonField<String>,
            private val sipAuthUsername: JsonField<String>,
            private val sipRegion: JsonField<SipRegion>,
            private val statusCallback: JsonField<String>,
            private val statusCallbackEvent: JsonField<StatusCallbackEvent>,
            private val statusCallbackMethod: JsonField<StatusCallbackMethod>,
            private val superviseCallSid: JsonField<String>,
            private val supervisingRole: JsonField<SupervisingRole>,
            private val texml: JsonValue,
            private val timeLimit: JsonField<Long>,
            private val timeout: JsonField<Long>,
            private val to: JsonField<String>,
            private val trim: JsonField<Trim>,
            private val url: JsonValue,
            private val urlMethod: JsonField<UrlMethod>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("ApplicationSid")
                @ExcludeMissing
                applicationSid: JsonField<String> = JsonMissing.of(),
                @JsonProperty("AsyncAmd")
                @ExcludeMissing
                asyncAmd: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("AsyncAmdStatusCallback")
                @ExcludeMissing
                asyncAmdStatusCallback: JsonField<String> = JsonMissing.of(),
                @JsonProperty("AsyncAmdStatusCallbackMethod")
                @ExcludeMissing
                asyncAmdStatusCallbackMethod: JsonField<AsyncAmdStatusCallbackMethod> =
                    JsonMissing.of(),
                @JsonProperty("CallerId")
                @ExcludeMissing
                callerId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("CancelPlaybackOnDetectMessageEnd")
                @ExcludeMissing
                cancelPlaybackOnDetectMessageEnd: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("CancelPlaybackOnMachineDetection")
                @ExcludeMissing
                cancelPlaybackOnMachineDetection: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("CustomHeaders")
                @ExcludeMissing
                customHeaders: JsonField<List<CustomHeader>> = JsonMissing.of(),
                @JsonProperty("DetectionMode")
                @ExcludeMissing
                detectionMode: JsonField<DetectionMode> = JsonMissing.of(),
                @JsonProperty("FallbackUrl")
                @ExcludeMissing
                fallbackUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("From") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
                @JsonProperty("MachineDetection")
                @ExcludeMissing
                machineDetection: JsonField<MachineDetection> = JsonMissing.of(),
                @JsonProperty("MachineDetectionSilenceTimeout")
                @ExcludeMissing
                machineDetectionSilenceTimeout: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("MachineDetectionSpeechEndThreshold")
                @ExcludeMissing
                machineDetectionSpeechEndThreshold: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("MachineDetectionSpeechThreshold")
                @ExcludeMissing
                machineDetectionSpeechThreshold: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("MachineDetectionTimeout")
                @ExcludeMissing
                machineDetectionTimeout: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("MediaEncryption")
                @ExcludeMissing
                mediaEncryption: JsonField<MediaEncryption> = JsonMissing.of(),
                @JsonProperty("PreferredCodecs")
                @ExcludeMissing
                preferredCodecs: JsonField<String> = JsonMissing.of(),
                @JsonProperty("Record")
                @ExcludeMissing
                record: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("RecordingChannels")
                @ExcludeMissing
                recordingChannels: JsonField<RecordingChannels> = JsonMissing.of(),
                @JsonProperty("RecordingStatusCallback")
                @ExcludeMissing
                recordingStatusCallback: JsonField<String> = JsonMissing.of(),
                @JsonProperty("RecordingStatusCallbackEvent")
                @ExcludeMissing
                recordingStatusCallbackEvent: JsonField<String> = JsonMissing.of(),
                @JsonProperty("RecordingStatusCallbackMethod")
                @ExcludeMissing
                recordingStatusCallbackMethod: JsonField<RecordingStatusCallbackMethod> =
                    JsonMissing.of(),
                @JsonProperty("RecordingTimeout")
                @ExcludeMissing
                recordingTimeout: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("RecordingTrack")
                @ExcludeMissing
                recordingTrack: JsonField<RecordingTrack> = JsonMissing.of(),
                @JsonProperty("SendRecordingUrl")
                @ExcludeMissing
                sendRecordingUrl: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("SipAuthPassword")
                @ExcludeMissing
                sipAuthPassword: JsonField<String> = JsonMissing.of(),
                @JsonProperty("SipAuthUsername")
                @ExcludeMissing
                sipAuthUsername: JsonField<String> = JsonMissing.of(),
                @JsonProperty("SipRegion")
                @ExcludeMissing
                sipRegion: JsonField<SipRegion> = JsonMissing.of(),
                @JsonProperty("StatusCallback")
                @ExcludeMissing
                statusCallback: JsonField<String> = JsonMissing.of(),
                @JsonProperty("StatusCallbackEvent")
                @ExcludeMissing
                statusCallbackEvent: JsonField<StatusCallbackEvent> = JsonMissing.of(),
                @JsonProperty("StatusCallbackMethod")
                @ExcludeMissing
                statusCallbackMethod: JsonField<StatusCallbackMethod> = JsonMissing.of(),
                @JsonProperty("SuperviseCallSid")
                @ExcludeMissing
                superviseCallSid: JsonField<String> = JsonMissing.of(),
                @JsonProperty("SupervisingRole")
                @ExcludeMissing
                supervisingRole: JsonField<SupervisingRole> = JsonMissing.of(),
                @JsonProperty("Texml") @ExcludeMissing texml: JsonValue = JsonMissing.of(),
                @JsonProperty("TimeLimit")
                @ExcludeMissing
                timeLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("Timeout")
                @ExcludeMissing
                timeout: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("To") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
                @JsonProperty("Trim") @ExcludeMissing trim: JsonField<Trim> = JsonMissing.of(),
                @JsonProperty("Url") @ExcludeMissing url: JsonValue = JsonMissing.of(),
                @JsonProperty("UrlMethod")
                @ExcludeMissing
                urlMethod: JsonField<UrlMethod> = JsonMissing.of(),
            ) : this(
                applicationSid,
                asyncAmd,
                asyncAmdStatusCallback,
                asyncAmdStatusCallbackMethod,
                callerId,
                cancelPlaybackOnDetectMessageEnd,
                cancelPlaybackOnMachineDetection,
                customHeaders,
                detectionMode,
                fallbackUrl,
                from,
                machineDetection,
                machineDetectionSilenceTimeout,
                machineDetectionSpeechEndThreshold,
                machineDetectionSpeechThreshold,
                machineDetectionTimeout,
                mediaEncryption,
                preferredCodecs,
                record,
                recordingChannels,
                recordingStatusCallback,
                recordingStatusCallbackEvent,
                recordingStatusCallbackMethod,
                recordingTimeout,
                recordingTrack,
                sendRecordingUrl,
                sipAuthPassword,
                sipAuthUsername,
                sipRegion,
                statusCallback,
                statusCallbackEvent,
                statusCallbackMethod,
                superviseCallSid,
                supervisingRole,
                texml,
                timeLimit,
                timeout,
                to,
                trim,
                url,
                urlMethod,
                mutableMapOf(),
            )

            /**
             * The ID of the TeXML Application.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun applicationSid(): Optional<String> = applicationSid.getOptional("ApplicationSid")

            /**
             * Select whether to perform answering machine detection in the background. By default
             * execution is blocked until Answering Machine Detection is completed.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun asyncAmd(): Optional<Boolean> = asyncAmd.getOptional("AsyncAmd")

            /**
             * URL destination for Telnyx to send AMD callback events to for the call.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun asyncAmdStatusCallback(): Optional<String> =
                asyncAmdStatusCallback.getOptional("AsyncAmdStatusCallback")

            /**
             * HTTP request type used for `AsyncAmdStatusCallback`. The default value is inherited
             * from TeXML Application setting.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun asyncAmdStatusCallbackMethod(): Optional<AsyncAmdStatusCallbackMethod> =
                asyncAmdStatusCallbackMethod.getOptional("AsyncAmdStatusCallbackMethod")

            /**
             * To be used as the caller id name (SIP From Display Name) presented to the destination
             * (`To` number). The string should have a maximum of 128 characters, containing only
             * letters, numbers, spaces, and `-_~!.+` special characters. If ommited, the display
             * name will be the same as the number in the `From` field.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun callerId(): Optional<String> = callerId.getOptional("CallerId")

            /**
             * Whether to cancel ongoing playback on `greeting ended` detection. Defaults to `true`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cancelPlaybackOnDetectMessageEnd(): Optional<Boolean> =
                cancelPlaybackOnDetectMessageEnd.getOptional("CancelPlaybackOnDetectMessageEnd")

            /**
             * Whether to cancel ongoing playback on `machine` detection. Defaults to `true`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cancelPlaybackOnMachineDetection(): Optional<Boolean> =
                cancelPlaybackOnMachineDetection.getOptional("CancelPlaybackOnMachineDetection")

            /**
             * Custom HTTP headers to be sent with the call. Each header should be an object with
             * 'name' and 'value' properties.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun customHeaders(): Optional<List<CustomHeader>> =
                customHeaders.getOptional("CustomHeaders")

            /**
             * Allows you to chose between Premium and Standard detections.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun detectionMode(): Optional<DetectionMode> =
                detectionMode.getOptional("DetectionMode")

            /**
             * A failover URL for which Telnyx will retrieve the TeXML call instructions if the
             * `Url` is not responding.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun fallbackUrl(): Optional<String> = fallbackUrl.getOptional("FallbackUrl")

            /**
             * The phone number of the party that initiated the call. Phone numbers are formatted
             * with a `+` and country code.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun from(): Optional<String> = from.getOptional("From")

            /**
             * Enables Answering Machine Detection.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun machineDetection(): Optional<MachineDetection> =
                machineDetection.getOptional("MachineDetection")

            /**
             * If initial silence duration is greater than this value, consider it a machine.
             * Ignored when `premium` detection is used.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun machineDetectionSilenceTimeout(): Optional<Long> =
                machineDetectionSilenceTimeout.getOptional("MachineDetectionSilenceTimeout")

            /**
             * Silence duration threshold after a greeting message or voice for it be considered
             * human. Ignored when `premium` detection is used.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun machineDetectionSpeechEndThreshold(): Optional<Long> =
                machineDetectionSpeechEndThreshold.getOptional("MachineDetectionSpeechEndThreshold")

            /**
             * Maximum threshold of a human greeting. If greeting longer than this value, considered
             * machine. Ignored when `premium` detection is used.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun machineDetectionSpeechThreshold(): Optional<Long> =
                machineDetectionSpeechThreshold.getOptional("MachineDetectionSpeechThreshold")

            /**
             * Maximum timeout threshold in milliseconds for overall detection.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun machineDetectionTimeout(): Optional<Long> =
                machineDetectionTimeout.getOptional("MachineDetectionTimeout")

            /**
             * Defines whether media should be encrypted on the call. When set to `SRTP`, the call
             * will use Secure Real-time Transport Protocol for media encryption. When set to
             * `DTLS`, the call will use DTLS for media encryption. Only supported for SIP
             * destinations.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mediaEncryption(): Optional<MediaEncryption> =
                mediaEncryption.getOptional("MediaEncryption")

            /**
             * The list of comma-separated codecs to be offered on a call.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun preferredCodecs(): Optional<String> = preferredCodecs.getOptional("PreferredCodecs")

            /**
             * Whether to record the entire participant's call leg. Defaults to `false`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun record(): Optional<Boolean> = record.getOptional("Record")

            /**
             * The number of channels in the final recording. Defaults to `mono`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordingChannels(): Optional<RecordingChannels> =
                recordingChannels.getOptional("RecordingChannels")

            /**
             * The URL the recording callbacks will be sent to.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordingStatusCallback(): Optional<String> =
                recordingStatusCallback.getOptional("RecordingStatusCallback")

            /**
             * The changes to the recording's state that should generate a call to
             * `RecoridngStatusCallback`. Can be: `in-progress`, `completed` and `absent`. Separate
             * multiple values with a space. Defaults to `completed`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordingStatusCallbackEvent(): Optional<String> =
                recordingStatusCallbackEvent.getOptional("RecordingStatusCallbackEvent")

            /**
             * HTTP request type used for `RecordingStatusCallback`. Defaults to `POST`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordingStatusCallbackMethod(): Optional<RecordingStatusCallbackMethod> =
                recordingStatusCallbackMethod.getOptional("RecordingStatusCallbackMethod")

            /**
             * The number of seconds that Telnyx will wait for the recording to be stopped if
             * silence is detected. The timer only starts when the speech is detected. Please note
             * that the transcription is used to detect silence and the related charge will be
             * applied. The minimum value is 0. The default value is 0 (infinite)
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordingTimeout(): Optional<Long> =
                recordingTimeout.getOptional("RecordingTimeout")

            /**
             * The audio track to record for the call. The default is `both`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordingTrack(): Optional<RecordingTrack> =
                recordingTrack.getOptional("RecordingTrack")

            /**
             * Whether to send RecordingUrl in webhooks.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sendRecordingUrl(): Optional<Boolean> =
                sendRecordingUrl.getOptional("SendRecordingUrl")

            /**
             * The password to use for SIP authentication.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sipAuthPassword(): Optional<String> = sipAuthPassword.getOptional("SipAuthPassword")

            /**
             * The username to use for SIP authentication.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sipAuthUsername(): Optional<String> = sipAuthUsername.getOptional("SipAuthUsername")

            /**
             * Defines the SIP region to be used for the call.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sipRegion(): Optional<SipRegion> = sipRegion.getOptional("SipRegion")

            /**
             * URL destination for Telnyx to send status callback events to for the call.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun statusCallback(): Optional<String> = statusCallback.getOptional("StatusCallback")

            /**
             * The call events for which Telnyx should send a webhook. Multiple events can be
             * defined when separated by a space.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun statusCallbackEvent(): Optional<StatusCallbackEvent> =
                statusCallbackEvent.getOptional("StatusCallbackEvent")

            /**
             * HTTP request type used for `StatusCallback`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun statusCallbackMethod(): Optional<StatusCallbackMethod> =
                statusCallbackMethod.getOptional("StatusCallbackMethod")

            /**
             * The call control ID of the existing call to supervise. When provided, the created leg
             * will be added to the specified call in supervising mode. Status callbacks and action
             * callbacks will NOT be sent for the supervising leg.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun superviseCallSid(): Optional<String> =
                superviseCallSid.getOptional("SuperviseCallSid")

            /**
             * The supervising role for the new leg. Determines the audio behavior: barge (hear both
             * sides), whisper (only hear supervisor), monitor (hear both sides but supervisor
             * muted). Default: barge
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun supervisingRole(): Optional<SupervisingRole> =
                supervisingRole.getOptional("SupervisingRole")

            /**
             * This arbitrary value can be deserialized into a custom type using the `convert`
             * method:
             * ```java
             * MyClass myObject = applicationDefault.texml().convert(MyClass.class);
             * ```
             */
            @JsonProperty("Texml") @ExcludeMissing fun _texml(): JsonValue = texml

            /**
             * The maximum duration of the call in seconds. The minimum value is 30 and the maximum
             * value is 14400 (4 hours). Default is 14400 seconds.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun timeLimit(): Optional<Long> = timeLimit.getOptional("TimeLimit")

            /**
             * The number of seconds to wait for the called party to answer the call before the call
             * is canceled. The minimum value is 5 and the maximum value is 120. Default is 30
             * seconds.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun timeout(): Optional<Long> = timeout.getOptional("Timeout")

            /**
             * The phone number of the called party. Phone numbers are formatted with a `+` and
             * country code.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun to(): Optional<String> = to.getOptional("To")

            /**
             * Whether to trim any leading and trailing silence from the recording. Defaults to
             * `trim-silence`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun trim(): Optional<Trim> = trim.getOptional("Trim")

            /**
             * This arbitrary value can be deserialized into a custom type using the `convert`
             * method:
             * ```java
             * MyClass myObject = applicationDefault.url().convert(MyClass.class);
             * ```
             */
            @JsonProperty("Url") @ExcludeMissing fun _url(): JsonValue = url

            /**
             * HTTP request type used for `Url`. The default value is inherited from TeXML
             * Application setting.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun urlMethod(): Optional<UrlMethod> = urlMethod.getOptional("UrlMethod")

            /**
             * Returns the raw JSON value of [applicationSid].
             *
             * Unlike [applicationSid], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("ApplicationSid")
            @ExcludeMissing
            fun _applicationSid(): JsonField<String> = applicationSid

            /**
             * Returns the raw JSON value of [asyncAmd].
             *
             * Unlike [asyncAmd], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("AsyncAmd") @ExcludeMissing fun _asyncAmd(): JsonField<Boolean> = asyncAmd

            /**
             * Returns the raw JSON value of [asyncAmdStatusCallback].
             *
             * Unlike [asyncAmdStatusCallback], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("AsyncAmdStatusCallback")
            @ExcludeMissing
            fun _asyncAmdStatusCallback(): JsonField<String> = asyncAmdStatusCallback

            /**
             * Returns the raw JSON value of [asyncAmdStatusCallbackMethod].
             *
             * Unlike [asyncAmdStatusCallbackMethod], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("AsyncAmdStatusCallbackMethod")
            @ExcludeMissing
            fun _asyncAmdStatusCallbackMethod(): JsonField<AsyncAmdStatusCallbackMethod> =
                asyncAmdStatusCallbackMethod

            /**
             * Returns the raw JSON value of [callerId].
             *
             * Unlike [callerId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("CallerId") @ExcludeMissing fun _callerId(): JsonField<String> = callerId

            /**
             * Returns the raw JSON value of [cancelPlaybackOnDetectMessageEnd].
             *
             * Unlike [cancelPlaybackOnDetectMessageEnd], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("CancelPlaybackOnDetectMessageEnd")
            @ExcludeMissing
            fun _cancelPlaybackOnDetectMessageEnd(): JsonField<Boolean> =
                cancelPlaybackOnDetectMessageEnd

            /**
             * Returns the raw JSON value of [cancelPlaybackOnMachineDetection].
             *
             * Unlike [cancelPlaybackOnMachineDetection], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("CancelPlaybackOnMachineDetection")
            @ExcludeMissing
            fun _cancelPlaybackOnMachineDetection(): JsonField<Boolean> =
                cancelPlaybackOnMachineDetection

            /**
             * Returns the raw JSON value of [customHeaders].
             *
             * Unlike [customHeaders], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("CustomHeaders")
            @ExcludeMissing
            fun _customHeaders(): JsonField<List<CustomHeader>> = customHeaders

            /**
             * Returns the raw JSON value of [detectionMode].
             *
             * Unlike [detectionMode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("DetectionMode")
            @ExcludeMissing
            fun _detectionMode(): JsonField<DetectionMode> = detectionMode

            /**
             * Returns the raw JSON value of [fallbackUrl].
             *
             * Unlike [fallbackUrl], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("FallbackUrl")
            @ExcludeMissing
            fun _fallbackUrl(): JsonField<String> = fallbackUrl

            /**
             * Returns the raw JSON value of [from].
             *
             * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("From") @ExcludeMissing fun _from(): JsonField<String> = from

            /**
             * Returns the raw JSON value of [machineDetection].
             *
             * Unlike [machineDetection], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("MachineDetection")
            @ExcludeMissing
            fun _machineDetection(): JsonField<MachineDetection> = machineDetection

            /**
             * Returns the raw JSON value of [machineDetectionSilenceTimeout].
             *
             * Unlike [machineDetectionSilenceTimeout], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("MachineDetectionSilenceTimeout")
            @ExcludeMissing
            fun _machineDetectionSilenceTimeout(): JsonField<Long> = machineDetectionSilenceTimeout

            /**
             * Returns the raw JSON value of [machineDetectionSpeechEndThreshold].
             *
             * Unlike [machineDetectionSpeechEndThreshold], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("MachineDetectionSpeechEndThreshold")
            @ExcludeMissing
            fun _machineDetectionSpeechEndThreshold(): JsonField<Long> =
                machineDetectionSpeechEndThreshold

            /**
             * Returns the raw JSON value of [machineDetectionSpeechThreshold].
             *
             * Unlike [machineDetectionSpeechThreshold], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("MachineDetectionSpeechThreshold")
            @ExcludeMissing
            fun _machineDetectionSpeechThreshold(): JsonField<Long> =
                machineDetectionSpeechThreshold

            /**
             * Returns the raw JSON value of [machineDetectionTimeout].
             *
             * Unlike [machineDetectionTimeout], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("MachineDetectionTimeout")
            @ExcludeMissing
            fun _machineDetectionTimeout(): JsonField<Long> = machineDetectionTimeout

            /**
             * Returns the raw JSON value of [mediaEncryption].
             *
             * Unlike [mediaEncryption], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("MediaEncryption")
            @ExcludeMissing
            fun _mediaEncryption(): JsonField<MediaEncryption> = mediaEncryption

            /**
             * Returns the raw JSON value of [preferredCodecs].
             *
             * Unlike [preferredCodecs], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("PreferredCodecs")
            @ExcludeMissing
            fun _preferredCodecs(): JsonField<String> = preferredCodecs

            /**
             * Returns the raw JSON value of [record].
             *
             * Unlike [record], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("Record") @ExcludeMissing fun _record(): JsonField<Boolean> = record

            /**
             * Returns the raw JSON value of [recordingChannels].
             *
             * Unlike [recordingChannels], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("RecordingChannels")
            @ExcludeMissing
            fun _recordingChannels(): JsonField<RecordingChannels> = recordingChannels

            /**
             * Returns the raw JSON value of [recordingStatusCallback].
             *
             * Unlike [recordingStatusCallback], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("RecordingStatusCallback")
            @ExcludeMissing
            fun _recordingStatusCallback(): JsonField<String> = recordingStatusCallback

            /**
             * Returns the raw JSON value of [recordingStatusCallbackEvent].
             *
             * Unlike [recordingStatusCallbackEvent], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("RecordingStatusCallbackEvent")
            @ExcludeMissing
            fun _recordingStatusCallbackEvent(): JsonField<String> = recordingStatusCallbackEvent

            /**
             * Returns the raw JSON value of [recordingStatusCallbackMethod].
             *
             * Unlike [recordingStatusCallbackMethod], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("RecordingStatusCallbackMethod")
            @ExcludeMissing
            fun _recordingStatusCallbackMethod(): JsonField<RecordingStatusCallbackMethod> =
                recordingStatusCallbackMethod

            /**
             * Returns the raw JSON value of [recordingTimeout].
             *
             * Unlike [recordingTimeout], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("RecordingTimeout")
            @ExcludeMissing
            fun _recordingTimeout(): JsonField<Long> = recordingTimeout

            /**
             * Returns the raw JSON value of [recordingTrack].
             *
             * Unlike [recordingTrack], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("RecordingTrack")
            @ExcludeMissing
            fun _recordingTrack(): JsonField<RecordingTrack> = recordingTrack

            /**
             * Returns the raw JSON value of [sendRecordingUrl].
             *
             * Unlike [sendRecordingUrl], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("SendRecordingUrl")
            @ExcludeMissing
            fun _sendRecordingUrl(): JsonField<Boolean> = sendRecordingUrl

            /**
             * Returns the raw JSON value of [sipAuthPassword].
             *
             * Unlike [sipAuthPassword], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("SipAuthPassword")
            @ExcludeMissing
            fun _sipAuthPassword(): JsonField<String> = sipAuthPassword

            /**
             * Returns the raw JSON value of [sipAuthUsername].
             *
             * Unlike [sipAuthUsername], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("SipAuthUsername")
            @ExcludeMissing
            fun _sipAuthUsername(): JsonField<String> = sipAuthUsername

            /**
             * Returns the raw JSON value of [sipRegion].
             *
             * Unlike [sipRegion], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("SipRegion")
            @ExcludeMissing
            fun _sipRegion(): JsonField<SipRegion> = sipRegion

            /**
             * Returns the raw JSON value of [statusCallback].
             *
             * Unlike [statusCallback], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("StatusCallback")
            @ExcludeMissing
            fun _statusCallback(): JsonField<String> = statusCallback

            /**
             * Returns the raw JSON value of [statusCallbackEvent].
             *
             * Unlike [statusCallbackEvent], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("StatusCallbackEvent")
            @ExcludeMissing
            fun _statusCallbackEvent(): JsonField<StatusCallbackEvent> = statusCallbackEvent

            /**
             * Returns the raw JSON value of [statusCallbackMethod].
             *
             * Unlike [statusCallbackMethod], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("StatusCallbackMethod")
            @ExcludeMissing
            fun _statusCallbackMethod(): JsonField<StatusCallbackMethod> = statusCallbackMethod

            /**
             * Returns the raw JSON value of [superviseCallSid].
             *
             * Unlike [superviseCallSid], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("SuperviseCallSid")
            @ExcludeMissing
            fun _superviseCallSid(): JsonField<String> = superviseCallSid

            /**
             * Returns the raw JSON value of [supervisingRole].
             *
             * Unlike [supervisingRole], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("SupervisingRole")
            @ExcludeMissing
            fun _supervisingRole(): JsonField<SupervisingRole> = supervisingRole

            /**
             * Returns the raw JSON value of [timeLimit].
             *
             * Unlike [timeLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("TimeLimit") @ExcludeMissing fun _timeLimit(): JsonField<Long> = timeLimit

            /**
             * Returns the raw JSON value of [timeout].
             *
             * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("Timeout") @ExcludeMissing fun _timeout(): JsonField<Long> = timeout

            /**
             * Returns the raw JSON value of [to].
             *
             * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("To") @ExcludeMissing fun _to(): JsonField<String> = to

            /**
             * Returns the raw JSON value of [trim].
             *
             * Unlike [trim], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("Trim") @ExcludeMissing fun _trim(): JsonField<Trim> = trim

            /**
             * Returns the raw JSON value of [urlMethod].
             *
             * Unlike [urlMethod], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("UrlMethod")
            @ExcludeMissing
            fun _urlMethod(): JsonField<UrlMethod> = urlMethod

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
                 * Returns a mutable builder for constructing an instance of [ApplicationDefault].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ApplicationDefault]. */
            class Builder internal constructor() {

                private var applicationSid: JsonField<String> = JsonMissing.of()
                private var asyncAmd: JsonField<Boolean> = JsonMissing.of()
                private var asyncAmdStatusCallback: JsonField<String> = JsonMissing.of()
                private var asyncAmdStatusCallbackMethod: JsonField<AsyncAmdStatusCallbackMethod> =
                    JsonMissing.of()
                private var callerId: JsonField<String> = JsonMissing.of()
                private var cancelPlaybackOnDetectMessageEnd: JsonField<Boolean> = JsonMissing.of()
                private var cancelPlaybackOnMachineDetection: JsonField<Boolean> = JsonMissing.of()
                private var customHeaders: JsonField<MutableList<CustomHeader>>? = null
                private var detectionMode: JsonField<DetectionMode> = JsonMissing.of()
                private var fallbackUrl: JsonField<String> = JsonMissing.of()
                private var from: JsonField<String> = JsonMissing.of()
                private var machineDetection: JsonField<MachineDetection> = JsonMissing.of()
                private var machineDetectionSilenceTimeout: JsonField<Long> = JsonMissing.of()
                private var machineDetectionSpeechEndThreshold: JsonField<Long> = JsonMissing.of()
                private var machineDetectionSpeechThreshold: JsonField<Long> = JsonMissing.of()
                private var machineDetectionTimeout: JsonField<Long> = JsonMissing.of()
                private var mediaEncryption: JsonField<MediaEncryption> = JsonMissing.of()
                private var preferredCodecs: JsonField<String> = JsonMissing.of()
                private var record: JsonField<Boolean> = JsonMissing.of()
                private var recordingChannels: JsonField<RecordingChannels> = JsonMissing.of()
                private var recordingStatusCallback: JsonField<String> = JsonMissing.of()
                private var recordingStatusCallbackEvent: JsonField<String> = JsonMissing.of()
                private var recordingStatusCallbackMethod:
                    JsonField<RecordingStatusCallbackMethod> =
                    JsonMissing.of()
                private var recordingTimeout: JsonField<Long> = JsonMissing.of()
                private var recordingTrack: JsonField<RecordingTrack> = JsonMissing.of()
                private var sendRecordingUrl: JsonField<Boolean> = JsonMissing.of()
                private var sipAuthPassword: JsonField<String> = JsonMissing.of()
                private var sipAuthUsername: JsonField<String> = JsonMissing.of()
                private var sipRegion: JsonField<SipRegion> = JsonMissing.of()
                private var statusCallback: JsonField<String> = JsonMissing.of()
                private var statusCallbackEvent: JsonField<StatusCallbackEvent> = JsonMissing.of()
                private var statusCallbackMethod: JsonField<StatusCallbackMethod> = JsonMissing.of()
                private var superviseCallSid: JsonField<String> = JsonMissing.of()
                private var supervisingRole: JsonField<SupervisingRole> = JsonMissing.of()
                private var texml: JsonValue = JsonMissing.of()
                private var timeLimit: JsonField<Long> = JsonMissing.of()
                private var timeout: JsonField<Long> = JsonMissing.of()
                private var to: JsonField<String> = JsonMissing.of()
                private var trim: JsonField<Trim> = JsonMissing.of()
                private var url: JsonValue = JsonMissing.of()
                private var urlMethod: JsonField<UrlMethod> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(applicationDefault: ApplicationDefault) = apply {
                    applicationSid = applicationDefault.applicationSid
                    asyncAmd = applicationDefault.asyncAmd
                    asyncAmdStatusCallback = applicationDefault.asyncAmdStatusCallback
                    asyncAmdStatusCallbackMethod = applicationDefault.asyncAmdStatusCallbackMethod
                    callerId = applicationDefault.callerId
                    cancelPlaybackOnDetectMessageEnd =
                        applicationDefault.cancelPlaybackOnDetectMessageEnd
                    cancelPlaybackOnMachineDetection =
                        applicationDefault.cancelPlaybackOnMachineDetection
                    customHeaders = applicationDefault.customHeaders.map { it.toMutableList() }
                    detectionMode = applicationDefault.detectionMode
                    fallbackUrl = applicationDefault.fallbackUrl
                    from = applicationDefault.from
                    machineDetection = applicationDefault.machineDetection
                    machineDetectionSilenceTimeout =
                        applicationDefault.machineDetectionSilenceTimeout
                    machineDetectionSpeechEndThreshold =
                        applicationDefault.machineDetectionSpeechEndThreshold
                    machineDetectionSpeechThreshold =
                        applicationDefault.machineDetectionSpeechThreshold
                    machineDetectionTimeout = applicationDefault.machineDetectionTimeout
                    mediaEncryption = applicationDefault.mediaEncryption
                    preferredCodecs = applicationDefault.preferredCodecs
                    record = applicationDefault.record
                    recordingChannels = applicationDefault.recordingChannels
                    recordingStatusCallback = applicationDefault.recordingStatusCallback
                    recordingStatusCallbackEvent = applicationDefault.recordingStatusCallbackEvent
                    recordingStatusCallbackMethod = applicationDefault.recordingStatusCallbackMethod
                    recordingTimeout = applicationDefault.recordingTimeout
                    recordingTrack = applicationDefault.recordingTrack
                    sendRecordingUrl = applicationDefault.sendRecordingUrl
                    sipAuthPassword = applicationDefault.sipAuthPassword
                    sipAuthUsername = applicationDefault.sipAuthUsername
                    sipRegion = applicationDefault.sipRegion
                    statusCallback = applicationDefault.statusCallback
                    statusCallbackEvent = applicationDefault.statusCallbackEvent
                    statusCallbackMethod = applicationDefault.statusCallbackMethod
                    superviseCallSid = applicationDefault.superviseCallSid
                    supervisingRole = applicationDefault.supervisingRole
                    texml = applicationDefault.texml
                    timeLimit = applicationDefault.timeLimit
                    timeout = applicationDefault.timeout
                    to = applicationDefault.to
                    trim = applicationDefault.trim
                    url = applicationDefault.url
                    urlMethod = applicationDefault.urlMethod
                    additionalProperties = applicationDefault.additionalProperties.toMutableMap()
                }

                /** The ID of the TeXML Application. */
                fun applicationSid(applicationSid: String) =
                    applicationSid(JsonField.of(applicationSid))

                /**
                 * Sets [Builder.applicationSid] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.applicationSid] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun applicationSid(applicationSid: JsonField<String>) = apply {
                    this.applicationSid = applicationSid
                }

                /**
                 * Select whether to perform answering machine detection in the background. By
                 * default execution is blocked until Answering Machine Detection is completed.
                 */
                fun asyncAmd(asyncAmd: Boolean) = asyncAmd(JsonField.of(asyncAmd))

                /**
                 * Sets [Builder.asyncAmd] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.asyncAmd] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun asyncAmd(asyncAmd: JsonField<Boolean>) = apply { this.asyncAmd = asyncAmd }

                /** URL destination for Telnyx to send AMD callback events to for the call. */
                fun asyncAmdStatusCallback(asyncAmdStatusCallback: String) =
                    asyncAmdStatusCallback(JsonField.of(asyncAmdStatusCallback))

                /**
                 * Sets [Builder.asyncAmdStatusCallback] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.asyncAmdStatusCallback] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun asyncAmdStatusCallback(asyncAmdStatusCallback: JsonField<String>) = apply {
                    this.asyncAmdStatusCallback = asyncAmdStatusCallback
                }

                /**
                 * HTTP request type used for `AsyncAmdStatusCallback`. The default value is
                 * inherited from TeXML Application setting.
                 */
                fun asyncAmdStatusCallbackMethod(
                    asyncAmdStatusCallbackMethod: AsyncAmdStatusCallbackMethod
                ) = asyncAmdStatusCallbackMethod(JsonField.of(asyncAmdStatusCallbackMethod))

                /**
                 * Sets [Builder.asyncAmdStatusCallbackMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.asyncAmdStatusCallbackMethod] with a well-typed
                 * [AsyncAmdStatusCallbackMethod] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun asyncAmdStatusCallbackMethod(
                    asyncAmdStatusCallbackMethod: JsonField<AsyncAmdStatusCallbackMethod>
                ) = apply { this.asyncAmdStatusCallbackMethod = asyncAmdStatusCallbackMethod }

                /**
                 * To be used as the caller id name (SIP From Display Name) presented to the
                 * destination (`To` number). The string should have a maximum of 128 characters,
                 * containing only letters, numbers, spaces, and `-_~!.+` special characters. If
                 * ommited, the display name will be the same as the number in the `From` field.
                 */
                fun callerId(callerId: String) = callerId(JsonField.of(callerId))

                /**
                 * Sets [Builder.callerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.callerId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun callerId(callerId: JsonField<String>) = apply { this.callerId = callerId }

                /**
                 * Whether to cancel ongoing playback on `greeting ended` detection. Defaults to
                 * `true`.
                 */
                fun cancelPlaybackOnDetectMessageEnd(cancelPlaybackOnDetectMessageEnd: Boolean) =
                    cancelPlaybackOnDetectMessageEnd(JsonField.of(cancelPlaybackOnDetectMessageEnd))

                /**
                 * Sets [Builder.cancelPlaybackOnDetectMessageEnd] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cancelPlaybackOnDetectMessageEnd] with a
                 * well-typed [Boolean] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun cancelPlaybackOnDetectMessageEnd(
                    cancelPlaybackOnDetectMessageEnd: JsonField<Boolean>
                ) = apply {
                    this.cancelPlaybackOnDetectMessageEnd = cancelPlaybackOnDetectMessageEnd
                }

                /**
                 * Whether to cancel ongoing playback on `machine` detection. Defaults to `true`.
                 */
                fun cancelPlaybackOnMachineDetection(cancelPlaybackOnMachineDetection: Boolean) =
                    cancelPlaybackOnMachineDetection(JsonField.of(cancelPlaybackOnMachineDetection))

                /**
                 * Sets [Builder.cancelPlaybackOnMachineDetection] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cancelPlaybackOnMachineDetection] with a
                 * well-typed [Boolean] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun cancelPlaybackOnMachineDetection(
                    cancelPlaybackOnMachineDetection: JsonField<Boolean>
                ) = apply {
                    this.cancelPlaybackOnMachineDetection = cancelPlaybackOnMachineDetection
                }

                /**
                 * Custom HTTP headers to be sent with the call. Each header should be an object
                 * with 'name' and 'value' properties.
                 */
                fun customHeaders(customHeaders: List<CustomHeader>) =
                    customHeaders(JsonField.of(customHeaders))

                /**
                 * Sets [Builder.customHeaders] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customHeaders] with a well-typed
                 * `List<CustomHeader>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun customHeaders(customHeaders: JsonField<List<CustomHeader>>) = apply {
                    this.customHeaders = customHeaders.map { it.toMutableList() }
                }

                /**
                 * Adds a single [CustomHeader] to [customHeaders].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCustomHeader(customHeader: CustomHeader) = apply {
                    customHeaders =
                        (customHeaders ?: JsonField.of(mutableListOf())).also {
                            checkKnown("customHeaders", it).add(customHeader)
                        }
                }

                /** Allows you to chose between Premium and Standard detections. */
                fun detectionMode(detectionMode: DetectionMode) =
                    detectionMode(JsonField.of(detectionMode))

                /**
                 * Sets [Builder.detectionMode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.detectionMode] with a well-typed [DetectionMode]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun detectionMode(detectionMode: JsonField<DetectionMode>) = apply {
                    this.detectionMode = detectionMode
                }

                /**
                 * A failover URL for which Telnyx will retrieve the TeXML call instructions if the
                 * `Url` is not responding.
                 */
                fun fallbackUrl(fallbackUrl: String) = fallbackUrl(JsonField.of(fallbackUrl))

                /**
                 * Sets [Builder.fallbackUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fallbackUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fallbackUrl(fallbackUrl: JsonField<String>) = apply {
                    this.fallbackUrl = fallbackUrl
                }

                /**
                 * The phone number of the party that initiated the call. Phone numbers are
                 * formatted with a `+` and country code.
                 */
                fun from(from: String) = from(JsonField.of(from))

                /**
                 * Sets [Builder.from] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.from] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun from(from: JsonField<String>) = apply { this.from = from }

                /** Enables Answering Machine Detection. */
                fun machineDetection(machineDetection: MachineDetection) =
                    machineDetection(JsonField.of(machineDetection))

                /**
                 * Sets [Builder.machineDetection] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.machineDetection] with a well-typed
                 * [MachineDetection] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun machineDetection(machineDetection: JsonField<MachineDetection>) = apply {
                    this.machineDetection = machineDetection
                }

                /**
                 * If initial silence duration is greater than this value, consider it a machine.
                 * Ignored when `premium` detection is used.
                 */
                fun machineDetectionSilenceTimeout(machineDetectionSilenceTimeout: Long) =
                    machineDetectionSilenceTimeout(JsonField.of(machineDetectionSilenceTimeout))

                /**
                 * Sets [Builder.machineDetectionSilenceTimeout] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.machineDetectionSilenceTimeout] with a
                 * well-typed [Long] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun machineDetectionSilenceTimeout(
                    machineDetectionSilenceTimeout: JsonField<Long>
                ) = apply { this.machineDetectionSilenceTimeout = machineDetectionSilenceTimeout }

                /**
                 * Silence duration threshold after a greeting message or voice for it be considered
                 * human. Ignored when `premium` detection is used.
                 */
                fun machineDetectionSpeechEndThreshold(machineDetectionSpeechEndThreshold: Long) =
                    machineDetectionSpeechEndThreshold(
                        JsonField.of(machineDetectionSpeechEndThreshold)
                    )

                /**
                 * Sets [Builder.machineDetectionSpeechEndThreshold] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.machineDetectionSpeechEndThreshold] with a
                 * well-typed [Long] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun machineDetectionSpeechEndThreshold(
                    machineDetectionSpeechEndThreshold: JsonField<Long>
                ) = apply {
                    this.machineDetectionSpeechEndThreshold = machineDetectionSpeechEndThreshold
                }

                /**
                 * Maximum threshold of a human greeting. If greeting longer than this value,
                 * considered machine. Ignored when `premium` detection is used.
                 */
                fun machineDetectionSpeechThreshold(machineDetectionSpeechThreshold: Long) =
                    machineDetectionSpeechThreshold(JsonField.of(machineDetectionSpeechThreshold))

                /**
                 * Sets [Builder.machineDetectionSpeechThreshold] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.machineDetectionSpeechThreshold] with a
                 * well-typed [Long] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun machineDetectionSpeechThreshold(
                    machineDetectionSpeechThreshold: JsonField<Long>
                ) = apply { this.machineDetectionSpeechThreshold = machineDetectionSpeechThreshold }

                /** Maximum timeout threshold in milliseconds for overall detection. */
                fun machineDetectionTimeout(machineDetectionTimeout: Long) =
                    machineDetectionTimeout(JsonField.of(machineDetectionTimeout))

                /**
                 * Sets [Builder.machineDetectionTimeout] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.machineDetectionTimeout] with a well-typed
                 * [Long] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun machineDetectionTimeout(machineDetectionTimeout: JsonField<Long>) = apply {
                    this.machineDetectionTimeout = machineDetectionTimeout
                }

                /**
                 * Defines whether media should be encrypted on the call. When set to `SRTP`, the
                 * call will use Secure Real-time Transport Protocol for media encryption. When set
                 * to `DTLS`, the call will use DTLS for media encryption. Only supported for SIP
                 * destinations.
                 */
                fun mediaEncryption(mediaEncryption: MediaEncryption) =
                    mediaEncryption(JsonField.of(mediaEncryption))

                /**
                 * Sets [Builder.mediaEncryption] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mediaEncryption] with a well-typed
                 * [MediaEncryption] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun mediaEncryption(mediaEncryption: JsonField<MediaEncryption>) = apply {
                    this.mediaEncryption = mediaEncryption
                }

                /** The list of comma-separated codecs to be offered on a call. */
                fun preferredCodecs(preferredCodecs: String) =
                    preferredCodecs(JsonField.of(preferredCodecs))

                /**
                 * Sets [Builder.preferredCodecs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.preferredCodecs] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun preferredCodecs(preferredCodecs: JsonField<String>) = apply {
                    this.preferredCodecs = preferredCodecs
                }

                /** Whether to record the entire participant's call leg. Defaults to `false`. */
                fun record(record: Boolean) = record(JsonField.of(record))

                /**
                 * Sets [Builder.record] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.record] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun record(record: JsonField<Boolean>) = apply { this.record = record }

                /** The number of channels in the final recording. Defaults to `mono`. */
                fun recordingChannels(recordingChannels: RecordingChannels) =
                    recordingChannels(JsonField.of(recordingChannels))

                /**
                 * Sets [Builder.recordingChannels] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordingChannels] with a well-typed
                 * [RecordingChannels] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun recordingChannels(recordingChannels: JsonField<RecordingChannels>) = apply {
                    this.recordingChannels = recordingChannels
                }

                /** The URL the recording callbacks will be sent to. */
                fun recordingStatusCallback(recordingStatusCallback: String) =
                    recordingStatusCallback(JsonField.of(recordingStatusCallback))

                /**
                 * Sets [Builder.recordingStatusCallback] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordingStatusCallback] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun recordingStatusCallback(recordingStatusCallback: JsonField<String>) = apply {
                    this.recordingStatusCallback = recordingStatusCallback
                }

                /**
                 * The changes to the recording's state that should generate a call to
                 * `RecoridngStatusCallback`. Can be: `in-progress`, `completed` and `absent`.
                 * Separate multiple values with a space. Defaults to `completed`.
                 */
                fun recordingStatusCallbackEvent(recordingStatusCallbackEvent: String) =
                    recordingStatusCallbackEvent(JsonField.of(recordingStatusCallbackEvent))

                /**
                 * Sets [Builder.recordingStatusCallbackEvent] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordingStatusCallbackEvent] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun recordingStatusCallbackEvent(recordingStatusCallbackEvent: JsonField<String>) =
                    apply {
                        this.recordingStatusCallbackEvent = recordingStatusCallbackEvent
                    }

                /** HTTP request type used for `RecordingStatusCallback`. Defaults to `POST`. */
                fun recordingStatusCallbackMethod(
                    recordingStatusCallbackMethod: RecordingStatusCallbackMethod
                ) = recordingStatusCallbackMethod(JsonField.of(recordingStatusCallbackMethod))

                /**
                 * Sets [Builder.recordingStatusCallbackMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordingStatusCallbackMethod] with a well-typed
                 * [RecordingStatusCallbackMethod] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun recordingStatusCallbackMethod(
                    recordingStatusCallbackMethod: JsonField<RecordingStatusCallbackMethod>
                ) = apply { this.recordingStatusCallbackMethod = recordingStatusCallbackMethod }

                /**
                 * The number of seconds that Telnyx will wait for the recording to be stopped if
                 * silence is detected. The timer only starts when the speech is detected. Please
                 * note that the transcription is used to detect silence and the related charge will
                 * be applied. The minimum value is 0. The default value is 0 (infinite)
                 */
                fun recordingTimeout(recordingTimeout: Long) =
                    recordingTimeout(JsonField.of(recordingTimeout))

                /**
                 * Sets [Builder.recordingTimeout] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordingTimeout] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun recordingTimeout(recordingTimeout: JsonField<Long>) = apply {
                    this.recordingTimeout = recordingTimeout
                }

                /** The audio track to record for the call. The default is `both`. */
                fun recordingTrack(recordingTrack: RecordingTrack) =
                    recordingTrack(JsonField.of(recordingTrack))

                /**
                 * Sets [Builder.recordingTrack] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordingTrack] with a well-typed
                 * [RecordingTrack] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun recordingTrack(recordingTrack: JsonField<RecordingTrack>) = apply {
                    this.recordingTrack = recordingTrack
                }

                /** Whether to send RecordingUrl in webhooks. */
                fun sendRecordingUrl(sendRecordingUrl: Boolean) =
                    sendRecordingUrl(JsonField.of(sendRecordingUrl))

                /**
                 * Sets [Builder.sendRecordingUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sendRecordingUrl] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun sendRecordingUrl(sendRecordingUrl: JsonField<Boolean>) = apply {
                    this.sendRecordingUrl = sendRecordingUrl
                }

                /** The password to use for SIP authentication. */
                fun sipAuthPassword(sipAuthPassword: String) =
                    sipAuthPassword(JsonField.of(sipAuthPassword))

                /**
                 * Sets [Builder.sipAuthPassword] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sipAuthPassword] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun sipAuthPassword(sipAuthPassword: JsonField<String>) = apply {
                    this.sipAuthPassword = sipAuthPassword
                }

                /** The username to use for SIP authentication. */
                fun sipAuthUsername(sipAuthUsername: String) =
                    sipAuthUsername(JsonField.of(sipAuthUsername))

                /**
                 * Sets [Builder.sipAuthUsername] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sipAuthUsername] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun sipAuthUsername(sipAuthUsername: JsonField<String>) = apply {
                    this.sipAuthUsername = sipAuthUsername
                }

                /** Defines the SIP region to be used for the call. */
                fun sipRegion(sipRegion: SipRegion) = sipRegion(JsonField.of(sipRegion))

                /**
                 * Sets [Builder.sipRegion] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sipRegion] with a well-typed [SipRegion] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sipRegion(sipRegion: JsonField<SipRegion>) = apply {
                    this.sipRegion = sipRegion
                }

                /** URL destination for Telnyx to send status callback events to for the call. */
                fun statusCallback(statusCallback: String) =
                    statusCallback(JsonField.of(statusCallback))

                /**
                 * Sets [Builder.statusCallback] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.statusCallback] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun statusCallback(statusCallback: JsonField<String>) = apply {
                    this.statusCallback = statusCallback
                }

                /**
                 * The call events for which Telnyx should send a webhook. Multiple events can be
                 * defined when separated by a space.
                 */
                fun statusCallbackEvent(statusCallbackEvent: StatusCallbackEvent) =
                    statusCallbackEvent(JsonField.of(statusCallbackEvent))

                /**
                 * Sets [Builder.statusCallbackEvent] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.statusCallbackEvent] with a well-typed
                 * [StatusCallbackEvent] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun statusCallbackEvent(statusCallbackEvent: JsonField<StatusCallbackEvent>) =
                    apply {
                        this.statusCallbackEvent = statusCallbackEvent
                    }

                /** HTTP request type used for `StatusCallback`. */
                fun statusCallbackMethod(statusCallbackMethod: StatusCallbackMethod) =
                    statusCallbackMethod(JsonField.of(statusCallbackMethod))

                /**
                 * Sets [Builder.statusCallbackMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.statusCallbackMethod] with a well-typed
                 * [StatusCallbackMethod] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun statusCallbackMethod(statusCallbackMethod: JsonField<StatusCallbackMethod>) =
                    apply {
                        this.statusCallbackMethod = statusCallbackMethod
                    }

                /**
                 * The call control ID of the existing call to supervise. When provided, the created
                 * leg will be added to the specified call in supervising mode. Status callbacks and
                 * action callbacks will NOT be sent for the supervising leg.
                 */
                fun superviseCallSid(superviseCallSid: String) =
                    superviseCallSid(JsonField.of(superviseCallSid))

                /**
                 * Sets [Builder.superviseCallSid] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.superviseCallSid] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun superviseCallSid(superviseCallSid: JsonField<String>) = apply {
                    this.superviseCallSid = superviseCallSid
                }

                /**
                 * The supervising role for the new leg. Determines the audio behavior: barge (hear
                 * both sides), whisper (only hear supervisor), monitor (hear both sides but
                 * supervisor muted). Default: barge
                 */
                fun supervisingRole(supervisingRole: SupervisingRole) =
                    supervisingRole(JsonField.of(supervisingRole))

                /**
                 * Sets [Builder.supervisingRole] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.supervisingRole] with a well-typed
                 * [SupervisingRole] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun supervisingRole(supervisingRole: JsonField<SupervisingRole>) = apply {
                    this.supervisingRole = supervisingRole
                }

                fun texml(texml: JsonValue) = apply { this.texml = texml }

                /**
                 * The maximum duration of the call in seconds. The minimum value is 30 and the
                 * maximum value is 14400 (4 hours). Default is 14400 seconds.
                 */
                fun timeLimit(timeLimit: Long) = timeLimit(JsonField.of(timeLimit))

                /**
                 * Sets [Builder.timeLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timeLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun timeLimit(timeLimit: JsonField<Long>) = apply { this.timeLimit = timeLimit }

                /**
                 * The number of seconds to wait for the called party to answer the call before the
                 * call is canceled. The minimum value is 5 and the maximum value is 120. Default is
                 * 30 seconds.
                 */
                fun timeout(timeout: Long) = timeout(JsonField.of(timeout))

                /**
                 * Sets [Builder.timeout] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timeout] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun timeout(timeout: JsonField<Long>) = apply { this.timeout = timeout }

                /**
                 * The phone number of the called party. Phone numbers are formatted with a `+` and
                 * country code.
                 */
                fun to(to: String) = to(JsonField.of(to))

                /**
                 * Sets [Builder.to] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.to] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun to(to: JsonField<String>) = apply { this.to = to }

                /**
                 * Whether to trim any leading and trailing silence from the recording. Defaults to
                 * `trim-silence`.
                 */
                fun trim(trim: Trim) = trim(JsonField.of(trim))

                /**
                 * Sets [Builder.trim] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.trim] with a well-typed [Trim] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun trim(trim: JsonField<Trim>) = apply { this.trim = trim }

                fun url(url: JsonValue) = apply { this.url = url }

                /**
                 * HTTP request type used for `Url`. The default value is inherited from TeXML
                 * Application setting.
                 */
                fun urlMethod(urlMethod: UrlMethod) = urlMethod(JsonField.of(urlMethod))

                /**
                 * Sets [Builder.urlMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.urlMethod] with a well-typed [UrlMethod] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun urlMethod(urlMethod: JsonField<UrlMethod>) = apply {
                    this.urlMethod = urlMethod
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
                 * Returns an immutable instance of [ApplicationDefault].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ApplicationDefault =
                    ApplicationDefault(
                        applicationSid,
                        asyncAmd,
                        asyncAmdStatusCallback,
                        asyncAmdStatusCallbackMethod,
                        callerId,
                        cancelPlaybackOnDetectMessageEnd,
                        cancelPlaybackOnMachineDetection,
                        (customHeaders ?: JsonMissing.of()).map { it.toImmutable() },
                        detectionMode,
                        fallbackUrl,
                        from,
                        machineDetection,
                        machineDetectionSilenceTimeout,
                        machineDetectionSpeechEndThreshold,
                        machineDetectionSpeechThreshold,
                        machineDetectionTimeout,
                        mediaEncryption,
                        preferredCodecs,
                        record,
                        recordingChannels,
                        recordingStatusCallback,
                        recordingStatusCallbackEvent,
                        recordingStatusCallbackMethod,
                        recordingTimeout,
                        recordingTrack,
                        sendRecordingUrl,
                        sipAuthPassword,
                        sipAuthUsername,
                        sipRegion,
                        statusCallback,
                        statusCallbackEvent,
                        statusCallbackMethod,
                        superviseCallSid,
                        supervisingRole,
                        texml,
                        timeLimit,
                        timeout,
                        to,
                        trim,
                        url,
                        urlMethod,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ApplicationDefault = apply {
                if (validated) {
                    return@apply
                }

                applicationSid()
                asyncAmd()
                asyncAmdStatusCallback()
                asyncAmdStatusCallbackMethod().ifPresent { it.validate() }
                callerId()
                cancelPlaybackOnDetectMessageEnd()
                cancelPlaybackOnMachineDetection()
                customHeaders().ifPresent { it.forEach { it.validate() } }
                detectionMode().ifPresent { it.validate() }
                fallbackUrl()
                from()
                machineDetection().ifPresent { it.validate() }
                machineDetectionSilenceTimeout()
                machineDetectionSpeechEndThreshold()
                machineDetectionSpeechThreshold()
                machineDetectionTimeout()
                mediaEncryption().ifPresent { it.validate() }
                preferredCodecs()
                record()
                recordingChannels().ifPresent { it.validate() }
                recordingStatusCallback()
                recordingStatusCallbackEvent()
                recordingStatusCallbackMethod().ifPresent { it.validate() }
                recordingTimeout()
                recordingTrack().ifPresent { it.validate() }
                sendRecordingUrl()
                sipAuthPassword()
                sipAuthUsername()
                sipRegion().ifPresent { it.validate() }
                statusCallback()
                statusCallbackEvent().ifPresent { it.validate() }
                statusCallbackMethod().ifPresent { it.validate() }
                superviseCallSid()
                supervisingRole().ifPresent { it.validate() }
                timeLimit()
                timeout()
                to()
                trim().ifPresent { it.validate() }
                urlMethod().ifPresent { it.validate() }
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
                (if (applicationSid.asKnown().isPresent) 1 else 0) +
                    (if (asyncAmd.asKnown().isPresent) 1 else 0) +
                    (if (asyncAmdStatusCallback.asKnown().isPresent) 1 else 0) +
                    (asyncAmdStatusCallbackMethod.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (callerId.asKnown().isPresent) 1 else 0) +
                    (if (cancelPlaybackOnDetectMessageEnd.asKnown().isPresent) 1 else 0) +
                    (if (cancelPlaybackOnMachineDetection.asKnown().isPresent) 1 else 0) +
                    (customHeaders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (detectionMode.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (fallbackUrl.asKnown().isPresent) 1 else 0) +
                    (if (from.asKnown().isPresent) 1 else 0) +
                    (machineDetection.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (machineDetectionSilenceTimeout.asKnown().isPresent) 1 else 0) +
                    (if (machineDetectionSpeechEndThreshold.asKnown().isPresent) 1 else 0) +
                    (if (machineDetectionSpeechThreshold.asKnown().isPresent) 1 else 0) +
                    (if (machineDetectionTimeout.asKnown().isPresent) 1 else 0) +
                    (mediaEncryption.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (preferredCodecs.asKnown().isPresent) 1 else 0) +
                    (if (record.asKnown().isPresent) 1 else 0) +
                    (recordingChannels.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (recordingStatusCallback.asKnown().isPresent) 1 else 0) +
                    (if (recordingStatusCallbackEvent.asKnown().isPresent) 1 else 0) +
                    (recordingStatusCallbackMethod.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (recordingTimeout.asKnown().isPresent) 1 else 0) +
                    (recordingTrack.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (sendRecordingUrl.asKnown().isPresent) 1 else 0) +
                    (if (sipAuthPassword.asKnown().isPresent) 1 else 0) +
                    (if (sipAuthUsername.asKnown().isPresent) 1 else 0) +
                    (sipRegion.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (statusCallback.asKnown().isPresent) 1 else 0) +
                    (statusCallbackEvent.asKnown().getOrNull()?.validity() ?: 0) +
                    (statusCallbackMethod.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (superviseCallSid.asKnown().isPresent) 1 else 0) +
                    (supervisingRole.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (timeLimit.asKnown().isPresent) 1 else 0) +
                    (if (timeout.asKnown().isPresent) 1 else 0) +
                    (if (to.asKnown().isPresent) 1 else 0) +
                    (trim.asKnown().getOrNull()?.validity() ?: 0) +
                    (urlMethod.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * HTTP request type used for `AsyncAmdStatusCallback`. The default value is inherited
             * from TeXML Application setting.
             */
            class AsyncAmdStatusCallbackMethod
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val GET = of("GET")

                    @JvmField val POST = of("POST")

                    @JvmStatic
                    fun of(value: String) = AsyncAmdStatusCallbackMethod(JsonField.of(value))
                }

                /** An enum containing [AsyncAmdStatusCallbackMethod]'s known values. */
                enum class Known {
                    GET,
                    POST,
                }

                /**
                 * An enum containing [AsyncAmdStatusCallbackMethod]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [AsyncAmdStatusCallbackMethod] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    GET,
                    POST,
                    /**
                     * An enum member indicating that [AsyncAmdStatusCallbackMethod] was
                     * instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        GET -> Value.GET
                        POST -> Value.POST
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        GET -> Known.GET
                        POST -> Known.POST
                        else ->
                            throw TelnyxInvalidDataException(
                                "Unknown AsyncAmdStatusCallbackMethod: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): AsyncAmdStatusCallbackMethod = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AsyncAmdStatusCallbackMethod && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class CustomHeader
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val name: JsonField<String>,
                private val value: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<String> = JsonMissing.of(),
                ) : this(name, value, mutableMapOf())

                /**
                 * The name of the custom header
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * The value of the custom header
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun value(): String = value.getRequired("value")

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                     * Returns a mutable builder for constructing an instance of [CustomHeader].
                     *
                     * The following fields are required:
                     * ```java
                     * .name()
                     * .value()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CustomHeader]. */
                class Builder internal constructor() {

                    private var name: JsonField<String>? = null
                    private var value: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(customHeader: CustomHeader) = apply {
                        name = customHeader.name
                        value = customHeader.value
                        additionalProperties = customHeader.additionalProperties.toMutableMap()
                    }

                    /** The name of the custom header */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /** The value of the custom header */
                    fun value(value: String) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<String>) = apply { this.value = value }

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
                     * Returns an immutable instance of [CustomHeader].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .name()
                     * .value()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): CustomHeader =
                        CustomHeader(
                            checkRequired("name", name),
                            checkRequired("value", value),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): CustomHeader = apply {
                    if (validated) {
                        return@apply
                    }

                    name()
                    value()
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
                    (if (name.asKnown().isPresent) 1 else 0) +
                        (if (value.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CustomHeader &&
                        name == other.name &&
                        value == other.value &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(name, value, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CustomHeader{name=$name, value=$value, additionalProperties=$additionalProperties}"
            }

            /** Allows you to chose between Premium and Standard detections. */
            class DetectionMode
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PREMIUM = of("Premium")

                    @JvmField val REGULAR = of("Regular")

                    @JvmStatic fun of(value: String) = DetectionMode(JsonField.of(value))
                }

                /** An enum containing [DetectionMode]'s known values. */
                enum class Known {
                    PREMIUM,
                    REGULAR,
                }

                /**
                 * An enum containing [DetectionMode]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [DetectionMode] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PREMIUM,
                    REGULAR,
                    /**
                     * An enum member indicating that [DetectionMode] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PREMIUM -> Value.PREMIUM
                        REGULAR -> Value.REGULAR
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        PREMIUM -> Known.PREMIUM
                        REGULAR -> Known.REGULAR
                        else -> throw TelnyxInvalidDataException("Unknown DetectionMode: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): DetectionMode = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is DetectionMode && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Enables Answering Machine Detection. */
            class MachineDetection
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ENABLE = of("Enable")

                    @JvmField val DISABLE = of("Disable")

                    @JvmField val DETECT_MESSAGE_END = of("DetectMessageEnd")

                    @JvmStatic fun of(value: String) = MachineDetection(JsonField.of(value))
                }

                /** An enum containing [MachineDetection]'s known values. */
                enum class Known {
                    ENABLE,
                    DISABLE,
                    DETECT_MESSAGE_END,
                }

                /**
                 * An enum containing [MachineDetection]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [MachineDetection] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ENABLE,
                    DISABLE,
                    DETECT_MESSAGE_END,
                    /**
                     * An enum member indicating that [MachineDetection] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ENABLE -> Value.ENABLE
                        DISABLE -> Value.DISABLE
                        DETECT_MESSAGE_END -> Value.DETECT_MESSAGE_END
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ENABLE -> Known.ENABLE
                        DISABLE -> Known.DISABLE
                        DETECT_MESSAGE_END -> Known.DETECT_MESSAGE_END
                        else -> throw TelnyxInvalidDataException("Unknown MachineDetection: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): MachineDetection = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is MachineDetection && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Defines whether media should be encrypted on the call. When set to `SRTP`, the call
             * will use Secure Real-time Transport Protocol for media encryption. When set to
             * `DTLS`, the call will use DTLS for media encryption. Only supported for SIP
             * destinations.
             */
            class MediaEncryption
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val DISABLED = of("disabled")

                    @JvmField val SRTP = of("SRTP")

                    @JvmField val DTLS = of("DTLS")

                    @JvmStatic fun of(value: String) = MediaEncryption(JsonField.of(value))
                }

                /** An enum containing [MediaEncryption]'s known values. */
                enum class Known {
                    DISABLED,
                    SRTP,
                    DTLS,
                }

                /**
                 * An enum containing [MediaEncryption]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [MediaEncryption] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DISABLED,
                    SRTP,
                    DTLS,
                    /**
                     * An enum member indicating that [MediaEncryption] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        DISABLED -> Value.DISABLED
                        SRTP -> Value.SRTP
                        DTLS -> Value.DTLS
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        DISABLED -> Known.DISABLED
                        SRTP -> Known.SRTP
                        DTLS -> Known.DTLS
                        else -> throw TelnyxInvalidDataException("Unknown MediaEncryption: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): MediaEncryption = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is MediaEncryption && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** The number of channels in the final recording. Defaults to `mono`. */
            class RecordingChannels
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val MONO = of("mono")

                    @JvmField val DUAL = of("dual")

                    @JvmStatic fun of(value: String) = RecordingChannels(JsonField.of(value))
                }

                /** An enum containing [RecordingChannels]'s known values. */
                enum class Known {
                    MONO,
                    DUAL,
                }

                /**
                 * An enum containing [RecordingChannels]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [RecordingChannels] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MONO,
                    DUAL,
                    /**
                     * An enum member indicating that [RecordingChannels] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        MONO -> Value.MONO
                        DUAL -> Value.DUAL
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        MONO -> Known.MONO
                        DUAL -> Known.DUAL
                        else ->
                            throw TelnyxInvalidDataException("Unknown RecordingChannels: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): RecordingChannels = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RecordingChannels && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** HTTP request type used for `RecordingStatusCallback`. Defaults to `POST`. */
            class RecordingStatusCallbackMethod
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val GET = of("GET")

                    @JvmField val POST = of("POST")

                    @JvmStatic
                    fun of(value: String) = RecordingStatusCallbackMethod(JsonField.of(value))
                }

                /** An enum containing [RecordingStatusCallbackMethod]'s known values. */
                enum class Known {
                    GET,
                    POST,
                }

                /**
                 * An enum containing [RecordingStatusCallbackMethod]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [RecordingStatusCallbackMethod] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    GET,
                    POST,
                    /**
                     * An enum member indicating that [RecordingStatusCallbackMethod] was
                     * instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        GET -> Value.GET
                        POST -> Value.POST
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        GET -> Known.GET
                        POST -> Known.POST
                        else ->
                            throw TelnyxInvalidDataException(
                                "Unknown RecordingStatusCallbackMethod: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): RecordingStatusCallbackMethod = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RecordingStatusCallbackMethod && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** The audio track to record for the call. The default is `both`. */
            class RecordingTrack
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val INBOUND = of("inbound")

                    @JvmField val OUTBOUND = of("outbound")

                    @JvmField val BOTH = of("both")

                    @JvmStatic fun of(value: String) = RecordingTrack(JsonField.of(value))
                }

                /** An enum containing [RecordingTrack]'s known values. */
                enum class Known {
                    INBOUND,
                    OUTBOUND,
                    BOTH,
                }

                /**
                 * An enum containing [RecordingTrack]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [RecordingTrack] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INBOUND,
                    OUTBOUND,
                    BOTH,
                    /**
                     * An enum member indicating that [RecordingTrack] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        INBOUND -> Value.INBOUND
                        OUTBOUND -> Value.OUTBOUND
                        BOTH -> Value.BOTH
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        INBOUND -> Known.INBOUND
                        OUTBOUND -> Known.OUTBOUND
                        BOTH -> Known.BOTH
                        else -> throw TelnyxInvalidDataException("Unknown RecordingTrack: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): RecordingTrack = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RecordingTrack && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Defines the SIP region to be used for the call. */
            class SipRegion @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val US = of("US")

                    @JvmField val EUROPE = of("Europe")

                    @JvmField val CANADA = of("Canada")

                    @JvmField val AUSTRALIA = of("Australia")

                    @JvmField val MIDDLE_EAST = of("Middle East")

                    @JvmStatic fun of(value: String) = SipRegion(JsonField.of(value))
                }

                /** An enum containing [SipRegion]'s known values. */
                enum class Known {
                    US,
                    EUROPE,
                    CANADA,
                    AUSTRALIA,
                    MIDDLE_EAST,
                }

                /**
                 * An enum containing [SipRegion]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [SipRegion] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    US,
                    EUROPE,
                    CANADA,
                    AUSTRALIA,
                    MIDDLE_EAST,
                    /**
                     * An enum member indicating that [SipRegion] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        US -> Value.US
                        EUROPE -> Value.EUROPE
                        CANADA -> Value.CANADA
                        AUSTRALIA -> Value.AUSTRALIA
                        MIDDLE_EAST -> Value.MIDDLE_EAST
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        US -> Known.US
                        EUROPE -> Known.EUROPE
                        CANADA -> Known.CANADA
                        AUSTRALIA -> Known.AUSTRALIA
                        MIDDLE_EAST -> Known.MIDDLE_EAST
                        else -> throw TelnyxInvalidDataException("Unknown SipRegion: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): SipRegion = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SipRegion && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * The call events for which Telnyx should send a webhook. Multiple events can be
             * defined when separated by a space.
             */
            class StatusCallbackEvent
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val INITIATED = of("initiated")

                    @JvmField val RINGING = of("ringing")

                    @JvmField val ANSWERED = of("answered")

                    @JvmField val COMPLETED = of("completed")

                    @JvmStatic fun of(value: String) = StatusCallbackEvent(JsonField.of(value))
                }

                /** An enum containing [StatusCallbackEvent]'s known values. */
                enum class Known {
                    INITIATED,
                    RINGING,
                    ANSWERED,
                    COMPLETED,
                }

                /**
                 * An enum containing [StatusCallbackEvent]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [StatusCallbackEvent] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INITIATED,
                    RINGING,
                    ANSWERED,
                    COMPLETED,
                    /**
                     * An enum member indicating that [StatusCallbackEvent] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        INITIATED -> Value.INITIATED
                        RINGING -> Value.RINGING
                        ANSWERED -> Value.ANSWERED
                        COMPLETED -> Value.COMPLETED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        INITIATED -> Known.INITIATED
                        RINGING -> Known.RINGING
                        ANSWERED -> Known.ANSWERED
                        COMPLETED -> Known.COMPLETED
                        else ->
                            throw TelnyxInvalidDataException("Unknown StatusCallbackEvent: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): StatusCallbackEvent = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is StatusCallbackEvent && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** HTTP request type used for `StatusCallback`. */
            class StatusCallbackMethod
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val GET = of("GET")

                    @JvmField val POST = of("POST")

                    @JvmStatic fun of(value: String) = StatusCallbackMethod(JsonField.of(value))
                }

                /** An enum containing [StatusCallbackMethod]'s known values. */
                enum class Known {
                    GET,
                    POST,
                }

                /**
                 * An enum containing [StatusCallbackMethod]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [StatusCallbackMethod] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    GET,
                    POST,
                    /**
                     * An enum member indicating that [StatusCallbackMethod] was instantiated with
                     * an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        GET -> Value.GET
                        POST -> Value.POST
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        GET -> Known.GET
                        POST -> Known.POST
                        else ->
                            throw TelnyxInvalidDataException("Unknown StatusCallbackMethod: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): StatusCallbackMethod = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is StatusCallbackMethod && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * The supervising role for the new leg. Determines the audio behavior: barge (hear both
             * sides), whisper (only hear supervisor), monitor (hear both sides but supervisor
             * muted). Default: barge
             */
            class SupervisingRole
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val BARGE = of("barge")

                    @JvmField val WHISPER = of("whisper")

                    @JvmField val MONITOR = of("monitor")

                    @JvmStatic fun of(value: String) = SupervisingRole(JsonField.of(value))
                }

                /** An enum containing [SupervisingRole]'s known values. */
                enum class Known {
                    BARGE,
                    WHISPER,
                    MONITOR,
                }

                /**
                 * An enum containing [SupervisingRole]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [SupervisingRole] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    BARGE,
                    WHISPER,
                    MONITOR,
                    /**
                     * An enum member indicating that [SupervisingRole] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        BARGE -> Value.BARGE
                        WHISPER -> Value.WHISPER
                        MONITOR -> Value.MONITOR
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        BARGE -> Known.BARGE
                        WHISPER -> Known.WHISPER
                        MONITOR -> Known.MONITOR
                        else -> throw TelnyxInvalidDataException("Unknown SupervisingRole: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): SupervisingRole = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SupervisingRole && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Whether to trim any leading and trailing silence from the recording. Defaults to
             * `trim-silence`.
             */
            class Trim @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val TRIM_SILENCE = of("trim-silence")

                    @JvmField val DO_NOT_TRIM = of("do-not-trim")

                    @JvmStatic fun of(value: String) = Trim(JsonField.of(value))
                }

                /** An enum containing [Trim]'s known values. */
                enum class Known {
                    TRIM_SILENCE,
                    DO_NOT_TRIM,
                }

                /**
                 * An enum containing [Trim]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Trim] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TRIM_SILENCE,
                    DO_NOT_TRIM,
                    /**
                     * An enum member indicating that [Trim] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        TRIM_SILENCE -> Value.TRIM_SILENCE
                        DO_NOT_TRIM -> Value.DO_NOT_TRIM
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        TRIM_SILENCE -> Known.TRIM_SILENCE
                        DO_NOT_TRIM -> Known.DO_NOT_TRIM
                        else -> throw TelnyxInvalidDataException("Unknown Trim: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Trim = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Trim && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * HTTP request type used for `Url`. The default value is inherited from TeXML
             * Application setting.
             */
            class UrlMethod @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val GET = of("GET")

                    @JvmField val POST = of("POST")

                    @JvmStatic fun of(value: String) = UrlMethod(JsonField.of(value))
                }

                /** An enum containing [UrlMethod]'s known values. */
                enum class Known {
                    GET,
                    POST,
                }

                /**
                 * An enum containing [UrlMethod]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [UrlMethod] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    GET,
                    POST,
                    /**
                     * An enum member indicating that [UrlMethod] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        GET -> Value.GET
                        POST -> Value.POST
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        GET -> Known.GET
                        POST -> Known.POST
                        else -> throw TelnyxInvalidDataException("Unknown UrlMethod: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): UrlMethod = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is UrlMethod && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ApplicationDefault &&
                    applicationSid == other.applicationSid &&
                    asyncAmd == other.asyncAmd &&
                    asyncAmdStatusCallback == other.asyncAmdStatusCallback &&
                    asyncAmdStatusCallbackMethod == other.asyncAmdStatusCallbackMethod &&
                    callerId == other.callerId &&
                    cancelPlaybackOnDetectMessageEnd == other.cancelPlaybackOnDetectMessageEnd &&
                    cancelPlaybackOnMachineDetection == other.cancelPlaybackOnMachineDetection &&
                    customHeaders == other.customHeaders &&
                    detectionMode == other.detectionMode &&
                    fallbackUrl == other.fallbackUrl &&
                    from == other.from &&
                    machineDetection == other.machineDetection &&
                    machineDetectionSilenceTimeout == other.machineDetectionSilenceTimeout &&
                    machineDetectionSpeechEndThreshold ==
                        other.machineDetectionSpeechEndThreshold &&
                    machineDetectionSpeechThreshold == other.machineDetectionSpeechThreshold &&
                    machineDetectionTimeout == other.machineDetectionTimeout &&
                    mediaEncryption == other.mediaEncryption &&
                    preferredCodecs == other.preferredCodecs &&
                    record == other.record &&
                    recordingChannels == other.recordingChannels &&
                    recordingStatusCallback == other.recordingStatusCallback &&
                    recordingStatusCallbackEvent == other.recordingStatusCallbackEvent &&
                    recordingStatusCallbackMethod == other.recordingStatusCallbackMethod &&
                    recordingTimeout == other.recordingTimeout &&
                    recordingTrack == other.recordingTrack &&
                    sendRecordingUrl == other.sendRecordingUrl &&
                    sipAuthPassword == other.sipAuthPassword &&
                    sipAuthUsername == other.sipAuthUsername &&
                    sipRegion == other.sipRegion &&
                    statusCallback == other.statusCallback &&
                    statusCallbackEvent == other.statusCallbackEvent &&
                    statusCallbackMethod == other.statusCallbackMethod &&
                    superviseCallSid == other.superviseCallSid &&
                    supervisingRole == other.supervisingRole &&
                    texml == other.texml &&
                    timeLimit == other.timeLimit &&
                    timeout == other.timeout &&
                    to == other.to &&
                    trim == other.trim &&
                    url == other.url &&
                    urlMethod == other.urlMethod &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    applicationSid,
                    asyncAmd,
                    asyncAmdStatusCallback,
                    asyncAmdStatusCallbackMethod,
                    callerId,
                    cancelPlaybackOnDetectMessageEnd,
                    cancelPlaybackOnMachineDetection,
                    customHeaders,
                    detectionMode,
                    fallbackUrl,
                    from,
                    machineDetection,
                    machineDetectionSilenceTimeout,
                    machineDetectionSpeechEndThreshold,
                    machineDetectionSpeechThreshold,
                    machineDetectionTimeout,
                    mediaEncryption,
                    preferredCodecs,
                    record,
                    recordingChannels,
                    recordingStatusCallback,
                    recordingStatusCallbackEvent,
                    recordingStatusCallbackMethod,
                    recordingTimeout,
                    recordingTrack,
                    sendRecordingUrl,
                    sipAuthPassword,
                    sipAuthUsername,
                    sipRegion,
                    statusCallback,
                    statusCallbackEvent,
                    statusCallbackMethod,
                    superviseCallSid,
                    supervisingRole,
                    texml,
                    timeLimit,
                    timeout,
                    to,
                    trim,
                    url,
                    urlMethod,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ApplicationDefault{applicationSid=$applicationSid, asyncAmd=$asyncAmd, asyncAmdStatusCallback=$asyncAmdStatusCallback, asyncAmdStatusCallbackMethod=$asyncAmdStatusCallbackMethod, callerId=$callerId, cancelPlaybackOnDetectMessageEnd=$cancelPlaybackOnDetectMessageEnd, cancelPlaybackOnMachineDetection=$cancelPlaybackOnMachineDetection, customHeaders=$customHeaders, detectionMode=$detectionMode, fallbackUrl=$fallbackUrl, from=$from, machineDetection=$machineDetection, machineDetectionSilenceTimeout=$machineDetectionSilenceTimeout, machineDetectionSpeechEndThreshold=$machineDetectionSpeechEndThreshold, machineDetectionSpeechThreshold=$machineDetectionSpeechThreshold, machineDetectionTimeout=$machineDetectionTimeout, mediaEncryption=$mediaEncryption, preferredCodecs=$preferredCodecs, record=$record, recordingChannels=$recordingChannels, recordingStatusCallback=$recordingStatusCallback, recordingStatusCallbackEvent=$recordingStatusCallbackEvent, recordingStatusCallbackMethod=$recordingStatusCallbackMethod, recordingTimeout=$recordingTimeout, recordingTrack=$recordingTrack, sendRecordingUrl=$sendRecordingUrl, sipAuthPassword=$sipAuthPassword, sipAuthUsername=$sipAuthUsername, sipRegion=$sipRegion, statusCallback=$statusCallback, statusCallbackEvent=$statusCallbackEvent, statusCallbackMethod=$statusCallbackMethod, superviseCallSid=$superviseCallSid, supervisingRole=$supervisingRole, texml=$texml, timeLimit=$timeLimit, timeout=$timeout, to=$to, trim=$trim, url=$url, urlMethod=$urlMethod, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CallCallsParams &&
            accountSid == other.accountSid &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(accountSid, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CallCallsParams{accountSid=$accountSid, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
