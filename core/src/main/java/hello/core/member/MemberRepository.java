package hello.core.member;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long memberId);

    /* 구현체는 다른 패키지에 넣는게 설계상 좋다. */
}
