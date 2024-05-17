package sparta.project.dto;

import lombok.Getter;
import sparta.project.entity.daily;

@Getter
public class dailyResponseDto {
    private Long id;
    private String title;
    private String contents;
    private String username;
    private String date;

    public dailyResponseDto(daily daily) {
        this.id = daily.getId();
        this.title = daily.getTitle();
        this.contents = daily.getContents();
        this.username = daily.getUsername();
        this.date = daily.getDate();
    }
}
