package hello.hellosping;

import hello.hellosping.repository.MemberRepository;
import hello.hellosping.repository.MemoryMemberRepository;
import hello.hellosping.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    //MemberService
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    //MemberRepository
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
