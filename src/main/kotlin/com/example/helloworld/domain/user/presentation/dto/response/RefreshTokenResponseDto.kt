import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.ZonedDateTime

data class RefreshTokenResponseDto(
    @JsonProperty
    val accessToken: String,

    @JsonProperty
    val refreshToken: String,

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    val expiresAt: ZonedDateTime
)