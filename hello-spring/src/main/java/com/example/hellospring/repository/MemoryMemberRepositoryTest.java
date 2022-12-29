package com.example.hellospring.repository;

import com.example.hellospring.domain.Member;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Optional;

public class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    @Test
    public void save(){
         Member member = new Member();
         member.setName("Spring");

         repository.save(member);

         Member result = repository.findById(member.getId()).get();


    }

}
