package jpabook.jpashop;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member member){
        em.persist(member);
        return member.getId();
        //커맨드와 쿼리를 분리하는 것이 기본이므로, 리턴값에서 ID를 리턴하여 조회해준다.

    }
    public Member find(Long id){
        return em.find(Member.class, id);
    }


}
