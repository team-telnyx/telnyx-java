/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.telnyx.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.JSON;
import com.telnyx.sdk.model.AIAssistantStartRequestAssistant;
import com.telnyx.sdk.model.AIAssistantStartRequestVoiceSettings;
import com.telnyx.sdk.model.InterruptionSettings;
import com.telnyx.sdk.model.TranscriptionConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * AIAssistantStartRequest
 */
@JsonPropertyOrder(
    {
        AIAssistantStartRequest.JSON_PROPERTY_ASSISTANT,
        AIAssistantStartRequest.JSON_PROPERTY_VOICE,
        AIAssistantStartRequest.JSON_PROPERTY_VOICE_SETTINGS,
        AIAssistantStartRequest.JSON_PROPERTY_GREETING,
        AIAssistantStartRequest.JSON_PROPERTY_INTERRUPTION_SETTINGS,
        AIAssistantStartRequest.JSON_PROPERTY_TRANSCRIPTION,
        AIAssistantStartRequest.JSON_PROPERTY_CLIENT_STATE,
        AIAssistantStartRequest.JSON_PROPERTY_COMMAND_ID,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class AIAssistantStartRequest {

    public static final String JSON_PROPERTY_ASSISTANT = "assistant";
    private AIAssistantStartRequestAssistant assistant;

    public static final String JSON_PROPERTY_VOICE = "voice";
    private String voice = "Telnyx.KokoroTTS.af";

    public static final String JSON_PROPERTY_VOICE_SETTINGS = "voice_settings";
    private AIAssistantStartRequestVoiceSettings voiceSettings;

    public static final String JSON_PROPERTY_GREETING = "greeting";
    private String greeting;

    public static final String JSON_PROPERTY_INTERRUPTION_SETTINGS =
        "interruption_settings";
    private InterruptionSettings interruptionSettings;

    public static final String JSON_PROPERTY_TRANSCRIPTION = "transcription";
    private TranscriptionConfig transcription;

    public static final String JSON_PROPERTY_CLIENT_STATE = "client_state";
    private String clientState;

    public static final String JSON_PROPERTY_COMMAND_ID = "command_id";
    private String commandId;

    public AIAssistantStartRequest() {}

    public AIAssistantStartRequest assistant(
        AIAssistantStartRequestAssistant assistant
    ) {
        this.assistant = assistant;
        return this;
    }

    /**
     * Get assistant
     * @return assistant
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ASSISTANT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public AIAssistantStartRequestAssistant getAssistant() {
        return assistant;
    }

    @JsonProperty(JSON_PROPERTY_ASSISTANT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAssistant(AIAssistantStartRequestAssistant assistant) {
        this.assistant = assistant;
    }

    public AIAssistantStartRequest voice(String voice) {
        this.voice = voice;
        return this;
    }

    /**
     * The voice to be used by the voice assistant. Currently we support ElevenLabs, Telnyx and AWS voices.   **Supported Providers:** - **AWS:** Use &#x60;AWS.Polly.&lt;VoiceId&gt;&#x60; (e.g., &#x60;AWS.Polly.Joanna&#x60;). For neural voices, which provide more realistic, human-like speech, append &#x60;-Neural&#x60; to the &#x60;VoiceId&#x60; (e.g., &#x60;AWS.Polly.Joanna-Neural&#x60;). Check the [available voices](https://docs.aws.amazon.com/polly/latest/dg/available-voices.html) for compatibility. - **Azure:** Use &#x60;Azure.&lt;VoiceId&gt;. (e.g. Azure.en-CA-ClaraNeural, Azure.en-CA-LiamNeural, Azure.en-US-BrianMultilingualNeural, Azure.en-US-AvaMultilingualNeural. For a complete list of voices, go to [Azure Voice Gallery](https://speech.microsoft.com/portal/voicegallery).) - **ElevenLabs:** Use &#x60;ElevenLabs.&lt;ModelId&gt;.&lt;VoiceId&gt;&#x60; (e.g., &#x60;ElevenLabs.BaseModel.John&#x60;). The &#x60;ModelId&#x60; part is optional. To use ElevenLabs, you must provide your ElevenLabs API key as an integration secret under &#x60;\&quot;voice_settings\&quot;: {\&quot;api_key_ref\&quot;: \&quot;&lt;secret_id&gt;\&quot;}&#x60;. See [integration secrets documentation](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret) for details. Check [available voices](https://elevenlabs.io/docs/api-reference/get-voices).  - **Telnyx:** Use &#x60;Telnyx.&lt;model_id&gt;.&lt;voice_id&gt;&#x60;
     * @return voice
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "Telnyx.KokoroTTS.af",
        value = "The voice to be used by the voice assistant. Currently we support ElevenLabs, Telnyx and AWS voices.   **Supported Providers:** - **AWS:** Use `AWS.Polly.<VoiceId>` (e.g., `AWS.Polly.Joanna`). For neural voices, which provide more realistic, human-like speech, append `-Neural` to the `VoiceId` (e.g., `AWS.Polly.Joanna-Neural`). Check the [available voices](https://docs.aws.amazon.com/polly/latest/dg/available-voices.html) for compatibility. - **Azure:** Use `Azure.<VoiceId>. (e.g. Azure.en-CA-ClaraNeural, Azure.en-CA-LiamNeural, Azure.en-US-BrianMultilingualNeural, Azure.en-US-AvaMultilingualNeural. For a complete list of voices, go to [Azure Voice Gallery](https://speech.microsoft.com/portal/voicegallery).) - **ElevenLabs:** Use `ElevenLabs.<ModelId>.<VoiceId>` (e.g., `ElevenLabs.BaseModel.John`). The `ModelId` part is optional. To use ElevenLabs, you must provide your ElevenLabs API key as an integration secret under `\"voice_settings\": {\"api_key_ref\": \"<secret_id>\"}`. See [integration secrets documentation](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret) for details. Check [available voices](https://elevenlabs.io/docs/api-reference/get-voices).  - **Telnyx:** Use `Telnyx.<model_id>.<voice_id>`"
    )
    @JsonProperty(JSON_PROPERTY_VOICE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getVoice() {
        return voice;
    }

    @JsonProperty(JSON_PROPERTY_VOICE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVoice(String voice) {
        this.voice = voice;
    }

    public AIAssistantStartRequest voiceSettings(
        AIAssistantStartRequestVoiceSettings voiceSettings
    ) {
        this.voiceSettings = voiceSettings;
        return this;
    }

    /**
     * Get voiceSettings
     * @return voiceSettings
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_VOICE_SETTINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public AIAssistantStartRequestVoiceSettings getVoiceSettings() {
        return voiceSettings;
    }

    @JsonProperty(JSON_PROPERTY_VOICE_SETTINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVoiceSettings(
        AIAssistantStartRequestVoiceSettings voiceSettings
    ) {
        this.voiceSettings = voiceSettings;
    }

    public AIAssistantStartRequest greeting(String greeting) {
        this.greeting = greeting;
        return this;
    }

    /**
     * Text that will be played when the assistant starts, if none then nothing will be played when the assistant starts. The greeting can be text for any voice or SSML for &#x60;AWS.Polly.&lt;voice_id&gt;&#x60; voices. There is a 3,000 character limit.
     * @return greeting
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "Hello, can you tell me your age and where you live?",
        value = "Text that will be played when the assistant starts, if none then nothing will be played when the assistant starts. The greeting can be text for any voice or SSML for `AWS.Polly.<voice_id>` voices. There is a 3,000 character limit."
    )
    @JsonProperty(JSON_PROPERTY_GREETING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getGreeting() {
        return greeting;
    }

    @JsonProperty(JSON_PROPERTY_GREETING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public AIAssistantStartRequest interruptionSettings(
        InterruptionSettings interruptionSettings
    ) {
        this.interruptionSettings = interruptionSettings;
        return this;
    }

    /**
     * Get interruptionSettings
     * @return interruptionSettings
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_INTERRUPTION_SETTINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public InterruptionSettings getInterruptionSettings() {
        return interruptionSettings;
    }

    @JsonProperty(JSON_PROPERTY_INTERRUPTION_SETTINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInterruptionSettings(
        InterruptionSettings interruptionSettings
    ) {
        this.interruptionSettings = interruptionSettings;
    }

    public AIAssistantStartRequest transcription(
        TranscriptionConfig transcription
    ) {
        this.transcription = transcription;
        return this;
    }

    /**
     * Get transcription
     * @return transcription
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_TRANSCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TranscriptionConfig getTranscription() {
        return transcription;
    }

    @JsonProperty(JSON_PROPERTY_TRANSCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTranscription(TranscriptionConfig transcription) {
        this.transcription = transcription;
    }

    public AIAssistantStartRequest clientState(String clientState) {
        this.clientState = clientState;
        return this;
    }

    /**
     * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string.
     * @return clientState
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "aGF2ZSBhIG5pY2UgZGF5ID1d",
        value = "Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string."
    )
    @JsonProperty(JSON_PROPERTY_CLIENT_STATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getClientState() {
        return clientState;
    }

    @JsonProperty(JSON_PROPERTY_CLIENT_STATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setClientState(String clientState) {
        this.clientState = clientState;
    }

    public AIAssistantStartRequest commandId(String commandId) {
        this.commandId = commandId;
        return this;
    }

    /**
     * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;.
     * @return commandId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "891510ac-f3e4-11e8-af5b-de00688a4901",
        value = "Use this field to avoid duplicate commands. Telnyx will ignore any command with the same `command_id` for the same `call_control_id`."
    )
    @JsonProperty(JSON_PROPERTY_COMMAND_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCommandId() {
        return commandId;
    }

    @JsonProperty(JSON_PROPERTY_COMMAND_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    /**
     * Return true if this AIAssistantStartRequest object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AIAssistantStartRequest aiAssistantStartRequest =
            (AIAssistantStartRequest) o;
        return (
            Objects.equals(this.assistant, aiAssistantStartRequest.assistant) &&
            Objects.equals(this.voice, aiAssistantStartRequest.voice) &&
            Objects.equals(
                this.voiceSettings,
                aiAssistantStartRequest.voiceSettings
            ) &&
            Objects.equals(this.greeting, aiAssistantStartRequest.greeting) &&
            Objects.equals(
                this.interruptionSettings,
                aiAssistantStartRequest.interruptionSettings
            ) &&
            Objects.equals(
                this.transcription,
                aiAssistantStartRequest.transcription
            ) &&
            Objects.equals(
                this.clientState,
                aiAssistantStartRequest.clientState
            ) &&
            Objects.equals(this.commandId, aiAssistantStartRequest.commandId)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            assistant,
            voice,
            voiceSettings,
            greeting,
            interruptionSettings,
            transcription,
            clientState,
            commandId
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AIAssistantStartRequest {\n");
        sb
            .append("    assistant: ")
            .append(toIndentedString(assistant))
            .append("\n");
        sb.append("    voice: ").append(toIndentedString(voice)).append("\n");
        sb
            .append("    voiceSettings: ")
            .append(toIndentedString(voiceSettings))
            .append("\n");
        sb
            .append("    greeting: ")
            .append(toIndentedString(greeting))
            .append("\n");
        sb
            .append("    interruptionSettings: ")
            .append(toIndentedString(interruptionSettings))
            .append("\n");
        sb
            .append("    transcription: ")
            .append(toIndentedString(transcription))
            .append("\n");
        sb
            .append("    clientState: ")
            .append(toIndentedString(clientState))
            .append("\n");
        sb
            .append("    commandId: ")
            .append(toIndentedString(commandId))
            .append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
