package kr.GenAi.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.GenAi.web.entity.Board;

// 사용자가 게시글 전체조회를 요청하면 Controller로 그 다음 Service 호출 그 다음 Repository -> Hibernate -> DB접속
// Mapper와 같은 역할
@Repository
public interface BoardRepository extends JpaRepository<Board, Long>{

}
