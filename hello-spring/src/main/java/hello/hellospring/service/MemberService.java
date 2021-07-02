package hello.hellospring.service;

import hello.hellospring.domain.Memeber;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;

public class MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    /**
     * 회원가입
     */
    public Long Join(Memeber member){

        memberRepository.save(member);
        return member.getId();
    }
}
