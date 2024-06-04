package roomescape.service.schedule.dto;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

public record ReservationTimeReadRequest(
    @NotNull(message = "날짜를 입력해주세요.") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date,
    @NotNull(message = "테마를 입력해주세요.") Long themeId
) {

}
