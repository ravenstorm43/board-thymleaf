package idusw.springboot.boardthymleaf.service;

import idusw.springboot.boardthymleaf.domain.Memo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MemoService {
    int creat(Memo m);
    Memo read(Memo m); // m의 식별자인 mno 값도 가능
    List<Memo> readList();
    int update(Memo m); //m은 수정하고자 하는 필드 값 전달
    int delete(Memo m); //m의 식별자인 mno값도 가능

    List<Memo> initalize(); //초기화
}
