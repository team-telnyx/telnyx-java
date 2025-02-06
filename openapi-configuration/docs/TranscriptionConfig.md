

# TranscriptionConfig

The settings associated with speech to text for the voice assistant. This is only relevant if the assistant uses a text-to-text language model. Any assistant using a model with native audio support (e.g. `fixie-ai/ultravox-v0_4`) will ignore this field.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**model** | **String** | The speech to text model to be used by the voice assistant. &#x60;distil-whisper/distil-large-v2&#x60; is lower latency but English-only. &#x60;openai/whisper-large-v3-turbo&#x60; is multi-lingual but slightly higher latency. |  [optional] |



