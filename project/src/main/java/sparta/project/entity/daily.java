package sparta.project.entity;

import sparta.project.dto.dailyRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class daily<dailyRequestDto> {
    private static long idCounter = 0;
    private Long id;
    private String title;
    private String contents;
    private boolean username;
    private String password;
    private String date;

    public daily(dailyRequestDto requestDto) {
        this.id = ++idCounter;
        this.title = requestDto.getTitle();
        this.contents = requestDto.getContents();
        this.username = requestDto.getUsername();
        this.password = requestDto.getPassword();
        this.date = requestDto.getDate();
    }
}
