package com.example.hellospring;


//import com.example.hellospring.repository.JdbsMemberRepository;
import com.example.hellospring.repository.JpaMemberRepository;
import com.example.hellospring.service.MemberService;
import com.example.hellospring.repository.MemberRepository;
import com.example.hellospring.repository.MemoryMemberRepository;
import jakarta.persistence.EntityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private final DataSource dataSource;
    private EntityManager em;

    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
        this.em = em;
    }


    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        //return new MemoryMemberRepository();
        //return new JdbsMemberRepository(dataSource);
        return new JpaMemberRepository(em);
    }
}
