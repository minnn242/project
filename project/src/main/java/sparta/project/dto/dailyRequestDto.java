package sparta.project.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class dailyRequestDto {
    private String title;
    private String contents;
    private String username;
    private String password;
    private String date;
}