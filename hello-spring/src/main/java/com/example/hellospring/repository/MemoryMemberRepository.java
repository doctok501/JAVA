package com.example.hellospring.repository;

import com.example.hellospring.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.*;
//@Repository
public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L; //KEY 값 생성


    @Override
    public Member save(Member member) {
        // sequence 증가로 Id값 설정
        // 원래는 시스템이 값을 설정하나, 여기서는 우리가 함
        member.setId(++sequence);
        // map에 저장
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) { //store 에서 꺼내오기

        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name)).findAny();

    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }

}
