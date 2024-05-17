package sparta.project.controller;

import sparta.project.dto.dailyRequestDto;
import sparta.project.dto.dailyResponseDto;
import sparta.project.entity.daily;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class dailyController<daily> {

    private final Map<Long, daily> dailyList = new HashMap<>();


    @PostMapping("/daily") // 일정 작성
    public dailyResponseDto createdaily(@RequestBody dailyRequestDto requestDto) {
        daily daily = new daily(requestDto);
            dailyList.put(daily.getId(), daily);
        dailyResponseDto dailyResponseDto = new dailyResponseDto((sparta.project.entity.daily) daily);
        return dailyResponseDto;
    }

    @GetMapping("/daily/{id}") // 선택한 일정 조회
    public dailyResponseDto getdaily(@PathVariable Long id) {
        daily daily = dailyList.get(id);
        dailyResponseDto dailyResponseDto = new dailyResponseDto((sparta.project.entity.daily) daily);
        return dailyResponseDto;
    }
}

